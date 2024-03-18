package L6;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import x2.j;

/* loaded from: classes.dex */
public final class c extends AbstractExecutorService {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f10748Z = new c();

    /* renamed from: Y  reason: collision with root package name */
    public final ScheduledExecutorService f10749Y;

    public c() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(d.f10750a);
        this.f10749Y = newSingleThreadScheduledExecutor;
        try {
            Runtime.getRuntime().addShutdownHook(new j(newSingleThreadScheduledExecutor, 0));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f10749Y.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10749Y.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f10749Y.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f10749Y.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f10749Y.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f10749Y.shutdownNow();
    }
}
