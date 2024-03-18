package K4;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f9448a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9449b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9450c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9451d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9452e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9453f;

    public o(JSONObject jSONObject) {
        this.f9451d = jSONObject.optString("billingPeriod");
        this.f9450c = jSONObject.optString("priceCurrencyCode");
        this.f9448a = jSONObject.optString("formattedPrice");
        this.f9449b = jSONObject.optLong("priceAmountMicros");
        this.f9453f = jSONObject.optInt("recurrenceMode");
        this.f9452e = jSONObject.optInt("billingCycleCount");
    }
}
