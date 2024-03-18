package e0;

import M3.H;
import com.google.android.gms.internal.play_billing.N;
import g0.C3134a;
import g0.C3135b;
import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: e0.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2755r {

    /* renamed from: e  reason: collision with root package name */
    public static final C2755r f28710e = new C2755r(0, 0, new Object[0], null);

    /* renamed from: a  reason: collision with root package name */
    public int f28711a;

    /* renamed from: b  reason: collision with root package name */
    public int f28712b;

    /* renamed from: c  reason: collision with root package name */
    public final C3135b f28713c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f28714d;

    public C2755r(int i10, int i11, Object[] objArr, C3135b c3135b) {
        this.f28711a = i10;
        this.f28712b = i11;
        this.f28713c = c3135b;
        this.f28714d = objArr;
    }

    public static C2755r j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C3135b c3135b) {
        if (i12 > 30) {
            return new C2755r(0, 0, new Object[]{obj, obj2, obj3, obj4}, c3135b);
        }
        int Z10 = H.Z(i10, i12);
        int Z11 = H.Z(i11, i12);
        if (Z10 != Z11) {
            return new C2755r((1 << Z10) | (1 << Z11), 0, Z10 < Z11 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c3135b);
        }
        return new C2755r(0, 1 << Z10, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c3135b)}, c3135b);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, C3135b c3135b) {
        int i14;
        Object obj3 = this.f28714d[i10];
        if (obj3 != null) {
            i14 = obj3.hashCode();
        } else {
            i14 = 0;
        }
        C2755r j6 = j(i14, obj3, x(i10), i12, obj, obj2, i13 + 5, c3135b);
        int t10 = t(i11);
        int i15 = t10 + 1;
        Object[] objArr = this.f28714d;
        Object[] objArr2 = new Object[objArr.length - 1];
        kf.q.a3(objArr, objArr2, 0, i10, 6);
        kf.q.W2(i10, i10 + 2, i15, objArr, objArr2);
        objArr2[t10 - 1] = j6;
        kf.q.W2(t10, i15, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f28712b == 0) {
            return this.f28714d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f28711a);
        int length = this.f28714d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += s(i10).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        Cf.e z02 = N.z0(N.D0(0, this.f28714d.length), 2);
        int i10 = z02.f3106Y;
        int i11 = z02.f3107Z;
        int i12 = z02.f3108h0;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!AbstractC3557B.K(obj, this.f28714d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, Object obj, int i11) {
        int Z10 = 1 << H.Z(i10, i11);
        if (h(Z10)) {
            return AbstractC3557B.K(obj, this.f28714d[f(Z10)]);
        } else if (i(Z10)) {
            C2755r s10 = s(t(Z10));
            if (i11 == 30) {
                return s10.c(obj);
            }
            return s10.d(i10, obj, i11 + 5);
        } else {
            return false;
        }
    }

    public final boolean e(C2755r c2755r) {
        if (this == c2755r) {
            return true;
        }
        if (this.f28712b != c2755r.f28712b || this.f28711a != c2755r.f28711a) {
            return false;
        }
        int length = this.f28714d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f28714d[i10] != c2755r.f28714d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f28711a) * 2;
    }

    public final Object g(int i10, Object obj, int i11) {
        int Z10 = 1 << H.Z(i10, i11);
        if (h(Z10)) {
            int f6 = f(Z10);
            if (!AbstractC3557B.K(obj, this.f28714d[f6])) {
                return null;
            }
            return x(f6);
        } else if (!i(Z10)) {
            return null;
        } else {
            C2755r s10 = s(t(Z10));
            if (i11 == 30) {
                Cf.e z02 = N.z0(N.D0(0, s10.f28714d.length), 2);
                int i12 = z02.f3106Y;
                int i13 = z02.f3107Z;
                int i14 = z02.f3108h0;
                if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                    return null;
                }
                while (!AbstractC3557B.K(obj, s10.f28714d[i12])) {
                    if (i12 == i13) {
                        return null;
                    }
                    i12 += i14;
                }
                return s10.x(i12);
            }
            return s10.g(i10, obj, i11 + 5);
        }
    }

    public final boolean h(int i10) {
        if ((i10 & this.f28711a) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i10) {
        if ((i10 & this.f28712b) != 0) {
            return true;
        }
        return false;
    }

    public final C2755r k(int i10, C2743f c2743f) {
        c2743f.getClass();
        c2743f.b(c2743f.f28696k0 - 1);
        c2743f.f28694i0 = x(i10);
        Object[] objArr = this.f28714d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f28713c == c2743f.f28692Z) {
            this.f28714d = H.w(i10, objArr);
            return this;
        }
        return new C2755r(0, 0, H.w(i10, objArr), c2743f.f28692Z);
    }

    public final C2755r l(int i10, Object obj, Object obj2, int i11, C2743f c2743f) {
        C2755r c2755r;
        int Z10 = 1 << H.Z(i10, i11);
        boolean h10 = h(Z10);
        C3135b c3135b = this.f28713c;
        if (h10) {
            int f6 = f(Z10);
            if (AbstractC3557B.K(obj, this.f28714d[f6])) {
                c2743f.f28694i0 = x(f6);
                if (x(f6) == obj2) {
                    return this;
                }
                if (c3135b == c2743f.f28692Z) {
                    this.f28714d[f6 + 1] = obj2;
                    return this;
                }
                c2743f.f28695j0++;
                Object[] objArr = this.f28714d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                AbstractC3557B.b0("copyOf(this, size)", copyOf);
                copyOf[f6 + 1] = obj2;
                return new C2755r(this.f28711a, this.f28712b, copyOf, c2743f.f28692Z);
            }
            c2743f.getClass();
            c2743f.b(c2743f.f28696k0 + 1);
            C3135b c3135b2 = c2743f.f28692Z;
            if (c3135b == c3135b2) {
                this.f28714d = a(f6, Z10, i10, obj, obj2, i11, c3135b2);
                this.f28711a ^= Z10;
                this.f28712b |= Z10;
                return this;
            }
            return new C2755r(this.f28711a ^ Z10, this.f28712b | Z10, a(f6, Z10, i10, obj, obj2, i11, c3135b2), c3135b2);
        } else if (i(Z10)) {
            int t10 = t(Z10);
            C2755r s10 = s(t10);
            if (i11 == 30) {
                Cf.e z02 = N.z0(N.D0(0, s10.f28714d.length), 2);
                int i12 = z02.f3106Y;
                int i13 = z02.f3107Z;
                int i14 = z02.f3108h0;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!AbstractC3557B.K(obj, s10.f28714d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    c2743f.f28694i0 = s10.x(i12);
                    if (s10.f28713c == c2743f.f28692Z) {
                        s10.f28714d[i12 + 1] = obj2;
                        c2755r = s10;
                    } else {
                        c2743f.f28695j0++;
                        Object[] objArr2 = s10.f28714d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        AbstractC3557B.b0("copyOf(this, size)", copyOf2);
                        copyOf2[i12 + 1] = obj2;
                        c2755r = new C2755r(0, 0, copyOf2, c2743f.f28692Z);
                    }
                }
                c2743f.getClass();
                c2743f.b(c2743f.f28696k0 + 1);
                c2755r = new C2755r(0, 0, H.p(s10.f28714d, 0, obj, obj2), c2743f.f28692Z);
                break;
            }
            c2755r = s10.l(i10, obj, obj2, i11 + 5, c2743f);
            if (s10 == c2755r) {
                return this;
            }
            return r(t10, c2755r, c2743f.f28692Z);
        } else {
            c2743f.getClass();
            c2743f.b(c2743f.f28696k0 + 1);
            C3135b c3135b3 = c2743f.f28692Z;
            int f10 = f(Z10);
            if (c3135b == c3135b3) {
                this.f28714d = H.p(this.f28714d, f10, obj, obj2);
                this.f28711a |= Z10;
                return this;
            }
            return new C2755r(this.f28711a | Z10, this.f28712b, H.p(this.f28714d, f10, obj, obj2), c3135b3);
        }
    }

    public final C2755r m(C2755r c2755r, int i10, C3134a c3134a, C2743f c2743f) {
        C2755r c2755r2;
        int i11;
        Object[] objArr;
        int i12;
        C2755r c2755r3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (this == c2755r) {
            c3134a.f31014a += b();
            return this;
        }
        int i18 = 0;
        if (i10 > 30) {
            C3135b c3135b = c2743f.f28692Z;
            Object[] objArr2 = this.f28714d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + c2755r.f28714d.length);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            int length = this.f28714d.length;
            Cf.e z02 = N.z0(N.D0(0, c2755r.f28714d.length), 2);
            int i19 = z02.f3106Y;
            int i20 = z02.f3107Z;
            int i21 = z02.f3108h0;
            if ((i21 > 0 && i19 <= i20) || (i21 < 0 && i20 <= i19)) {
                while (true) {
                    if (!c(c2755r.f28714d[i19])) {
                        Object[] objArr3 = c2755r.f28714d;
                        copyOf[length] = objArr3[i19];
                        copyOf[length + 1] = objArr3[i19 + 1];
                        length += 2;
                    } else {
                        c3134a.f31014a++;
                    }
                    if (i19 == i20) {
                        break;
                    }
                    i19 += i21;
                }
            }
            if (length == this.f28714d.length) {
                return this;
            }
            if (length == c2755r.f28714d.length) {
                return c2755r;
            }
            if (length == copyOf.length) {
                return new C2755r(0, 0, copyOf, c3135b);
            }
            Object[] copyOf2 = Arrays.copyOf(copyOf, length);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            return new C2755r(0, 0, copyOf2, c3135b);
        }
        int i22 = this.f28712b | c2755r.f28712b;
        int i23 = this.f28711a;
        int i24 = c2755r.f28711a;
        int i25 = i23 & i24;
        int i26 = (i23 ^ i24) & (~i22);
        while (i25 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i25);
            if (AbstractC3557B.K(this.f28714d[f(lowestOneBit)], c2755r.f28714d[c2755r.f(lowestOneBit)])) {
                i26 |= lowestOneBit;
            } else {
                i22 |= lowestOneBit;
            }
            i25 ^= lowestOneBit;
        }
        if ((i22 & i26) == 0) {
            if (AbstractC3557B.K(this.f28713c, c2743f.f28692Z) && this.f28711a == i26 && this.f28712b == i22) {
                c2755r2 = this;
            } else {
                c2755r2 = new C2755r(i26, i22, new Object[Integer.bitCount(i22) + (Integer.bitCount(i26) * 2)], null);
            }
            int i27 = i22;
            int i28 = 0;
            while (i27 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i27);
                Object[] objArr4 = c2755r2.f28714d;
                int length2 = (objArr4.length - 1) - i28;
                if (i(lowestOneBit2)) {
                    c2755r3 = s(t(lowestOneBit2));
                    if (c2755r.i(lowestOneBit2)) {
                        c2755r3 = c2755r3.m(c2755r.s(c2755r.t(lowestOneBit2)), i10 + 5, c3134a, c2743f);
                    } else if (c2755r.h(lowestOneBit2)) {
                        int f6 = c2755r.f(lowestOneBit2);
                        Object obj = c2755r.f28714d[f6];
                        Object x10 = c2755r.x(f6);
                        int i29 = c2743f.f28696k0;
                        if (obj != null) {
                            i17 = obj.hashCode();
                        } else {
                            i17 = i18;
                        }
                        int i30 = i17;
                        objArr = objArr4;
                        i11 = i26;
                        i12 = lowestOneBit2;
                        c2755r3 = c2755r3.l(i30, obj, x10, i10 + 5, c2743f);
                        if (c2743f.f28696k0 == i29) {
                            c3134a.f31014a++;
                        }
                    }
                    objArr = objArr4;
                    i11 = i26;
                    i12 = lowestOneBit2;
                } else {
                    objArr = objArr4;
                    i11 = i26;
                    i12 = lowestOneBit2;
                    if (c2755r.i(i12)) {
                        c2755r3 = c2755r.s(c2755r.t(i12));
                        if (h(i12)) {
                            int f10 = f(i12);
                            Object obj2 = this.f28714d[f10];
                            if (obj2 != null) {
                                i15 = obj2.hashCode();
                            } else {
                                i15 = 0;
                            }
                            int i31 = i10 + 5;
                            if (c2755r3.d(i15, obj2, i31)) {
                                c3134a.f31014a++;
                            } else {
                                Object x11 = x(f10);
                                if (obj2 != null) {
                                    i16 = obj2.hashCode();
                                } else {
                                    i16 = 0;
                                }
                                c2755r3 = c2755r3.l(i16, obj2, x11, i31, c2743f);
                            }
                        }
                    } else {
                        int f11 = f(i12);
                        Object obj3 = this.f28714d[f11];
                        Object x12 = x(f11);
                        int f12 = c2755r.f(i12);
                        Object obj4 = c2755r.f28714d[f12];
                        Object x13 = c2755r.x(f12);
                        if (obj3 != null) {
                            i13 = obj3.hashCode();
                        } else {
                            i13 = 0;
                        }
                        if (obj4 != null) {
                            i14 = obj4.hashCode();
                        } else {
                            i14 = 0;
                        }
                        c2755r3 = j(i13, obj3, x12, i14, obj4, x13, i10 + 5, c2743f.f28692Z);
                    }
                }
                objArr[length2] = c2755r3;
                i28++;
                i27 ^= i12;
                i26 = i11;
                i18 = 0;
            }
            int i32 = 0;
            while (i26 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i26);
                int i33 = i32 * 2;
                if (!c2755r.h(lowestOneBit3)) {
                    int f13 = f(lowestOneBit3);
                    Object[] objArr5 = c2755r2.f28714d;
                    objArr5[i33] = this.f28714d[f13];
                    objArr5[i33 + 1] = x(f13);
                } else {
                    int f14 = c2755r.f(lowestOneBit3);
                    Object[] objArr6 = c2755r2.f28714d;
                    objArr6[i33] = c2755r.f28714d[f14];
                    objArr6[i33 + 1] = c2755r.x(f14);
                    if (h(lowestOneBit3)) {
                        c3134a.f31014a++;
                    }
                }
                i32++;
                i26 ^= lowestOneBit3;
            }
            if (e(c2755r2)) {
                return this;
            }
            if (c2755r.e(c2755r2)) {
                return c2755r;
            }
            return c2755r2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final C2755r n(int i10, Object obj, int i11, C2743f c2743f) {
        C2755r n10;
        int Z10 = 1 << H.Z(i10, i11);
        if (h(Z10)) {
            int f6 = f(Z10);
            if (AbstractC3557B.K(obj, this.f28714d[f6])) {
                return p(f6, Z10, c2743f);
            }
            return this;
        } else if (i(Z10)) {
            int t10 = t(Z10);
            C2755r s10 = s(t10);
            if (i11 == 30) {
                Cf.e z02 = N.z0(N.D0(0, s10.f28714d.length), 2);
                int i12 = z02.f3106Y;
                int i13 = z02.f3107Z;
                int i14 = z02.f3108h0;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!AbstractC3557B.K(obj, s10.f28714d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    n10 = s10.k(i12, c2743f);
                }
                n10 = s10;
                break;
            }
            n10 = s10.n(i10, obj, i11 + 5, c2743f);
            return q(s10, n10, t10, Z10, c2743f.f28692Z);
        } else {
            return this;
        }
    }

    public final C2755r o(int i10, Object obj, Object obj2, int i11, C2743f c2743f) {
        C2755r o10;
        int Z10 = 1 << H.Z(i10, i11);
        if (h(Z10)) {
            int f6 = f(Z10);
            if (!AbstractC3557B.K(obj, this.f28714d[f6]) || !AbstractC3557B.K(obj2, x(f6))) {
                return this;
            }
            return p(f6, Z10, c2743f);
        } else if (!i(Z10)) {
            return this;
        } else {
            int t10 = t(Z10);
            C2755r s10 = s(t10);
            if (i11 == 30) {
                Cf.e z02 = N.z0(N.D0(0, s10.f28714d.length), 2);
                int i12 = z02.f3106Y;
                int i13 = z02.f3107Z;
                int i14 = z02.f3108h0;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (AbstractC3557B.K(obj, s10.f28714d[i12]) && AbstractC3557B.K(obj2, s10.x(i12))) {
                            o10 = s10.k(i12, c2743f);
                            break;
                        } else if (i12 == i13) {
                            break;
                        } else {
                            i12 += i14;
                        }
                    }
                }
                o10 = s10;
            } else {
                o10 = s10.o(i10, obj, obj2, i11 + 5, c2743f);
            }
            return q(s10, o10, t10, Z10, c2743f.f28692Z);
        }
    }

    public final C2755r p(int i10, int i11, C2743f c2743f) {
        c2743f.getClass();
        c2743f.b(c2743f.f28696k0 - 1);
        c2743f.f28694i0 = x(i10);
        Object[] objArr = this.f28714d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f28713c == c2743f.f28692Z) {
            this.f28714d = H.w(i10, objArr);
            this.f28711a ^= i11;
            return this;
        }
        return new C2755r(i11 ^ this.f28711a, this.f28712b, H.w(i10, objArr), c2743f.f28692Z);
    }

    public final C2755r q(C2755r c2755r, C2755r c2755r2, int i10, int i11, C3135b c3135b) {
        C3135b c3135b2 = this.f28713c;
        if (c2755r2 == null) {
            Object[] objArr = this.f28714d;
            if (objArr.length == 1) {
                return null;
            }
            if (c3135b2 == c3135b) {
                this.f28714d = H.x(i10, objArr);
                this.f28712b ^= i11;
            } else {
                return new C2755r(this.f28711a, i11 ^ this.f28712b, H.x(i10, objArr), c3135b);
            }
        } else if (c3135b2 == c3135b || c2755r != c2755r2) {
            return r(i10, c2755r2, c3135b);
        }
        return this;
    }

    public final C2755r r(int i10, C2755r c2755r, C3135b c3135b) {
        Object[] objArr = this.f28714d;
        if (objArr.length == 1 && c2755r.f28714d.length == 2 && c2755r.f28712b == 0) {
            c2755r.f28711a = this.f28712b;
            return c2755r;
        } else if (this.f28713c == c3135b) {
            objArr[i10] = c2755r;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC3557B.b0("copyOf(this, size)", copyOf);
            copyOf[i10] = c2755r;
            return new C2755r(this.f28711a, this.f28712b, copyOf, c3135b);
        }
    }

    public final C2755r s(int i10) {
        Object obj = this.f28714d[i10];
        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>", obj);
        return (C2755r) obj;
    }

    public final int t(int i10) {
        return (this.f28714d.length - 1) - Integer.bitCount((i10 - 1) & this.f28712b);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2754q u(int i10, Object obj, Object obj2, int i11) {
        C2754q c2754q;
        int Z10 = 1 << H.Z(i10, i11);
        if (h(Z10)) {
            int f6 = f(Z10);
            if (AbstractC3557B.K(obj, this.f28714d[f6])) {
                if (x(f6) == obj2) {
                    return null;
                }
                Object[] objArr = this.f28714d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                AbstractC3557B.b0("copyOf(this, size)", copyOf);
                copyOf[f6 + 1] = obj2;
                return new C2754q(new C2755r(this.f28711a, this.f28712b, copyOf, null), 0);
            }
            return new C2754q(new C2755r(this.f28711a ^ Z10, this.f28712b | Z10, a(f6, Z10, i10, obj, obj2, i11, null), null), 1);
        } else if (i(Z10)) {
            int t10 = t(Z10);
            C2755r s10 = s(t10);
            if (i11 == 30) {
                Cf.e z02 = N.z0(N.D0(0, s10.f28714d.length), 2);
                int i12 = z02.f3106Y;
                int i13 = z02.f3107Z;
                int i14 = z02.f3108h0;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!AbstractC3557B.K(obj, s10.f28714d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    if (obj2 == s10.x(i12)) {
                        c2754q = null;
                    } else {
                        Object[] objArr2 = s10.f28714d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        AbstractC3557B.b0("copyOf(this, size)", copyOf2);
                        copyOf2[i12 + 1] = obj2;
                        c2754q = new C2754q(new C2755r(0, 0, copyOf2, null), 0);
                    }
                    if (c2754q == null) {
                        return null;
                    }
                }
                c2754q = new C2754q(new C2755r(0, 0, H.p(s10.f28714d, 0, obj, obj2), null), 1);
                if (c2754q == null) {
                }
            } else {
                c2754q = s10.u(i10, obj, obj2, i11 + 5);
                if (c2754q == null) {
                    return null;
                }
            }
            c2754q.f28708a = w(t10, Z10, c2754q.f28708a);
            return c2754q;
        } else {
            return new C2754q(new C2755r(this.f28711a | Z10, this.f28712b, H.p(this.f28714d, f(Z10), obj, obj2), null), 1);
        }
    }

    public final C2755r v(int i10, J0.a aVar, int i11) {
        C2755r c2755r;
        int Z10 = 1 << H.Z(i10, i11);
        if (h(Z10)) {
            int f6 = f(Z10);
            if (AbstractC3557B.K(aVar, this.f28714d[f6])) {
                Object[] objArr = this.f28714d;
                if (objArr.length == 2) {
                    return null;
                }
                return new C2755r(this.f28711a ^ Z10, this.f28712b, H.w(f6, objArr), null);
            }
            return this;
        } else if (i(Z10)) {
            int t10 = t(Z10);
            C2755r s10 = s(t10);
            if (i11 == 30) {
                Cf.e z02 = N.z0(N.D0(0, s10.f28714d.length), 2);
                int i12 = z02.f3106Y;
                int i13 = z02.f3107Z;
                int i14 = z02.f3108h0;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!AbstractC3557B.K(aVar, s10.f28714d[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    Object[] objArr2 = s10.f28714d;
                    if (objArr2.length == 2) {
                        c2755r = null;
                    } else {
                        c2755r = new C2755r(0, 0, H.w(i12, objArr2), null);
                    }
                }
                c2755r = s10;
                break;
            }
            c2755r = s10.v(i10, aVar, i11 + 5);
            if (c2755r == null) {
                Object[] objArr3 = this.f28714d;
                if (objArr3.length == 1) {
                    return null;
                }
                return new C2755r(this.f28711a, Z10 ^ this.f28712b, H.x(t10, objArr3), null);
            } else if (s10 != c2755r) {
                return w(t10, Z10, c2755r);
            } else {
                return this;
            }
        } else {
            return this;
        }
    }

    public final C2755r w(int i10, int i11, C2755r c2755r) {
        Object[] objArr = c2755r.f28714d;
        if (objArr.length == 2 && c2755r.f28712b == 0) {
            if (this.f28714d.length == 1) {
                c2755r.f28711a = this.f28712b;
                return c2755r;
            }
            int f6 = f(i11);
            Object[] objArr2 = this.f28714d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            kf.q.W2(i10 + 2, i10 + 1, objArr2.length, copyOf, copyOf);
            kf.q.W2(f6 + 2, f6, i10, copyOf, copyOf);
            copyOf[f6] = obj;
            copyOf[f6 + 1] = obj2;
            return new C2755r(this.f28711a ^ i11, i11 ^ this.f28712b, copyOf, null);
        }
        Object[] objArr3 = this.f28714d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
        copyOf2[i10] = c2755r;
        return new C2755r(this.f28711a, this.f28712b, copyOf2, null);
    }

    public final Object x(int i10) {
        return this.f28714d[i10 + 1];
    }
}
