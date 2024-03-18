package k5;

import Ng.Q;
import android.content.Context;
import g5.C3199a;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.List;
import java.util.Locale;
import of.EnumC5000a;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final C3199a f37053a;

    /* renamed from: c  reason: collision with root package name */
    public String f37055c;

    /* renamed from: b  reason: collision with root package name */
    public String f37054b = "https";

    /* renamed from: d  reason: collision with root package name */
    public final C4186l f37056d = new C4186l(false, 0, new C4184j((List) null));

    public O(C3199a c3199a) {
        this.f37053a = c3199a;
    }

    public final Object a(Context context, C9.e eVar) {
        Tg.e eVar2 = Q.f12904a;
        Object n12 = Ad.l.n1(eVar, ((Og.d) Sg.u.f16684a).f13759j0, new N(this, context, null));
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        jf.y yVar = jf.y.f36177a;
        if (n12 != enumC5000a) {
            n12 = yVar;
        }
        if (n12 == enumC5000a) {
            return n12;
        }
        return yVar;
    }

    public final void b() {
        Locale locale = Locale.ROOT;
        if (!AbstractC3557B.K("com.openai.chatgpt", AbstractC6463a.j("ROOT", locale, "com.openai.chatgpt", locale, "this as java.lang.String).toLowerCase(locale)"))) {
            AbstractC3612c.r(P.f37057a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
        }
        this.f37054b = "com.openai.chatgpt";
    }
}
