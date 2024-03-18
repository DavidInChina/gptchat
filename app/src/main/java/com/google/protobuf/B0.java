package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class B0 extends AbstractC2496d implements AbstractC2533p0, RandomAccess, AbstractC2492b1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final B0 f27379i0;

    /* renamed from: Z  reason: collision with root package name */
    public long[] f27380Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f27381h0;

    static {
        B0 b02 = new B0(new long[0], 0);
        f27379i0 = b02;
        b02.f27534Y = false;
    }

    public B0() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f27381h0)) {
            long[] jArr = this.f27380Z;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f27380Z, i10, jArr2, i10 + 1, this.f27381h0 - i10);
                this.f27380Z = jArr2;
            }
            this.f27380Z[i10] = longValue;
            this.f27381h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27381h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = AbstractC2536r0.f27584a;
        collection.getClass();
        if (!(collection instanceof B0)) {
            return super.addAll(collection);
        }
        B0 b02 = (B0) collection;
        int i10 = b02.f27381h0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27381h0;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f27380Z;
            if (i12 > jArr.length) {
                this.f27380Z = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(b02.f27380Z, 0, this.f27380Z, this.f27381h0, b02.f27381h0);
            this.f27381h0 = i12;
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
        if (!(obj instanceof B0)) {
            return super.equals(obj);
        }
        B0 b02 = (B0) obj;
        if (this.f27381h0 != b02.f27381h0) {
            return false;
        }
        long[] jArr = b02.f27380Z;
        for (int i10 = 0; i10 < this.f27381h0; i10++) {
            if (this.f27380Z[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        y(i10);
        return Long.valueOf(this.f27380Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        if (i10 >= this.f27381h0) {
            return new B0(Arrays.copyOf(this.f27380Z, i10), this.f27381h0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27381h0; i11++) {
            i10 = (i10 * 31) + AbstractC2536r0.b(this.f27380Z[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f27381h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f27380Z[i11] == longValue) {
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
        long[] jArr = this.f27380Z;
        long j6 = jArr[i10];
        if (i10 < this.f27381h0 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f27381h0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        f();
        if (i11 >= i10) {
            long[] jArr = this.f27380Z;
            System.arraycopy(jArr, i11, jArr, i10, this.f27381h0 - i11);
            this.f27381h0 -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void s(long j6) {
        f();
        int i10 = this.f27381h0;
        long[] jArr = this.f27380Z;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[android.gov.nist.core.a.z(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f27380Z = jArr2;
        }
        long[] jArr3 = this.f27380Z;
        int i11 = this.f27381h0;
        this.f27381h0 = i11 + 1;
        jArr3[i11] = j6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        f();
        y(i10);
        long[] jArr = this.f27380Z;
        long j6 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27381h0;
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < this.f27381h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27381h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    public B0(long[] jArr, int i10) {
        this.f27380Z = jArr;
        this.f27381h0 = i10;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s(((Long) obj).longValue());
        return true;
    }
}
