package k5;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Log;
import g5.C3199a;
import h5.C3324b;
import h5.C3325c;
import h5.C3326d;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j5.AbstractC3910a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import jh.H1;
import kf.AbstractC4268D;
import m.RunnableC4517N;

/* loaded from: classes2.dex */
public final class z extends com.google.android.gms.internal.play_billing.N {

    /* renamed from: q  reason: collision with root package name */
    public static final String f37094q = z.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    public final C3199a f37095g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC3910a f37096h;

    /* renamed from: j  reason: collision with root package name */
    public final LinkedHashMap f37098j;

    /* renamed from: l  reason: collision with root package name */
    public final C4186l f37100l;

    /* renamed from: m  reason: collision with root package name */
    public final C3324b f37101m;

    /* renamed from: n  reason: collision with root package name */
    public E f37102n;

    /* renamed from: o  reason: collision with root package name */
    public Integer f37103o;

    /* renamed from: p  reason: collision with root package name */
    public String f37104p;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f37097i = false;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f37099k = new HashMap();

    public z(C3199a c3199a, C.b bVar, LinkedHashMap linkedHashMap, C4186l c4186l) {
        AbstractC3557B.c0("account", c3199a);
        AbstractC3557B.c0("parameters", linkedHashMap);
        AbstractC3557B.c0("ctOptions", c4186l);
        this.f37095g = c3199a;
        this.f37096h = bVar;
        LinkedHashMap m12 = AbstractC4268D.m1(linkedHashMap);
        this.f37098j = m12;
        m12.put("response_type", "code");
        this.f37101m = new C3324b(c3199a);
        this.f37100l = c4186l;
    }

    public static void H0(String str, String str2) {
        if (str == null) {
            return;
        }
        AbstractC3612c.c(f37094q, "Error, access denied. Check that the required Permissions are granted and that the Application has this Connection configured in Auth0 Dashboard.");
        if (Lg.n.f2("access_denied", str)) {
            if (str2 == null) {
                str2 = "Permissions were not granted. Try again.";
            }
            throw new C3325c("access_denied", str2);
        } else if (Lg.n.f2("unauthorized", str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new C3325c("unauthorized", str2);
        } else if (AbstractC3557B.K("login_required", str)) {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new C3325c(str, str2);
        } else {
            if (str2 == null) {
                str2 = "An unexpected error occurred.";
            }
            throw new C3325c(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void A(C3325c c3325c) {
        this.f37096h.d(c3325c);
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final boolean v0(C4181g c4181g) {
        Uri uri;
        Map map;
        String str;
        String[] strArr;
        String str2;
        String str3;
        int i10;
        boolean a5 = c4181g.a();
        String str4 = f37094q;
        if (!a5 && c4181g.f37063a != -1) {
            Log.d("g", "Result is invalid: Either the received Intent is null or the Request Code doesn't match the expected one.");
            AbstractC3612c.r(str4, "The Authorize Result is invalid.");
            return false;
        }
        boolean a10 = c4181g.a();
        AbstractC3910a abstractC3910a = this.f37096h;
        if (a10) {
            abstractC3910a.d(new C3325c("a0.authentication_canceled", "The user closed the browser app and the authentication was canceled."));
            return true;
        }
        Intent intent = c4181g.f37064b;
        if (intent == null) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri == null) {
            map = Collections.emptyMap();
        } else {
            if (uri.getQuery() != null) {
                str = uri.getQuery();
            } else {
                str = uri.getFragment();
            }
            if (str == null) {
                map = new HashMap();
            } else {
                if (str.length() > 0) {
                    strArr = str.split(Separators.AND);
                } else {
                    strArr = new String[0];
                }
                HashMap hashMap = new HashMap(strArr.length);
                for (String str5 : strArr) {
                    int indexOf = str5.indexOf(Separators.EQUALS);
                    if (indexOf > 0) {
                        str2 = str5.substring(0, indexOf);
                    } else {
                        str2 = str5;
                    }
                    if (indexOf > 0 && str5.length() > (i10 = indexOf + 1)) {
                        str3 = str5.substring(i10);
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        hashMap.put(str2, str3);
                    }
                }
                map = hashMap;
            }
        }
        AbstractC3557B.b0("getValuesFromUri(result.intentData)", map);
        if (map.isEmpty()) {
            AbstractC3612c.r(str4, "The response didn't contain any of these values: code, state");
            return false;
        }
        Log.d(str4, "The parsed CallbackURI contains the following parameters: " + map.keySet());
        try {
            H0((String) map.get("error"), (String) map.get("error_description"));
            Object obj = this.f37098j.get("state");
            AbstractC3557B.Z(obj);
            String str6 = (String) obj;
            String str7 = (String) map.get("state");
            if (AbstractC3557B.K(str6, str7)) {
                E e10 = this.f37102n;
                AbstractC3557B.Z(e10);
                String str8 = (String) map.get("code");
                C.b bVar = new C.b(3, this);
                C3324b c3324b = e10.f37036a;
                c3324b.getClass();
                AbstractC3557B.c0("authorizationCode", str8);
                String str9 = e10.f37037b;
                AbstractC3557B.c0("codeVerifier", str9);
                String str10 = e10.f37038c;
                AbstractC3557B.c0("redirectUri", str10);
                int i11 = C3326d.f31914b;
                C3326d c3326d = new C3326d(new LinkedHashMap());
                C3199a c3199a = c3324b.f31907a;
                String str11 = c3199a.f31279a;
                AbstractC3557B.c0("clientId", str11);
                c3326d.a("client_id", str11);
                c3326d.a("grant_type", "authorization_code");
                c3326d.a("code", str8);
                c3326d.a("redirect_uri", str10);
                c3326d.a("code_verifier", str9);
                Map l12 = AbstractC4268D.l1(c3326d.f31915a);
                char[] cArr = Wh.s.f21249j;
                Wh.r f6 = H1.n(String.valueOf(c3199a.f31280b)).f();
                f6.a("oauth");
                f6.a("token");
                Wh.s b10 = f6.b();
                com.auth0.android.request.internal.e eVar = new com.auth0.android.request.internal.e(c3324b.f31909c);
                com.auth0.android.request.internal.l lVar = c3324b.f31908b;
                lVar.getClass();
                String str12 = b10.f21257h;
                AbstractC3557B.c0("url", str12);
                com.auth0.android.request.internal.b a11 = lVar.a(l5.b.f37836c, str12, eVar, lVar.f26752b);
                a11.a(l12);
                for (Map.Entry entry : e10.f37040e.entrySet()) {
                    String str13 = (String) entry.getKey();
                    String str14 = (String) entry.getValue();
                    AbstractC3557B.c0("name", str13);
                    AbstractC3557B.c0("value", str14);
                    ((Map) a11.f26724f.f17494i0).put(str13, str14);
                }
                a11.f26723e.a(new RunnableC4517N(a11, 29, bVar));
                return true;
            }
            AbstractC3612c.c(str4, String.format("Received state doesn't match. Received %s but expected %s", Arrays.copyOf(new Object[]{str7, str6}, 2)));
            throw new C3325c("access_denied", "The received state is invalid. Try again.");
        } catch (C3325c e11) {
            abstractC3910a.d(e11);
            return true;
        }
    }
}
