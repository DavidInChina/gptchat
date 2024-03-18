package Ii;

import java.util.concurrent.ThreadFactory;

/* renamed from: Ii.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC0797b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("app-upgrade-detector");
        return thread;
    }
}
