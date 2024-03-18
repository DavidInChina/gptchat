package io.sentry.hints;

import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.protocol.s;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f34353a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    public final long f34354b;

    /* renamed from: c  reason: collision with root package name */
    public final H f34355c;

    public c(long j6, H h10) {
        this.f34354b = j6;
        this.f34355c = h10;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f34353a.await(this.f34354b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f34355c.d(EnumC3642e1.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }

    public abstract boolean e(s sVar);

    public abstract void f(s sVar);
}
