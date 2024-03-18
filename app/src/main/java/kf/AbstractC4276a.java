package kf;

import id.AbstractC3557B;
import java.util.Collection;
import xf.AbstractC6438a;
import zc.C6821H;

/* renamed from: kf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4276a implements Collection, AbstractC6438a {
    @Override // java.util.Collection, java.util.List, c0.AbstractC2274d
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List, c0.AbstractC2274d
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (AbstractC3557B.K(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        Collection<Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (r() == 0) {
            return true;
        }
        return false;
    }

    public abstract int r();

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return r();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return kotlin.jvm.internal.m.K(this, objArr);
    }

    public final String toString() {
        return t.m2(this, ", ", "[", "]", new C6821H(21, this), 24);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }
}
