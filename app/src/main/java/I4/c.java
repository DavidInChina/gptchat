package I4;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class c implements ThreadFactory {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicInteger f8036d = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadGroup f8037a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f8038b = new AtomicInteger(1);

    /* renamed from: c  reason: collision with root package name */
    public final String f8039c;

    public c() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f8037a = threadGroup;
        this.f8039c = "lottie-" + f8036d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f8037a, runnable, this.f8039c + this.f8038b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
