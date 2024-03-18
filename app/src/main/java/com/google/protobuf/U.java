package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends AbstractC2496d implements AbstractC2521l0, RandomAccess, AbstractC2492b1 {

    /* renamed from: i0  reason: collision with root package name */
    public static final U f27500i0;

    /* renamed from: Z  reason: collision with root package name */
    public float[] f27501Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f27502h0;

    static {
        U u10 = new U(0, new float[0]);
        f27500i0 = u10;
        u10.f27534Y = false;
    }

    public U(int i10, float[] fArr) {
        this.f27501Z = fArr;
        this.f27502h0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f27502h0)) {
            float[] fArr = this.f27501Z;
            if (i11 < fArr.length) {
                System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
            } else {
                float[] fArr2 = new float[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i10);
                System.arraycopy(this.f27501Z, i10, fArr2, i10 + 1, this.f27502h0 - i10);
                this.f27501Z = fArr2;
            }
            this.f27501Z[i10] = floatValue;
            this.f27502h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27502h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        f();
        Charset charset = AbstractC2536r0.f27584a;
        collection.getClass();
        if (!(collection instanceof U)) {
            return super.addAll(collection);
        }
        U u10 = (U) collection;
        int i10 = u10.f27502h0;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f27502h0;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f27501Z;
            if (i12 > fArr.length) {
                this.f27501Z = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(u10.f27501Z, 0, this.f27501Z, this.f27502h0, u10.f27502h0);
            this.f27502h0 = i12;
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
        if (!(obj instanceof U)) {
            return super.equals(obj);
        }
        U u10 = (U) obj;
        if (this.f27502h0 != u10.f27502h0) {
            return false;
        }
        float[] fArr = u10.f27501Z;
        for (int i10 = 0; i10 < this.f27502h0; i10++) {
            if (Float.floatToIntBits(this.f27501Z[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        y(i10);
        return Float.valueOf(this.f27501Z[i10]);
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        if (i10 >= this.f27502h0) {
            return new U(this.f27502h0, Arrays.copyOf(this.f27501Z, i10));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f27502h0; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f27501Z[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.f27502h0;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f27501Z[i11] == floatValue) {
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
        float[] fArr = this.f27501Z;
        float f6 = fArr[i10];
        if (i10 < this.f27502h0 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f27502h0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        f();
        if (i11 >= i10) {
            float[] fArr = this.f27501Z;
            System.arraycopy(fArr, i11, fArr, i10, this.f27502h0 - i11);
            this.f27502h0 -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final void s(float f6) {
        f();
        int i10 = this.f27502h0;
        float[] fArr = this.f27501Z;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[android.gov.nist.core.a.z(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f27501Z = fArr2;
        }
        float[] fArr3 = this.f27501Z;
        int i11 = this.f27502h0;
        this.f27502h0 = i11 + 1;
        fArr3[i11] = f6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        f();
        y(i10);
        float[] fArr = this.f27501Z;
        float f6 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27502h0;
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < this.f27502h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27502h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        s(((Float) obj).floatValue());
        return true;
    }
}
