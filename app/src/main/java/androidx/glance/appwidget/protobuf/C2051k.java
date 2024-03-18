package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.glance.appwidget.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2051k extends AbstractC2053m {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f25228e;

    /* renamed from: f  reason: collision with root package name */
    public int f25229f;

    /* renamed from: g  reason: collision with root package name */
    public int f25230g;

    /* renamed from: h  reason: collision with root package name */
    public int f25231h;

    /* renamed from: i  reason: collision with root package name */
    public final int f25232i;

    /* renamed from: j  reason: collision with root package name */
    public int f25233j;

    /* renamed from: k  reason: collision with root package name */
    public int f25234k = Integer.MAX_VALUE;

    public C2051k(byte[] bArr, int i10, int i11, boolean z10) {
        this.f25228e = bArr;
        this.f25229f = i11 + i10;
        this.f25231h = i10;
        this.f25232i = i10;
    }

    public final int A() {
        int i10;
        int i11 = this.f25231h;
        int i12 = this.f25229f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f25228e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f25231h = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f25231h = i14;
                return i10;
            }
        }
        return (int) C();
    }

    public final long B() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f25231h;
        int i11 = this.f25229f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f25228e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f25231h = i12;
                return b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j6 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j6 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j12 = (-2080896) ^ i18;
                        } else {
                            long j13 = i18;
                            i13 = i10 + 5;
                            long j14 = j13 ^ (bArr[i17] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j15 = j14 ^ (bArr[i13] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j14 = j15 ^ (bArr[i17] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (bArr[i13] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j6 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j6 = j11 ^ j14;
                        }
                        i13 = i17;
                        j6 = j12;
                    }
                }
                this.f25231h = i13;
                return j6;
            }
        }
        return C();
    }

    public final long C() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f25231h;
            if (i11 != this.f25229f) {
                this.f25231h = i11 + 1;
                byte b10 = this.f25228e[i11];
                j6 |= (b10 & Byte.MAX_VALUE) << i10;
                if ((b10 & 128) == 0) {
                    return j6;
                }
            } else {
                throw C.e();
            }
        }
        throw C.c();
    }

    public final void D() {
        int i10 = this.f25229f + this.f25230g;
        this.f25229f = i10;
        int i11 = i10 - this.f25232i;
        int i12 = this.f25234k;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f25230g = i13;
            this.f25229f = i10 - i13;
            return;
        }
        this.f25230g = 0;
    }

    public final void E(int i10) {
        if (i10 >= 0) {
            int i11 = this.f25229f;
            int i12 = this.f25231h;
            if (i10 <= i11 - i12) {
                this.f25231h = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw C.d();
        }
        throw C.e();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final void a(int i10) {
        if (this.f25233j == i10) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int b() {
        return this.f25231h - this.f25232i;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final boolean c() {
        if (this.f25231h == this.f25229f) {
            return true;
        }
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final void d(int i10) {
        this.f25234k = i10;
        D();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int e(int i10) {
        if (i10 >= 0) {
            int b10 = b() + i10;
            if (b10 >= 0) {
                int i11 = this.f25234k;
                if (b10 <= i11) {
                    this.f25234k = b10;
                    D();
                    return i11;
                }
                throw C.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw C.d();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final boolean f() {
        if (B() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final C2050j g() {
        byte[] bArr;
        int A10 = A();
        byte[] bArr2 = this.f25228e;
        if (A10 > 0) {
            int i10 = this.f25229f;
            int i11 = this.f25231h;
            if (A10 <= i10 - i11) {
                C2050j s10 = AbstractC2049i.s(bArr2, i11, A10);
                this.f25231h += A10;
                return s10;
            }
        }
        if (A10 == 0) {
            return AbstractC2049i.f25223Z;
        }
        if (A10 > 0) {
            int i12 = this.f25229f;
            int i13 = this.f25231h;
            if (A10 <= i12 - i13) {
                int i14 = A10 + i13;
                this.f25231h = i14;
                bArr = Arrays.copyOfRange(bArr2, i13, i14);
                C2050j c2050j = AbstractC2049i.f25223Z;
                return new C2050j(bArr);
            }
        }
        if (A10 <= 0) {
            if (A10 == 0) {
                bArr = A.f25145b;
                C2050j c2050j2 = AbstractC2049i.f25223Z;
                return new C2050j(bArr);
            }
            throw C.d();
        }
        throw C.e();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int i() {
        return A();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int j() {
        return y();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long k() {
        return z();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int m() {
        return A();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long n() {
        return B();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int o() {
        return y();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long p() {
        return z();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int q() {
        int A10 = A();
        return (-(A10 & 1)) ^ (A10 >>> 1);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long r() {
        long B10 = B();
        return (-(B10 & 1)) ^ (B10 >>> 1);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final String s() {
        int A10 = A();
        if (A10 > 0) {
            int i10 = this.f25229f;
            int i11 = this.f25231h;
            if (A10 <= i10 - i11) {
                String str = new String(this.f25228e, i11, A10, A.f25144a);
                this.f25231h += A10;
                return str;
            }
        }
        if (A10 == 0) {
            return "";
        }
        if (A10 < 0) {
            throw C.d();
        }
        throw C.e();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final String t() {
        int A10 = A();
        if (A10 > 0) {
            int i10 = this.f25229f;
            int i11 = this.f25231h;
            if (A10 <= i10 - i11) {
                String U12 = p0.f25264a.U1(this.f25228e, i11, A10);
                this.f25231h += A10;
                return U12;
            }
        }
        if (A10 == 0) {
            return "";
        }
        if (A10 <= 0) {
            throw C.d();
        }
        throw C.e();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int u() {
        if (c()) {
            this.f25233j = 0;
            return 0;
        }
        int A10 = A();
        this.f25233j = A10;
        if ((A10 >>> 3) != 0) {
            return A10;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int v() {
        return A();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long w() {
        return B();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final boolean x(int i10) {
        int u10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            E(4);
                            return true;
                        }
                        throw C.b();
                    }
                    do {
                        u10 = u();
                        if (u10 == 0) {
                            break;
                        }
                    } while (x(u10));
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                E(A());
                return true;
            }
            E(8);
            return true;
        }
        int i13 = this.f25229f - this.f25231h;
        byte[] bArr = this.f25228e;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f25231h;
                this.f25231h = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw C.c();
        }
        while (i12 < 10) {
            int i15 = this.f25231h;
            if (i15 != this.f25229f) {
                this.f25231h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            } else {
                throw C.e();
            }
        }
        throw C.c();
        return true;
    }

    public final int y() {
        int i10 = this.f25231h;
        if (this.f25229f - i10 >= 4) {
            this.f25231h = i10 + 4;
            byte[] bArr = this.f25228e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw C.e();
    }

    public final long z() {
        int i10 = this.f25231h;
        if (this.f25229f - i10 >= 8) {
            this.f25231h = i10 + 8;
            byte[] bArr = this.f25228e;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw C.e();
    }
}
