package W;

import A.AbstractC0048v0;
import A.C0036p;
import A.C0046u0;
import E.AbstractC0434s;
import E.AbstractC0438w;
import E.C0414b0;
import E.C0420e0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.material3.MinimumInteractiveModifier;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4318j;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import z.AbstractC6653B;
import z.AbstractC6696f;
import z.C6694e;
import z.C6716p;
import z.C6735y0;

/* loaded from: classes2.dex */
public abstract class M3 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f19372a;

    /* renamed from: c  reason: collision with root package name */
    public static final float f19374c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f19375d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f19376e;

    /* renamed from: b  reason: collision with root package name */
    public static final float f19373b = X.D.f21363g;

    /* renamed from: f  reason: collision with root package name */
    public static final C6735y0 f19377f = new C6735y0(100, (AbstractC6653B) null, 6);

    static {
        float f6 = X.D.f21358b;
        f19372a = f6;
        float f10 = X.D.f21362f;
        f19374c = f10;
        float f11 = X.D.f21360d;
        f19375d = f11;
        f19376e = (f10 - f6) - ((f11 - f6) / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z10, wf.k kVar, AbstractC4326r abstractC4326r, wf.n nVar, boolean z11, H3 h32, D.m mVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.n nVar2;
        int i14;
        boolean z12;
        H3 h33;
        int i15;
        D.m mVar2;
        Z.r rVar;
        D.m mVar3;
        H3 h34;
        boolean z13;
        wf.n nVar3;
        AbstractC4326r abstractC4326r3;
        int i16;
        io.sentry.hints.i iVar;
        D.m mVar4;
        H3 h35;
        boolean z14;
        wf.n nVar4;
        AbstractC4326r abstractC4326r4;
        float f6;
        boolean d10;
        Object K10;
        float floatValue;
        Object K11;
        C6694e c6694e;
        Object K12;
        boolean i17;
        Object K13;
        boolean i18;
        Object K14;
        C6694e c6694e2;
        float f10;
        boolean z15;
        int i19;
        AbstractC4326r abstractC4326r5;
        M0.a aVar;
        AbstractC4326r abstractC4326r6;
        AbstractC4326r abstractC4326r7;
        io.sentry.hints.i iVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1580463220);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar2.h(z10)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i12 = i27 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar2.i(kVar)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i12 |= i26;
        }
        int i28 = i11 & 4;
        if (i28 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i12 |= i25;
            i13 = i11 & 8;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                nVar2 = nVar;
                if (rVar2.i(nVar2)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i12 |= i24;
                i14 = i11 & 16;
                if (i14 != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    z12 = z11;
                    if (rVar2.h(z12)) {
                        i23 = 16384;
                    } else {
                        i23 = 8192;
                    }
                    i12 |= i23;
                    if ((196608 & i10) != 0) {
                        if ((i11 & 32) == 0) {
                            h33 = h32;
                            if (rVar2.g(h33)) {
                                i22 = 131072;
                                i12 |= i22;
                            }
                        } else {
                            h33 = h32;
                        }
                        i22 = 65536;
                        i12 |= i22;
                    } else {
                        h33 = h32;
                    }
                    i15 = i11 & 64;
                    if (i15 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        mVar2 = mVar;
                        if (rVar2.g(mVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                        if ((i12 & 599187) != 599186 && rVar2.B()) {
                            rVar2.P();
                            abstractC4326r3 = abstractC4326r2;
                            nVar3 = nVar2;
                            z13 = z12;
                            h34 = h33;
                            mVar3 = mVar2;
                            rVar = rVar2;
                        } else {
                            rVar2.R();
                            i16 = i10 & 1;
                            iVar = C1723m.f22654Y;
                            AbstractC4326r abstractC4326r8 = C4323o.f37719b;
                            if (i16 == 0 && !rVar2.A()) {
                                rVar2.P();
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                abstractC4326r4 = abstractC4326r;
                                nVar4 = nVar2;
                                z14 = z12;
                                h35 = h33;
                                mVar4 = mVar2;
                            } else {
                                if (i28 != 0) {
                                    abstractC4326r6 = abstractC4326r8;
                                } else {
                                    abstractC4326r6 = abstractC4326r;
                                }
                                if (i13 != 0) {
                                    nVar2 = null;
                                }
                                if (i14 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 32) != 0) {
                                    rVar2.W(435552781);
                                    P0 p02 = (P0) rVar2.m(R0.f19593a);
                                    H3 h36 = p02.f19514Z;
                                    if (h36 == null) {
                                        float f11 = X.D.f21357a;
                                        long d11 = R0.d(p02, 10);
                                        long d12 = R0.d(p02, 26);
                                        long j6 = r0.r.f44262j;
                                        long d13 = R0.d(p02, 11);
                                        long d14 = R0.d(p02, 24);
                                        long d15 = R0.d(p02, 44);
                                        long d16 = R0.d(p02, 24);
                                        long d17 = R0.d(p02, 44);
                                        long b10 = r0.r.b(R0.d(p02, 35), 1.0f);
                                        i20 = i15;
                                        long j10 = p02.f19532p;
                                        abstractC4326r7 = abstractC4326r6;
                                        iVar2 = iVar;
                                        h36 = new H3(d11, d12, j6, d13, d14, d15, d16, d17, androidx.compose.ui.graphics.a.k(b10, j10), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, 18), 0.12f), j10), j6, androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, 18), 0.38f), j10), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, 18), 0.38f), j10), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, 44), 0.12f), j10), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, 18), 0.12f), j10), androidx.compose.ui.graphics.a.k(r0.r.b(R0.d(p02, 44), 0.38f), j10));
                                        p02.f19514Z = h36;
                                    } else {
                                        abstractC4326r7 = abstractC4326r6;
                                        iVar2 = iVar;
                                        i20 = i15;
                                    }
                                    rVar2.t(false);
                                    i12 &= -458753;
                                    h33 = h36;
                                } else {
                                    abstractC4326r7 = abstractC4326r6;
                                    iVar2 = iVar;
                                    i20 = i15;
                                }
                                if (i20 != 0) {
                                    rVar2.W(-1221651002);
                                    Object K15 = rVar2.K();
                                    iVar = iVar2;
                                    if (K15 == iVar) {
                                        K15 = kotlin.jvm.internal.m.d();
                                        rVar2.h0(K15);
                                    }
                                    rVar2.t(false);
                                    mVar4 = (D.m) K15;
                                    nVar4 = nVar2;
                                    z14 = z12;
                                    h35 = h33;
                                } else {
                                    iVar = iVar2;
                                    nVar4 = nVar2;
                                    z14 = z12;
                                    h35 = h33;
                                    mVar4 = mVar2;
                                }
                                abstractC4326r4 = abstractC4326r7;
                            }
                            rVar2.u();
                            if (nVar4 == null) {
                                f6 = f19373b;
                            } else {
                                f6 = f19372a;
                            }
                            float f12 = f6;
                            float f13 = f19375d;
                            float f14 = (f13 - f12) / 2;
                            Z.m1 m1Var = AbstractC0701r0.f7002e;
                            float R10 = ((Z0.b) rVar2.m(m1Var)).R(f14);
                            float f15 = f19376e;
                            float R11 = ((Z0.b) rVar2.m(m1Var)).R(f15);
                            rVar2.W(-1221650579);
                            d10 = rVar2.d(R10) | rVar2.d(R11);
                            K10 = rVar2.K();
                            if (!d10 || K10 == iVar) {
                                K10 = new C0414b0(R11, R10, 6);
                                rVar2.h0(K10);
                            }
                            rVar2.t(false);
                            floatValue = ((Number) ((wf.k) K10).invoke(Boolean.valueOf(z10))).floatValue();
                            rVar2.W(-1221650404);
                            K11 = rVar2.K();
                            if (K11 == iVar) {
                                K11 = AbstractC6696f.a(floatValue);
                                rVar2.h0(K11);
                            }
                            c6694e = (C6694e) K11;
                            rVar2.t(false);
                            rVar2.W(773894976);
                            rVar2.W(-492369756);
                            K12 = rVar2.K();
                            if (K12 == iVar) {
                                Z.C c10 = new Z.C(AbstractC1734s.k(rVar2));
                                rVar2.h0(c10);
                                K12 = c10;
                            }
                            rVar2.t(false);
                            Ng.F f16 = ((Z.C) K12).f22442Y;
                            rVar2.t(false);
                            rVar2.W(-1221650310);
                            i17 = rVar2.i(c6694e) | rVar2.d(R10);
                            K13 = rVar2.K();
                            if (!i17 || K13 == iVar) {
                                K13 = new M(R10, 1, c6694e);
                                rVar2.h0(K13);
                            }
                            rVar2.t(false);
                            AbstractC1734s.g((AbstractC6216a) K13, rVar2);
                            Boolean valueOf = Boolean.valueOf(z10);
                            rVar2.W(-1221650133);
                            i18 = rVar2.i(c6694e) | rVar2.d(floatValue) | rVar2.i(f16);
                            K14 = rVar2.K();
                            if (!i18 || K14 == iVar) {
                                K14 = new C0036p(c6694e, floatValue, f16, 4);
                                rVar2.h0(K14);
                            }
                            rVar2.t(false);
                            AbstractC1734s.b(valueOf, (wf.k) K14, rVar2);
                            if (kVar != null) {
                                L0.g gVar = new L0.g(2);
                                if (z10) {
                                    aVar = M0.a.f11366Y;
                                } else {
                                    aVar = M0.a.f11367Z;
                                }
                                z15 = true;
                                c6694e2 = c6694e;
                                i19 = 6;
                                f10 = f15;
                                abstractC4326r5 = H0.Q.s(abstractC4326r8, U3.f.p0(aVar, mVar4, null, z14, gVar, new J.e(kVar, z10, 0)));
                            } else {
                                i19 = 6;
                                z15 = true;
                                c6694e2 = c6694e;
                                f10 = f15;
                                abstractC4326r5 = abstractC4326r8;
                            }
                            if (kVar != null) {
                                Z.m1 m1Var2 = AbstractC1617t1.f20423a;
                                abstractC4326r8 = MinimumInteractiveModifier.f24779b;
                            }
                            AbstractC4326r i29 = androidx.compose.foundation.layout.e.i(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r8).g(abstractC4326r5), C4310b.f37697j0), f19374c, f13);
                            rVar2.W(733328855);
                            E0.N c11 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                            rVar2.W(-1323940314);
                            int i30 = rVar2.P;
                            AbstractC1732q0 p10 = rVar2.p();
                            AbstractC0584m.f5811i.getClass();
                            C0582k c0582k = C0583l.f5804b;
                            C3288a i31 = androidx.compose.ui.layout.a.i(i29);
                            if (rVar2.f22696a instanceof AbstractC1707e) {
                                rVar2.Z();
                                if (rVar2.f22695O) {
                                    rVar2.o(c0582k);
                                } else {
                                    rVar2.k0();
                                }
                                U3.f.n0(rVar2, c11, C0583l.f5808f);
                                U3.f.n0(rVar2, p10, C0583l.f5807e);
                                C0581j c0581j = C0583l.f5809g;
                                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i30))) {
                                    AbstractC6463a.q(i30, rVar2, i30, c0581j);
                                }
                                AbstractC6463a.r(0, i31, new Z.L0(rVar2), rVar2, 2058660585);
                                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                                C6716p c6716p = c6694e2.f51230c;
                                float f17 = X.D.f21357a;
                                int i32 = i12 >> 6;
                                AbstractC4326r abstractC4326r9 = abstractC4326r4;
                                rVar = rVar2;
                                b(bVar, z10, z14, h35, c6716p, nVar4, mVar4, AbstractC1530b3.a(5, rVar2), f12, f14, f10, rVar2, i19 | ((i12 << 3) & 112) | (i32 & 896) | (i32 & 7168) | ((i12 << 6) & 458752) | (i12 & 3670016), 6);
                                AbstractC6463a.v(rVar, false, z15, false, false);
                                nVar3 = nVar4;
                                z13 = z14;
                                h34 = h35;
                                mVar3 = mVar4;
                                abstractC4326r3 = abstractC4326r9;
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        }
                        C1741v0 v10 = rVar.v();
                        if (v10 != null) {
                            v10.f22739d = new K3(z10, kVar, abstractC4326r3, nVar3, z13, h34, mVar3, i10, i11);
                            return;
                        }
                        return;
                    }
                    mVar2 = mVar;
                    if ((i12 & 599187) != 599186) {
                    }
                    rVar2.R();
                    i16 = i10 & 1;
                    iVar = C1723m.f22654Y;
                    AbstractC4326r abstractC4326r82 = C4323o.f37719b;
                    if (i16 == 0) {
                    }
                    if (i28 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i11 & 32) != 0) {
                    }
                    if (i20 != 0) {
                    }
                    abstractC4326r4 = abstractC4326r7;
                    rVar2.u();
                    if (nVar4 == null) {
                    }
                    float f122 = f6;
                    float f132 = f19375d;
                    float f142 = (f132 - f122) / 2;
                    Z.m1 m1Var3 = AbstractC0701r0.f7002e;
                    float R102 = ((Z0.b) rVar2.m(m1Var3)).R(f142);
                    float f152 = f19376e;
                    float R112 = ((Z0.b) rVar2.m(m1Var3)).R(f152);
                    rVar2.W(-1221650579);
                    d10 = rVar2.d(R102) | rVar2.d(R112);
                    K10 = rVar2.K();
                    if (!d10) {
                    }
                    K10 = new C0414b0(R112, R102, 6);
                    rVar2.h0(K10);
                    rVar2.t(false);
                    floatValue = ((Number) ((wf.k) K10).invoke(Boolean.valueOf(z10))).floatValue();
                    rVar2.W(-1221650404);
                    K11 = rVar2.K();
                    if (K11 == iVar) {
                    }
                    c6694e = (C6694e) K11;
                    rVar2.t(false);
                    rVar2.W(773894976);
                    rVar2.W(-492369756);
                    K12 = rVar2.K();
                    if (K12 == iVar) {
                    }
                    rVar2.t(false);
                    Ng.F f162 = ((Z.C) K12).f22442Y;
                    rVar2.t(false);
                    rVar2.W(-1221650310);
                    i17 = rVar2.i(c6694e) | rVar2.d(R102);
                    K13 = rVar2.K();
                    if (!i17) {
                    }
                    K13 = new M(R102, 1, c6694e);
                    rVar2.h0(K13);
                    rVar2.t(false);
                    AbstractC1734s.g((AbstractC6216a) K13, rVar2);
                    Boolean valueOf2 = Boolean.valueOf(z10);
                    rVar2.W(-1221650133);
                    i18 = rVar2.i(c6694e) | rVar2.d(floatValue) | rVar2.i(f162);
                    K14 = rVar2.K();
                    if (!i18) {
                    }
                    K14 = new C0036p(c6694e, floatValue, f162, 4);
                    rVar2.h0(K14);
                    rVar2.t(false);
                    AbstractC1734s.b(valueOf2, (wf.k) K14, rVar2);
                    if (kVar != null) {
                    }
                    if (kVar != null) {
                    }
                    AbstractC4326r i292 = androidx.compose.foundation.layout.e.i(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r82).g(abstractC4326r5), C4310b.f37697j0), f19374c, f132);
                    rVar2.W(733328855);
                    E0.N c112 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                    rVar2.W(-1323940314);
                    int i302 = rVar2.P;
                    AbstractC1732q0 p102 = rVar2.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k2 = C0583l.f5804b;
                    C3288a i312 = androidx.compose.ui.layout.a.i(i292);
                    if (rVar2.f22696a instanceof AbstractC1707e) {
                    }
                }
                z12 = z11;
                if ((196608 & i10) != 0) {
                }
                i15 = i11 & 64;
                if (i15 == 0) {
                }
                mVar2 = mVar;
                if ((i12 & 599187) != 599186) {
                }
                rVar2.R();
                i16 = i10 & 1;
                iVar = C1723m.f22654Y;
                AbstractC4326r abstractC4326r822 = C4323o.f37719b;
                if (i16 == 0) {
                }
                if (i28 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i11 & 32) != 0) {
                }
                if (i20 != 0) {
                }
                abstractC4326r4 = abstractC4326r7;
                rVar2.u();
                if (nVar4 == null) {
                }
                float f1222 = f6;
                float f1322 = f19375d;
                float f1422 = (f1322 - f1222) / 2;
                Z.m1 m1Var32 = AbstractC0701r0.f7002e;
                float R1022 = ((Z0.b) rVar2.m(m1Var32)).R(f1422);
                float f1522 = f19376e;
                float R1122 = ((Z0.b) rVar2.m(m1Var32)).R(f1522);
                rVar2.W(-1221650579);
                d10 = rVar2.d(R1022) | rVar2.d(R1122);
                K10 = rVar2.K();
                if (!d10) {
                }
                K10 = new C0414b0(R1122, R1022, 6);
                rVar2.h0(K10);
                rVar2.t(false);
                floatValue = ((Number) ((wf.k) K10).invoke(Boolean.valueOf(z10))).floatValue();
                rVar2.W(-1221650404);
                K11 = rVar2.K();
                if (K11 == iVar) {
                }
                c6694e = (C6694e) K11;
                rVar2.t(false);
                rVar2.W(773894976);
                rVar2.W(-492369756);
                K12 = rVar2.K();
                if (K12 == iVar) {
                }
                rVar2.t(false);
                Ng.F f1622 = ((Z.C) K12).f22442Y;
                rVar2.t(false);
                rVar2.W(-1221650310);
                i17 = rVar2.i(c6694e) | rVar2.d(R1022);
                K13 = rVar2.K();
                if (!i17) {
                }
                K13 = new M(R1022, 1, c6694e);
                rVar2.h0(K13);
                rVar2.t(false);
                AbstractC1734s.g((AbstractC6216a) K13, rVar2);
                Boolean valueOf22 = Boolean.valueOf(z10);
                rVar2.W(-1221650133);
                i18 = rVar2.i(c6694e) | rVar2.d(floatValue) | rVar2.i(f1622);
                K14 = rVar2.K();
                if (!i18) {
                }
                K14 = new C0036p(c6694e, floatValue, f1622, 4);
                rVar2.h0(K14);
                rVar2.t(false);
                AbstractC1734s.b(valueOf22, (wf.k) K14, rVar2);
                if (kVar != null) {
                }
                if (kVar != null) {
                }
                AbstractC4326r i2922 = androidx.compose.foundation.layout.e.i(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r822).g(abstractC4326r5), C4310b.f37697j0), f19374c, f1322);
                rVar2.W(733328855);
                E0.N c1122 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                rVar2.W(-1323940314);
                int i3022 = rVar2.P;
                AbstractC1732q0 p1022 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k22 = C0583l.f5804b;
                C3288a i3122 = androidx.compose.ui.layout.a.i(i2922);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                }
            }
            nVar2 = nVar;
            i14 = i11 & 16;
            if (i14 != 0) {
            }
            z12 = z11;
            if ((196608 & i10) != 0) {
            }
            i15 = i11 & 64;
            if (i15 == 0) {
            }
            mVar2 = mVar;
            if ((i12 & 599187) != 599186) {
            }
            rVar2.R();
            i16 = i10 & 1;
            iVar = C1723m.f22654Y;
            AbstractC4326r abstractC4326r8222 = C4323o.f37719b;
            if (i16 == 0) {
            }
            if (i28 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i11 & 32) != 0) {
            }
            if (i20 != 0) {
            }
            abstractC4326r4 = abstractC4326r7;
            rVar2.u();
            if (nVar4 == null) {
            }
            float f12222 = f6;
            float f13222 = f19375d;
            float f14222 = (f13222 - f12222) / 2;
            Z.m1 m1Var322 = AbstractC0701r0.f7002e;
            float R10222 = ((Z0.b) rVar2.m(m1Var322)).R(f14222);
            float f15222 = f19376e;
            float R11222 = ((Z0.b) rVar2.m(m1Var322)).R(f15222);
            rVar2.W(-1221650579);
            d10 = rVar2.d(R10222) | rVar2.d(R11222);
            K10 = rVar2.K();
            if (!d10) {
            }
            K10 = new C0414b0(R11222, R10222, 6);
            rVar2.h0(K10);
            rVar2.t(false);
            floatValue = ((Number) ((wf.k) K10).invoke(Boolean.valueOf(z10))).floatValue();
            rVar2.W(-1221650404);
            K11 = rVar2.K();
            if (K11 == iVar) {
            }
            c6694e = (C6694e) K11;
            rVar2.t(false);
            rVar2.W(773894976);
            rVar2.W(-492369756);
            K12 = rVar2.K();
            if (K12 == iVar) {
            }
            rVar2.t(false);
            Ng.F f16222 = ((Z.C) K12).f22442Y;
            rVar2.t(false);
            rVar2.W(-1221650310);
            i17 = rVar2.i(c6694e) | rVar2.d(R10222);
            K13 = rVar2.K();
            if (!i17) {
            }
            K13 = new M(R10222, 1, c6694e);
            rVar2.h0(K13);
            rVar2.t(false);
            AbstractC1734s.g((AbstractC6216a) K13, rVar2);
            Boolean valueOf222 = Boolean.valueOf(z10);
            rVar2.W(-1221650133);
            i18 = rVar2.i(c6694e) | rVar2.d(floatValue) | rVar2.i(f16222);
            K14 = rVar2.K();
            if (!i18) {
            }
            K14 = new C0036p(c6694e, floatValue, f16222, 4);
            rVar2.h0(K14);
            rVar2.t(false);
            AbstractC1734s.b(valueOf222, (wf.k) K14, rVar2);
            if (kVar != null) {
            }
            if (kVar != null) {
            }
            AbstractC4326r i29222 = androidx.compose.foundation.layout.e.i(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r8222).g(abstractC4326r5), C4310b.f37697j0), f19374c, f13222);
            rVar2.W(733328855);
            E0.N c11222 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
            rVar2.W(-1323940314);
            int i30222 = rVar2.P;
            AbstractC1732q0 p10222 = rVar2.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k222 = C0583l.f5804b;
            C3288a i31222 = androidx.compose.ui.layout.a.i(i29222);
            if (rVar2.f22696a instanceof AbstractC1707e) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 8;
        if (i13 == 0) {
        }
        nVar2 = nVar;
        i14 = i11 & 16;
        if (i14 != 0) {
        }
        z12 = z11;
        if ((196608 & i10) != 0) {
        }
        i15 = i11 & 64;
        if (i15 == 0) {
        }
        mVar2 = mVar;
        if ((i12 & 599187) != 599186) {
        }
        rVar2.R();
        i16 = i10 & 1;
        iVar = C1723m.f22654Y;
        AbstractC4326r abstractC4326r82222 = C4323o.f37719b;
        if (i16 == 0) {
        }
        if (i28 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i11 & 32) != 0) {
        }
        if (i20 != 0) {
        }
        abstractC4326r4 = abstractC4326r7;
        rVar2.u();
        if (nVar4 == null) {
        }
        float f122222 = f6;
        float f132222 = f19375d;
        float f142222 = (f132222 - f122222) / 2;
        Z.m1 m1Var3222 = AbstractC0701r0.f7002e;
        float R102222 = ((Z0.b) rVar2.m(m1Var3222)).R(f142222);
        float f152222 = f19376e;
        float R112222 = ((Z0.b) rVar2.m(m1Var3222)).R(f152222);
        rVar2.W(-1221650579);
        d10 = rVar2.d(R102222) | rVar2.d(R112222);
        K10 = rVar2.K();
        if (!d10) {
        }
        K10 = new C0414b0(R112222, R102222, 6);
        rVar2.h0(K10);
        rVar2.t(false);
        floatValue = ((Number) ((wf.k) K10).invoke(Boolean.valueOf(z10))).floatValue();
        rVar2.W(-1221650404);
        K11 = rVar2.K();
        if (K11 == iVar) {
        }
        c6694e = (C6694e) K11;
        rVar2.t(false);
        rVar2.W(773894976);
        rVar2.W(-492369756);
        K12 = rVar2.K();
        if (K12 == iVar) {
        }
        rVar2.t(false);
        Ng.F f162222 = ((Z.C) K12).f22442Y;
        rVar2.t(false);
        rVar2.W(-1221650310);
        i17 = rVar2.i(c6694e) | rVar2.d(R102222);
        K13 = rVar2.K();
        if (!i17) {
        }
        K13 = new M(R102222, 1, c6694e);
        rVar2.h0(K13);
        rVar2.t(false);
        AbstractC1734s.g((AbstractC6216a) K13, rVar2);
        Boolean valueOf2222 = Boolean.valueOf(z10);
        rVar2.W(-1221650133);
        i18 = rVar2.i(c6694e) | rVar2.d(floatValue) | rVar2.i(f162222);
        K14 = rVar2.K();
        if (!i18) {
        }
        K14 = new C0036p(c6694e, floatValue, f162222, 4);
        rVar2.h0(K14);
        rVar2.t(false);
        AbstractC1734s.b(valueOf2222, (wf.k) K14, rVar2);
        if (kVar != null) {
        }
        if (kVar != null) {
        }
        AbstractC4326r i292222 = androidx.compose.foundation.layout.e.i(androidx.compose.foundation.layout.e.p(abstractC4326r4.g(abstractC4326r82222).g(abstractC4326r5), C4310b.f37697j0), f19374c, f132222);
        rVar2.W(733328855);
        E0.N c112222 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i302222 = rVar2.P;
        AbstractC1732q0 p102222 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2222 = C0583l.f5804b;
        C3288a i312222 = androidx.compose.ui.layout.a.i(i292222);
        if (rVar2.f22696a instanceof AbstractC1707e) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0221, code lost:
        if (id.AbstractC3557B.K(r0.K(), java.lang.Integer.valueOf(r11)) == false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC0438w abstractC0438w, boolean z10, boolean z11, H3 h32, Z.l1 l1Var, wf.n nVar, D.l lVar, r0.L l10, float f6, float f10, float f11, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        long j6;
        float f12;
        float f13;
        C4318j c4318j;
        long j10;
        C0581j c0581j;
        long j11;
        C0581j c0581j2;
        long j12;
        float f14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1968109941);
        if ((i10 & 6) == 0) {
            if (rVar.g(abstractC0438w)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i12 = i24 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.h(z10)) {
                i23 = 32;
            } else {
                i23 = 16;
            }
            i12 |= i23;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(z11)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i12 |= i22;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.g(h32)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i12 |= i21;
        }
        if ((i10 & 24576) == 0) {
            if (rVar.g(l1Var)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i12 |= i20;
        }
        if ((i10 & 196608) == 0) {
            if (rVar.i(nVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        if ((i10 & 1572864) == 0) {
            if (rVar.g(lVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i10 & 12582912) == 0) {
            if (rVar.g(l10)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((i10 & 100663296) == 0) {
            if (rVar.d(f6)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i12 |= i16;
        }
        if ((i10 & 805306368) == 0) {
            if (rVar.d(f10)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i12 |= i15;
        }
        if ((i11 & 6) == 0) {
            if (rVar.d(f11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i11 | i14;
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && rVar.B()) {
            rVar.P();
        } else {
            if (z11) {
                if (z10) {
                    j6 = h32.f19190b;
                } else {
                    j6 = h32.f19194f;
                }
            } else if (z10) {
                j6 = h32.f19198j;
            } else {
                j6 = h32.f19202n;
            }
            AbstractC1710f0 t10 = Df.H.t(lVar, rVar, (i12 >> 18) & 14);
            Z.m1 m1Var = AbstractC0701r0.f7002e;
            int i25 = i12;
            float K10 = ((Z0.b) rVar.m(m1Var)).K(((Number) l1Var.getValue()).floatValue());
            if (((Boolean) t10.getValue()).booleanValue()) {
                f12 = X.D.f21357a;
            } else {
                f12 = (((K10 - f10) / (f11 - f10)) * (f19372a - f6)) + f6;
            }
            rVar.W(-993794132);
            if (((Boolean) t10.getValue()).booleanValue()) {
                Z0.b bVar = (Z0.b) rVar.m(m1Var);
                if (z10) {
                    f14 = f19376e - X.D.f21361e;
                } else {
                    f14 = X.D.f21361e;
                }
                f13 = bVar.R(f14);
            } else {
                f13 = ((Number) l1Var.getValue()).floatValue();
            }
            rVar.t(false);
            float f15 = X.D.f21357a;
            r0.L a5 = AbstractC1530b3.a(5, rVar);
            C4323o c4323o = C4323o.f37719b;
            C4318j c4318j2 = C4310b.f37697j0;
            AbstractC4326r e10 = androidx.compose.foundation.layout.e.e(androidx.compose.foundation.layout.e.m(abstractC0438w.a(c4323o, c4318j2), f19374c), f19375d);
            float f16 = X.D.f21361e;
            if (z11) {
                c4318j = c4318j2;
                if (z10) {
                    j10 = h32.f19191c;
                } else {
                    j10 = h32.f19195g;
                }
            } else {
                c4318j = c4318j2;
                if (z10) {
                    j10 = h32.f19199k;
                } else {
                    j10 = h32.f19203o;
                }
            }
            AbstractC4326r d10 = androidx.compose.foundation.a.d(e10.g(new BorderModifierNodeElement(f16, new r0.N(j10), a5)), j6, a5);
            rVar.W(733328855);
            E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
            rVar.W(-1323940314);
            int i26 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i27 = androidx.compose.ui.layout.a.i(d10);
            boolean z12 = rVar.f22696a instanceof AbstractC1707e;
            if (z12) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                C0581j c0581j3 = C0583l.f5808f;
                U3.f.n0(rVar, c10, c0581j3);
                C0581j c0581j4 = C0583l.f5807e;
                U3.f.n0(rVar, p10, c0581j4);
                C0581j c0581j5 = C0583l.f5809g;
                if (!rVar.f22695O) {
                    c0581j = c0581j4;
                } else {
                    c0581j = c0581j4;
                }
                AbstractC6463a.q(i26, rVar, i26, c0581j5);
                AbstractC6463a.r(0, i27, new Z.L0(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f24731a;
                if (z11) {
                    c0581j2 = c0581j3;
                    if (z10) {
                        j11 = h32.f19189a;
                    } else {
                        j11 = h32.f19193e;
                    }
                } else {
                    c0581j2 = c0581j3;
                    if (z10) {
                        j11 = h32.f19197i;
                    } else {
                        j11 = h32.f19201m;
                    }
                }
                AbstractC4326r a10 = bVar2.a(c4323o, C4310b.f37696i0);
                rVar.W(1420969929);
                boolean d11 = rVar.d(f13);
                Object K11 = rVar.K();
                if (d11 || K11 == C1723m.f22654Y) {
                    K11 = new C0420e0(5, f13);
                    rVar.h0(K11);
                }
                rVar.t(false);
                AbstractC4326r o10 = androidx.compose.foundation.layout.a.o(a10, (wf.k) K11);
                C0581j c0581j6 = c0581j2;
                V.e a11 = V.v.a(false, X.D.f21359c / 2, rVar, 54, 4);
                Z.m1 m1Var2 = AbstractC0048v0.f314a;
                AbstractC4326r d12 = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.e.h(U3.f.o(o10, new C0046u0(a11, 0, lVar)), f12), j11, l10);
                rVar.W(733328855);
                E0.N c11 = AbstractC0434s.c(c4318j, false, rVar);
                rVar.W(-1323940314);
                int i28 = rVar.P;
                AbstractC1732q0 p11 = rVar.p();
                C3288a i29 = androidx.compose.ui.layout.a.i(d12);
                if (z12) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, c11, c0581j6);
                    U3.f.n0(rVar, p11, c0581j);
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i28))) {
                        AbstractC6463a.q(i28, rVar, i28, c0581j5);
                    }
                    AbstractC6463a.r(0, i29, new Z.L0(rVar), rVar, 2058660585);
                    rVar.W(1420970455);
                    if (nVar != null) {
                        if (z11) {
                            if (z10) {
                                j12 = h32.f19192d;
                            } else {
                                j12 = h32.f19196h;
                            }
                        } else if (z10) {
                            j12 = h32.f19200l;
                        } else {
                            j12 = h32.f19204p;
                        }
                        A7.b.k(R.a.q(j12, Z0.f19875a), nVar, rVar, (i25 >> 12) & 112);
                    }
                    AbstractC6463a.v(rVar, false, false, true, false);
                    AbstractC6463a.v(rVar, false, false, true, false);
                    rVar.t(false);
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
            v10.f22739d = new L3(abstractC0438w, z10, z11, h32, l1Var, nVar, lVar, l10, f6, f10, f11, i10, i11);
        }
    }
}
