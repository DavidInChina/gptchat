package lf;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.Iterator;
import kf.AbstractC4282g;

/* renamed from: lf.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4441f extends AbstractC4282g {

    /* renamed from: Y  reason: collision with root package name */
    public final C4439d f38327Y;

    public C4441f(C4439d c4439d) {
        AbstractC3557B.c0("backing", c4439d);
        this.f38327Y = c4439d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f38327Y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f38327Y.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f38327Y.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C4439d c4439d = this.f38327Y;
        c4439d.getClass();
        return new C4437b(c4439d, 2);
    }

    @Override // kf.AbstractC4282g
    public final int r() {
        return this.f38327Y.f38320n0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C4439d c4439d = this.f38327Y;
        c4439d.b();
        int h10 = c4439d.h(obj);
        if (h10 < 0) {
            return false;
        }
        c4439d.k(h10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        this.f38327Y.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        this.f38327Y.b();
        return super.retainAll(collection);
    }
}
