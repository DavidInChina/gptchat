package v8;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: v8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5993a {

    /* renamed from: a  reason: collision with root package name */
    public static final List f47362a = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");

    /* renamed from: b  reason: collision with root package name */
    public static final List f47363b = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome");

    static {
        Arrays.asList("com.chrome.beta", "com.android.chrome");
    }

    public static boolean a(PackageManager packageManager, String str, int i10) {
        int i11;
        long longVersionCode;
        if (f47363b.contains(str)) {
            return true;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageManager.getPackageInfo(str, 0).getLongVersionCode();
                i11 = (int) longVersionCode;
            } else {
                i11 = packageManager.getPackageInfo(str, 0).versionCode;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            i11 = 0;
        }
        if (i11 >= i10) {
            return true;
        }
        return false;
    }
}
