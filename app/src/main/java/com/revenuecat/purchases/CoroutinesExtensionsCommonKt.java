package com.revenuecat.purchases;

import com.google.android.gms.internal.play_billing.N;
import java.util.List;
import kotlin.Metadata;
import nf.AbstractC4825e;
import nf.C4833m;
import of.EnumC5000a;
import q1.AbstractC5260f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "(Lcom/revenuecat/purchases/Purchases;Lnf/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lnf/e;)Ljava/lang/Object;", "", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProducts", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lnf/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt {
    public static final Object awaitGetProducts(Purchases purchases, List list, ProductType productType, AbstractC4825e abstractC4825e) {
        C4833m c4833m = new C4833m(AbstractC5260f.z(abstractC4825e));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(c4833m), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(c4833m));
        Object b10 = c4833m.b();
        if (b10 == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return b10;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, AbstractC4825e abstractC4825e, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, abstractC4825e);
    }

    public static final Object awaitOfferings(Purchases purchases, AbstractC4825e abstractC4825e) {
        C4833m c4833m = new C4833m(AbstractC5260f.z(abstractC4825e));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(c4833m), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(c4833m));
        Object b10 = c4833m.b();
        if (b10 == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return b10;
    }

    public static final Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, AbstractC4825e abstractC4825e) {
        C4833m c4833m = new C4833m(AbstractC5260f.z(abstractC4825e));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(c4833m), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(c4833m)));
        Object b10 = c4833m.b();
        if (b10 == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return b10;
    }

    public static final Object awaitRestore(Purchases purchases, AbstractC4825e abstractC4825e) {
        C4833m c4833m = new C4833m(AbstractC5260f.z(abstractC4825e));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(c4833m), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(c4833m));
        Object b10 = c4833m.b();
        if (b10 == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return b10;
    }
}
