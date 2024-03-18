package P6;

import Lg.n;
import g6.C3201a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13823a;

    public /* synthetic */ b(int i10) {
        this.f13823a = i10;
    }

    @Override // P6.h
    public final void a(M6.b bVar, C3201a c3201a) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.f13823a) {
            case 0:
                try {
                    String bigInteger = bVar.f11660d.toString(16);
                    Locale locale = Locale.US;
                    String lowerCase = bigInteger.toLowerCase(locale);
                    String lowerCase2 = bVar.f11661e.toString(16).toLowerCase(locale);
                    if (bVar.e()) {
                        if (bVar.d() > 0) {
                            str = c.f13824a;
                        } else {
                            str = c.f13825b;
                        }
                        c3201a.a("b3", lowerCase + "-" + lowerCase2 + "-" + str);
                        return;
                    }
                    c3201a.a("b3", lowerCase + "-" + lowerCase2);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 1:
                try {
                    String bigInteger2 = bVar.f11660d.toString(16);
                    Locale locale2 = Locale.US;
                    c3201a.a("X-B3-TraceId", bigInteger2.toLowerCase(locale2));
                    c3201a.a("X-B3-SpanId", bVar.f11661e.toString(16).toLowerCase(locale2));
                    if (bVar.e()) {
                        if (bVar.d() > 0) {
                            str2 = d.f13826a;
                        } else {
                            str2 = d.f13827b;
                        }
                        c3201a.a("X-B3-Sampled", str2);
                        return;
                    }
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case 2:
                c3201a.a("x-datadog-trace-id", bVar.f11660d.toString());
                c3201a.a("x-datadog-parent-id", bVar.f11661e.toString());
                M6.a y10 = bVar.f11658b.y();
                if (y10 != null) {
                    str3 = y10.f11651b.f11669m;
                } else {
                    str3 = bVar.f11669m;
                }
                if (str3 != null) {
                    c3201a.a("x-datadog-origin", str3);
                }
                for (Map.Entry entry : bVar.f11659c.entrySet()) {
                    String str6 = "ot-baggage-" + ((String) entry.getKey());
                    String str7 = (String) entry.getValue();
                    try {
                        str7 = URLEncoder.encode(str7, "UTF-8");
                    } catch (UnsupportedEncodingException unused3) {
                    }
                    c3201a.a(str6, str7);
                }
                c3201a.a("x-datadog-sampling-priority", "1");
                return;
            case 3:
                c3201a.a("Trace-ID", bVar.f11660d.toString());
                c3201a.a("Span-ID", bVar.f11661e.toString());
                c3201a.a("Parent_ID", bVar.f11662f.toString());
                for (Map.Entry entry2 : bVar.f11659c.entrySet()) {
                    String str8 = "Baggage-" + ((String) entry2.getKey());
                    String str9 = (String) entry2.getValue();
                    try {
                        str9 = URLEncoder.encode(str9, "UTF-8");
                    } catch (UnsupportedEncodingException unused4) {
                    }
                    c3201a.a(str8, str9);
                }
                return;
            default:
                try {
                    String bigInteger3 = bVar.f11660d.toString(16);
                    Locale locale3 = Locale.US;
                    String lowerCase3 = bigInteger3.toLowerCase(locale3);
                    String lowerCase4 = bVar.f11661e.toString(16).toLowerCase(locale3);
                    if (bVar.d() > 0) {
                        str4 = j.f13836a;
                    } else {
                        str4 = j.f13837b;
                    }
                    M6.a y11 = bVar.f11658b.y();
                    if (y11 != null) {
                        str5 = y11.f11651b.f11669m;
                    } else {
                        str5 = bVar.f11669m;
                    }
                    c3201a.a("traceparent", "00-" + n.r2(lowerCase3, 32) + "-" + n.r2(lowerCase4, 16) + "-0" + str4);
                    StringBuilder sb2 = new StringBuilder("dd=s:");
                    sb2.append(str4);
                    sb2.append(";p:");
                    sb2.append(lowerCase4);
                    if (str5 != null) {
                        sb2.append(";o:");
                        sb2.append(str5.toLowerCase(locale3));
                    }
                    c3201a.a("tracestate", sb2.toString());
                    return;
                } catch (NumberFormatException unused5) {
                    return;
                }
        }
    }
}
