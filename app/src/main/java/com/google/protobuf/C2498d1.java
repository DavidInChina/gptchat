package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.d1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2498d1 extends AbstractC2496d implements RandomAccess {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2498d1 f27535i0;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f27536Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f27537h0;

    static {
        C2498d1 c2498d1 = new C2498d1(0, new Object[0]);
        f27535i0 = c2498d1;
        c2498d1.f27534Y = false;
    }

    public C2498d1(int i10, Object[] objArr) {
        this.f27536Z = objArr;
        this.f27537h0 = i10;
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i10 = this.f27537h0;
        Object[] objArr = this.f27536Z;
        if (i10 == objArr.length) {
            this.f27536Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f27536Z;
        int i11 = this.f27537h0;
        this.f27537h0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        s(i10);
        return this.f27536Z[i10];
    }

    @Override // com.google.protobuf.AbstractC2535q0
    public final AbstractC2535q0 h(int i10) {
        if (i10 >= this.f27537h0) {
            return new C2498d1(this.f27537h0, Arrays.copyOf(this.f27536Z, i10));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2496d, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        f();
        s(i10);
        Object[] objArr = this.f27536Z;
        Object obj = objArr[i10];
        if (i10 < this.f27537h0 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f27537h0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    public final void s(int i10) {
        if (i10 >= 0 && i10 < this.f27537h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27537h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        s(i10);
        Object[] objArr = this.f27536Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27537h0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f27537h0)) {
            Object[] objArr = this.f27536Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f27536Z, i10, objArr2, i10 + 1, this.f27537h0 - i10);
                this.f27536Z = objArr2;
            }
            this.f27536Z[i10] = obj;
            this.f27537h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f27537h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }
}
