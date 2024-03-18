package com.revenuecat.purchases.subscriberattributes;

import Lg.n;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1 extends o implements AbstractC6216a {
    final /* synthetic */ AbstractC6216a $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1(SubscriberAttributesManager subscriberAttributesManager, AbstractC6216a abstractC6216a, String str) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$completion = abstractC6216a;
        this.$currentAppUserID = str;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.internal.z] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        Map<String, Map<String, SubscriberAttribute>> unsyncedSubscriberAttributes = this.this$0.getDeviceCache().getUnsyncedSubscriberAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : unsyncedSubscriberAttributes.entrySet()) {
            if (!n.n2(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, AttributionStrings.NO_SUBSCRIBER_ATTRIBUTES_TO_SYNCHRONIZE);
            AbstractC6216a abstractC6216a = this.$completion;
            if (abstractC6216a == null) {
                return;
            }
            abstractC6216a.mo122invoke();
            return;
        }
        int size = linkedHashMap.size();
        ?? obj = new Object();
        SubscriberAttributesManager subscriberAttributesManager = this.this$0;
        String str = this.$currentAppUserID;
        AbstractC6216a abstractC6216a2 = this.$completion;
        for (Iterator it = linkedHashMap.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str2 = (String) entry2.getKey();
            Map map = (Map) entry2.getValue();
            subscriberAttributesManager.getBackend().postSubscriberAttributes(BackendHelpersKt.toBackendMap(map), str2, new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(subscriberAttributesManager, str2, map, str, obj, abstractC6216a2, size), new SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(subscriberAttributesManager, str2, map, obj, abstractC6216a2, size));
            str = str;
        }
    }
}
