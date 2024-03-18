package com.revenuecat.purchases.subscriberattributes;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import id.AbstractC3557B;
import java.util.Map;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.z;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljf/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends o implements AbstractC6216a {
    final /* synthetic */ AbstractC6216a $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ z $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, z zVar, AbstractC6216a abstractC6216a, int i10) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = zVar;
        this.$completion = abstractC6216a;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, v.f37483Y);
        AbstractC2469q0.t(new Object[]{this.$syncingAppUserID}, 1, AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, LogIntent.RC_SUCCESS);
        if (!AbstractC3557B.K(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
        z zVar = this.$currentSyncedAttributeCount;
        int i10 = zVar.f37647Y + 1;
        zVar.f37647Y = i10;
        AbstractC6216a abstractC6216a = this.$completion;
        if (abstractC6216a == null || i10 != this.$unsyncedStoredAttributesCount) {
            return;
        }
        abstractC6216a.mo122invoke();
    }
}
