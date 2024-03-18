package A;

import N0.C1046e;
import W.M3;
import W.j4;
import Z.AbstractC1725n;
import Z.C1723m;
import com.openai.chatgpt.R;
import ic.C3551v;
import id.AbstractC3557B;
import ja.C3931c;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import q9.C5290g;
import qa.C5294d;
import t9.AbstractC5684a;
import wf.AbstractC6216a;
import y.C6471i;

/* loaded from: classes2.dex */
public final class V0 extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f124Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f125Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f126h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f127i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Ng.F f6, boolean z10, Z0 z02) {
        super(2);
        this.f124Y = 0;
        this.f126h0 = f6;
        this.f125Z = z10;
        this.f127i0 = z02;
    }

    public final Boolean a(float f6, float f10) {
        int i10 = this.f124Y;
        Object obj = this.f127i0;
        Object obj2 = this.f126h0;
        switch (i10) {
            case 0:
                Ad.l.O0((Ng.F) obj2, null, null, new U0(this.f125Z, (Z0) obj, f10, f6, null), 3);
                return Boolean.TRUE;
            default:
                if (this.f125Z) {
                    f6 = f10;
                }
                Ad.l.O0((Ng.F) obj2, null, null, new G.Y((G.V) obj, f6, null), 3);
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final void c(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        String str;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f124Y;
        boolean z11 = true;
        boolean z12 = this.f125Z;
        Object obj = this.f127i0;
        Object obj2 = this.f126h0;
        switch (i11) {
            case 2:
                AbstractC4326r a5 = io.sentry.compose.b.a("DeleteConfirmationDialog");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                if (z12) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    rVar2.W(-175123966);
                    C1046e G10 = Ad.l.G(R.string.conversations_conversation_delete_with_memory, rVar2);
                    AbstractC4326r t10 = androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42841e, 0.0f, 2);
                    N0.E a10 = N0.E.a(0, 0, 16777214, ((W.P0) rVar2.m(W.R0.f19593a)).f19533q, 0L, 0L, 0L, null, (N0.E) rVar2.m(j4.f20182a), null, null, null);
                    rVar2.W(-175123588);
                    AbstractC6216a abstractC6216a = (AbstractC6216a) obj2;
                    AbstractC6216a abstractC6216a2 = (AbstractC6216a) obj;
                    boolean g10 = rVar2.g(abstractC6216a) | rVar2.g(abstractC6216a2);
                    Object K10 = rVar2.K();
                    if (g10 || K10 == iVar) {
                        K10 = new s3.r(abstractC6216a, 20, abstractC6216a2);
                        rVar2.h0(K10);
                    }
                    rVar2.t(false);
                    AbstractC4828h.e(G10, t10, a10, false, 0, 0, null, (wf.k) K10, rVar2, 0, 120);
                    rVar2.t(false);
                    return;
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                rVar3.W(-175123435);
                j4.b(Ng.H.v(R.string.conversations_conversation_delete, rVar3), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131070);
                rVar3.t(false);
                return;
            case 3:
                AbstractC4326r a11 = io.sentry.compose.b.a("DisclosureContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                Ng.H.a((AbstractC6216a) obj2, AbstractC4194d.a((G0.X) a11, Bi.c.I1(androidx.compose.foundation.layout.e.d(c4323o, 1.0f), z12, false)), false, null, null, null, null, null, null, R4.b.X(abstractC1725n, 735617955, new C6471i(11, (C5294d) obj)), abstractC1725n, 805306368, 508);
                return;
            case 4:
                AbstractC4326r a12 = io.sentry.compose.b.a("GizmoAccountListItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                Wa.m mVar = (Wa.m) obj2;
                if (mVar.f20858b == Wa.a.f20837Y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(1464777776);
                wf.k kVar = (wf.k) obj;
                boolean h10 = rVar6.h(z10) | rVar6.g(kVar) | rVar6.g(mVar);
                Object K11 = rVar6.K();
                if (h10 || K11 == iVar) {
                    K11 = new L.N(z10, kVar, mVar, 3);
                    rVar6.h0(K11);
                }
                rVar6.t(false);
                Ng.H.d((AbstractC6216a) K11, a12, z10, null, null, null, null, null, null, R4.b.X(rVar6, -2108561020, new C5290g(1, z12, z10)), rVar6, 805306368, 506);
                return;
            case 5:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                Z.r rVar8 = (Z.r) abstractC1725n;
                rVar8.W(984533227);
                wf.k kVar2 = (wf.k) obj2;
                boolean g11 = rVar8.g(kVar2);
                Object K12 = rVar8.K();
                if (g11 || K12 == iVar) {
                    K12 = AbstractC0044t0.v(18, kVar2, rVar8);
                }
                wf.k kVar3 = K12;
                rVar8.t(false);
                if (((C3551v) obj).f33066a != null) {
                    z11 = false;
                }
                M3.a(this.f125Z, kVar3, Bi.c.I1(c4323o, z11, false), null, false, null, null, rVar8, 0, 120);
                return;
            default:
                AbstractC4326r a13 = io.sentry.compose.b.a("ConversationPreviewCard");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                if (!z12) {
                    Object[] objArr = new Object[2];
                    C3931c c3931c = (C3931c) obj2;
                    String str2 = null;
                    if (c3931c != null) {
                        str = c3931c.f36092a;
                    } else {
                        str = null;
                    }
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    rVar10.W(-1897685287);
                    if (str == null) {
                        str = Ng.H.v(R.string.anonymous_user, rVar10);
                    }
                    rVar10.t(false);
                    objArr[0] = str;
                    Yg.p pVar = (Yg.p) obj;
                    if (pVar != null) {
                        Yg.r rVar11 = AbstractC5684a.f45797a;
                        Yg.w.Companion.getClass();
                        str2 = AbstractC5684a.f45798b.format(P4.a.M0(pVar, Yg.v.a()).f22423Y);
                        AbstractC3557B.b0("format(...)", str2);
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[1] = str2;
                    j4.b(Ng.H.w(R.string.share_screen_subtitle_format, objArr, rVar10), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar10, 0, 0, 131070);
                    return;
                }
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f124Y) {
            case 0:
                return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            case 1:
                return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            case 2:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Wa.m mVar, wf.k kVar, boolean z10) {
        super(2);
        this.f124Y = 4;
        this.f126h0 = mVar;
        this.f127i0 = kVar;
        this.f125Z = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V0(boolean z10, Object obj, Object obj2, int i10) {
        super(2);
        this.f124Y = i10;
        this.f125Z = z10;
        this.f126h0 = obj;
        this.f127i0 = obj2;
    }
}
