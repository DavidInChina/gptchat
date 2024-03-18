package com.revenuecat.purchases.common.offerings;

import Lg.n;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.y;
import kf.t;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\b$\u0010%J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u0011\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042$\u0010\u000e\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u0012\u0004\u0012\u00020\r0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\tH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0015\u001a\u0004\u0018\u00010\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#\u00a8\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "", "Lorg/json/JSONObject;", "offeringsJSON", "", "", "extractProductIdentifiers", "(Lorg/json/JSONObject;)Ljava/util/Set;", "productIds", "Lkotlin/Function1;", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Ljf/y;", "onCompleted", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getStoreProductsById", "(Ljava/util/Set;Lwf/k;Lwf/k;)V", "allProductIdsInOfferings", "storeProductByID", "logMissingProducts", "(Ljava/util/Set;Ljava/util/Map;)Ljf/y;", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createOfferings", "(Lorg/json/JSONObject;Lwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/OfferingParser;", "offeringParser", "Lcom/revenuecat/purchases/common/OfferingParser;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;Lcom/revenuecat/purchases/common/Dispatcher;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsFactory {
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    public OfferingsFactory(BillingAbstract billingAbstract, OfferingParser offeringParser, Dispatcher dispatcher) {
        AbstractC3557B.c0("billing", billingAbstract);
        AbstractC3557B.c0("offeringParser", offeringParser);
        AbstractC3557B.c0("dispatcher", dispatcher);
        this.billing = billingAbstract;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
    }

    private final Set<String> extractProductIdentifiers(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String optString = jSONArray2.getJSONObject(i11).optString("platform_product_identifier");
                AbstractC3557B.b0("it", optString);
                if (!(!n.n2(optString))) {
                    optString = null;
                }
                if (optString != null) {
                    linkedHashSet.add(optString);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> set, k kVar, k kVar2) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, set, new OfferingsFactory$getStoreProductsById$1(this, set, kVar, kVar2), new OfferingsFactory$getStoreProductsById$2(kVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y logMissingProducts(Set<String> set, Map<String, ? extends List<? extends StoreProduct>> map) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        AbstractC2469q0.t(new Object[]{t.m2(arrayList, ", ", null, null, null, 62)}, 1, OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, LogIntent.GOOGLE_WARNING);
        return y.f36177a;
    }

    public final void createOfferings(JSONObject jSONObject, k kVar, k kVar2) {
        AbstractC3557B.c0("offeringsJSON", jSONObject);
        AbstractC3557B.c0("onError", kVar);
        AbstractC3557B.c0("onSuccess", kVar2);
        try {
            Set<String> extractProductIdentifiers = extractProductIdentifiers(jSONObject);
            if (extractProductIdentifiers.isEmpty()) {
                kVar.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
            } else {
                getStoreProductsById(extractProductIdentifiers, new OfferingsFactory$createOfferings$1(this, extractProductIdentifiers, jSONObject, kVar, kVar2), new OfferingsFactory$createOfferings$2(kVar));
            }
        } catch (JSONException e10) {
            LogWrapperKt.log(LogIntent.RC_ERROR, String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1)));
            kVar.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
        }
    }
}
