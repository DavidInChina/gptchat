package jf;

import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import w.C6053E;
import xf.AbstractC6438a;

/* renamed from: jf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3969s implements Collection, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final int[] f36171Y;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C3968r)) {
            return false;
        }
        return kf.q.U2(this.f36171Y, ((C3968r) obj).f36170Y);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (obj instanceof C3968r) {
                if (!kf.q.U2(this.f36171Y, ((C3968r) obj).f36170Y)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3969s)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f36171Y, ((C3969s) obj).f36171Y)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f36171Y);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f36171Y.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6053E(this.f36171Y);
    }

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
    public final int size() {
        return this.f36171Y.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f36171Y) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
