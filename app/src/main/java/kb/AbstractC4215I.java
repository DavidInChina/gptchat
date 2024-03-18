package kb;

import A.C0036p;
import B.G0;
import B.W0;
import E.AbstractC0434s;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H0.AbstractC0701r0;
import Z.AbstractC1706d0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import y.AbstractC6463a;

/* renamed from: kb.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4215I {

    /* renamed from: a  reason: collision with root package name */
    public static final float f37241a = 230;

    /* renamed from: b  reason: collision with root package name */
    public static final float f37242b = 40;

    /* renamed from: c  reason: collision with root package name */
    public static final float f37243c = 15;

    /* renamed from: d  reason: collision with root package name */
    public static final float f37244d = (float) 0.5d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f37245e = r0.r.b(r0.r.f44254b, 0.2f);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(x9.l lVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        boolean z10;
        int i13;
        int i14;
        AbstractC3557B.c0("imageDrawState", lVar);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("VerticalSlider");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1427139825);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(lVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i10 | i14;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 91) != 18 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i15 == 0) {
                    a5 = abstractC4326r2;
                }
                float f6 = f37242b;
                AbstractC4326r c10 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.m(a5, f6), 1.0f);
                C4318j c4318j = C4310b.f37697j0;
                rVar.W(733328855);
                N c11 = AbstractC0434s.c(c4318j, false, rVar);
                rVar.W(-1323940314);
                int i16 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i17 = androidx.compose.ui.layout.a.i(c10);
                z10 = rVar.f22696a instanceof AbstractC1707e;
                if (!z10) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar, c11, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar, i16, c0581j3);
                    }
                    AbstractC6463a.r(0, i17, new L0(rVar), rVar, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("VerticalSlider");
                    AbstractC1706d0 abstractC1706d0 = (AbstractC1706d0) Ad.l.Y0(new Object[0], null, C4214H.f37240Y, rVar, 6);
                    rVar.W(-1232518274);
                    Object K10 = rVar.K();
                    if (K10 == C1723m.f22654Y) {
                        K10 = androidx.compose.ui.graphics.a.g();
                        rVar.h0(K10);
                    }
                    r0.E e10 = (r0.E) K10;
                    rVar.t(false);
                    float f10 = f37241a;
                    float R10 = ((Z0.b) rVar.m(AbstractC0701r0.f7002e)).R(f10);
                    AbstractC4326r c12 = G0.c(AbstractC4194d.a((X) a10, androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.m(c4323o, f6), f10), p9.r.f42840d, 0.0f, 2)), G0.f(new C0036p(R10, lVar, abstractC1706d0, 5), rVar), W0.f1213Y, false, null, false, null, false, 252);
                    rVar.W(733328855);
                    N c13 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
                    rVar.W(-1323940314);
                    int i18 = rVar.P;
                    AbstractC1732q0 p11 = rVar.p();
                    C3288a i19 = androidx.compose.ui.layout.a.i(c12);
                    if (z10) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, c13, c0581j);
                        U3.f.n0(rVar, p11, c0581j2);
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i18))) {
                            AbstractC6463a.q(i18, rVar, i18, c0581j3);
                        }
                        AbstractC6463a.r(0, i19, new L0(rVar), rVar, 2058660585);
                        androidx.compose.foundation.a.a(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.f24739c, 0.0f, p9.r.f42841e, 1), new Ra.l(e10, 7, abstractC1706d0), rVar, 0);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        abstractC4326r3 = a5;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new F.o(lVar, abstractC4326r3, i10, i11, 15);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i15 == 0) {
        }
        float f62 = f37242b;
        AbstractC4326r c102 = androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.e.m(a5, f62), 1.0f);
        C4318j c4318j2 = C4310b.f37697j0;
        rVar.W(733328855);
        N c112 = AbstractC0434s.c(c4318j2, false, rVar);
        rVar.W(-1323940314);
        int i162 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i172 = androidx.compose.ui.layout.a.i(c102);
        z10 = rVar.f22696a instanceof AbstractC1707e;
        if (!z10) {
        }
    }
}
