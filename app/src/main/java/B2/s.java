package B2;

import android.media.MediaDrm;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public abstract class s {
    public static boolean a(Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return AbstractC5530A.q(AbstractC5530A.r(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
