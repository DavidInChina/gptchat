package io.sentry.transport;

import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.R0;
import io.sentry.S0;
import io.sentry.ThreadFactoryC3690w;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n extends ThreadPoolExecutor {

    /* renamed from: Y  reason: collision with root package name */
    public final int f34752Y;

    /* renamed from: h0  reason: collision with root package name */
    public final H f34754h0;

    /* renamed from: i0  reason: collision with root package name */
    public final S0 f34755i0;

    /* renamed from: Z  reason: collision with root package name */
    public R0 f34753Z = null;

    /* renamed from: j0  reason: collision with root package name */
    public final y7.b f34756j0 = new y7.b(15);

    public n(int i10, ThreadFactoryC3690w threadFactoryC3690w, a aVar, H h10, S0 s02) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactoryC3690w, aVar);
        this.f34752Y = i10;
        this.f34754h0 = h10;
        this.f34755i0 = s02;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        y7.b bVar = this.f34756j0;
        try {
            super.afterExecute(runnable, th2);
        } finally {
            int i10 = p.f34760Y;
            ((p) bVar.f50831Z).releaseShared(1);
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        y7.b bVar = this.f34756j0;
        if (p.a((p) bVar.f50831Z) < this.f34752Y) {
            p.b((p) bVar.f50831Z);
            return super.submit(runnable);
        }
        this.f34753Z = this.f34755i0.e();
        this.f34754h0.f(EnumC3642e1.WARNING, "Submit cancelled", new Object[0]);
        return new Object();
    }
}
