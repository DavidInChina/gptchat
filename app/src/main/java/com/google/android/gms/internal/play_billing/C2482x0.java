package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2482x0 extends AbstractC2483y implements RandomAccess {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2482x0 f26988i0 = new C2482x0(new Object[0], 0, false);

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f26989Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f26990h0;

    public C2482x0(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f26989Z = objArr;
        this.f26990h0 = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f26990h0)) {
            int i12 = i10 + 1;
            Object[] objArr = this.f26989Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
            } else {
                Object[] objArr2 = new Object[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f26989Z, i10, objArr2, i12, this.f26990h0 - i10);
                this.f26989Z = objArr2;
            }
            this.f26989Z[i10] = obj;
            this.f26990h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("Index:", i10, ", Size:", this.f26990h0));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        s(i10);
        return this.f26989Z[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        f();
        s(i10);
        Object[] objArr = this.f26989Z;
        Object obj = objArr[i10];
        if (i10 < this.f26990h0 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f26990h0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    public final void s(int i10) {
        if (i10 >= 0 && i10 < this.f26990h0) {
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("Index:", i10, ", Size:", this.f26990h0));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        s(i10);
        Object[] objArr = this.f26989Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26990h0;
    }

    @Override // com.google.android.gms.internal.play_billing.X
    public final /* bridge */ /* synthetic */ X u(int i10) {
        if (i10 >= this.f26990h0) {
            return new C2482x0(Arrays.copyOf(this.f26989Z, i10), this.f26990h0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2483y, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i10 = this.f26990h0;
        Object[] objArr = this.f26989Z;
        if (i10 == objArr.length) {
            this.f26989Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f26989Z;
        int i11 = this.f26990h0;
        this.f26990h0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
