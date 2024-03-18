package W;

import E.AbstractC0429m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1724m0;
import Z.C1741v0;
import h.C3281g;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.C6684Y;
import z.C6721r0;
import z.C6729v0;
import z.C6737z0;

/* loaded from: classes2.dex */
public abstract class L1 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19330a = 48;

    /* renamed from: b  reason: collision with root package name */
    public static final float f19331b = 12;

    /* renamed from: c  reason: collision with root package name */
    public static final float f19332c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final float f19333d = 112;

    /* renamed from: e  reason: collision with root package name */
    public static final float f19334e = 280;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C6684Y c6684y, AbstractC1710f0 abstractC1710f0, A.Z0 z02, AbstractC4326r abstractC4326r, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        C4323o c4323o;
        boolean booleanValue;
        float f6;
        boolean booleanValue2;
        boolean booleanValue3;
        float f10;
        boolean booleanValue4;
        boolean z10;
        boolean z11;
        Object K10;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1289304092);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                z12 = rVar.g(c6684y);
            } else {
                z12 = rVar.i(c6684y);
            }
            if (z12) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.g(abstractC1710f0)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.g(z02)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        int i18 = i11 & 8;
        if (i18 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
            if ((i11 & 16) == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (rVar.i(oVar)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            if ((i12 & 9363) != 9362 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                C4323o c4323o2 = C4323o.f37719b;
                if (i18 == 0) {
                    c4323o = c4323o2;
                } else {
                    c4323o = abstractC4326r2;
                }
                C6729v0 y10 = AbstractC6696f.y(c6684y, rVar);
                C1641y0 c1641y0 = C1641y0.f20622n0;
                rVar.W(-1338768149);
                C6737z0 c6737z0 = AbstractC6652A0.f51116a;
                rVar.W(-142660079);
                booleanValue = ((Boolean) y10.b()).booleanValue();
                rVar.W(2092995144);
                float f11 = 0.8f;
                float f12 = 1.0f;
                if (!booleanValue) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.8f;
                }
                rVar.t(false);
                Float valueOf = Float.valueOf(f6);
                C1724m0 c1724m0 = y10.f51386c;
                booleanValue2 = ((Boolean) c1724m0.getValue()).booleanValue();
                rVar.W(2092995144);
                if (booleanValue2) {
                    f11 = 1.0f;
                }
                rVar.t(false);
                AbstractC4326r abstractC4326r4 = c4323o;
                C6721r0 n10 = AbstractC6696f.n(y10, valueOf, Float.valueOf(f11), (AbstractC6659E) c1641y0.invoke(y10.c(), rVar, 0), c6737z0, rVar);
                rVar.t(false);
                rVar.t(false);
                C1641y0 c1641y02 = C1641y0.f20621m0;
                rVar.W(-1338768149);
                rVar.W(-142660079);
                booleanValue3 = ((Boolean) y10.b()).booleanValue();
                rVar.W(1546829492);
                if (!booleanValue3) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                rVar.t(false);
                Float valueOf2 = Float.valueOf(f10);
                booleanValue4 = ((Boolean) c1724m0.getValue()).booleanValue();
                rVar.W(1546829492);
                if (!booleanValue4) {
                    f12 = 0.0f;
                }
                rVar.t(false);
                C6721r0 n11 = AbstractC6696f.n(y10, valueOf2, Float.valueOf(f12), (AbstractC6659E) c1641y02.invoke(y10.c(), rVar, 0), c6737z0, rVar);
                rVar.t(false);
                rVar.t(false);
                rVar.W(1402453378);
                boolean g10 = rVar.g(n10) | rVar.g(n11);
                if ((i12 & 112) != 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | g10;
                K10 = rVar.K();
                if (!z11 || K10 == C1723m.f22654Y) {
                    K10 = new C3281g(abstractC1710f0, n10, n11, 17);
                    rVar.h0(K10);
                }
                rVar.t(false);
                AbstractC4326r l10 = androidx.compose.ui.graphics.a.l(c4323o2, (wf.k) K10);
                r0.L a5 = AbstractC1530b3.a(X.v.f21654b, rVar);
                long d10 = R0.d((P0) rVar.m(R0.f19593a), 35);
                float f13 = X.v.f21653a;
                abstractC4326r3 = abstractC4326r4;
                G3.a(l10, a5, d10, 0L, f13, f13, null, R4.b.X(rVar, -1266256833, new N.D(abstractC4326r4, z02, oVar, 2)), rVar, 12804096, 72);
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new y.P((Object) c6684y, (Object) abstractC1710f0, (Object) z02, abstractC4326r3, (Object) oVar, i10, i11, 3);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i11 & 16) == 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        C4323o c4323o22 = C4323o.f37719b;
        if (i18 == 0) {
        }
        C6729v0 y102 = AbstractC6696f.y(c6684y, rVar);
        C1641y0 c1641y03 = C1641y0.f20622n0;
        rVar.W(-1338768149);
        C6737z0 c6737z02 = AbstractC6652A0.f51116a;
        rVar.W(-142660079);
        booleanValue = ((Boolean) y102.b()).booleanValue();
        rVar.W(2092995144);
        float f112 = 0.8f;
        float f122 = 1.0f;
        if (!booleanValue) {
        }
        rVar.t(false);
        Float valueOf3 = Float.valueOf(f6);
        C1724m0 c1724m02 = y102.f51386c;
        booleanValue2 = ((Boolean) c1724m02.getValue()).booleanValue();
        rVar.W(2092995144);
        if (booleanValue2) {
        }
        rVar.t(false);
        AbstractC4326r abstractC4326r42 = c4323o;
        C6721r0 n102 = AbstractC6696f.n(y102, valueOf3, Float.valueOf(f112), (AbstractC6659E) c1641y03.invoke(y102.c(), rVar, 0), c6737z02, rVar);
        rVar.t(false);
        rVar.t(false);
        C1641y0 c1641y022 = C1641y0.f20621m0;
        rVar.W(-1338768149);
        rVar.W(-142660079);
        booleanValue3 = ((Boolean) y102.b()).booleanValue();
        rVar.W(1546829492);
        if (!booleanValue3) {
        }
        rVar.t(false);
        Float valueOf22 = Float.valueOf(f10);
        booleanValue4 = ((Boolean) c1724m02.getValue()).booleanValue();
        rVar.W(1546829492);
        if (!booleanValue4) {
        }
        rVar.t(false);
        C6721r0 n112 = AbstractC6696f.n(y102, valueOf22, Float.valueOf(f122), (AbstractC6659E) c1641y022.invoke(y102.c(), rVar, 0), c6737z02, rVar);
        rVar.t(false);
        rVar.t(false);
        rVar.W(1402453378);
        boolean g102 = rVar.g(n102) | rVar.g(n112);
        if ((i12 & 112) != 32) {
        }
        z11 = z10 | g102;
        K10 = rVar.K();
        if (!z11) {
        }
        K10 = new C3281g(abstractC1710f0, n102, n112, 17);
        rVar.h0(K10);
        rVar.t(false);
        AbstractC4326r l102 = androidx.compose.ui.graphics.a.l(c4323o22, (wf.k) K10);
        r0.L a52 = AbstractC1530b3.a(X.v.f21654b, rVar);
        long d102 = R0.d((P0) rVar.m(R0.f19593a), 35);
        float f132 = X.v.f21653a;
        abstractC4326r3 = abstractC4326r42;
        G3.a(l102, a52, d102, 0L, f132, f132, null, R4.b.X(rVar, -1266256833, new N.D(abstractC4326r42, z02, oVar, 2)), rVar, 12804096, 72);
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final void b(wf.n nVar, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, wf.n nVar2, wf.n nVar3, boolean z10, I1 i12, E.g0 g0Var, D.m mVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1564716777);
        if ((i10 & 6) == 0) {
            if (rVar.i(nVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i11 = i21 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.i(abstractC6216a)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i11 |= i20;
        }
        if ((i10 & 384) == 0) {
            if (rVar.g(abstractC4326r)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i11 |= i19;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.i(nVar2)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i11 |= i18;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.i(nVar3)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i11 |= i17;
        }
        if ((196608 & i10) == 0) {
            if (rVar.h(z10)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i11 |= i16;
        }
        if ((1572864 & i10) == 0) {
            if (rVar.g(i12)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i11 |= i15;
        }
        if ((12582912 & i10) == 0) {
            if (rVar.g(g0Var)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i11 |= i14;
        }
        if ((100663296 & i10) == 0) {
            if (rVar.g(mVar)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i11 |= i13;
        }
        if ((i11 & 38347923) == 38347922 && rVar.B()) {
            rVar.P();
        } else {
            AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.e.l(androidx.compose.foundation.layout.e.d(androidx.compose.foundation.a.g(abstractC4326r, mVar, V.v.a(true, 0.0f, rVar, 6, 6), z10, null, abstractC6216a, 24), 1.0f), f19333d, X.v.f21655c, f19334e, 0.0f, 8), g0Var);
            C4317i c4317i = C4310b.f37703p0;
            rVar.W(693286680);
            E0.N a5 = E.p0.a(AbstractC0429m.f3907a, c4317i, rVar);
            rVar.W(-1323940314);
            int i22 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i23 = androidx.compose.ui.layout.a.i(q10);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, a5, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i22))) {
                    AbstractC6463a.q(i22, rVar, i22, c0581j);
                }
                AbstractC6463a.r(0, i23, new Z.L0(rVar), rVar, 2058660585);
                j4.a(q4.a((p4) rVar.m(q4.f20361a), X.v.f21658f), R4.b.X(rVar, 1065051884, new J1(nVar2, i12, z10, nVar3, nVar)), rVar, 48);
                AbstractC6463a.v(rVar, false, true, false, false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new K1(nVar, abstractC6216a, abstractC4326r, nVar2, nVar3, z10, i12, g0Var, mVar, i10);
        }
    }
}
