package W;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.C0424h;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import X.AbstractC1668b;
import Z.AbstractC1706d0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4317i;
import l0.C4318j;
import l0.C4323o;
import y.AbstractC6463a;
import z.C6686a;

/* renamed from: W.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1547f0 {

    /* renamed from: b  reason: collision with root package name */
    public static final float f20041b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f20042c;

    /* renamed from: a  reason: collision with root package name */
    public static final float f20040a = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final float f20043d = 0;

    static {
        float f6 = 6;
        f20041b = -f6;
        f20042c = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC4326r abstractC4326r, long j6, long j10, wf.o oVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        long j11;
        long j12;
        wf.o oVar2;
        int i13;
        float f6;
        r0.L l10;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1298144073);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
            abstractC4326r2 = abstractC4326r;
        } else if ((i10 & 6) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            abstractC4326r2 = abstractC4326r;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                j11 = j6;
                if (rVar.f(j11)) {
                    i16 = 32;
                    i12 |= i16;
                }
            } else {
                j11 = j6;
            }
            i16 = 16;
            i12 |= i16;
        } else {
            j11 = j6;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j10;
                if (rVar.f(j12)) {
                    i15 = 256;
                    i12 |= i15;
                }
            } else {
                j12 = j10;
            }
            i15 = 128;
            i12 |= i15;
        } else {
            j12 = j10;
        }
        int i19 = i11 & 8;
        if (i19 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            oVar2 = oVar;
            if (rVar.i(oVar2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
            if ((i12 & 1171) != 1170 && rVar.B()) {
                rVar.P();
            } else {
                rVar.R();
                i13 = i10 & 1;
                AbstractC4326r abstractC4326r3 = C4323o.f37719b;
                if (i13 == 0 && !rVar.A()) {
                    rVar.P();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                } else {
                    if (i18 != 0) {
                        abstractC4326r2 = abstractC4326r3;
                    }
                    if ((i11 & 2) != 0) {
                        rVar.W(-867931977);
                        float f10 = AbstractC1668b.f21485a;
                        j11 = R0.e(2, rVar);
                        rVar.t(false);
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        j12 = R0.b(j11, rVar);
                        i12 &= -897;
                    }
                    if (i19 != 0) {
                        oVar2 = null;
                    }
                }
                rVar.u();
                if (oVar2 == null) {
                    f6 = AbstractC1668b.f21485a;
                } else {
                    f6 = AbstractC1668b.f21486b;
                }
                if (oVar2 == null) {
                    rVar.W(1947277315);
                    l10 = AbstractC1530b3.a(5, rVar);
                    rVar.t(false);
                } else {
                    rVar.W(1947277365);
                    l10 = AbstractC1530b3.a(5, rVar);
                    rVar.t(false);
                }
                AbstractC4326r b10 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.e.a(abstractC4326r2, f6, f6), j11, l10), l10);
                if (oVar2 != null) {
                    abstractC4326r3 = androidx.compose.foundation.layout.a.t(abstractC4326r3, f20040a, 0.0f, 2);
                }
                AbstractC4326r g10 = b10.g(abstractC4326r3);
                C4317i c4317i = C4310b.f37703p0;
                C0424h c0424h = AbstractC0429m.f3911e;
                rVar.W(693286680);
                E0.N a5 = E.p0.a(c0424h, c4317i, rVar);
                rVar.W(-1323940314);
                int i20 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i21 = androidx.compose.ui.layout.a.i(g10);
                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, a5, C0583l.f5808f);
                    U3.f.n0(rVar, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i20))) {
                        AbstractC6463a.q(i20, rVar, i20, c0581j);
                    }
                    AbstractC6463a.r(0, i21, new Z.L0(rVar), rVar, 2058660585);
                    E.r0 r0Var = E.r0.f3944a;
                    rVar.W(1947277962);
                    if (oVar2 != null) {
                        r9.y.s(j12, q4.a((p4) rVar.m(q4.f20361a), X.J.f21456k0), R4.b.X(rVar, 719214594, new C1581m(oVar2, 2, r0Var)), rVar, ((i12 >> 6) & 14) | 384);
                    }
                    AbstractC6463a.v(rVar, false, false, true, false);
                    rVar.t(false);
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            AbstractC4326r abstractC4326r4 = abstractC4326r2;
            long j13 = j11;
            long j14 = j12;
            wf.o oVar3 = oVar2;
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new C1532c0(abstractC4326r4, j13, j14, oVar3, i10, i11);
                return;
            }
            return;
        }
        oVar2 = oVar;
        if ((i12 & 1171) != 1170) {
        }
        rVar.R();
        i13 = i10 & 1;
        AbstractC4326r abstractC4326r32 = C4323o.f37719b;
        if (i13 == 0) {
        }
        if (i18 != 0) {
        }
        if ((i11 & 2) != 0) {
        }
        if ((i11 & 4) != 0) {
        }
        if (i19 != 0) {
        }
        rVar.u();
        if (oVar2 == null) {
        }
        if (oVar2 == null) {
        }
        AbstractC4326r b102 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.e.a(abstractC4326r2, f6, f6), j11, l10), l10);
        if (oVar2 != null) {
        }
        AbstractC4326r g102 = b102.g(abstractC4326r32);
        C4317i c4317i2 = C4310b.f37703p0;
        C0424h c0424h2 = AbstractC0429m.f3911e;
        rVar.W(693286680);
        E0.N a52 = E.p0.a(c0424h2, c4317i2, rVar);
        rVar.W(-1323940314);
        int i202 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i212 = androidx.compose.ui.layout.a.i(g102);
        if (!(rVar.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(wf.o oVar, AbstractC4326r abstractC4326r, wf.o oVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        C4323o c4323o;
        Object K10;
        io.sentry.hints.i iVar;
        Object w10;
        Object w11;
        Object w12;
        Object w13;
        AbstractC1706d0 abstractC1706d0;
        AbstractC1706d0 abstractC1706d02;
        boolean z10;
        Object K11;
        boolean z11;
        int i13;
        int i14;
        int i15;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1404022535);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.i(oVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            c4323o = abstractC4326r;
            if (rVar.g(c4323o)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
            if ((i11 & 4) == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                if (rVar.i(oVar2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 147) != 146 && rVar.B()) {
                rVar.P();
            } else {
                C4323o c4323o2 = C4323o.f37719b;
                c4323o = c4323o;
                if (i16 != 0) {
                    c4323o = c4323o2;
                }
                rVar.W(-1648447067);
                K10 = rVar.K();
                iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                    K10 = Df.H.h0(0.0f);
                    rVar.h0(K10);
                }
                AbstractC1706d0 abstractC1706d03 = (AbstractC1706d0) K10;
                w10 = AbstractC0044t0.w(rVar, false, -1648447001);
                if (w10 == iVar) {
                    w10 = Df.H.h0(0.0f);
                    rVar.h0(w10);
                }
                AbstractC1706d0 abstractC1706d04 = (AbstractC1706d0) w10;
                w11 = AbstractC0044t0.w(rVar, false, -1648446782);
                if (w11 == iVar) {
                    w11 = Df.H.h0(Float.POSITIVE_INFINITY);
                    rVar.h0(w11);
                }
                AbstractC1706d0 abstractC1706d05 = (AbstractC1706d0) w11;
                w12 = AbstractC0044t0.w(rVar, false, -1648446685);
                if (w12 == iVar) {
                    w12 = Df.H.h0(Float.NEGATIVE_INFINITY);
                    rVar.h0(w12);
                }
                AbstractC1706d0 abstractC1706d06 = (AbstractC1706d0) w12;
                w13 = AbstractC0044t0.w(rVar, false, -1648446239);
                if (w13 != iVar) {
                    abstractC1706d0 = abstractC1706d06;
                    abstractC1706d02 = abstractC1706d05;
                    z10 = false;
                    w13 = new C6686a(abstractC1706d03, abstractC1706d04, abstractC1706d05, abstractC1706d0, 5);
                    rVar.h0(w13);
                } else {
                    abstractC1706d0 = abstractC1706d06;
                    abstractC1706d02 = abstractC1706d05;
                    z10 = false;
                }
                rVar.t(z10);
                AbstractC4326r j6 = androidx.compose.ui.layout.a.j(c4323o, (wf.k) w13);
                rVar.W(-1648445701);
                K11 = rVar.K();
                if (K11 == iVar) {
                    K11 = new C1542e0(abstractC1706d04, abstractC1706d03, abstractC1706d02, abstractC1706d0);
                    rVar.h0(K11);
                }
                E0.N n10 = (E0.N) K11;
                rVar.t(z10);
                rVar.W(-1323940314);
                int i17 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(j6);
                z11 = rVar.f22696a instanceof AbstractC1707e;
                if (!z11) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar, n10, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar, i17, c0581j3);
                    }
                    Z.L0 l02 = new Z.L0(rVar);
                    int i19 = z10 ? 1 : 0;
                    int i20 = z10 ? 1 : 0;
                    AbstractC6463a.r(i19, i18, l02, rVar, 2058660585);
                    AbstractC4326r h10 = androidx.compose.ui.layout.a.h(c4323o2, "anchor");
                    C4318j c4318j = C4310b.f37697j0;
                    int i21 = ((i12 << 3) & 7168) | 54;
                    rVar.W(733328855);
                    E0.N c10 = AbstractC0434s.c(c4318j, z10, rVar);
                    rVar.W(-1323940314);
                    int i22 = rVar.P;
                    AbstractC1732q0 p11 = rVar.p();
                    C3288a i23 = androidx.compose.ui.layout.a.i(h10);
                    if (z11) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, c10, c0581j);
                        U3.f.n0(rVar, p11, c0581j2);
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i22))) {
                            AbstractC6463a.q(i22, rVar, i22, c0581j3);
                        }
                        AbstractC6463a.r(0, i23, new Z.L0(rVar), rVar, 2058660585);
                        Object obj = androidx.compose.foundation.layout.b.f24731a;
                        oVar2.invoke(obj, rVar, Integer.valueOf(((i21 >> 6) & 112) | 6));
                        rVar.t(false);
                        AbstractC6463a.u(rVar, true, false, false);
                        AbstractC4326r h11 = androidx.compose.ui.layout.a.h(c4323o2, "badge");
                        int i24 = ((i12 << 9) & 7168) | 6;
                        rVar.W(733328855);
                        E0.N c11 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
                        rVar.W(-1323940314);
                        int i25 = rVar.P;
                        AbstractC1732q0 p12 = rVar.p();
                        C3288a i26 = androidx.compose.ui.layout.a.i(h11);
                        if (z11) {
                            rVar.Z();
                            if (rVar.f22695O) {
                                rVar.o(c0582k);
                            } else {
                                rVar.k0();
                            }
                            U3.f.n0(rVar, c11, c0581j);
                            U3.f.n0(rVar, p12, c0581j2);
                            if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i25))) {
                                AbstractC6463a.q(i25, rVar, i25, c0581j3);
                            }
                            AbstractC6463a.r(0, i26, new Z.L0(rVar), rVar, 2058660585);
                            oVar.invoke(obj, rVar, Integer.valueOf(((i24 >> 6) & 112) | 6));
                            rVar.t(false);
                            AbstractC6463a.v(rVar, true, false, false, false);
                            rVar.t(true);
                            rVar.t(false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            AbstractC4326r abstractC4326r2 = c4323o;
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new G.E(oVar, abstractC4326r2, oVar2, i10, i11, 2);
                return;
            }
            return;
        }
        c4323o = abstractC4326r;
        if ((i11 & 4) == 0) {
        }
        if ((i12 & 147) != 146) {
        }
        C4323o c4323o22 = C4323o.f37719b;
        c4323o = c4323o;
        if (i16 != 0) {
        }
        rVar.W(-1648447067);
        K10 = rVar.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        AbstractC1706d0 abstractC1706d032 = (AbstractC1706d0) K10;
        w10 = AbstractC0044t0.w(rVar, false, -1648447001);
        if (w10 == iVar) {
        }
        AbstractC1706d0 abstractC1706d042 = (AbstractC1706d0) w10;
        w11 = AbstractC0044t0.w(rVar, false, -1648446782);
        if (w11 == iVar) {
        }
        AbstractC1706d0 abstractC1706d052 = (AbstractC1706d0) w11;
        w12 = AbstractC0044t0.w(rVar, false, -1648446685);
        if (w12 == iVar) {
        }
        AbstractC1706d0 abstractC1706d062 = (AbstractC1706d0) w12;
        w13 = AbstractC0044t0.w(rVar, false, -1648446239);
        if (w13 != iVar) {
        }
        rVar.t(z10);
        AbstractC4326r j62 = androidx.compose.ui.layout.a.j(c4323o, (wf.k) w13);
        rVar.W(-1648445701);
        K11 = rVar.K();
        if (K11 == iVar) {
        }
        E0.N n102 = (E0.N) K11;
        rVar.t(z10);
        rVar.W(-1323940314);
        int i172 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i182 = androidx.compose.ui.layout.a.i(j62);
        z11 = rVar.f22696a instanceof AbstractC1707e;
        if (!z11) {
        }
    }
}
