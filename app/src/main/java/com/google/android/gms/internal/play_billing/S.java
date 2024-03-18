package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class S extends AbstractC2483y implements RandomAccess, V, AbstractC2478v0 {

    /* renamed from: i0  reason: collision with root package name */
    public static final S f26878i0 = new S(new int[0], 0, false);

    /* renamed from: Z  reason: collision with root package name */
    public int[] f26879Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f26880h0;

    public S(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f26879Z = iArr;
        this.f26880h0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f26880h0)) {
            int i12 = i10 + 1;
            int[] iArr = this.f26879Z;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
            } else {
                int[] iArr2 = new int[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f26879Z, i10, iArr2, i12, this.f26880h0 - i10);
                this.f26879Z = iArr2;
            }
            this.f26879Z[i10] = intValue;
            this.f26880h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("Index:", i10, ", Size:", this.f26880h0));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = Y.f26890a;
        collection.getClass();
        if (!(collection instanceof S)) {
            return super.addAll(collection);
        }
        S s10 = (S) collection;
        int i10 = s10.f26880h0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26880h0;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f26879Z;
            if (i12 > iArr.length) {
                this.f26879Z = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(s10.f26879Z, 0, this.f26879Z, this.f26880h0, s10.f26880h0);
            this.f26880h0 = i12;
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return super.equals(obj);
        }
        S s10 = (S) obj;
        if (this.f26880h0 != s10.f26880h0) {
            return false;
        }
        int[] iArr = s10.f26879Z;
        for (int i10 = 0; i10 < this.f26880h0; i10++) {
            if (this.f26879Z[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        y(i10);
        return Integer.valueOf(this.f26879Z[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26880h0; i11++) {
            i10 = (i10 * 31) + this.f26879Z[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f26880h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26879Z[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        f();
        y(i10);
        int[] iArr = this.f26879Z;
        int i12 = iArr[i10];
        if (i10 < this.f26880h0 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.f26880h0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        f();
        if (i11 >= i10) {
            int[] iArr = this.f26879Z;
            System.arraycopy(iArr, i11, iArr, i10, this.f26880h0 - i11);
            this.f26880h0 -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void s(int i10) {
        f();
        int i11 = this.f26880h0;
        int[] iArr = this.f26879Z;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[android.gov.nist.core.a.z(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f26879Z = iArr2;
        }
        int[] iArr3 = this.f26879Z;
        int i12 = this.f26880h0;
        this.f26880h0 = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        f();
        y(i10);
        int[] iArr = this.f26879Z;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26880h0;
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final X u(int i10) {
        if (i10 >= this.f26880h0) {
            return new S(Arrays.copyOf(this.f26879Z, i10), this.f26880h0, true);
        }
        throw new IllegalArgumentException();
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < this.f26880h0) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("Index:", i10, ", Size:", this.f26880h0));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        s(((Integer) obj).intValue());
        return true;
    }
}
