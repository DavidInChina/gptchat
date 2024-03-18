package x8;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: x8.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6363g extends AbstractMap {

    /* renamed from: Y  reason: collision with root package name */
    public transient C6361e f49558Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient C6381z f49559Z;

    /* renamed from: h0  reason: collision with root package name */
    public final transient Map f49560h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49561i0;

    public C6363g(AbstractC6359c abstractC6359c, Map map) {
        this.f49561i0 = abstractC6359c;
        this.f49560h0 = map;
    }

    /* renamed from: a */
    public final Set entrySet() {
        C6361e c6361e = this.f49558Y;
        if (c6361e == null) {
            C6361e c6361e2 = new C6361e(this);
            this.f49558Y = c6361e2;
            return c6361e2;
        }
        return c6361e;
    }

    /* renamed from: b */
    public final Collection values() {
        C6381z c6381z = this.f49559Z;
        if (c6381z == null) {
            C6381z c6381z2 = new C6381z(this);
            this.f49559Z = c6381z2;
            return c6381z2;
        }
        return c6381z;
    }

    public final J c(Map.Entry entry) {
        C6373q c6373q;
        Object key = entry.getKey();
        AbstractC6359c abstractC6359c = this.f49561i0;
        abstractC6359c.getClass();
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            c6373q = new C6373q(abstractC6359c, key, list, null);
        } else {
            c6373q = new C6373q(abstractC6359c, key, list, null);
        }
        return new J(key, c6373q);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC6359c abstractC6359c = this.f49561i0;
        if (this.f49560h0 == abstractC6359c.f49545i0) {
            abstractC6359c.b();
            return;
        }
        C6362f c6362f = new C6362f(this);
        while (c6362f.hasNext()) {
            c6362f.next();
            c6362f.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f49560h0;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f49560h0.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C6373q c6373q;
        Map map = this.f49560h0;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        AbstractC6359c abstractC6359c = this.f49561i0;
        abstractC6359c.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c6373q = new C6373q(abstractC6359c, obj, list, null);
        } else {
            c6373q = new C6373q(abstractC6359c, obj, list, null);
        }
        return c6373q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f49560h0.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C6365i c6365i;
        AbstractC6359c abstractC6359c = this.f49561i0;
        C6365i c6365i2 = abstractC6359c.f49611Y;
        if (c6365i2 == null) {
            g0 g0Var = (g0) abstractC6359c;
            Map map = g0Var.f49545i0;
            if (map instanceof NavigableMap) {
                c6365i = new C6367k(g0Var, (NavigableMap) g0Var.f49545i0);
            } else if (map instanceof SortedMap) {
                c6365i = new C6370n(g0Var, (SortedMap) g0Var.f49545i0);
            } else {
                c6365i = new C6365i(g0Var, g0Var.f49545i0);
            }
            c6365i2 = c6365i;
            abstractC6359c.f49611Y = c6365i2;
        }
        return c6365i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f49560h0.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC6359c abstractC6359c = this.f49561i0;
        List list = (List) ((g0) abstractC6359c).f49562k0.get();
        list.addAll(collection);
        abstractC6359c.f49546j0 -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f49560h0.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f49560h0.toString();
    }
}
