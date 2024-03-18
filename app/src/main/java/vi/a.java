package vi;

import android.gov.nist.core.Separators;
import fi.C3100a;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f47553a = Pattern.compile("[\\\\&]");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f47554b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f47555c = Pattern.compile("[ \t\r\n]+");

    /* renamed from: d  reason: collision with root package name */
    public static final C3100a f47556d = new Object();

    /* JADX WARN: Type inference failed for: r0v7, types: [fi.a, java.lang.Object] */
    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
    }

    public static String a(String str) {
        String trim = str.trim();
        Locale locale = Locale.ROOT;
        return f47555c.matcher(trim.toLowerCase(locale).toUpperCase(locale)).replaceAll(Separators.SP);
    }

    public static String b(String str) {
        if (f47553a.matcher(str).find()) {
            Matcher matcher = f47554b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                int i10 = 0;
                do {
                    sb2.append((CharSequence) str, i10, matcher.start());
                    f47556d.h(matcher.group(), sb2);
                    i10 = matcher.end();
                } while (matcher.find());
                if (i10 != str.length()) {
                    sb2.append((CharSequence) str, i10, str.length());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
