package com.revenuecat.purchases.subscriberattributes;

import id.AbstractC3557B;
import jf.C3959i;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wf.k;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "kotlin.jvm.PlatformType", "userId", "Ljf/i;", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "invoke", "(Ljava/lang/String;)Ljf/i;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1 extends o implements k {
    final /* synthetic */ JSONObject $attributesJSONObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1(JSONObject jSONObject) {
        super(1);
        this.$attributesJSONObject = jSONObject;
    }

    public final C3959i invoke(String str) {
        Object obj = this.$attributesJSONObject.get(str);
        AbstractC3557B.a0("null cannot be cast to non-null type org.json.JSONObject", obj);
        return new C3959i(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
    }
}
