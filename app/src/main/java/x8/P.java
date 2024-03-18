package x8;

import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public abstract class P implements Map, Serializable, j$.util.Map {

    /* renamed from: Y  reason: collision with root package name */
    public transient m0 f49527Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient n0 f49528Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient o0 f49529h0;

    public static O4.a a() {
        return new O4.a(4);
    }

    public static P b(Map map) {
        int i10;
        if ((map instanceof P) && !(map instanceof SortedMap)) {
            P p10 = (P) map;
            p10.getClass();
            return p10;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        if (z10) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        O4.a aVar = new O4.a(i10);
        if (z10) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) aVar.f13389d;
            if (size > objArr.length) {
                aVar.f13389d = Arrays.copyOf(objArr, r.f.x(objArr.length, size));
                aVar.f13387b = false;
            }
        }
        for (Map.Entry entry : entrySet) {
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    /* renamed from: c */
    public final S entrySet() {
        m0 m0Var = this.f49527Y;
        if (m0Var == null) {
            p0 p0Var = (p0) this;
            m0 m0Var2 = new m0(p0Var, p0Var.f49597j0, p0Var.f49598k0);
            this.f49527Y = m0Var2;
            return m0Var2;
        }
        return m0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public final I values() {
        o0 o0Var = this.f49529h0;
        if (o0Var == null) {
            p0 p0Var = (p0) this;
            o0 o0Var2 = new o0(1, p0Var.f49598k0, p0Var.f49597j0);
            this.f49529h0 = o0Var2;
            return o0Var2;
        }
        return o0Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return U3.f.y(obj, this);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return A7.b.Z0(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((p0) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        n0 n0Var = this.f49528Z;
        if (n0Var == null) {
            p0 p0Var = (p0) this;
            n0 n0Var2 = new n0(p0Var, new o0(0, p0Var.f49598k0, p0Var.f49597j0));
            this.f49528Z = n0Var2;
            return n0Var2;
        }
        return n0Var;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i10 = ((p0) this).f49598k0;
        AbstractC4344b.T(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
