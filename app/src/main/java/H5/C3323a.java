package h5;

import I8.E;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.auth0.android.request.internal.e;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g5.C3200b;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: h5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3323a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f31906a;

    public C3323a(e eVar) {
        this.f31906a = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h5.c, g5.b] */
    public static C3325c a(Exception exc) {
        return new C3200b("Something went wrong", new C3200b("Something went wrong", exc));
    }

    public static C3325c c(int i10, String str, Map map) {
        AbstractC3557B.c0("headers", map);
        C3325c c3325c = new C3325c();
        c3325c.f31910Y = "a0.sdk.internal_error.plain";
        c3325c.f31911Z = str;
        c3325c.f31912h0 = i10;
        return c3325c;
    }

    public final C3325c b(int i10, InputStreamReader inputStreamReader) {
        Object obj;
        E e10 = this.f31906a.f26730a;
        e10.getClass();
        Map map = (Map) e10.b(new P8.b(inputStreamReader));
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, map);
        C3325c c3325c = new C3325c();
        c3325c.f31912h0 = i10;
        c3325c.f31913i0 = map;
        if (map.containsKey("error")) {
            obj = map.get("error");
        } else {
            obj = map.get("code");
        }
        String str = (String) obj;
        if (str == null) {
            str = "a0.sdk.internal_error.unknown";
        }
        c3325c.f31910Y = str;
        if (!map.containsKey("description")) {
            c3325c.f31911Z = (String) map.get("error_description");
            if (AbstractC3557B.K("invalid_request", c3325c.a()) && (AbstractC3557B.K("OIDC conformant clients cannot use /oauth/access_token", c3325c.b()) || AbstractC3557B.K("OIDC conformant clients cannot use /oauth/ro", c3325c.b()))) {
                AbstractC3612c.r(C3324b.class.getSimpleName(), "Your Auth0 Application is configured as 'OIDC Conformant' but this instance it's not. To authenticate you will need to enable the flag by calling Auth0#setOIDCConformant(true) on the Auth0 instance you used in the setup.");
            }
        } else {
            Object obj2 = map.get("description");
            if (obj2 instanceof String) {
                c3325c.f31911Z = (String) obj2;
            } else if ((obj2 instanceof Map) && AbstractC3557B.K("invalid_password", str) && AbstractC3557B.K("PasswordStrengthError", map.get("name"))) {
                ArrayList arrayList = new ArrayList();
                for (Map map2 : (List) ((Map) obj2).get("rules")) {
                    if (!((Boolean) map2.get("verified")).booleanValue()) {
                        String str2 = (String) map2.get("code");
                        str2.getClass();
                        char c10 = '\uffff';
                        switch (str2.hashCode()) {
                            case -2022676432:
                                if (str2.equals("lengthAtLeast")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -588526889:
                                if (str2.equals("containsAtLeast")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 914712481:
                                if (str2.equals("shouldContain")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 1196895272:
                                if (str2.equals("identicalChars")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                        }
                        if (c10 != 0) {
                            if (c10 != 1 && c10 != 2) {
                                if (c10 == 3) {
                                    List list = (List) map2.get("format");
                                    arrayList.add(String.format((String) map2.get("message"), Integer.valueOf(((Double) list.get(0)).intValue()), list.get(1)));
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                for (Map map3 : (List) map2.get("items")) {
                                    arrayList2.add((String) map3.get("message"));
                                }
                                String join = TextUtils.join(", ", arrayList2);
                                String str3 = (String) map2.get("message");
                                if (map2.containsKey("format")) {
                                    List list2 = (List) map2.get("format");
                                    str3 = String.format(str3, Integer.valueOf(((Double) list2.get(0)).intValue()), Integer.valueOf(((Double) list2.get(1)).intValue()));
                                }
                                arrayList.add(str3 + Separators.SP + join);
                            }
                        } else {
                            arrayList.add(String.format((String) map2.get("message"), Integer.valueOf(((Double) ((List) map2.get("format")).get(0)).intValue())));
                        }
                    }
                }
                c3325c.f31911Z = TextUtils.join("; ", arrayList);
            }
        }
        return c3325c;
    }
}
