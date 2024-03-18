package d1;

import A.C0043t;
import G.I;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import H0.AbstractC0701r0;
import H0.Z;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.C1729p;
import Z.C1741v0;
import Z.L0;
import Z.O;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import h.C3278d;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.UUID;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: d1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2575j {

    /* renamed from: a  reason: collision with root package name */
    public static final O f27874a = A7.b.o0(C2569d.f27857h0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(AbstractC2586u abstractC2586u, AbstractC6216a abstractC6216a, C2587v c2587v, wf.n nVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC6216a abstractC6216a2;
        int i13;
        C2587v c2587v2;
        C2587v c2587v3;
        AbstractC6216a abstractC6216a3;
        C2587v c2587v4;
        Object K10;
        boolean z10;
        ?? r12;
        int i14;
        int i15;
        int i16;
        int i17;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-830247068);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(abstractC2586u)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC6216a2 = abstractC6216a;
            if (rVar.i(abstractC6216a2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                c2587v2 = c2587v;
                if (rVar.g(c2587v2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (rVar.i(nVar)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 5851) != 1170 && rVar.B()) {
                    rVar.P();
                    c2587v3 = c2587v2;
                } else {
                    if (i18 != 0) {
                        abstractC6216a3 = null;
                    } else {
                        abstractC6216a3 = abstractC6216a2;
                    }
                    if (i13 != 0) {
                        c2587v4 = new C2587v(false, false, 63);
                    } else {
                        c2587v4 = c2587v2;
                    }
                    View view = (View) rVar.m(Z.f6892f);
                    Z0.b bVar = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
                    String str = (String) rVar.m(f27874a);
                    Z0.l lVar = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
                    C1729p Q12 = R4.b.Q1(rVar);
                    AbstractC1710f0 g02 = AbstractC4828h.g0(nVar, rVar);
                    UUID uuid = (UUID) Ad.l.Y0(new Object[0], null, C2569d.f27858i0, rVar, 6);
                    rVar.W(-492369756);
                    K10 = rVar.K();
                    if (K10 == C1723m.f22654Y) {
                        C2584s c2584s = new C2584s(abstractC6216a3, c2587v4, str, view, bVar, abstractC2586u, uuid);
                        androidx.compose.foundation.layout.c cVar = new androidx.compose.foundation.layout.c(c2584s, 9, g02);
                        z10 = true;
                        c2584s.i(Q12, new C3288a(cVar, true, 1302892335));
                        rVar.h0(c2584s);
                        K10 = c2584s;
                        r12 = 0;
                    } else {
                        z10 = true;
                        r12 = 0;
                    }
                    rVar.t(r12);
                    C2584s c2584s2 = (C2584s) K10;
                    AbstractC6216a abstractC6216a4 = abstractC6216a3;
                    C2587v c2587v5 = c2587v4;
                    AbstractC1734s.b(c2584s2, new C3278d(c2584s2, abstractC6216a4, c2587v5, str, lVar), rVar);
                    AbstractC1734s.g(new C2571f(c2584s2, abstractC6216a4, c2587v5, str, lVar, 0), rVar);
                    AbstractC1734s.b(abstractC2586u, new C0043t(c2584s2, 29, abstractC2586u), rVar);
                    AbstractC1734s.e(c2584s2, new C2573h(c2584s2, null), rVar);
                    AbstractC4326r j6 = androidx.compose.ui.layout.a.j(C4323o.f37719b, new C2574i(c2584s2, r12));
                    int i19 = z10 ? 1 : 0;
                    int i20 = z10 ? 1 : 0;
                    c1.g gVar = new c1.g(c2584s2, lVar, i19);
                    rVar.W(-1323940314);
                    int i21 = rVar.P;
                    AbstractC1732q0 p10 = rVar.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i22 = androidx.compose.ui.layout.a.i(j6);
                    if (rVar.f22696a instanceof AbstractC1707e) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, gVar, C0583l.f5808f);
                        U3.f.n0(rVar, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i21))) {
                            AbstractC6463a.q(i21, rVar, i21, c0581j);
                        }
                        L0 l02 = new L0(rVar);
                        int i23 = r12 == true ? 1 : 0;
                        int i24 = r12 == true ? 1 : 0;
                        AbstractC6463a.r(i23, i22, l02, rVar, 2058660585);
                        AbstractC6463a.u(rVar, r12, z10, r12);
                        abstractC6216a2 = abstractC6216a3;
                        c2587v3 = c2587v4;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new I(abstractC2586u, abstractC6216a2, c2587v3, nVar, i10, i11, 5);
                    return;
                }
                return;
            }
            c2587v2 = c2587v;
            if ((i11 & 8) != 0) {
            }
            if ((i12 & 5851) != 1170) {
            }
            if (i18 != 0) {
            }
            if (i13 != 0) {
            }
            View view2 = (View) rVar.m(Z.f6892f);
            Z0.b bVar2 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
            String str2 = (String) rVar.m(f27874a);
            Z0.l lVar2 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
            C1729p Q122 = R4.b.Q1(rVar);
            AbstractC1710f0 g022 = AbstractC4828h.g0(nVar, rVar);
            UUID uuid2 = (UUID) Ad.l.Y0(new Object[0], null, C2569d.f27858i0, rVar, 6);
            rVar.W(-492369756);
            K10 = rVar.K();
            if (K10 == C1723m.f22654Y) {
            }
            rVar.t(r12);
            C2584s c2584s22 = (C2584s) K10;
            AbstractC6216a abstractC6216a42 = abstractC6216a3;
            C2587v c2587v52 = c2587v4;
            AbstractC1734s.b(c2584s22, new C3278d(c2584s22, abstractC6216a42, c2587v52, str2, lVar2), rVar);
            AbstractC1734s.g(new C2571f(c2584s22, abstractC6216a42, c2587v52, str2, lVar2, 0), rVar);
            AbstractC1734s.b(abstractC2586u, new C0043t(c2584s22, 29, abstractC2586u), rVar);
            AbstractC1734s.e(c2584s22, new C2573h(c2584s22, null), rVar);
            AbstractC4326r j62 = androidx.compose.ui.layout.a.j(C4323o.f37719b, new C2574i(c2584s22, r12));
            int i192 = z10 ? 1 : 0;
            int i202 = z10 ? 1 : 0;
            c1.g gVar2 = new c1.g(c2584s22, lVar2, i192);
            rVar.W(-1323940314);
            int i212 = rVar.P;
            AbstractC1732q0 p102 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k2 = C0583l.f5804b;
            C3288a i222 = androidx.compose.ui.layout.a.i(j62);
            if (rVar.f22696a instanceof AbstractC1707e) {
            }
        }
        abstractC6216a2 = abstractC6216a;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        c2587v2 = c2587v;
        if ((i11 & 8) != 0) {
        }
        if ((i12 & 5851) != 1170) {
        }
        if (i18 != 0) {
        }
        if (i13 != 0) {
        }
        View view22 = (View) rVar.m(Z.f6892f);
        Z0.b bVar22 = (Z0.b) rVar.m(AbstractC0701r0.f7002e);
        String str22 = (String) rVar.m(f27874a);
        Z0.l lVar22 = (Z0.l) rVar.m(AbstractC0701r0.f7008k);
        C1729p Q1222 = R4.b.Q1(rVar);
        AbstractC1710f0 g0222 = AbstractC4828h.g0(nVar, rVar);
        UUID uuid22 = (UUID) Ad.l.Y0(new Object[0], null, C2569d.f27858i0, rVar, 6);
        rVar.W(-492369756);
        K10 = rVar.K();
        if (K10 == C1723m.f22654Y) {
        }
        rVar.t(r12);
        C2584s c2584s222 = (C2584s) K10;
        AbstractC6216a abstractC6216a422 = abstractC6216a3;
        C2587v c2587v522 = c2587v4;
        AbstractC1734s.b(c2584s222, new C3278d(c2584s222, abstractC6216a422, c2587v522, str22, lVar22), rVar);
        AbstractC1734s.g(new C2571f(c2584s222, abstractC6216a422, c2587v522, str22, lVar22, 0), rVar);
        AbstractC1734s.b(abstractC2586u, new C0043t(c2584s222, 29, abstractC2586u), rVar);
        AbstractC1734s.e(c2584s222, new C2573h(c2584s222, null), rVar);
        AbstractC4326r j622 = androidx.compose.ui.layout.a.j(C4323o.f37719b, new C2574i(c2584s222, r12));
        int i1922 = z10 ? 1 : 0;
        int i2022 = z10 ? 1 : 0;
        c1.g gVar22 = new c1.g(c2584s222, lVar22, i1922);
        rVar.W(-1323940314);
        int i2122 = rVar.P;
        AbstractC1732q0 p1022 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k22 = C0583l.f5804b;
        C3288a i2222 = androidx.compose.ui.layout.a.i(j622);
        if (rVar.f22696a instanceof AbstractC1707e) {
        }
    }

    public static final boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
