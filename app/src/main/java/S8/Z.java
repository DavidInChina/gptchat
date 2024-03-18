package S8;

import H0.AbstractC0701r0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.C1741v0;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.AbstractC3953c;
import l0.AbstractC4326r;
import l0.C4323o;
import l8.AbstractC4344b;
import lf.C4436a;
import y.C6484w;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a  reason: collision with root package name */
    public static final N0.E f16288a = new N0.E(0, 0, S0.D.f15974m0, null, null, 16777211);

    /* renamed from: b  reason: collision with root package name */
    public static final long f16289b = M3.H.V(8);

    /* renamed from: c  reason: collision with root package name */
    public static final long f16290c = r0.r.f44263k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0112 A[LOOP:0: B:70:0x010c->B:72:0x0112, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018e  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r28v0, types: [jf.c, java.lang.Object, wf.k] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List, lf.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(M m10, AbstractC4326r abstractC4326r, wf.k kVar, wf.k kVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        wf.k kVar3;
        int i14;
        int i15;
        Z.r rVar;
        wf.k kVar4;
        C1741v0 v10;
        C4323o c4323o;
        wf.k kVar5;
        boolean g10;
        Object K10;
        b0 b0Var;
        boolean g11;
        Iterator it;
        List list;
        boolean g12;
        Object K11;
        int i16;
        Iterator it2;
        Object obj;
        b0 b0Var2;
        int i17;
        List list2;
        List list3;
        boolean g13;
        Object K12;
        List list4;
        C4436a c4436a;
        boolean z10;
        Iterator it3;
        boolean g14;
        Object K13;
        int i18;
        int i19;
        int i20;
        M m11 = m10;
        AbstractC3557B.c0("<this>", m11);
        AbstractC3557B.c0("bodyRows", kVar2);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-750323390);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(m11)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 1;
        if (i21 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
            i13 = i11 & 2;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                kVar3 = kVar;
                if (rVar2.i(kVar3)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i12 |= i18;
                if ((i11 & 4) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (rVar2.i(kVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i12;
                if ((i15 & 5851) != 1170 && rVar2.B()) {
                    rVar2.P();
                    kVar4 = kVar3;
                    rVar = rVar2;
                } else {
                    C4323o c4323o2 = C4323o.f37719b;
                    if (i21 != 0) {
                        c4323o = c4323o2;
                    } else {
                        c4323o = abstractC4326r2;
                    }
                    if (i13 != 0) {
                        kVar5 = null;
                    } else {
                        kVar5 = kVar3;
                    }
                    c0 c0Var = O.c(O.b(m11, rVar2)).f16254f;
                    AbstractC3557B.Z(c0Var);
                    long d10 = L.d(m11, rVar2);
                    rVar2.W(1157296644);
                    g10 = rVar2.g(kVar5);
                    K10 = rVar2.K();
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (!g10 || K10 == iVar) {
                        if (kVar5 != null) {
                            S s10 = new S();
                            kVar5.invoke(s10);
                            K10 = s10.f16264a;
                        } else {
                            K10 = null;
                        }
                        rVar2.h0(K10);
                    }
                    rVar2.t(false);
                    b0Var = (b0) K10;
                    rVar2.W(1157296644);
                    g11 = rVar2.g(kVar2);
                    Object K14 = rVar2.K();
                    ArrayList arrayList = K14;
                    if (!g11 || K14 == iVar) {
                        W w10 = new W();
                        kVar2.invoke(w10);
                        ArrayList arrayList2 = w10.f16280a;
                        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((S) it.next()).f16264a);
                        }
                        rVar2.h0(arrayList3);
                        arrayList = arrayList3;
                    }
                    rVar2.t(false);
                    list = (List) arrayList;
                    rVar2.W(511388516);
                    g12 = rVar2.g(b0Var) | rVar2.g(list);
                    K11 = rVar2.K();
                    if (!g12 || K11 == iVar) {
                        if (b0Var == null && (list3 = b0Var.f16308a) != null) {
                            i16 = list3.size();
                        } else {
                            i16 = 0;
                        }
                        it2 = list.iterator();
                        if (!it2.hasNext()) {
                            obj = 0;
                        } else {
                            obj = it2.next();
                            if (it2.hasNext()) {
                                int size = ((b0) obj).f16308a.size();
                                Object obj2 = obj;
                                while (true) {
                                    Object next = it2.next();
                                    int size2 = ((b0) next).f16308a.size();
                                    obj = obj2;
                                    if (size < size2) {
                                        size = size2;
                                        obj = next;
                                    }
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    m11 = m10;
                                    obj2 = obj;
                                }
                            }
                        }
                        b0Var2 = obj;
                        if (b0Var2 == null && (list2 = b0Var2.f16308a) != null) {
                            i17 = list2.size();
                        } else {
                            i17 = 0;
                        }
                        K11 = Integer.valueOf(Math.max(i16, i17));
                        rVar2.h0(K11);
                    }
                    rVar2.t(false);
                    int intValue = ((Number) K11).intValue();
                    N0.E e10 = L.e(m11, rVar2).e(c0Var.f16314a);
                    Z0.n nVar = c0Var.f16315b;
                    AbstractC3557B.Z(nVar);
                    AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.c(c4323o2), ((Z0.b) rVar2.m(AbstractC0701r0.f7002e)).t(nVar.f22811a));
                    rVar2.W(1618982084);
                    g13 = rVar2.g(b0Var) | rVar2.g(list) | rVar2.g(r10);
                    K12 = rVar2.K();
                    if (!g13 || K12 == iVar) {
                        C4436a c4436a2 = new C4436a();
                        if (b0Var != null) {
                            List<wf.o> list5 = b0Var.f16308a;
                            char c10 = '\n';
                            ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(list5, 10));
                            for (wf.o oVar : list5) {
                                arrayList4 = arrayList4;
                                arrayList4.add(new C3288a(new y.U(m10, e10, r10, oVar, 4), true, -1072860392));
                                c4436a2 = c4436a2;
                                list = list;
                                c10 = '\n';
                            }
                            list4 = list;
                            c4436a = c4436a2;
                            z10 = true;
                            c4436a.add(arrayList4);
                        } else {
                            list4 = list;
                            c4436a = c4436a2;
                            z10 = true;
                        }
                        it3 = list4.iterator();
                        while (it3.hasNext()) {
                            List<wf.o> list6 = ((b0) it3.next()).f16308a;
                            ArrayList arrayList5 = new ArrayList(AbstractC6583a.H1(list6, 10));
                            for (wf.o oVar2 : list6) {
                                int i22 = z10 ? 1 : 0;
                                int i23 = z10 ? 1 : 0;
                                arrayList5.add(new C3288a(new X(r10, oVar2, i22), z10, -779987087));
                                it3 = it3;
                            }
                            c4436a.add(arrayList5);
                        }
                        K12 = AbstractC4344b.Q(c4436a);
                        rVar2.h0(K12);
                    }
                    rVar2.t(false);
                    List list7 = (List) K12;
                    Float f6 = c0Var.f16317d;
                    AbstractC3557B.Z(f6);
                    float floatValue = f6.floatValue();
                    rVar2.W(-236203683);
                    g14 = rVar2.g(c0Var) | rVar2.f(d10);
                    K13 = rVar2.K();
                    if (!g14 || K13 == iVar) {
                        K13 = new C6484w(c0Var, d10, 5);
                        rVar2.h0(K13);
                    }
                    rVar2.t(false);
                    rVar = rVar2;
                    K8.d.V(intValue, list7, (wf.k) K13, floatValue, c4323o, rVar2, ((i15 << 9) & 57344) | 64);
                    kVar4 = kVar5;
                    abstractC4326r2 = c4323o;
                }
                v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new G.I(m10, abstractC4326r2, kVar4, (AbstractC3953c) kVar2, i10, i11, 8);
                    return;
                }
                return;
            }
            kVar3 = kVar;
            if ((i11 & 4) != 0) {
            }
            i15 = i12;
            if ((i15 & 5851) != 1170) {
            }
            C4323o c4323o22 = C4323o.f37719b;
            if (i21 != 0) {
            }
            if (i13 != 0) {
            }
            c0 c0Var2 = O.c(O.b(m11, rVar2)).f16254f;
            AbstractC3557B.Z(c0Var2);
            long d102 = L.d(m11, rVar2);
            rVar2.W(1157296644);
            g10 = rVar2.g(kVar5);
            K10 = rVar2.K();
            io.sentry.hints.i iVar2 = C1723m.f22654Y;
            if (!g10) {
            }
            if (kVar5 != null) {
            }
            rVar2.h0(K10);
            rVar2.t(false);
            b0Var = (b0) K10;
            rVar2.W(1157296644);
            g11 = rVar2.g(kVar2);
            Object K142 = rVar2.K();
            ArrayList arrayList6 = K142;
            if (!g11) {
            }
            W w102 = new W();
            kVar2.invoke(w102);
            ArrayList arrayList22 = w102.f16280a;
            ArrayList arrayList32 = new ArrayList(AbstractC6583a.H1(arrayList22, 10));
            it = arrayList22.iterator();
            while (it.hasNext()) {
            }
            rVar2.h0(arrayList32);
            arrayList6 = arrayList32;
            rVar2.t(false);
            list = (List) arrayList6;
            rVar2.W(511388516);
            g12 = rVar2.g(b0Var) | rVar2.g(list);
            K11 = rVar2.K();
            if (!g12) {
            }
            if (b0Var == null) {
            }
            i16 = 0;
            it2 = list.iterator();
            if (!it2.hasNext()) {
            }
            b0Var2 = obj;
            if (b0Var2 == null) {
            }
            i17 = 0;
            K11 = Integer.valueOf(Math.max(i16, i17));
            rVar2.h0(K11);
            rVar2.t(false);
            int intValue2 = ((Number) K11).intValue();
            N0.E e102 = L.e(m11, rVar2).e(c0Var2.f16314a);
            Z0.n nVar2 = c0Var2.f16315b;
            AbstractC3557B.Z(nVar2);
            AbstractC4326r r102 = androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.c(c4323o22), ((Z0.b) rVar2.m(AbstractC0701r0.f7002e)).t(nVar2.f22811a));
            rVar2.W(1618982084);
            g13 = rVar2.g(b0Var) | rVar2.g(list) | rVar2.g(r102);
            K12 = rVar2.K();
            if (!g13) {
            }
            C4436a c4436a22 = new C4436a();
            if (b0Var != null) {
            }
            it3 = list4.iterator();
            while (it3.hasNext()) {
            }
            K12 = AbstractC4344b.Q(c4436a);
            rVar2.h0(K12);
            rVar2.t(false);
            List list72 = (List) K12;
            Float f62 = c0Var2.f16317d;
            AbstractC3557B.Z(f62);
            float floatValue2 = f62.floatValue();
            rVar2.W(-236203683);
            g14 = rVar2.g(c0Var2) | rVar2.f(d102);
            K13 = rVar2.K();
            if (!g14) {
            }
            K13 = new C6484w(c0Var2, d102, 5);
            rVar2.h0(K13);
            rVar2.t(false);
            rVar = rVar2;
            K8.d.V(intValue2, list72, (wf.k) K13, floatValue2, c4323o, rVar2, ((i15 << 9) & 57344) | 64);
            kVar4 = kVar5;
            abstractC4326r2 = c4323o;
            v10 = rVar.v();
            if (v10 != null) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 2;
        if (i13 == 0) {
        }
        kVar3 = kVar;
        if ((i11 & 4) != 0) {
        }
        i15 = i12;
        if ((i15 & 5851) != 1170) {
        }
        C4323o c4323o222 = C4323o.f37719b;
        if (i21 != 0) {
        }
        if (i13 != 0) {
        }
        c0 c0Var22 = O.c(O.b(m11, rVar2)).f16254f;
        AbstractC3557B.Z(c0Var22);
        long d1022 = L.d(m11, rVar2);
        rVar2.W(1157296644);
        g10 = rVar2.g(kVar5);
        K10 = rVar2.K();
        io.sentry.hints.i iVar22 = C1723m.f22654Y;
        if (!g10) {
        }
        if (kVar5 != null) {
        }
        rVar2.h0(K10);
        rVar2.t(false);
        b0Var = (b0) K10;
        rVar2.W(1157296644);
        g11 = rVar2.g(kVar2);
        Object K1422 = rVar2.K();
        ArrayList arrayList62 = K1422;
        if (!g11) {
        }
        W w1022 = new W();
        kVar2.invoke(w1022);
        ArrayList arrayList222 = w1022.f16280a;
        ArrayList arrayList322 = new ArrayList(AbstractC6583a.H1(arrayList222, 10));
        it = arrayList222.iterator();
        while (it.hasNext()) {
        }
        rVar2.h0(arrayList322);
        arrayList62 = arrayList322;
        rVar2.t(false);
        list = (List) arrayList62;
        rVar2.W(511388516);
        g12 = rVar2.g(b0Var) | rVar2.g(list);
        K11 = rVar2.K();
        if (!g12) {
        }
        if (b0Var == null) {
        }
        i16 = 0;
        it2 = list.iterator();
        if (!it2.hasNext()) {
        }
        b0Var2 = obj;
        if (b0Var2 == null) {
        }
        i17 = 0;
        K11 = Integer.valueOf(Math.max(i16, i17));
        rVar2.h0(K11);
        rVar2.t(false);
        int intValue22 = ((Number) K11).intValue();
        N0.E e1022 = L.e(m11, rVar2).e(c0Var22.f16314a);
        Z0.n nVar22 = c0Var22.f16315b;
        AbstractC3557B.Z(nVar22);
        AbstractC4326r r1022 = androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.c(c4323o222), ((Z0.b) rVar2.m(AbstractC0701r0.f7002e)).t(nVar22.f22811a));
        rVar2.W(1618982084);
        g13 = rVar2.g(b0Var) | rVar2.g(list) | rVar2.g(r1022);
        K12 = rVar2.K();
        if (!g13) {
        }
        C4436a c4436a222 = new C4436a();
        if (b0Var != null) {
        }
        it3 = list4.iterator();
        while (it3.hasNext()) {
        }
        K12 = AbstractC4344b.Q(c4436a);
        rVar2.h0(K12);
        rVar2.t(false);
        List list722 = (List) K12;
        Float f622 = c0Var22.f16317d;
        AbstractC3557B.Z(f622);
        float floatValue22 = f622.floatValue();
        rVar2.W(-236203683);
        g14 = rVar2.g(c0Var22) | rVar2.f(d1022);
        K13 = rVar2.K();
        if (!g14) {
        }
        K13 = new C6484w(c0Var22, d1022, 5);
        rVar2.h0(K13);
        rVar2.t(false);
        rVar = rVar2;
        K8.d.V(intValue22, list722, (wf.k) K13, floatValue22, c4323o, rVar2, ((i15 << 9) & 57344) | 64);
        kVar4 = kVar5;
        abstractC4326r2 = c4323o;
        v10 = rVar.v();
        if (v10 != null) {
        }
    }
}
