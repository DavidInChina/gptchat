package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.util.Map;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.MDC;

/* loaded from: classes2.dex */
public class MDCScheduledTHExecutor extends ScheduledThreadPoolExecutor {
    private static final String AFFINITY_THREAD_VAR = "AffTh";
    private static StackLogger logger = CommonLogger.getLogger(MDCScheduledTHExecutor.class);

    /* loaded from: classes.dex */
    public class MDCFuture<V> implements RunnableScheduledFuture<V> {
        boolean done = false;
        Runnable runnable;
        RunnableScheduledFuture<V> task;

        public MDCFuture(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
            this.task = runnableScheduledFuture;
            this.runnable = runnable;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.task.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.task.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return this.task.getDelay(timeUnit);
        }

        public Runnable getRunnable() {
            return this.runnable;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.task.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.task.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return this.task.isPeriodic();
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            this.task.run();
        }

        public int compareTo(Delayed delayed) {
            return this.task.compareTo(delayed);
        }

        @Override // java.util.concurrent.Future
        public V get(long j6, TimeUnit timeUnit) {
            return this.task.get(j6, timeUnit);
        }
    }

    public MDCScheduledTHExecutor(int i10) {
        super(i10);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        if (logger.isLoggingEnabled(16) && (runnable instanceof MDCFuture)) {
            Runnable runnable2 = ((MDCFuture) runnable).runnable;
            if (runnable2 instanceof MDCTask) {
                Map<String, String> mDCVars = ((MDCTask) runnable2).getMDCVars();
                if (mDCVars != null) {
                    for (String str : mDCVars.keySet()) {
                        MDC.remove(str);
                    }
                    return;
                }
                MDC.remove(AFFINITY_THREAD_VAR);
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (logger.isLoggingEnabled(16) && (runnable instanceof MDCFuture)) {
            Runnable runnable2 = ((MDCFuture) runnable).runnable;
            if (runnable2 instanceof MDCTask) {
                MDCTask mDCTask = (MDCTask) runnable2;
                Map<String, String> mDCVars = mDCTask.getMDCVars();
                if (mDCVars != null) {
                    for (String str : mDCVars.keySet()) {
                        MDC.put(str, mDCVars.get(str));
                    }
                } else if (mDCTask.getThreadHash() != null) {
                    MDC.put(AFFINITY_THREAD_VAR, mDCTask.getThreadHash());
                }
            }
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new MDCFuture(runnable, runnableScheduledFuture);
    }

    public MDCScheduledTHExecutor(int i10, ThreadFactory threadFactory) {
        super(i10, threadFactory);
    }

    public MDCScheduledTHExecutor(int i10, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, rejectedExecutionHandler);
    }

    public MDCScheduledTHExecutor(int i10, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, threadFactory, rejectedExecutionHandler);
    }
}
