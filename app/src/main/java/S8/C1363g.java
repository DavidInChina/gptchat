package S8;

import E.g0;
import E.q0;
import H0.AbstractC0701r0;
import H0.W0;
import W.j4;
import Z.AbstractC1725n;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: S8.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1363g extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16321Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f16322Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1363g(String str, int i10) {
        super(3);
        this.f16321Y = i10;
        this.f16322Z = str;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f16321Y) {
            case 1:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("ConfirmationAlertDialog");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(this.f16322Z, a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 2:
                AbstractC3557B.c0("$this$OutlinedButton", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("NonComplianceDialog");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(this.f16322Z, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a11 = io.sentry.compose.b.a("UpgradeToPlusButton");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(this.f16322Z, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 4:
            case 5:
            case 6:
            default:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a12 = io.sentry.compose.b.a("WhisperMessageContent");
                if ((i10 & 81) == 16) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                j4.b(this.f16322Z, a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 7:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a13 = io.sentry.compose.b.a("CustomInstructionsIntroductionContent");
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                j4.b(this.f16322Z, a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    public final void c(M m10, AbstractC1725n abstractC1725n, int i10) {
        int i11 = 2;
        switch (this.f16321Y) {
            case 0:
                AbstractC3557B.c0("$this$CodeBlock", m10);
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(m10)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                L.c(m10, this.f16322Z, null, null, 0, false, 0, abstractC1725n, i10 & 14, 62);
                return;
            case 4:
                AbstractC3557B.c0("$this$RichText", m10);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(m10)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Z.r rVar3 = (Z.r) abstractC1725n;
                Q8.m.a(m10, this.f16322Z, null, new Q8.g((W0) rVar3.m(AbstractC0701r0.f7012o), 3), null, null, rVar3, i10 & 14, 26);
                return;
            default:
                AbstractC3557B.c0("$this$RichText", m10);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(m10)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                Q8.m.a(m10, R.a.t(new StringBuilder("```"), this.f16322Z, "\n```"), null, null, null, null, abstractC1725n, i10 & 14, 30);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        jf.y yVar = jf.y.f36177a;
        switch (this.f16321Y) {
            case 0:
                c((M) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 2:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 3:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 4:
                c((M) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 5:
                g0 g0Var = (g0) obj;
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("paddings", g0Var);
                C4323o c4323o = C4323o.f37719b;
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(g0Var)) {
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
                A7.b.M(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.n(c4323o, androidx.compose.foundation.a.l(abstractC1725n)), g0Var), p9.r.f42842f, 0.0f, 2), 0.0f, 0.0f, 0.0f, p9.r.f42847k, 7), R4.b.X(abstractC1725n, -969573898, new r9.r(this.f16322Z, 4)), abstractC1725n, 48, 0);
                return yVar;
            case 6:
                c((M) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 7:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
