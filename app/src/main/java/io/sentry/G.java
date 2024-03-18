package io.sentry;

/* loaded from: classes.dex */
public interface G {
    io.sentry.protocol.s A(T0 t02);

    void B();

    io.sentry.protocol.s C(Z0 z02, C3686u c3686u);

    void a(String str, String str2);

    void c(boolean z10);

    /* renamed from: clone */
    G mo84clone();

    io.sentry.transport.o e();

    boolean g();

    void h(io.sentry.protocol.C c10);

    void i(C3640e c3640e);

    boolean isEnabled();

    void l(long j6);

    T m(I1 i12, J1 j12);

    io.sentry.protocol.s n(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u);

    void o(C3640e c3640e, C3686u c3686u);

    void p(E0 e02);

    S q();

    void r(Throwable th2, S s10, String str);

    r1 s();

    io.sentry.protocol.s t(NullPointerException nullPointerException, C3686u c3686u);

    void u(String str);

    T v();

    io.sentry.protocol.s w(T0 t02, C3686u c3686u);

    io.sentry.protocol.s x(NullPointerException nullPointerException);

    io.sentry.protocol.s y(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u, B0 b02);

    void z();
}
