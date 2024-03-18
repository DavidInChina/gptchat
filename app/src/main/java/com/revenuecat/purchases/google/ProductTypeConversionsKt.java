package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0000\u00a8\u0006\u0004"}, d2 = {"toGoogleProductType", "", "Lcom/revenuecat/purchases/ProductType;", "toRevenueCatProductType", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class ProductTypeConversionsKt {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String toGoogleProductType(ProductType productType) {
        AbstractC3557B.c0("<this>", productType);
        int i10 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return "subs";
        }
        return "inapp";
    }

    public static final ProductType toRevenueCatProductType(String str) {
        if (AbstractC3557B.K(str, "inapp")) {
            return ProductType.INAPP;
        }
        if (AbstractC3557B.K(str, "subs")) {
            return ProductType.SUBS;
        }
        return ProductType.UNKNOWN;
    }
}
