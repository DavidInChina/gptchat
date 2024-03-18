package tb;

import Ng.H;
import W.j4;
import Z.AbstractC1725n;
import Z.r;
import com.openai.chatgpt.R;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import wf.n;

/* renamed from: tb.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5728b extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5728b f46037Y = new o(2);

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
        j4.b(H.v(R.string.file_unavailable_title, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
        return y.f36177a;
    }
}
