package com.revenuecat.purchases.google;

import K4.C0819g;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import id.AbstractC3557B;
import j.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"LK4/g;", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Ljf/y;", "setUpgradeInfo", "(LK4/g;Lcom/revenuecat/purchases/common/ReplaceProductInfo;)V", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BillingFlowParamsExtensionsKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, f3.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, f3.f] */
    public static final void setUpgradeInfo(C0819g c0819g, ReplaceProductInfo replaceProductInfo) {
        GoogleReplacementMode googleReplacementMode;
        AbstractC3557B.c0("<this>", c0819g);
        AbstractC3557B.c0("replaceProductInfo", replaceProductInfo);
        ?? obj = new Object();
        obj.f29549b = 0;
        obj.f29550c = 0;
        obj.f29551d = replaceProductInfo.getOldPurchase().getPurchaseToken();
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode != null) {
            if (replacementMode instanceof GoogleReplacementMode) {
                googleReplacementMode = (GoogleReplacementMode) replacementMode;
            } else {
                googleReplacementMode = null;
            }
            if (googleReplacementMode == null) {
                LogUtilsKt.errorLog$default("Got non-Google replacement mode", null, 2, null);
            } else {
                obj.f29550c = googleReplacementMode.getPlayBillingClientMode();
            }
        }
        j a5 = obj.a();
        ?? obj2 = new Object();
        obj2.f29551d = (String) a5.f35819h0;
        obj2.f29549b = a5.f35817Y;
        obj2.f29550c = a5.f35818Z;
        obj2.f29552e = (String) a5.f35820i0;
        c0819g.f9429d = obj2;
    }
}
