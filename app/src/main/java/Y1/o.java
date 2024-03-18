package y1;

import android.os.Message;

/* loaded from: classes2.dex */
public abstract class o {
    public static boolean a(Message message) {
        return message.isAsynchronous();
    }

    public static void b(Message message, boolean z10) {
        message.setAsynchronous(z10);
    }
}
