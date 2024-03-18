package Fe;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.AbstractMap;

/* loaded from: classes2.dex */
public abstract class b {
    public final boolean a(a aVar) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar);
        return c().containsKey(aVar);
    }

    public final Object b(a aVar) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar);
        Object d10 = d(aVar);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("No instance for key " + aVar);
    }

    public abstract AbstractMap c();

    public final Object d(a aVar) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar);
        return c().get(aVar);
    }

    public final void e(a aVar, Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, aVar);
        AbstractC3557B.c0("value", obj);
        c().put(aVar, obj);
    }
}
