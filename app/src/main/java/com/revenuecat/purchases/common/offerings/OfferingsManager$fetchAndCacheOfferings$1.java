package com.revenuecat.purchases.common.offerings;

import id.AbstractC3557B;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Ljf/y;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsManager$fetchAndCacheOfferings$1 extends o implements k {
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsManager$fetchAndCacheOfferings$1(OfferingsManager offeringsManager, k kVar, k kVar2) {
        super(1);
        this.this$0 = offeringsManager;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return y.f36177a;
    }

    public final void invoke(JSONObject jSONObject) {
        AbstractC3557B.c0("it", jSONObject);
        this.this$0.createAndCacheOfferings(jSONObject, this.$onError, this.$onSuccess);
    }
}
