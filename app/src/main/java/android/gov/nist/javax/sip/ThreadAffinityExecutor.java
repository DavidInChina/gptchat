package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.NamingThreadFactory;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ThreadAffinityExecutor implements ScheduledExecutorService {
    private static StackLogger logger = CommonLogger.getLogger(ThreadAffinityExecutor.class);
    private final AtomicInteger nextThread = new AtomicInteger(0);
    private final List<MDCScheduledTHExecutor> executors = new ArrayList();

    public ThreadAffinityExecutor(int i10) {
        NamingThreadFactory namingThreadFactory = new NamingThreadFactory("AffinityJAIN");
        for (int i11 = 0; i11 < i10; i11++) {
            this.executors.add(new MDCScheduledTHExecutor(1, namingThreadFactory));
        }
        schedulePurgeTaskIfNeeded();
    }

    private int calculateAffinityThread(Runnable runnable) {
        if (runnable instanceof ThreadAffinityIdentifier) {
            Object threadHash = ((ThreadAffinityIdentifier) runnable).getThreadHash();
            if (threadHash != null) {
                int abs = Math.abs(threadHash.hashCode() % this.executors.size());
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Runnable assigned to thread (" + threadHash + Separators.COMMA + abs + Separators.RPAREN);
                    return abs;
                }
                return abs;
            }
            return retrieveNextThread();
        }
        return retrieveNextThread();
    }

    private synchronized int retrieveNextThread() {
        int incrementAndGet;
        try {
            incrementAndGet = this.nextThread.incrementAndGet();
            if (incrementAndGet >= this.executors.size()) {
                this.nextThread.set(0);
                incrementAndGet = 0;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Next thread id=" + incrementAndGet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return incrementAndGet;
    }

    private void schedulePurgeTaskIfNeeded() {
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.executors.get(0).awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executors.get(calculateAffinityThread(runnable)).execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.executors.get(0).isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.executors.get(0).isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return this.executors.get(calculateAffinityThread(runnable)).schedule(runnable, j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return this.executors.get(calculateAffinityThread(runnable)).scheduleAtFixedRate(runnable, j6, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return this.executors.get(calculateAffinityThread(runnable)).scheduleWithFixedDelay(runnable, j6, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        for (MDCScheduledTHExecutor mDCScheduledTHExecutor : this.executors) {
            mDCScheduledTHExecutor.shutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.executors.get(calculateAffinityThread(runnable)).submit(runnable, t10);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.executors.get(calculateAffinityThread(runnable)).submit(runnable);
    }
}
