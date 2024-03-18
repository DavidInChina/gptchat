package ic;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0434s;
import E.AbstractC0440y;
import E.C0423g;
import F.AbstractC0539m;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import N0.C1046e;
import W.E1;
import W.P0;
import W.R0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4316h;
import l0.C4318j;
import l0.C4323o;
import nf.AbstractC4828h;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: ic.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3538h extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3538h f33044Y = new kotlin.jvm.internal.o(5);

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
        if (id.AbstractC3557B.K(r12.K(), java.lang.Integer.valueOf(r9)) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x053f  */
    @Override // wf.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        boolean z10;
        C0581j c0581j;
        boolean z11;
        P p10;
        wf.k kVar;
        List list;
        Boolean bool;
        int i11;
        io.sentry.hints.i iVar;
        U.n nVar;
        boolean z12;
        C0581j c0581j2;
        C0581j c0581j3;
        Boolean bool2;
        wf.k kVar2;
        P p11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        int i13;
        int i14;
        E.g0 g0Var = (E.g0) obj;
        P p12 = (P) obj2;
        wf.k kVar3 = (wf.k) obj3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", p12);
        AbstractC3557B.c0("onIntent", kVar3);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(g0Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((Z.r) abstractC1725n).g(p12)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((intValue & 896) == 0) {
            if (((Z.r) abstractC1725n).i(kVar3)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i10 & 5851) == 1170) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-224017649);
        int i15 = i10 & 896;
        if (i15 == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object K10 = rVar2.K();
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (z10 || K10 == iVar2) {
            K10 = AbstractC6463a.o(24, kVar3, rVar2);
        }
        rVar2.t(false);
        boolean z19 = p12.f32963c;
        U.n f02 = AbstractC4828h.f0(z19, (AbstractC6216a) K10, rVar2);
        AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
        rVar2.W(-483455358);
        C0423g c0423g = AbstractC0429m.f3909c;
        C4316h c4316h = C4310b.f37705r0;
        E0.N a5 = AbstractC0440y.a(c0423g, c4316h, rVar2);
        rVar2.W(-1323940314);
        int i16 = rVar2.P;
        AbstractC1732q0 p13 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i17 = androidx.compose.ui.layout.a.i(q10);
        boolean z20 = rVar2.f22696a instanceof AbstractC1707e;
        if (z20) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            C0581j c0581j4 = C0583l.f5808f;
            U3.f.n0(rVar2, a5, c0581j4);
            C0581j c0581j5 = C0583l.f5807e;
            U3.f.n0(rVar2, p13, c0581j5);
            C0581j c0581j6 = C0583l.f5809g;
            if (!rVar2.f22695O) {
                c0581j = c0581j4;
            } else {
                c0581j = c0581j4;
            }
            AbstractC6463a.q(i16, rVar2, i16, c0581j6);
            AbstractC6463a.r(0, i17, new L0(rVar2), rVar2, 2058660585);
            E.A a10 = E.A.f3733a;
            AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
            rVar2.W(1722837531);
            Boolean bool3 = Boolean.FALSE;
            int i18 = i10;
            Boolean bool4 = p12.f32961a;
            boolean K11 = AbstractC3557B.K(bool4, bool3);
            boolean z21 = p12.f32962b;
            List list2 = p12.f32964d;
            if (!K11) {
                rVar2.W(1722837630);
                if (i15 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                Object K12 = rVar2.K();
                if (z17 || K12 == iVar2) {
                    K12 = AbstractC0044t0.v(19, kVar3, rVar2);
                }
                wf.k kVar4 = (wf.k) K12;
                rVar2.t(false);
                p10 = p12;
                AbstractC4326r v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42840d, 0.0f, 2), 0.0f, 0.0f, 0.0f, p9.r.f42839c, 7);
                String v11 = Ng.H.v(R.string.settings_memory_view_search, rVar2);
                if (!z21 && !z19 && (!list2.isEmpty())) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                c0581j2 = c0581j5;
                bool = bool3;
                z11 = z21;
                kVar = kVar3;
                list = list2;
                nVar = f02;
                z12 = z20;
                c0581j3 = c0581j;
                i11 = 2058660585;
                iVar = iVar2;
                K8.d.S(kVar4, v10, null, v11, z18, null, null, rVar2, 0, 100);
            } else {
                z11 = z21;
                p10 = p12;
                kVar = kVar3;
                list = list2;
                bool = bool3;
                i11 = 2058660585;
                iVar = iVar2;
                nVar = f02;
                z12 = z20;
                c0581j2 = c0581j5;
                c0581j3 = c0581j;
            }
            rVar2.t(false);
            AbstractC4326r S02 = r9.y.S0(AbstractC0044t0.P(a10, c4323o), nVar);
            rVar2.W(733328855);
            C4318j c4318j = C4310b.f37693Y;
            E0.N c10 = AbstractC0434s.c(c4318j, false, rVar2);
            rVar2.W(-1323940314);
            int i19 = rVar2.P;
            AbstractC1732q0 p14 = rVar2.p();
            C3288a i20 = androidx.compose.ui.layout.a.i(S02);
            if (z12) {
                rVar2.Z();
                if (rVar2.f22695O) {
                    rVar2.o(c0582k);
                } else {
                    rVar2.k0();
                }
                U3.f.n0(rVar2, c10, c0581j3);
                C0581j c0581j7 = c0581j2;
                U3.f.n0(rVar2, p14, c0581j7);
                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i19))) {
                    AbstractC6463a.q(i19, rVar2, i19, c0581j6);
                }
                AbstractC6463a.r(0, i20, new L0(rVar2), rVar2, i11);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                AbstractC4326r a12 = AbstractC4194d.a((G0.X) io.sentry.compose.b.a("<anonymous>"), androidx.compose.foundation.layout.e.f24739c);
                boolean K13 = AbstractC3557B.K(bool4, bool);
                C4318j c4318j2 = C4310b.f37697j0;
                if (K13) {
                    rVar2.W(307833451);
                    rVar2.W(733328855);
                    E0.N c11 = AbstractC0434s.c(c4318j, false, rVar2);
                    rVar2.W(-1323940314);
                    int i21 = rVar2.P;
                    AbstractC1732q0 p15 = rVar2.p();
                    C3288a i22 = androidx.compose.ui.layout.a.i(a12);
                    if (z12) {
                        rVar2.Z();
                        bool2 = bool4;
                        if (rVar2.f22695O) {
                            rVar2.o(c0582k);
                        } else {
                            rVar2.k0();
                        }
                        U3.f.n0(rVar2, c11, c0581j3);
                        U3.f.n0(rVar2, p15, c0581j7);
                        if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i21))) {
                            AbstractC6463a.q(i21, rVar2, i21, c0581j6);
                        }
                        AbstractC6463a.r(0, i22, new L0(rVar2), rVar2, 2058660585);
                        AbstractC4326r a13 = AbstractC4194d.a((G0.X) io.sentry.compose.b.a("<anonymous>"), androidx.compose.foundation.layout.a.r(bVar.a(c4323o, c4318j2), p9.r.f42841e));
                        C1046e G10 = Ad.l.G(R.string.settings_memory_view_disabled, rVar2);
                        N0.E a14 = N0.E.a(3, 0, 16744446, ((P0) rVar2.m(R0.f19593a)).f19529m, 0L, 0L, 0L, null, ((p4) rVar2.m(q4.f20361a)).f20309j, null, null, null);
                        rVar2.W(-55426954);
                        if (i15 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        Object K14 = rVar2.K();
                        if (!z16 && K14 != iVar) {
                            kVar2 = kVar;
                        } else {
                            kVar2 = kVar;
                            K14 = AbstractC0044t0.v(20, kVar2, rVar2);
                        }
                        rVar2.t(false);
                        AbstractC4828h.e(G10, a13, a14, false, 0, 0, null, (wf.k) K14, rVar2, 0, 120);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        rVar2.t(false);
                    } else {
                        R4.b.r1();
                        throw null;
                    }
                } else {
                    bool2 = bool4;
                    io.sentry.hints.i iVar3 = iVar;
                    kVar2 = kVar;
                    if (z11) {
                        rVar2.W(307834211);
                        rVar2.W(-483455358);
                        E0.N a15 = AbstractC0440y.a(c0423g, c4316h, rVar2);
                        rVar2.W(-1323940314);
                        int i23 = rVar2.P;
                        AbstractC1732q0 p16 = rVar2.p();
                        C3288a i24 = androidx.compose.ui.layout.a.i(a12);
                        if (z12) {
                            rVar2.Z();
                            if (rVar2.f22695O) {
                                rVar2.o(c0582k);
                            } else {
                                rVar2.k0();
                            }
                            U3.f.n0(rVar2, a15, c0581j3);
                            U3.f.n0(rVar2, p16, c0581j7);
                            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i23))) {
                                AbstractC6463a.q(i23, rVar2, i23, c0581j6);
                            }
                            AbstractC6463a.r(0, i24, new L0(rVar2), rVar2, 2058660585);
                            rVar2.W(307834261);
                            for (int i25 = 0; i25 < 5; i25++) {
                                E1.a(AbstractC3539i.f33049b, null, null, null, null, null, null, 0.0f, 0.0f, rVar2, 6, 510);
                            }
                            AbstractC6463a.v(rVar2, false, false, true, false);
                            rVar2.t(false);
                            rVar2.t(false);
                        } else {
                            R4.b.r1();
                            throw null;
                        }
                    } else {
                        if (list.isEmpty()) {
                            rVar2.W(307834781);
                            rVar2.W(733328855);
                            E0.N c12 = AbstractC0434s.c(c4318j, false, rVar2);
                            rVar2.W(-1323940314);
                            int i26 = rVar2.P;
                            AbstractC1732q0 p17 = rVar2.p();
                            C3288a i27 = androidx.compose.ui.layout.a.i(a12);
                            if (z12) {
                                rVar2.Z();
                                if (rVar2.f22695O) {
                                    rVar2.o(c0582k);
                                } else {
                                    rVar2.k0();
                                }
                                U3.f.n0(rVar2, c12, c0581j3);
                                U3.f.n0(rVar2, p17, c0581j7);
                                if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i26))) {
                                    AbstractC6463a.q(i26, rVar2, i26, c0581j6);
                                }
                                AbstractC6463a.r(0, i27, new L0(rVar2), rVar2, 2058660585);
                                p11 = p10;
                                j4.b(Ng.H.w(R.string.settings_memory_view_empty, new Object[]{r9.y.p0(p11.f32968h, rVar2)}, rVar2), androidx.compose.foundation.layout.a.r(bVar.a(c4323o, c4318j2), p9.r.f42841e), ((P0) rVar2.m(R0.f19593a)).f19529m, 0L, null, null, null, 0L, null, new Y0.i(3), 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20309j, rVar2, 0, 0, 65016);
                                AbstractC6463a.v(rVar2, false, true, false, false);
                                rVar2.t(false);
                            } else {
                                R4.b.r1();
                                throw null;
                            }
                        } else {
                            p11 = p10;
                            rVar2.W(307835494);
                            rVar2.W(307835522);
                            if ((i18 & 112) == 32) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i15 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean z22 = z14 | z15;
                            Object K15 = rVar2.K();
                            if (z22 || K15 == iVar3) {
                                K15 = new Ra.l(p11, 21, kVar2);
                                rVar2.h0(K15);
                            }
                            rVar2.t(false);
                            AbstractC0539m.a(a12, null, null, false, null, null, null, false, (wf.k) K15, rVar2, 6, 254);
                            rVar2.t(false);
                        }
                        U.f.a(p11.f32963c, nVar, bVar.a(c4323o, C4310b.f37694Z), 0L, 0L, false, rVar2, 64, 56);
                        AbstractC6463a.v(rVar2, false, true, false, false);
                        rVar2.W(-224013082);
                        if (AbstractC3557B.K(bool2, Boolean.FALSE)) {
                            if (!list.isEmpty()) {
                                int i28 = i18 >> 3;
                                r9.y.A(p11, kVar2, a11, rVar2, (i28 & 14) | (i28 & 112), 4);
                            }
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        AbstractC6463a.v(rVar2, false, false, z13, false);
                        rVar2.t(false);
                        return jf.y.f36177a;
                    }
                }
                p11 = p10;
                U.f.a(p11.f32963c, nVar, bVar.a(c4323o, C4310b.f37694Z), 0L, 0L, false, rVar2, 64, 56);
                AbstractC6463a.v(rVar2, false, true, false, false);
                rVar2.W(-224013082);
                if (AbstractC3557B.K(bool2, Boolean.FALSE)) {
                }
                AbstractC6463a.v(rVar2, false, false, z13, false);
                rVar2.t(false);
                return jf.y.f36177a;
            }
            R4.b.r1();
            throw null;
        }
        R4.b.r1();
        throw null;
    }
}
