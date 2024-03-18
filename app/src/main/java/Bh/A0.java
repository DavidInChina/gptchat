package Bh;

import Eh.AbstractC0511j;
import wh.AbstractC6236a;

/* loaded from: classes2.dex */
public final class A0 extends Nh.l {

    /* renamed from: h0  reason: collision with root package name */
    public final Nh.l f2169h0;

    /* renamed from: i0  reason: collision with root package name */
    public final c1 f2170i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Ch.c f2171j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ B0 f2172k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(B0 b02, Nh.l lVar, c1 c1Var, Ch.c cVar) {
        super(Sh.I.f16703b, lVar);
        this.f2172k0 = b02;
        this.f2169h0 = lVar;
        this.f2170i0 = c1Var;
        this.f2171j0 = cVar;
        c1Var.d(lVar);
    }

    @Override // Nh.l
    public final io.sentry.vendor.b C(String str, int i10, boolean z10) {
        if (E9.f.m(this.f2172k0.f2188u.f2263o)) {
            return super.C(str, i10, z10);
        }
        int i11 = D0.f2194y;
        return null;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b G(int i10, I5.h hVar, String str, boolean z10) {
        if (E9.f.m(this.f2172k0.f2188u.f2263o)) {
            return super.G(i10, hVar, str, z10);
        }
        int i11 = D0.f2194y;
        return null;
    }

    @Override // Nh.l
    public final void d(int i10, boolean z10) {
        if (E9.f.m(this.f2172k0.f2188u.f2263o)) {
            super.d(i10, z10);
        }
    }

    @Override // Nh.l
    public final io.sentry.vendor.b e(String str, boolean z10) {
        if (E9.f.m(this.f2172k0.f2188u.f2263o)) {
            return super.e(str, z10);
        }
        int i10 = D0.f2194y;
        return null;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b f() {
        int i10 = D0.f2194y;
        return null;
    }

    @Override // Nh.l
    public final void i() {
        B0 b02 = this.f2172k0;
        AbstractC0511j abstractC0511j = b02.f2186s;
        Fh.n nVar = b02.f2188u.f2262n;
        c1 c1Var = this.f2170i0;
        Nh.l lVar = this.f2169h0;
        c1Var.g(lVar, abstractC0511j, nVar);
        lVar.j();
        this.f2171j0.getClass();
        int i10 = D0.f2194y;
        this.f13110Z = null;
        super.i();
    }

    @Override // Nh.l
    public final void y(int i10, int i11) {
        super.y(i10, Math.max(i11, ((AbstractC6236a) this.f2171j0.f3160a).p()));
    }
}
