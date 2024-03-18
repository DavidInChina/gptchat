package B;

import id.AbstractC3557B;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC0137k {

    /* renamed from: I0  reason: collision with root package name */
    public K0 f1109I0;

    /* renamed from: J0  reason: collision with root package name */
    public W0 f1110J0;

    /* renamed from: K0  reason: collision with root package name */
    public AbstractC0173w0 f1111K0 = G0.f1079a;

    /* renamed from: L0  reason: collision with root package name */
    public final H0 f1112L0 = new H0(this);

    /* renamed from: M0  reason: collision with root package name */
    public final C0123f0 f1113M0;

    public J0(K0 k02, C0169v c0169v, W0 w02, boolean z10, D.m mVar, AbstractC6216a abstractC6216a, wf.o oVar, wf.o oVar2, boolean z11) {
        super(c0169v, z10, mVar, abstractC6216a, oVar, oVar2, z11);
        C0123f0 c0123f0;
        this.f1109I0 = k02;
        this.f1110J0 = w02;
        if (w02 == W0.f1213Y) {
            c0123f0 = AbstractC0170v0.f1535b;
        } else {
            c0123f0 = AbstractC0170v0.f1534a;
        }
        this.f1113M0 = c0123f0;
    }

    public final void F0(K0 k02, C0169v c0169v, W0 w02, boolean z10, D.m mVar, AbstractC6216a abstractC6216a, wf.o oVar, wf.o oVar2, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (!AbstractC3557B.K(this.f1109I0, k02)) {
            this.f1109I0 = k02;
            z12 = true;
        } else {
            z12 = false;
        }
        this.f1381u0 = c0169v;
        if (this.f1110J0 != w02) {
            this.f1110J0 = w02;
            z12 = true;
        }
        if (this.f1382v0 != z10) {
            this.f1382v0 = z10;
            if (!z10) {
                E0();
            }
        } else {
            z13 = z12;
        }
        if (!AbstractC3557B.K(this.f1383w0, mVar)) {
            E0();
            this.f1383w0 = mVar;
        }
        this.f1384x0 = abstractC6216a;
        this.f1385y0 = oVar;
        this.f1386z0 = oVar2;
        if (this.f1373A0 != z11) {
            this.f1373A0 = z11;
        } else if (!z13) {
            return;
        }
        ((B0.P) this.f1378F0).C0();
    }
}
