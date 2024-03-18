package m;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: m.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4536p {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
