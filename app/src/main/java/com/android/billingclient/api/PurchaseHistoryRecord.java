package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PurchaseHistoryRecord {

    /* renamed from: a  reason: collision with root package name */
    public final String f26706a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26707b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f26708c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f26706a = str;
        this.f26707b = str2;
        this.f26708c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f26708c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (TextUtils.equals(this.f26706a, purchaseHistoryRecord.f26706a) && TextUtils.equals(this.f26707b, purchaseHistoryRecord.f26707b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26706a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f26706a));
    }
}
