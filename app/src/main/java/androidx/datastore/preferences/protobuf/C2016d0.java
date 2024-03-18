package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.d0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2016d0 extends AbstractC2013c implements RandomAccess {

    /* renamed from: i0  reason: collision with root package name */
    public static final C2016d0 f25035i0;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f25036Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f25037h0;

    static {
        C2016d0 c2016d0 = new C2016d0(0, new Object[0]);
        f25035i0 = c2016d0;
        c2016d0.f25029Y = false;
    }

    public C2016d0(int i10, Object[] objArr) {
        this.f25036Z = objArr;
        this.f25037h0 = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2013c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i10 = this.f25037h0;
        Object[] objArr = this.f25036Z;
        if (i10 == objArr.length) {
            this.f25036Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f25036Z;
        int i11 = this.f25037h0;
        this.f25037h0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        r(i10);
        return this.f25036Z[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.A
    public final A h(int i10) {
        if (i10 >= this.f25037h0) {
            return new C2016d0(this.f25037h0, Arrays.copyOf(this.f25036Z, i10));
        }
        throw new IllegalArgumentException();
    }

    public final void r(int i10) {
        if (i10 >= 0 && i10 < this.f25037h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f25037h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        f();
        r(i10);
        Object[] objArr = this.f25036Z;
        Object obj = objArr[i10];
        if (i10 < this.f25037h0 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f25037h0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        r(i10);
        Object[] objArr = this.f25036Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25037h0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f25037h0)) {
            Object[] objArr = this.f25036Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f25036Z, i10, objArr2, i10 + 1, this.f25037h0 - i10);
                this.f25036Z = objArr2;
            }
            this.f25036Z[i10] = obj;
            this.f25037h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f25037h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }
}
