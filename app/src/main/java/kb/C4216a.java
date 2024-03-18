package kb;

import W.AbstractC1607r1;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;

/* renamed from: kb.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4216a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final C4216a f37246Y = new kotlin.jvm.internal.o(2);

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.close_lg, abstractC1725n), Ng.H.v(R.string.content_description_close, abstractC1725n), a5, r0.r.f44258f, abstractC1725n, 3080, 4);
        return jf.y.f36177a;
    }
}
