package v2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x8.u0;

/* loaded from: classes.dex */
public final class q extends x8.G {

    /* renamed from: Y  reason: collision with root package name */
    public final Map f47123Y;

    public q(Map map) {
        this.f47123Y = map;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f47123Y.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((u0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x8.G, java.util.Map
    public final Set entrySet() {
        return A7.b.C0(super.entrySet(), new p(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && U3.f.y(obj, this)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f47123Y.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return A7.b.Z0(entrySet());
    }

    @Override // x8.G, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && this.f47123Y.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // x8.G, java.util.Map
    public final Set keySet() {
        return A7.b.C0(super.keySet(), new p(1));
    }

    @Override // x8.G, java.util.Map
    public final int size() {
        return super.size() - (this.f47123Y.containsKey(null) ? 1 : 0);
    }
}
