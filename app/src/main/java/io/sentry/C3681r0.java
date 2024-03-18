package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.r0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3681r0 implements G {

    /* renamed from: b  reason: collision with root package name */
    public static final C3681r0 f34689b = new C3681r0();

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34690a = r1.empty();

    @Override // io.sentry.G
    public final io.sentry.protocol.s A(T0 t02) {
        return w(t02, new C3686u());
    }

    @Override // io.sentry.G
    public final void B() {
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s C(Z0 z02, C3686u c3686u) {
        return io.sentry.protocol.s.f34619Z;
    }

    @Override // io.sentry.G
    public final void a(String str, String str2) {
    }

    @Override // io.sentry.G
    public final void c(boolean z10) {
    }

    @Override // io.sentry.G
    /* renamed from: clone  reason: collision with other method in class */
    public final Object mo84clone() {
        return f34689b;
    }

    @Override // io.sentry.G
    public final io.sentry.transport.o e() {
        return null;
    }

    @Override // io.sentry.G
    public final boolean g() {
        return true;
    }

    @Override // io.sentry.G
    public final void h(io.sentry.protocol.C c10) {
    }

    @Override // io.sentry.G
    public final void i(C3640e c3640e) {
    }

    @Override // io.sentry.G
    public final boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.G
    public final void l(long j6) {
    }

    @Override // io.sentry.G
    public final T m(I1 i12, J1 j12) {
        return C3687u0.f34769a;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s n(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u) {
        return io.sentry.protocol.s.f34619Z;
    }

    @Override // io.sentry.G
    public final void o(C3640e c3640e, C3686u c3686u) {
    }

    @Override // io.sentry.G
    public final void p(E0 e02) {
    }

    @Override // io.sentry.G
    public final S q() {
        return null;
    }

    @Override // io.sentry.G
    public final void r(Throwable th2, S s10, String str) {
    }

    @Override // io.sentry.G
    public final r1 s() {
        return this.f34690a;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s t(NullPointerException nullPointerException, C3686u c3686u) {
        return io.sentry.protocol.s.f34619Z;
    }

    @Override // io.sentry.G
    public final void u(String str) {
        r.f.A();
        new ConcurrentHashMap();
    }

    @Override // io.sentry.G
    public final T v() {
        return null;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s w(T0 t02, C3686u c3686u) {
        return io.sentry.protocol.s.f34619Z;
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s x(NullPointerException nullPointerException) {
        return t(nullPointerException, new C3686u());
    }

    @Override // io.sentry.G
    public final io.sentry.protocol.s y(io.sentry.protocol.z zVar, G1 g1, C3686u c3686u, B0 b02) {
        return io.sentry.protocol.s.f34619Z;
    }

    @Override // io.sentry.G
    public final void z() {
    }

    @Override // io.sentry.G
    /* renamed from: clone */
    public final G mo84clone() {
        return f34689b;
    }
}
