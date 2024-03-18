package y1;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes2.dex */
public abstract class h {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, k kVar) {
        configuration.setLocales((LocaleList) kVar.f50327a.b());
    }
}
