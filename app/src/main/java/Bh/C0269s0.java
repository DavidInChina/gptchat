package Bh;

import Eh.AbstractC0511j;
import yh.l1;

/* renamed from: Bh.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269s0 extends AbstractC0273u0 {

    /* renamed from: p0  reason: collision with root package name */
    public final Nh.k f2380p0 = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [Nh.k, java.lang.Object] */
    public C0269s0(Nh.l lVar, l1 l1Var, c1 c1Var, Fh.n nVar, boolean z10, boolean z11) {
        super(lVar, l1Var, c1Var, nVar, z10, z11);
    }

    @Override // Bh.AbstractC0273u0
    public final void L(AbstractC0511j abstractC0511j) {
        this.f13110Z.s(this.f2380p0);
        this.f2391k0.a(this.f13110Z);
        Hh.a b10 = this.f2389i0.b(this.f13110Z, abstractC0511j);
        this.f2392l0 = Math.max(this.f2392l0, b10.f7801a);
        this.f2393m0 = Math.max(this.f2393m0, b10.f7802b);
    }

    @Override // Nh.l
    public final void n(int i10) {
        if (i10 == 177) {
            this.f13110Z.r(167, this.f2380p0);
        } else {
            super.n(i10);
        }
    }
}
