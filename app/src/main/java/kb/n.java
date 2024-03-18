package Kb;

import Cd.X;
import E.AbstractC0441z;
import E.B0;
import E.C0412a0;
import E.G;
import E.U;
import E.g0;
import F.AbstractC0539m;
import F.J;
import H0.AbstractC0701r0;
import L0.u;
import Ng.H;
import Qg.D0;
import W.G3;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import com.openai.chatgpt.R;
import h.C3278d;
import id.AbstractC3557B;
import java.util.List;
import java.util.WeakHashMap;
import jf.y;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.AbstractC5102d;
import wf.AbstractC6216a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9614Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f9615Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f9616h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f9617i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f9618j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Object f9619k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ Object f9620l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ Object f9621m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p0.l lVar, J j6, AbstractC1710f0 abstractC1710f0, List list, Fb.f fVar, wf.k kVar, AbstractC6216a abstractC6216a) {
        super(3);
        this.f9617i0 = lVar;
        this.f9618j0 = j6;
        this.f9619k0 = abstractC1710f0;
        this.f9620l0 = list;
        this.f9621m0 = fVar;
        this.f9615Z = kVar;
        this.f9616h0 = abstractC6216a;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f9614Y;
        Object obj4 = this.f9621m0;
        Object obj5 = this.f9620l0;
        Object obj6 = this.f9619k0;
        Object obj7 = this.f9618j0;
        Object obj8 = this.f9617i0;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BottomSheet", (AbstractC0441z) obj);
                u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 81) == 16) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                r rVar2 = (r) abstractC1725n;
                rVar2.W(-2001276693);
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj6;
                Object K10 = rVar2.K();
                if (K10 == C1723m.f22654Y) {
                    K10 = AbstractC6463a.h(abstractC1710f0, 15, rVar2);
                }
                rVar2.t(false);
                K8.d.S((wf.k) K10, androidx.compose.ui.focus.a.j(c4323o, (p0.l) obj8), null, H.v(R.string.onboarding_select_country_code, rVar2), false, null, null, rVar2, 6, 116);
                rVar2.W(-49441252);
                WeakHashMap weakHashMap = B0.f3736v;
                B0 c10 = G.c(rVar2);
                rVar2.t(false);
                AbstractC0539m.a(androidx.compose.foundation.layout.e.f24739c, (J) obj7, new U(new C0412a0(c10.f3747k, 32), (Z0.b) rVar2.m(AbstractC0701r0.f7002e)), false, null, null, null, false, new C3278d((List) obj5, abstractC1710f0, (Fb.f) obj4, this.f9615Z, this.f9616h0, 5), rVar2, 6, 248);
                return yVar;
            default:
                g0 g0Var = (g0) obj;
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3557B.c0("it", g0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("VoiceModeScreenContent");
                if ((intValue2 & 14) == 0) {
                    if (((r) abstractC1725n2).g(g0Var)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 91) == 18) {
                    r rVar3 = (r) abstractC1725n2;
                    if (rVar3.B()) {
                        rVar3.P();
                        return yVar;
                    }
                }
                long j6 = AbstractC5102d.f42764a;
                X x10 = (X) obj4;
                AbstractC6216a abstractC6216a = this.f9616h0;
                G3.a(a5, null, j6, 0L, 0.0f, 0.0f, null, R4.b.X(abstractC1725n2, 1183868320, new Cd.H(this.f9615Z, g0Var, (Y.b) obj8, (D0) obj7, (Ld.c) obj6, (Ld.c) obj5, x10, abstractC6216a)), abstractC1725n2, 12582912, 123);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wf.k kVar, Y.b bVar, D0 d02, Ld.c cVar, Ld.c cVar2, X x10, AbstractC6216a abstractC6216a) {
        super(3);
        this.f9615Z = kVar;
        this.f9617i0 = bVar;
        this.f9618j0 = d02;
        this.f9619k0 = cVar;
        this.f9620l0 = cVar2;
        this.f9621m0 = x10;
        this.f9616h0 = abstractC6216a;
    }
}
