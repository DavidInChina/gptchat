package Gf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;

/* renamed from: Gf.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0630d extends P4.a {

    /* renamed from: h  reason: collision with root package name */
    public final wf.k f6404h;

    /* renamed from: i  reason: collision with root package name */
    public final ConcurrentHashMap f6405i = new ConcurrentHashMap();

    public C0630d(C0627b c0627b) {
        this.f6404h = c0627b;
    }

    public final Object Z0(Class cls) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, cls);
        ConcurrentHashMap concurrentHashMap = this.f6405i;
        V v10 = concurrentHashMap.get(cls);
        if (v10 == 0) {
            Object invoke = this.f6404h.invoke(cls);
            V putIfAbsent = concurrentHashMap.putIfAbsent(cls, invoke);
            if (putIfAbsent != 0) {
                return putIfAbsent;
            }
            return invoke;
        }
        return v10;
    }
}
