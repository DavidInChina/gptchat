package t;

import android.app.KeyguardManager;
import android.content.Context;

/* loaded from: classes2.dex */
public abstract class d {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
