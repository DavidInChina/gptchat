package g5;

import Lg.n;
import Wh.s;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Locale;
import jh.H1;
import l5.C4336a;
import n5.C4716a;
import y.AbstractC6463a;

/* renamed from: g5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3199a {

    /* renamed from: a  reason: collision with root package name */
    public final String f31279a;

    /* renamed from: b  reason: collision with root package name */
    public final s f31280b;

    /* renamed from: c  reason: collision with root package name */
    public final C4716a f31281c;

    /* renamed from: d  reason: collision with root package name */
    public final C4336a f31282d = new C4336a();

    public C3199a(String str, String str2) {
        AbstractC3557B.c0("clientId", str);
        AbstractC3557B.c0("domain", str2);
        this.f31279a = str;
        s a5 = a(str2);
        this.f31280b = a5;
        if (a5 != null) {
            a(null);
            this.f31281c = new C4716a();
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid domain url: '%s'", Arrays.copyOf(new Object[]{str2}, 1)).toString());
    }

    public static s a(String str) {
        if (str == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        String j6 = AbstractC6463a.j("ROOT", locale, str, locale, "this as java.lang.String).toLowerCase(locale)");
        if (!n.I2(j6, "http://", false)) {
            if (!n.I2(j6, "https://", false)) {
                j6 = "https://".concat(j6);
            }
            char[] cArr = s.f21249j;
            AbstractC3557B.c0("<this>", j6);
            try {
                return H1.n(j6);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.A("Invalid domain url: '", str, "'. Only HTTPS domain URLs are supported. If no scheme is passed, HTTPS will be used.").toString());
    }
}
