package io.sentry.android.core;

import android.os.Build;
import io.sentry.EnumC3642e1;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final io.sentry.H f33951a;

    public B(io.sentry.H h10) {
        Ad.l.Z0("The ILogger object is required.", h10);
        this.f33951a = h10;
    }

    public final Boolean a() {
        boolean z10;
        try {
            if (Build.BRAND.startsWith("generic")) {
                if (!Build.DEVICE.startsWith("generic")) {
                }
                z10 = true;
                return Boolean.valueOf(z10);
            }
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                String str2 = Build.HARDWARE;
                if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                    String str3 = Build.MODEL;
                    if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.PRODUCT;
                        if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains("sdk") && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                            z10 = false;
                            return Boolean.valueOf(z10);
                        }
                    }
                }
            }
            z10 = true;
            return Boolean.valueOf(z10);
        } catch (Throwable th2) {
            this.f33951a.d(EnumC3642e1.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
