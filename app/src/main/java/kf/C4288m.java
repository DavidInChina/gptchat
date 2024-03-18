package kf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l8.AbstractC4344b;

/* renamed from: kf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4288m extends AbstractC4283h {

    /* renamed from: i0  reason: collision with root package name */
    public static final Object[] f37473i0 = new Object[0];

    /* renamed from: Y  reason: collision with root package name */
    public int f37474Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f37475Z = f37473i0;

    /* renamed from: h0  reason: collision with root package name */
    public int f37476h0;

    public final void I(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f37475Z;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f37473i0) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f37475Z = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            q.W2(0, this.f37474Y, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f37475Z;
            int length2 = objArr3.length;
            int i12 = this.f37474Y;
            q.W2(length2 - i12, 0, i12, objArr3, objArr2);
            this.f37474Y = 0;
            this.f37475Z = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int M(int i10) {
        if (i10 == q.l3(this.f37475Z)) {
            return 0;
        }
        return i10 + 1;
    }

    public final Object T() {
        if (isEmpty()) {
            return null;
        }
        return this.f37475Z[U(AbstractC4344b.u0(this) + this.f37474Y)];
    }

    public final int U(int i10) {
        Object[] objArr = this.f37475Z;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11 = this.f37476h0;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            addLast(obj);
        } else if (i10 == 0) {
            addFirst(obj);
        } else {
            I(i11 + 1);
            int U10 = U(this.f37474Y + i10);
            int i12 = this.f37476h0;
            if (i10 < ((i12 + 1) >> 1)) {
                int l32 = U10 == 0 ? q.l3(this.f37475Z) : U10 - 1;
                int i13 = this.f37474Y;
                int l33 = i13 == 0 ? q.l3(this.f37475Z) : i13 - 1;
                int i14 = this.f37474Y;
                if (l32 >= i14) {
                    Object[] objArr = this.f37475Z;
                    objArr[l33] = objArr[i14];
                    q.W2(i14, i14 + 1, l32 + 1, objArr, objArr);
                } else {
                    Object[] objArr2 = this.f37475Z;
                    q.W2(i14 - 1, i14, objArr2.length, objArr2, objArr2);
                    Object[] objArr3 = this.f37475Z;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    q.W2(0, 1, l32 + 1, objArr3, objArr3);
                }
                this.f37475Z[l32] = obj;
                this.f37474Y = l33;
            } else {
                int U11 = U(i12 + this.f37474Y);
                if (U10 < U11) {
                    Object[] objArr4 = this.f37475Z;
                    q.W2(U10 + 1, U10, U11, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f37475Z;
                    q.W2(1, 0, U11, objArr5, objArr5);
                    Object[] objArr6 = this.f37475Z;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    q.W2(U10 + 1, U10, objArr6.length - 1, objArr6, objArr6);
                }
                this.f37475Z[U10] = obj;
            }
            this.f37476h0++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        AbstractC3557B.c0("elements", collection);
        int i11 = this.f37476h0;
        if (i10 >= 0 && i10 <= i11) {
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = this.f37476h0;
            if (i10 == i12) {
                return addAll(collection);
            }
            I(collection.size() + i12);
            int U10 = U(this.f37476h0 + this.f37474Y);
            int U11 = U(this.f37474Y + i10);
            int size = collection.size();
            if (i10 < ((this.f37476h0 + 1) >> 1)) {
                int i13 = this.f37474Y;
                int i14 = i13 - size;
                if (U11 < i13) {
                    Object[] objArr = this.f37475Z;
                    q.W2(i14, i13, objArr.length, objArr, objArr);
                    if (size >= U11) {
                        Object[] objArr2 = this.f37475Z;
                        q.W2(objArr2.length - size, 0, U11, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f37475Z;
                        q.W2(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f37475Z;
                        q.W2(0, size, U11, objArr4, objArr4);
                    }
                } else if (i14 >= 0) {
                    Object[] objArr5 = this.f37475Z;
                    q.W2(i14, i13, U11, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f37475Z;
                    i14 += objArr6.length;
                    int i15 = U11 - i13;
                    int length = objArr6.length - i14;
                    if (length >= i15) {
                        q.W2(i14, i13, U11, objArr6, objArr6);
                    } else {
                        q.W2(i14, i13, i13 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f37475Z;
                        q.W2(0, this.f37474Y + length, U11, objArr7, objArr7);
                    }
                }
                this.f37474Y = i14;
                int i16 = U11 - size;
                if (i16 < 0) {
                    i16 += this.f37475Z.length;
                }
                y(i16, collection);
            } else {
                int i17 = U11 + size;
                if (U11 < U10) {
                    int i18 = size + U10;
                    Object[] objArr8 = this.f37475Z;
                    if (i18 <= objArr8.length) {
                        q.W2(i17, U11, U10, objArr8, objArr8);
                    } else if (i17 >= objArr8.length) {
                        q.W2(i17 - objArr8.length, U11, U10, objArr8, objArr8);
                    } else {
                        int length2 = U10 - (i18 - objArr8.length);
                        q.W2(0, length2, U10, objArr8, objArr8);
                        Object[] objArr9 = this.f37475Z;
                        q.W2(i17, U11, length2, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f37475Z;
                    q.W2(size, 0, U10, objArr10, objArr10);
                    Object[] objArr11 = this.f37475Z;
                    if (i17 >= objArr11.length) {
                        q.W2(i17 - objArr11.length, U11, objArr11.length, objArr11, objArr11);
                    } else {
                        q.W2(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f37475Z;
                        q.W2(i17, U11, objArr12.length - size, objArr12, objArr12);
                    }
                }
                y(U11, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    public final void addFirst(Object obj) {
        int i10;
        I(this.f37476h0 + 1);
        int i11 = this.f37474Y;
        if (i11 == 0) {
            i10 = q.l3(this.f37475Z);
        } else {
            i10 = i11 - 1;
        }
        this.f37474Y = i10;
        this.f37475Z[i10] = obj;
        this.f37476h0++;
    }

    public final void addLast(Object obj) {
        I(r() + 1);
        this.f37475Z[U(r() + this.f37474Y)] = obj;
        this.f37476h0 = r() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int U10 = U(r() + this.f37474Y);
        int i10 = this.f37474Y;
        if (i10 < U10) {
            q.d3(i10, U10, null, this.f37475Z);
        } else if (!isEmpty()) {
            Object[] objArr = this.f37475Z;
            q.d3(this.f37474Y, objArr.length, null, objArr);
            q.d3(0, U10, null, this.f37475Z);
        }
        this.f37474Y = 0;
        this.f37476h0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f37475Z[this.f37474Y];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int r10 = r();
        if (i10 >= 0 && i10 < r10) {
            return this.f37475Z[U(this.f37474Y + i10)];
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", r10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int U10 = U(r() + this.f37474Y);
        int i11 = this.f37474Y;
        if (i11 < U10) {
            while (i11 < U10) {
                if (AbstractC3557B.K(obj, this.f37475Z[i11])) {
                    i10 = this.f37474Y;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 >= U10) {
            int length = this.f37475Z.length;
            while (true) {
                if (i11 < length) {
                    if (AbstractC3557B.K(obj, this.f37475Z[i11])) {
                        i10 = this.f37474Y;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < U10; i12++) {
                        if (AbstractC3557B.K(obj, this.f37475Z[i12])) {
                            i11 = i12 + this.f37475Z.length;
                            i10 = this.f37474Y;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (r() == 0) {
            return true;
        }
        return false;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f37475Z[U(AbstractC4344b.u0(this) + this.f37474Y)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int l32;
        int i10;
        int U10 = U(r() + this.f37474Y);
        int i11 = this.f37474Y;
        if (i11 < U10) {
            l32 = U10 - 1;
            if (i11 <= l32) {
                while (!AbstractC3557B.K(obj, this.f37475Z[l32])) {
                    if (l32 != i11) {
                        l32--;
                    }
                }
                i10 = this.f37474Y;
                return l32 - i10;
            }
            return -1;
        }
        if (i11 > U10) {
            int i12 = U10 - 1;
            while (true) {
                if (-1 < i12) {
                    if (AbstractC3557B.K(obj, this.f37475Z[i12])) {
                        l32 = i12 + this.f37475Z.length;
                        i10 = this.f37474Y;
                        break;
                    }
                    i12--;
                } else {
                    l32 = q.l3(this.f37475Z);
                    int i13 = this.f37474Y;
                    if (i13 <= l32) {
                        while (!AbstractC3557B.K(obj, this.f37475Z[l32])) {
                            if (l32 != i13) {
                                l32--;
                            }
                        }
                        i10 = this.f37474Y;
                    }
                }
            }
        }
        return -1;
    }

    @Override // kf.AbstractC4283h
    public final int r() {
        return this.f37476h0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        s(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i10;
        AbstractC3557B.c0("elements", collection);
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f37475Z.length != 0) {
            int U10 = U(this.f37476h0 + this.f37474Y);
            int i11 = this.f37474Y;
            if (i11 < U10) {
                i10 = i11;
                while (i11 < U10) {
                    Object obj = this.f37475Z[i11];
                    if (!collection.contains(obj)) {
                        this.f37475Z[i10] = obj;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i11++;
                }
                q.d3(i10, U10, null, this.f37475Z);
            } else {
                int length = this.f37475Z.length;
                boolean z11 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f37475Z;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (!collection.contains(obj2)) {
                        this.f37475Z[i12] = obj2;
                        i12++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                i10 = U(i12);
                for (int i13 = 0; i13 < U10; i13++) {
                    Object[] objArr2 = this.f37475Z;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (!collection.contains(obj3)) {
                        this.f37475Z[i10] = obj3;
                        i10 = M(i10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                int i14 = i10 - this.f37474Y;
                if (i14 < 0) {
                    i14 += this.f37475Z.length;
                }
                this.f37476h0 = i14;
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f37475Z;
            int i10 = this.f37474Y;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f37474Y = M(i10);
            this.f37476h0 = r() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int U10 = U(AbstractC4344b.u0(this) + this.f37474Y);
            Object[] objArr = this.f37475Z;
            Object obj = objArr[U10];
            objArr[U10] = null;
            this.f37476h0 = r() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i10;
        AbstractC3557B.c0("elements", collection);
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f37475Z.length != 0) {
            int U10 = U(this.f37476h0 + this.f37474Y);
            int i11 = this.f37474Y;
            if (i11 < U10) {
                i10 = i11;
                while (i11 < U10) {
                    Object obj = this.f37475Z[i11];
                    if (collection.contains(obj)) {
                        this.f37475Z[i10] = obj;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i11++;
                }
                q.d3(i10, U10, null, this.f37475Z);
            } else {
                int length = this.f37475Z.length;
                boolean z11 = false;
                int i12 = i11;
                while (i11 < length) {
                    Object[] objArr = this.f37475Z;
                    Object obj2 = objArr[i11];
                    objArr[i11] = null;
                    if (collection.contains(obj2)) {
                        this.f37475Z[i12] = obj2;
                        i12++;
                    } else {
                        z11 = true;
                    }
                    i11++;
                }
                i10 = U(i12);
                for (int i13 = 0; i13 < U10; i13++) {
                    Object[] objArr2 = this.f37475Z;
                    Object obj3 = objArr2[i13];
                    objArr2[i13] = null;
                    if (collection.contains(obj3)) {
                        this.f37475Z[i10] = obj3;
                        i10 = M(i10);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                int i14 = i10 - this.f37474Y;
                if (i14 < 0) {
                    i14 += this.f37475Z.length;
                }
                this.f37476h0 = i14;
            }
        }
        return z10;
    }

    @Override // kf.AbstractC4283h
    public final Object s(int i10) {
        int i11 = this.f37476h0;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == AbstractC4344b.u0(this)) {
                return removeLast();
            }
            if (i10 == 0) {
                return removeFirst();
            }
            int U10 = U(this.f37474Y + i10);
            Object[] objArr = this.f37475Z;
            Object obj = objArr[U10];
            if (i10 < (this.f37476h0 >> 1)) {
                int i12 = this.f37474Y;
                if (U10 >= i12) {
                    q.W2(i12 + 1, i12, U10, objArr, objArr);
                } else {
                    q.W2(1, 0, U10, objArr, objArr);
                    Object[] objArr2 = this.f37475Z;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f37474Y;
                    q.W2(i13 + 1, i13, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f37475Z;
                int i14 = this.f37474Y;
                objArr3[i14] = null;
                this.f37474Y = M(i14);
            } else {
                int U11 = U(AbstractC4344b.u0(this) + this.f37474Y);
                if (U10 <= U11) {
                    Object[] objArr4 = this.f37475Z;
                    q.W2(U10, U10 + 1, U11 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f37475Z;
                    q.W2(U10, U10 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f37475Z;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    q.W2(0, 1, U11 + 1, objArr6, objArr6);
                }
                this.f37475Z[U11] = null;
            }
            this.f37476h0--;
            return obj;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int r10 = r();
        if (i10 >= 0 && i10 < r10) {
            int U10 = U(this.f37474Y + i10);
            Object[] objArr = this.f37475Z;
            Object obj2 = objArr[U10];
            objArr[U10] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", r10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC3557B.c0("array", objArr);
        int length = objArr.length;
        int i10 = this.f37476h0;
        if (length < i10) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", newInstance);
            objArr = (Object[]) newInstance;
        }
        int U10 = U(this.f37476h0 + this.f37474Y);
        int i11 = this.f37474Y;
        if (i11 < U10) {
            q.a3(this.f37475Z, objArr, i11, U10, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f37475Z;
            q.W2(0, this.f37474Y, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f37475Z;
            q.W2(objArr3.length - this.f37474Y, 0, U10, objArr3, objArr);
        }
        int i12 = this.f37476h0;
        if (i12 < objArr.length) {
            objArr[i12] = null;
        }
        return objArr;
    }

    public final void y(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f37475Z.length;
        while (i10 < length && it.hasNext()) {
            this.f37475Z[i10] = it.next();
            i10++;
        }
        int i11 = this.f37474Y;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f37475Z[i12] = it.next();
        }
        this.f37476h0 = collection.size() + r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[r()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC3557B.c0("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        I(collection.size() + r());
        y(U(r() + this.f37474Y), collection);
        return true;
    }
}
