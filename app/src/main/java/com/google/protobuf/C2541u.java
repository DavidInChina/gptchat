package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2541u extends AbstractC2543v {

    /* renamed from: e  reason: collision with root package name */
    public final ByteBuffer f27602e;

    /* renamed from: f  reason: collision with root package name */
    public final long f27603f;

    /* renamed from: g  reason: collision with root package name */
    public long f27604g;

    /* renamed from: h  reason: collision with root package name */
    public long f27605h;

    /* renamed from: i  reason: collision with root package name */
    public final long f27606i;

    /* renamed from: j  reason: collision with root package name */
    public int f27607j;

    /* renamed from: k  reason: collision with root package name */
    public int f27608k;

    /* renamed from: l  reason: collision with root package name */
    public int f27609l = Integer.MAX_VALUE;

    public C2541u(ByteBuffer byteBuffer, boolean z10) {
        this.f27602e = byteBuffer;
        long j6 = C1.f27385c.j(C1.f27389g, byteBuffer);
        this.f27603f = j6;
        this.f27604g = byteBuffer.limit() + j6;
        long position = j6 + byteBuffer.position();
        this.f27605h = position;
        this.f27606i = position;
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
            long j6 = this.f27604g;
            long j10 = this.f27605h;
            if (x10 <= ((int) (j6 - j10))) {
                byte[] bArr = new byte[x10];
                long j11 = x10;
                C1.f27385c.c(j10, bArr, j11);
                String str = new String(bArr, AbstractC2536r0.f27584a);
                this.f27605h += j11;
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
        String str;
        int x10 = x();
        if (x10 > 0) {
            long j6 = this.f27604g;
            long j10 = this.f27605h;
            if (x10 <= ((int) (j6 - j10))) {
                int i10 = (int) (j10 - this.f27603f);
                D1 d12 = F1.f27398a;
                d12.getClass();
                ByteBuffer byteBuffer = this.f27602e;
                if (byteBuffer.hasArray()) {
                    str = d12.W(byteBuffer.array(), byteBuffer.arrayOffset() + i10, x10);
                } else if (byteBuffer.isDirect()) {
                    str = d12.X(byteBuffer, i10, x10);
                } else {
                    str = AbstractC2508h.J(byteBuffer, i10, x10);
                }
                this.f27605h += x10;
                return str;
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
            this.f27608k = 0;
            return 0;
        }
        int x10 = x();
        this.f27608k = x10;
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
        if (((int) (this.f27604g - this.f27605h)) >= 10) {
            while (i12 < 10) {
                long j6 = this.f27605h;
                this.f27605h = j6 + 1;
                if (C1.f27385c.e(j6) < 0) {
                    i12++;
                }
            }
            throw C2540t0.d();
        }
        while (i12 < 10) {
            long j10 = this.f27605h;
            if (j10 != this.f27604g) {
                this.f27605h = j10 + 1;
                if (C1.f27385c.e(j10) < 0) {
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
        long j6 = this.f27605h;
        if (this.f27604g - j6 >= 4) {
            this.f27605h = 4 + j6;
            B1 b1 = C1.f27385c;
            return ((b1.e(j6 + 3) & 255) << 24) | (b1.e(j6) & 255) | ((b1.e(1 + j6) & 255) << 8) | ((b1.e(2 + j6) & 255) << 16);
        }
        throw C2540t0.g();
    }

    public final long K() {
        long j6 = this.f27605h;
        if (this.f27604g - j6 >= 8) {
            this.f27605h = 8 + j6;
            B1 b1 = C1.f27385c;
            return ((b1.e(j6 + 7) & 255) << 56) | (b1.e(j6) & 255) | ((b1.e(1 + j6) & 255) << 8) | ((b1.e(2 + j6) & 255) << 16) | ((b1.e(3 + j6) & 255) << 24) | ((b1.e(4 + j6) & 255) << 32) | ((b1.e(5 + j6) & 255) << 40) | ((b1.e(6 + j6) & 255) << 48);
        }
        throw C2540t0.g();
    }

    public final long L() {
        long j6;
        long j10;
        long j11;
        int i10;
        long j12 = this.f27605h;
        if (this.f27604g != j12) {
            long j13 = 1 + j12;
            B1 b1 = C1.f27385c;
            byte e10 = b1.e(j12);
            if (e10 >= 0) {
                this.f27605h = j13;
                return e10;
            } else if (this.f27604g - j13 >= 9) {
                long j14 = 2 + j12;
                int e11 = (b1.e(j13) << 7) ^ e10;
                if (e11 < 0) {
                    i10 = e11 ^ (-128);
                } else {
                    long j15 = 3 + j12;
                    int e12 = e11 ^ (b1.e(j14) << 14);
                    if (e12 >= 0) {
                        j6 = e12 ^ 16256;
                    } else {
                        j14 = j12 + 4;
                        int e13 = e12 ^ (b1.e(j15) << 21);
                        if (e13 < 0) {
                            i10 = (-2080896) ^ e13;
                        } else {
                            j15 = 5 + j12;
                            long e14 = e13 ^ (b1.e(j14) << 28);
                            if (e14 >= 0) {
                                j11 = 266354560;
                            } else {
                                long j16 = 6 + j12;
                                long e15 = e14 ^ (b1.e(j15) << 35);
                                if (e15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = 7 + j12;
                                    e14 = e15 ^ (b1.e(j16) << 42);
                                    if (e14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = 8 + j12;
                                        e15 = e14 ^ (b1.e(j15) << 49);
                                        if (e15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            long j17 = j12 + 9;
                                            long e16 = (e15 ^ (b1.e(j16) << 56)) ^ 71499008037633920L;
                                            if (e16 < 0) {
                                                long j18 = j12 + 10;
                                                if (b1.e(j17) >= 0) {
                                                    j14 = j18;
                                                    j6 = e16;
                                                }
                                            } else {
                                                j6 = e16;
                                                j14 = j17;
                                            }
                                            this.f27605h = j14;
                                            return j6;
                                        }
                                    }
                                }
                                j6 = j10 ^ e15;
                                j14 = j16;
                                this.f27605h = j14;
                                return j6;
                            }
                            j6 = j11 ^ e14;
                        }
                    }
                    j14 = j15;
                    this.f27605h = j14;
                    return j6;
                }
                j6 = i10;
                this.f27605h = j14;
                return j6;
            }
        }
        return M();
    }

    public final long M() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            long j10 = this.f27605h;
            if (j10 != this.f27604g) {
                this.f27605h = 1 + j10;
                byte e10 = C1.f27385c.e(j10);
                j6 |= (e10 & Byte.MAX_VALUE) << i10;
                if ((e10 & 128) == 0) {
                    return j6;
                }
            } else {
                throw C2540t0.g();
            }
        }
        throw C2540t0.d();
    }

    public final void N() {
        long j6 = this.f27604g + this.f27607j;
        this.f27604g = j6;
        int i10 = (int) (j6 - this.f27606i);
        int i11 = this.f27609l;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f27607j = i12;
            this.f27604g = j6 - i12;
            return;
        }
        this.f27607j = 0;
    }

    public final void O(int i10) {
        if (i10 >= 0) {
            long j6 = this.f27604g;
            long j10 = this.f27605h;
            if (i10 <= ((int) (j6 - j10))) {
                this.f27605h = j10 + i10;
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
        if (this.f27608k == i10) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int e() {
        int i10 = this.f27609l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - f();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int f() {
        return (int) (this.f27605h - this.f27606i);
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final boolean g() {
        if (this.f27605h == this.f27604g) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void k(int i10) {
        this.f27609l = i10;
        N();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int l(int i10) {
        if (i10 >= 0) {
            int f6 = f() + i10;
            int i11 = this.f27609l;
            if (f6 <= i11) {
                this.f27609l = f6;
                N();
                return i11;
            }
            throw C2540t0.g();
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
        int x10 = x();
        if (x10 > 0) {
            long j6 = this.f27604g;
            long j10 = this.f27605h;
            if (x10 <= ((int) (j6 - j10))) {
                byte[] bArr = new byte[x10];
                long j11 = x10;
                C1.f27385c.c(j10, bArr, j11);
                this.f27605h += j11;
                C2532p c2532p = AbstractC2534q.f27581Z;
                return new C2532p(bArr);
            }
        }
        if (x10 == 0) {
            return AbstractC2534q.f27581Z;
        }
        if (x10 < 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r4.e(r8) < 0) goto L32;
     */
    @Override // com.google.protobuf.AbstractC2543v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x() {
        int i10;
        long j6 = this.f27605h;
        if (this.f27604g != j6) {
            long j10 = 1 + j6;
            B1 b1 = C1.f27385c;
            byte e10 = b1.e(j6);
            if (e10 >= 0) {
                this.f27605h = j10;
                return e10;
            } else if (this.f27604g - j10 >= 9) {
                long j11 = 2 + j6;
                int e11 = (b1.e(j10) << 7) ^ e10;
                if (e11 < 0) {
                    i10 = e11 ^ (-128);
                } else {
                    long j12 = 3 + j6;
                    int e12 = e11 ^ (b1.e(j11) << 14);
                    if (e12 >= 0) {
                        i10 = e12 ^ 16256;
                    } else {
                        j11 = j6 + 4;
                        int e13 = e12 ^ (b1.e(j12) << 21);
                        if (e13 < 0) {
                            i10 = (-2080896) ^ e13;
                        } else {
                            j12 = 5 + j6;
                            byte e14 = b1.e(j11);
                            int i11 = (e13 ^ (e14 << 28)) ^ 266354560;
                            if (e14 < 0) {
                                j11 = j6 + 6;
                                if (b1.e(j12) < 0) {
                                    j12 = 7 + j6;
                                    if (b1.e(j11) < 0) {
                                        j11 = j6 + 8;
                                        if (b1.e(j12) < 0) {
                                            long j13 = 9 + j6;
                                            if (b1.e(j11) < 0) {
                                                j11 = j6 + 10;
                                            } else {
                                                i10 = i11;
                                                j11 = j13;
                                            }
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            i10 = i11;
                        }
                    }
                    j11 = j12;
                }
                this.f27605h = j11;
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
