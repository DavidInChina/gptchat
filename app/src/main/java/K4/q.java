package K4;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f9459a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f9460b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9461c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9462d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9463e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9464f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9465g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9466h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9467i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f9468j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f9469k;

    public q(String str) {
        ArrayList arrayList;
        this.f9459a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f9460b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f9461c = optString;
        String optString2 = jSONObject.optString("type");
        this.f9462d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f9463e = jSONObject.optString("title");
                this.f9464f = jSONObject.optString("name");
                this.f9465g = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f9466h = jSONObject.optString("skuDetailsToken");
                this.f9467i = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new p(optJSONArray.getJSONObject(i10)));
                    }
                    this.f9468j = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f9468j = arrayList;
                }
                JSONObject optJSONObject = this.f9460b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f9460b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new n(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f9469k = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new n(optJSONObject));
                    this.f9469k = arrayList3;
                    return;
                } else {
                    this.f9469k = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final n a() {
        ArrayList arrayList = this.f9469k;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (n) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return TextUtils.equals(this.f9459a, ((q) obj).f9459a);
    }

    public final int hashCode() {
        return this.f9459a.hashCode();
    }

    public final String toString() {
        String obj = this.f9460b.toString();
        String valueOf = String.valueOf(this.f9468j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        android.gov.nist.core.a.y(sb2, this.f9459a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f9461c);
        sb2.append("', productType='");
        sb2.append(this.f9462d);
        sb2.append("', title='");
        sb2.append(this.f9463e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f9466h);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
