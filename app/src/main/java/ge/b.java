package Ge;

import id.AbstractC3557B;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import xf.AbstractC6442e;

/* loaded from: classes2.dex */
public final class b implements Map, AbstractC6442e, j$.util.Map {

    /* renamed from: Y  reason: collision with root package name */
    public final ConcurrentHashMap f6328Y = new ConcurrentHashMap(32);

    @Override // java.util.Map
    public final void clear() {
        this.f6328Y.clear();
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
        return this.f6328Y.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f6328Y.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set entrySet = this.f6328Y.entrySet();
        AbstractC3557B.b0("delegate.entries", entrySet);
        return entrySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return AbstractC3557B.K(obj, this.f6328Y);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f6328Y.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f6328Y.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f6328Y.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set keySet = this.f6328Y.keySet();
        AbstractC3557B.b0("delegate.keys", keySet);
        return keySet;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f6328Y.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        AbstractC3557B.c0("from", map);
        this.f6328Y.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f6328Y.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f6328Y.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.f6328Y;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection values = this.f6328Y.values();
        AbstractC3557B.b0("delegate.values", values);
        return values;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.f6328Y.remove(obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
