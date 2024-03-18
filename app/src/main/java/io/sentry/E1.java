package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class E1 implements Queue, Collection, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Collection f33783Y;

    /* renamed from: Z  reason: collision with root package name */
    public final E1 f33784Z = this;

    public E1(C3646g c3646g) {
        this.f33783Y = c3646g;
    }

    /* renamed from: I */
    public final boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.f33784Z) {
            containsAll = ((Queue) this.f33783Y).containsAll(collection);
        }
        return containsAll;
    }

    /* renamed from: M */
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f33784Z) {
            isEmpty = ((Queue) this.f33783Y).isEmpty();
        }
        return isEmpty;
    }

    /* renamed from: T */
    public final Iterator iterator() {
        return ((Queue) this.f33783Y).iterator();
    }

    /* renamed from: U */
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f33784Z) {
            remove = ((Queue) this.f33783Y).remove(obj);
        }
        return remove;
    }

    /* renamed from: V */
    public final boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.f33784Z) {
            removeAll = ((Queue) this.f33783Y).removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Queue
    public final Object element() {
        Object element;
        synchronized (this.f33784Z) {
            element = ((Queue) this.f33783Y).element();
        }
        return element;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f33784Z) {
            equals = ((Queue) this.f33783Y).equals(obj);
        }
        return equals;
    }

    /* renamed from: f */
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.f33784Z) {
            add = ((Queue) this.f33783Y).add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        int hashCode;
        synchronized (this.f33784Z) {
            hashCode = ((Queue) this.f33783Y).hashCode();
        }
        return hashCode;
    }

    /* renamed from: i0 */
    public final boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.f33784Z) {
            retainAll = ((Queue) this.f33783Y).retainAll(collection);
        }
        return retainAll;
    }

    /* renamed from: m0 */
    public final int size() {
        int size;
        synchronized (this.f33784Z) {
            size = ((Queue) this.f33783Y).size();
        }
        return size;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean offer;
        synchronized (this.f33784Z) {
            offer = ((Queue) this.f33783Y).offer(obj);
        }
        return offer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object peek;
        synchronized (this.f33784Z) {
            peek = ((Queue) this.f33783Y).peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object poll;
        synchronized (this.f33784Z) {
            poll = ((Queue) this.f33783Y).poll();
        }
        return poll;
    }

    /* renamed from: q0 */
    public final String toString() {
        String obj;
        synchronized (this.f33784Z) {
            obj = ((Queue) this.f33783Y).toString();
        }
        return obj;
    }

    /* renamed from: r */
    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.f33784Z) {
            addAll = ((Queue) this.f33783Y).addAll(collection);
        }
        return addAll;
    }

    /* renamed from: s */
    public final void clear() {
        synchronized (this.f33784Z) {
            ((Queue) this.f33783Y).clear();
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f33784Z) {
            array = ((Queue) this.f33783Y).toArray();
        }
        return array;
    }

    /* renamed from: y */
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f33784Z) {
            contains = ((Queue) this.f33783Y).contains(obj);
        }
        return contains;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object remove;
        synchronized (this.f33784Z) {
            remove = ((Queue) this.f33783Y).remove();
        }
        return remove;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f33784Z) {
            array = ((Queue) this.f33783Y).toArray(objArr);
        }
        return array;
    }
}
