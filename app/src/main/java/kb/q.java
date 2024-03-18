package Kb;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.B0;
import E.C0412a0;
import E.C0421f;
import E.C0426j;
import E.D0;
import E.G;
import E.L;
import E.N;
import F.J;
import F.M;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import L.C0865o0;
import N.D;
import W.AbstractC1643y2;
import W.C1564i2;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.o1;
import Z.r;
import android.gov.nist.core.Separators;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import java.util.WeakHashMap;
import jf.y;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.C6477o;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9624a = 12;

    public static final void a(Fb.f fVar, String str, List list, AbstractC4326r abstractC4326r, wf.k kVar, wf.k kVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        o oVar;
        p pVar;
        boolean z10;
        C3288a c3288a;
        AbstractC3557B.c0("phoneNumber", str);
        AbstractC3557B.c0("countries", list);
        AbstractC4326r a5 = io.sentry.compose.b.a("PhoneInput");
        r rVar = (r) abstractC1725n;
        rVar.X(-797084788);
        if ((i11 & 8) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        if ((i11 & 16) != 0) {
            oVar = o.f9622Y;
        } else {
            oVar = kVar;
        }
        if ((i11 & 32) != 0) {
            pVar = p.f9623Y;
        } else {
            pVar = kVar2;
        }
        m0.j jVar = m0.j.f38818F0;
        rVar.W(-1076228634);
        int i12 = (i10 & 458752) ^ 196608;
        boolean z11 = true;
        if ((i12 > 131072 && rVar.g(pVar)) || (i10 & 196608) == 131072) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (z10 || K10 == iVar) {
            K10 = AbstractC0044t0.v(6, pVar, rVar);
        }
        rVar.t(false);
        AbstractC4326r a10 = AbstractC4194d.a((X) a5, A7.b.c0(abstractC4326r2, jVar, (wf.k) K10));
        C0865o0 a11 = C0865o0.a(0, 4, 27);
        if (!list.isEmpty()) {
            c3288a = R4.b.X(rVar, -1402472602, new D(oVar, list, fVar, 21));
        } else {
            c3288a = null;
        }
        C3288a c3288a2 = c3288a;
        rVar.W(-1076228549);
        if ((i12 <= 131072 || !rVar.g(pVar)) && (i10 & 196608) != 131072) {
            z11 = false;
        }
        Object K11 = rVar.K();
        if (z11 || K11 == iVar) {
            K11 = AbstractC0044t0.v(7, pVar, rVar);
        }
        rVar.t(false);
        wf.k kVar3 = pVar;
        wf.k kVar4 = oVar;
        AbstractC4326r abstractC4326r3 = abstractC4326r2;
        AbstractC1643y2.b(str, (wf.k) K11, a10, false, false, null, h.f9604a, null, c3288a2, null, null, null, null, false, null, a11, null, true, 0, 0, null, null, null, rVar, ((i10 >> 3) & 14) | 1572864, 12582912, 0, 8224440);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C6477o(fVar, str, list, abstractC4326r3, kVar4, kVar3, i10, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Fb.f fVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        r rVar;
        int i13;
        int i14;
        AbstractC4326r a5 = io.sentry.compose.b.a("CountryDisplayLabel");
        r rVar2 = (r) abstractC1725n;
        rVar2.X(234624079);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(fVar)) {
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
            if (rVar2.g(abstractC4326r2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            if ((i12 & 91) != 18 && rVar2.B()) {
                rVar2.P();
                rVar = rVar2;
                a5 = abstractC4326r2;
            } else {
                if (i15 == 0) {
                    a5 = abstractC4326r2;
                }
                AbstractC4326r s10 = androidx.compose.foundation.layout.a.s(a5, p9.r.f42842f, p9.r.f42841e);
                C0421f c0421f = AbstractC0429m.f3907a;
                C0426j g10 = AbstractC0429m.g(p9.r.f42839c);
                rVar2.W(1098475987);
                N c10 = L.c(g10, rVar2);
                rVar2.W(-1323940314);
                int i16 = rVar2.P;
                AbstractC1732q0 p10 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i17 = androidx.compose.ui.layout.a.i(s10);
                if (!(rVar2.f22696a instanceof AbstractC1707e)) {
                    rVar2.Z();
                    if (rVar2.f22695O) {
                        rVar2.o(c0582k);
                    } else {
                        rVar2.k0();
                    }
                    U3.f.n0(rVar2, c10, C0583l.f5808f);
                    U3.f.n0(rVar2, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i16))) {
                        AbstractC6463a.q(i16, rVar2, i16, c0581j);
                    }
                    AbstractC6463a.r(0, i17, new L0(rVar2), rVar2, 2058660585);
                    AbstractC4326r a10 = io.sentry.compose.b.a("CountryDisplayLabel");
                    char[] chars = Character.toChars(Character.codePointAt(fVar.f5145a, 0) - (-127397));
                    AbstractC3557B.b0("toChars(...)", chars);
                    String str = new String(chars);
                    char[] chars2 = Character.toChars(Character.codePointAt(fVar.f5145a, 1) - (-127397));
                    AbstractC3557B.b0("toChars(...)", chars2);
                    j4.b(str.concat(new String(chars2)), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                    j4.b(fVar.f5146b, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                    rVar2.W(-762393251);
                    String str2 = fVar.f5148d;
                    if (str2 == null) {
                        rVar = rVar2;
                    } else {
                        j4.b(android.gov.nist.core.a.A(Separators.LPAREN, str2, Separators.RPAREN), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                        rVar = rVar2;
                    }
                    boolean z10 = false;
                    rVar.t(false);
                    rVar.W(-1070126996);
                    String str3 = fVar.f5147c;
                    if (str3 != null) {
                        j4.b(str3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                        z10 = false;
                    }
                    AbstractC6463a.v(rVar, z10, z10, true, z10);
                    rVar.t(z10);
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new F.o(fVar, a5, i10, i11, 24);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i15 == 0) {
        }
        AbstractC4326r s102 = androidx.compose.foundation.layout.a.s(a5, p9.r.f42842f, p9.r.f42841e);
        C0421f c0421f2 = AbstractC0429m.f3907a;
        C0426j g102 = AbstractC0429m.g(p9.r.f42839c);
        rVar2.W(1098475987);
        N c102 = L.c(g102, rVar2);
        rVar2.W(-1323940314);
        int i162 = rVar2.P;
        AbstractC1732q0 p102 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i172 = androidx.compose.ui.layout.a.i(s102);
        if (!(rVar2.f22696a instanceof AbstractC1707e)) {
        }
    }

    public static final void c(wf.k kVar, AbstractC6216a abstractC6216a, List list, Fb.f fVar, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("CountryPicker");
        r rVar = (r) abstractC1725n;
        rVar.X(1523810933);
        rVar.W(170692536);
        Object K10 = rVar.K();
        Object obj = C1723m.f22654Y;
        if (K10 == obj) {
            K10 = AbstractC4828h.Z("", o1.f22665a);
            rVar.h0(K10);
        }
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        Object w10 = AbstractC0044t0.w(rVar, false, 170692593);
        if (w10 == obj) {
            w10 = new p0.l();
            rVar.h0(w10);
        }
        p0.l lVar = (p0.l) w10;
        rVar.t(false);
        J a10 = M.a(0, rVar, 3);
        String str = (String) abstractC1710f0.getValue();
        rVar.W(170692694);
        boolean g10 = rVar.g(a10);
        Object K11 = rVar.K();
        if (g10 || K11 == obj) {
            K11 = new l(a10, null);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC1734s.e(str, (wf.n) K11, rVar);
        y yVar = y.f36177a;
        rVar.W(170692749);
        Object K12 = rVar.K();
        if (K12 == obj) {
            K12 = new m(lVar, null);
            rVar.h0(K12);
        }
        rVar.t(false);
        AbstractC1734s.e(yVar, (wf.n) K12, rVar);
        rVar.W(-49441252);
        WeakHashMap weakHashMap = B0.f3736v;
        B0 c10 = G.c(rVar);
        rVar.t(false);
        A7.b.f(abstractC6216a, AbstractC4194d.a((X) a5, D0.a(c4323o, new C0412a0(c10.f3747k, 16))), null, 0L, A7.b.v1(6, 2, rVar, true), null, R4.b.X(rVar, 893454754, new n(lVar, a10, abstractC1710f0, list, fVar, kVar, abstractC6216a)), rVar, ((i10 >> 3) & 14) | 1572864, 44);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1564i2(kVar, abstractC6216a, list, fVar, i10, 5);
        }
    }

    public static final String d(String str) {
        AbstractC3557B.c0("<this>", str);
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }
}
