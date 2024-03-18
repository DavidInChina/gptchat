package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: io.sentry.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3646g extends AbstractCollection implements Queue, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final transient Object[] f34341Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient int f34342Z = 0;

    /* renamed from: h0  reason: collision with root package name */
    public transient int f34343h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public transient boolean f34344i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public final int f34345j0;

    public C3646g(int i10) {
        if (i10 > 0) {
            Object[] objArr = new Object[i10];
            this.f34341Y = objArr;
            this.f34345j0 = objArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj != null) {
            int size = size();
            int i10 = this.f34345j0;
            if (size == i10) {
                remove();
            }
            int i11 = this.f34343h0;
            int i12 = i11 + 1;
            this.f34343h0 = i12;
            this.f34341Y[i11] = obj;
            if (i12 >= i10) {
                this.f34343h0 = 0;
            }
            if (this.f34343h0 == this.f34342Z) {
                this.f34344i0 = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f34344i0 = false;
        this.f34342Z = 0;
        this.f34343h0 = 0;
        Arrays.fill(this.f34341Y, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3643f(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f34341Y[this.f34342Z];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (!isEmpty()) {
            int i10 = this.f34342Z;
            Object[] objArr = this.f34341Y;
            Object obj = objArr[i10];
            if (obj != null) {
                int i11 = i10 + 1;
                this.f34342Z = i11;
                objArr[i10] = null;
                if (i11 >= this.f34345j0) {
                    this.f34342Z = 0;
                }
                this.f34344i0 = false;
            }
            return obj;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f34343h0;
        int i11 = this.f34342Z;
        int i12 = this.f34345j0;
        if (i10 < i11) {
            return (i12 - i11) + i10;
        }
        if (i10 == i11) {
            if (!this.f34344i0) {
                return 0;
            }
            return i12;
        }
        return i10 - i11;
    }
}
