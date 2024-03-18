package com.revenuecat.purchases.subscriberattributes;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.z;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n\u00a2\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "didBackendGetAttributes", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 extends o implements wf.o {
    final /* synthetic */ AbstractC6216a $completion;
    final /* synthetic */ z $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, z zVar, AbstractC6216a abstractC6216a, int i10) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = zVar;
        this.$completion = abstractC6216a;
        this.$unsyncedStoredAttributesCount = i10;
    }

    @Override // wf.o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue(), (List) obj3);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10, List<SubscriberAttributeError> list) {
        AbstractC3557B.c0("error", purchasesError);
        AbstractC3557B.c0("attributeErrors", list);
        if (z10) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, list);
        }
        AbstractC2469q0.t(new Object[]{this.$syncingAppUserID, purchasesError}, 2, AttributionStrings.ATTRIBUTES_SYNC_ERROR, LogIntent.RC_ERROR);
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
