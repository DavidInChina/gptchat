package y1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class j {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
