package Ji;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f9288a;

    /* renamed from: b  reason: collision with root package name */
    public static ExecutorService f9289b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9290c = Runtime.getRuntime().availableProcessors();

    /* renamed from: d  reason: collision with root package name */
    public static final long f9291d = 100000;

    /* JADX WARN: Type inference failed for: r1v0, types: [Ji.a, java.lang.Object] */
    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new b(new Object()));
        f9288a = newCachedThreadPool;
        f9289b = newCachedThreadPool;
    }

    public static long a() {
        return f9291d;
    }

    public static int b() {
        return f9290c;
    }

    public static Future c(Runnable runnable) {
        if (f9289b.isShutdown() || f9289b.isTerminated()) {
            f9289b = f9288a;
        }
        return f9289b.submit(runnable);
    }

    public static void d(Future[] futureArr) {
        for (Future future : futureArr) {
            future.get();
        }
    }
}
