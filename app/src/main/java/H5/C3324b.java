package h5;

import I8.n;
import Wh.r;
import Wh.s;
import com.auth0.android.request.internal.e;
import com.auth0.android.request.internal.f;
import com.auth0.android.request.internal.l;
import com.google.gson.reflect.TypeToken;
import g5.C3199a;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import jh.H1;
import kf.AbstractC4268D;
import l5.C4336a;

/* renamed from: h5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3324b {

    /* renamed from: a  reason: collision with root package name */
    public final C3199a f31907a;

    /* renamed from: b  reason: collision with root package name */
    public final l f31908b;

    /* renamed from: c  reason: collision with root package name */
    public final n f31909c;

    public C3324b(C3199a c3199a) {
        AbstractC3557B.c0("auth0", c3199a);
        C4336a c4336a = c3199a.f31282d;
        n nVar = f.f26731a;
        AbstractC3557B.c0("gson", nVar);
        l lVar = new l(c4336a, new C3323a(new e(nVar, new TypeToken<Map<String, ? extends Object>>() { // from class: com.auth0.android.request.internal.GsonAdapter$Companion$forMap$1
        })));
        this.f31907a = c3199a;
        this.f31908b = lVar;
        this.f31909c = nVar;
        String str = c3199a.f31281c.f39618b;
        AbstractC3557B.c0("clientInfo", str);
        lVar.f26753c.put("Auth0-Client", str);
    }

    public final com.auth0.android.request.internal.b a(String str) {
        int i10 = C3326d.f31914b;
        C3326d c3326d = new C3326d(new LinkedHashMap());
        C3199a c3199a = this.f31907a;
        String str2 = c3199a.f31279a;
        AbstractC3557B.c0("clientId", str2);
        c3326d.a("client_id", str2);
        c3326d.a("refresh_token", str);
        c3326d.a("grant_type", "refresh_token");
        Map l12 = AbstractC4268D.l1(c3326d.f31915a);
        char[] cArr = s.f21249j;
        r f6 = H1.n(String.valueOf(c3199a.f31280b)).f();
        f6.a("oauth");
        f6.a("token");
        s b10 = f6.b();
        e eVar = new e(this.f31909c);
        l lVar = this.f31908b;
        lVar.getClass();
        String str3 = b10.f21257h;
        AbstractC3557B.c0("url", str3);
        com.auth0.android.request.internal.b a5 = lVar.a(l5.b.f37836c, str3, eVar, lVar.f26752b);
        a5.a(l12);
        return a5;
    }
}
