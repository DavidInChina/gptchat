package com.google.protobuf;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v1 {

    /* renamed from: f  reason: collision with root package name */
    public static final v1 f27627f = new v1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f27628a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f27629b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f27630c;

    /* renamed from: d  reason: collision with root package name */
    public int f27631d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27632e;

    public v1() {
        this(0, new int[8], new Object[8], true);
    }

    public static v1 e(v1 v1Var, v1 v1Var2) {
        int i10 = v1Var.f27628a + v1Var2.f27628a;
        int[] copyOf = Arrays.copyOf(v1Var.f27629b, i10);
        System.arraycopy(v1Var2.f27629b, 0, copyOf, v1Var.f27628a, v1Var2.f27628a);
        Object[] copyOf2 = Arrays.copyOf(v1Var.f27630c, i10);
        System.arraycopy(v1Var2.f27630c, 0, copyOf2, v1Var.f27628a, v1Var2.f27628a);
        return new v1(i10, copyOf, copyOf2, true);
    }

    public final void a() {
        if (this.f27632e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void b(int i10) {
        int[] iArr = this.f27629b;
        if (i10 > iArr.length) {
            int i11 = this.f27628a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f27629b = Arrays.copyOf(iArr, i10);
            this.f27630c = Arrays.copyOf(this.f27630c, i10);
        }
    }

    public final int c() {
        int r02;
        int i10 = this.f27631d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f27628a; i12++) {
            int i13 = this.f27629b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.f27630c[i12]).getClass();
                                r02 = AbstractC2549y.b0(i14);
                            } else {
                                throw new IllegalStateException(C2540t0.c());
                            }
                        } else {
                            i11 = ((v1) this.f27630c[i12]).c() + (AbstractC2549y.o0(i14) * 2) + i11;
                        }
                    } else {
                        r02 = AbstractC2549y.X(i14, (AbstractC2534q) this.f27630c[i12]);
                    }
                } else {
                    ((Long) this.f27630c[i12]).getClass();
                    r02 = AbstractC2549y.c0(i14);
                }
            } else {
                r02 = AbstractC2549y.r0(i14, ((Long) this.f27630c[i12]).longValue());
            }
            i11 = r02 + i11;
        }
        this.f27631d = i11;
        return i11;
    }

    public final boolean d(int i10, AbstractC2543v abstractC2543v) {
        int F10;
        a();
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                f(i10, Integer.valueOf(abstractC2543v.q()));
                                return true;
                            }
                            throw C2540t0.c();
                        }
                        return false;
                    }
                    v1 v1Var = new v1();
                    do {
                        F10 = abstractC2543v.F();
                        if (F10 == 0) {
                            break;
                        }
                    } while (v1Var.d(F10, abstractC2543v));
                    abstractC2543v.a((i11 << 3) | 4);
                    f(i10, v1Var);
                    return true;
                }
                f(i10, abstractC2543v.n());
                return true;
            }
            f(i10, Long.valueOf(abstractC2543v.r()));
            return true;
        }
        f(i10, Long.valueOf(abstractC2543v.v()));
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        int i10 = this.f27628a;
        if (i10 == v1Var.f27628a) {
            int[] iArr = this.f27629b;
            int[] iArr2 = v1Var.f27629b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.f27630c;
                    Object[] objArr2 = v1Var.f27630c;
                    int i12 = this.f27628a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(int i10, Object obj) {
        a();
        b(this.f27628a + 1);
        int[] iArr = this.f27629b;
        int i11 = this.f27628a;
        iArr[i11] = i10;
        this.f27630c[i11] = obj;
        this.f27628a = i11 + 1;
    }

    public final void g(S4.o oVar) {
        if (this.f27628a == 0) {
            return;
        }
        oVar.getClass();
        for (int i10 = 0; i10 < this.f27628a; i10++) {
            int i11 = this.f27629b[i10];
            Object obj = this.f27630c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                oVar.u(i12, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(C2540t0.c());
                            }
                        } else {
                            ((AbstractC2549y) oVar.f16184Z).M0(i12, 3);
                            ((v1) obj).g(oVar);
                            ((AbstractC2549y) oVar.f16184Z).M0(i12, 4);
                        }
                    } else {
                        oVar.r(i12, (AbstractC2534q) obj);
                    }
                } else {
                    oVar.v(i12, ((Long) obj).longValue());
                }
            } else {
                oVar.z(i12, ((Long) obj).longValue());
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f27628a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f27629b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f27630c;
        int i16 = this.f27628a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public v1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f27631d = -1;
        this.f27628a = i10;
        this.f27629b = iArr;
        this.f27630c = objArr;
        this.f27632e = z10;
    }
}
