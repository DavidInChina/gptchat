package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchasedProducts", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1 extends o implements k {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ OfflineCustomerInfoCalculator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCustomerInfoCalculator$computeOfflineCustomerInfo$1(k kVar, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, String str, k kVar2) {
        super(1);
        this.$onError = kVar;
        this.this$0 = offlineCustomerInfoCalculator;
        this.$appUserID = str;
        this.$onSuccess = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(List<PurchasedProduct> list) {
        CustomerInfo buildCustomerInfoUsingListOfPurchases;
        AbstractC3557B.c0("purchasedProducts", list);
        if (!list.isEmpty()) {
            for (PurchasedProduct purchasedProduct : list) {
                if (purchasedProduct.getStoreTransaction().getType() == ProductType.INAPP) {
                    PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_UNSUPPORTED_INAPP_PURCHASES);
                    LogUtilsKt.errorLog$default(String.format(CustomerInfoStrings.COMPUTING_OFFLINE_CUSTOMER_INFO_FAILED, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
                    this.$onError.invoke(purchasesError);
                    return;
                }
            }
        }
        buildCustomerInfoUsingListOfPurchases = this.this$0.buildCustomerInfoUsingListOfPurchases(this.$appUserID, list);
        this.$onSuccess.invoke(buildCustomerInfoUsingListOfPurchases);
    }
}
