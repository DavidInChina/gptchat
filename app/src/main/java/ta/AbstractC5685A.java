package ta;

import A.AbstractC0044t0;
import A.C0046u0;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.p0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import cb.C2334C;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import na.A0;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import za.C6783B;

/* renamed from: ta.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5685A {

    /* renamed from: a  reason: collision with root package name */
    public static final float f45802a = p9.r.f42845i * 4;

    static {
        float f6 = p9.r.f42837a;
    }

    public static final void a(List list, boolean z10, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r a5 = io.sentry.compose.b.a("InputGizmoActionsView");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(570488046);
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        R4.b.f(z10, a5, androidx.compose.animation.b.c(null, 3).b(androidx.compose.animation.b.j(C5705d.f45916o0)), androidx.compose.animation.b.d(null, 3).b(androidx.compose.animation.b.l(C5705d.f45917p0)), null, R4.b.X(rVar, 1136805318, new C5724x(list, kVar, 1)), rVar, ((i10 >> 3) & 14) | 200064, 18);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C5725y(list, z10, kVar, i10, i11, 0);
        }
    }

    public static final void b(List list, boolean z10, wf.k kVar, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r a5 = io.sentry.compose.b.a("InputGizmoMentionsView");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(135246262);
        boolean z11 = true;
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        if (!z10 || !(!list.isEmpty())) {
            z11 = false;
        }
        R4.b.f(z11, a5, androidx.compose.animation.b.c(null, 3).b(androidx.compose.animation.b.j(C5705d.f45919r0)), androidx.compose.animation.b.d(null, 3).b(androidx.compose.animation.b.l(C5705d.f45920s0)), null, R4.b.X(rVar, 511212510, new C5724x(list, kVar, 3)), rVar, 200064, 18);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C5725y(list, z10, kVar, i10, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(C6783B c6783b, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("inputState", c6783b);
        AbstractC3557B.c0("onInputIntent", kVar);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("InputGizmoViews");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1814802563);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c6783b)) {
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
                rVar.W(-483455358);
                E0.N a10 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar);
                rVar.W(-1323940314);
                int i17 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(a5);
                if (!(rVar.f22696a instanceof AbstractC1707e)) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, a10, C0583l.f5808f);
                    U3.f.n0(rVar, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar, i17, c0581j);
                    }
                    AbstractC6463a.r(0, i18, new L0(rVar), rVar, 2058660585);
                    AbstractC4326r a11 = io.sentry.compose.b.a("InputGizmoViews");
                    List list = c6783b.f51768k;
                    boolean z14 = !list.isEmpty();
                    C2334C c2334c = c6783b.f51765h;
                    if (z14 && c2334c == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rVar.W(18384357);
                    int i19 = i12 & 112;
                    if (i19 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object K10 = rVar.K();
                    io.sentry.hints.i iVar = C1723m.f22654Y;
                    if (z11 || K10 == iVar) {
                        K10 = new y.Y(23, kVar);
                        rVar.h0(K10);
                    }
                    rVar.t(false);
                    b(list, z10, (wf.k) K10, rVar, 8, 0);
                    List list2 = c6783b.f51767j;
                    boolean z15 = !list2.isEmpty();
                    rVar.W(18384599);
                    if (i19 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object K11 = rVar.K();
                    if (z12 || K11 == iVar) {
                        K11 = new y.Y(24, kVar);
                        rVar.h0(K11);
                    }
                    rVar.t(false);
                    a(list2, z15, (wf.k) K11, rVar, 8, 0);
                    rVar.W(-1770208336);
                    if (c2334c != null) {
                        rVar.W(18384827);
                        if (i19 == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        Object K12 = rVar.K();
                        if (z13 || K12 == iVar) {
                            K12 = AbstractC0044t0.t(20, kVar, rVar);
                        }
                        rVar.t(false);
                        AbstractC4326r a12 = AbstractC4194d.a((G0.X) a11, androidx.compose.foundation.layout.e.d(c4323o, 1.0f));
                        float f6 = p9.r.f42841e;
                        d(c2334c, (AbstractC6216a) K12, androidx.compose.foundation.layout.a.v(a12, f6, p9.r.f42840d, f6, 0.0f, 8), rVar, 0, 0);
                    }
                    AbstractC6463a.v(rVar, false, false, true, false);
                    rVar.t(false);
                    abstractC4326r3 = a5;
                } else {
                    R4.b.r1();
                    throw null;
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new C5722v(c6783b, kVar, abstractC4326r3, i10, i11, 1);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        rVar.W(-483455358);
        E0.N a102 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar);
        rVar.W(-1323940314);
        int i172 = rVar.P;
        AbstractC1732q0 p102 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k2 = C0583l.f5804b;
        C3288a i182 = androidx.compose.ui.layout.a.i(a5);
        if (!(rVar.f22696a instanceof AbstractC1707e)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(C2334C c2334c, AbstractC6216a abstractC6216a, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        int i13;
        int i14;
        int i15;
        AbstractC4326r a5 = io.sentry.compose.b.a("SelectedGizmoView");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1668485994);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c2334c)) {
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
            if (rVar.i(abstractC6216a)) {
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
            } else {
                if (i16 == 0) {
                    a5 = abstractC4326r2;
                }
                int i17 = ((i12 >> 6) & 14) | 196608;
                M3.H.b(a5, null, null, null, null, R4.b.X(rVar, -1508373924, new C0046u0(c2334c, 10, abstractC6216a)), rVar, i17, 30);
                abstractC4326r2 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new C5726z(c2334c, abstractC6216a, abstractC4326r2, i10, i11, 0);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        int i172 = ((i12 >> 6) & 14) | 196608;
        M3.H.b(a5, null, null, null, null, R4.b.X(rVar, -1508373924, new C0046u0(c2334c, 10, abstractC6216a)), rVar, i172, 30);
        abstractC4326r2 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(C2334C c2334c, AbstractC4326r abstractC4326r, boolean z10, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("GizmoInputLabel");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(2070660098);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c2334c)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
            i13 = i11 & 4;
            if (i13 == 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                z11 = z10;
                if (rVar.h(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
                if ((i12 & 731) != 146 && rVar.B()) {
                    rVar.P();
                    a5 = abstractC4326r2;
                } else {
                    if (i17 == 0) {
                        a5 = abstractC4326r2;
                    }
                    if (i13 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    rVar.W(693286680);
                    E0.N a10 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar);
                    rVar.W(-1323940314);
                    int i18 = rVar.P;
                    AbstractC1732q0 p10 = rVar.p();
                    AbstractC0584m.f5811i.getClass();
                    C0582k c0582k = C0583l.f5804b;
                    C3288a i19 = androidx.compose.ui.layout.a.i(a5);
                    if (rVar.f22696a instanceof AbstractC1707e) {
                        rVar.Z();
                        if (rVar.f22695O) {
                            rVar.o(c0582k);
                        } else {
                            rVar.k0();
                        }
                        U3.f.n0(rVar, a10, C0583l.f5808f);
                        U3.f.n0(rVar, p10, C0583l.f5807e);
                        C0581j c0581j = C0583l.f5809g;
                        if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i18))) {
                            AbstractC6463a.q(i18, rVar, i18, c0581j);
                        }
                        AbstractC6463a.r(0, i19, new L0(rVar), rVar, 2058660585);
                        AbstractC4326r a11 = io.sentry.compose.b.a("GizmoInputLabel");
                        rVar.W(-1475887756);
                        if (z12) {
                            j4.b(Ng.H.v(R.string.conversation_at_mention_gizmo_subtitle, rVar), a11, ((P0) rVar.m(R0.f19593a)).f19535s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131066);
                        }
                        rVar.t(false);
                        j4.b(c2334c.f26439b, c4323o, ((P0) rVar.m(R0.f19593a)).f19533q, 0L, null, S0.D.f15973l0, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, rVar, 196656, 3120, 120792);
                        AbstractC6463a.v(rVar, false, true, false, false);
                        z11 = z12;
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                }
                C1741v0 v10 = rVar.v();
                if (v10 != null) {
                    v10.f22739d = new A0(c2334c, a5, z11, i10, i11, 1);
                    return;
                }
                return;
            }
            z11 = z10;
            if ((i12 & 731) != 146) {
            }
            if (i17 == 0) {
            }
            if (i13 != 0) {
            }
            rVar.W(693286680);
            E0.N a102 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar);
            rVar.W(-1323940314);
            int i182 = rVar.P;
            AbstractC1732q0 p102 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k2 = C0583l.f5804b;
            C3288a i192 = androidx.compose.ui.layout.a.i(a5);
            if (rVar.f22696a instanceof AbstractC1707e) {
            }
        }
        abstractC4326r2 = abstractC4326r;
        i13 = i11 & 4;
        if (i13 == 0) {
        }
        z11 = z10;
        if ((i12 & 731) != 146) {
        }
        if (i17 == 0) {
        }
        if (i13 != 0) {
        }
        rVar.W(693286680);
        E0.N a1022 = p0.a(AbstractC0429m.f3907a, C4310b.f37702o0, rVar);
        rVar.W(-1323940314);
        int i1822 = rVar.P;
        AbstractC1732q0 p1022 = rVar.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k22 = C0583l.f5804b;
        C3288a i1922 = androidx.compose.ui.layout.a.i(a5);
        if (rVar.f22696a instanceof AbstractC1707e) {
        }
    }
}
