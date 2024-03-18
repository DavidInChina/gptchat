package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/android/billingclient/api/Purchase;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class BillingWrapper$onPurchasesUpdated$3$1 extends o implements k {
    public static final BillingWrapper$onPurchasesUpdated$3$1 INSTANCE = new BillingWrapper$onPurchasesUpdated$3$1();

    public BillingWrapper$onPurchasesUpdated$3$1() {
        super(1);
    }

    public final CharSequence invoke(Purchase purchase) {
        AbstractC3557B.c0("it", purchase);
        return PurchaseExtensionsKt.toHumanReadableDescription(purchase);
    }
}
