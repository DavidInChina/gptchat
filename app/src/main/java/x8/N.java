package x8;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class N extends I implements List, RandomAccess {

    /* renamed from: Z  reason: collision with root package name */
    public static final L f49523Z = new L(0, k0.f49573j0);

    public static k0 B0(AbstractCollection abstractCollection, j0 j0Var) {
        j0Var.getClass();
        if (!(abstractCollection instanceof Collection)) {
            abstractCollection = W.R(abstractCollection.iterator());
        }
        Object[] array = abstractCollection.toArray();
        P4.a.s(array.length, array);
        Arrays.sort(array, j0Var);
        return T(array.length, array);
    }

    public static k0 T(int i10, Object[] objArr) {
        if (i10 == 0) {
            return k0.f49573j0;
        }
        return new k0(i10, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x8.K, x8.H] */
    public static K U() {
        return new H();
    }

    public static N V(Collection collection) {
        if (collection instanceof I) {
            N f6 = ((I) collection).f();
            if (f6.M()) {
                Object[] array = f6.toArray(I.f49516Y);
                return T(array.length, array);
            }
            return f6;
        }
        Object[] array2 = collection.toArray();
        P4.a.s(array2.length, array2);
        return T(array2.length, array2);
    }

    public static k0 i0(Object[] objArr) {
        if (objArr.length == 0) {
            return k0.f49573j0;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        P4.a.s(objArr2.length, objArr2);
        return T(objArr2.length, objArr2);
    }

    public static k0 q0() {
        return k0.f49573j0;
    }

    public static k0 r0(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        P4.a.s(5, objArr);
        return T(5, objArr);
    }

    public static k0 u0(Object obj) {
        Object[] objArr = {obj};
        P4.a.s(1, objArr);
        return T(1, objArr);
    }

    public static k0 v0(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        P4.a.s(2, objArr);
        return T(2, objArr);
    }

    /* renamed from: D0 */
    public N subList(int i10, int i11) {
        P4.a.v(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return k0.f49573j0;
        }
        return new M(this, i10, i12);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // x8.I, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (M3.H.O(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object obj2 : this) {
                    if (it.hasNext()) {
                        if (!M3.H.O(obj2, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: m0 */
    public final L listIterator(int i10) {
        P4.a.u(i10, size());
        if (isEmpty()) {
            return f49523Z;
        }
        return new L(i10, this);
    }

    @Override // x8.I
    public int r(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // x8.I
    public final N f() {
        return this;
    }
}
