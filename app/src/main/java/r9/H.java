package r9;

import Df.AbstractC0408g;
import E.AbstractC0441z;
import E.q0;
import G0.X;
import Mb.Q0;
import W.P0;
import W.Q3;
import W.R0;
import W.j4;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import ab.AbstractC1953g;
import ab.C1957k;
import cb.C2379t;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import na.AbstractC4768l;
import na.D0;
import na.D1;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class H extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44500Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f44501Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f44502h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f44503i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f44504j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f44505k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC0408g abstractC0408g, D1 d12, AbstractC1710f0 abstractC1710f0, AbstractC1710f0 abstractC1710f02, AbstractC6216a abstractC6216a) {
        super(3);
        this.f44503i0 = abstractC0408g;
        this.f44504j0 = d12;
        this.f44501Z = abstractC1710f0;
        this.f44505k0 = abstractC1710f02;
        this.f44502h0 = abstractC6216a;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f44500Y;
        Object obj = this.f44504j0;
        Object obj2 = this.f44502h0;
        Object obj3 = this.f44505k0;
        Object obj4 = this.f44501Z;
        Object obj5 = this.f44503i0;
        switch (i11) {
            case 2:
                AbstractC3557B.c0("$this$DropdownMenu", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("GizmoActionsListItem");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                wf.k kVar = (wf.k) obj3;
                Wa.m mVar = (Wa.m) obj2;
                C2379t c2379t = (C2379t) obj5;
                String str = (String) obj;
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj4;
                Df.H.g(AbstractC1953g.f24098g, new C1957k(kVar, mVar, c2379t, str, abstractC1710f0, 0), a5, null, null, false, null, null, null, abstractC1725n, 6, 508);
                Df.H.g(AbstractC1953g.f24099h, new C1957k(kVar, mVar, c2379t, str, abstractC1710f0, 1), a5, null, null, false, null, null, null, abstractC1725n, 6, 508);
                return;
            default:
                AbstractC3557B.c0("$this$BaseOnboardingScreen", abstractC0441z);
                AbstractC4326r a10 = io.sentry.compose.b.a("VerifyPhoneScreenContent");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                Q0 q02 = (Q0) obj5;
                String str2 = q02.f11829a;
                if (str2 == null) {
                    str2 = "";
                }
                objArr[0] = Lg.o.a3(2, str2);
                j4.b(Ng.H.w(R.string.onboarding_verify_phone_subtitle, objArr, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                float f6 = p9.r.f42845i;
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, f6), abstractC1725n);
                K8.d.P(AbstractC4194d.a((X) a10, androidx.compose.ui.focus.a.j(c4323o, (p0.l) obj4)), (wf.k) obj3, (AbstractC6216a) obj2, q02.f11830b, 0, abstractC1725n, 0, 16);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, f6), abstractC1725n);
                Ng.H.f((AbstractC6216a) obj, a10, false, null, null, null, null, androidx.compose.foundation.layout.a.b(0.0f, 3), null, Jb.j.f8999a, abstractC1725n, 817889280, 382);
                if (q02.f11832d) {
                    androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.e(c4323o, f6), abstractC1725n);
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    Ad.l.p(Ad.l.G(R.string.onboarding_phone_verification_help, abstractC1725n), a10, N0.E.a(0, 0, 16777214, ((P0) rVar3.m(R0.f19593a)).f19533q, 0L, 0L, 0L, null, (N0.E) rVar3.m(j4.f20182a), null, null, null), rVar3, 0, 2);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3288a c3288a;
        int i10;
        D1 d12;
        boolean z10;
        boolean z11;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f44500Y;
        Object obj4 = this.f44502h0;
        Object obj5 = this.f44505k0;
        Object obj6 = this.f44501Z;
        Object obj7 = this.f44504j0;
        Object obj8 = this.f44503i0;
        switch (i11) {
            case 0:
                wf.n nVar = (wf.n) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("innerTextField", nVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).i(nVar)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue |= i10;
                }
                if ((intValue & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                Q3 q32 = Q3.f19588a;
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj6;
                String str = (String) abstractC1710f0.getValue();
                A9.a aVar = T0.H.f16758a;
                AbstractC6216a abstractC6216a = (AbstractC6216a) obj4;
                if (abstractC6216a != null) {
                    c3288a = R4.b.X(abstractC1725n, -1750457850, new C5383F(abstractC6216a, 0));
                } else {
                    c3288a = null;
                }
                q32.b(str, nVar, true, true, aVar, (D.m) obj8, false, null, R4.b.X(abstractC1725n, 1659690291, new r((String) obj7, 2)), c3288a, R4.b.X(abstractC1725n, 540079428, new androidx.compose.foundation.layout.c(abstractC1710f0, 15, (wf.k) obj5)), null, null, null, null, null, null, AbstractC5395l.f44576c, abstractC1725n, ((intValue << 3) & 112) | 100887936, 113246214, 129216);
                return yVar;
            case 1:
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$TopAppBar", (q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("ConversationTopBar");
                if ((intValue2 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                Z.r rVar3 = (Z.r) abstractC1725n2;
                rVar3.W(-91076515);
                AbstractC0408g abstractC0408g = (AbstractC0408g) obj8;
                boolean g10 = rVar3.g(abstractC0408g);
                Object K10 = rVar3.K();
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (g10 || K10 == iVar) {
                    K10 = AbstractC6463a.g(abstractC0408g, 8, rVar3);
                }
                rVar3.t(false);
                R4.b.o((AbstractC6216a) K10, a5, !d12.f39771j.isEmpty(), null, null, AbstractC4768l.f40019a, rVar3, 196608, 26);
                rVar3.W(-91076255);
                zd.n nVar2 = ((D1) obj7).f39780s;
                if (nVar2 != null) {
                    z10 = nVar2.f51982a;
                } else {
                    z10 = false;
                }
                if (z10) {
                    rVar3.W(-91076149);
                    boolean g11 = rVar3.g(abstractC0408g);
                    Object K11 = rVar3.K();
                    if (g11 || K11 == iVar) {
                        K11 = AbstractC6463a.g(abstractC0408g, 9, rVar3);
                    }
                    z11 = false;
                    rVar3.t(false);
                    D0.c((AbstractC6216a) K11, rVar3, 0);
                } else {
                    z11 = false;
                }
                rVar3.t(z11);
                rVar3.W(-91076007);
                AbstractC1710f0 abstractC1710f02 = (AbstractC1710f0) obj6;
                boolean g12 = rVar3.g(abstractC1710f02);
                Object K12 = rVar3.K();
                if (g12 || K12 == iVar) {
                    K12 = R.a.o(abstractC1710f02, 9, rVar3);
                }
                AbstractC6216a abstractC6216a2 = K12;
                rVar3.t(false);
                rVar3.W(-91075946);
                AbstractC1710f0 abstractC1710f03 = (AbstractC1710f0) obj5;
                boolean g13 = rVar3.g(abstractC1710f03);
                Object K13 = rVar3.K();
                if (g13 || K13 == iVar) {
                    K13 = R.a.o(abstractC1710f03, 10, rVar3);
                }
                rVar3.t(false);
                D0.b(abstractC6216a2, K13, (AbstractC6216a) obj4, a5, null, rVar3, 0, 24);
                return yVar;
            case 2:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Q0 q02, p0.l lVar, wf.k kVar, AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2) {
        super(3);
        this.f44503i0 = q02;
        this.f44501Z = lVar;
        this.f44505k0 = kVar;
        this.f44502h0 = abstractC6216a;
        this.f44504j0 = abstractC6216a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC6216a abstractC6216a, D.m mVar, AbstractC1710f0 abstractC1710f0, String str, wf.k kVar) {
        super(3);
        this.f44502h0 = abstractC6216a;
        this.f44503i0 = mVar;
        this.f44501Z = abstractC1710f0;
        this.f44504j0 = str;
        this.f44505k0 = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(wf.k kVar, Wa.m mVar, C2379t c2379t, String str, AbstractC1710f0 abstractC1710f0) {
        super(3);
        this.f44505k0 = kVar;
        this.f44502h0 = mVar;
        this.f44503i0 = c2379t;
        this.f44504j0 = str;
        this.f44501Z = abstractC1710f0;
    }
}
