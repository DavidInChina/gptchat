package B0;

import java.util.concurrent.CancellationException;

/* renamed from: B0.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0196m extends CancellationException {
    public C0196m(long j6) {
        super("Timed out waiting for " + j6 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
