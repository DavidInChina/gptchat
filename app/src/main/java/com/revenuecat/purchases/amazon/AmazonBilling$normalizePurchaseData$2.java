package com.revenuecat.purchases.amazon;

import P4.a;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import id.AbstractC3557B;
import jf.C3959i;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Ljf/y;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AmazonBilling$normalizePurchaseData$2 extends o implements k {
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$normalizePurchaseData$2(AmazonBilling amazonBilling, k kVar, String str, k kVar2) {
        super(1);
        this.this$0 = amazonBilling;
        this.$onError = kVar;
        this.$purchaseToken = str;
        this.$onSuccess = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return y.f36177a;
    }

    public final void invoke(JSONObject jSONObject) {
        String termSkuFromJSON;
        AmazonCache amazonCache;
        AbstractC3557B.c0("response", jSONObject);
        AbstractC2469q0.t(new Object[]{jSONObject.toString()}, 1, AmazonStrings.RECEIPT_DATA_RECEIVED, LogIntent.DEBUG);
        termSkuFromJSON = this.this$0.getTermSkuFromJSON(jSONObject);
        if (termSkuFromJSON != null) {
            amazonCache = this.this$0.cache;
            amazonCache.cacheSkusByToken(a.o0(new C3959i(this.$purchaseToken, termSkuFromJSON)));
            this.$onSuccess.invoke(termSkuFromJSON);
            return;
        }
        this.$onError.invoke(ErrorsKt.missingTermSkuError(jSONObject));
    }
}
