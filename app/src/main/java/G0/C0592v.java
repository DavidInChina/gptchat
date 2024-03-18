package G0;

import id.AbstractC3557B;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j0.C3878C;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import l0.AbstractC4325q;
import xf.AbstractC6438a;

/* renamed from: G0.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0592v implements List, AbstractC6438a, j$.util.List {

    /* renamed from: Y  reason: collision with root package name */
    public final int f5831Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f5832Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0593w f5833h0;

    public C0592v(C0593w c0593w, int i10, int i11) {
        this.f5833h0 = c0593w;
        this.f5831Y = i10;
        this.f5832Z = i11;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC4325q) || indexOf((AbstractC4325q) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC4325q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj = this.f5833h0.f5834Y[i10 + this.f5831Y];
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (AbstractC4325q) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC4325q)) {
            return -1;
        }
        AbstractC4325q abstractC4325q = (AbstractC4325q) obj;
        int i10 = this.f5831Y;
        int i11 = this.f5832Z;
        if (i10 > i11) {
            return -1;
        }
        int i12 = i10;
        while (!AbstractC3557B.K(this.f5833h0.f5834Y[i12], abstractC4325q)) {
            if (i12 == i11) {
                return -1;
            }
            i12++;
        }
        return i12 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f5831Y;
        return new C3878C(this.f5833h0, i10, i10, this.f5832Z);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC4325q)) {
            return -1;
        }
        AbstractC4325q abstractC4325q = (AbstractC4325q) obj;
        int i10 = this.f5832Z;
        int i11 = this.f5831Y;
        if (i11 > i10) {
            return -1;
        }
        while (!AbstractC3557B.K(this.f5833h0.f5834Y[i10], abstractC4325q)) {
            if (i10 == i11) {
                return -1;
            }
            i10--;
        }
        return i10 - i11;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i10 = this.f5831Y;
        return new C3878C(this.f5833h0, i10, i10, this.f5832Z);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5832Z - this.f5831Y;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f5831Y;
        return new C0592v(this.f5833h0, i10 + i12, i12 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        int i11 = this.f5831Y;
        int i12 = this.f5832Z;
        return new C3878C(this.f5833h0, i10 + i11, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.m.K(this, objArr);
    }
}
