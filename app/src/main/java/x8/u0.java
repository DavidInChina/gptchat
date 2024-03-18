package x8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class u0 extends AbstractCollection implements Set {

    /* renamed from: Y  reason: collision with root package name */
    public final Collection f49618Y;

    /* renamed from: Z  reason: collision with root package name */
    public final w8.g f49619Z;

    public u0(Set set, w8.g gVar) {
        this.f49618Y = set;
        this.f49619Z = gVar;
    }

    /* renamed from: I */
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public final boolean isEmpty() {
        Iterator it = this.f49618Y.iterator();
        w8.g gVar = this.f49619Z;
        if (gVar != null) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (gVar.apply(it.next())) {
                    if (i10 != -1) {
                        z10 = true;
                    }
                } else {
                    i10++;
                }
            }
            return !z10;
        }
        throw new NullPointerException("predicate");
    }

    /* renamed from: T */
    public final Iterator iterator() {
        Iterator it = this.f49618Y.iterator();
        it.getClass();
        w8.g gVar = this.f49619Z;
        gVar.getClass();
        return new T(it, gVar);
    }

    /* renamed from: U */
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f49618Y.remove(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f49618Y.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f49619Z.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return A7.b.B0(this, obj);
    }

    /* renamed from: f */
    public final boolean add(Object obj) {
        if (this.f49619Z.apply(obj)) {
            return this.f49618Y.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return A7.b.Z0(this);
    }

    /* renamed from: i0 */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f49618Y.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f49619Z.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: m0 */
    public final int size() {
        int i10 = 0;
        for (Object obj : this.f49618Y) {
            if (this.f49619Z.apply(obj)) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: q0 */
    public final Object[] toArray() {
        return W.R(iterator()).toArray();
    }

    /* renamed from: r */
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            if (!this.f49619Z.apply(obj)) {
                throw new IllegalArgumentException();
            }
        }
        return this.f49618Y.addAll(collection);
    }

    /* renamed from: r0 */
    public final Object[] toArray(Object[] objArr) {
        return W.R(iterator()).toArray(objArr);
    }

    /* renamed from: s */
    public final void clear() {
        Collection collection = this.f49618Y;
        boolean z10 = collection instanceof RandomAccess;
        w8.g gVar = this.f49619Z;
        if (z10 && (collection instanceof List)) {
            List list = (List) collection;
            gVar.getClass();
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                Object obj = list.get(i11);
                if (!gVar.apply(obj)) {
                    if (i11 > i10) {
                        try {
                            list.set(i10, obj);
                        } catch (IllegalArgumentException unused) {
                            M3.H.t0(list, gVar, i10, i11);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            M3.H.t0(list, gVar, i10, i11);
                            return;
                        }
                    }
                    i10++;
                }
            }
            list.subList(i10, list.size()).clear();
            return;
        }
        Iterator it = collection.iterator();
        gVar.getClass();
        while (it.hasNext()) {
            if (gVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    /* renamed from: y */
    public final boolean contains(Object obj) {
        Collection collection = this.f49618Y;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f49619Z.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
