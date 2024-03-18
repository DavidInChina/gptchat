package kf;

import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import xf.AbstractC6438a;

/* renamed from: kf.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4287l implements Collection, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final Object[] f37471Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f37472Z;

    public C4287l(Object[] objArr, boolean z10) {
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, objArr);
        this.f37471Y = objArr;
        this.f37472Z = z10;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
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
        return q.S2(obj, this.f37471Y);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        Collection<Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!q.S2(obj, this.f37471Y)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f37471Y.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return N.f0(this.f37471Y);
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
        return this.f37471Y.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f37471Y;
        AbstractC3557B.c0("<this>", objArr);
        if (!this.f37472Z || !AbstractC3557B.K(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            AbstractC3557B.b0("copyOf(...)", copyOf);
            return copyOf;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
