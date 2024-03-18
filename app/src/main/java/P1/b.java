package P1;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kf.t;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Map f13775a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f13776b;

    public b(Map map, boolean z10) {
        AbstractC3557B.c0("preferencesMap", map);
        this.f13775a = map;
        this.f13776b = new AtomicBoolean(z10);
    }

    public final void a() {
        if (!this.f13776b.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
    }

    public final void b(f fVar, Object obj) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, fVar);
        a();
        Map map = this.f13775a;
        if (obj == null) {
            a();
            map.remove(fVar);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(t.P2((Iterable) obj));
            AbstractC3557B.b0("unmodifiableSet(value.toSet())", unmodifiableSet);
            map.put(fVar, unmodifiableSet);
        } else {
            map.put(fVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return AbstractC3557B.K(this.f13775a, ((b) obj).f13775a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13775a.hashCode();
    }

    public final String toString() {
        return t.m2(this.f13775a.entrySet(), ",\n", "{\n", "\n}", a.f13774Y, 24);
    }

    public /* synthetic */ b(boolean z10) {
        this(new LinkedHashMap(), z10);
    }
}
