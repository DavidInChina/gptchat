package W;

import E.AbstractC0429m;
import E.AbstractC0434s;
import E.C0421f;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class J0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f19241Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E.g0 f19242Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19243h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19244i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19245j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ long f19246k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ wf.n f19247l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ long f19248m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(float f6, E.g0 g0Var, wf.n nVar, wf.n nVar2, wf.n nVar3, long j6, wf.n nVar4, long j10) {
        super(2);
        this.f19241Y = f6;
        this.f19242Z = g0Var;
        this.f19243h0 = nVar;
        this.f19244i0 = nVar2;
        this.f19245j0 = nVar3;
        this.f19246k0 = j6;
        this.f19247l0 = nVar4;
        this.f19248m0 = j10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.b(c4323o, 0.0f, this.f19241Y, 1), this.f19242Z);
        I0 i02 = I0.f19211a;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1323940314);
        int i10 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i11 = androidx.compose.ui.layout.a.i(q10);
        boolean z14 = rVar2.f22696a instanceof AbstractC1707e;
        if (z14) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j = C0583l.f5808f;
            U3.f.n0(rVar2, i02, c0581j);
            C0581j c0581j2 = C0583l.f5807e;
            U3.f.n0(rVar2, p10, c0581j2);
            C0581j c0581j3 = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i10))) {
                AbstractC6463a.q(i10, rVar2, i10, c0581j3);
            }
            AbstractC6463a.r(0, i11, new Z.L0(rVar2), rVar2, 2058660585);
            rVar2.W(651014582);
            C4318j c4318j = C4310b.f37697j0;
            wf.n nVar = this.f19243h0;
            wf.n nVar2 = this.f19244i0;
            if (nVar == null && nVar2 == null) {
                z10 = false;
            } else {
                AbstractC4326r h10 = androidx.compose.ui.layout.a.h(c4323o, "leadingIcon");
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(c4318j, false, rVar2);
                rVar2.W(-1323940314);
                int i12 = rVar2.P;
                AbstractC1732q0 p11 = rVar2.p();
                C3288a i13 = androidx.compose.ui.layout.a.i(h10);
                if (z14) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, c0581j);
                    U3.f.n0(rVar2, p11, c0581j2);
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar2, i12, c0581j3);
                    }
                    AbstractC6463a.r(0, i13, new Z.L0(rVar2), rVar2, 2058660585);
                    if (nVar != null) {
                        rVar2.W(1725997334);
                        nVar.invoke(rVar2, 0);
                        rVar2.t(false);
                        z13 = true;
                        z10 = false;
                    } else {
                        if (nVar2 != null) {
                            rVar2.W(1725997437);
                            z10 = false;
                            A7.b.k(Z0.f19875a.b(new r0.r(this.f19246k0)), nVar2, rVar2, 0);
                            rVar2.t(false);
                        } else {
                            z10 = false;
                            rVar2.W(1725997699);
                            rVar2.t(false);
                        }
                        z13 = true;
                    }
                    AbstractC6463a.v(rVar2, z10, z13, z10, z10);
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            rVar2.t(z10);
            AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(androidx.compose.ui.layout.a.h(c4323o, "label"), O0.f19458a, z10 ? 1.0f : 0.0f);
            C0421f c0421f = AbstractC0429m.f3907a;
            C4317i c4317i = C4310b.f37703p0;
            rVar2.W(693286680);
            E0.N a5 = E.p0.a(c0421f, c4317i, rVar2);
            rVar2.W(-1323940314);
            int i14 = rVar2.P;
            AbstractC1732q0 p12 = rVar2.p();
            C3288a i15 = androidx.compose.ui.layout.a.i(s10);
            if (z14) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, a5, c0581j);
                U3.f.n0(rVar2, p12, c0581j2);
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i14))) {
                    AbstractC6463a.q(i14, rVar2, i14, c0581j3);
                }
                AbstractC6463a.r(0, i15, new Z.L0(rVar2), rVar2, 2058660585);
                this.f19247l0.invoke(rVar2, 0);
                rVar2.t(false);
                rVar2.t(true);
                rVar2.t(false);
                rVar2.t(false);
                rVar2.W(-313041276);
                wf.n nVar3 = this.f19245j0;
                if (nVar3 != null) {
                    AbstractC4326r h11 = androidx.compose.ui.layout.a.h(c4323o, "trailingIcon");
                    rVar2.W(733328855);
                    E0.N c11 = AbstractC0434s.c(c4318j, false, rVar2);
                    rVar2.W(-1323940314);
                    int i16 = rVar2.P;
                    AbstractC1732q0 p13 = rVar2.p();
                    C3288a i17 = androidx.compose.ui.layout.a.i(h11);
                    if (z14) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, c11, c0581j);
                        U3.f.n0(rVar2, p13, c0581j2);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i16))) {
                            AbstractC6463a.q(i16, rVar2, i16, c0581j3);
                        }
                        z11 = false;
                        AbstractC6463a.r(0, i17, new Z.L0(rVar2), rVar2, 2058660585);
                        A7.b.k(Z0.f19875a.b(new r0.r(this.f19248m0)), nVar3, rVar2, 0);
                        z12 = true;
                        AbstractC6463a.v(rVar2, false, true, false, false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    z11 = false;
                    z12 = true;
                }
                AbstractC6463a.v(rVar2, z11, z11, z12, z11);
                return jf.y.f36177a;
            }
            R4.b.r1();
            throw null;
        }
        R4.b.r1();
        throw null;
    }
}
