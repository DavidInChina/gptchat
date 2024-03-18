package d0;

import Ng.H;
import c0.AbstractC2274d;
import com.google.android.gms.internal.play_billing.N;
import g0.C3135b;
import id.AbstractC3557B;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kf.AbstractC4276a;
import kf.AbstractC4283h;
import kf.q;
import nf.AbstractC4828h;
import xf.AbstractC6439b;

/* loaded from: classes.dex */
public final class f extends AbstractC4283h implements Collection, AbstractC6439b {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC2274d f27825Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object[] f27826Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object[] f27827h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f27828i0;

    /* renamed from: j0  reason: collision with root package name */
    public C3135b f27829j0 = new Object();

    /* renamed from: k0  reason: collision with root package name */
    public Object[] f27830k0;

    /* renamed from: l0  reason: collision with root package name */
    public Object[] f27831l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f27832m0;

    /* JADX WARN: Type inference failed for: r4v1, types: [g0.b, java.lang.Object] */
    public f(AbstractC2274d abstractC2274d, Object[] objArr, Object[] objArr2, int i10) {
        this.f27825Y = abstractC2274d;
        this.f27826Z = objArr;
        this.f27827h0 = objArr2;
        this.f27828i0 = i10;
        this.f27830k0 = objArr;
        this.f27831l0 = objArr2;
        this.f27832m0 = ((AbstractC4276a) abstractC2274d).size();
    }

    public static void I(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final Object[] B0(int i10, int i11, Object[] objArr) {
        if (i11 >= 0) {
            if (i11 == 0) {
                return objArr;
            }
            int s10 = H.s(i10, i11);
            Object obj = objArr[s10];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            Object B02 = B0(i10, i11 - 5, (Object[]) obj);
            if (s10 < 31) {
                int i12 = s10 + 1;
                if (objArr[i12] != null) {
                    if (i0(objArr)) {
                        q.d3(i12, 32, null, objArr);
                    }
                    Object[] u02 = u0();
                    q.W2(0, 0, i12, objArr, u02);
                    objArr = u02;
                }
            }
            if (B02 != objArr[s10]) {
                Object[] q02 = q0(objArr);
                q02[s10] = B02;
                return q02;
            }
            return objArr;
        }
        throw new IllegalArgumentException("shift should be positive".toString());
    }

    public final Object[] D0(Object[] objArr, int i10, int i11, J0.a aVar) {
        Object[] objArr2;
        int s10 = H.s(i11 - 1, i10);
        if (i10 == 5) {
            aVar.f8729Y = objArr[s10];
            objArr2 = null;
        } else {
            Object obj = objArr[s10];
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArr2 = D0((Object[]) obj, i10 - 5, i11, aVar);
        }
        if (objArr2 == null && s10 == 0) {
            return null;
        }
        Object[] q02 = q0(objArr);
        q02[s10] = objArr2;
        return q02;
    }

    public final void E0(int i10, int i11, Object[] objArr) {
        if (i11 == 0) {
            this.f27830k0 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f27831l0 = objArr;
            this.f27832m0 = i10;
            this.f27828i0 = i11;
            return;
        }
        J0.a aVar = new J0.a((Object) null);
        AbstractC3557B.Z(objArr);
        Object[] D02 = D0(objArr, i11, i10, aVar);
        AbstractC3557B.Z(D02);
        Object obj = aVar.f8729Y;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        this.f27831l0 = (Object[]) obj;
        this.f27832m0 = i10;
        if (D02[1] == null) {
            this.f27830k0 = (Object[]) D02[0];
            this.f27828i0 = i11 - 5;
            return;
        }
        this.f27830k0 = D02;
        this.f27828i0 = i11;
    }

    public final Object[] F0(Object[] objArr, int i10, int i11, Iterator it) {
        if (it.hasNext()) {
            if (i11 >= 0) {
                if (i11 == 0) {
                    return (Object[]) it.next();
                }
                Object[] q02 = q0(objArr);
                int s10 = H.s(i10, i11);
                int i12 = i11 - 5;
                q02[s10] = F0((Object[]) q02[s10], i10, i12, it);
                while (true) {
                    s10++;
                    if (s10 >= 32 || !it.hasNext()) {
                        break;
                    }
                    q02[s10] = F0((Object[]) q02[s10], 0, i12, it);
                }
                return q02;
            }
            throw new IllegalArgumentException("negative shift".toString());
        }
        throw new IllegalArgumentException("invalid buffersIterator".toString());
    }

    public final Object[] H0(Object[] objArr, int i10, Object[][] objArr2) {
        Object[] objArr3;
        Iterator f02 = N.f0(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f27828i0;
        if (i11 < (1 << i12)) {
            objArr3 = F0(objArr, i10, i12, f02);
        } else {
            objArr3 = q0(objArr);
        }
        while (f02.hasNext()) {
            this.f27828i0 += 5;
            objArr3 = v0(objArr3);
            int i13 = this.f27828i0;
            F0(objArr3, 1 << i13, i13, f02);
        }
        return objArr3;
    }

    public final void L0(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f27832m0;
        int i11 = i10 >> 5;
        int i12 = this.f27828i0;
        if (i11 > (1 << i12)) {
            this.f27830k0 = M0(this.f27828i0 + 5, v0(objArr), objArr2);
            this.f27831l0 = objArr3;
            this.f27828i0 += 5;
            this.f27832m0++;
        } else if (objArr == null) {
            this.f27830k0 = objArr2;
            this.f27831l0 = objArr3;
            this.f27832m0 = i10 + 1;
        } else {
            this.f27830k0 = M0(i12, objArr, objArr2);
            this.f27831l0 = objArr3;
            this.f27832m0++;
        }
    }

    public final int M() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] M0(int i10, Object[] objArr, Object[] objArr2) {
        int s10 = H.s(r() - 1, i10);
        Object[] q02 = q0(objArr);
        if (i10 == 5) {
            q02[s10] = objArr2;
        } else {
            q02[s10] = M0(i10 - 5, (Object[]) q02[s10], objArr2);
        }
        return q02;
    }

    public final int N0(C2564b c2564b, Object[] objArr, int i10, int i11, J0.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        Object[] u02;
        if (i0(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f8729Y;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) c2564b.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    if (!arrayList.isEmpty()) {
                        u02 = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        u02 = u0();
                    }
                    objArr3 = u02;
                    i11 = 0;
                }
                objArr3[i11] = obj2;
                i11++;
            }
        }
        aVar.f8729Y = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int O0(C2564b c2564b, Object[] objArr, int i10, J0.a aVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) c2564b.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = q0(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        aVar.f8729Y = objArr2;
        return i11;
    }

    public final int S0(C2564b c2564b, int i10, J0.a aVar) {
        int O02 = O0(c2564b, this.f27831l0, i10, aVar);
        if (O02 == i10) {
            return i10;
        }
        Object obj = aVar.f8729Y;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
        Object[] objArr = (Object[]) obj;
        q.d3(O02, i10, null, objArr);
        this.f27831l0 = objArr;
        this.f27832m0 -= i10 - O02;
        return O02;
    }

    public final void T(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f27830k0 != null) {
            int i13 = i10 >> 5;
            AbstractC2563a m02 = m0(e1() >> 5);
            int i14 = i12;
            Object[] objArr3 = objArr2;
            while (m02.f27816Y - 1 != i13) {
                Object[] objArr4 = (Object[]) m02.previous();
                q.W2(0, 32 - i11, 32, objArr4, objArr3);
                objArr3 = r0(i11, objArr4);
                i14--;
                objArr[i14] = objArr3;
            }
            Object[] objArr5 = (Object[]) m02.previous();
            int e12 = i12 - (((e1() >> 5) - 1) - i13);
            if (e12 < i12) {
                objArr2 = objArr[e12];
                AbstractC3557B.Z(objArr2);
            }
            g1(collection, i10, objArr5, 32, objArr, e12, objArr2);
            return;
        }
        throw new IllegalStateException("root is null".toString());
    }

    public final Object[] U(Object[] objArr, int i10, int i11, Object obj, J0.a aVar) {
        Object obj2;
        int s10 = H.s(i11, i10);
        if (i10 == 0) {
            aVar.f8729Y = objArr[31];
            Object[] q02 = q0(objArr);
            q.W2(s10 + 1, s10, 31, objArr, q02);
            q02[s10] = obj;
            return q02;
        }
        Object[] q03 = q0(objArr);
        int i12 = i10 - 5;
        Object obj3 = q03[s10];
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        q03[s10] = U((Object[]) obj3, i12, i11, obj, aVar);
        while (true) {
            s10++;
            if (s10 >= 32 || (obj2 = q03[s10]) == null) {
                break;
            }
            q03[s10] = U((Object[]) obj2, i12, 0, aVar.f8729Y, aVar);
        }
        return q03;
    }

    public final void V(int i10, Object obj, Object[] objArr) {
        int h12 = h1();
        Object[] q02 = q0(this.f27831l0);
        if (h12 < 32) {
            q.W2(i10 + 1, i10, h12, this.f27831l0, q02);
            q02[i10] = obj;
            this.f27830k0 = objArr;
            this.f27831l0 = q02;
            this.f27832m0++;
            return;
        }
        Object[] objArr2 = this.f27831l0;
        Object obj2 = objArr2[31];
        q.W2(i10 + 1, i10, 31, objArr2, q02);
        q02[i10] = obj;
        L0(objArr, q02, v0(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (S0(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V0(C2564b c2564b) {
        Object[] objArr;
        int i10;
        int h12 = h1();
        Object[] objArr2 = null;
        J0.a aVar = new J0.a((Object) null);
        boolean z10 = false;
        if (this.f27830k0 != null) {
            AbstractC2563a m02 = m0(0);
            int i11 = 32;
            int i12 = 32;
            while (i12 == 32 && m02.hasNext()) {
                i12 = O0(c2564b, (Object[]) m02.next(), 32, aVar);
            }
            if (i12 == 32) {
                int S02 = S0(c2564b, h12, aVar);
                if (S02 == 0) {
                    E0(this.f27832m0, this.f27828i0, this.f27830k0);
                }
            } else {
                int i13 = (m02.f27816Y - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i14 = i12;
                while (m02.hasNext()) {
                    i14 = N0(c2564b, (Object[]) m02.next(), 32, i14, aVar, arrayList2, arrayList);
                    i13 = i13;
                    i11 = i11;
                }
                int i15 = i13;
                int N02 = N0(c2564b, this.f27831l0, h12, i14, aVar, arrayList2, arrayList);
                Object obj = aVar.f8729Y;
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                Object[] objArr3 = (Object[]) obj;
                q.d3(N02, i11, null, objArr3);
                if (arrayList.isEmpty()) {
                    objArr = this.f27830k0;
                    AbstractC3557B.Z(objArr);
                } else {
                    objArr = F0(this.f27830k0, i15, this.f27828i0, arrayList.iterator());
                }
                int size = i15 + (arrayList.size() << 5);
                if ((size & 31) == 0) {
                    if (size == 0) {
                        this.f27828i0 = 0;
                    } else {
                        int i16 = size - 1;
                        while (true) {
                            i10 = this.f27828i0;
                            if ((i16 >> i10) != 0) {
                                break;
                            }
                            this.f27828i0 = i10 - 5;
                            Object obj2 = objArr[0];
                            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                            objArr = (Object[]) obj2;
                        }
                        objArr2 = B0(i16, i10, objArr);
                    }
                    this.f27830k0 = objArr2;
                    this.f27831l0 = objArr3;
                    this.f27832m0 = size + N02;
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("invalid size".toString());
                }
            }
            if (z10) {
                ((AbstractList) this).modCount++;
            }
            return z10;
        }
    }

    public final Object[] W0(Object[] objArr, int i10, int i11, J0.a aVar) {
        int s10 = H.s(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            Object obj = objArr[s10];
            Object[] q02 = q0(objArr);
            q.W2(s10, s10 + 1, 32, objArr, q02);
            q02[31] = aVar.f8729Y;
            aVar.f8729Y = obj;
            return q02;
        }
        if (objArr[31] == null) {
            i12 = H.s(e1() - 1, i10);
        }
        Object[] q03 = q0(objArr);
        int i13 = i10 - 5;
        int i14 = s10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj2 = q03[i12];
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
                q03[i12] = W0((Object[]) obj2, i13, 0, aVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj3 = q03[s10];
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj3);
        q03[s10] = W0((Object[]) obj3, i13, i11, aVar);
        return q03;
    }

    public final Object Z0(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.f27832m0 - i10;
        if (i13 == 1) {
            Object obj = this.f27831l0[0];
            E0(i10, i11, objArr);
            return obj;
        }
        Object[] objArr2 = this.f27831l0;
        Object obj2 = objArr2[i12];
        Object[] q02 = q0(objArr2);
        q.W2(i12, i12 + 1, i13, objArr2, q02);
        q02[i13 - 1] = null;
        this.f27830k0 = objArr;
        this.f27831l0 = q02;
        this.f27832m0 = (i10 + i13) - 1;
        this.f27828i0 = i11;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        AbstractC4828h.w(i10, r());
        if (i10 == r()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int e12 = e1();
        if (i10 >= e12) {
            V(i10 - e12, obj, this.f27830k0);
            return;
        }
        J0.a aVar = new J0.a((Object) null);
        Object[] objArr = this.f27830k0;
        AbstractC3557B.Z(objArr);
        V(0, aVar.f8729Y, U(objArr, this.f27828i0, i10, obj, aVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        Object[] objArr;
        AbstractC4828h.w(i10, this.f27832m0);
        if (i10 == this.f27832m0) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.f27832m0 - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            Object[] objArr2 = this.f27831l0;
            Object[] q02 = q0(objArr2);
            q.W2((((collection.size() + i10) - 1) & 31) + 1, i12, h1(), objArr2, q02);
            I(q02, i12, collection.iterator());
            this.f27831l0 = q02;
            this.f27832m0 = collection.size() + this.f27832m0;
            return true;
        }
        Object[][] objArr3 = new Object[size];
        int h12 = h1();
        int size2 = collection.size() + this.f27832m0;
        if (size2 > 32) {
            size2 -= (size2 - 1) & (-32);
        }
        if (i10 >= e1()) {
            objArr = u0();
            g1(collection, i10, this.f27831l0, h12, objArr3, size, objArr);
        } else if (size2 > h12) {
            int i13 = size2 - h12;
            objArr = r0(i13, this.f27831l0);
            T(collection, i10, i13, objArr3, size, objArr);
        } else {
            Object[] objArr4 = this.f27831l0;
            objArr = u0();
            int i14 = h12 - size2;
            q.W2(0, i14, h12, objArr4, objArr);
            int i15 = 32 - i14;
            Object[] r02 = r0(i15, this.f27831l0);
            int i16 = size - 1;
            objArr3[i16] = r02;
            T(collection, i10, i15, objArr3, i16, r02);
        }
        this.f27830k0 = H0(this.f27830k0, i11, objArr3);
        this.f27831l0 = objArr;
        this.f27832m0 = collection.size() + this.f27832m0;
        return true;
    }

    public final int e1() {
        int i10 = this.f27832m0;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] f1(Object[] objArr, int i10, int i11, Object obj, J0.a aVar) {
        int s10 = H.s(i11, i10);
        Object[] q02 = q0(objArr);
        if (i10 == 0) {
            if (q02 != objArr) {
                ((AbstractList) this).modCount++;
            }
            aVar.f8729Y = q02[s10];
            q02[s10] = obj;
            return q02;
        }
        Object obj2 = q02[s10];
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj2);
        q02[s10] = f1((Object[]) obj2, i10 - 5, i11, obj, aVar);
        return q02;
    }

    public final void g1(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArr4;
        if (i12 >= 1) {
            Object[] q02 = q0(objArr);
            objArr2[0] = q02;
            int i13 = i10 & 31;
            int size = ((collection.size() + i10) - 1) & 31;
            int i14 = (i11 - i13) + size;
            if (i14 < 32) {
                q.W2(size + 1, i13, i11, q02, objArr3);
            } else {
                int i15 = i14 - 31;
                if (i12 == 1) {
                    objArr4 = q02;
                } else {
                    objArr4 = u0();
                    i12--;
                    objArr2[i12] = objArr4;
                }
                int i16 = i11 - i15;
                q.W2(0, i16, i11, q02, objArr3);
                q.W2(size + 1, i13, i16, q02, objArr4);
                objArr3 = objArr4;
            }
            Iterator it = collection.iterator();
            I(q02, i13, it);
            for (int i17 = 1; i17 < i12; i17++) {
                Object[] u02 = u0();
                I(u02, 0, it);
                objArr2[i17] = u02;
            }
            I(objArr3, 0, it);
            return;
        }
        throw new IllegalArgumentException("requires at least one nullBuffer".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        Object[] objArr;
        AbstractC4828h.v(i10, r());
        if (e1() <= i10) {
            objArr = this.f27831l0;
        } else {
            objArr = this.f27830k0;
            AbstractC3557B.Z(objArr);
            for (int i11 = this.f27828i0; i11 > 0; i11 -= 5) {
                Object obj = objArr[H.s(i10, i11)];
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
                objArr = (Object[]) obj;
            }
        }
        return objArr[i10 & 31];
    }

    public final int h1() {
        int i10 = this.f27832m0;
        if (i10 > 32) {
            return i10 - ((i10 - 1) & (-32));
        }
        return i10;
    }

    public final boolean i0(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f27829j0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final AbstractC2563a m0(int i10) {
        Object[] objArr = this.f27830k0;
        if (objArr != null) {
            int e12 = e1() >> 5;
            AbstractC4828h.w(i10, e12);
            int i11 = this.f27828i0;
            if (i11 == 0) {
                return new i(i10, objArr);
            }
            return new k(objArr, i10, e12, i11 / 5);
        }
        throw new IllegalStateException("Invalid root".toString());
    }

    public final Object[] q0(Object[] objArr) {
        if (objArr == null) {
            return u0();
        }
        if (i0(objArr)) {
            return objArr;
        }
        Object[] u02 = u0();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        q.a3(objArr, u02, 0, length, 6);
        return u02;
    }

    @Override // kf.AbstractC4283h
    public final int r() {
        return this.f27832m0;
    }

    public final Object[] r0(int i10, Object[] objArr) {
        if (i0(objArr)) {
            q.W2(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] u02 = u0();
        q.W2(i10, 0, 32 - i10, objArr, u02);
        return u02;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return V0(new C2564b(1, collection));
    }

    @Override // kf.AbstractC4283h
    public final Object s(int i10) {
        AbstractC4828h.v(i10, r());
        ((AbstractList) this).modCount++;
        int e12 = e1();
        if (i10 >= e12) {
            return Z0(this.f27830k0, e12, this.f27828i0, i10 - e12);
        }
        J0.a aVar = new J0.a(this.f27831l0[0]);
        Object[] objArr = this.f27830k0;
        AbstractC3557B.Z(objArr);
        Z0(W0(objArr, this.f27828i0, i10, aVar), e12, this.f27828i0, 0);
        return aVar.f8729Y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC4828h.v(i10, r());
        if (e1() <= i10) {
            Object[] q02 = q0(this.f27831l0);
            if (q02 != this.f27831l0) {
                ((AbstractList) this).modCount++;
            }
            int i11 = i10 & 31;
            Object obj2 = q02[i11];
            q02[i11] = obj;
            this.f27831l0 = q02;
            return obj2;
        }
        J0.a aVar = new J0.a((Object) null);
        Object[] objArr = this.f27830k0;
        AbstractC3557B.Z(objArr);
        this.f27830k0 = f1(objArr, this.f27828i0, i10, obj, aVar);
        return aVar.f8729Y;
    }

    public final Object[] u0() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f27829j0;
        return objArr;
    }

    public final Object[] v0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f27829j0;
        return objArr;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [g0.b, java.lang.Object] */
    public final AbstractC2274d y() {
        AbstractC2274d abstractC2274d;
        Object[] objArr = this.f27830k0;
        if (objArr == this.f27826Z && this.f27831l0 == this.f27827h0) {
            abstractC2274d = this.f27825Y;
        } else {
            this.f27829j0 = new Object();
            this.f27826Z = objArr;
            Object[] objArr2 = this.f27831l0;
            this.f27827h0 = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    abstractC2274d = j.f27840Z;
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f27831l0, r());
                    AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
                    abstractC2274d = new j(copyOf);
                }
            } else {
                AbstractC3557B.Z(objArr);
                abstractC2274d = new e(r(), this.f27828i0, objArr, this.f27831l0);
            }
        }
        this.f27825Y = abstractC2274d;
        return abstractC2274d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        AbstractC4828h.w(i10, r());
        return new h(this, i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int h12 = h1();
        if (h12 < 32) {
            Object[] q02 = q0(this.f27831l0);
            q02[h12] = obj;
            this.f27831l0 = q02;
            this.f27832m0 = r() + 1;
        } else {
            L0(this.f27830k0, this.f27831l0, v0(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int h12 = h1();
        Iterator it = collection.iterator();
        if (32 - h12 >= collection.size()) {
            Object[] q02 = q0(this.f27831l0);
            I(q02, h12, it);
            this.f27831l0 = q02;
            this.f27832m0 = collection.size() + this.f27832m0;
        } else {
            int size = ((collection.size() + h12) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] q03 = q0(this.f27831l0);
            I(q03, h12, it);
            objArr[0] = q03;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] u02 = u0();
                I(u02, 0, it);
                objArr[i10] = u02;
            }
            this.f27830k0 = H0(this.f27830k0, e1(), objArr);
            Object[] u03 = u0();
            I(u03, 0, it);
            this.f27831l0 = u03;
            this.f27832m0 = collection.size() + this.f27832m0;
        }
        return true;
    }
}
