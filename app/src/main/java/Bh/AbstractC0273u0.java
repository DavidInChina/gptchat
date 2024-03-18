package Bh;

import Eh.AbstractC0511j;
import yh.l1;

/* renamed from: Bh.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0273u0 extends AbstractC0275v0 {

    /* renamed from: n0  reason: collision with root package name */
    public final Nh.k f2383n0 = new Object();

    /* renamed from: o0  reason: collision with root package name */
    public final Nh.k f2384o0 = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [Nh.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Nh.k, java.lang.Object] */
    public AbstractC0273u0(Nh.l lVar, l1 l1Var, c1 c1Var, Fh.n nVar, boolean z10, boolean z11) {
        super(lVar, l1Var, c1Var, nVar, z10, z11);
    }

    @Override // Bh.AbstractC0275v0
    public final void J(AbstractC0511j abstractC0511j) {
        this.f13110Z.r(167, this.f2384o0);
        L(abstractC0511j);
    }

    @Override // Bh.AbstractC0275v0
    public final void K() {
        this.f13110Z.r(167, this.f2383n0);
        this.f13110Z.s(this.f2384o0);
        this.f2391k0.a(this.f13110Z);
    }

    public abstract void L(AbstractC0511j abstractC0511j);

    @Override // Nh.l
    public final void j() {
        this.f13110Z.s(this.f2383n0);
        this.f2391k0.a(this.f13110Z);
    }
}
