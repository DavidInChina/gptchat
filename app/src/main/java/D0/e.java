package d0;

import Ng.H;
import c0.AbstractC2274d;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.ListIterator;
import kf.q;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class e extends AbstractC2565c {

    /* renamed from: Y  reason: collision with root package name */
    public final Object[] f27821Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object[] f27822Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f27823h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f27824i0;

    public e(int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f27821Y = objArr;
        this.f27822Z = objArr2;
        this.f27823h0 = i10;
        this.f27824i0 = i11;
        if (r() > 32) {
            int length = objArr2.length;
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + r()).toString());
    }

    public static Object[] M(Object[] objArr, int i10, int i11, J0.a aVar) {
        Object[] objArr2;
        int s10 = H.s(i11, i10);
        if (i10 == 5) {
            aVar.f8729Y = objArr[s10];
            objArr2 = null;
        } else {
            Object obj = objArr[s10];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArr2 = M((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArr2 == null && s10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        copyOf[s10] = objArr2;
        return copyOf;
    }

    public static Object[] q0(int i10, int i11, Object obj, Object[] objArr) {
        int s10 = H.s(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        if (i10 == 0) {
            copyOf[s10] = obj;
        } else {
            Object obj2 = copyOf[s10];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
            copyOf[s10] = q0(i10 - 5, i11, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    public static Object[] y(Object[] objArr, int i10, int i11, Object obj, J0.a aVar) {
        Object[] objArr2;
        int s10 = H.s(i11, i10);
        if (i10 == 0) {
            if (s10 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                AbstractC3557B.b0("copyOf(this, newSize)", objArr2);
            }
            q.W2(s10 + 1, s10, 31, objArr, objArr2);
            aVar.f8729Y = objArr[31];
            objArr2[s10] = obj;
            return objArr2;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        int i12 = i10 - 5;
        Object obj2 = objArr[s10];
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        copyOf[s10] = y((Object[]) obj2, i12, i11, obj, aVar);
        while (true) {
            s10++;
            if (s10 >= 32 || copyOf[s10] == null) {
                break;
            }
            Object obj3 = objArr[s10];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
            copyOf[s10] = y((Object[]) obj3, i12, 0, aVar.f8729Y, aVar);
        }
        return copyOf;
    }

    public final e I(int i10, Object obj, Object[] objArr) {
        int m02 = m0();
        int i11 = this.f27823h0;
        int i12 = i11 - m02;
        Object[] objArr2 = this.f27822Z;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        if (i12 < 32) {
            q.W2(i10 + 1, i10, i12, objArr2, copyOf);
            copyOf[i10] = obj;
            return new e(i11 + 1, this.f27824i0, objArr, copyOf);
        }
        Object obj2 = objArr2[31];
        q.W2(i10 + 1, i10, i12 - 1, objArr2, copyOf);
        copyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return T(objArr, copyOf, objArr3);
    }

    @Override // c0.AbstractC2274d
    public final AbstractC2274d P(C2564b c2564b) {
        f builder = builder();
        builder.V0(c2564b);
        return builder.y();
    }

    public final e T(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f27823h0;
        int i11 = i10 >> 5;
        int i12 = this.f27824i0;
        if (i11 > (1 << i12)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i13 = i12 + 5;
            return new e(i10 + 1, i13, U(i13, objArr4, objArr2), objArr3);
        }
        return new e(i10 + 1, i12, U(i12, objArr, objArr2), objArr3);
    }

    public final Object[] U(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int s10 = H.s(r() - 1, i10);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            AbstractC3557B.b0("copyOf(this, newSize)", objArr3);
        } else {
            objArr3 = new Object[32];
        }
        if (i10 == 5) {
            objArr3[s10] = objArr2;
        } else {
            objArr3[s10] = U(i10 - 5, (Object[]) objArr3[s10], objArr2);
        }
        return objArr3;
    }

    public final Object[] V(Object[] objArr, int i10, int i11, J0.a aVar) {
        Object[] objArr2;
        int s10 = H.s(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            if (s10 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                AbstractC3557B.b0("copyOf(this, newSize)", objArr2);
            }
            q.W2(s10, s10 + 1, 32, objArr, objArr2);
            objArr2[31] = aVar.f8729Y;
            aVar.f8729Y = objArr[s10];
            return objArr2;
        }
        if (objArr[31] == null) {
            i12 = H.s(m0() - 1, i10);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        int i13 = i10 - 5;
        int i14 = s10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj = copyOf[i12];
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                copyOf[i12] = V((Object[]) obj, i13, 0, aVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj2 = copyOf[s10];
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        copyOf[s10] = V((Object[]) obj2, i13, i11, aVar);
        return copyOf;
    }

    @Override // c0.AbstractC2274d
    public final AbstractC2274d Z(int i10) {
        AbstractC4828h.v(i10, this.f27823h0);
        int m02 = m0();
        Object[] objArr = this.f27821Y;
        int i11 = this.f27824i0;
        if (i10 >= m02) {
            return i0(objArr, m02, i11, i10 - m02);
        }
        return i0(V(objArr, i11, i10, new J0.a(this.f27822Z[0])), m02, i11, 0);
    }

    @Override // kf.AbstractC4276a, java.util.Collection, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d add(Object obj) {
        int m02 = m0();
        int i10 = this.f27823h0;
        int i11 = i10 - m02;
        Object[] objArr = this.f27821Y;
        Object[] objArr2 = this.f27822Z;
        if (i11 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            copyOf[i11] = obj;
            return new e(i10 + 1, this.f27824i0, objArr, copyOf);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return T(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        AbstractC4828h.v(i10, r());
        if (m0() <= i10) {
            objArr = this.f27822Z;
        } else {
            objArr = this.f27821Y;
            for (int i11 = this.f27824i0; i11 > 0; i11 -= 5) {
                Object obj = objArr[H.s(i10, i11)];
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final AbstractC2565c i0(Object[] objArr, int i10, int i11, int i12) {
        e eVar;
        int i13 = this.f27823h0 - i10;
        if (i13 == 1) {
            if (i11 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    AbstractC3557B.b0("copyOf(this, newSize)", objArr);
                }
                return new j(objArr);
            }
            J0.a aVar = new J0.a((Object) null);
            Object[] M10 = M(objArr, i11, i10 - 1, aVar);
            AbstractC3557B.Z(M10);
            Object obj = aVar.f8729Y;
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            Object[] objArr2 = (Object[]) obj;
            if (M10[1] == null) {
                Object obj2 = M10[0];
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                eVar = new e(i10, i11 - 5, (Object[]) obj2, objArr2);
            } else {
                eVar = new e(i10, i11, M10, objArr2);
            }
            return eVar;
        }
        Object[] objArr3 = this.f27822Z;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
        int i14 = i13 - 1;
        if (i12 < i14) {
            q.W2(i12, i12 + 1, i13, objArr3, copyOf);
        }
        copyOf[i14] = null;
        return new e((i10 + i13) - 1, i11, objArr, copyOf);
    }

    @Override // kf.AbstractC4280e, java.util.List
    public final ListIterator listIterator(int i10) {
        AbstractC4828h.w(i10, r());
        return new g(i10, r(), (this.f27824i0 / 5) + 1, this.f27821Y, this.f27822Z);
    }

    public final int m0() {
        return (this.f27823h0 - 1) & (-32);
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f27823h0;
    }

    /* renamed from: s */
    public final f builder() {
        return new f(this, this.f27821Y, this.f27822Z, this.f27824i0);
    }

    @Override // kf.AbstractC4280e, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d set(int i10, Object obj) {
        int i11 = this.f27823h0;
        AbstractC4828h.v(i10, i11);
        int m02 = m0();
        Object[] objArr = this.f27821Y;
        Object[] objArr2 = this.f27822Z;
        int i12 = this.f27824i0;
        if (m02 <= i10) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            copyOf[i10 & 31] = obj;
            return new e(i11, i12, objArr, copyOf);
        }
        return new e(i11, i12, q0(i12, i10, obj, objArr), objArr2);
    }

    @Override // kf.AbstractC4280e, java.util.List, c0.AbstractC2274d
    public final AbstractC2274d add(int i10, Object obj) {
        int i11 = this.f27823h0;
        AbstractC4828h.w(i10, i11);
        if (i10 == i11) {
            return add(obj);
        }
        int m02 = m0();
        Object[] objArr = this.f27821Y;
        if (i10 >= m02) {
            return I(i10 - m02, obj, objArr);
        }
        J0.a aVar = new J0.a((Object) null);
        return I(0, aVar.f8729Y, y(objArr, this.f27824i0, i10, obj, aVar));
    }
}
