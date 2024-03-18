package com.revenuecat.purchases.models;

import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/models/BillingFeature;", "", "playBillingClientName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getPlayBillingClientName", "()Ljava/lang/String;", "SUBSCRIPTIONS", "SUBSCRIPTIONS_UPDATE", "PRICE_CHANGE_CONFIRMATION", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public enum BillingFeature {
    SUBSCRIPTIONS(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS),
    SUBSCRIPTIONS_UPDATE("subscriptionsUpdate"),
    PRICE_CHANGE_CONFIRMATION("priceChangeConfirmation");
    
    private final String playBillingClientName;

    BillingFeature(String str) {
        this.playBillingClientName = str;
    }

    public final String getPlayBillingClientName() {
        return this.playBillingClientName;
    }
}
