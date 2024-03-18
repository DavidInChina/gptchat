package y1;

import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale[] f50325a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f50325a;
        int length = localeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (localeArr[i10].equals(locale)) {
                    break;
                }
                i10++;
            } else {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String a5 = B1.f.a(locale);
                if (a5.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return a5.equals(B1.f.a(locale2));
            }
        }
        return false;
    }
}
