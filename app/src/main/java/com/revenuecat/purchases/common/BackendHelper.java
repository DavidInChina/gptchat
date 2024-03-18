package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kotlin.Metadata;
import wf.k;
import wf.o;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b)\u0010*J\u0087\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\u001a\u0010\t\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2 \u0010\u0013\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u00a8\u0006+"}, d2 = {"Lcom/revenuecat/purchases/common/BackendHelper;", "", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "", "body", "", "Ljf/i;", "postFieldsToSign", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Ljf/y;", "onError", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "onCompleted", "performRequest", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/common/Delay;Lwf/k;Lwf/o;)V", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "enqueue", "(Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Delay;)V", "apiKey", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "Lcom/revenuecat/purchases/common/HTTPClient;", "authenticationHeaders", "Ljava/util/Map;", "getAuthenticationHeaders$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/HTTPClient;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BackendHelper {
    private final String apiKey;
    private final AppConfig appConfig;
    private final Map<String, String> authenticationHeaders;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;

    public BackendHelper(String str, Dispatcher dispatcher, AppConfig appConfig, HTTPClient hTTPClient) {
        AbstractC3557B.c0("apiKey", str);
        AbstractC3557B.c0("dispatcher", dispatcher);
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("httpClient", hTTPClient);
        this.apiKey = str;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
        this.httpClient = hTTPClient;
        this.authenticationHeaders = P4.a.o0(new C3959i(SIPHeaderNames.AUTHORIZATION, R.a.r("Bearer ", str)));
    }

    public static /* synthetic */ void enqueue$default(BackendHelper backendHelper, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            delay = Delay.NONE;
        }
        backendHelper.enqueue(asyncCall, dispatcher, delay);
    }

    public final void enqueue(Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay) {
        AbstractC3557B.c0("call", asyncCall);
        AbstractC3557B.c0("dispatcher", dispatcher);
        AbstractC3557B.c0("delay", delay);
        if (dispatcher.isClosed()) {
            LogUtilsKt.errorLog$default("Enqueuing operation in closed dispatcher.", null, 2, null);
        } else {
            dispatcher.enqueue(asyncCall, delay);
        }
    }

    public final Map<String, String> getAuthenticationHeaders$purchases_customEntitlementComputationRelease() {
        return this.authenticationHeaders;
    }

    public final void performRequest(final Endpoint endpoint, final Map<String, ? extends Object> map, final List<C3959i> list, Delay delay, final k kVar, final o oVar) {
        AbstractC3557B.c0("endpoint", endpoint);
        AbstractC3557B.c0("delay", delay);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("onCompleted", oVar);
        enqueue(new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.BackendHelper$performRequest$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                HTTPClient hTTPClient;
                AppConfig appConfig;
                hTTPClient = BackendHelper.this.httpClient;
                appConfig = BackendHelper.this.appConfig;
                return HTTPClient.performRequest$default(hTTPClient, appConfig.getBaseURL(), endpoint, map, list, BackendHelper.this.getAuthenticationHeaders$purchases_customEntitlementComputationRelease(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult hTTPResult) {
                PurchasesError purchasesError;
                AbstractC3557B.c0("result", hTTPResult);
                if (!BackendHelperKt.isSuccessful(hTTPResult)) {
                    purchasesError = ErrorsKt.toPurchasesError(hTTPResult);
                    LogUtilsKt.errorLog(purchasesError);
                } else {
                    purchasesError = null;
                }
                oVar.invoke(purchasesError, Integer.valueOf(hTTPResult.getResponseCode()), hTTPResult.getBody());
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError purchasesError) {
                AbstractC3557B.c0("error", purchasesError);
                kVar.invoke(purchasesError);
            }
        }, this.dispatcher, delay);
    }
}
