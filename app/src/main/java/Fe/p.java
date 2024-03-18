package Fe;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xf.AbstractC6443f;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class p implements Set, AbstractC6443f {

    /* renamed from: Y  reason: collision with root package name */
    public final Set f5341Y;

    /* renamed from: Z  reason: collision with root package name */
    public final wf.k f5342Z;

    /* renamed from: h0  reason: collision with root package name */
    public final wf.k f5343h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f5344i0;

    public p(Set set, i iVar, i iVar2) {
        AbstractC3557B.c0("delegate", set);
        this.f5341Y = set;
        this.f5342Z = iVar;
        this.f5343h0 = iVar2;
        this.f5344i0 = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f5341Y.add(this.f5343h0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        return this.f5341Y.addAll(r(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5341Y.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5341Y.contains(this.f5343h0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        return this.f5341Y.containsAll(r(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList s10 = s(this.f5341Y);
        if (!((Set) obj).containsAll(s10) || !s10.containsAll((Collection) obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f5341Y.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5341Y.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new o(this);
    }

    public final ArrayList r(Collection collection) {
        AbstractC3557B.c0("<this>", collection);
        Collection<Object> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(collection2, 10));
        for (Object obj : collection2) {
            arrayList.add(this.f5343h0.invoke(obj));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5341Y.remove(this.f5343h0.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        return this.f5341Y.removeAll(r(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        return this.f5341Y.retainAll(r(collection));
    }

    public final ArrayList s(Collection collection) {
        AbstractC3557B.c0("<this>", collection);
        Collection<Object> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(collection2, 10));
        for (Object obj : collection2) {
            arrayList.add(this.f5342Z.invoke(obj));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5344i0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    public final String toString() {
        return s(this.f5341Y).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
