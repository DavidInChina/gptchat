package I9;

import A.AbstractC0044t0;
import Df.AbstractC0405d;
import Df.AbstractC0408g;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import W.E1;
import W.U2;
import Z.AbstractC1706d0;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.m1;
import android.content.Context;
import ca.C2311c;
import gd.AbstractC3256b;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p0.C5035b;
import r0.C5334A;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class d1 {
    static {
        Yg.o oVar = Yg.p.Companion;
        oVar.getClass();
        Yg.p pVar = new Yg.p(AbstractC6463a.n("instant(...)"));
        oVar.getClass();
        new C2311c("1", "1", pVar, new Yg.p(AbstractC6463a.n("instant(...)")), null, "Conversation Title 1", null, null, false, null, 16336);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x032d, code lost:
        if (id.AbstractC3557B.K(r8.K(), java.lang.Integer.valueOf(r4)) == false) goto L141;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Tc.f fVar, boolean z10, AbstractC4326r abstractC4326r, f1 f1Var, F f6, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        f1 f1Var2;
        F f10;
        Z.r rVar;
        F f11;
        f1 f1Var3;
        AbstractC4326r abstractC4326r3;
        int i13;
        io.sentry.hints.i iVar;
        C4323o c4323o;
        String str;
        F f12;
        f1 f1Var4;
        AbstractC4326r abstractC4326r4;
        boolean z11;
        Object K10;
        Object K11;
        AbstractC1707e abstractC1707e;
        f1 f1Var5;
        boolean z12;
        boolean z13;
        boolean z14;
        F f13;
        boolean z15;
        boolean z16;
        boolean z17;
        Class cls;
        AbstractC4326r abstractC4326r5;
        Ad.g y02;
        Ad.g y03;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        AbstractC3557B.c0("appState", fVar);
        C4323o c4323o2 = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("HistorySidebar");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(1002584381);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(fVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.h(z10)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        int i19 = i11 & 4;
        if (i19 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
            if ((i10 & 7168) != 0) {
                if ((i11 & 8) == 0) {
                    f1Var2 = f1Var;
                    if (rVar2.g(f1Var2)) {
                        i15 = 2048;
                        i12 |= i15;
                    }
                } else {
                    f1Var2 = f1Var;
                }
                i15 = 1024;
                i12 |= i15;
            } else {
                f1Var2 = f1Var;
            }
            if ((i10 & 57344) != 0) {
                f10 = f6;
                if ((i11 & 16) == 0 && rVar2.g(f10)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            } else {
                f10 = f6;
            }
            if ((i12 & 46811) != 9362 && rVar2.B()) {
                rVar2.P();
                f11 = f10;
                rVar = rVar2;
                abstractC4326r3 = abstractC4326r2;
                f1Var3 = f1Var2;
            } else {
                rVar2.R();
                i13 = i10 & 1;
                iVar = C1723m.f22654Y;
                if (i13 == 0 && !rVar2.A()) {
                    rVar2.P();
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    str = "HistorySidebar";
                    f12 = f10;
                    c4323o = c4323o2;
                    abstractC4326r4 = abstractC4326r2;
                    f1Var4 = f1Var2;
                } else {
                    if (i19 != 0) {
                        abstractC4326r2 = a5;
                    }
                    if ((i11 & 8) != 0) {
                        cls = Ad.v.class;
                        str = "HistorySidebar";
                        c4323o = c4323o2;
                        abstractC4326r5 = abstractC4326r2;
                    } else {
                        rVar2.W(-490350905);
                        Context context = (Context) rVar2.m(H0.Z.f6888b);
                        boolean booleanValue = ((Boolean) rVar2.m(H0.E0.f6720a)).booleanValue();
                        List list = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list2 = (List) rVar2.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a10 = m2.b.a(rVar2);
                        if (a10 != null) {
                            Ad.v vVar = (Ad.v) ld.g.f38286a.b(Ad.v.class);
                            abstractC4326r5 = abstractC4326r2;
                            kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
                            str = "HistorySidebar";
                            AbstractC0405d b10 = d10.b(f1.class);
                            c4323o = c4323o2;
                            AbstractC0405d b11 = d10.b(e1.class);
                            cls = Ad.v.class;
                            rVar2.W(608026872);
                            boolean g10 = rVar2.g(b10) | rVar2.g(b11) | rVar2.g(list) | rVar2.g(vVar) | rVar2.h(booleanValue);
                            Object K12 = rVar2.K();
                            if (g10 || K12 == iVar) {
                                if (booleanValue) {
                                    y03 = AbstractC4344b.z0(d10.b(e1.class), d10.b(f1.class), context, list2);
                                } else if (!booleanValue) {
                                    y03 = AbstractC4344b.y0(d10.b(f1.class), a10, vVar, list);
                                } else {
                                    throw new RuntimeException();
                                }
                                K12 = y03;
                                rVar2.h0(K12);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            i12 &= -7169;
                            f1Var2 = (f1) ((Ad.g) K12);
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    }
                    if ((i11 & 16) == 0) {
                        rVar2.W(-490350905);
                        Context context2 = (Context) rVar2.m(H0.Z.f6888b);
                        boolean booleanValue2 = ((Boolean) rVar2.m(H0.E0.f6720a)).booleanValue();
                        List list3 = (List) rVar2.m(AbstractC3256b.f31580a);
                        List list4 = (List) rVar2.m(Ad.k.f814a);
                        androidx.lifecycle.e0 a11 = m2.b.a(rVar2);
                        if (a11 != null) {
                            Ad.v vVar2 = (Ad.v) ld.g.f38286a.b(cls);
                            kotlin.jvm.internal.D d11 = kotlin.jvm.internal.C.f37623a;
                            AbstractC0405d b12 = d11.b(F.class);
                            AbstractC0405d b13 = d11.b(j1.class);
                            rVar2.W(608026872);
                            boolean g11 = rVar2.g(b12) | rVar2.g(b13) | rVar2.g(list3) | rVar2.g(vVar2) | rVar2.h(booleanValue2);
                            Object K13 = rVar2.K();
                            if (g11 || K13 == iVar) {
                                if (booleanValue2) {
                                    y02 = AbstractC4344b.z0(d11.b(j1.class), d11.b(F.class), context2, list4);
                                } else if (!booleanValue2) {
                                    y02 = AbstractC4344b.y0(d11.b(F.class), a11, vVar2, list3);
                                } else {
                                    throw new RuntimeException();
                                }
                                K13 = y02;
                                rVar2.h0(K13);
                            }
                            rVar2.t(false);
                            rVar2.t(false);
                            i12 &= -57345;
                            f12 = (F) ((Ad.g) K13);
                        } else {
                            throw new IllegalStateException("Unable to find ViewModelStoreOwner".toString());
                        }
                    } else {
                        f12 = f6;
                    }
                    f1Var4 = f1Var2;
                    abstractC4326r4 = abstractC4326r5;
                }
                rVar2.u();
                rVar2.W(336899002);
                if ((((i12 & 7168) ^ 3072) <= 2048 && rVar2.g(f1Var4)) || (i12 & 3072) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                K10 = rVar2.K();
                if (!z11 || K10 == iVar) {
                    K10 = new R0(2, f1Var4);
                    rVar2.h0(K10);
                }
                AbstractC0408g abstractC0408g = K10;
                rVar2.t(false);
                AbstractC1734s.e(f1Var4, new Z0(f1Var4, fVar, null), rVar2);
                e1 e1Var = (e1) AbstractC4828h.z(f1Var4.f808e, rVar2).getValue();
                rVar2.W(336899347);
                K11 = rVar2.K();
                if (K11 == iVar) {
                    K11 = Df.H.h0(0.0f);
                    rVar2.h0(K11);
                }
                AbstractC1706d0 abstractC1706d0 = (AbstractC1706d0) K11;
                rVar2.t(false);
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                rVar2.W(-1323940314);
                int i20 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i21 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                abstractC1707e = rVar2.f22696a;
                if (!(abstractC1707e instanceof AbstractC1707e)) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    C0581j c0581j = C0583l.f5808f;
                    U3.f.n0(rVar2, c10, c0581j);
                    C0581j c0581j2 = C0583l.f5807e;
                    U3.f.n0(rVar2, p10, c0581j2);
                    C0581j c0581j3 = C0583l.f5809g;
                    AbstractC4326r abstractC4326r6 = abstractC4326r4;
                    if (!rVar2.f22695O) {
                        f1Var5 = f1Var4;
                    } else {
                        f1Var5 = f1Var4;
                    }
                    AbstractC6463a.q(i20, rVar2, i20, c0581j3);
                    AbstractC6463a.r(0, i21, new Z.L0(rVar2), rVar2, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                    rVar2.W(-483455358);
                    E0.N a12 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
                    rVar2.W(-1323940314);
                    int i22 = rVar2.P;
                    AbstractC1732q0 p11 = rVar2.p();
                    C3288a i23 = androidx.compose.ui.layout.a.i(c4323o);
                    if (abstractC1707e instanceof AbstractC1707e) {
                        rVar2.Z();
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, a12, c0581j);
                        U3.f.n0(rVar2, p11, c0581j2);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i22))) {
                            AbstractC6463a.q(i22, rVar2, i22, c0581j3);
                        }
                        AbstractC6463a.r(0, i23, new Z.L0(rVar2), rVar2, 2058660585);
                        E.A a13 = E.A.f3733a;
                        AbstractC4326r a14 = io.sentry.compose.b.a(str);
                        C4323o c4323o3 = c4323o;
                        AbstractC4326r b14 = androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.a.r(c4323o3, p9.r.f42840d), K.f.f9317a);
                        rVar2.W(-422138195);
                        boolean g12 = rVar2.g(abstractC0408g);
                        Object K14 = rVar2.K();
                        if (g12 || K14 == iVar) {
                            z12 = false;
                            K14 = AbstractC6463a.g(abstractC0408g, 0, rVar2);
                        } else {
                            z12 = false;
                        }
                        rVar2.t(z12);
                        E1.a(AbstractC0763j.f8370a, AbstractC4194d.a((G0.X) a14, androidx.compose.foundation.a.h(b14, (AbstractC6216a) K14)), null, null, AbstractC0763j.f8371b, null, null, U2.f19717a, 0.0f, rVar2, 24582, 364);
                        Boolean valueOf = Boolean.valueOf(z10);
                        rVar2.W(-422138020);
                        int i24 = (i12 & 57344) ^ 24576;
                        if ((i24 > 16384 && rVar2.g(f12)) || (i12 & 24576) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if ((i12 & 112) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean z18 = z14 | z13;
                        Object K15 = rVar2.K();
                        if (!z18 && K15 != iVar) {
                            f13 = null;
                        } else {
                            f13 = null;
                            K15 = new b1(f12, z10, null);
                            rVar2.h0(K15);
                        }
                        rVar2.t(false);
                        AbstractC1734s.e(valueOf, (wf.n) K15, rVar2);
                        int i25 = i12 & 14;
                        K8.d.x(fVar, f13, rVar2, 8 | i25, 2);
                        j1 j1Var = (j1) AbstractC4828h.z(f12.f808e, rVar2).getValue();
                        rVar2.W(-422137669);
                        if ((i24 > 16384 && rVar2.g(f12)) || (i12 & 24576) == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        Object K16 = rVar2.K();
                        if (z15 || K16 == iVar) {
                            K16 = new R0(1, f12);
                            rVar2.h0(K16);
                        }
                        rVar2.t(false);
                        Z.S0 s02 = (Z.S0) abstractC1706d0;
                        rVar = rVar2;
                        L4.a.k(fVar, j1Var, (wf.k) ((AbstractC0408g) K16), androidx.compose.ui.graphics.a.m(AbstractC0044t0.P(a13, c4323o3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 126975), true, s02.h(), rVar2, 24584 | i25, 0);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                        rVar.W(336900942);
                        if (e1Var.f8336a != null) {
                            m1 m1Var = W.R0.f19593a;
                            C5334A c11 = C5035b.c(AbstractC4344b.G0(new r0.r(r0.r.b(((W.P0) rVar.m(m1Var)).f19532p, 0.93f)), new r0.r(((W.P0) rVar.m(m1Var)).f19532p)));
                            rVar.W(1782761760);
                            boolean g13 = rVar.g(abstractC0408g);
                            Object K17 = rVar.K();
                            if (!g13 && K17 != iVar) {
                                z17 = false;
                            } else {
                                z17 = false;
                                K17 = new c1(abstractC0408g, 0);
                                rVar.h0(K17);
                            }
                            wf.k kVar = (wf.k) K17;
                            rVar.t(z17);
                            AbstractC4326r c12 = androidx.compose.foundation.a.c(bVar.a(androidx.compose.foundation.layout.e.d(c4323o3, 1.0f), C4310b.f37699l0), c11);
                            rVar.W(1782762020);
                            boolean g14 = rVar.g(bVar2);
                            Object K18 = rVar.K();
                            if (g14 || K18 == iVar) {
                                K18 = new s3.r(s02, 19, bVar2);
                                rVar.h0(K18);
                            }
                            rVar.t(false);
                            AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(androidx.compose.ui.layout.a.j(c12, (wf.k) K18), p9.r.f42841e);
                            rVar.W(1782762174);
                            boolean g15 = rVar.g(abstractC0408g);
                            Object K19 = rVar.K();
                            if (g15 || K19 == iVar) {
                                K19 = AbstractC6463a.g(abstractC0408g, 1, rVar);
                            }
                            rVar.t(false);
                            z16 = true;
                            Bi.c.a(e1Var.f8336a, kVar, r10, (AbstractC6216a) K19, true, true, rVar, 221184, 0);
                        } else {
                            z16 = true;
                        }
                        AbstractC6463a.v(rVar, false, false, z16, false);
                        rVar.t(false);
                        f11 = f12;
                        abstractC4326r3 = abstractC4326r6;
                        f1Var3 = f1Var5;
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
                v10.f22739d = new p9.t(fVar, z10, abstractC4326r3, f1Var3, f11, i10, i11);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i10 & 7168) != 0) {
        }
        if ((i10 & 57344) != 0) {
        }
        if ((i12 & 46811) != 9362) {
        }
        rVar2.R();
        i13 = i10 & 1;
        iVar = C1723m.f22654Y;
        if (i13 == 0) {
        }
        if (i19 != 0) {
        }
        if ((i11 & 8) != 0) {
        }
        if ((i11 & 16) == 0) {
        }
        f1Var4 = f1Var2;
        abstractC4326r4 = abstractC4326r5;
        rVar2.u();
        rVar2.W(336899002);
        if (((i12 & 7168) ^ 3072) <= 2048) {
        }
        z11 = false;
        K10 = rVar2.K();
        if (!z11) {
        }
        K10 = new R0(2, f1Var4);
        rVar2.h0(K10);
        AbstractC0408g abstractC0408g2 = K10;
        rVar2.t(false);
        AbstractC1734s.e(f1Var4, new Z0(f1Var4, fVar, null), rVar2);
        e1 e1Var2 = (e1) AbstractC4828h.z(f1Var4.f808e, rVar2).getValue();
        rVar2.W(336899347);
        K11 = rVar2.K();
        if (K11 == iVar) {
        }
        AbstractC1706d0 abstractC1706d02 = (AbstractC1706d0) K11;
        rVar2.t(false);
        rVar2.W(733328855);
        E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i202 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i212 = androidx.compose.ui.layout.a.i(abstractC4326r4);
        abstractC1707e = rVar2.f22696a;
        if (!(abstractC1707e instanceof AbstractC1707e)) {
        }
    }
}
