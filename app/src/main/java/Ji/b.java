package Ji;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadFactory f9286b = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f9287a;

    public b(a aVar) {
        this.f9287a = aVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f9286b.newThread(runnable);
        newThread.setUncaughtExceptionHandler(this.f9287a);
        return newThread;
    }
}
