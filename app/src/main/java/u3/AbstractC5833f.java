package u3;

import android.os.Handler;
import android.os.Looper;

/* renamed from: u3.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5833f {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
