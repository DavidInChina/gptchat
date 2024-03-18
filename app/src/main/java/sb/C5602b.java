package sb;

import E.q0;
import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4326r;

/* renamed from: sb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5602b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5602b f45495Z = new C5602b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5602b f45496h0 = new C5602b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45497Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5602b(int i10) {
        super(3);
        this.f45497Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10;
        switch (this.f45497Y) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$Button", (q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return y.f36177a;
                    }
                }
                j4.b(H.v(R.string.message_feedback_submit, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return y.f36177a;
            default:
                M9.l lVar = (M9.l) obj;
                ((Number) obj3).intValue();
                AbstractC3557B.c0("it", lVar);
                L0.u uVar = io.sentry.compose.b.f34309a;
                Z.r rVar2 = (Z.r) ((AbstractC1725n) obj2);
                rVar2.W(986924617);
                i0.r rVar3 = l.f45515a;
                int ordinal = lVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            i10 = R.string.message_feedback_tag_not_helpful;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i10 = R.string.message_feedback_tag_false;
                    }
                } else {
                    i10 = R.string.message_feedback_tag_harmful;
                }
                String v10 = H.v(i10, rVar2);
                rVar2.t(false);
                return v10;
        }
    }
}
