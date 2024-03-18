package C7;

import H0.C0672c0;
import M3.H;
import android.content.Context;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class a {
    static {
        new ThreadLocal();
        new C0672c0(6);
    }

    public static int a(Context context) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.auth.api.fallback.ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!H.P(declaredField.get(null), "com.google.android.gms.auth.api.fallback")) {
                String valueOf = String.valueOf(declaredField.get(null));
                AbstractC3612c.c("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id 'com.google.android.gms.auth.api.fallback'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            AbstractC3612c.r("DynamiteModule", "Local module descriptor class for com.google.android.gms.auth.api.fallback not found.");
            return 0;
        } catch (Exception e10) {
            AbstractC3612c.c("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }
}
