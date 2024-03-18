package io.sentry;

/* loaded from: classes.dex */
public final class A implements G {

    /* renamed from: a  reason: collision with root package name */
    public static final A f33710a = new Object();

    @Override // io.sentry.G
    public final io.sentry.protocol.s A(T0 t02) {
        return w(t02, new C3686u());
    }

    @Override // io.sentry.G
    public final void B() {
        L0.c().B();
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s C(Z0 z02, C3686u c3686u) {
        return L0.c().C(z02, c3686u);
    }

    @Override // io.sentry.G
    public final void a(String str, String str2) {
        L0.h(str, str2);
    }

    @Override // io.sentry.G
    public final void c(boolean z10) {
        L0.a();
    }

    @Override // io.sentry.G
    public final io.sentry.transport.o e() {
        return L0.c().e();
    }

    @Override // io.sentry.G
    public final boolean g() {
        return L0.c().g();
    }

    @Override // io.sentry.G
    public final void h(io.sentry.protocol.C c10) {
        L0.i(c10);
    }

    @Override // io.sentry.G
    public final void i(C3640e c3640e) {
        o(c3640e, new C3686u());
    }

    @Override // io.sentry.G
    public final boolean isEnabled() {
        return L0.g();
    }

    @Override // io.sentry.G
    public final void l(long j6) {
        L0.b(j6);
    }

    @Override // io.sentry.G
    public final T m(I1 i12, J1 j12) {
        return L0.c().m(i12, j12);
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s n(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u) {
        return y(zVar, g1, c3686u, null);
    }

    @Override // io.sentry.G
    public final void o(C3640e c3640e, C3686u c3686u) {
        L0.c().o(c3640e, c3686u);
    }

    @Override // io.sentry.G
    public final void p(E0 e02) {
        L0.c().p(e02);
    }

    @Override // io.sentry.G
    public final S q() {
        return L0.c().q();
    }

    @Override // io.sentry.G
    public final void r(Throwable th2, S s10, String str) {
        L0.c().r(th2, s10, str);
    }

    @Override // io.sentry.G
    public final r1 s() {
        return L0.c().s();
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s t(NullPointerException nullPointerException, C3686u c3686u) {
        return L0.c().t(nullPointerException, c3686u);
    }

    @Override // io.sentry.G
    public final void u(String str) {
        C3640e c3640e = new C3640e();
        c3640e.f34319Z = str;
        i(c3640e);
    }

    @Override // io.sentry.G
    public final T v() {
        return L0.c().v();
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s w(T0 t02, C3686u c3686u) {
        return L0.c().w(t02, c3686u);
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s x(NullPointerException nullPointerException) {
        return t(nullPointerException, new C3686u());
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s y(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u, B0 b02) {
        return L0.c().y(zVar, g1, c3686u, b02);
    }

    @Override // io.sentry.G
    public final void z() {
        L0.c().z();
    }

    @Override // io.sentry.G
    /* renamed from: clone */
    public final G mo84clone() {
        return L0.c().mo84clone();
    }
}
