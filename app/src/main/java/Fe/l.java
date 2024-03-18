package Fe;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.HashMap;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class l extends b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5334a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractMap f5335b;

    public l(int i10) {
        this.f5334a = i10;
        if (i10 != 1) {
            this.f5335b = new ConcurrentHashMap();
        } else {
            this.f5335b = new HashMap();
        }
    }

    @Override // Fe.b
    public final AbstractMap c() {
        AbstractMap abstractMap = this.f5335b;
        switch (this.f5334a) {
            case 0:
                return (ConcurrentHashMap) abstractMap;
            default:
                return abstractMap;
        }
    }

    public final Object f(a aVar, AbstractC6216a abstractC6216a) {
        switch (this.f5334a) {
            case 0:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f5335b;
                Object obj = concurrentHashMap.get(aVar);
                if (obj == null) {
                    Object mo122invoke = abstractC6216a.mo122invoke();
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(aVar, mo122invoke);
                    if (putIfAbsent == null) {
                        obj = mo122invoke;
                    } else {
                        obj = putIfAbsent;
                    }
                    AbstractC3557B.a0("null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent", obj);
                }
                return obj;
            default:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar);
                Object obj2 = c().get(aVar);
                if (obj2 == null) {
                    Object mo122invoke2 = abstractC6216a.mo122invoke();
                    Object put = c().put(aVar, mo122invoke2);
                    if (put == null) {
                        obj2 = mo122invoke2;
                    } else {
                        obj2 = put;
                    }
                    AbstractC3557B.a0("null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent", obj2);
                }
                return obj2;
        }
    }
}
