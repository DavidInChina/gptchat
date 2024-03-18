package M5;

import K4.J;
import android.os.Build;
import id.AbstractC3557B;
import java.util.Locale;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class d extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f11623Z = new d(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final d f11624h0 = new d(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final d f11625i0 = new d(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final d f11626j0 = new d(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final d f11627k0 = new d(4);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11628Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(0);
        this.f11628Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        String str;
        switch (this.f11628Y) {
            case 0:
                String property = System.getProperty("os.arch");
                return property == null ? "unknown" : property;
            case 1:
                String str2 = Build.BRAND;
                AbstractC3557B.b0("BRAND", str2);
                if (str2.length() <= 0) {
                    return str2;
                }
                StringBuilder sb2 = new StringBuilder();
                char charAt = str2.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.US;
                    AbstractC3557B.b0("US", locale);
                    str = J.g0(charAt, locale);
                } else {
                    str = String.valueOf(charAt);
                }
                sb2.append((Object) str);
                String substring = str2.substring(1);
                AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring);
                sb2.append(substring);
                return sb2.toString();
            case 2:
                return Build.ID;
            case 3:
                return Build.MODEL;
            default:
                return Build.VERSION.RELEASE;
        }
    }
}
