package com.revenuecat.purchases.common;

import com.android.billingclient.api.PurchaseHistoryRecord;
import id.AbstractC3557B;
import java.util.ArrayList;
import kf.t;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"firstSku", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "getFirstSku", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;", "listOfSkus", "Ljava/util/ArrayList;", "getListOfSkus", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/util/ArrayList;", "toHumanReadableDescription", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC3557B.c0("<this>", purchaseHistoryRecord);
        Object obj = purchaseHistoryRecord.a().get(0);
        String str = (String) obj;
        if (purchaseHistoryRecord.a().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        AbstractC3557B.b0("skus[0].also {\n        i\u2026_ONE_SKU)\n        }\n    }", obj);
        return (String) obj;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC3557B.c0("<this>", purchaseHistoryRecord);
        return purchaseHistoryRecord.a();
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        AbstractC3557B.c0("<this>", purchaseHistoryRecord);
        StringBuilder sb2 = new StringBuilder("skus: ");
        sb2.append(t.m2(purchaseHistoryRecord.a(), null, "[", "]", null, 57));
        sb2.append(", purchaseTime: ");
        JSONObject jSONObject = purchaseHistoryRecord.f26708c;
        sb2.append(jSONObject.optLong("purchaseTime"));
        sb2.append(", purchaseToken: ");
        sb2.append(jSONObject.optString("token", jSONObject.optString("purchaseToken")));
        return sb2.toString();
    }
}
