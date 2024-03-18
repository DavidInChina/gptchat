package Q8;

import H0.AbstractC0701r0;
import H0.W0;
import K4.J;
import N0.C1044c;
import R8.A;
import R8.C1249b;
import R8.C1250c;
import R8.C1253f;
import R8.D;
import R8.E;
import R8.F;
import R8.G;
import R8.u;
import R8.v;
import R8.z;
import S8.AbstractC1362f;
import S8.AbstractC1366j;
import S8.AbstractC1377v;
import S8.C;
import S8.M;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1737t0;
import Z.C1741v0;
import Z.O;
import Z.r;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import kf.AbstractC4268D;
import mi.AbstractC4689a;
import nf.AbstractC4828h;
import q.C5241w;
import wi.s;
import y.C6477o;
import y.P;
import y.U;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final O f14515a = A7.b.o0(f.f14494Y);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2, types: [G6.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(M m10, String str, n nVar, wf.k kVar, wf.p pVar, wf.p pVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        n nVar2;
        int i13;
        wf.k kVar2;
        int i14;
        wf.p pVar3;
        int i15;
        wf.p pVar4;
        wf.p pVar5;
        boolean g10;
        Object K10;
        s sVar;
        n nVar3;
        wf.k kVar3;
        wf.p pVar6;
        C1741v0 v10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("content", str);
        r rVar = (r) abstractC1725n;
        rVar.X(1903312120);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.g(str)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            nVar2 = nVar;
            if (rVar.g(nVar2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                kVar2 = kVar;
                if (rVar.i(kVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i12 |= i18;
                i14 = i11 & 8;
                if (i14 != 0) {
                    i12 |= 24576;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i10 & 57344) == 0) {
                        if (rVar.i(pVar3)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    i12 |= 196608;
                    pVar4 = pVar2;
                } else {
                    pVar4 = pVar2;
                    if ((i10 & 458752) == 0) {
                        if (rVar.i(pVar4)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                }
                if ((i12 & 374491) != 74898 && rVar.B()) {
                    rVar.P();
                    pVar6 = pVar4;
                    nVar3 = nVar2;
                    kVar3 = kVar2;
                } else {
                    if (i22 != 0) {
                        nVar2 = n.f14516a;
                    }
                    if (i13 != 0) {
                        kVar2 = null;
                    }
                    if (i14 != 0) {
                        pVar3 = null;
                    }
                    if (i15 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar4;
                    }
                    int i23 = i12 >> 3;
                    AbstractC3557B.c0("options", nVar2);
                    rVar.W(-773016333);
                    rVar.W(1157296644);
                    g10 = rVar.g(nVar2);
                    K10 = rVar.K();
                    if (!g10 || K10 == C1723m.f22654Y) {
                        C5241w c5241w = new C5241w(5);
                        Object obj = new Object();
                        ?? obj2 = new Object();
                        obj2.f6064Y = false;
                        c5241w.g(kf.q.h3(new AbstractC4689a[]{obj, new pi.b(obj2), new Object()}));
                        K10 = new xi.c(c5241w);
                        rVar.h0(K10);
                    }
                    rVar.t(false);
                    xi.c cVar = (xi.c) K10;
                    sVar = (s) AbstractC4828h.c0(null, str, cVar, new b(cVar, str, null), rVar).getValue();
                    rVar.t(false);
                    if (sVar != null) {
                        b(m10, sVar, kVar2, pVar3, pVar5, rVar, (i12 & 14) | 64 | (i23 & 896) | (i23 & 7168) | (i23 & 57344), 0);
                    }
                    nVar3 = nVar2;
                    kVar3 = kVar2;
                    pVar6 = pVar5;
                }
                wf.p pVar7 = pVar3;
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new C6477o(m10, str, nVar3, kVar3, pVar7, pVar6, i10, i11);
                    return;
                }
                return;
            }
            kVar2 = kVar;
            i14 = i11 & 8;
            if (i14 != 0) {
            }
            i15 = i11 & 16;
            if (i15 != 0) {
            }
            if ((i12 & 374491) != 74898) {
            }
            if (i22 != 0) {
            }
            if (i13 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            int i232 = i12 >> 3;
            AbstractC3557B.c0("options", nVar2);
            rVar.W(-773016333);
            rVar.W(1157296644);
            g10 = rVar.g(nVar2);
            K10 = rVar.K();
            if (!g10) {
            }
            C5241w c5241w2 = new C5241w(5);
            Object obj3 = new Object();
            ?? obj22 = new Object();
            obj22.f6064Y = false;
            c5241w2.g(kf.q.h3(new AbstractC4689a[]{obj3, new pi.b(obj22), new Object()}));
            K10 = new xi.c(c5241w2);
            rVar.h0(K10);
            rVar.t(false);
            xi.c cVar2 = (xi.c) K10;
            sVar = (s) AbstractC4828h.c0(null, str, cVar2, new b(cVar2, str, null), rVar).getValue();
            rVar.t(false);
            if (sVar != null) {
            }
            nVar3 = nVar2;
            kVar3 = kVar2;
            pVar6 = pVar5;
            wf.p pVar72 = pVar3;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        kVar2 = kVar;
        i14 = i11 & 8;
        if (i14 != 0) {
        }
        i15 = i11 & 16;
        if (i15 != 0) {
        }
        if ((i12 & 374491) != 74898) {
        }
        if (i22 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        int i2322 = i12 >> 3;
        AbstractC3557B.c0("options", nVar2);
        rVar.W(-773016333);
        rVar.W(1157296644);
        g10 = rVar.g(nVar2);
        K10 = rVar.K();
        if (!g10) {
        }
        C5241w c5241w22 = new C5241w(5);
        Object obj32 = new Object();
        ?? obj222 = new Object();
        obj222.f6064Y = false;
        c5241w22.g(kf.q.h3(new AbstractC4689a[]{obj32, new pi.b(obj222), new Object()}));
        K10 = new xi.c(c5241w22);
        rVar.h0(K10);
        rVar.t(false);
        xi.c cVar22 = (xi.c) K10;
        sVar = (s) AbstractC4828h.c0(null, str, cVar22, new b(cVar22, str, null), rVar).getValue();
        rVar.t(false);
        if (sVar != null) {
        }
        nVar3 = nVar2;
        kVar3 = kVar2;
        pVar6 = pVar5;
        wf.p pVar722 = pVar3;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }

    public static final void b(M m10, s sVar, wf.k kVar, wf.p pVar, wf.p pVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        wf.k kVar2;
        wf.p pVar3;
        wf.p pVar4;
        AbstractC3557B.c0("<this>", m10);
        AbstractC3557B.c0("content", sVar);
        r rVar = (r) abstractC1725n;
        rVar.X(-972241189);
        if ((i11 & 2) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 4) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar;
        }
        if ((i11 & 8) != 0) {
            pVar4 = null;
        } else {
            pVar4 = pVar2;
        }
        wf.k kVar3 = (wf.k) AbstractC4828h.g0(kVar2, rVar).getValue();
        rVar.W(-923607174);
        if (kVar3 == null) {
            W0 w02 = (W0) rVar.m(AbstractC0701r0.f7012o);
            rVar.W(-492369756);
            Object K10 = rVar.K();
            if (K10 == C1723m.f22654Y) {
                K10 = new g(w02, 0);
                rVar.h0(K10);
            }
            rVar.t(false);
            kVar3 = (wf.k) K10;
        }
        rVar.t(false);
        A7.b.l(new C1737t0[]{f14515a.b(kVar3)}, R4.b.X(rVar, 1674447387, new U(m10, sVar, pVar3, pVar4, 2)), rVar, 56);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new P(m10, sVar, kVar2, pVar3, pVar4, i10, i11, 6);
        }
    }

    public static final void c(M m10, R8.s sVar, wf.p pVar, wf.p pVar2, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Boolean bool;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("<this>", m10);
        r rVar = (r) abstractC1725n;
        rVar.X(-1808164390);
        if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(sVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 7168) == 0) {
            if (rVar.i(pVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 5851) == 1170 && rVar.B()) {
            rVar.P();
        } else if (sVar == null) {
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new h(m10, sVar, pVar, pVar2, i10, 1);
                return;
            }
            return;
        } else {
            if (pVar == null) {
                bool = null;
            } else {
                bool = (Boolean) pVar.h(sVar, R4.b.X(rVar, -363068240, new i(m10, pVar, pVar2, 0)), rVar, Integer.valueOf(((i11 >> 3) & 14) | 48 | (i11 & 896)));
            }
            if (AbstractC3557B.K(bool, Boolean.TRUE)) {
                C1741v0 v11 = rVar.v();
                if (v11 != null) {
                    v11.f22739d = new h(m10, sVar, pVar, pVar2, i10, 2);
                    return;
                }
                return;
            }
            U3.f fVar = sVar.f15164a;
            if (fVar instanceof C1253f) {
                rVar.W(972248334);
                d(m10, sVar, pVar, pVar2, rVar, (i11 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168));
                rVar.t(false);
            } else if (fVar instanceof C1249b) {
                rVar.W(972248428);
                AbstractC1362f.a(m10, R4.b.X(rVar, -56154942, new i(sVar, pVar, pVar2, 1)), rVar, (i11 & 14) | 48);
                rVar.t(false);
            } else if (fVar instanceof C1250c) {
                rVar.W(972248559);
                AbstractC1377v.a(m10, C.f16212Z, Kg.m.p1(K8.d.B0(sVar, d.f14479h0)), R4.b.X(rVar, -698632096, new j(pVar, pVar2, 0)), rVar, (i11 & 14) | 3632);
                rVar.t(false);
            } else if (fVar instanceof u) {
                rVar.W(972248795);
                AbstractC1377v.a(m10, C.f16211Y, Kg.m.p1(K8.d.t0(sVar, false)), R4.b.X(rVar, 248534847, new j(pVar, pVar2, 1)), rVar, (i11 & 14) | 3632);
                rVar.t(false);
            } else if (fVar instanceof G) {
                rVar.W(972249040);
                Bi.c.i(m10, rVar, i11 & 14);
                rVar.t(false);
            } else if (fVar instanceof R8.j) {
                rVar.W(972249093);
                J.b(m10, ((R8.j) fVar).f15152g, R4.b.X(rVar, 2053015838, new k(sVar, pVar2, 0)), rVar, (i11 & 14) | 384);
                rVar.t(false);
            } else if (fVar instanceof R8.n) {
                rVar.W(972249275);
                AbstractC1366j.b(m10, Lg.n.U2(((R8.n) fVar).f15157g).toString(), null, rVar, i11 & 14, 2);
                rVar.t(false);
            } else if (fVar instanceof R8.h) {
                rVar.W(972249364);
                AbstractC1366j.b(m10, Lg.n.U2(((R8.h) fVar).f15150k).toString(), null, rVar, i11 & 14, 2);
                rVar.t(false);
            } else if (fVar instanceof R8.k) {
                rVar.W(972249447);
                U8.e eVar = new U8.e();
                U8.e.a(eVar, new U8.a(null, R4.b.X(rVar, 2040570114, new l(fVar, 0)), 3));
                Ad.l.w(m10, new U8.p(eVar.f17523a.i(), AbstractC4268D.l1(eVar.f17524b)), null, null, false, 0, 0, rVar, i11 & 14, 62);
                rVar.t(false);
            } else if (fVar instanceof R8.q) {
                rVar.W(972249643);
                rVar.t(false);
            } else if (fVar instanceof v) {
                rVar.W(972249721);
                Ad.l.q(m10, sVar, pVar2, null, rVar, (i11 & 14) | (i11 & 112) | ((i11 >> 3) & 896), 4);
                rVar.t(false);
            } else if (fVar instanceof D) {
                rVar.W(972249808);
                K8.d.R(m10, sVar, pVar2, rVar, ((i11 >> 3) & 896) | (i11 & 14) | (i11 & 112));
                rVar.t(false);
            } else if (fVar instanceof F) {
                rVar.W(972250109);
                System.out.println((Object) "Unexpected raw text while traversing the Abstract Syntax Tree.");
                C1044c c1044c = new C1044c(16);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str = ((F) fVar).f15139g;
                AbstractC3557B.c0(ParameterNames.TEXT, str);
                c1044c.c(str);
                Ad.l.w(m10, new U8.p(c1044c.i(), AbstractC4268D.l1(linkedHashMap)), null, null, false, 0, 0, rVar, i11 & 14, 62);
                rVar.t(false);
            } else if (fVar instanceof R8.r) {
                rVar.W(972250351);
                rVar.t(false);
                System.out.println((Object) "MarkdownRichText: Unexpected AstListItem while traversing the Abstract Syntax Tree.");
            } else if (fVar instanceof R8.o) {
                rVar.W(972250489);
                rVar.t(false);
                System.out.println((Object) ("MarkdownRichText: Unexpected AstInlineNodeType " + fVar + " while traversing the Abstract Syntax Tree."));
            } else if (AbstractC3557B.K(fVar, z.f15177g) || AbstractC3557B.K(fVar, R8.C.f15136g) || AbstractC3557B.K(fVar, E.f15138g) || (fVar instanceof A)) {
                rVar.W(972250712);
                rVar.t(false);
                System.out.println((Object) "MarkdownRichText: Unexpected Table node while traversing the Abstract Syntax Tree.");
            } else {
                rVar.W(972241753);
                rVar.t(false);
                throw new RuntimeException();
            }
        }
        C1741v0 v12 = rVar.v();
        if (v12 != null) {
            v12.f22739d = new h(m10, sVar, pVar, pVar2, i10, 0);
        }
    }

    public static final void d(M m10, R8.s sVar, wf.p pVar, wf.p pVar2, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Kg.k<R8.s> kVar;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("<this>", m10);
        r rVar = (r) abstractC1725n;
        rVar.X(2056925309);
        if ((i10 & 14) == 0) {
            if (rVar.g(m10)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.g(sVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 7168) == 0) {
            if (rVar.i(pVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 5851) == 1170 && rVar.B()) {
            rVar.P();
        } else {
            if (sVar != null) {
                kVar = K8.d.t0(sVar, false);
            } else {
                kVar = null;
            }
            if (kVar != null) {
                for (R8.s sVar2 : kVar) {
                    c(m10, sVar2, pVar, pVar2, rVar, (i11 & 14) | (i11 & 896) | (i11 & 7168));
                }
            }
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new h(m10, sVar, pVar, pVar2, i10, 3);
        }
    }
}
