package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.z;
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class AmazonBilling$getMissingSkusForReceipts$1$2 extends o implements k {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ n $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ z $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, z zVar, n nVar, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = zVar;
        this.$onCompletion = nVar;
        this.$successMap = map2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        AbstractC3557B.c0("error", purchasesError);
        AbstractC2469q0.t(new Object[]{purchasesError}, 1, AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, LogIntent.AMAZON_ERROR);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        AbstractC3557B.b0("receipt.receiptId", receiptId);
        map.put(receiptId, purchasesError);
        z zVar = this.$receiptsLeft;
        int i10 = zVar.f37647Y - 1;
        zVar.f37647Y = i10;
        if (i10 == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
