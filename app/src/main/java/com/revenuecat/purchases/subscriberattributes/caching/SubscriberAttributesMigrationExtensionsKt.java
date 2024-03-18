package com.revenuecat.purchases.subscriberattributes.caching;

import Lg.n;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.w;
import kotlin.Metadata;
import org.json.JSONObject;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0002\u0010\u0003\u001a?\u0010\u000b\u001a\u00020\u0001*\u00020\u00002*\u0010\n\u001a&\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b0\u0004j\u0002`\tH\u0000\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a&\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b0\u0004j\u0002`\t*\u00020\u0000H\u0000\u00a2\u0006\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Ljf/y;", "migrateSubscriberAttributesIfNeeded", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "legacySubscriberAttributesForAppUserID", "migrateSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/util/Map;)V", "appUserID", "legacySubscriberAttributesCacheKey", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/lang/String;)Ljava/lang/String;", "getAllLegacyStoredSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;)Ljava/util/Map;", "purchases_customEntitlementComputationRelease"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        Map<String, Map<String, SubscriberAttribute>> k12;
        Object obj;
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            try {
                AbstractC3557B.c0("<this>", subscriberAttributesCache);
                String legacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
                Set<String> findKeysThatStartWith = subscriberAttributesCache.getDeviceCache$purchases_customEntitlementComputationRelease().findKeysThatStartWith(legacySubscriberAttributesCacheKey);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(findKeysThatStartWith, 10));
                for (String str : findKeysThatStartWith) {
                    String str2 = (String) n.G2(str, new String[]{legacySubscriberAttributesCacheKey}).get(1);
                    JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache$purchases_customEntitlementComputationRelease().getJSONObjectOrNull(str);
                    if (jSONObjectOrNull == null || (obj = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                        obj = w.f37484Y;
                    }
                    arrayList.add(new C3959i(str2, obj));
                }
                k12 = AbstractC4268D.k1(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k12;
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String str) {
        AbstractC3557B.c0("<this>", subscriberAttributesCache);
        AbstractC3557B.c0("appUserID", str);
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease() + '.' + str;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            try {
                AbstractC3557B.c0("<this>", subscriberAttributesCache);
                AbstractC3557B.c0("legacySubscriberAttributesForAppUserID", map);
                Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
                LinkedHashMap m12 = AbstractC4268D.m1(allStoredSubscriberAttributes);
                for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Map<String, SubscriberAttribute> value = entry.getValue();
                    Map<String, SubscriberAttribute> map2 = allStoredSubscriberAttributes.get(key);
                    if (map2 == null) {
                        map2 = w.f37484Y;
                    }
                    m12.put(key, AbstractC4268D.e1(value, map2));
                    subscriberAttributesCache.getDeviceCache$purchases_customEntitlementComputationRelease().remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
                }
                subscriberAttributesCache.putAttributes$purchases_customEntitlementComputationRelease(subscriberAttributesCache.getDeviceCache$purchases_customEntitlementComputationRelease(), m12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache) {
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            AbstractC3557B.c0("<this>", subscriberAttributesCache);
            Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
            if (!(!allLegacyStoredSubscriberAttributes.isEmpty())) {
                allLegacyStoredSubscriberAttributes = null;
            }
            if (allLegacyStoredSubscriberAttributes != null) {
                migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes);
            }
        }
    }
}
