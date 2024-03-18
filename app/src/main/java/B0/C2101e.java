package b0;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import xf.AbstractC6440c;

/* renamed from: b0.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2101e implements List, AbstractC6440c {

    /* renamed from: Y  reason: collision with root package name */
    public final C2104h f25561Y;

    public C2101e(C2104h c2104h) {
        this.f25561Y = c2104h;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f25561Y.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C2104h c2104h = this.f25561Y;
        return c2104h.d(c2104h.f25569h0, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f25561Y.f();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f25561Y.g(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C2104h c2104h = this.f25561Y;
        c2104h.getClass();
        for (Object obj : collection) {
            if (!c2104h.g(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.g(i10, this);
        return this.f25561Y.f25567Y[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f25561Y.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f25561Y.k();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2103g(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C2104h c2104h = this.f25561Y;
        int i10 = c2104h.f25569h0;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = c2104h.f25567Y;
            while (!AbstractC3557B.K(obj, objArr[i11])) {
                i11--;
                if (i11 < 0) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2103g(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f25561Y.m(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2104h c2104h = this.f25561Y;
        c2104h.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = c2104h.f25569h0;
        for (Object obj : collection) {
            c2104h.m(obj);
        }
        if (i10 == c2104h.f25569h0) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2104h c2104h = this.f25561Y;
        int i10 = c2104h.f25569h0;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(c2104h.f25567Y[i11])) {
                c2104h.n(i11);
            }
        }
        if (i10 != c2104h.f25569h0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        m.g(i10, this);
        return this.f25561Y.p(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f25561Y.f25569h0;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        m.h(this, i10, i11);
        return new C2102f(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return m.J(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f25561Y.a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2103g(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        m.g(i10, this);
        return this.f25561Y.n(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return m.K(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f25561Y.d(i10, collection);
    }
}
