package M3;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class E {
    public static boolean a(Context context) {
        boolean isDeviceProtectedStorage;
        isDeviceProtectedStorage = context.isDeviceProtectedStorage();
        return isDeviceProtectedStorage;
    }
}
