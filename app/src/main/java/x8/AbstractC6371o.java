package x8;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: x8.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6371o extends AbstractCollection {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f49586Y;

    /* renamed from: Z  reason: collision with root package name */
    public Collection f49587Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6371o f49588h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Collection f49589i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6359c f49590j0;

    public AbstractC6371o(AbstractC6359c abstractC6359c, Object obj, Collection collection, AbstractC6371o abstractC6371o) {
        Collection collection2;
        this.f49590j0 = abstractC6359c;
        this.f49586Y = obj;
        this.f49587Z = collection;
        this.f49588h0 = abstractC6371o;
        if (abstractC6371o == null) {
            collection2 = null;
        } else {
            collection2 = abstractC6371o.f49587Z;
        }
        this.f49589i0 = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        r();
        boolean isEmpty = this.f49587Z.isEmpty();
        boolean add = this.f49587Z.add(obj);
        if (add) {
            this.f49590j0.f49546j0++;
            if (isEmpty) {
                f();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f49587Z.addAll(collection);
        if (addAll) {
            this.f49590j0.f49546j0 += this.f49587Z.size() - size;
            if (size == 0) {
                f();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f49587Z.clear();
        this.f49590j0.f49546j0 -= size;
        s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        r();
        return this.f49587Z.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        r();
        return this.f49587Z.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        r();
        return this.f49587Z.equals(obj);
    }

    public final void f() {
        AbstractC6371o abstractC6371o = this.f49588h0;
        if (abstractC6371o != null) {
            abstractC6371o.f();
        } else {
            this.f49590j0.f49545i0.put(this.f49586Y, this.f49587Z);
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        r();
        return this.f49587Z.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        r();
        return new C6362f(this);
    }

    public final void r() {
        Collection collection;
        AbstractC6371o abstractC6371o = this.f49588h0;
        if (abstractC6371o != null) {
            abstractC6371o.r();
            if (abstractC6371o.f49587Z != this.f49589i0) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f49587Z.isEmpty() && (collection = (Collection) this.f49590j0.f49545i0.get(this.f49586Y)) != null) {
            this.f49587Z = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        r();
        boolean remove = this.f49587Z.remove(obj);
        if (remove) {
            AbstractC6359c abstractC6359c = this.f49590j0;
            abstractC6359c.f49546j0--;
            s();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f49587Z.removeAll(collection);
        if (removeAll) {
            this.f49590j0.f49546j0 += this.f49587Z.size() - size;
            s();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f49587Z.retainAll(collection);
        if (retainAll) {
            this.f49590j0.f49546j0 += this.f49587Z.size() - size;
            s();
        }
        return retainAll;
    }

    public final void s() {
        AbstractC6371o abstractC6371o = this.f49588h0;
        if (abstractC6371o != null) {
            abstractC6371o.s();
        } else if (this.f49587Z.isEmpty()) {
            this.f49590j0.f49545i0.remove(this.f49586Y);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        r();
        return this.f49587Z.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        r();
        return this.f49587Z.toString();
    }
}
