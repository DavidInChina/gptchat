package hc;

import A.AbstractC0044t0;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E.C0426j;
import E.D0;
import E.g0;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import L.C0865o0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.L0;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import x8.W;
import y.AbstractC6463a;
import y.C6471i;

/* renamed from: hc.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3391f extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3391f f32194Y = new kotlin.jvm.internal.o(5);

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        g0 g0Var = (g0) obj;
        C3403s c3403s = (C3403s) obj2;
        wf.k kVar = (wf.k) obj3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", c3403s);
        AbstractC3557B.c0("onIntent", kVar);
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
            if (((Z.r) abstractC1725n).g(c3403s)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((intValue & 896) == 0) {
            if (((Z.r) abstractC1725n).i(kVar)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        int i15 = i10 & 5851;
        jf.y yVar = jf.y.f36177a;
        if (i15 == 1170) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return yVar;
            }
        }
        AbstractC4326r q10 = androidx.compose.foundation.layout.a.q(c4323o, g0Var);
        F0.i iVar = D0.f3761a;
        AbstractC4326r o10 = U3.f.o(q10, new C6471i(3, g0Var));
        float f6 = p9.r.f42841e;
        AbstractC4326r n10 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.t(o10, f6, 0.0f, 2));
        C0426j g10 = AbstractC0429m.g(f6);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-483455358);
        E0.N a5 = AbstractC0440y.a(g10, C4310b.f37705r0, rVar2);
        rVar2.W(-1323940314);
        int i16 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i17 = androidx.compose.ui.layout.a.i(n10);
        if (rVar2.f22696a instanceof AbstractC1707e) {
            rVar2.Z();
            if (rVar2.f22695O) {
                rVar2.o(c0582k);
            } else {
                rVar2.k0();
            }
            U3.f.n0(rVar2, a5, C0583l.f5808f);
            U3.f.n0(rVar2, p10, C0583l.f5807e);
            C0581j c0581j = C0583l.f5809g;
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i16))) {
                AbstractC6463a.q(i16, rVar2, i16, c0581j);
            }
            AbstractC6463a.r(0, i17, new L0(rVar2), rVar2, 2058660585);
            E.A a10 = E.A.f3733a;
            AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
            int ordinal = c3403s.f32216a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i11 = R.string.custom_instructions_model_message;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i11 = R.string.custom_instructions_user_message;
            }
            j4.b(Ng.H.v(i11, rVar2), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) rVar2.m(q4.f20361a)).f20306g, rVar2, 0, 0, 65534);
            rVar2.W(2107949453);
            Object K10 = rVar2.K();
            io.sentry.hints.i iVar2 = C1723m.f22654Y;
            if (K10 == iVar2) {
                K10 = new p0.l();
                rVar2.h0(K10);
            }
            p0.l lVar = (p0.l) K10;
            rVar2.t(false);
            rVar2.W(2107949581);
            if ((i10 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object K11 = rVar2.K();
            if (z10 || K11 == iVar2) {
                K11 = AbstractC0044t0.v(16, kVar, rVar2);
            }
            rVar2.t(false);
            A7.b.O(c3403s.f32218c, (wf.k) K11, androidx.compose.ui.focus.a.j(androidx.compose.foundation.layout.e.d(AbstractC0044t0.P(a10, c4323o), 1.0f), lVar), false, false, null, C0865o0.a(3, 0, 30), null, false, 0, 0, null, null, null, null, null, rVar2, 0, 0, 65464);
            rVar2.W(2107949994);
            Object K12 = rVar2.K();
            if (K12 == iVar2) {
                K12 = new C3390e(lVar, null);
                rVar2.h0(K12);
            }
            rVar2.t(false);
            AbstractC1734s.e(yVar, (wf.n) K12, rVar2);
            W.d(c3403s.f32216a, c3403s.f32218c.f16830a.f12512Y, androidx.compose.foundation.layout.e.d(c4323o, 1.0f), rVar2, 384, 0);
            AbstractC6463a.v(rVar2, false, true, false, false);
            return yVar;
        }
        R4.b.r1();
        throw null;
    }
}
