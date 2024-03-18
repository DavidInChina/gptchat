package Ge;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kf.w;

/* loaded from: classes2.dex */
public final class c {
    private volatile /* synthetic */ Object current = w.f37484Y;

    static {
        AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "current");
    }

    public final Object a(Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, obj);
        return ((Map) this.current).get(obj);
    }
}
