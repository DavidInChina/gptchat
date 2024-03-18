package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import id.AbstractC3557B;
import java.util.Map;
import jf.C3959i;
import kotlin.Metadata;
import wf.AbstractC6216a;
import wf.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015Jk\u0010\u000f\u001a\u00020\u00072 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062$\u0010\u000e\u001a \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "", "", "", "attributes", "appUserID", "Lkotlin/Function0;", "Ljf/y;", "onSuccessHandler", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "onErrorHandler", "postSubscriberAttributes", "(Ljava/util/Map;Ljava/lang/String;Lwf/a;Lwf/o;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "Lcom/revenuecat/purchases/common/BackendHelper;", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        AbstractC3557B.c0("backendHelper", backendHelper);
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> map, String str, AbstractC6216a abstractC6216a, o oVar) {
        AbstractC3557B.c0("attributes", map);
        AbstractC3557B.c0("appUserID", str);
        AbstractC3557B.c0("onSuccessHandler", abstractC6216a);
        AbstractC3557B.c0("onErrorHandler", oVar);
        this.backendHelper.performRequest(new Endpoint.PostAttributes(str), P4.a.o0(new C3959i("attributes", map)), null, Delay.DEFAULT, new SubscriberAttributesPoster$postSubscriberAttributes$1(oVar), new SubscriberAttributesPoster$postSubscriberAttributes$2(abstractC6216a, oVar));
    }
}
