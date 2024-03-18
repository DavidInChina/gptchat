package com.revenuecat.purchases.utils;

import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001H\u0000\u001a\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0004H\u0000\u00a8\u0006\u0005"}, d2 = {"replaceJsonNullWithKotlinNull", "", TokenNames.T, "toList", "Lorg/json/JSONArray;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> replaceJsonNullWithKotlinNull(List<? extends T> list) {
        AbstractC3557B.c0("<this>", list);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        for (T t10 : list) {
            if (t10 instanceof Map) {
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>", t10);
                t10 = (T) JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) t10);
            } else if (t10 instanceof List) {
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>", t10);
                t10 = (T) replaceJsonNullWithKotlinNull((List) t10);
            } else if (AbstractC3557B.K(t10, JSONObject.NULL)) {
                t10 = null;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    public static final <T> List<T> toList(JSONArray jSONArray) {
        AbstractC3557B.c0("<this>", jSONArray);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                obj = JSONObjectExtensionsKt.toMap((JSONObject) obj, true);
            } else if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
