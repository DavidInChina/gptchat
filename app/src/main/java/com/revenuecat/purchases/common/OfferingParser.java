package com.revenuecat.purchases.common;

import Bi.c;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.OfferingsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import eh.AbstractC2904d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0007J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bJ4\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J,\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\u0011\u001a\u00020\u0006H$\u00a8\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser;", "", "()V", "createOffering", "Lcom/revenuecat/purchases/Offering;", "offeringJson", "Lorg/json/JSONObject;", "productsById", "", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "createOfferings", "Lcom/revenuecat/purchases/Offerings;", "offeringsJson", "createPackage", "Lcom/revenuecat/purchases/Package;", "packageJson", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "findMatchingProduct", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public abstract class OfferingParser {
    public static final Companion Companion = new Companion(null);
    private static final AbstractC2904d json = P4.a.f(OfferingParser$Companion$json$1.INSTANCE);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\t\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/OfferingParser$Companion;", "", "Leh/d;", "json", "Leh/d;", "getJson$purchases_customEntitlementComputationRelease", "()Leh/d;", "getJson$purchases_customEntitlementComputationRelease$annotations", "()V", "<init>", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_customEntitlementComputationRelease$annotations() {
        }

        public final AbstractC2904d getJson$purchases_customEntitlementComputationRelease() {
            return OfferingParser.json;
        }
    }

    public final Offering createOffering(JSONObject jSONObject, Map<String, ? extends List<? extends StoreProduct>> map) {
        Map map2;
        PaywallData paywallData;
        PaywallData paywallData2;
        AbstractC3557B.c0("offeringJson", jSONObject);
        AbstractC3557B.c0("productsById", map);
        String string = jSONObject.getString("identifier");
        JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
        if (optJSONObject == null || (map2 = JSONObjectExtensionsKt.toMap(optJSONObject, true)) == null) {
            map2 = w.f37484Y;
        }
        Map map3 = map2;
        JSONArray jSONArray = jSONObject.getJSONArray("packages");
        AbstractC3557B.b0("offeringIdentifier", string);
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(string);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            AbstractC3557B.b0("packageJson", jSONObject2);
            Package createPackage = createPackage(jSONObject2, map, presentedOfferingContext);
            if (createPackage != null) {
                arrayList.add(createPackage);
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("paywall");
        if (optJSONObject2 != null) {
            try {
                AbstractC2904d abstractC2904d = json;
                String jSONObject3 = optJSONObject2.toString();
                AbstractC3557B.b0("it.toString()", jSONObject3);
                paywallData = (PaywallData) abstractC2904d.b(c.F1(abstractC2904d.f29417b, C.a(PaywallData.class)), jSONObject3);
            } catch (Exception e10) {
                LogUtilsKt.errorLog("Error deserializing paywall data", e10);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        String string2 = jSONObject.getString("description");
        AbstractC3557B.b0("offeringJson.getString(\"description\")", string2);
        return new Offering(string, string2, map3, arrayList, paywallData2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Offerings createOfferings(JSONObject jSONObject, Map<String, ? extends List<? extends StoreProduct>> map) {
        Offerings.Targeting targeting;
        JSONObject optJSONObject;
        Offerings.Placements placements;
        Offering offering;
        Map map2;
        Map map$default;
        AbstractC3557B.c0("offeringsJson", jSONObject);
        AbstractC3557B.c0("productsById", map);
        AbstractC2469q0.t(new Object[]{Integer.valueOf(map.size())}, 1, OfferingStrings.BUILDING_OFFERINGS, LogIntent.DEBUG);
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        String string = jSONObject.getString("current_offering_id");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            AbstractC3557B.b0("offeringJson", jSONObject2);
            Offering createOffering = createOffering(jSONObject2, map);
            if (createOffering != null) {
                linkedHashMap.put(createOffering.getIdentifier(), createOffering);
                if (createOffering.getAvailablePackages().isEmpty()) {
                    LogUtilsKt.warnLog(String.format(OfferingStrings.OFFERING_EMPTY, Arrays.copyOf(new Object[]{createOffering.getIdentifier()}, 1)));
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("targeting");
        Offering offering2 = null;
        if (optJSONObject2 != null) {
            Integer optNullableInt = JSONObjectExtensionsKt.optNullableInt(optJSONObject2, "revision");
            String optNullableString = JSONObjectExtensionsKt.optNullableString(optJSONObject2, "rule_id");
            if (optNullableInt != null && optNullableString != null) {
                targeting = new Offerings.Targeting(optNullableInt.intValue(), optNullableString);
                optJSONObject = jSONObject.optJSONObject("placements");
                if (optJSONObject != null) {
                    String nullableString = JSONObjectExtensionsKt.getNullableString(optJSONObject, "fallback_offering_id");
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("offering_ids_by_placement");
                    if (optJSONObject3 != null && (map$default = JSONObjectExtensionsKt.toMap$default(optJSONObject3, false, 1, null)) != null) {
                        map2 = JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(map$default);
                    } else {
                        map2 = null;
                    }
                    if (map2 != null) {
                        placements = new Offerings.Placements(nullableString, map2);
                        offering = (Offering) linkedHashMap.get(string);
                        if (offering != null) {
                            offering2 = OfferingsKt.withPresentedContext(offering, null, targeting);
                        }
                        return new Offerings(offering2, linkedHashMap, placements, targeting);
                    }
                    LogUtilsKt.errorLog$default(OfferingStrings.PLACEMENTS_EMPTY_ERROR, null, 2, null);
                }
                placements = null;
                offering = (Offering) linkedHashMap.get(string);
                if (offering != null) {
                }
                return new Offerings(offering2, linkedHashMap, placements, targeting);
            }
            LogUtilsKt.warnLog(OfferingStrings.TARGETING_ERROR);
        }
        targeting = null;
        optJSONObject = jSONObject.optJSONObject("placements");
        if (optJSONObject != null) {
        }
        placements = null;
        offering = (Offering) linkedHashMap.get(string);
        if (offering != null) {
        }
        return new Offerings(offering2, linkedHashMap, placements, targeting);
    }

    public final Package createPackage(JSONObject jSONObject, Map<String, ? extends List<? extends StoreProduct>> map, PresentedOfferingContext presentedOfferingContext) {
        PackageType packageType;
        AbstractC3557B.c0("packageJson", jSONObject);
        AbstractC3557B.c0("productsById", map);
        AbstractC3557B.c0("presentedOfferingContext", presentedOfferingContext);
        String string = jSONObject.getString("identifier");
        StoreProduct findMatchingProduct = findMatchingProduct(map, jSONObject);
        AbstractC3557B.b0("packageIdentifier", string);
        packageType = OfferingParserKt.toPackageType(string);
        if (findMatchingProduct != null) {
            return new Package(string, packageType, findMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext);
        }
        return null;
    }

    public abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject);
}
