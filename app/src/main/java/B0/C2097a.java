package b0;

import kf.q;

/* renamed from: b0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2097a {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f25554a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public Object[] f25555b = new Object[16];

    /* renamed from: c  reason: collision with root package name */
    public int f25556c;

    public final int a(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i10 = this.f25556c - 1;
        Object[] objArr = this.f25554a;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj2 = objArr[i12];
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i11 = i12 + 1;
            } else if (identityHashCode2 <= identityHashCode) {
                if (obj == obj2) {
                    return i12;
                } else {
                    Object[] objArr2 = this.f25554a;
                    int i13 = this.f25556c;
                    for (int i14 = i12 - 1; -1 < i14; i14--) {
                        Object obj3 = objArr2[i14];
                        if (obj3 != obj) {
                            if (System.identityHashCode(obj3) != identityHashCode) {
                                break;
                            }
                        } else {
                            return i14;
                        }
                    }
                    for (int i15 = i12 + 1; i15 < i13; i15++) {
                        Object obj4 = objArr2[i15];
                        if (obj4 != obj) {
                            if (System.identityHashCode(obj4) != identityHashCode) {
                                return -(i15 + 1);
                            }
                        } else {
                            return i15;
                        }
                    }
                    return -(i13 + 1);
                }
            } else {
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public final Object b(Object obj) {
        int a5 = a(obj);
        if (a5 >= 0) {
            return this.f25555b[a5];
        }
        return null;
    }

    public final void c(Object obj, C2099c c2099c) {
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3 = this.f25554a;
        Object[] objArr4 = this.f25555b;
        int i10 = this.f25556c;
        int a5 = a(obj);
        if (a5 >= 0) {
            objArr4[a5] = c2099c;
            return;
        }
        int i11 = -(a5 + 1);
        if (i10 == objArr3.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            objArr = new Object[i10 * 2];
        } else {
            objArr = objArr3;
        }
        int i12 = i11 + 1;
        q.W2(i12, i11, i10, objArr3, objArr);
        if (z10) {
            q.a3(objArr3, objArr, 0, i11, 6);
        }
        objArr[i11] = obj;
        this.f25554a = objArr;
        if (z10) {
            objArr2 = new Object[i10 * 2];
        } else {
            objArr2 = objArr4;
        }
        q.W2(i12, i11, i10, objArr4, objArr2);
        if (z10) {
            q.a3(objArr4, objArr2, 0, i11, 6);
        }
        objArr2[i11] = c2099c;
        this.f25555b = objArr2;
        this.f25556c++;
    }
}
