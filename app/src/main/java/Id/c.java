package Id;

import E.q0;
import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class c extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f8546Y = new o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$Button", (q0) obj);
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 81) == 16) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        j4.b(H.v(R.string.voice_settings_confirm, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
        return y.f36177a;
    }
}
