package d1;

import Ng.H;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import Z.O;
import Z.l1;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.openai.chatgpt.R;
import kb.AbstractC4208B;
import l0.AbstractC4326r;
import q1.AbstractC5260f;
import r0.N;
import r9.y;
import u0.AbstractC5824b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* renamed from: d1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2568c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27854Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l1 f27855Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2568c(l1 l1Var, int i10) {
        super(2);
        this.f27854Y = i10;
        this.f27855Z = l1Var;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        long j6;
        long j10;
        int i11 = this.f27854Y;
        l1 l1Var = this.f27855Z;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                ((wf.n) l1Var.getValue()).invoke(abstractC1725n, 0);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                y.M(new AppendedSemanticsElement(C2567b.f27847Z, false), R4.b.X(abstractC1725n, -533674951, new C2568c(l1Var, 0)), abstractC1725n, 48, 0);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                O o10 = AbstractC2575j.f27874a;
                ((wf.n) l1Var.getValue()).invoke(abstractC1725n, 0);
                return;
            case 3:
                AbstractC4326r a5 = io.sentry.compose.b.a("InPaintingActionBar");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC5824b F10 = kotlin.jvm.internal.m.F(R.drawable.undo, abstractC1725n);
                String v10 = H.v(R.string.conversation_image_edit_undo, abstractC1725n);
                float f6 = AbstractC4208B.f37219b;
                if (((Boolean) l1Var.getValue()).booleanValue()) {
                    j6 = r0.r.f44258f;
                } else {
                    j6 = AbstractC4208B.f37221d;
                }
                AbstractC1607r1.a(F10, v10, a5, j6, abstractC1725n, 8, 4);
                return;
            case 4:
                AbstractC4326r a10 = io.sentry.compose.b.a("InPaintingActionBar");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                AbstractC5824b F11 = kotlin.jvm.internal.m.F(R.drawable.redo, abstractC1725n);
                String v11 = H.v(R.string.conversation_image_edit_redo, abstractC1725n);
                float f10 = AbstractC4208B.f37219b;
                if (((Boolean) l1Var.getValue()).booleanValue()) {
                    j10 = r0.r.f44258f;
                } else {
                    j10 = AbstractC4208B.f37221d;
                }
                AbstractC1607r1.a(F11, v11, a10, j10, abstractC1725n, 8, 4);
                return;
            case 5:
                AbstractC4326r a11 = io.sentry.compose.b.a("LoginScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                C5953f c5953f = AbstractC5260f.f43652c;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Filled.LibraryAddCheck", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(20.0f, 2.0f);
                    pVar.n(8.0f, 2.0f);
                    pVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                    pVar.x(12.0f);
                    pVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    pVar.m(12.0f);
                    pVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    pVar.n(22.0f, 4.0f);
                    pVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    pVar.f();
                    pVar.p(12.47f, 14.0f);
                    pVar.n(9.0f, 10.5f);
                    pVar.o(1.4f, -1.41f);
                    pVar.o(2.07f, 2.08f);
                    pVar.n(17.6f, 6.0f);
                    E9.f.C(pVar, 19.0f, 7.41f, 12.47f, 14.0f);
                    pVar.p(4.0f, 6.0f);
                    pVar.n(2.0f, 6.0f);
                    pVar.x(14.0f);
                    pVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    pVar.m(14.0f);
                    pVar.x(-2.0f);
                    pVar.n(4.0f, 20.0f);
                    pVar.n(4.0f, 6.0f);
                    pVar.f();
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    AbstractC5260f.f43652c = c5953f;
                }
                AbstractC1607r1.a(R4.b.R1(c5953f, abstractC1725n), null, a11, ((r0.r) l1Var.getValue()).f44265a, abstractC1725n, 56, 4);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("LoginScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar7 = (Z.r) abstractC1725n;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                }
                C5953f c5953f2 = L4.a.f10739e;
                if (c5953f2 == null) {
                    C5952e c5952e2 = new C5952e("Filled.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i13 = AbstractC5944H.f46870a;
                    N n11 = new N(r0.r.f44254b);
                    Wh.p pVar2 = new Wh.p(0);
                    pVar2.p(22.7f, 19.0f);
                    pVar2.o(-9.1f, -9.1f);
                    pVar2.h(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
                    pVar2.h(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
                    pVar2.n(9.0f, 6.0f);
                    pVar2.n(6.0f, 9.0f);
                    pVar2.n(1.6f, 4.7f);
                    pVar2.g(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
                    pVar2.h(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
                    pVar2.o(9.1f, 9.1f);
                    pVar2.h(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
                    pVar2.o(2.3f, -2.3f);
                    pVar2.h(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
                    pVar2.f();
                    C5952e.b(c5952e2, pVar2.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                    c5953f2 = c5952e2.c();
                    L4.a.f10739e = c5953f2;
                }
                AbstractC1607r1.a(R4.b.R1(c5953f2, abstractC1725n), null, a12, ((r0.r) l1Var.getValue()).f44265a, abstractC1725n, 56, 4);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f27854Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
