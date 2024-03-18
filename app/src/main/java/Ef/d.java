package ef;

import id.AbstractC3557B;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f29374a = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC3557B.c0("r", runnable);
        Thread thread = new Thread(runnable);
        thread.setName("LK_RTC_THREAD_" + this.f29374a.incrementAndGet());
        return thread;
    }
}
