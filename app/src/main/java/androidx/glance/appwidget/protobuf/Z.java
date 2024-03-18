package androidx.glance.appwidget.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class Z extends AbstractC2043c implements RandomAccess {

    /* renamed from: i0  reason: collision with root package name */
    public static final Z f25195i0;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f25196Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f25197h0;

    static {
        Z z10 = new Z(0, new Object[0]);
        f25195i0 = z10;
        z10.f25202Y = false;
    }

    public Z(int i10, Object[] objArr) {
        this.f25196Z = objArr;
        this.f25197h0 = i10;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2043c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i10 = this.f25197h0;
        Object[] objArr = this.f25196Z;
        if (i10 == objArr.length) {
            this.f25196Z = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f25196Z;
        int i11 = this.f25197h0;
        this.f25197h0 = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        r(i10);
        return this.f25196Z[i10];
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2065z
    public final AbstractC2065z h(int i10) {
        if (i10 >= this.f25197h0) {
            return new Z(this.f25197h0, Arrays.copyOf(this.f25196Z, i10));
        }
        throw new IllegalArgumentException();
    }

    public final void r(int i10) {
        if (i10 >= 0 && i10 < this.f25197h0) {
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f25197h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2043c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        f();
        r(i10);
        Object[] objArr = this.f25196Z;
        Object obj = objArr[i10];
        if (i10 < this.f25197h0 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f25197h0--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        f();
        r(i10);
        Object[] objArr = this.f25196Z;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25197h0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        f();
        if (i10 >= 0 && i10 <= (i11 = this.f25197h0)) {
            Object[] objArr = this.f25196Z;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[android.gov.nist.core.a.z(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f25196Z, i10, objArr2, i10 + 1, this.f25197h0 - i10);
                this.f25196Z = objArr2;
            }
            this.f25196Z[i10] = obj;
            this.f25197h0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Index:", i10, ", Size:");
        q10.append(this.f25197h0);
        throw new IndexOutOfBoundsException(q10.toString());
    }
}
