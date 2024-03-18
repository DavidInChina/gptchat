package com.revenuecat.purchases.google.usecase;

import K4.AbstractC0815c;
import K4.C0822j;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.google.BillingResponse;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.google.ErrorsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import id.AbstractC3557B;
import java.io.PrintWriter;
import java.io.StringWriter;
import jf.y;
import kotlin.Metadata;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BS\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u000bj\u0002`&\u0012*\u0010*\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0004\u0012\u00020\b0(j\u0002`)\u00a2\u0006\u0004\b;\u0010<J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ+\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH&\u00a2\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H&\u00a2\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00028\u00002\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000b\u00a2\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\b*\u0004\u0018\u00010\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u000bH\u0004\u00a2\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0\u000bj\u0002`&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\f\u0010'R;\u0010*\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0004\u0012\u00020\b0(j\u0002`)8\u0006\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0014X\u0094D\u00a2\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b9\u0010\u0005\u00a8\u0006="}, d2 = {"Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", TokenNames.T, "", "", "getStackTrace", "()Ljava/lang/String;", "LK4/j;", "billingResult", "Ljf/y;", "forwardError", "(LK4/j;)V", "Lkotlin/Function1;", "onError", "backoffOrRetryNetworkError", "(Lwf/k;LK4/j;)V", "backoffOrErrorIfUseInSession", "retryWithBackoff", "()V", "", "delayMilliseconds", "run", "(J)V", "executeAsync", "received", "onOk", "(Ljava/lang/Object;)V", "response", "onSuccess", "processResult", "(LK4/j;Ljava/lang/Object;Lwf/k;Lwf/k;)V", "LK4/c;", "receivingFunction", "withConnectedClient", "(LK4/c;Lwf/k;)V", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "useCaseParams", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "Lwf/k;", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "Lwf/n;", "getExecuteRequestOnUIThread", "()Lwf/n;", "", "backoffForNetworkErrors", "Z", "getBackoffForNetworkErrors", "()Z", "", "maxRetries", TokenNames.f24313I, "retryAttempt", "retryBackoffMilliseconds", "J", "getErrorMessage", "errorMessage", "<init>", "(Lcom/revenuecat/purchases/google/usecase/UseCaseParams;Lwf/k;Lwf/n;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public abstract class BillingClientUseCase<T> {
    private final boolean backoffForNetworkErrors;
    private final n executeRequestOnUIThread;
    private final k onError;
    private int retryAttempt;
    private final UseCaseParams useCaseParams;
    private final int maxRetries = 3;
    private long retryBackoffMilliseconds = 878;

    public BillingClientUseCase(UseCaseParams useCaseParams, k kVar, n nVar) {
        AbstractC3557B.c0("useCaseParams", useCaseParams);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("executeRequestOnUIThread", nVar);
        this.useCaseParams = useCaseParams;
        this.onError = kVar;
        this.executeRequestOnUIThread = nVar;
    }

    private final void backoffOrErrorIfUseInSession(k kVar, C0822j c0822j) {
        if (this.useCaseParams.getAppInBackground()) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, BillingStrings.BILLING_SERVICE_UNAVAILABLE_BACKGROUND);
            if (this.retryBackoffMilliseconds < BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS) {
                retryWithBackoff();
                return;
            } else {
                kVar.invoke(c0822j);
                return;
            }
        }
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_UNAVAILABLE_FOREGROUND);
        kVar.invoke(c0822j);
    }

    private final void backoffOrRetryNetworkError(k kVar, C0822j c0822j) {
        int i10;
        if (getBackoffForNetworkErrors() && this.retryBackoffMilliseconds < BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS) {
            retryWithBackoff();
        } else if (!getBackoffForNetworkErrors() && (i10 = this.retryAttempt) < this.maxRetries) {
            this.retryAttempt = i10 + 1;
            executeAsync();
        } else {
            kVar.invoke(c0822j);
        }
    }

    public final void forwardError(C0822j c0822j) {
        String str = getErrorMessage() + " - " + BillingResultExtensionsKt.toHumanReadableDescription(c0822j);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, str);
        k kVar = this.onError;
        PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(c0822j.f9439a, str);
        LogUtilsKt.errorLog(billingResponseToPurchasesError);
        kVar.invoke(billingResponseToPurchasesError);
    }

    private final String getStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Throwable().printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        AbstractC3557B.b0("stringWriter.toString()", stringWriter2);
        return stringWriter2;
    }

    public static /* synthetic */ void processResult$default(BillingClientUseCase billingClientUseCase, C0822j c0822j, Object obj, k kVar, k kVar2, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 4) != 0) {
                kVar = new BillingClientUseCase$processResult$1(billingClientUseCase);
            }
            if ((i10 & 8) != 0) {
                kVar2 = new BillingClientUseCase$processResult$2(billingClientUseCase);
            }
            billingClientUseCase.processResult(c0822j, obj, kVar, kVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processResult");
    }

    private final void retryWithBackoff() {
        long j6 = this.retryBackoffMilliseconds;
        this.retryBackoffMilliseconds = Math.min(2 * j6, (long) BillingClientUseCaseKt.RETRY_TIMER_MAX_TIME_MILLISECONDS);
        run(j6);
    }

    public static /* synthetic */ void run$default(BillingClientUseCase billingClientUseCase, long j6, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j6 = 0;
            }
            billingClientUseCase.run(j6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
    }

    public abstract void executeAsync();

    public boolean getBackoffForNetworkErrors() {
        return this.backoffForNetworkErrors;
    }

    public abstract String getErrorMessage();

    public final n getExecuteRequestOnUIThread() {
        return this.executeRequestOnUIThread;
    }

    public abstract void onOk(T t10);

    public final void processResult(C0822j c0822j, T t10, k kVar, k kVar2) {
        AbstractC3557B.c0("billingResult", c0822j);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        BillingResponse fromCode = BillingResponse.Companion.fromCode(c0822j.f9439a);
        if (AbstractC3557B.K(fromCode, BillingResponse.OK.INSTANCE)) {
            this.retryBackoffMilliseconds = 878L;
            kVar.invoke(t10);
        } else if (AbstractC3557B.K(fromCode, BillingResponse.ServiceDisconnected.INSTANCE)) {
            LogWrapperKt.log(LogIntent.GOOGLE_ERROR, BillingStrings.BILLING_SERVICE_DISCONNECTED);
            run$default(this, 0L, 1, null);
        } else if (AbstractC3557B.K(fromCode, BillingResponse.ServiceUnavailable.INSTANCE)) {
            backoffOrErrorIfUseInSession(kVar2, c0822j);
        } else if (AbstractC3557B.K(fromCode, BillingResponse.NetworkError.INSTANCE) || AbstractC3557B.K(fromCode, BillingResponse.Error.INSTANCE)) {
            backoffOrRetryNetworkError(kVar2, c0822j);
        } else {
            kVar2.invoke(c0822j);
        }
    }

    public final void run(long j6) {
        this.executeRequestOnUIThread.invoke(Long.valueOf(j6), new BillingClientUseCase$run$1(this));
    }

    public final void withConnectedClient(AbstractC0815c abstractC0815c, k kVar) {
        AbstractC3557B.c0("receivingFunction", kVar);
        y yVar = null;
        if (abstractC0815c != null) {
            if (!abstractC0815c.c()) {
                abstractC0815c = null;
            }
            if (abstractC0815c != null) {
                kVar.invoke(abstractC0815c);
                yVar = y.f36177a;
            }
        }
        if (yVar == null) {
            AbstractC2469q0.t(new Object[]{getStackTrace()}, 1, BillingStrings.BILLING_CLIENT_DISCONNECTED, LogIntent.GOOGLE_WARNING);
        }
    }
}
