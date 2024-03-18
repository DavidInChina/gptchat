package t;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;

/* loaded from: classes2.dex */
public abstract class a {
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}
