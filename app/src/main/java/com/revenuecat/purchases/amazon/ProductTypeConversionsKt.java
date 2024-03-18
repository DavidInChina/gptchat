package com.revenuecat.purchases.amazon;

import K0.e;
import com.amazon.device.iap.model.ProductType;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"}, d2 = {"toRevenueCatProductType", "Lcom/revenuecat/purchases/ProductType;", "Lcom/amazon/device/iap/model/ProductType;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class ProductTypeConversionsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(ProductType productType) {
        AbstractC3557B.c0("<this>", productType);
        int i10 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return com.revenuecat.purchases.ProductType.SUBS;
                }
                throw new e(0);
            }
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        return com.revenuecat.purchases.ProductType.INAPP;
    }
}
