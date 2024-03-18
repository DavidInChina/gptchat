package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsManager$fetchAndCacheOfferings$2 extends o implements n {
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$fetchAndCacheOfferings$2(OfferingsManager offeringsManager, k kVar, k kVar2) {
        super(2);
        this.this$0 = offeringsManager;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override // wf.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        OfferingsCache offeringsCache;
        AbstractC3557B.c0("backendError", purchasesError);
        if (z10) {
            offeringsCache = this.this$0.offeringsCache;
            JSONObject cachedOfferingsResponse = offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                this.this$0.handleErrorFetchingOfferings(purchasesError, this.$onError);
                return;
            }
            LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
            this.this$0.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            return;
        }
        this.this$0.handleErrorFetchingOfferings(purchasesError, this.$onError);
    }
}
