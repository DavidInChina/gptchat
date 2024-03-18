package r;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f44151a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f44152b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f44153c;

    public c() {
        this.f44151a = 1;
        this.f44153c = Executors.defaultThreadFactory();
        this.f44152b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f44152b;
        switch (this.f44151a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + atomicInteger.getAndIncrement());
                return thread;
            default:
                Thread newThread = ((ThreadFactory) this.f44153c).newThread(runnable);
                int andIncrement = atomicInteger.getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
        }
    }

    public c(e eVar) {
        this.f44151a = 0;
        this.f44153c = eVar;
        this.f44152b = new AtomicInteger(0);
    }
}
