package com.revenuecat.purchases.subscriberattributes;

import android.app.Application;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001AB\u001f\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209\u00a2\u0006\u0004\b?\u0010@J+\u0010\b\u001a\u00020\u00072\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ9\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2 \u0010\r\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0004\u0012\u00020\u00070\fH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0011\u0010\tJ'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u00172\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0019\u00a2\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u00072\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u00172\n\u0010\u001d\u001a\u00060\u0003j\u0002`\u0017\u00a2\u0006\u0004\b\u001e\u0010\u001fJ9\u0010!\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\"\u0010\r\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002` \u0012\u0004\u0012\u00020\u00070\f\u00a2\u0006\u0004\b!\u0010\"J7\u0010'\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u00a2\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b)\u0010*J/\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006\u00a2\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>\u00a8\u0006B"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "attributesAsObjects", "appUserID", "Ljf/y;", "storeAttributesIfNeeded", "(Ljava/util/Map;Ljava/lang/String;)V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;Lwf/k;)V", "attributesToSet", "setAttributes", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "value", "setAttribute", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "currentAppUserID", "Lkotlin/Function0;", "synchronizeSubscriberAttributesForAllUsers", "(Ljava/lang/String;Lwf/a;)V", "originalAppUserId", "newAppUserID", "copyUnsyncedSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "getUnsyncedSubscriberAttributes", "(Ljava/lang/String;Lwf/k;)V", "attributesToMarkAsSynced", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "markAsSynced", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "collectDeviceIdentifiers", "(Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;", "attributionKey", "setAttributionID", "(Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey$AttributionIds;Ljava/lang/String;Ljava/lang/String;Landroid/app/Application;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "getDeviceCache", "()Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "backend", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "getBackend", "()Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "deviceIdentifiersFetcher", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "obtainingDeviceIdentifiersObservable", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "<init>", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;)V", "ObtainDeviceIdentifiersObservable", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SubscriberAttributesManager {
    private final SubscriberAttributesPoster backend;
    private final SubscriberAttributesCache deviceCache;
    private final DeviceIdentifiersFetcher deviceIdentifiersFetcher;
    private final ObtainDeviceIdentifiersObservable obtainingDeviceIdentifiersObservable = new ObtainDeviceIdentifiersObservable();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006R*\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000fj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u00108BX\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager$ObtainDeviceIdentifiersObservable;", "Ljava/util/Observable;", "Lkotlin/Function0;", "Ljf/y;", "completion", "waitUntilIdle", "(Lwf/a;)V", "", "value", "numberOfProcesses", TokenNames.f24313I, "getNumberOfProcesses", "()I", "setNumberOfProcesses", "(I)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listeners", "Ljava/util/ArrayList;", "<init>", "()V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class ObtainDeviceIdentifiersObservable extends Observable {
        private final ArrayList<AbstractC6216a> listeners = new ArrayList<>();
        private int numberOfProcesses;

        public ObtainDeviceIdentifiersObservable() {
            addObserver(new Observer() { // from class: com.revenuecat.purchases.subscriberattributes.a
                @Override // java.util.Observer
                public final void update(Observable observable, Object obj) {
                    SubscriberAttributesManager.ObtainDeviceIdentifiersObservable._init_$lambda$2(SubscriberAttributesManager.ObtainDeviceIdentifiersObservable.this, observable, obj);
                }
            });
        }

        public static final void _init_$lambda$2(ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable, Observable observable, Object obj) {
            AbstractC3557B.c0("this$0", obtainDeviceIdentifiersObservable);
            AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager.ObtainDeviceIdentifiersObservable", observable);
            if (((ObtainDeviceIdentifiersObservable) observable).numberOfProcesses == 0) {
                synchronized (obtainDeviceIdentifiersObservable) {
                    try {
                        for (AbstractC6216a abstractC6216a : obtainDeviceIdentifiersObservable.listeners) {
                            abstractC6216a.mo122invoke();
                        }
                        obtainDeviceIdentifiersObservable.listeners.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final synchronized int getNumberOfProcesses() {
            return this.numberOfProcesses;
        }

        public final synchronized void setNumberOfProcesses(int i10) {
            if (this.numberOfProcesses == i10) {
                return;
            }
            this.numberOfProcesses = i10;
            setChanged();
            notifyObservers();
        }

        public final synchronized void waitUntilIdle(AbstractC6216a abstractC6216a) {
            try {
                AbstractC3557B.c0("completion", abstractC6216a);
                if (this.numberOfProcesses == 0) {
                    abstractC6216a.mo122invoke();
                } else {
                    this.listeners.add(new SubscriberAttributesManager$ObtainDeviceIdentifiersObservable$waitUntilIdle$1(abstractC6216a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SubscriberAttributesManager(SubscriberAttributesCache subscriberAttributesCache, SubscriberAttributesPoster subscriberAttributesPoster, DeviceIdentifiersFetcher deviceIdentifiersFetcher) {
        AbstractC3557B.c0("deviceCache", subscriberAttributesCache);
        AbstractC3557B.c0("backend", subscriberAttributesPoster);
        AbstractC3557B.c0("deviceIdentifiersFetcher", deviceIdentifiersFetcher);
        this.deviceCache = subscriberAttributesCache;
        this.backend = subscriberAttributesPoster;
        this.deviceIdentifiersFetcher = deviceIdentifiersFetcher;
    }

    private final void getDeviceIdentifiers(Application application, k kVar) {
        ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable = this.obtainingDeviceIdentifiersObservable;
        obtainDeviceIdentifiersObservable.setNumberOfProcesses(obtainDeviceIdentifiersObservable.getNumberOfProcesses() + 1);
        this.deviceIdentifiersFetcher.getDeviceIdentifiers(application, new SubscriberAttributesManager$getDeviceIdentifiers$1(kVar, this));
    }

    private final void storeAttributesIfNeeded(Map<String, SubscriberAttribute> map, String str) {
        String str2;
        Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            String key = entry.getKey();
            SubscriberAttribute value = entry.getValue();
            if (allStoredSubscriberAttributes.containsKey(key)) {
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (subscriberAttribute != null) {
                    str2 = subscriberAttribute.getValue();
                } else {
                    str2 = null;
                }
                if (!AbstractC3557B.K(str2, value.getValue())) {
                }
            }
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        if (!linkedHashMap.isEmpty()) {
            this.deviceCache.setAttributes(str, linkedHashMap);
        }
    }

    public static /* synthetic */ void synchronizeSubscriberAttributesForAllUsers$default(SubscriberAttributesManager subscriberAttributesManager, String str, AbstractC6216a abstractC6216a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC6216a = null;
        }
        subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, abstractC6216a);
    }

    public final void collectDeviceIdentifiers(String str, Application application) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("applicationContext", application);
        getDeviceIdentifiers(application, new SubscriberAttributesManager$collectDeviceIdentifiers$1(this, str));
    }

    public final synchronized void copyUnsyncedSubscriberAttributes(String str, String str2) {
        AbstractC3557B.c0("originalAppUserId", str);
        AbstractC3557B.c0("newAppUserID", str2);
        Map<String, SubscriberAttribute> unsyncedSubscriberAttributes = this.deviceCache.getUnsyncedSubscriberAttributes(str);
        if (unsyncedSubscriberAttributes.isEmpty()) {
            return;
        }
        LogUtilsKt.infoLog(String.format(AttributionStrings.COPYING_ATTRIBUTES_FROM_TO_USER, Arrays.copyOf(new Object[]{str, str2}, 2)));
        this.deviceCache.setAttributes(str2, unsyncedSubscriberAttributes);
        this.deviceCache.clearAllSubscriberAttributesFromUser(str);
    }

    public final SubscriberAttributesPoster getBackend() {
        return this.backend;
    }

    public final SubscriberAttributesCache getDeviceCache() {
        return this.deviceCache;
    }

    public final synchronized void getUnsyncedSubscriberAttributes(String str, k kVar) {
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("completion", kVar);
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new SubscriberAttributesManager$getUnsyncedSubscriberAttributes$1(kVar, this, str));
    }

    public final synchronized void markAsSynced(String str, Map<String, SubscriberAttribute> map, List<SubscriberAttributeError> list) {
        try {
            AbstractC3557B.c0("appUserID", str);
            AbstractC3557B.c0("attributesToMarkAsSynced", map);
            AbstractC3557B.c0("attributeErrors", list);
            if (!list.isEmpty()) {
                LogWrapperKt.log(LogIntent.RC_ERROR, String.format(AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, Arrays.copyOf(new Object[]{list}, 1)));
            }
            if (map.isEmpty()) {
                return;
            }
            LogWrapperKt.log(LogIntent.INFO, String.format(AttributionStrings.MARKING_ATTRIBUTES_SYNCED, Arrays.copyOf(new Object[]{str}, 1)).concat(t.m2(map.values(), Separators.RETURN, null, null, null, 62)));
            Map<String, SubscriberAttribute> allStoredSubscriberAttributes = this.deviceCache.getAllStoredSubscriberAttributes(str);
            LinkedHashMap m12 = AbstractC4268D.m1(allStoredSubscriberAttributes);
            for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
                String key = entry.getKey();
                SubscriberAttribute value = entry.getValue();
                SubscriberAttribute subscriberAttribute = allStoredSubscriberAttributes.get(key);
                if (subscriberAttribute != null) {
                    SubscriberAttribute subscriberAttribute2 = null;
                    if (subscriberAttribute.isSynced()) {
                        subscriberAttribute = null;
                    }
                    if (subscriberAttribute != null) {
                        if (AbstractC3557B.K(subscriberAttribute.getValue(), value.getValue())) {
                            subscriberAttribute2 = subscriberAttribute;
                        }
                        if (subscriberAttribute2 != null) {
                            m12.put(key, SubscriberAttribute.copy$default(value, null, null, null, null, true, 15, null));
                        }
                    }
                }
            }
            this.deviceCache.setAttributes(str, m12);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void setAttribute(SubscriberAttributeKey subscriberAttributeKey, String str, String str2) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, subscriberAttributeKey);
        AbstractC3557B.c0("appUserID", str2);
        setAttributes(P4.a.o0(new C3959i(subscriberAttributeKey.getBackendKey(), str)), str2);
    }

    public final synchronized void setAttributes(Map<String, String> map, String str) {
        try {
            AbstractC3557B.c0("attributesToSet", map);
            AbstractC3557B.c0("appUserID", str);
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                arrayList.add(new C3959i(key, new SubscriberAttribute(key, entry.getValue(), (DateProvider) null, (Date) null, false, 28, (g) null)));
            }
            storeAttributesIfNeeded(AbstractC4268D.k1(arrayList), str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void setAttributionID(SubscriberAttributeKey.AttributionIds attributionIds, String str, String str2, Application application) {
        AbstractC3557B.c0("attributionKey", attributionIds);
        AbstractC3557B.c0("appUserID", str2);
        AbstractC3557B.c0("applicationContext", application);
        getDeviceIdentifiers(application, new SubscriberAttributesManager$setAttributionID$1(attributionIds, str, this, str2));
    }

    public final void synchronizeSubscriberAttributesForAllUsers(String str, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("currentAppUserID", str);
        this.obtainingDeviceIdentifiersObservable.waitUntilIdle(new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1(this, abstractC6216a, str));
    }
}
