package ic;

import E.q0;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;

/* renamed from: ic.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3532b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public static final C3532b f33002Y = new kotlin.jvm.internal.o(3);

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3557B.c0("$this$OutlinedButton", (q0) obj);
        AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
        if ((intValue & 81) == 16) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        j4.b(Ng.H.v(R.string.settings_memory_view_button, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
        return jf.y.f36177a;
    }
}
