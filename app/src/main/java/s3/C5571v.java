package s3;

import android.net.Uri;
import id.AbstractC3557B;
import io.sentry.r1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jf.C3959i;
import wf.AbstractC6216a;

/* renamed from: s3.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5571v extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45370Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5573x f45371Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5571v(C5573x c5573x, int i10) {
        super(0);
        this.f45370Y = i10;
        this.f45371Z = c5573x;
    }

    public final Pattern a() {
        int i10 = this.f45370Y;
        C5573x c5573x = this.f45371Z;
        switch (i10) {
            case 2:
                String str = (String) c5573x.f45387l.getValue();
                if (str == null) {
                    return null;
                }
                return Pattern.compile(str, 2);
            case 5:
                String str2 = c5573x.f45389n;
                if (str2 == null) {
                    return null;
                }
                return Pattern.compile(str2);
            default:
                String str3 = c5573x.f45380e;
                if (str3 == null) {
                    return null;
                }
                return Pattern.compile(str3, 2);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        List list;
        int i10 = this.f45370Y;
        boolean z10 = false;
        C5573x c5573x = this.f45371Z;
        switch (i10) {
            case 0:
                C3959i c3959i = (C3959i) c5573x.f45385j.getValue();
                if (c3959i == null || (list = (List) c3959i.f36155Y) == null) {
                    return new ArrayList();
                }
                return list;
            case 1:
                String str = c5573x.f45376a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb2 = new StringBuilder();
                AbstractC3557B.Z(fragment);
                C5573x.a(fragment, arrayList, sb2);
                String sb3 = sb2.toString();
                AbstractC3557B.b0("fragRegex.toString()", sb3);
                return new C3959i(arrayList, sb3);
            case 2:
                return a();
            case 3:
                C3959i c3959i2 = (C3959i) c5573x.f45385j.getValue();
                if (c3959i2 == null) {
                    return null;
                }
                return (String) c3959i2.f36156Z;
            case 4:
                String str2 = c5573x.f45376a;
                if (str2 != null && Uri.parse(str2).getQuery() != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 5:
                return a();
            case 6:
                return a();
            default:
                c5573x.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) c5573x.f45382g.getValue()).booleanValue()) {
                    String str3 = c5573x.f45376a;
                    Uri parse = Uri.parse(str3);
                    for (String str4 : parse.getQueryParameterNames()) {
                        StringBuilder sb4 = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str4);
                        if (queryParameters.size() <= 1) {
                            String str5 = (String) kf.t.h2(queryParameters);
                            if (str5 == null) {
                                c5573x.f45384i = true;
                                str5 = str4;
                            }
                            Matcher matcher = C5573x.f45375r.matcher(str5);
                            C5570u c5570u = new C5570u();
                            int i11 = 0;
                            while (matcher.find()) {
                                String group = matcher.group(1);
                                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.String", group);
                                c5570u.f45369b.add(group);
                                AbstractC3557B.b0("queryParam", str5);
                                String substring = str5.substring(i11, matcher.start());
                                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                                sb4.append(Pattern.quote(substring));
                                sb4.append("(.+?)?");
                                i11 = matcher.end();
                            }
                            if (i11 < str5.length()) {
                                String substring2 = str5.substring(i11);
                                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
                                sb4.append(Pattern.quote(substring2));
                            }
                            String sb5 = sb4.toString();
                            AbstractC3557B.b0("argRegex.toString()", sb5);
                            c5570u.f45368a = Lg.n.A2(sb5, r1.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q");
                            AbstractC3557B.b0("paramName", str4);
                            linkedHashMap.put(str4, c5570u);
                        } else {
                            throw new IllegalArgumentException(("Query parameter " + str4 + " must only be present once in " + str3 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                    }
                }
                return linkedHashMap;
        }
    }
}
