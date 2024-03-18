package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2506g0 extends AbstractC2496d implements AbstractC2524m0, RandomAccess, AbstractC2492b1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2506g0 f27544i0;

    /* renamed from: Z  reason: collision with root package name */
    public int[] f27545Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f27546h0;

    static {
        C2506g0 c2506g0 = new C2506g0(new int[0], 0);
        f27544i0 = c2506g0;
        c2506g0.f27534Y = false;
    }

    public C2506g0() {
        this(new int[10], 0);
    }

    public final int I(int i10) {
        y(i10);
        return this.f27545Z[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f27546h0)) {
            int[] iArr = this.f27545Z;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f27545Z, i10, iArr2, i10 + 1, this.f27546h0 - i10);
                this.f27545Z = iArr2;
            }
            this.f27545Z[i10] = intValue;
            this.f27546h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27546h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = AbstractC2536r0.f27584a;
        collection.getClass();
        if (!(collection instanceof C2506g0)) {
            return super.addAll(collection);
        }
        C2506g0 c2506g0 = (C2506g0) collection;
        int i10 = c2506g0.f27546h0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27546h0;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f27545Z;
            if (i12 > iArr.length) {
                this.f27545Z = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c2506g0.f27545Z, 0, this.f27545Z, this.f27546h0, c2506g0.f27546h0);
            this.f27546h0 = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2506g0)) {
            return super.equals(obj);
        }
        C2506g0 c2506g0 = (C2506g0) obj;
        if (this.f27546h0 != c2506g0.f27546h0) {
            return false;
        }
        int[] iArr = c2506g0.f27545Z;
        for (int i10 = 0; i10 < this.f27546h0; i10++) {
            if (this.f27545Z[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(I(i10));
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        if (i10 >= this.f27546h0) {
            return new C2506g0(Arrays.copyOf(this.f27545Z, i10), this.f27546h0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27546h0; i11++) {
            i10 = (i10 * 31) + this.f27545Z[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f27546h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f27545Z[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        f();
        y(i10);
        int[] iArr = this.f27545Z;
        int i12 = iArr[i10];
        if (i10 < this.f27546h0 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f27546h0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        f();
        if (i11 >= i10) {
            int[] iArr = this.f27545Z;
            System.arraycopy(iArr, i11, iArr, i10, this.f27546h0 - i11);
            this.f27546h0 -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void s(int i10) {
        f();
        int i11 = this.f27546h0;
        int[] iArr = this.f27545Z;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[android.gov.nist.core.a.z(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f27545Z = iArr2;
        }
        int[] iArr3 = this.f27545Z;
        int i12 = this.f27546h0;
        this.f27546h0 = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        f();
        y(i10);
        int[] iArr = this.f27545Z;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27546h0;
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < this.f27546h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27546h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    public C2506g0(int[] iArr, int i10) {
        this.f27545Z = iArr;
        this.f27546h0 = i10;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s(((Integer) obj).intValue());
        return true;
    }
}
