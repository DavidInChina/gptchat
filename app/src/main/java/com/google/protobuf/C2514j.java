package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2514j extends AbstractC2496d implements AbstractC2509h0, RandomAccess, AbstractC2492b1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2514j f27560i0;

    /* renamed from: Z  reason: collision with root package name */
    public boolean[] f27561Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f27562h0;

    static {
        C2514j c2514j = new C2514j(new boolean[0], 0);
        f27560i0 = c2514j;
        c2514j.f27534Y = false;
    }

    public C2514j(boolean[] zArr, int i10) {
        this.f27561Z = zArr;
        this.f27562h0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f27562h0)) {
            boolean[] zArr = this.f27561Z;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.f27561Z, i10, zArr2, i10 + 1, this.f27562h0 - i10);
                this.f27561Z = zArr2;
            }
            this.f27561Z[i10] = booleanValue;
            this.f27562h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27562h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = AbstractC2536r0.f27584a;
        collection.getClass();
        if (!(collection instanceof C2514j)) {
            return super.addAll(collection);
        }
        C2514j c2514j = (C2514j) collection;
        int i10 = c2514j.f27562h0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27562h0;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f27561Z;
            if (i12 > zArr.length) {
                this.f27561Z = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(c2514j.f27561Z, 0, this.f27561Z, this.f27562h0, c2514j.f27562h0);
            this.f27562h0 = i12;
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
        if (!(obj instanceof C2514j)) {
            return super.equals(obj);
        }
        C2514j c2514j = (C2514j) obj;
        if (this.f27562h0 != c2514j.f27562h0) {
            return false;
        }
        boolean[] zArr = c2514j.f27561Z;
        for (int i10 = 0; i10 < this.f27562h0; i10++) {
            if (this.f27561Z[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        y(i10);
        return Boolean.valueOf(this.f27561Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        if (i10 >= this.f27562h0) {
            return new C2514j(Arrays.copyOf(this.f27561Z, i10), this.f27562h0);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10;
        int i11 = 1;
        for (int i12 = 0; i12 < this.f27562h0; i12++) {
            int i13 = i11 * 31;
            boolean z10 = this.f27561Z[i12];
            Charset charset = AbstractC2536r0.f27584a;
            if (z10) {
                i10 = 1231;
            } else {
                i10 = 1237;
            }
            i11 = i13 + i10;
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f27562h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f27561Z[i11] == booleanValue) {
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
        boolean[] zArr = this.f27561Z;
        boolean z10 = zArr[i10];
        if (i10 < this.f27562h0 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f27562h0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        f();
        if (i11 >= i10) {
            boolean[] zArr = this.f27561Z;
            System.arraycopy(zArr, i11, zArr, i10, this.f27562h0 - i11);
            this.f27562h0 -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void s(boolean z10) {
        f();
        int i10 = this.f27562h0;
        boolean[] zArr = this.f27561Z;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[android.gov.nist.core.a.z(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f27561Z = zArr2;
        }
        boolean[] zArr3 = this.f27561Z;
        int i11 = this.f27562h0;
        this.f27562h0 = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        f();
        y(i10);
        boolean[] zArr = this.f27561Z;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27562h0;
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < this.f27562h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27562h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s(((Boolean) obj).booleanValue());
        return true;
    }
}
