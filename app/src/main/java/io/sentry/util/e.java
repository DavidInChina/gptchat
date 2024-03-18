package io.sentry.util;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f34777a = Charset.forName("UTF-8");

    public static String a(String str) {
        if (str != null && !str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            String substring = str.substring(0, 1);
            Locale locale = Locale.ROOT;
            sb2.append(substring.toUpperCase(locale));
            sb2.append(str.substring(1).toLowerCase(locale));
            return sb2.toString();
        }
        return str;
    }

    public static String b(String str) {
        if (str != null && str.startsWith(Separators.DOUBLE_QUOTE) && str.endsWith(Separators.DOUBLE_QUOTE)) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }
}
