package com.revenuecat.purchases.common.offerings;

import ah.C1999j;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n\u00a2\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class OfferingsFactory$createOfferings$1 extends o implements k {
    final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
    final /* synthetic */ JSONObject $offeringsJSON;
    final /* synthetic */ k $onError;
    final /* synthetic */ k $onSuccess;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferingsFactory$createOfferings$1(OfferingsFactory offeringsFactory, Set<String> set, JSONObject jSONObject, k kVar, k kVar2) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$allRequestedProductIdentifiers = set;
        this.$offeringsJSON = jSONObject;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return y.f36177a;
    }

    public final void invoke(Map<String, ? extends List<? extends StoreProduct>> map) {
        OfferingParser offeringParser;
        AbstractC3557B.c0("productsById", map);
        try {
            this.this$0.logMissingProducts(this.$allRequestedProductIdentifiers, map);
            offeringParser = this.this$0.offeringParser;
            Offerings createOfferings = offeringParser.createOfferings(this.$offeringsJSON, map);
            if (createOfferings.getAll().isEmpty()) {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
            } else {
                LogUtilsKt.verboseLog(String.format(OfferingStrings.CREATED_OFFERINGS, Arrays.copyOf(new Object[]{createOfferings}, 1)));
                this.$onSuccess.invoke(createOfferings);
            }
        } catch (Exception e10) {
            if ((e10 instanceof JSONException) || (e10 instanceof C1999j)) {
                AbstractC2469q0.t(new Object[]{e10.getLocalizedMessage()}, 1, OfferingStrings.JSON_EXCEPTION_ERROR, LogIntent.RC_ERROR);
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
                return;
            }
            throw e10;
        }
    }
}
