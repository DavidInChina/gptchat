package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.common.BackendHelper;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.q;
import kotlin.Metadata;
import l8.AbstractC4344b;
import wf.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\b\u001d\u0010\u001eJE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u00b2\u0001\u0010\u0017\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0011j\u0002`\u0012\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00050\u0014j\u0002`\u00150\u00130\u00102J\u0010\u0016\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0011j\u0002`\u0012\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u00050\u0014j\u0002`\u00150\u00130\u00108F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBackend;", "", "", "receiptId", "storeUserID", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Ljf/y;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getAmazonReceiptData", "(Ljava/lang/String;Ljava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "Lcom/revenuecat/purchases/common/BackendHelper;", "", "", "Lcom/revenuecat/purchases/amazon/CallbackCacheKey;", "", "Ljf/i;", "Lcom/revenuecat/purchases/amazon/PostAmazonReceiptCallback;", "<set-?>", "postAmazonReceiptCallbacks", "Ljava/util/Map;", "getPostAmazonReceiptCallbacks", "()Ljava/util/Map;", "setPostAmazonReceiptCallbacks", "(Ljava/util/Map;)V", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonBackend {
    private final BackendHelper backendHelper;
    private volatile Map<List<String>, List<C3959i>> postAmazonReceiptCallbacks = new LinkedHashMap();

    public AmazonBackend(BackendHelper backendHelper) {
        AbstractC3557B.c0("backendHelper", backendHelper);
        this.backendHelper = backendHelper;
    }

    public final void getAmazonReceiptData(String str, String str2, k kVar, k kVar2) {
        AbstractC3557B.c0("receiptId", str);
        AbstractC3557B.c0("storeUserID", str2);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        ArrayList h32 = q.h3(new String[]{str, str2});
        AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new AmazonBackend$getAmazonReceiptData$call$1(this, str2, str, h32);
        C3959i c3959i = new C3959i(kVar, kVar2);
        synchronized (this) {
            try {
                if (!this.postAmazonReceiptCallbacks.containsKey(h32)) {
                    this.postAmazonReceiptCallbacks.put(h32, AbstractC4344b.N0(c3959i));
                    amazonBackend$getAmazonReceiptData$call$1.mo122invoke();
                } else {
                    List<C3959i> list = this.postAmazonReceiptCallbacks.get(h32);
                    AbstractC3557B.Z(list);
                    list.add(c3959i);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Map<List<String>, List<C3959i>> getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(Map<List<String>, List<C3959i>> map) {
        AbstractC3557B.c0("<set-?>", map);
        this.postAmazonReceiptCallbacks = map;
    }
}
