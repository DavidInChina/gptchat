package u6;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: u6.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ScheduledExecutorServiceC5844a implements ScheduledExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
    }
}
