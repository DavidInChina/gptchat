package u3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: u3.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5834g {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
