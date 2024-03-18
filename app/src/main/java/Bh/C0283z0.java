package Bh;

import Eh.AbstractC0511j;

/* renamed from: Bh.z0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283z0 extends Nh.l {

    /* renamed from: h0  reason: collision with root package name */
    public final Nh.l f2408h0;

    /* renamed from: i0  reason: collision with root package name */
    public final c1 f2409i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ B0 f2410j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283z0(B0 b02, Nh.l lVar, c1 c1Var) {
        super(Sh.I.f16703b, lVar);
        this.f2410j0 = b02;
        this.f2408h0 = lVar;
        this.f2409i0 = c1Var;
        c1Var.d(lVar);
    }

    @Override // Nh.l
    public final io.sentry.vendor.b C(String str, int i10, boolean z10) {
        if (E9.f.m(this.f2410j0.f2188u.f2263o)) {
            return super.C(str, i10, z10);
        }
        int i11 = D0.f2194y;
        return null;
    }

    @Override // Nh.l
    public final io.sentry.vendor.b G(int i10, I5.h hVar, String str, boolean z10) {
        if (E9.f.m(this.f2410j0.f2188u.f2263o)) {
            return super.G(i10, hVar, str, z10);
        }
        int i11 = D0.f2194y;
        return null;
    }

    @Override // Nh.l
    public final void d(int i10, boolean z10) {
        if (E9.f.m(this.f2410j0.f2188u.f2263o)) {
            super.d(i10, z10);
        }
    }

    @Override // Nh.l
    public final io.sentry.vendor.b e(String str, boolean z10) {
        if (E9.f.m(this.f2410j0.f2188u.f2263o)) {
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
        int i10 = D0.f2194y;
        this.f13110Z = null;
    }

    @Override // Nh.l
    public final void j() {
        B0 b02 = this.f2410j0;
        AbstractC0511j abstractC0511j = b02.f2186s;
        Fh.n nVar = b02.f2188u.f2262n;
        c1 c1Var = this.f2409i0;
        Nh.l lVar = this.f2408h0;
        c1Var.g(lVar, abstractC0511j, nVar);
        lVar.j();
    }
}
