package lf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import j0.C3878C;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kf.AbstractC4283h;
import kf.q;
import xe.C6431t;

/* renamed from: lf.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4436a extends AbstractC4283h implements RandomAccess, Serializable {

    /* renamed from: l0  reason: collision with root package name */
    public static final C4436a f38301l0;

    /* renamed from: Y  reason: collision with root package name */
    public Object[] f38302Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f38303Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f38304h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f38305i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C4436a f38306j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C4436a f38307k0;

    static {
        C4436a c4436a = new C4436a(0);
        c4436a.f38305i0 = true;
        f38301l0 = c4436a;
    }

    public C4436a() {
        this(10);
    }

    public final void I(int i10, int i11, Collection collection) {
        ((AbstractList) this).modCount++;
        C4436a c4436a = this.f38306j0;
        if (c4436a != null) {
            c4436a.I(i10, i11, collection);
            this.f38302Y = c4436a.f38302Y;
            this.f38304h0 += i11;
            return;
        }
        V(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f38302Y[i10 + i12] = it.next();
        }
    }

    public final void M(int i10, Object obj) {
        ((AbstractList) this).modCount++;
        C4436a c4436a = this.f38306j0;
        if (c4436a != null) {
            c4436a.M(i10, obj);
            this.f38302Y = c4436a.f38302Y;
            this.f38304h0++;
            return;
        }
        V(i10, 1);
        this.f38302Y[i10] = obj;
    }

    public final void T() {
        C4436a c4436a = this.f38307k0;
        if (c4436a != null && ((AbstractList) c4436a).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void U() {
        C4436a c4436a;
        if (!this.f38305i0 && ((c4436a = this.f38307k0) == null || !c4436a.f38305i0)) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void V(int i10, int i11) {
        int i12 = this.f38304h0 + i11;
        if (i12 >= 0) {
            Object[] objArr = this.f38302Y;
            if (i12 > objArr.length) {
                int length = objArr.length;
                int i13 = length + (length >> 1);
                if (i13 - i12 < 0) {
                    i13 = i12;
                }
                if (i13 - 2147483639 > 0) {
                    if (i12 > 2147483639) {
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i13 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i13);
                AbstractC3557B.b0("copyOf(...)", copyOf);
                this.f38302Y = copyOf;
            }
            Object[] objArr2 = this.f38302Y;
            q.W2(i10 + i11, i10, this.f38303Z + this.f38304h0, objArr2, objArr2);
            this.f38304h0 += i11;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        U();
        T();
        M(this.f38303Z + this.f38304h0, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        AbstractC3557B.c0("elements", collection);
        U();
        T();
        int i11 = this.f38304h0;
        if (i10 >= 0 && i10 <= i11) {
            int size = collection.size();
            I(this.f38303Z + i10, size, collection);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        U();
        T();
        m0(this.f38303Z, this.f38304h0);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        T();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f38302Y;
            int i10 = this.f38304h0;
            if (i10 != list.size()) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (!AbstractC3557B.K(objArr[this.f38303Z + i11], list.get(i11))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        T();
        int i11 = this.f38304h0;
        if (i10 >= 0 && i10 < i11) {
            return this.f38302Y[this.f38303Z + i10];
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10;
        T();
        Object[] objArr = this.f38302Y;
        int i11 = this.f38304h0;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[this.f38303Z + i13];
            int i14 = i12 * 31;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i12 = i14 + i10;
        }
        return i12;
    }

    public final Object i0(int i10) {
        int i11;
        ((AbstractList) this).modCount++;
        C4436a c4436a = this.f38306j0;
        if (c4436a != null) {
            this.f38304h0--;
            return c4436a.i0(i10);
        }
        Object[] objArr = this.f38302Y;
        Object obj = objArr[i10];
        q.W2(i10, i10 + 1, this.f38304h0 + this.f38303Z, objArr, objArr);
        Object[] objArr2 = this.f38302Y;
        AbstractC3557B.c0("<this>", objArr2);
        objArr2[(i11 + this.f38304h0) - 1] = null;
        this.f38304h0--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        T();
        for (int i10 = 0; i10 < this.f38304h0; i10++) {
            if (AbstractC3557B.K(this.f38302Y[this.f38303Z + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        T();
        if (this.f38304h0 == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        T();
        for (int i10 = this.f38304h0 - 1; i10 >= 0; i10--) {
            if (AbstractC3557B.K(this.f38302Y[this.f38303Z + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m0(int i10, int i11) {
        if (i11 > 0) {
            ((AbstractList) this).modCount++;
        }
        C4436a c4436a = this.f38306j0;
        if (c4436a != null) {
            c4436a.m0(i10, i11);
        } else {
            Object[] objArr = this.f38302Y;
            q.W2(i10, i10 + i11, this.f38304h0, objArr, objArr);
            Object[] objArr2 = this.f38302Y;
            int i12 = this.f38304h0;
            AbstractC3557B.p2(i12 - i11, i12, objArr2);
        }
        this.f38304h0 -= i11;
    }

    public final int q0(int i10, int i11, Collection collection, boolean z10) {
        int i12;
        C4436a c4436a = this.f38306j0;
        if (c4436a != null) {
            i12 = c4436a.q0(i10, i11, collection, z10);
        } else {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                int i15 = i10 + i13;
                if (collection.contains(this.f38302Y[i15]) == z10) {
                    Object[] objArr = this.f38302Y;
                    i13++;
                    objArr[i14 + i10] = objArr[i15];
                    i14++;
                } else {
                    i13++;
                }
            }
            int i16 = i11 - i14;
            Object[] objArr2 = this.f38302Y;
            q.W2(i10 + i14, i11 + i10, this.f38304h0, objArr2, objArr2);
            Object[] objArr3 = this.f38302Y;
            int i17 = this.f38304h0;
            AbstractC3557B.p2(i17 - i16, i17, objArr3);
            i12 = i16;
        }
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f38304h0 -= i12;
        return i12;
    }

    @Override // kf.AbstractC4283h
    public final int r() {
        T();
        return this.f38304h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        U();
        T();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            s(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        U();
        T();
        if (q0(this.f38303Z, this.f38304h0, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        U();
        T();
        if (q0(this.f38303Z, this.f38304h0, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // kf.AbstractC4283h
    public final Object s(int i10) {
        U();
        T();
        int i11 = this.f38304h0;
        if (i10 >= 0 && i10 < i11) {
            return i0(this.f38303Z + i10);
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        U();
        T();
        int i11 = this.f38304h0;
        if (i10 >= 0 && i10 < i11) {
            Object[] objArr = this.f38302Y;
            int i12 = this.f38303Z;
            Object obj2 = objArr[i12 + i10];
            objArr[i12 + i10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        C4436a c4436a;
        C6431t.h(i10, i11, this.f38304h0);
        Object[] objArr = this.f38302Y;
        int i12 = this.f38303Z + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f38305i0;
        C4436a c4436a2 = this.f38307k0;
        if (c4436a2 == null) {
            c4436a = this;
        } else {
            c4436a = c4436a2;
        }
        return new C4436a(objArr, i12, i13, z10, this, c4436a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("destination", objArr);
        T();
        int length = objArr.length;
        int i10 = this.f38304h0;
        int i11 = this.f38303Z;
        if (length < i10) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f38302Y, i11, i10 + i11, objArr.getClass());
            AbstractC3557B.b0("copyOfRange(...)", copyOfRange);
            return copyOfRange;
        }
        q.W2(0, i11, i10 + i11, this.f38302Y, objArr);
        int i12 = this.f38304h0;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        T();
        Object[] objArr = this.f38302Y;
        int i10 = this.f38304h0;
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[this.f38303Z + i11];
            if (obj == this) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4436a(int i10) {
        this(new Object[i10], 0, 0, false, null, null);
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        T();
        int i11 = this.f38304h0;
        if (i10 >= 0 && i10 <= i11) {
            return new C3878C(this, i10);
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        U();
        T();
        int i11 = this.f38304h0;
        if (i10 >= 0 && i10 <= i11) {
            M(this.f38303Z + i10, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    public C4436a(Object[] objArr, int i10, int i11, boolean z10, C4436a c4436a, C4436a c4436a2) {
        this.f38302Y = objArr;
        this.f38303Z = i10;
        this.f38304h0 = i11;
        this.f38305i0 = z10;
        this.f38306j0 = c4436a;
        this.f38307k0 = c4436a2;
        if (c4436a != null) {
            ((AbstractList) this).modCount = ((AbstractList) c4436a).modCount;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        T();
        Object[] objArr = this.f38302Y;
        int i10 = this.f38304h0;
        int i11 = this.f38303Z;
        return q.c3(i11, i10 + i11, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        U();
        T();
        int size = collection.size();
        I(this.f38303Z + this.f38304h0, size, collection);
        return size > 0;
    }
}
