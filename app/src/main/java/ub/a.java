package Ub;

import E.q0;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;

/* loaded from: classes2.dex */
public final class a extends o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f17591Y = new o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$Button", (q0) obj);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 81) == 16) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        AbstractC1607r1.b(N.a0(), null, a5, 0L, abstractC1725n, 48, 12);
        androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42840d), abstractC1725n);
        j4.b(H.v(R.string.failwhale_try_again_button, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
        return y.f36177a;
    }
}
