package x8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x8.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6381z extends AbstractCollection {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f49634Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final Map f49635Z;

    public C6381z(Map map) {
        map.getClass();
        this.f49635Z = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10 = this.f49634Y;
        Map map = this.f49635Z;
        switch (i10) {
            case 0:
                ((C6356A) map).clear();
                return;
            default:
                map.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f49634Y) {
            case 1:
                return this.f49635Z.containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f49634Y) {
            case 1:
                return this.f49635Z.isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f49634Y;
        Map map = this.f49635Z;
        switch (i10) {
            case 0:
                C6356A c6356a = (C6356A) map;
                Map b10 = c6356a.b();
                if (b10 != null) {
                    return b10.values().iterator();
                }
                return new C6377v(c6356a, 2);
            default:
                return new y0(map.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f49634Y) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = this.f49635Z;
                    for (Map.Entry entry : map.entrySet()) {
                        if (M3.H.O(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f49634Y) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f49635Z;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f49634Y) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f49635Z;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f49634Y;
        Map map = this.f49635Z;
        switch (i10) {
            case 0:
                return ((C6356A) map).size();
            default:
                return map.size();
        }
    }

    public C6381z(C6356A c6356a) {
        this.f49635Z = c6356a;
    }
}
