package com.google.android.gms.internal.play_billing;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.play_billing.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2450h implements Map, Serializable, j$.util.Map {

    /* renamed from: Y  reason: collision with root package name */
    public transient C2458l f26925Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient C2460m f26926Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient C2462n f26927h0;

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
        C2462n c2462n = this.f26927h0;
        if (c2462n == null) {
            C2464o c2464o = (C2464o) this;
            C2462n c2462n2 = new C2462n(1, c2464o.f26951k0, c2464o.f26950j0);
            this.f26927h0 = c2462n2;
            c2462n = c2462n2;
        }
        return c2462n.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2458l c2458l = this.f26925Y;
        if (c2458l == null) {
            C2464o c2464o = (C2464o) this;
            C2458l c2458l2 = new C2458l(c2464o, c2464o.f26950j0, c2464o.f26951k0);
            this.f26925Y = c2458l2;
            return c2458l2;
        }
        return c2458l;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return entrySet().equals(((java.util.Map) obj).entrySet());
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
        int i10;
        C2458l c2458l = this.f26925Y;
        if (c2458l == null) {
            C2464o c2464o = (C2464o) this;
            C2458l c2458l2 = new C2458l(c2464o, c2464o.f26950j0, c2464o.f26951k0);
            this.f26925Y = c2458l2;
            c2458l = c2458l2;
        }
        Iterator it = c2458l.iterator();
        int i11 = 0;
        while (true) {
            AbstractC2438b abstractC2438b = (AbstractC2438b) it;
            if (abstractC2438b.hasNext()) {
                Object next = abstractC2438b.next();
                if (next != null) {
                    i10 = next.hashCode();
                } else {
                    i10 = 0;
                }
                i11 += i10;
            } else {
                return i11;
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C2464o) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2460m c2460m = this.f26926Z;
        if (c2460m == null) {
            C2464o c2464o = (C2464o) this;
            C2460m c2460m2 = new C2460m(c2464o, new C2462n(0, c2464o.f26951k0, c2464o.f26950j0));
            this.f26926Z = c2460m2;
            return c2460m2;
        }
        return c2460m;
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
        int size = ((C2464o) this).size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
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
        throw new IllegalArgumentException(android.gov.nist.core.a.e("size cannot be negative but was: ", size));
    }

    @Override // java.util.Map
    public final Collection values() {
        C2462n c2462n = this.f26927h0;
        if (c2462n == null) {
            C2464o c2464o = (C2464o) this;
            C2462n c2462n2 = new C2462n(1, c2464o.f26951k0, c2464o.f26950j0);
            this.f26927h0 = c2462n2;
            return c2462n2;
        }
        return c2462n;
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
