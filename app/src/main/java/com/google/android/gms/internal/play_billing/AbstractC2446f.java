package com.google.android.gms.internal.play_billing;

import j$.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* renamed from: com.google.android.gms.internal.play_billing.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2446f extends AbstractC2440c implements List, RandomAccess, j$.util.List {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2442d f26919Z = new C2442d(C2454j.f26930j0, 0);

    public static AbstractC2446f U(ArrayList arrayList) {
        if (arrayList instanceof AbstractC2440c) {
            AbstractC2446f y10 = ((AbstractC2440c) arrayList).y();
            if (y10.I()) {
                Object[] array = y10.toArray(AbstractC2440c.f26911Y);
                int length = array.length;
                if (length == 0) {
                    return C2454j.f26930j0;
                }
                return new C2454j(length, array);
            }
            return y10;
        }
        Object[] array2 = arrayList.toArray();
        int length2 = array2.length;
        Df.H.E0(length2, array2);
        if (length2 == 0) {
            return C2454j.f26930j0;
        }
        return new C2454j(length2, array2);
    }

    /* renamed from: T */
    public AbstractC2446f subList(int i10, int i11) {
        A7.b.a2(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return C2454j.f26930j0;
        }
        return new C2444e(this, i10, i12);
    }

    /* renamed from: V */
    public final C2442d listIterator(int i10) {
        A7.b.Z1(i10, size());
        if (isEmpty()) {
            return f26919Z;
        }
        return new C2442d(this, i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj2 = get(i10);
                        Object obj3 = list.get(i10);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                C2442d listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public int f(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
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
    public final /* synthetic */ Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2440c
    public final AbstractC2446f y() {
        return this;
    }
}
