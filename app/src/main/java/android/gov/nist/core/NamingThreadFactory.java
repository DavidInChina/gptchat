package android.gov.nist.core;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class NamingThreadFactory implements ThreadFactory {
    private String baseName;
    private ThreadFactory delegate;
    private AtomicInteger index;

    public NamingThreadFactory(String str) {
        this(str, null);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.delegate.newThread(runnable);
        newThread.setName("pool-" + this.baseName + "-thread-" + this.index.getAndIncrement());
        return newThread;
    }

    public NamingThreadFactory(String str, ThreadFactory threadFactory) {
        this.baseName = str;
        this.delegate = threadFactory;
        if (threadFactory == null) {
            this.delegate = Executors.defaultThreadFactory();
        }
        this.index = new AtomicInteger(1);
    }
}
