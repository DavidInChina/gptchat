package x8;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: x8.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6367k extends C6370n implements NavigableSet {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49572j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6367k(AbstractC6359c abstractC6359c, NavigableMap navigableMap) {
        super(abstractC6359c, navigableMap);
        this.f49572j0 = abstractC6359c;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C6365i) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C6367k(this.f49572j0, f().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return f().floorKey(obj);
    }

    @Override // x8.C6370n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return f().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C6362f c6362f = (C6362f) iterator();
        if (c6362f.hasNext()) {
            Object next = c6362f.next();
            c6362f.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    /* renamed from: r */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.f49568Z);
    }

    @Override // x8.C6370n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // x8.C6370n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new C6367k(this.f49572j0, f().headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new C6367k(this.f49572j0, f().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new C6367k(this.f49572j0, f().tailMap(obj, z10));
    }
}
