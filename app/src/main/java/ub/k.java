package ub;

import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0421f;
import E.C0426j;
import E.L;
import E0.C0452k;
import E0.C0453l;
import E0.N;
import G.I;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H0.Z;
import Ng.H;
import W.AbstractC1530b3;
import W.C1525a3;
import W.C1564i2;
import W.P0;
import W.R0;
import Z.AbstractC1707e;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.C1741v0;
import Z.L0;
import Z.o1;
import aa.C1939b;
import aa.EnumC1938a;
import android.content.Context;
import bb.j0;
import ca.EnumC2323o;
import com.openai.chatgpt.R;
import d1.C2580o;
import db.C2615c;
import f4.C2936a;
import g4.AbstractC3181i;
import g4.C3177e;
import g4.C3180h;
import h0.C3288a;
import ha.C3349B;
import ha.C3354G;
import ha.C3357J;
import ha.C3381y;
import ha.K;
import ha.M;
import ha.P;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import nf.AbstractC4828h;
import sb.C5605e;
import u0.AbstractC5824b;
import wf.AbstractC6216a;
import y.AbstractC6463a;
import y.U;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final float f46564a = 96;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(K k10, wf.k kVar, C1939b c1939b, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        AbstractC4326r abstractC4326r2;
        Z.r rVar;
        C1741v0 v10;
        Z.r rVar2;
        AbstractC4326r a5 = io.sentry.compose.b.a("ActionButton");
        Z.r rVar3 = (Z.r) abstractC1725n;
        rVar3.X(2053630814);
        if ((i11 & 8) != 0) {
            abstractC4326r2 = a5;
        } else {
            abstractC4326r2 = abstractC4326r;
        }
        if (k10 instanceof C3381y) {
            rVar3.W(1392985748);
            H.a(new C5882f(kVar, c1939b, k10, 0), abstractC4326r2, false, null, null, null, null, null, null, R4.b.X(rVar3, 1826280646, new g(k10, 0)), rVar3, ((i10 >> 6) & 112) | 805306368, 508);
            rVar2 = rVar3;
            rVar2.t(false);
        } else if (k10 instanceof C3349B) {
            rVar3.W(1392986306);
            H.d(new C5882f(kVar, c1939b, k10, 1), abstractC4326r2, false, null, null, null, null, null, null, AbstractC5880d.f46544a, rVar3, ((i10 >> 6) & 112) | 805306368, 508);
            rVar2 = rVar3;
            rVar2.t(false);
        } else if (k10 instanceof C3354G) {
            rVar3.W(1392986542);
            H.d(new C5882f(kVar, c1939b, k10, 2), abstractC4326r2, false, null, null, null, null, null, null, R4.b.X(rVar3, -1741812592, new g(k10, 1)), rVar3, ((i10 >> 6) & 112) | 805306368, 508);
            rVar2 = rVar3;
            rVar2.t(false);
        } else {
            if (k10 instanceof C3357J) {
                rVar3.W(1392987097);
                H.a(new C5882f(kVar, c1939b, k10, 3), abstractC4326r2, false, null, null, null, null, null, null, R4.b.X(rVar3, 1577834797, new g(k10, 2)), rVar3, ((i10 >> 6) & 112) | 805306368, 508);
                rVar = rVar3;
                rVar.t(false);
            } else {
                rVar = rVar3;
                rVar.W(1392987308);
                rVar.t(false);
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new I(k10, kVar, c1939b, abstractC4326r2, i10, i11, 18);
                return;
            }
            return;
        }
        rVar = rVar2;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C1939b c1939b, wf.k kVar, AbstractC4326r abstractC4326r, wf.k kVar2, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        int i13;
        int i14;
        Z.r rVar;
        AbstractC4326r abstractC4326r3;
        AbstractC4326r abstractC4326r4;
        boolean z10;
        String str;
        EnumC1938a enumC1938a;
        EnumC1938a enumC1938a2;
        String str2;
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC6216a abstractC6216a;
        String w10;
        String w11;
        int i15;
        int i16;
        int i17;
        AbstractC3557B.c0("action", c1939b);
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC3557B.c0("onActionClick", kVar2);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("CustomActionTool");
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.X(-1398918310);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar2.g(c1939b)) {
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
        } else if ((i10 & 112) == 0) {
            if (rVar2.i(kVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar2.g(abstractC4326r2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
            if ((i11 & 8) == 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (rVar2.i(kVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            i14 = i12;
            if ((i14 & 5851) != 1170 && rVar2.B()) {
                rVar2.P();
                abstractC4326r3 = abstractC4326r2;
                rVar = rVar2;
            } else {
                if (i18 == 0) {
                    abstractC4326r4 = a5;
                } else {
                    abstractC4326r4 = abstractC4326r2;
                }
                rVar2.W(-1927616515);
                M m10 = c1939b.f24021a;
                z10 = c1939b.f24025e;
                if (!z10) {
                    str = H.v(R.string.tool_host_local_action, rVar2);
                } else {
                    str = m10.f32018b;
                }
                rVar2.t(false);
                K k10 = (K) kf.t.h2(m10.f32023g);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, i.f46559Y, rVar2, 6);
                enumC1938a = EnumC1938a.f24018h0;
                enumC1938a2 = c1939b.f24023c;
                EnumC2323o enumC2323o = c1939b.f24024d;
                if (enumC1938a2 != enumC1938a) {
                    w11 = AbstractC4194d.u(rVar2, -1927616145, R.string.tool_function_title_declined, rVar2, false);
                } else if (str == null && enumC2323o.a()) {
                    rVar2.W(373444873);
                    rVar2.t(false);
                    w11 = "";
                } else if (str == null) {
                    w11 = AbstractC4194d.u(rVar2, -1927616014, R.string.tool_status_active, rVar2, false);
                } else if (z10 && g(c1939b)) {
                    rVar2.W(-1927615898);
                    w11 = H.w(R.string.tool_function_title_waiting_for_input, new Object[]{str}, rVar2);
                    rVar2.t(false);
                } else if (g(c1939b)) {
                    rVar2.W(-1927615775);
                    w11 = H.w(R.string.tool_function_title_waiting_for_input, new Object[]{str}, rVar2);
                    rVar2.t(false);
                } else {
                    EnumC2323o enumC2323o2 = EnumC2323o.f26407Z;
                    if (enumC2323o == enumC2323o2 && (k10 instanceof C3357J)) {
                        rVar2.W(-1927615584);
                        w11 = H.w(R.string.tool_function_title_signin_finished, new Object[]{str}, rVar2);
                        rVar2.t(false);
                    } else if (enumC2323o == enumC2323o2) {
                        rVar2.W(-1927615448);
                        w11 = H.w(R.string.tool_function_title_finished, new Object[]{str}, rVar2);
                        rVar2.t(false);
                    } else {
                        if (enumC2323o.a()) {
                            rVar2.W(-1927615342);
                            w10 = H.w(R.string.tool_function_title_interrupted, new Object[]{str}, rVar2);
                            rVar2.t(false);
                        } else {
                            rVar2.W(-1927615246);
                            w10 = H.w(R.string.tool_function_title_in_progress, new Object[]{str}, rVar2);
                            rVar2.t(false);
                        }
                        str2 = w10;
                        C0426j c0426j = new C0426j(p9.r.f42840d, false, null);
                        int i19 = i14 >> 6;
                        rVar2.W(-483455358);
                        N a10 = AbstractC0440y.a(c0426j, C4310b.f37705r0, rVar2);
                        rVar2.W(-1323940314);
                        int i20 = rVar2.P;
                        AbstractC1732q0 p10 = rVar2.p();
                        AbstractC0584m.f5811i.getClass();
                        C0582k c0582k = C0583l.f5804b;
                        C3288a i21 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                        if (rVar2.f22696a instanceof AbstractC1707e) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a10, C0583l.f5808f);
                            U3.f.n0(rVar2, p10, C0583l.f5807e);
                            C0581j c0581j = C0583l.f5809g;
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i20))) {
                                AbstractC6463a.q(i20, rVar2, i20, c0581j);
                            }
                            AbstractC6463a.r(0, i21, new L0(rVar2), rVar2, 2058660585);
                            AbstractC4326r a11 = io.sentry.compose.b.a("CustomActionTool");
                            rVar2.W(-1009356621);
                            z4.q o02 = Df.H.o0(new z4.r(R.raw.jit_plugin_icon_lottie), rVar2);
                            rVar2.t(false);
                            boolean g10 = g(c1939b);
                            rVar2.W(-35345289);
                            boolean g11 = rVar2.g(abstractC1710f0);
                            Object K10 = rVar2.K();
                            io.sentry.hints.i iVar = C1723m.f22654Y;
                            if (g11 || K10 == iVar) {
                                K10 = R.a.o(abstractC1710f0, 25, rVar2);
                            }
                            rVar2.t(false);
                            AbstractC5875D.a(str2, o02, enumC2323o, AbstractC4194d.a((X) a11, androidx.compose.foundation.a.h(c4323o, (AbstractC6216a) K10)), true, false, true, g10, 3, rVar2, 102457344, 0);
                            rVar2.W(-35345242);
                            if (!enumC2323o.a() && g(c1939b) && !z10) {
                                rVar = rVar2;
                                z11 = z10;
                                c(c1939b, kVar2, a11, rVar, (i14 & 14) | (i19 & 112), 4);
                            } else {
                                rVar = rVar2;
                                z11 = z10;
                            }
                            rVar.t(false);
                            rVar.W(-35345021);
                            if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                                rVar.W(-35344893);
                                boolean g12 = rVar.g(abstractC1710f0);
                                Object K11 = rVar.K();
                                if (g12 || K11 == iVar) {
                                    K11 = R.a.o(abstractC1710f0, 26, rVar);
                                }
                                rVar.t(false);
                                d(c1939b, (AbstractC6216a) K11, kVar, kVar2, rVar, (i14 & 14) | ((i14 << 3) & 896) | (i14 & 7168));
                            }
                            rVar.t(false);
                            rVar.W(-1927614220);
                            if (z11 && g(c1939b)) {
                                rVar.W(-35344621);
                                if ((i14 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                Object K12 = rVar.K();
                                if (z13 || K12 == iVar) {
                                    z12 = false;
                                    abstractC6216a = AbstractC6463a.o(0, kVar, rVar);
                                } else {
                                    abstractC6216a = K12;
                                    z12 = false;
                                }
                                rVar.t(z12);
                                K8.d.i(c1939b, abstractC6216a, rVar, i14 & 14);
                            } else {
                                z12 = false;
                            }
                            AbstractC6463a.v(rVar, z12, z12, true, z12);
                            rVar.t(z12);
                            abstractC4326r3 = abstractC4326r4;
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    }
                }
                str2 = w11;
                C0426j c0426j2 = new C0426j(p9.r.f42840d, false, null);
                int i192 = i14 >> 6;
                rVar2.W(-483455358);
                N a102 = AbstractC0440y.a(c0426j2, C4310b.f37705r0, rVar2);
                rVar2.W(-1323940314);
                int i202 = rVar2.P;
                AbstractC1732q0 p102 = rVar2.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k2 = C0583l.f5804b;
                C3288a i212 = androidx.compose.ui.layout.a.i(abstractC4326r4);
                if (rVar2.f22696a instanceof AbstractC1707e) {
                }
            }
            C1741v0 v10 = rVar.v();
            if (v10 != null) {
                v10.f22739d = new I((Object) c1939b, (Object) kVar, abstractC4326r3, (Object) kVar2, i10, i11, 19);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i11 & 8) == 0) {
        }
        i14 = i12;
        if ((i14 & 5851) != 1170) {
        }
        if (i18 == 0) {
        }
        rVar2.W(-1927616515);
        M m102 = c1939b.f24021a;
        z10 = c1939b.f24025e;
        if (!z10) {
        }
        rVar2.t(false);
        K k102 = (K) kf.t.h2(m102.f32023g);
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) Ad.l.Y0(new Object[0], null, i.f46559Y, rVar2, 6);
        enumC1938a = EnumC1938a.f24018h0;
        enumC1938a2 = c1939b.f24023c;
        EnumC2323o enumC2323o3 = c1939b.f24024d;
        if (enumC1938a2 != enumC1938a) {
        }
        str2 = w11;
        C0426j c0426j22 = new C0426j(p9.r.f42840d, false, null);
        int i1922 = i14 >> 6;
        rVar2.W(-483455358);
        N a1022 = AbstractC0440y.a(c0426j22, C4310b.f37705r0, rVar2);
        rVar2.W(-1323940314);
        int i2022 = rVar2.P;
        AbstractC1732q0 p1022 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k22 = C0583l.f5804b;
        C3288a i2122 = androidx.compose.ui.layout.a.i(abstractC4326r4);
        if (rVar2.f22696a instanceof AbstractC1707e) {
        }
    }

    public static final void c(C1939b c1939b, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC4326r a5 = io.sentry.compose.b.a("CustomActionUserDetails");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-640625694);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(c1939b)) {
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
            if (rVar.g(abstractC4326r)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i17 = i12;
        if ((i17 & 731) == 146 && rVar.B()) {
            rVar.P();
        } else {
            if (i16 != 0) {
                abstractC4326r = a5;
            }
            C0421f c0421f = AbstractC0429m.f3907a;
            C0426j g10 = AbstractC0429m.g(p9.r.f42840d);
            rVar.W(1098475987);
            E.N c10 = L.c(g10, rVar);
            rVar.W(-1323940314);
            int i18 = rVar.P;
            AbstractC1732q0 p10 = rVar.p();
            AbstractC0584m.f5811i.getClass();
            C0582k c0582k = C0583l.f5804b;
            C3288a i19 = androidx.compose.ui.layout.a.i(abstractC4326r);
            if (rVar.f22696a instanceof AbstractC1707e) {
                rVar.Z();
                if (rVar.f22695O) {
                    rVar.o(c0582k);
                } else {
                    rVar.k0();
                }
                U3.f.n0(rVar, c10, C0583l.f5808f);
                U3.f.n0(rVar, p10, C0583l.f5807e);
                C0581j c0581j = C0583l.f5809g;
                if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i18))) {
                    AbstractC6463a.q(i18, rVar, i18, c0581j);
                }
                AbstractC6463a.r(0, i19, new L0(rVar), rVar, 2058660585);
                rVar.W(379771166);
                for (K k10 : c1939b.f24021a.f32023g) {
                    a(k10, kVar, c1939b, null, rVar, (i17 & 112) | 8 | ((i17 << 6) & 896), 8);
                }
                AbstractC6463a.v(rVar, false, false, true, false);
                rVar.t(false);
            } else {
                R4.b.r1();
                throw null;
            }
        }
        AbstractC4326r abstractC4326r2 = abstractC4326r;
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new j0(c1939b, kVar, abstractC4326r2, i10, i11, 8);
        }
    }

    public static final void d(C1939b c1939b, AbstractC6216a abstractC6216a, wf.k kVar, wf.k kVar2, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC3557B.c0("action", c1939b);
        AbstractC3557B.c0("onDismiss", abstractC6216a);
        AbstractC3557B.c0("onIntent", kVar);
        AbstractC3557B.c0("onActionClick", kVar2);
        L0.u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1754778204);
        if ((i10 & 14) == 0) {
            if (rVar.g(c1939b)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(abstractC6216a)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (rVar.i(kVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 7168) == 0) {
            if (rVar.i(kVar2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 5851) == 1170 && rVar.B()) {
            rVar.P();
        } else {
            rVar.W(-633985150);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object K10 = rVar.K();
            if (z10 || K10 == C1723m.f22654Y) {
                K10 = new C5605e(abstractC6216a, 1);
                rVar.h0(K10);
            }
            rVar.t(false);
            r9.y.e((AbstractC6216a) K10, new C2580o(false, 23), R4.b.X(rVar, -1490660947, new U(abstractC6216a, c1939b, kVar, kVar2, 9)), rVar, 432, 0);
        }
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1564i2(c1939b, abstractC6216a, kVar, kVar2, i10, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
        if (Lg.n.I2(r3, "application/vnd.ms-powerpoint", false) == true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00df, code lost:
        if (Lg.n.I2(r3, "application/vnd.openxmlformats-officedocument.presentationml.presentation", false) == true) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(P p10, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        AbstractC4326r abstractC4326r3;
        C1741v0 v10;
        String str;
        int i13;
        String str2;
        String str3;
        int i14;
        int i15;
        int i16;
        AbstractC4326r a5 = io.sentry.compose.b.a("AttachedFile");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(1658506591);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(p10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i10 | i16;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            abstractC4326r2 = abstractC4326r;
            if (rVar.g(abstractC4326r)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
            if ((i12 & 91) != 18 && rVar.B()) {
                rVar.P();
                abstractC4326r3 = abstractC4326r2;
            } else {
                if (i17 == 0) {
                    a5 = abstractC4326r2;
                }
                str = p10.f32028c;
                if (str == null && Lg.n.I2(str, "video/", false)) {
                    i13 = R.drawable.file_video;
                } else if (str == null && Lg.n.I2(str, "audio/", false)) {
                    i13 = R.drawable.file_audio;
                } else {
                    i14 = R.drawable.file_document;
                    if (str != null || !Lg.n.I2(str, "application/pdf", false)) {
                        if (str != null || !Lg.n.I2(str, "application/zip", false)) {
                            if ((str != null || !Lg.n.I2(str, "application/vnd.openxmlformats-officedocument", false)) && (str == null || !Lg.n.I2(str, "application/msword", false))) {
                                i14 = R.drawable.file_spreedsheet;
                                if ((str != null || !Lg.n.I2(str, "application/vnd.ms-excel", false)) && (str == null || !Lg.n.I2(str, "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", false))) {
                                    i14 = R.drawable.file_presentation;
                                    if (str != null) {
                                    }
                                    if (str != null) {
                                    }
                                }
                            }
                        }
                        i13 = R.drawable.file_blank;
                    }
                    i13 = i14;
                }
                AbstractC5824b F10 = kotlin.jvm.internal.m.F(i13, rVar);
                long j6 = ((P0) rVar.m(R0.f19593a)).f19539w;
                str2 = p10.f32026a;
                if (str2 == null) {
                    str2 = "";
                }
                str3 = p10.f32028c;
                if (str3 == null) {
                    str3 = "";
                }
                K8.d.O(false, F10, j6, str2, str3, null, a5, rVar, ((i12 << 15) & 3670016) | 196678, 0);
                abstractC4326r3 = a5;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new F.o(p10, abstractC4326r3, i10, i11, 18);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 91) != 18) {
        }
        if (i17 == 0) {
        }
        str = p10.f32028c;
        if (str == null) {
        }
        if (str == null) {
        }
        i14 = R.drawable.file_document;
        if (str != null) {
        }
        if (str != null) {
        }
        if (str != null) {
        }
        i14 = R.drawable.file_spreedsheet;
        if (str != null) {
        }
        i14 = R.drawable.file_presentation;
        if (str != null) {
        }
        if (str != null) {
        }
        i13 = R.drawable.file_blank;
        AbstractC5824b F102 = kotlin.jvm.internal.m.F(i13, rVar);
        long j62 = ((P0) rVar.m(R0.f19593a)).f19539w;
        str2 = p10.f32026a;
        if (str2 == null) {
        }
        str3 = p10.f32028c;
        if (str3 == null) {
        }
        K8.d.O(false, F102, j62, str2, str3, null, a5, rVar, ((i12 << 15) & 3670016) | 196678, 0);
        abstractC4326r3 = a5;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(P p10, wf.k kVar, AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n, int i10, int i11) {
        int i12;
        AbstractC4326r abstractC4326r2;
        C1741v0 v10;
        AbstractC4326r abstractC4326r3;
        boolean g10;
        Object K10;
        boolean z10;
        Object K11;
        boolean g11;
        Object K12;
        boolean g12;
        Object K13;
        boolean g13;
        Object K14;
        int i13;
        int i14;
        int i15;
        AbstractC4326r a5 = io.sentry.compose.b.a("AttachedImage");
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-345965971);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.g(p10)) {
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
            } else {
                if (i16 == 0) {
                    abstractC4326r3 = a5;
                } else {
                    abstractC4326r3 = abstractC4326r2;
                }
                String str = p10.f32027b;
                rVar.W(-1223272772);
                g10 = rVar.g(str);
                K10 = rVar.K();
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (!g10 || K10 == iVar) {
                    K10 = AbstractC4828h.Z(C3177e.f31218a, o1.f22665a);
                    rVar.h0(K10);
                }
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
                rVar.t(false);
                String v11 = H.v(R.string.conversation_image_content_description, rVar);
                f4.q a10 = C2936a.a((Context) rVar.m(Z.f6888b));
                boolean z11 = true;
                AbstractC4326r I12 = Bi.c.I1(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.j(abstractC4326r3, f46564a), ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19905b), !(((AbstractC3181i) abstractC1710f0.getValue()) instanceof C3180h), false);
                rVar.W(-1223272283);
                boolean g14 = rVar.g(str);
                if ((i12 & 112) != 32) {
                    z11 = false;
                }
                z10 = g14 | z11;
                K11 = rVar.K();
                if (!z10 || K11 == iVar) {
                    K11 = new C2615c(str, kVar);
                    rVar.h0(K11);
                }
                rVar.t(false);
                AbstractC4326r a11 = AbstractC4194d.a((X) a5, androidx.compose.foundation.a.h(I12, (AbstractC6216a) K11));
                C0452k c0452k = C0453l.f4073a;
                rVar.W(-1223272017);
                g11 = rVar.g(abstractC1710f0);
                K12 = rVar.K();
                if (!g11 || K12 == iVar) {
                    K12 = AbstractC6463a.h(abstractC1710f0, 11, rVar);
                }
                wf.k kVar2 = K12;
                rVar.t(false);
                rVar.W(-1223272053);
                g12 = rVar.g(abstractC1710f0);
                K13 = rVar.K();
                if (!g12 || K13 == iVar) {
                    K13 = AbstractC6463a.h(abstractC1710f0, 12, rVar);
                }
                wf.k kVar3 = K13;
                rVar.t(false);
                rVar.W(-1223272089);
                g13 = rVar.g(abstractC1710f0);
                K14 = rVar.K();
                if (!g13 || K14 == iVar) {
                    K14 = AbstractC6463a.h(abstractC1710f0, 13, rVar);
                }
                rVar.t(false);
                A7.b.c(p10.f32027b, v11, a10, a11, null, null, null, kVar2, kVar3, K14, null, c0452k, 0.0f, null, 0, false, null, rVar, 512, 48, 128112);
                abstractC4326r2 = abstractC4326r3;
            }
            v10 = rVar.v();
            if (v10 == null) {
                v10.f22739d = new j0(p10, kVar, abstractC4326r2, i10, i11, 7);
                return;
            }
            return;
        }
        abstractC4326r2 = abstractC4326r;
        if ((i12 & 731) != 146) {
        }
        if (i16 == 0) {
        }
        String str2 = p10.f32027b;
        rVar.W(-1223272772);
        g10 = rVar.g(str2);
        K10 = rVar.K();
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (!g10) {
        }
        K10 = AbstractC4828h.Z(C3177e.f31218a, o1.f22665a);
        rVar.h0(K10);
        AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) K10;
        rVar.t(false);
        String v112 = H.v(R.string.conversation_image_content_description, rVar);
        f4.q a102 = C2936a.a((Context) rVar.m(Z.f6888b));
        boolean z112 = true;
        AbstractC4326r I122 = Bi.c.I1(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.e.j(abstractC4326r3, f46564a), ((C1525a3) rVar.m(AbstractC1530b3.f19940a)).f19905b), !(((AbstractC3181i) abstractC1710f02.getValue()) instanceof C3180h), false);
        rVar.W(-1223272283);
        boolean g142 = rVar.g(str2);
        if ((i12 & 112) != 32) {
        }
        z10 = g142 | z112;
        K11 = rVar.K();
        if (!z10) {
        }
        K11 = new C2615c(str2, kVar);
        rVar.h0(K11);
        rVar.t(false);
        AbstractC4326r a112 = AbstractC4194d.a((X) a5, androidx.compose.foundation.a.h(I122, (AbstractC6216a) K11));
        C0452k c0452k2 = C0453l.f4073a;
        rVar.W(-1223272017);
        g11 = rVar.g(abstractC1710f02);
        K12 = rVar.K();
        if (!g11) {
        }
        K12 = AbstractC6463a.h(abstractC1710f02, 11, rVar);
        wf.k kVar22 = K12;
        rVar.t(false);
        rVar.W(-1223272053);
        g12 = rVar.g(abstractC1710f02);
        K13 = rVar.K();
        if (!g12) {
        }
        K13 = AbstractC6463a.h(abstractC1710f02, 12, rVar);
        wf.k kVar32 = K13;
        rVar.t(false);
        rVar.W(-1223272089);
        g13 = rVar.g(abstractC1710f02);
        K14 = rVar.K();
        if (!g13) {
        }
        K14 = AbstractC6463a.h(abstractC1710f02, 13, rVar);
        rVar.t(false);
        A7.b.c(p10.f32027b, v112, a102, a112, null, null, null, kVar22, kVar32, K14, null, c0452k2, 0.0f, null, 0, false, null, rVar, 512, 48, 128112);
        abstractC4326r2 = abstractC4326r3;
        v10 = rVar.v();
        if (v10 == null) {
        }
    }

    public static final boolean g(C1939b c1939b) {
        if (c1939b.f24023c == EnumC1938a.f24019i0) {
            if (c1939b.f24024d == EnumC2323o.f26406Y) {
                return true;
            }
        }
        return false;
    }
}
