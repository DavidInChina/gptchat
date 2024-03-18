package o1;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: o1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4887b {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i10) {
        activity.requestPermissions(strArr, i10);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
