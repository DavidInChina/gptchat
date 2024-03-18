package lf;

import id.AbstractC3557B;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kf.AbstractC4285j;

/* renamed from: lf.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4442g extends AbstractC4285j implements Serializable {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4442g f38328Z = new C4442g(C4439d.f38311s0);

    /* renamed from: Y  reason: collision with root package name */
    public final C4439d f38329Y;

    static {
        C4439d c4439d = C4439d.f38311s0;
    }

    public C4442g(C4439d c4439d) {
        AbstractC3557B.c0("backing", c4439d);
        this.f38329Y = c4439d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f38329Y.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        this.f38329Y.b();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f38329Y.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f38329Y.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f38329Y.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C4439d c4439d = this.f38329Y;
        c4439d.getClass();
        return new C4437b(c4439d, 1);
    }

    @Override // kf.AbstractC4285j
    public final int r() {
        return this.f38329Y.f38320n0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C4439d c4439d = this.f38329Y;
        c4439d.b();
        int g10 = c4439d.g(obj);
        if (g10 >= 0) {
            c4439d.k(g10);
            if (g10 >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        this.f38329Y.b();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        this.f38329Y.b();
        return super.retainAll(collection);
    }

    public C4442g() {
        this(new C4439d());
    }
}
