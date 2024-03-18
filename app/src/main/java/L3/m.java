package L3;

import G0.C0571a;
import Ng.C1079o0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements A8.a {

    /* renamed from: Y  reason: collision with root package name */
    public final W3.i f10722Y = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, W3.i] */
    public m(C1079o0 c1079o0) {
        c1079o0.V(new C0571a(15, this));
    }

    @Override // A8.a
    public final void a(Runnable runnable, Executor executor) {
        this.f10722Y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f10722Y.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f10722Y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10722Y.f20718Y instanceof W3.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10722Y.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f10722Y.get(j6, timeUnit);
    }
}
