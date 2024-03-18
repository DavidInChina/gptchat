package x8;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l8.AbstractC4344b;

/* renamed from: x8.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6361e extends w0 {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6363g f49550Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6361e(C6363g c6363g) {
        super(0);
        this.f49550Z = c6363g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f49550Z.f49560h0.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public final void clear() {
        this.f49550Z.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f49550Z.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6362f(this.f49550Z);
    }

    /* renamed from: r */
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            boolean z10 = false;
            for (Object obj : collection) {
                z10 |= remove(obj);
            }
            return z10;
        }
    }

    @Override // x8.w0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        AbstractC6359c abstractC6359c = this.f49550Z.f49561i0;
        Object key = entry.getKey();
        Map map = abstractC6359c.f49545i0;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC6359c.f49546j0 -= size;
            return true;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean retainAll(Collection collection) {
        int i10;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC4344b.T(size, "expectedSize");
                i10 = size + 1;
            } else if (size < 1073741824) {
                i10 = (int) ((size / 0.75f) + 1.0f);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f49550Z.keySet().retainAll(hashSet);
        }
    }

    /* renamed from: y */
    public final int size() {
        return this.f49550Z.f49560h0.size();
    }
}
