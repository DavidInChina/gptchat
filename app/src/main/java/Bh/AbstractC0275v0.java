package Bh;

import Eh.AbstractC0511j;
import Eh.C0509h;
import wh.C6244i;
import yh.l1;

/* renamed from: Bh.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275v0 extends Nh.l implements AbstractC0279x0, AbstractC0248h0 {

    /* renamed from: h0  reason: collision with root package name */
    public final l1 f2388h0;

    /* renamed from: i0  reason: collision with root package name */
    public final c1 f2389i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Fh.n f2390j0;

    /* renamed from: k0  reason: collision with root package name */
    public final AbstractC0267r0 f2391k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2392l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f2393m0;

    public AbstractC0275v0(Nh.l lVar, l1 l1Var, c1 c1Var, Fh.n nVar, boolean z10, boolean z11) {
        super(Sh.I.f16703b, lVar);
        this.f2388h0 = l1Var;
        this.f2389i0 = c1Var;
        this.f2390j0 = nVar;
        if (!z10) {
            this.f2391k0 = EnumC0266q0.f2373Y;
        } else if (z11) {
            this.f2391k0 = EnumC0264p0.f2371Y;
        } else {
            this.f2391k0 = new G4.m(4);
        }
    }

    public abstract void J(AbstractC0511j abstractC0511j);

    public abstract void K();

    @Override // Bh.AbstractC0279x0
    public final void a(io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j) {
        ((C0509h) abstractC0511j).a(this, bVar, this.f2390j0);
        this.f13110Z.y(this.f2392l0, this.f2393m0);
        this.f13110Z.j();
    }

    @Override // Bh.AbstractC0248h0
    public final void b(io.sentry.vendor.b bVar, AbstractC0252j0 abstractC0252j0, AbstractC0511j abstractC0511j) {
        Hh.a a5 = abstractC0252j0.a(this.f13110Z, abstractC0511j, new C6244i(this.f2388h0));
        this.f2392l0 = Math.max(this.f2392l0, a5.f7801a);
        this.f2393m0 = Math.max(this.f2393m0, a5.f7802b);
        J(abstractC0511j);
    }

    @Override // Nh.l
    public final void i() {
        this.f2389i0.e(this.f13110Z, this.f2390j0);
        super.i();
        K();
    }

    @Override // Nh.l
    public final void l(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super.l(i10, i11, i12, objArr, objArr2);
        this.f2391k0.b(i10, i11);
    }

    @Override // Nh.l
    public final void y(int i10, int i11) {
        this.f2392l0 = i10;
        this.f2393m0 = i11;
    }
}
