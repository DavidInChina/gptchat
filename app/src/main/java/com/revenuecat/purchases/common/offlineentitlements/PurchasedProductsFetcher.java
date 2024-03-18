package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import id.AbstractC3557B;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kf.t;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import wf.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJC\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u00a8\u0006\""}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProductsFetcher;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "createPurchasedProduct", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)Lcom/revenuecat/purchases/common/offlineentitlements/PurchasedProduct;", "purchaseAssociatedToProduct", "Ljava/util/Date;", "getExpirationDate", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Ljava/util/Date;", "", "appUserID", "Lkotlin/Function1;", "", "Ljf/y;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "queryActiveProducts", "(Ljava/lang/String;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/DateProvider;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider) {
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("billing", billingAbstract);
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.deviceCache = deviceCache;
        this.billing = billingAbstract;
        this.dateProvider = dateProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchasedProduct createPurchasedProduct(StoreTransaction storeTransaction, ProductEntitlementMapping productEntitlementMapping) {
        String str;
        List<String> list;
        Date expirationDate = getExpirationDate(storeTransaction);
        String str2 = (String) t.f2(storeTransaction.getProductIds());
        ProductEntitlementMapping.Mapping mapping = productEntitlementMapping.getMappings().get(str2);
        if (mapping != null) {
            str = mapping.getBasePlanId();
        } else {
            str = null;
        }
        String str3 = str;
        if (mapping == null || (list = mapping.getEntitlements()) == null) {
            list = v.f37483Y;
        }
        return new PurchasedProduct(str2, str3, storeTransaction, list, expirationDate);
    }

    private final Date getExpirationDate(StoreTransaction storeTransaction) {
        if (WhenMappings.$EnumSwitchMapping$0[storeTransaction.getType().ordinal()] == 1) {
            return new Date(TimeUnit.DAYS.toMillis(1L) + this.dateProvider.getNow().getTime());
        }
        return null;
    }

    public final void queryActiveProducts(String str, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccess", kVar);
        AbstractC3557B.c0("onError", kVar2);
        ProductEntitlementMapping productEntitlementMapping = this.deviceCache.getProductEntitlementMapping();
        if (productEntitlementMapping == null) {
            kVar2.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED));
        } else {
            this.billing.queryPurchases(str, new PurchasedProductsFetcher$queryActiveProducts$1(kVar, this, productEntitlementMapping), kVar2);
        }
    }

    public /* synthetic */ PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider, int i10, g gVar) {
        this(deviceCache, billingAbstract, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
