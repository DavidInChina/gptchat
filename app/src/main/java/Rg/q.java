package Rg;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class q extends CancellationException {
    public q() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
