package io.sentry;

/* loaded from: classes.dex */
public final class Y implements M {

    /* renamed from: a  reason: collision with root package name */
    public final Runtime f33887a = Runtime.getRuntime();

    @Override // io.sentry.M
    public final void a(C3697z0 c3697z0) {
        long currentTimeMillis = System.currentTimeMillis();
        Runtime runtime = this.f33887a;
        c3697z0.f34857a = new C3668n0(currentTimeMillis, runtime.totalMemory() - runtime.freeMemory(), -1L);
    }

    @Override // io.sentry.M
    public final void c() {
    }
}
