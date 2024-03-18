package Fe;

import Df.H;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import xf.AbstractC6442e;

/* loaded from: classes2.dex */
public final class j implements Map, AbstractC6442e {

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedHashMap f5331Y = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f5331Y.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return this.f5331Y.containsKey(new k(str));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f5331Y.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new p(this.f5331Y.entrySet(), i.f5326Z, i.f5327h0);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j)) {
            return AbstractC3557B.K(((j) obj).f5331Y, this.f5331Y);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return this.f5331Y.get(H.s(str));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5331Y.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5331Y.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new p(this.f5331Y.keySet(), i.f5328i0, i.f5329j0);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("value", obj2);
        return this.f5331Y.put(H.s(str), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC3557B.c0("from", map);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
            AbstractC3557B.c0("value", value);
            this.f5331Y.put(H.s(str), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        return this.f5331Y.remove(H.s(str));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5331Y.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5331Y.values();
    }
}
