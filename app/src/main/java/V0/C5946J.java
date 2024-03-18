package v0;

import Z.C1720k0;
import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import q0.C5254f;
import r0.C5347k;
import t0.AbstractC5650i;
import t0.C5643b;
import u0.AbstractC5824b;
import z.C6672L;

/* renamed from: v0.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5946J extends AbstractC5824b {

    /* renamed from: k0  reason: collision with root package name */
    public final C1724m0 f46871k0;

    /* renamed from: l0  reason: collision with root package name */
    public final C1724m0 f46872l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C5941E f46873m0;

    /* renamed from: p0  reason: collision with root package name */
    public C5347k f46876p0;

    /* renamed from: n0  reason: collision with root package name */
    public final C1720k0 f46874n0 = U3.f.h0(0);

    /* renamed from: o0  reason: collision with root package name */
    public float f46875o0 = 1.0f;

    /* renamed from: q0  reason: collision with root package name */
    public int f46877q0 = -1;

    public C5946J(C5950c c5950c) {
        C5254f c5254f = new C5254f(C5254f.f43637b);
        o1 o1Var = o1.f22665a;
        this.f46871k0 = AbstractC4828h.Z(c5254f, o1Var);
        this.f46872l0 = AbstractC4828h.Z(Boolean.FALSE, o1Var);
        C5941E c5941e = new C5941E(c5950c);
        c5941e.f46850f = new C6672L(16, this);
        this.f46873m0 = c5941e;
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        this.f46875o0 = f6;
        return true;
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        this.f46876p0 = c5347k;
        return true;
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        return ((C5254f) this.f46871k0.getValue()).f43640a;
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        C5347k c5347k = this.f46876p0;
        C5941E c5941e = this.f46873m0;
        if (c5347k == null) {
            c5347k = (C5347k) c5941e.f46851g.getValue();
        }
        if (((Boolean) this.f46872l0.getValue()).booleanValue() && abstractC5650i.getLayoutDirection() == Z0.l.f22806Z) {
            long c02 = abstractC5650i.c0();
            C5643b V10 = abstractC5650i.V();
            long b10 = V10.b();
            V10.a().h();
            V10.f45609a.d(-1.0f, 1.0f, c02);
            c5941e.e(abstractC5650i, this.f46875o0, c5347k);
            V10.a().q();
            V10.c(b10);
        } else {
            c5941e.e(abstractC5650i, this.f46875o0, c5347k);
        }
        this.f46877q0 = this.f46874n0.h();
    }
}
