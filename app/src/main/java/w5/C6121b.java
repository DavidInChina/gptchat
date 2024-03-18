package w5;

import Lg.n;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import wf.k;
import y.AbstractC6463a;

/* renamed from: w5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6121b extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6121b f48014Z = new C6121b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6121b f48015h0 = new C6121b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C6121b f48016i0 = new C6121b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C6121b f48017j0 = new C6121b(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C6121b f48018k0 = new C6121b(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48019Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6121b(int i10) {
        super(1);
        this.f48019Y = i10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Cf.c, Cf.a] */
    public final String a(String str) {
        Character ch2;
        switch (this.f48019Y) {
            case 0:
                AbstractC3557B.c0("it", str);
                Locale locale = Locale.US;
                return AbstractC6463a.j("US", locale, str, locale, "this as java.lang.String).toLowerCase(locale)");
            case 1:
                AbstractC3557B.c0("it", str);
                ?? aVar = new Cf.a('a', 'z');
                if (n.g2(str) >= 0) {
                    ch2 = Character.valueOf(str.charAt(0));
                } else {
                    ch2 = null;
                }
                if (ch2 == null || !aVar.r(ch2.charValue())) {
                    return null;
                }
                return str;
            case 2:
                AbstractC3557B.c0("it", str);
                Pattern compile = Pattern.compile("[^a-z0-9_:./-]");
                AbstractC3557B.b0("compile(...)", compile);
                String replaceAll = compile.matcher(str).replaceAll("_");
                AbstractC3557B.b0("replaceAll(...)", replaceAll);
                return replaceAll;
            case 3:
                AbstractC3557B.c0("it", str);
                if (n.d2(str, ':')) {
                    String substring = str.substring(0, n.g2(str));
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    return substring;
                }
                return str;
            default:
                AbstractC3557B.c0("it", str);
                if (str.length() > 200) {
                    String substring2 = str.substring(0, RCHTTPStatusCodes.SUCCESS);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                    return substring2;
                }
                return str;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f48019Y) {
            case 0:
                return a((String) obj);
            case 1:
                return a((String) obj);
            case 2:
                return a((String) obj);
            case 3:
                return a((String) obj);
            default:
                return a((String) obj);
        }
    }
}
