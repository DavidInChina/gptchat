package com.revenuecat.purchases.common.networking;

import P4.a;
import android.gov.nist.javax.sip.parser.TokenNames;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0005\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u0004\u0018\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0082\b\u00a2\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0000\u00a2\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0000\u00a2\u0006\u0004\b\u000e\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/MapConverter;", "", TokenNames.T, "Lkotlin/Function1;", "ifSuccess", "tryCast", "(Ljava/lang/Object;Lwf/k;)Ljava/lang/Object;", "", "", "inputMap", "Lorg/json/JSONObject;", "convertToJSON$purchases_customEntitlementComputationRelease", "(Ljava/util/Map;)Lorg/json/JSONObject;", "convertToJSON", "createJSONObject$purchases_customEntitlementComputationRelease", "createJSONObject", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MapConverter {
    private final <T> Object tryCast(Object obj, k kVar) {
        AbstractC3557B.B2();
        throw null;
    }

    public final JSONObject convertToJSON$purchases_customEntitlementComputationRelease(Map<String, ? extends Object> map) {
        AbstractC3557B.c0("inputMap", map);
        Map<String, ? extends Object> linkedHashMap = new LinkedHashMap<>(a.n0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable<Object> iterable = (Iterable) value;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object obj : iterable) {
                        if (!(obj instanceof String)) {
                            break;
                        }
                    }
                }
                value = new JSONObject(a.o0(new C3959i("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_customEntitlementComputationRelease((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_customEntitlementComputationRelease(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_customEntitlementComputationRelease(Map<String, ? extends Object> map) {
        AbstractC3557B.c0("inputMap", map);
        return new JSONObject(map);
    }
}
