package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jf.y;
import kf.AbstractC4268D;
import kf.AbstractC4273I;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionProducts", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsFactory$getStoreProductsById$1 extends o implements k {
    final /* synthetic */ k $onCompleted;
    final /* synthetic */ k $onError;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1(OfferingsFactory offeringsFactory, Set<String> set, k kVar, k kVar2) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productIds = set;
        this.$onCompleted = kVar;
        this.$onError = kVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(List list, Set set, OfferingsFactory offeringsFactory, k kVar, k kVar2) {
        BillingAbstract billingAbstract;
        AbstractC3557B.c0("$subscriptionProducts", list);
        AbstractC3557B.c0("$productIds", set);
        AbstractC3557B.c0("this$0", offeringsFactory);
        AbstractC3557B.c0("$onCompleted", kVar);
        AbstractC3557B.c0("$onError", kVar2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
            Object obj2 = linkedHashMap.get(productId);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(productId, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap m12 = AbstractC4268D.m1(linkedHashMap);
        Set<String> t22 = AbstractC4273I.t2(set, m12.keySet());
        if (!t22.isEmpty()) {
            billingAbstract = offeringsFactory.billing;
            billingAbstract.queryProductDetailsAsync(ProductType.INAPP, t22, new OfferingsFactory$getStoreProductsById$1$1$1(offeringsFactory, m12, kVar), new OfferingsFactory$getStoreProductsById$1$1$2(kVar2));
            return;
        }
        kVar.invoke(m12);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(final List<? extends StoreProduct> list) {
        Dispatcher dispatcher;
        AbstractC3557B.c0("subscriptionProducts", list);
        dispatcher = this.this$0.dispatcher;
        final Set<String> set = this.$productIds;
        final OfferingsFactory offeringsFactory = this.this$0;
        final k kVar = this.$onCompleted;
        final k kVar2 = this.$onError;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.a
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1.invoke$lambda$1(list, set, offeringsFactory, kVar, kVar2);
            }
        }, null, 2, null);
    }
}
