package com.pairip;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class Utils {
    public static ThreadFactory createThreadFactory(final boolean isDaemon, final int priority) {
        return new ThreadFactory() { // from class: com.pairip.Utils.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable r10) {
                Thread thread = new Thread(r10);
                thread.setDaemon(isDaemon);
                thread.setPriority(priority);
                return thread;
            }
        };
    }

    private Utils() {
    }
}
