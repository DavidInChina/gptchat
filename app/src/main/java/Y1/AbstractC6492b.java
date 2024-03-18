package y1;

import android.os.Build;
import com.revenuecat.purchases.common.UtilsKt;
import id.AbstractC3557B;
import java.util.Locale;

/* renamed from: y1.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6492b {
    static {
        int i10 = Build.VERSION.SDK_INT;
        C6491a c6491a = C6491a.f50321a;
        if (i10 >= 30) {
            c6491a.a(30);
        }
        if (i10 >= 30) {
            c6491a.a(31);
        }
        if (i10 >= 30) {
            c6491a.a(33);
        }
        if (i10 >= 30) {
            c6491a.a(UtilsKt.MICROS_MULTIPLIER);
        }
    }

    public static final boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String str = Build.VERSION.CODENAME;
                AbstractC3557B.b0("CODENAME", str);
                if (!AbstractC3557B.K("REL", str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    AbstractC3557B.b0("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    AbstractC3557B.b0("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase2);
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
