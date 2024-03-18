package di;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ji.C4138m;

/* renamed from: di.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2732f {

    /* renamed from: a  reason: collision with root package name */
    public static final C2729c[] f28577a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f28578b;

    static {
        C2729c c2729c = new C2729c(C2729c.f28556i, "");
        C4138m c4138m = C2729c.f28553f;
        C2729c c2729c2 = new C2729c(c4138m, "GET");
        C2729c c2729c3 = new C2729c(c4138m, "POST");
        C4138m c4138m2 = C2729c.f28554g;
        C2729c c2729c4 = new C2729c(c4138m2, Separators.SLASH);
        C2729c c2729c5 = new C2729c(c4138m2, "/index.html");
        C4138m c4138m3 = C2729c.f28555h;
        C2729c c2729c6 = new C2729c(c4138m3, "http");
        C2729c c2729c7 = new C2729c(c4138m3, "https");
        C4138m c4138m4 = C2729c.f28552e;
        C2729c[] c2729cArr = {c2729c, c2729c2, c2729c3, c2729c4, c2729c5, c2729c6, c2729c7, new C2729c(c4138m4, "200"), new C2729c(c4138m4, "204"), new C2729c(c4138m4, "206"), new C2729c(c4138m4, "304"), new C2729c(c4138m4, "400"), new C2729c(c4138m4, "404"), new C2729c(c4138m4, "500"), new C2729c("accept-charset", ""), new C2729c("accept-encoding", "gzip, deflate"), new C2729c("accept-language", ""), new C2729c("accept-ranges", ""), new C2729c("accept", ""), new C2729c("access-control-allow-origin", ""), new C2729c("age", ""), new C2729c("allow", ""), new C2729c("authorization", ""), new C2729c("cache-control", ""), new C2729c("content-disposition", ""), new C2729c("content-encoding", ""), new C2729c("content-language", ""), new C2729c("content-length", ""), new C2729c("content-location", ""), new C2729c("content-range", ""), new C2729c("content-type", ""), new C2729c(ParameterNames.COOKIE, ""), new C2729c("date", ""), new C2729c("etag", ""), new C2729c("expect", ""), new C2729c("expires", ""), new C2729c("from", ""), new C2729c("host", ""), new C2729c("if-match", ""), new C2729c("if-modified-since", ""), new C2729c("if-none-match", ""), new C2729c("if-range", ""), new C2729c("if-unmodified-since", ""), new C2729c("last-modified", ""), new C2729c("link", ""), new C2729c("location", ""), new C2729c("max-forwards", ""), new C2729c("proxy-authenticate", ""), new C2729c("proxy-authorization", ""), new C2729c("range", ""), new C2729c("referer", ""), new C2729c("refresh", ""), new C2729c("retry-after", ""), new C2729c("server", ""), new C2729c("set-cookie", ""), new C2729c("strict-transport-security", ""), new C2729c("transfer-encoding", ""), new C2729c("user-agent", ""), new C2729c("vary", ""), new C2729c("via", ""), new C2729c("www-authenticate", "")};
        f28577a = c2729cArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            if (!linkedHashMap.containsKey(c2729cArr[i10].f28557a)) {
                linkedHashMap.put(c2729cArr[i10].f28557a, Integer.valueOf(i10));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC3557B.b0("unmodifiableMap(result)", unmodifiableMap);
        f28578b = unmodifiableMap;
    }

    public static void a(C4138m c4138m) {
        AbstractC3557B.c0("name", c4138m);
        int d10 = c4138m.d();
        for (int i10 = 0; i10 < d10; i10++) {
            byte i11 = c4138m.i(i10);
            if (65 <= i11 && i11 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c4138m.r()));
            }
        }
    }
}
