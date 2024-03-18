package m;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes2.dex */
public abstract class y {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static y1.k b(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return y1.k.b(languageTags);
    }

    public static void c(y1.k kVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(kVar.f50327a.a());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void d(Configuration configuration, y1.k kVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(kVar.f50327a.a());
        configuration.setLocales(forLanguageTags);
    }
}
