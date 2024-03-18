package k5;

import Ng.Q;
import android.content.Context;
import g5.C3199a;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public final C3199a f37044a;

    /* renamed from: e  reason: collision with root package name */
    public String f37048e;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f37045b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f37046c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public String f37047d = "https";

    /* renamed from: f  reason: collision with root package name */
    public C4186l f37049f = new C4186l(false, 0, new C4184j((List) null));

    public M(C3199a c3199a) {
        AbstractC3557B.c0("account", c3199a);
        this.f37044a = c3199a;
    }

    public final Object a(Context context, C9.i iVar) {
        Tg.e eVar = Q.f12904a;
        return Ad.l.n1(iVar, ((Og.d) Sg.u.f16684a).f13759j0, new L(this, context, null));
    }

    public final void b(String str) {
        this.f37045b.put("connection", str);
    }

    public final void c(LinkedHashMap linkedHashMap) {
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                this.f37045b.put(str, value.toString());
            }
        }
    }

    public final void d() {
        Locale locale = Locale.ROOT;
        if (!AbstractC3557B.K("com.openai.chatgpt", AbstractC6463a.j("ROOT", locale, "com.openai.chatgpt", locale, "this as java.lang.String).toLowerCase(locale)"))) {
            AbstractC3612c.r(P.f37057a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
        }
        this.f37047d = "com.openai.chatgpt";
    }
}
