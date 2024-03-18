package G0;

import id.AbstractC3557B;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j0.C3878C;
import java.util.Arrays;
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
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import xf.AbstractC6438a;

/* renamed from: G0.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0593w implements List, AbstractC6438a, j$.util.List {

    /* renamed from: Y  reason: collision with root package name */
    public Object[] f5834Y = new Object[16];

    /* renamed from: Z  reason: collision with root package name */
    public long[] f5835Z = new long[16];

    /* renamed from: h0  reason: collision with root package name */
    public int f5836h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f5837i0;

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
        this.f5836h0 = -1;
        y();
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
        Object obj = this.f5834Y[i10];
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node", obj);
        return (AbstractC4325q) obj;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC4325q)) {
            return -1;
        }
        AbstractC4325q abstractC4325q = (AbstractC4325q) obj;
        int u02 = AbstractC4344b.u0(this);
        if (u02 < 0) {
            return -1;
        }
        int i10 = 0;
        while (!AbstractC3557B.K(this.f5834Y[i10], abstractC4325q)) {
            if (i10 == u02) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f5837i0 == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3878C(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC4325q)) {
            return -1;
        }
        AbstractC4325q abstractC4325q = (AbstractC4325q) obj;
        for (int u02 = AbstractC4344b.u0(this); -1 < u02; u02--) {
            if (AbstractC3557B.K(this.f5834Y[u02], abstractC4325q)) {
                return u02;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C3878C(this, 0, 7);
    }

    public final long r() {
        long a5 = AbstractC0579h.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f5836h0 + 1;
        int u02 = AbstractC4344b.u0(this);
        if (i10 <= u02) {
            while (true) {
                long j6 = this.f5835Z[i10];
                if (AbstractC0579h.o(j6, a5) < 0) {
                    a5 = j6;
                }
                if (Float.intBitsToFloat((int) (a5 >> 32)) < 0.0f && ((int) (4294967295L & a5)) != 0) {
                    return a5;
                }
                if (i10 == u02) {
                    break;
                }
                i10++;
            }
        }
        return a5;
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

    public final void s(AbstractC4325q abstractC4325q, float f6, boolean z10, AbstractC6216a abstractC6216a) {
        int i10 = this.f5836h0;
        int i11 = i10 + 1;
        this.f5836h0 = i11;
        Object[] objArr = this.f5834Y;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f5834Y = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f5835Z, length);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f5835Z = copyOf2;
        }
        Object[] objArr2 = this.f5834Y;
        int i12 = this.f5836h0;
        objArr2[i12] = abstractC4325q;
        this.f5835Z[i12] = AbstractC0579h.a(f6, z10);
        y();
        abstractC6216a.mo122invoke();
        this.f5836h0 = i10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5837i0;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new C0592v(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.m.J(this);
    }

    public final void y() {
        int i10 = this.f5836h0 + 1;
        int u02 = AbstractC4344b.u0(this);
        if (i10 <= u02) {
            while (true) {
                this.f5834Y[i10] = null;
                if (i10 == u02) {
                    break;
                }
                i10++;
            }
        }
        this.f5837i0 = this.f5836h0 + 1;
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
        return new C3878C(this, i10, 6);
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
