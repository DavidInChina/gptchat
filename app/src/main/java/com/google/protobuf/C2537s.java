package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.protobuf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2537s extends AbstractC2543v {

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f27586e;

    /* renamed from: f  reason: collision with root package name */
    public int f27587f;

    /* renamed from: g  reason: collision with root package name */
    public int f27588g;

    /* renamed from: h  reason: collision with root package name */
    public int f27589h;

    /* renamed from: i  reason: collision with root package name */
    public final int f27590i;

    /* renamed from: j  reason: collision with root package name */
    public int f27591j;

    /* renamed from: k  reason: collision with root package name */
    public int f27592k = Integer.MAX_VALUE;

    public C2537s(byte[] bArr, int i10, int i11, boolean z10) {
        this.f27586e = bArr;
        this.f27587f = i11 + i10;
        this.f27589h = i10;
        this.f27590i = i10;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long A() {
        return K();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int B() {
        return AbstractC2543v.c(x());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long C() {
        return AbstractC2543v.d(L());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final String D() {
        int x10 = x();
        if (x10 > 0) {
            int i10 = this.f27587f;
            int i11 = this.f27589h;
            if (x10 <= i10 - i11) {
                String str = new String(this.f27586e, i11, x10, AbstractC2536r0.f27584a);
                this.f27589h += x10;
                return str;
            }
        }
        if (x10 == 0) {
            return "";
        }
        if (x10 < 0) {
            throw C2540t0.e();
        }
        throw C2540t0.g();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final String E() {
        int x10 = x();
        if (x10 > 0) {
            int i10 = this.f27587f;
            int i11 = this.f27589h;
            if (x10 <= i10 - i11) {
                String W6 = F1.f27398a.W(this.f27586e, i11, x10);
                this.f27589h += x10;
                return W6;
            }
        }
        if (x10 == 0) {
            return "";
        }
        if (x10 <= 0) {
            throw C2540t0.e();
        }
        throw C2540t0.g();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int F() {
        if (g()) {
            this.f27591j = 0;
            return 0;
        }
        int x10 = x();
        this.f27591j = x10;
        if ((x10 >>> 3) != 0) {
            return x10;
        }
        throw C2540t0.a();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int G() {
        return x();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long H() {
        return L();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final boolean I(int i10) {
        int F10;
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
                            O(4);
                            return true;
                        }
                        throw C2540t0.c();
                    }
                    do {
                        F10 = F();
                        if (F10 == 0) {
                            break;
                        }
                    } while (I(F10));
                    a(((i10 >>> 3) << 3) | 4);
                    return true;
                }
                O(x());
                return true;
            }
            O(8);
            return true;
        }
        int i13 = this.f27587f - this.f27589h;
        byte[] bArr = this.f27586e;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f27589h;
                this.f27589h = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw C2540t0.d();
        }
        while (i12 < 10) {
            int i15 = this.f27589h;
            if (i15 != this.f27587f) {
                this.f27589h = i15 + 1;
                if (bArr[i15] < 0) {
                    i12++;
                }
            } else {
                throw C2540t0.g();
            }
        }
        throw C2540t0.d();
        return true;
    }

    public final int J() {
        int i10 = this.f27589h;
        if (this.f27587f - i10 >= 4) {
            this.f27589h = i10 + 4;
            byte[] bArr = this.f27586e;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw C2540t0.g();
    }

    public final long K() {
        int i10 = this.f27589h;
        if (this.f27587f - i10 >= 8) {
            this.f27589h = i10 + 8;
            byte[] bArr = this.f27586e;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw C2540t0.g();
    }

    public final long L() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f27589h;
        int i11 = this.f27587f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f27586e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f27589h = i12;
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
                this.f27589h = i13;
                return j6;
            }
        }
        return M();
    }

    public final long M() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f27589h;
            if (i11 != this.f27587f) {
                this.f27589h = i11 + 1;
                byte b10 = this.f27586e[i11];
                j6 |= (b10 & Byte.MAX_VALUE) << i10;
                if ((b10 & 128) == 0) {
                    return j6;
                }
            } else {
                throw C2540t0.g();
            }
        }
        throw C2540t0.d();
    }

    public final void N() {
        int i10 = this.f27587f + this.f27588g;
        this.f27587f = i10;
        int i11 = i10 - this.f27590i;
        int i12 = this.f27592k;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f27588g = i13;
            this.f27587f = i10 - i13;
            return;
        }
        this.f27588g = 0;
    }

    public final void O(int i10) {
        if (i10 >= 0) {
            int i11 = this.f27587f;
            int i12 = this.f27589h;
            if (i10 <= i11 - i12) {
                this.f27589h = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw C2540t0.e();
        }
        throw C2540t0.g();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void a(int i10) {
        if (this.f27591j == i10) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int e() {
        int i10 = this.f27592k;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - f();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int f() {
        return this.f27589h - this.f27590i;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final boolean g() {
        if (this.f27589h == this.f27587f) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void k(int i10) {
        this.f27592k = i10;
        N();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int l(int i10) {
        if (i10 >= 0) {
            int f6 = f() + i10;
            if (f6 >= 0) {
                int i11 = this.f27592k;
                if (f6 <= i11) {
                    this.f27592k = f6;
                    N();
                    return i11;
                }
                throw C2540t0.g();
            }
            throw C2540t0.f();
        }
        throw C2540t0.e();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final boolean m() {
        if (L() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final C2532p n() {
        byte[] bArr;
        int x10 = x();
        byte[] bArr2 = this.f27586e;
        if (x10 > 0) {
            int i10 = this.f27587f;
            int i11 = this.f27589h;
            if (x10 <= i10 - i11) {
                C2532p s10 = AbstractC2534q.s(bArr2, i11, x10);
                this.f27589h += x10;
                return s10;
            }
        }
        if (x10 == 0) {
            return AbstractC2534q.f27581Z;
        }
        if (x10 > 0) {
            int i12 = this.f27587f;
            int i13 = this.f27589h;
            if (x10 <= i12 - i13) {
                int i14 = x10 + i13;
                this.f27589h = i14;
                bArr = Arrays.copyOfRange(bArr2, i13, i14);
                C2532p c2532p = AbstractC2534q.f27581Z;
                return new C2532p(bArr);
            }
        }
        if (x10 <= 0) {
            if (x10 == 0) {
                bArr = AbstractC2536r0.f27585b;
                C2532p c2532p2 = AbstractC2534q.f27581Z;
                return new C2532p(bArr);
            }
            throw C2540t0.e();
        }
        throw C2540t0.g();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final double o() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int p() {
        return x();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int q() {
        return J();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long r() {
        return K();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final float s() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void t(int i10, L0 l02, J j6) {
        b();
        this.f27622a++;
        ((X) l02).e(this, j6);
        a((i10 << 3) | 4);
        this.f27622a--;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int u() {
        return x();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long v() {
        return L();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void w(L0 l02, J j6) {
        int x10 = x();
        b();
        int l10 = l(x10);
        this.f27622a++;
        ((X) l02).e(this, j6);
        a(0);
        this.f27622a--;
        if (e() == 0) {
            k(l10);
            return;
        }
        throw C2540t0.g();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int x() {
        int i10;
        int i11 = this.f27589h;
        int i12 = this.f27587f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f27586e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f27589h = i13;
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
                this.f27589h = i14;
                return i10;
            }
        }
        return (int) M();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int z() {
        return J();
    }
}
