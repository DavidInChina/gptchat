package t;

import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import io.sentry.android.core.AbstractC3612c;
import v1.AbstractC5959a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final BiometricManager f45603a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.view.a f45604b;

    public c(androidx.appcompat.view.a aVar) {
        BiometricManager biometricManager;
        int i10 = Build.VERSION.SDK_INT;
        androidx.appcompat.view.a aVar2 = null;
        if (i10 >= 29) {
            biometricManager = a.b(aVar.f24351a);
        } else {
            biometricManager = null;
        }
        this.f45603a = biometricManager;
        this.f45604b = i10 <= 29 ? new androidx.appcompat.view.a(aVar.f24351a) : aVar2;
    }

    public final int a() {
        androidx.appcompat.view.a aVar = this.f45604b;
        if (aVar == null) {
            AbstractC3612c.c("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        FingerprintManager c10 = AbstractC5959a.c(aVar.f24351a);
        if (c10 != null && AbstractC5959a.e(c10)) {
            FingerprintManager c11 = AbstractC5959a.c(aVar.f24351a);
            if (c11 != null && AbstractC5959a.d(c11)) {
                return 0;
            }
            return 11;
        }
        return 12;
    }
}
