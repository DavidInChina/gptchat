package kf;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import w.C6053E;

/* renamed from: kf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4280e extends AbstractC4276a implements List {
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        AbstractC3557B.c0("other", collection);
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object obj2 : this) {
            if (!AbstractC3557B.K(obj2, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i10;
        int i11 = 1;
        for (Object obj : this) {
            int i12 = i11 * 31;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return i11;
    }

    public int indexOf(Object obj) {
        int i10 = 0;
        for (Object obj2 : this) {
            if (!AbstractC3557B.K(obj2, obj)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C6053E(6, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC3557B.K(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C4278c(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i10, int i11) {
        return new C4279d(this, i10, i11);
    }

    public ListIterator listIterator(int i10) {
        return new C4278c(this, i10);
    }
}
