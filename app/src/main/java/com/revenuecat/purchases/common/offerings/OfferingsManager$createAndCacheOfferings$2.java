package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsManager$createAndCacheOfferings$2 extends o implements k {
    final /* synthetic */ JSONObject $offeringsJSON;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ OfferingsManager this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.common.offerings.OfferingsManager$createAndCacheOfferings$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements AbstractC6216a {
        final /* synthetic */ Offerings $offerings;
        final /* synthetic */ k $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, Offerings offerings) {
            super(0);
            this.$onSuccess = kVar;
            this.$offerings = offerings;
        }

        @Override // wf.AbstractC6216a
        /* renamed from: invoke */
        public final void mo122invoke() {
            k kVar = this.$onSuccess;
            if (kVar != null) {
                kVar.invoke(this.$offerings);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$createAndCacheOfferings$2(OfferingsManager offeringsManager, JSONObject jSONObject, k kVar) {
        super(1);
        this.this$0 = offeringsManager;
        this.$offeringsJSON = jSONObject;
        this.$onSuccess = kVar;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Offerings) obj);
        return y.f36177a;
    }

    public final void invoke(Offerings offerings) {
        OfferingsCache offeringsCache;
        OfferingImagePreDownloader offeringImagePreDownloader;
        AbstractC3557B.c0("offerings", offerings);
        Offering current = offerings.getCurrent();
        if (current != null) {
            offeringImagePreDownloader = this.this$0.offeringImagePreDownloader;
            offeringImagePreDownloader.preDownloadOfferingImages(current);
        }
        offeringsCache = this.this$0.offeringsCache;
        offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
        this.this$0.dispatch(new AnonymousClass2(this.$onSuccess, offerings));
    }
}
