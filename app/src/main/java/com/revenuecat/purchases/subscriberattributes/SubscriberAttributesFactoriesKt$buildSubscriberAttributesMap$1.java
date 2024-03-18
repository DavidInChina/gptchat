package com.revenuecat.purchases.subscriberattributes;

import id.AbstractC3557B;
import jf.C3959i;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "attributeKey", "Ljf/i;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "invoke", "(Ljava/lang/String;)Ljf/i;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1 extends o implements k {
    final /* synthetic */ JSONObject $this_buildSubscriberAttributesMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1(JSONObject jSONObject) {
        super(1);
        this.$this_buildSubscriberAttributesMap = jSONObject;
    }

    public final C3959i invoke(String str) {
        Object obj = this.$this_buildSubscriberAttributesMap.get(str);
        AbstractC3557B.a0("null cannot be cast to non-null type org.json.JSONObject", obj);
        return new C3959i(str, new SubscriberAttribute((JSONObject) obj));
    }
}
