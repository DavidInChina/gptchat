package com.revenuecat.purchases.subscriberattributes;

import id.AbstractC3557B;
import java.util.Map;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Ljf/y;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SubscriberAttributesManager$collectDeviceIdentifiers$1 extends o implements k {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$collectDeviceIdentifiers$1(SubscriberAttributesManager subscriberAttributesManager, String str) {
        super(1);
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map) obj);
        return y.f36177a;
    }

    public final void invoke(Map<String, String> map) {
        AbstractC3557B.c0("deviceIdentifiers", map);
        this.this$0.setAttributes(map, this.$appUserID);
    }
}
