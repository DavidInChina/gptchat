package ic;

import A.V0;
import E.AbstractC0429m;
import E.AbstractC0440y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.E1;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.C1723m;
import Z.L0;
import com.openai.chatgpt.R;
import com.openai.experiment.ExperimentKey;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* renamed from: ic.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3533c extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3533c f33006Y = new kotlin.jvm.internal.o(5);

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
        E.g0 g0Var = (E.g0) obj;
        C3551v c3551v = (C3551v) obj2;
        wf.k kVar = (wf.k) obj3;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("paddings", g0Var);
        AbstractC3557B.c0("state", c3551v);
        AbstractC3557B.c0("onIntent", kVar);
        C4323o c4323o = C4323o.f37719b;
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 14) == 0) {
            if (((Z.r) abstractC1725n).g(g0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | intValue;
        } else {
            i10 = intValue;
        }
        if ((intValue & 112) == 0) {
            if (((Z.r) abstractC1725n).g(c3551v)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((intValue & 896) == 0) {
            if (((Z.r) abstractC1725n).i(kVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC4326r n10 = androidx.compose.foundation.a.n(androidx.compose.foundation.layout.a.q(c4323o, g0Var), androidx.compose.foundation.a.l(abstractC1725n));
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-483455358);
        E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar2);
        rVar2.W(-1323940314);
        int i14 = rVar2.P;
        AbstractC1732q0 p10 = rVar2.p();
        AbstractC0584m.f5811i.getClass();
        C0582k c0582k = C0583l.f5804b;
        C3288a i15 = androidx.compose.ui.layout.a.i(n10);
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
            if (rVar2.f22695O || !AbstractC3557B.K(rVar2.K(), Integer.valueOf(i14))) {
                AbstractC6463a.q(i14, rVar2, i14, c0581j);
            }
            AbstractC6463a.r(0, i15, new L0(rVar2), rVar2, 2058660585);
            C3288a c3288a = AbstractC3534d.f33010b;
            rVar2.W(1502781670);
            int i16 = i10 & 896;
            if (i16 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object K10 = rVar2.K();
            io.sentry.hints.i iVar = C1723m.f22654Y;
            if (z10 || K10 == iVar) {
                K10 = AbstractC6463a.o(22, kVar, rVar2);
            }
            rVar2.t(false);
            E1.a(c3288a, androidx.compose.foundation.a.h(c4323o, (AbstractC6216a) K10), null, null, null, R4.b.X(rVar2, 957252867, new Jb.c(5, c3551v)), null, 0.0f, 0.0f, rVar2, 196614, 476);
            Boolean bool = c3551v.f33066a;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = false;
            }
            C3288a c3288a2 = AbstractC3534d.f33011c;
            rVar2.W(1502782718);
            if (i16 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean h10 = z12 | rVar2.h(z11);
            Object K11 = rVar2.K();
            if (h10 || K11 == iVar) {
                K11 = new J.e(kVar, z11, 2);
                rVar2.h0(K11);
            }
            rVar2.t(false);
            E1.a(c3288a2, androidx.compose.foundation.a.h(c4323o, (AbstractC6216a) K11), null, null, null, R4.b.X(rVar2, -250892934, new V0(z11, kVar, c3551v, 5)), null, 0.0f, 0.0f, rVar2, 196614, 476);
            float f6 = p9.r.f42841e;
            androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, f6), rVar2);
            Ad.l.p(Ad.l.G(R.string.settings_memory_description, rVar2), androidx.compose.foundation.layout.a.t(c4323o, f6, 0.0f, 2), N0.E.a(0, 0, 16777214, ((P0) rVar2.m(R0.f19593a)).f19533q, 0L, 0L, 0L, null, (N0.E) rVar2.m(j4.f20182a), null, null, null), rVar2, 0, 0);
            boolean M02 = L4.a.M0(ExperimentKey.MemoryViewEnabled.INSTANCE, rVar2);
            rVar2.W(2058066905);
            if (M02) {
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, f6), rVar2);
                rVar2.W(1502783751);
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object K12 = rVar2.K();
                if (z13 || K12 == iVar) {
                    K12 = AbstractC6463a.o(23, kVar, rVar2);
                }
                rVar2.t(false);
                Ng.H.d((AbstractC6216a) K12, androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), f6, 0.0f, 2), false, null, null, null, null, null, null, AbstractC3534d.f33012d, rVar2, 805306368, 508);
            }
            AbstractC6463a.v(rVar2, false, false, true, false);
            rVar2.t(false);
            return jf.y.f36177a;
        }
        R4.b.r1();
        throw null;
    }
}
