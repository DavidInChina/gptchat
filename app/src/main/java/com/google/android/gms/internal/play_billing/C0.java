package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: f  reason: collision with root package name */
    public static final C0 f26832f = new C0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f26833a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f26834b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f26835c;

    /* renamed from: d  reason: collision with root package name */
    public int f26836d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26837e;

    public C0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f26833a = i10;
        this.f26834b = iArr;
        this.f26835c = objArr;
        this.f26837e = z10;
    }

    public static C0 b() {
        return new C0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int D12;
        int E12;
        int D13;
        int i10 = this.f26836d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f26833a; i12++) {
                int i13 = this.f26834b[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 5) {
                                    ((Integer) this.f26835c[i12]).getClass();
                                    D13 = H.D1(i14 << 3) + 4;
                                } else {
                                    int i16 = C2437a0.f26896Y;
                                    throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int D14 = H.D1(i14 << 3);
                                D12 = D14 + D14;
                                E12 = ((C0) this.f26835c[i12]).a();
                            }
                        } else {
                            int D15 = H.D1(i14 << 3);
                            int I10 = ((E) this.f26835c[i12]).I();
                            i11 = H.D1(I10) + I10 + D15 + i11;
                        }
                    } else {
                        ((Long) this.f26835c[i12]).getClass();
                        D13 = H.D1(i14 << 3) + 8;
                    }
                    i11 = D13 + i11;
                } else {
                    int i17 = i14 << 3;
                    long longValue = ((Long) this.f26835c[i12]).longValue();
                    D12 = H.D1(i17);
                    E12 = H.E1(longValue);
                }
                i11 = E12 + D12 + i11;
            }
            this.f26836d = i11;
            return i11;
        }
        return i10;
    }

    public final void c(int i10, Object obj) {
        if (this.f26837e) {
            e(this.f26833a + 1);
            int[] iArr = this.f26834b;
            int i11 = this.f26833a;
            iArr[i11] = i10;
            this.f26835c[i11] = obj;
            this.f26833a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(I i10) {
        if (this.f26833a != 0) {
            for (int i11 = 0; i11 < this.f26833a; i11++) {
                int i12 = this.f26834b[i11];
                Object obj = this.f26835c[i11];
                int i13 = i12 & 7;
                int i14 = i12 >>> 3;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 5) {
                                    i10.k(i14, ((Integer) obj).intValue());
                                } else {
                                    int i15 = C2437a0.f26896Y;
                                    throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                i10.f26849a.w1(i14, 3);
                                ((C0) obj).d(i10);
                                i10.f26849a.w1(i14, 4);
                            }
                        } else {
                            i10.g(i14, (E) obj);
                        }
                    } else {
                        i10.l(i14, ((Long) obj).longValue());
                    }
                } else {
                    i10.p(i14, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f26834b;
        if (i10 > iArr.length) {
            int i11 = this.f26833a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f26834b = Arrays.copyOf(iArr, i10);
            this.f26835c = Arrays.copyOf(this.f26835c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        int i10 = this.f26833a;
        if (i10 == c02.f26833a) {
            int[] iArr = this.f26834b;
            int[] iArr2 = c02.f26834b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.f26835c;
                    Object[] objArr2 = c02.f26835c;
                    int i12 = this.f26833a;
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

    public final int hashCode() {
        int i10 = this.f26833a;
        int i11 = i10 + 527;
        int[] iArr = this.f26834b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = ((i11 * 31) + i13) * 31;
        Object[] objArr = this.f26835c;
        int i16 = this.f26833a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
