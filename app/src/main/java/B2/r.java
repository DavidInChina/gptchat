package B2;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;

/* loaded from: classes2.dex */
public abstract class r {
    public static boolean a(Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th2) {
        return th2 instanceof C0205f;
    }

    public static boolean c(Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
