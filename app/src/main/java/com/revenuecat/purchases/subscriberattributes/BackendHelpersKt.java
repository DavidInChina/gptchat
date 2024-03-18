package com.revenuecat.purchases.subscriberattributes;

import Cf.g;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4265A;
import kf.AbstractC4268D;
import kf.t;
import kf.v;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000\u00a8\u0006\t"}, d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) {
        v vVar = v.f37483Y;
        if (jSONObject == null) {
            return vVar;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (optJSONArray != null) {
            g D02 = N.D0(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(D02, 10));
            Iterator it = D02.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((AbstractC4265A) it).a()));
            }
            ArrayList<JSONObject> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
            for (JSONObject jSONObject3 : arrayList2) {
                String string = jSONObject3.getString("key_name");
                AbstractC3557B.b0("it.getString(\"key_name\")", string);
                String string2 = jSONObject3.getString("message");
                AbstractC3557B.b0("it.getString(\"message\")", string2);
                arrayList3.add(new SubscriberAttributeError(string, string2));
            }
            return t.K2(arrayList3);
        }
        return vVar;
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        AbstractC3557B.c0("<this>", map);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(new C3959i(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return AbstractC4268D.k1(arrayList);
    }
}
