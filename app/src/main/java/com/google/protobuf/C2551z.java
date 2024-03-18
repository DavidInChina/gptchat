package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2551z extends AbstractC2496d implements AbstractC2512i0, RandomAccess, AbstractC2492b1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2551z f27645i0;

    /* renamed from: Z  reason: collision with root package name */
    public double[] f27646Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f27647h0;

    static {
        C2551z c2551z = new C2551z(0, new double[0]);
        f27645i0 = c2551z;
        c2551z.f27534Y = false;
    }

    public C2551z(int i10, double[] dArr) {
        this.f27646Z = dArr;
        this.f27647h0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f27647h0)) {
            double[] dArr = this.f27646Z;
            if (i11 < dArr.length) {
                System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
            } else {
                double[] dArr2 = new double[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i10);
                System.arraycopy(this.f27646Z, i10, dArr2, i10 + 1, this.f27647h0 - i10);
                this.f27646Z = dArr2;
            }
            this.f27646Z[i10] = doubleValue;
            this.f27647h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27647h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = AbstractC2536r0.f27584a;
        collection.getClass();
        if (!(collection instanceof C2551z)) {
            return super.addAll(collection);
        }
        C2551z c2551z = (C2551z) collection;
        int i10 = c2551z.f27647h0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27647h0;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f27646Z;
            if (i12 > dArr.length) {
                this.f27646Z = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(c2551z.f27646Z, 0, this.f27646Z, this.f27647h0, c2551z.f27647h0);
            this.f27647h0 = i12;
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
        if (!(obj instanceof C2551z)) {
            return super.equals(obj);
        }
        C2551z c2551z = (C2551z) obj;
        if (this.f27647h0 != c2551z.f27647h0) {
            return false;
        }
        double[] dArr = c2551z.f27646Z;
        for (int i10 = 0; i10 < this.f27647h0; i10++) {
            if (Double.doubleToLongBits(this.f27646Z[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        y(i10);
        return Double.valueOf(this.f27646Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        if (i10 >= this.f27647h0) {
            return new C2551z(this.f27647h0, Arrays.copyOf(this.f27646Z, i10));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27647h0; i11++) {
            i10 = (i10 * 31) + AbstractC2536r0.b(Double.doubleToLongBits(this.f27646Z[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i10 = this.f27647h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f27646Z[i11] == doubleValue) {
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
        double[] dArr = this.f27646Z;
        double d10 = dArr[i10];
        if (i10 < this.f27647h0 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f27647h0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        f();
        if (i11 >= i10) {
            double[] dArr = this.f27646Z;
            System.arraycopy(dArr, i11, dArr, i10, this.f27647h0 - i11);
            this.f27647h0 -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void s(double d10) {
        f();
        int i10 = this.f27647h0;
        double[] dArr = this.f27646Z;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[android.gov.nist.core.a.z(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f27646Z = dArr2;
        }
        double[] dArr3 = this.f27646Z;
        int i11 = this.f27647h0;
        this.f27647h0 = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        f();
        y(i10);
        double[] dArr = this.f27646Z;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27647h0;
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < this.f27647h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27647h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s(((Double) obj).doubleValue());
        return true;
    }
}
