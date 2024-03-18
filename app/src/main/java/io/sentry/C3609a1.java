package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.a1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3609a1 implements P {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f33912a = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC3690w((Object) null));

    @Override // io.sentry.P
    public final void c(long j6) {
        synchronized (this.f33912a) {
            if (!this.f33912a.isShutdown()) {
                this.f33912a.shutdown();
                try {
                    if (!this.f33912a.awaitTermination(j6, TimeUnit.MILLISECONDS)) {
                        this.f33912a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f33912a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.P
    public final boolean f() {
        boolean isShutdown;
        synchronized (this.f33912a) {
            isShutdown = this.f33912a.isShutdown();
        }
        return isShutdown;
    }

    @Override // io.sentry.P
    public final Future l(Runnable runnable, long j6) {
        return this.f33912a.schedule(runnable, j6, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.P
    public final Future submit(Runnable runnable) {
        return this.f33912a.submit(runnable);
    }
}
