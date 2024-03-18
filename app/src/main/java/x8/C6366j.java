package x8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: x8.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6366j extends C6369m implements NavigableMap {

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49571l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6366j(AbstractC6359c abstractC6359c, NavigableMap navigableMap) {
        super(abstractC6359c, navigableMap);
        this.f49571l0 = abstractC6359c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = g().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return c(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return g().ceilingKey(obj);
    }

    @Override // x8.C6369m
    public final SortedSet d() {
        return new C6367k(this.f49571l0, g());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((C6366j) descendingMap()).navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C6366j(this.f49571l0, g().descendingMap());
    }

    @Override // x8.C6369m
    public final SortedSet e() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = g().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return c(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = g().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return c(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return g().floorKey(obj);
    }

    public final J h(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) ((g0) this.f49571l0).f49562k0.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new J(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // x8.C6369m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = g().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return c(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return g().higherKey(obj);
    }

    /* renamed from: i */
    public final NavigableMap g() {
        return (NavigableMap) ((SortedMap) this.f49560h0);
    }

    @Override // x8.C6369m, x8.C6363g, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = g().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return c(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = g().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return c(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return g().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return h(((C6361e) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return h(((C6361e) ((C6363g) descendingMap()).entrySet()).iterator());
    }

    @Override // x8.C6369m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // x8.C6369m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new C6366j(this.f49571l0, g().headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new C6366j(this.f49571l0, g().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new C6366j(this.f49571l0, g().tailMap(obj, z10));
    }
}
