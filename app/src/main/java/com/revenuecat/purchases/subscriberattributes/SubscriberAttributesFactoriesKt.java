package com.revenuecat.purchases.subscriberattributes;

import Kg.m;
import Kg.p;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import kf.AbstractC4268D;
import kotlin.Metadata;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006*\u00020\u0004H\u0000\u001a0\u0010\u0007\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00060\u0001j\u0002`\t*\u00020\u0004H\u0000\u00a8\u0006\n"}, d2 = {"buildLegacySubscriberAttributes", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lorg/json/JSONObject;", "buildSubscriberAttributesMap", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "buildSubscriberAttributesMapPerUser", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class SubscriberAttributesFactoriesKt {
    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) {
        AbstractC3557B.c0("<this>", jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        AbstractC3557B.b0("attributesJSONObject", jSONObject2);
        return buildSubscriberAttributesMap(jSONObject2);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        AbstractC3557B.c0("<this>", jSONObject);
        Iterator<String> keys = jSONObject.keys();
        AbstractC3557B.b0("this.keys()", keys);
        return AbstractC4268D.j1(m.n1(p.Z0(keys), new SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) {
        AbstractC3557B.c0("<this>", jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> keys = jSONObject2.keys();
        AbstractC3557B.b0("attributesJSONObject.keys()", keys);
        return AbstractC4268D.j1(m.n1(p.Z0(keys), new SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1(jSONObject2)));
    }
}
