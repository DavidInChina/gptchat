package Wh;

import id.AbstractC3557B;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jh.H1;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public s f21331a;

    /* renamed from: d  reason: collision with root package name */
    public B f21334d;

    /* renamed from: e  reason: collision with root package name */
    public LinkedHashMap f21335e = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public String f21332b = "GET";

    /* renamed from: c  reason: collision with root package name */
    public p f21333c = new p();

    public final void a(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        p pVar = this.f21333c;
        pVar.getClass();
        H1.i(str);
        H1.j(str2, str);
        pVar.a(str, str2);
    }

    public final z b() {
        Map unmodifiableMap;
        s sVar = this.f21331a;
        if (sVar != null) {
            String str = this.f21332b;
            q e10 = this.f21333c.e();
            B b10 = this.f21334d;
            LinkedHashMap linkedHashMap = this.f21335e;
            byte[] bArr = Xh.b.f21996a;
            AbstractC3557B.c0("<this>", linkedHashMap);
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = kf.w.f37484Y;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                AbstractC3557B.b0("{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }", unmodifiableMap);
            }
            return new z(sVar, str, e10, b10, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    public final void c(C1658c c1658c) {
        AbstractC3557B.c0("cacheControl", c1658c);
        String c1658c2 = c1658c.toString();
        if (c1658c2.length() == 0) {
            f("Cache-Control");
        } else {
            d("Cache-Control", c1658c2);
        }
    }

    public final void d(String str, String str2) {
        AbstractC3557B.c0("value", str2);
        p pVar = this.f21333c;
        pVar.getClass();
        H1.i(str);
        H1.j(str2, str);
        pVar.v(str);
        pVar.a(str, str2);
    }

    public final void e(String str, B b10) {
        boolean z10;
        AbstractC3557B.c0("method", str);
        if (str.length() > 0) {
            if (b10 == null) {
                if (!AbstractC3557B.K(str, "POST") && !AbstractC3557B.K(str, "PUT") && !AbstractC3557B.K(str, "PATCH") && !AbstractC3557B.K(str, "PROPPATCH") && !AbstractC3557B.K(str, "REPORT")) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!(!z10)) {
                    throw new IllegalArgumentException(android.gov.nist.core.a.A("method ", str, " must have a request body.").toString());
                }
            } else if (!U3.f.i0(str)) {
                throw new IllegalArgumentException(android.gov.nist.core.a.A("method ", str, " must not have a request body.").toString());
            }
            this.f21332b = str;
            this.f21334d = b10;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public final void f(String str) {
        AbstractC3557B.c0("name", str);
        this.f21333c.v(str);
    }

    public final void g(String str) {
        AbstractC3557B.c0("url", str);
        if (Lg.n.I2(str, "ws:", true)) {
            String substring = str.substring(3);
            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
            str = "http:".concat(substring);
        } else if (Lg.n.I2(str, "wss:", true)) {
            String substring2 = str.substring(4);
            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
            str = "https:".concat(substring2);
        }
        char[] cArr = s.f21249j;
        this.f21331a = H1.n(str);
    }
}
