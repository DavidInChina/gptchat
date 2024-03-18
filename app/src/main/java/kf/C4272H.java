package kf;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: kf.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4272H extends AbstractC4280e implements RandomAccess {

    /* renamed from: Y  reason: collision with root package name */
    public final Object[] f37446Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f37447Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f37448h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f37449i0;

    public C4272H(int i10, Object[] objArr) {
        this.f37446Y = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f37447Z = objArr.length;
                this.f37449i0 = i10;
                return;
            }
            StringBuilder q10 = android.gov.nist.core.a.q("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
            q10.append(objArr.length);
            throw new IllegalArgumentException(q10.toString().toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("ring buffer filled size should not be negative but it is ", i10).toString());
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int r10 = r();
        if (i10 >= 0 && i10 < r10) {
            return this.f37446Y[(this.f37448h0 + i10) % this.f37447Z];
        }
        throw new IndexOutOfBoundsException(AbstractC2469q0.i("index: ", i10, ", size: ", r10));
    }

    @Override // kf.AbstractC4280e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C4271G(this);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f37449i0;
    }

    public final void s(int i10) {
        if (i10 >= 0) {
            if (i10 <= this.f37449i0) {
                if (i10 > 0) {
                    int i11 = this.f37448h0;
                    int i12 = this.f37447Z;
                    int i13 = (i11 + i10) % i12;
                    Object[] objArr = this.f37446Y;
                    if (i11 > i13) {
                        q.d3(i11, i12, null, objArr);
                        q.d3(0, i13, null, objArr);
                    } else {
                        q.d3(i11, i13, null, objArr);
                    }
                    this.f37448h0 = i13;
                    this.f37449i0 -= i10;
                    return;
                }
                return;
            }
            StringBuilder q10 = android.gov.nist.core.a.q("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            q10.append(this.f37449i0);
            throw new IllegalArgumentException(q10.toString().toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("n shouldn't be negative but it is ", i10).toString());
    }

    @Override // kf.AbstractC4276a, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        AbstractC3557B.c0("array", objArr);
        int length = objArr.length;
        int i10 = this.f37449i0;
        if (length < i10) {
            objArr = Arrays.copyOf(objArr, i10);
            AbstractC3557B.b0("copyOf(...)", objArr);
        }
        int i11 = this.f37449i0;
        int i12 = this.f37448h0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr2 = this.f37446Y;
            if (i14 >= i11 || i12 >= this.f37447Z) {
                break;
            }
            objArr[i14] = objArr2[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            objArr[i14] = objArr2[i13];
            i14++;
            i13++;
        }
        if (i11 < objArr.length) {
            objArr[i11] = null;
        }
        return objArr;
    }

    @Override // kf.AbstractC4276a, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[r()]);
    }
}
