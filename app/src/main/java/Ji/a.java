package Ji;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class a implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        th2.printStackTrace();
    }
}
