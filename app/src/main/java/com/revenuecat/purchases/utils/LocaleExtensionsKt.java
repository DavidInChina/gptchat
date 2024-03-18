package com.revenuecat.purchases.utils;

import android.os.Build;
import com.revenuecat.purchases.common.LogUtilsKt;
import id.AbstractC3557B;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kf.q;
import kotlin.Metadata;
import y1.j;
import y1.k;
import y1.n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0003\u00a2\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Ljava/util/Locale;", "convertToCorrectlyFormattedLocale", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "toLocale", "(Ljava/lang/String;)Ljava/util/Locale;", "locale", "", "sharedLanguageCodeWith", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "", "getDefaultLocales", "()Ljava/util/List;", "inferScript", "(Ljava/util/Locale;)Ljava/lang/String;", "Ly1/k;", "toList", "(Ly1/k;)Ljava/util/List;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        AbstractC3557B.c0("<this>", locale);
        String locale2 = locale.toString();
        AbstractC3557B.b0("toString()", locale2);
        return toLocale(locale2);
    }

    public static final List<Locale> getDefaultLocales() {
        k kVar;
        k kVar2 = k.f50326b;
        if (Build.VERSION.SDK_INT >= 24) {
            kVar = new k(new n(j.c()));
        } else {
            kVar = k.a(Locale.getDefault());
        }
        return toList(kVar);
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            AbstractC3557B.b0("script", script2);
            return script2;
        } else if (!AbstractC3557B.K(locale.getLanguage(), "zh") || (country = locale.getCountry()) == null) {
            return "";
        } else {
            int hashCode = country.hashCode();
            if (hashCode != 2155) {
                if (hashCode != 2307) {
                    if (hashCode != 2466) {
                        if (hashCode != 2644) {
                            if (hashCode != 2691 || !country.equals("TW")) {
                                return "";
                            }
                        } else if (!country.equals("SG")) {
                            return "";
                        }
                    } else if (!country.equals("MO")) {
                        return "";
                    }
                } else if (!country.equals("HK")) {
                    return "";
                }
                return "Hant";
            } else if (!country.equals("CN")) {
                return "";
            }
            return "Hans";
        }
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        AbstractC3557B.c0("<this>", locale);
        AbstractC3557B.c0("locale", locale2);
        try {
            boolean K10 = AbstractC3557B.K(locale.getISO3Language(), locale2.getISO3Language());
            boolean K11 = AbstractC3557B.K(inferScript(locale), inferScript(locale2));
            if (K10 && K11) {
                return true;
            }
            return false;
        } catch (MissingResourceException e10) {
            LogUtilsKt.errorLog$default("Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e10 + "). Falling back to language.", null, 2, null);
            return AbstractC3557B.K(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(k kVar) {
        int size = kVar.f50327a.size();
        Locale[] localeArr = new Locale[size];
        for (int i10 = 0; i10 < size; i10++) {
            localeArr[i10] = kVar.f50327a.get(i10);
        }
        return q.h3(localeArr);
    }

    public static final Locale toLocale(String str) {
        AbstractC3557B.c0("<this>", str);
        Locale forLanguageTag = Locale.forLanguageTag(Lg.n.A2(str, "_", "-"));
        AbstractC3557B.b0("forLanguageTag(replace(\"_\", \"-\"))", forLanguageTag);
        return forLanguageTag;
    }
}
