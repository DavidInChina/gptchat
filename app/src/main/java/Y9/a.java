package Y9;

import E.q0;
import Ng.H;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class a extends o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f22134Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f22135h0 = new a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f22136Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f22136Y = i10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f22136Y) {
            case 0:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.conversations_delete_button, abstractC1725n), a5, ((P0) ((r) abstractC1725n).m(R0.f19593a)).f19539w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131066);
                return;
            default:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.design_cancel_button, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = y.f36177a;
        switch (this.f22136Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
