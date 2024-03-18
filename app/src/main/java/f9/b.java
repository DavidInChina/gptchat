package F9;

import Ng.H;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import l0.AbstractC4326r;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f5071Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 11) == 2) {
            r rVar = (r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.download, abstractC1725n), H.v(R.string.download_attachment, abstractC1725n), a5, 0L, abstractC1725n, 8, 12);
        return y.f36177a;
    }
}
