package y1;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: y1.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6495e {
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
