package A;

import B0.C0194k;
import B0.EnumC0195l;
import G0.AbstractC0585n;
import G0.AbstractC0587p;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wf.AbstractC6216a;
import z.C6672L;

/* renamed from: A.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0016f extends AbstractC0587p implements F0.f, AbstractC0585n, G0.t0 {

    /* renamed from: u0  reason: collision with root package name */
    public boolean f193u0;

    /* renamed from: v0  reason: collision with root package name */
    public D.m f194v0;

    /* renamed from: w0  reason: collision with root package name */
    public AbstractC6216a f195w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C0006a f196x0;

    /* renamed from: y0  reason: collision with root package name */
    public final C6672L f197y0 = new C6672L(1, this);

    /* renamed from: z0  reason: collision with root package name */
    public final B0.J f198z0;

    public AbstractC0016f(boolean z10, D.m mVar, AbstractC6216a abstractC6216a, C0006a c0006a) {
        this.f193u0 = z10;
        this.f194v0 = mVar;
        this.f195w0 = abstractC6216a;
        this.f196x0 = c0006a;
        C0014e c0014e = new C0014e(this, null);
        C0194k c0194k = B0.I.f1599a;
        B0.P p10 = new B0.P(c0014e);
        A0(p10);
        this.f198z0 = p10;
    }

    @Override // G0.t0
    public final void A() {
        ((B0.P) this.f198z0).A();
    }

    public final Object B0(B.Y0 y02, long j6, AbstractC4825e abstractC4825e) {
        D.m mVar = this.f194v0;
        jf.y yVar = jf.y.f36177a;
        if (mVar != null) {
            Object e02 = Ad.l.e0(new F(y02, j6, mVar, this.f196x0, this.f197y0, null), abstractC4825e);
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (e02 != enumC5000a) {
                e02 = yVar;
            }
            if (e02 == enumC5000a) {
                return e02;
            }
        }
        return yVar;
    }

    public abstract Object C0(B0.A a5, AbstractC4825e abstractC4825e);

    @Override // F0.f
    public final /* synthetic */ Bi.c M() {
        return F0.b.f5021h;
    }

    @Override // G0.t0
    public final void N() {
        A();
    }

    @Override // F0.f, F0.h
    public final /* synthetic */ Object a(F0.i iVar) {
        return E9.f.a(this, iVar);
    }

    @Override // G0.t0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // G0.t0
    public final void h0() {
        A();
    }

    @Override // G0.t0
    public final void s(C0194k c0194k, EnumC0195l enumC0195l, long j6) {
        ((B0.P) this.f198z0).s(c0194k, enumC0195l, j6);
    }

    @Override // G0.t0
    public final /* synthetic */ void H() {
    }
}
