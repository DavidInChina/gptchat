package K4;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String f9454a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9455b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9456c;

    /* renamed from: d  reason: collision with root package name */
    public final Q3.j f9457d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9458e;

    public p(JSONObject jSONObject) {
        this.f9454a = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.f9455b = true == optString.isEmpty() ? null : optString;
        this.f9456c = jSONObject.getString("offerIdToken");
        this.f9457d = new Q3.j(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            optJSONObject.getInt("commitmentPaymentsCount");
            optJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString("title");
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.getString(i10));
            }
        }
        this.f9458e = arrayList;
    }
}
