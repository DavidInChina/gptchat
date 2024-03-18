package ub;

import A.AbstractC0044t0;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0426j;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Ng.F;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.o1;
import aa.C1939b;
import android.gov.nist.core.Separators;
import ca.AbstractC2318j;
import ca.C2317i;
import ca.C2324p;
import ca.C2325q;
import ca.C2326r;
import ca.C2328t;
import ca.C2329u;
import ca.C2330v;
import ca.C2331w;
import ca.EnumC2323o;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import fa.AbstractC2965B;
import fa.C2973b;
import fa.EnumC2970G;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4323o;
import nf.AbstractC4828h;
import wd.C6190g0;
import x8.W;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class s {
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC2318j abstractC2318j, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        C2317i c2317i;
        boolean z10;
        N n10;
        fa.n nVar;
        String str;
        int i13;
        int i14;
        int i15;
        AbstractC4326r a5 = io.sentry.compose.b.a("ConversationItemTool");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(712918073);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC2318j)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i16 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                String str2 = null;
                if (!(abstractC2318j instanceof C2317i)) {
                    c2317i = (C2317i) abstractC2318j;
                } else {
                    c2317i = null;
                }
                if (c2317i != null) {
                    C1741v0 v10 = rVar.v();
                    if (v10 != null) {
                        v10.f22739d = new o(abstractC2318j, kVar, abstractC4326r4, i10, i11, 1);
                        return;
                    }
                    return;
                }
                boolean z11 = true;
                if (L4.a.M0(ExperimentKey.AdaV2Enabled.INSTANCE, rVar)) {
                    String str3 = c2317i.c().f30023p;
                    C6190g0.Companion.getClass();
                    if (AbstractC3557B.K(str3, "gpt-4-ada-v2")) {
                        z10 = true;
                        n10 = c2317i.f26395d;
                        if (!(n10 instanceof C2324p)) {
                            rVar.W(1404999602);
                            W.b(c2317i, abstractC4326r4, rVar, (i12 >> 3) & 112, 0);
                            rVar.t(false);
                        } else if (n10 instanceof C2326r) {
                            rVar.W(1404999779);
                            K8.d.n(c2317i, kVar, abstractC4326r4, rVar, (i12 & 112) | (i12 & 896), 0);
                            rVar.t(false);
                        } else {
                            boolean z12 = n10 instanceof C2329u;
                            EnumC2323o enumC2323o = c2317i.f26392a;
                            if (z12) {
                                rVar.W(1405000035);
                                EnumC2970G enumC2970G = EnumC2970G.f30035Z;
                                if (!enumC2323o.a() && z10) {
                                    AbstractC2965B abstractC2965B = ((C2317i) abstractC2318j).c().f30015h;
                                    if (abstractC2965B instanceof fa.n) {
                                        nVar = (fa.n) abstractC2965B;
                                    } else {
                                        nVar = null;
                                    }
                                    if (nVar != null && (str = nVar.f30070b) != null) {
                                        str2 = (String) Kg.m.j1(Kg.m.o1(kf.t.V1(kf.t.Z1(kf.t.y2(Lg.n.G2(str, new String[]{Separators.RETURN, "\r"})), 1)), r.f46587Z));
                                    }
                                }
                                A7.b.z(enumC2970G, enumC2323o, abstractC4326r4, str2, rVar, (i12 & 896) | 6, 0);
                                rVar.t(false);
                            } else if (n10 instanceof C2330v) {
                                rVar.W(1405001113);
                                A7.b.z(EnumC2970G.f30035Z, c2317i.f26392a, abstractC4326r4, null, rVar, (i12 & 896) | 6, 8);
                                rVar.t(false);
                            } else if (n10 instanceof C2331w) {
                                rVar.W(1405001300);
                                Ad.l.A(enumC2323o, abstractC4326r4, rVar, (i12 >> 3) & 112, 0);
                                rVar.t(false);
                            } else if (n10 instanceof C2328t) {
                                rVar.W(1405001431);
                                A7.b.z(((C2328t) n10).f26419g, c2317i.f26392a, abstractC4326r4, null, rVar, i12 & 896, 8);
                                rVar.t(false);
                            } else if (n10 instanceof C2325q) {
                                rVar.W(1405001685);
                                C1939b c1939b = ((C2325q) n10).f26412g;
                                rVar.W(1405001904);
                                int i17 = i12 & 112;
                                if (i17 != 32) {
                                    z11 = false;
                                }
                                Object K10 = rVar.K();
                                if (z11 || K10 == C1723m.f22654Y) {
                                    K10 = AbstractC0044t0.v(5, kVar, rVar);
                                }
                                rVar.t(false);
                                k.b(c1939b, kVar, abstractC4326r4, (wf.k) K10, rVar, i17 | (i12 & 896), 0);
                                rVar.t(false);
                            } else {
                                rVar.W(1405002016);
                                rVar.t(false);
                            }
                        }
                        abstractC4326r3 = abstractC4326r4;
                    }
                }
                z10 = false;
                n10 = c2317i.f26395d;
                if (!(n10 instanceof C2324p)) {
                }
                abstractC4326r3 = abstractC4326r4;
            }
            C1741v0 v11 = rVar.v();
            if (v11 != null) {
                v11.f22739d = new o(abstractC2318j, kVar, abstractC4326r3, i10, i11, 0);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        String str22 = null;
        if (!(abstractC2318j instanceof C2317i)) {
        }
        if (c2317i != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C2317i c2317i, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        Object K10;
        io.sentry.hints.i iVar;
        Object K11;
        AbstractC2965B abstractC2965B;
        int i13;
        int i14;
        int i15;
        AbstractC4326r a5 = io.sentry.compose.b.a("DelayedToolItemContent");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1343744661);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c2317i)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.i(kVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            if ((i12 & 731) != 146 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i16 == 0) {
                    a5 = abstractC4326r2;
                }
                rVar.W(-1290672159);
                K10 = rVar.K();
                iVar = C1723m.f22654Y;
                if (K10 == iVar) {
                    K10 = AbstractC4828h.Z(d(c2317i), o1.f22665a);
                    rVar.h0(K10);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                rVar.t(false);
                rVar.W(773894976);
                rVar.W(-492369756);
                K11 = rVar.K();
                if (K11 == iVar) {
                    K11 = new Z.C(AbstractC1734s.k(rVar));
                    rVar.h0(K11);
                }
                rVar.t(false);
                F f6 = ((Z.C) K11).f22442Y;
                rVar.t(false);
                n d10 = d(c2317i);
                q qVar = new q(f6, c2317i, abstractC1710f0, null);
                C2973b c2973b = AbstractC2965B.Companion;
                AbstractC1734s.e(d10, qVar, rVar);
                String str = c2317i.c().f30009b;
                String str2 = c2317i.c().f30008a;
                abstractC2965B = ((n) abstractC1710f0.getValue()).f46573b;
                if (abstractC2965B == null) {
                    abstractC2965B = new fa.n("");
                }
                int i17 = i12 << 6;
                gb.D.e(str, str2, abstractC2965B, kVar, a5, ((n) abstractC1710f0.getValue()).f46572a, rVar, (i17 & 7168) | (i17 & 57344), 0);
                abstractC4326r3 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new l(c2317i, kVar, abstractC4326r3, i10, i11, 1);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        rVar.W(-1290672159);
        K10 = rVar.K();
        iVar = C1723m.f22654Y;
        if (K10 == iVar) {
        }
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K10;
        rVar.t(false);
        rVar.W(773894976);
        rVar.W(-492369756);
        K11 = rVar.K();
        if (K11 == iVar) {
        }
        rVar.t(false);
        F f62 = ((Z.C) K11).f22442Y;
        rVar.t(false);
        n d102 = d(c2317i);
        q qVar2 = new q(f62, c2317i, abstractC1710f02, null);
        C2973b c2973b2 = AbstractC2965B.Companion;
        AbstractC1734s.e(d102, qVar2, rVar);
        String str3 = c2317i.c().f30009b;
        String str22 = c2317i.c().f30008a;
        abstractC2965B = ((n) abstractC1710f02.getValue()).f46573b;
        if (abstractC2965B == null) {
        }
        int i172 = i12 << 6;
        gb.D.e(str3, str22, abstractC2965B, kVar, a5, ((n) abstractC1710f02.getValue()).f46572a, rVar, (i172 & 7168) | (i172 & 57344), 0);
        abstractC4326r3 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(C2317i c2317i, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        AbstractC4326r abstractC4326r3;
        Z.r rVar;
        boolean z10;
        boolean z11;
        boolean z12;
        int i15;
        int i16;
        AbstractC3557B.c0("toolItem", c2317i);
        AbstractC3557B.c0("onIntent", kVar);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("ToolItemContentContainer");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(153995036);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(c2317i)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.i(kVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
            i14 = i12;
            if ((i14 & 731) != 146 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i17 == 0) {
                    abstractC4326r3 = a5;
                } else {
                    abstractC4326r3 = abstractC4326r2;
                }
                rVar2.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
                rVar2.W(-1323940314);
                int i18 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i19 = androidx.compose.ui.layout.a.i(abstractC4326r3);
                z10 = rVar2.f22696a instanceof AbstractC1707e;
                if (!z10) {
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
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i18))) {
                        AbstractC6463a.q(i18, rVar2, i18, c0581j3);
                    }
                    AbstractC6463a.r(0, i19, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("ToolItemContentContainer");
                    N n10 = c2317i.f26395d;
                    if ((n10 instanceof C2324p) || (n10 instanceof C2328t) || (n10 instanceof C2331w) || (n10 instanceof C2330v) || (n10 instanceof C2329u)) {
                        rVar2.W(1830340486);
                        int i20 = (i14 & 14) | (i14 & 112);
                        b(c2317i, kVar, a10, rVar2, i20, 4);
                        a(c2317i, kVar, a10, rVar2, i20, 4);
                        rVar2.t(false);
                    } else {
                        boolean z13 = n10 instanceof C2325q;
                        C4316h c4316h = C4310b.f37705r0;
                        if (z13) {
                            rVar2.W(1830340840);
                            C0426j c0426j = new C0426j(p9.r.f42840d, false, null);
                            rVar2.W(-483455358);
                            E0.N a11 = AbstractC0440y.a(c0426j, c4316h, rVar2);
                            rVar2.W(-1323940314);
                            int i21 = rVar2.P;
                            AbstractC1732q0 p11 = rVar2.p();
                            C3288a i22 = androidx.compose.ui.layout.a.i(c4323o);
                            if (z10) {
                                rVar2.Z();
                                if (rVar2.f22695O) {
                                    rVar2.o(c0582k);
                                } else {
                                    rVar2.k0();
                                }
                                U3.f.n0(rVar2, a11, c0581j);
                                U3.f.n0(rVar2, p11, c0581j2);
                                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i21))) {
                                    AbstractC6463a.q(i21, rVar2, i21, c0581j3);
                                }
                                AbstractC6463a.r(0, i22, new L0(rVar2), rVar2, 2058660585);
                                AbstractC4326r a12 = io.sentry.compose.b.a("ToolItemContentContainer");
                                int i23 = (i14 & 14) | (i14 & 112);
                                a(c2317i, kVar, a12, rVar2, i23, 4);
                                rVar2.W(1830341137);
                                if (c2317i.f26394c != null) {
                                    b(c2317i, kVar, a12, rVar2, i23, 4);
                                }
                                AbstractC6463a.v(rVar2, false, false, true, false);
                                rVar2.t(false);
                                rVar2.t(false);
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            if (n10 instanceof C2326r) {
                                rVar2.W(1830341460);
                                fa.q qVar = ((C2326r) n10).f26415i;
                                if (qVar == null) {
                                    rVar = rVar2;
                                    z12 = false;
                                    z11 = true;
                                } else {
                                    C0426j c0426j2 = new C0426j(p9.r.f42840d, false, null);
                                    rVar2.W(-483455358);
                                    E0.N a13 = AbstractC0440y.a(c0426j2, c4316h, rVar2);
                                    rVar2.W(-1323940314);
                                    int i24 = rVar2.P;
                                    AbstractC1732q0 p12 = rVar2.p();
                                    C3288a i25 = androidx.compose.ui.layout.a.i(c4323o);
                                    if (z10) {
                                        rVar2.Z();
                                        if (rVar2.f22695O) {
                                            rVar2.o(c0582k);
                                        } else {
                                            rVar2.k0();
                                        }
                                        U3.f.n0(rVar2, a13, c0581j);
                                        U3.f.n0(rVar2, p12, c0581j2);
                                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i24))) {
                                            AbstractC6463a.q(i24, rVar2, i24, c0581j3);
                                        }
                                        AbstractC6463a.r(0, i25, new L0(rVar2), rVar2, 2058660585);
                                        AbstractC4326r a14 = io.sentry.compose.b.a("ToolItemContentContainer");
                                        a(c2317i, kVar, a14, rVar2, (i14 & 14) | (i14 & 112), 4);
                                        z12 = false;
                                        rVar = rVar2;
                                        z11 = true;
                                        gb.D.i(c2317i.c().f30009b, c2317i.c().f30008a, qVar, kVar, a14, !c2317i.c().f30017j, rVar2, (i14 << 6) & 7168, 16);
                                        AbstractC6463a.v(rVar, false, true, false, false);
                                    } else {
                                        R4.b.r1();
                                        throw null;
                                    }
                                }
                                rVar.t(z12);
                            } else {
                                rVar = rVar2;
                                z12 = false;
                                z11 = true;
                                rVar.W(1830342166);
                                rVar.t(false);
                            }
                            AbstractC6463a.v(rVar, z12, z11, z12, z12);
                        }
                    }
                    rVar = rVar2;
                    z12 = false;
                    z11 = true;
                    AbstractC6463a.v(rVar, z12, z11, z12, z12);
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new l(c2317i, kVar, abstractC4326r3, i10, i11, 2);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        i14 = i12;
        if ((i14 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        rVar2.W(733328855);
        E0.N c102 = AbstractC0434s.c(C4310b.f37693Y, false, rVar2);
        rVar2.W(-1323940314);
        int i182 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i192 = androidx.compose.ui.layout.a.i(abstractC4326r3);
        z10 = rVar2.f22696a instanceof AbstractC1707e;
        if (!z10) {
        }
    }

    public static final n d(C2317i c2317i) {
        boolean z10 = true;
        if (c2317i.f26392a.a() && !(!c2317i.c().f30017j)) {
            z10 = false;
        }
        return new n(z10, c2317i.f26394c);
    }
}
