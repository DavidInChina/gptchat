package B1;

import android.os.Build;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f1719a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f1719a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(e.a(e.b(locale)));
        }
        try {
            return d.a((Locale) f1719a.invoke(null, locale));
        } catch (IllegalAccessException e10) {
            AbstractC3612c.t("ICUCompat", e10);
            return d.a(locale);
        } catch (InvocationTargetException e11) {
            AbstractC3612c.t("ICUCompat", e11);
            return d.a(locale);
        }
    }
}
