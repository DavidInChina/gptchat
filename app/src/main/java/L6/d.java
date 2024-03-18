package L6;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final d f10750a = new Object();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "dd-task-scheduler");
        thread.setDaemon(true);
        thread.setContextClassLoader(null);
        return thread;
    }
}
