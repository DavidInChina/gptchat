package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import jf.y;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import l8.AbstractC4344b;
import wf.k;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "inAppProducts", "Ljf/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OfferingsFactory$getStoreProductsById$1$1$1 extends o implements k {
    final /* synthetic */ k $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, k kVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Map map, List list, k kVar) {
        AbstractC3557B.c0("$productsById", map);
        AbstractC3557B.c0("$inAppProducts", list);
        AbstractC3557B.c0("$onCompleted", kVar);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(new C3959i(storeProduct.getPurchasingData().getProductId(), AbstractC4344b.F0(storeProduct)));
        }
        AbstractC4268D.i1(arrayList, map);
        kVar.invoke(map);
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List) obj);
        return y.f36177a;
    }

    public final void invoke(final List<? extends StoreProduct> list) {
        Dispatcher dispatcher;
        AbstractC3557B.c0("inAppProducts", list);
        dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final k kVar = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.b
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, list, kVar);
            }
        }, null, 2, null);
    }
}
