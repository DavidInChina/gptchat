package com.revenuecat.purchases.common;

import Af.c;
import Af.d;
import Cf.i;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import q1.AbstractC5260f;
import r9.y;
import u5.RunnableC5841a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B%\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher;", "", "Ljava/lang/Runnable;", "command", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Ljf/y;", "enqueue", "(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "", "isClosed", "()Z", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "runningIntegrationTests", "Z", "<init>", "(Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Z)V", "Companion", "AsyncCall", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class Dispatcher {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Ljava/lang/Runnable;", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "run", "()V", "<init>", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call();

        public void onCompletion(HTTPResult hTTPResult) {
            AbstractC3557B.c0("result", hTTPResult);
        }

        public void onError(PurchasesError purchasesError) {
            AbstractC3557B.c0("error", purchasesError);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (SignatureVerificationException e10) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e10);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (IOException e11) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e11);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (SecurityException e12) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e12);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (JSONException e13) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(e13);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$Companion;", "", "()V", "INTEGRATION_TEST_DELAY_PERCENTAGE", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z10) {
        AbstractC3557B.c0("executorService", executorService);
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z10;
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                delay = Delay.NONE;
            }
            dispatcher.enqueue(runnable, delay);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
    }

    public static final void enqueue$lambda$2$lambda$1(Runnable runnable, Dispatcher dispatcher) {
        AbstractC3557B.c0("$command", runnable);
        AbstractC3557B.c0("this$0", dispatcher);
        try {
            runnable.run();
        } catch (Exception e10) {
            LogUtilsKt.errorLog$default("Exception running command: " + e10, null, 2, null);
            Handler handler = dispatcher.mainHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.revenuecat.purchases.common.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        Dispatcher.enqueue$lambda$2$lambda$1$lambda$0(e10);
                    }
                });
            }
        }
    }

    public static final void enqueue$lambda$2$lambda$1$lambda$0(Exception exc) {
        AbstractC3557B.c0("$e", exc);
        throw exc;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [Cf.i, Cf.l] */
    public void enqueue(Runnable runnable, Delay delay) {
        AbstractC3557B.c0("command", runnable);
        AbstractC3557B.c0("delay", delay);
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    RunnableC5841a runnableC5841a = new RunnableC5841a(runnable, 8, this);
                    if (delay != Delay.NONE && (this.executorService instanceof ScheduledExecutorService)) {
                        ?? iVar = new i(Mg.b.e(delay.m57getMinDelayUwyO8pc()), Mg.b.e(delay.m56getMaxDelayUwyO8pc()));
                        c cVar = d.f840Y;
                        AbstractC3557B.c0("random", cVar);
                        try {
                            long G10 = AbstractC5260f.G(cVar, iVar);
                            if (this.runningIntegrationTests) {
                                G10 = (long) (G10 * 0.01d);
                            }
                            ((ScheduledExecutorService) this.executorService).schedule(runnableC5841a, G10, TimeUnit.MILLISECONDS);
                        } catch (IllegalArgumentException e10) {
                            throw new NoSuchElementException(e10.getMessage());
                        }
                    } else {
                        this.executorService.submit(runnableC5841a);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isClosed() {
        boolean isShutdown;
        synchronized (this.executorService) {
            isShutdown = this.executorService.isShutdown();
        }
        return isShutdown;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, Handler handler, boolean z10, int i10, g gVar) {
        this(executorService, (i10 & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i10 & 4) != 0 ? false : z10);
    }
}
