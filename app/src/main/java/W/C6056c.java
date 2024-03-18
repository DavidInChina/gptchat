package w;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: w.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6056c implements Set {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C6059f f47575Y;

    public C6056c(C6059f c6059f) {
        this.f47575Y = c6059f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f47575Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f47575Y.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f47575Y.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i10;
        C6059f c6059f = this.f47575Y;
        int i11 = 0;
        for (int i12 = c6059f.f47560h0 - 1; i12 >= 0; i12--) {
            Object g10 = c6059f.g(i12);
            if (g10 == null) {
                i10 = 0;
            } else {
                i10 = g10.hashCode();
            }
            i11 += i10;
        }
        return i11;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f47575Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6055b(this.f47575Y, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C6059f c6059f = this.f47575Y;
        int d10 = c6059f.d(obj);
        if (d10 >= 0) {
            c6059f.h(d10);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f47575Y.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f47575Y.m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f47575Y.f47560h0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C6059f c6059f = this.f47575Y;
        int i10 = c6059f.f47560h0;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c6059f.g(i11);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C6059f c6059f = this.f47575Y;
        int i10 = c6059f.f47560h0;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c6059f.g(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
