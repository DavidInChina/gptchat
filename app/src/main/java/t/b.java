package t;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes2.dex */
public abstract class b {
    public static int a(BiometricManager biometricManager, int i10) {
        return biometricManager.canAuthenticate(i10);
    }
}
