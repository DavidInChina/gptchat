package kb;

import E.q0;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: kb.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4217b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4217b f37247Z = new C4217b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4217b f37248h0 = new C4217b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37249Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4217b(int i10) {
        super(3);
        this.f37249Y = i10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f37249Y) {
            case 0:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversations_cancel_button, abstractC1725n), a5, r0.r.f44258f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20314o, abstractC1725n, 384, 0, 65530);
                return;
            default:
                AbstractC3557B.c0("$this$Button", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversation_image_edit_next, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, N0.E.a(0, 0, 16777214, r0.r.f44254b, 0L, 0L, 0L, null, ((p4) ((Z.r) abstractC1725n).m(q4.f20361a)).f20314o, null, null, null), abstractC1725n, 0, 0, 65534);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f37249Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
