package m;

import android.content.res.Configuration;
import java.util.Locale;

/* renamed from: m.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4542w {
    public static void a(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    public static void b(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
