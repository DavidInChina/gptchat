package Va;

import L0.u;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import l0.C4323o;
import p9.q;
import wf.n;

/* loaded from: classes.dex */
public final class a extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f18497Y = new o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        C4323o c4323o = C4323o.f37719b;
        u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        AbstractC1607r1.a(m.F(R.drawable.chevron_down_md, abstractC1725n), null, androidx.compose.foundation.layout.e.j(c4323o, q.f42830a), 0L, abstractC1725n, 56, 8);
        return y.f36177a;
    }
}
