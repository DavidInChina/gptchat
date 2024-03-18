package com.revenuecat.purchases.subscriberattributes.caching;

import P4.a;
import R4.b;
import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.AbstractC3957g;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import kf.w;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u00a2\u0006\u0004\b'\u0010(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J?\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\nH\u0002\u00a2\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\n2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u00a2\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0007j\u0002`\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\n\u00a2\u0006\u0004\b\u0012\u0010\u0014J1\u0010\u0015\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0007j\u0002`\u0011\u00a2\u0006\u0004\b\u0015\u0010\u0013J%\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\n\u00a2\u0006\u0004\b\u0016\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\u0002j\u0002`\n\u00a2\u0006\u0004\b\u0017\u0010\u0006J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0006J?\u0010\u001d\u001a\u00020\u0004*\u00020\u00192*\u0010\u001a\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0007j\u0002`\u0011H\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010&\u001a\u00020\u00028@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u00a8\u0006)"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "", "", "currentAppUserID", "Ljf/y;", "deleteSyncedSubscriberAttributesForOtherUsers", "(Ljava/lang/String;)V", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "appUserID", "filterUnsynced", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "attributesToBeSet", "setAttributes", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "getAllStoredSubscriberAttributes", "()Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map;", "getUnsyncedSubscriberAttributes", "clearAllSubscriberAttributesFromUser", "clearSubscriberAttributesIfSyncedForSubscriber", "cleanUpSubscriberAttributeCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "updatedSubscriberAttributesForAll", "putAttributes$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Ljava/util/Map;)V", "putAttributes", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCacheKey$delegate", "Ljf/g;", "getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "subscriberAttributesCacheKey", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final AbstractC3957g subscriberAttributesCacheKey$delegate = b.D1(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        AbstractC3557B.c0("deviceCache", deviceCache);
        this.deviceCache = deviceCache;
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str) {
        C3959i c3959i;
        try {
            LogWrapperKt.log(LogIntent.DEBUG, String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{str}, 1)));
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                if (!AbstractC3557B.K(str, key)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                        if (!entry2.getValue().isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    c3959i = new C3959i(key, linkedHashMap);
                } else {
                    c3959i = new C3959i(key, value);
                }
                arrayList.add(c3959i);
            }
            Map k12 = AbstractC4268D.k1(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : k12.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            putAttributes$purchases_customEntitlementComputationRelease(this.deviceCache, linkedHashMap2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (!entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2)));
        if (!linkedHashMap.isEmpty()) {
            str2 = t.m2(linkedHashMap.values(), Separators.RETURN, null, null, null, 62);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        LogWrapperKt.log(logIntent, sb2.toString());
        return linkedHashMap;
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String str) {
        AbstractC3557B.c0("currentAppUserID", str);
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this);
        deleteSyncedSubscriberAttributesForOtherUsers(str);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String str) {
        AbstractC3557B.c0("appUserID", str);
        LogWrapperKt.log(LogIntent.DEBUG, String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{str}, 1)));
        LinkedHashMap m12 = AbstractC4268D.m1(getAllStoredSubscriberAttributes());
        m12.remove(str);
        putAttributes$purchases_customEntitlementComputationRelease(this.deviceCache, AbstractC4268D.l1(m12));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String str) {
        AbstractC3557B.c0("appUserID", str);
        if (getUnsyncedSubscriberAttributes(str).isEmpty()) {
            clearAllSubscriberAttributesFromUser(str);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> map;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease());
            if (jSONObjectOrNull == null || (map = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
                map = w.f37484Y;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    public final DeviceCache getDeviceCache$purchases_customEntitlementComputationRelease() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(a.n0(allStoredSubscriberAttributes.size()));
            for (Object obj : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedHashMap;
    }

    public final void putAttributes$purchases_customEntitlementComputationRelease(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        AbstractC3557B.c0("<this>", deviceCache);
        AbstractC3557B.c0("updatedSubscriberAttributesForAll", map);
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_customEntitlementComputationRelease = getSubscriberAttributesCacheKey$purchases_customEntitlementComputationRelease();
        String jSONObject = CachingHelpersKt.toJSONObject(map).toString();
        AbstractC3557B.b0("updatedSubscriberAttribu\u2026toJSONObject().toString()", jSONObject);
        deviceCache2.putString(subscriberAttributesCacheKey$purchases_customEntitlementComputationRelease, jSONObject);
    }

    public final synchronized void setAttributes(String str, Map<String, SubscriberAttribute> map) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("attributesToBeSet", map);
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        Map<String, SubscriberAttribute> map2 = allStoredSubscriberAttributes.get(str);
        if (map2 == null) {
            map2 = w.f37484Y;
        }
        putAttributes$purchases_customEntitlementComputationRelease(this.deviceCache, AbstractC4268D.e1(allStoredSubscriberAttributes, a.o0(new C3959i(str, AbstractC4268D.e1(map2, map)))));
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String str) {
        Map<String, SubscriberAttribute> map;
        AbstractC3557B.c0("appUserID", str);
        map = getAllStoredSubscriberAttributes().get(str);
        if (map == null) {
            map = w.f37484Y;
        }
        return map;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String str) {
        AbstractC3557B.c0("appUserID", str);
        return filterUnsynced(getAllStoredSubscriberAttributes(str), str);
    }
}
