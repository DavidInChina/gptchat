package ya;

import E.q0;
import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import l0.AbstractC4326r;

/* renamed from: ya.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6553a extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6553a f50846Z = new C6553a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6553a f50847h0 = new C6553a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50848Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6553a(int i10) {
        super(3);
        this.f50848Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f50848Y) {
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
                j4.b(H.v(R.string.voice_feedback_submit, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return y.f36177a;
            default:
                EnumC6570r enumC6570r = (EnumC6570r) obj;
                ((Number) obj3).intValue();
                AbstractC3557B.c0("it", enumC6570r);
                L0.u uVar = io.sentry.compose.b.f34309a;
                Z.r rVar2 = (Z.r) ((AbstractC1725n) obj2);
                rVar2.W(89780804);
                String v10 = H.v(enumC6570r.f50875Y, rVar2);
                rVar2.t(false);
                return v10;
        }
    }
}