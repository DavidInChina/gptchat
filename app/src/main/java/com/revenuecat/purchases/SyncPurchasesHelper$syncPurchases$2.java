package com.revenuecat.purchases;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SyncPurchasesHelper$syncPurchases$2 extends o implements k {
    final /* synthetic */ k $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPurchasesHelper$syncPurchases$2(k kVar) {
        super(1);
        this.$onError = kVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC3557B.c0("it", purchasesError);
        AbstractC2469q0.t(new Object[]{purchasesError}, 1, PurchaseStrings.SYNCING_PURCHASES_ERROR, LogIntent.RC_ERROR);
        this.$onError.invoke(purchasesError);
    }
}
