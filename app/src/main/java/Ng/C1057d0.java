package Ng;

import Sg.AbstractC1392d;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nf.AbstractC4831k;
import q.RunnableC5216j;

/* renamed from: Ng.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1057d0 extends AbstractC1055c0 implements M {

    /* renamed from: Z  reason: collision with root package name */
    public final Executor f12933Z;

    public C1057d0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f12933Z = executor;
        Method method2 = AbstractC1392d.f16649a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = AbstractC1392d.f16649a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f12933Z;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1057d0) && ((C1057d0) obj).f12933Z == this.f12933Z) {
            return true;
        }
        return false;
    }

    @Override // Ng.M
    public final void h(long j6, C1072l c1072l) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f12933Z;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new RunnableC5216j(this, c1072l, 28), j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException g10 = A7.b.g("The task was rejected", e10);
                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) c1072l.f12956j0.get(C1071k0.f12951Y);
                if (abstractC1073l0 != null) {
                    abstractC1073l0.k(g10);
                }
            }
        }
        if (scheduledFuture != null) {
            c1072l.w(new C1066i(0, scheduledFuture));
        } else {
            I.f12886n0.h(j6, c1072l);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f12933Z);
    }

    @Override // Ng.M
    public final T i(long j6, Runnable runnable, AbstractC4831k abstractC4831k) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f12933Z;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException g10 = A7.b.g("The task was rejected", e10);
                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) abstractC4831k.get(C1071k0.f12951Y);
                if (abstractC1073l0 != null) {
                    abstractC1073l0.k(g10);
                }
            }
        }
        if (scheduledFuture != null) {
            return new S(scheduledFuture);
        }
        return I.f12886n0.i(j6, runnable, abstractC4831k);
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        try {
            this.f12933Z.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException g10 = A7.b.g("The task was rejected", e10);
            AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) abstractC4831k.get(C1071k0.f12951Y);
            if (abstractC1073l0 != null) {
                abstractC1073l0.k(g10);
            }
            Q.f12906c.r(abstractC4831k, runnable);
        }
    }

    @Override // Ng.B
    public final String toString() {
        return this.f12933Z.toString();
    }
}
