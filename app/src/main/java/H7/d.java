package H7;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class d extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, int i10) {
        super(looper);
        if (i10 == 1) {
            super(looper);
            Looper.getMainLooper();
        } else if (i10 != 2) {
            Looper.getMainLooper();
        } else {
            super(looper);
            Looper.getMainLooper();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Looper looper, Handler.Callback callback, int i10) {
        super(looper, callback);
        if (i10 != 1) {
            Looper.getMainLooper();
            return;
        }
        super(looper, callback);
        Looper.getMainLooper();
    }
}
