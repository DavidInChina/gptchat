package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import k6.AbstractC4194d;

/* renamed from: com.google.protobuf.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2539t extends AbstractC2543v {

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f27593e;

    /* renamed from: h  reason: collision with root package name */
    public int f27596h;

    /* renamed from: j  reason: collision with root package name */
    public int f27598j;

    /* renamed from: l  reason: collision with root package name */
    public int f27600l = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f27594f = new byte[4096];

    /* renamed from: g  reason: collision with root package name */
    public int f27595g = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f27597i = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f27599k = 0;

    public C2539t(InputStream inputStream) {
        AbstractC2536r0.a("input", inputStream);
        this.f27593e = inputStream;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long A() {
        return N();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int B() {
        return AbstractC2543v.c(x());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long C() {
        return AbstractC2543v.d(O());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final String D() {
        int x10 = x();
        byte[] bArr = this.f27594f;
        if (x10 > 0) {
            int i10 = this.f27595g;
            int i11 = this.f27597i;
            if (x10 <= i10 - i11) {
                String str = new String(bArr, i11, x10, AbstractC2536r0.f27584a);
                this.f27597i += x10;
                return str;
            }
        }
        if (x10 == 0) {
            return "";
        }
        if (x10 <= this.f27595g) {
            R(x10);
            String str2 = new String(bArr, this.f27597i, x10, AbstractC2536r0.f27584a);
            this.f27597i += x10;
            return str2;
        }
        return new String(J(x10), AbstractC2536r0.f27584a);
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final String E() {
        int x10 = x();
        int i10 = this.f27597i;
        int i11 = this.f27595g;
        int i12 = i11 - i10;
        byte[] bArr = this.f27594f;
        if (x10 <= i12 && x10 > 0) {
            this.f27597i = i10 + x10;
        } else if (x10 == 0) {
            return "";
        } else {
            i10 = 0;
            if (x10 <= i11) {
                R(x10);
                this.f27597i = x10;
            } else {
                bArr = J(x10);
            }
        }
        return F1.f27398a.W(bArr, i10, x10);
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int F() {
        if (g()) {
            this.f27598j = 0;
            return 0;
        }
        int x10 = x();
        this.f27598j = x10;
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
        return O();
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
                            S(4);
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
                S(x());
                return true;
            }
            S(8);
            return true;
        }
        int i13 = this.f27595g - this.f27597i;
        byte[] bArr = this.f27594f;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f27597i;
                this.f27597i = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw C2540t0.d();
        }
        while (i12 < 10) {
            if (this.f27597i == this.f27595g) {
                R(1);
            }
            int i15 = this.f27597i;
            this.f27597i = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw C2540t0.d();
        return true;
    }

    public final byte[] J(int i10) {
        byte[] K10 = K(i10);
        if (K10 != null) {
            return K10;
        }
        int i11 = this.f27597i;
        int i12 = this.f27595g;
        int i13 = i12 - i11;
        this.f27599k += i12;
        this.f27597i = 0;
        this.f27595g = 0;
        ArrayList L10 = L(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f27594f, i11, bArr, 0, i13);
        Iterator it = L10.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] K(int i10) {
        if (i10 == 0) {
            return AbstractC2536r0.f27585b;
        }
        if (i10 >= 0) {
            int i11 = this.f27599k;
            int i12 = this.f27597i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f27624c <= 0) {
                int i14 = this.f27600l;
                if (i13 <= i14) {
                    int i15 = this.f27595g - i12;
                    int i16 = i10 - i15;
                    InputStream inputStream = this.f27593e;
                    if (i16 >= 4096) {
                        try {
                            if (i16 > inputStream.available()) {
                                return null;
                            }
                        } catch (C2540t0 e10) {
                            e10.f27601Y = true;
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f27594f, this.f27597i, bArr, 0, i15);
                    this.f27599k += this.f27595g;
                    this.f27597i = 0;
                    this.f27595g = 0;
                    while (i15 < i10) {
                        try {
                            int read = inputStream.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f27599k += read;
                                i15 += read;
                            } else {
                                throw C2540t0.g();
                            }
                        } catch (C2540t0 e11) {
                            e11.f27601Y = true;
                            throw e11;
                        }
                    }
                    return bArr;
                }
                S((i14 - i11) - i12);
                throw C2540t0.g();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C2540t0.e();
    }

    public final ArrayList L(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f27593e.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.f27599k += read;
                    i11 += read;
                } else {
                    throw C2540t0.g();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int M() {
        int i10 = this.f27597i;
        if (this.f27595g - i10 < 4) {
            R(4);
            i10 = this.f27597i;
        }
        this.f27597i = i10 + 4;
        byte[] bArr = this.f27594f;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long N() {
        int i10 = this.f27597i;
        if (this.f27595g - i10 < 8) {
            R(8);
            i10 = this.f27597i;
        }
        this.f27597i = i10 + 8;
        byte[] bArr = this.f27594f;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long O() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f27597i;
        int i11 = this.f27595g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f27594f;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f27597i = i12;
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
                this.f27597i = i13;
                return j6;
            }
        }
        return P();
    }

    public final long P() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f27597i == this.f27595g) {
                R(1);
            }
            int i11 = this.f27597i;
            this.f27597i = i11 + 1;
            byte b10 = this.f27594f[i11];
            j6 |= (b10 & Byte.MAX_VALUE) << i10;
            if ((b10 & 128) == 0) {
                return j6;
            }
        }
        throw C2540t0.d();
    }

    public final void Q() {
        int i10 = this.f27595g + this.f27596h;
        this.f27595g = i10;
        int i11 = this.f27599k + i10;
        int i12 = this.f27600l;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f27596h = i13;
            this.f27595g = i10 - i13;
            return;
        }
        this.f27596h = 0;
    }

    public final void R(int i10) {
        if (!T(i10)) {
            if (i10 > (this.f27624c - this.f27599k) - this.f27597i) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C2540t0.g();
        }
    }

    public final void S(int i10) {
        int i11 = this.f27595g;
        int i12 = this.f27597i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f27597i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f27593e;
        if (i10 >= 0) {
            int i13 = this.f27599k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f27600l;
            if (i15 <= i16) {
                this.f27599k = i14;
                int i17 = i11 - i12;
                this.f27595g = 0;
                this.f27597i = 0;
                while (i17 < i10) {
                    long j6 = i10 - i17;
                    try {
                        try {
                            long skip = inputStream.skip(j6);
                            int i18 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i18 >= 0 && skip <= j6) {
                                if (i18 == 0) {
                                    break;
                                }
                                i17 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (C2540t0 e10) {
                            e10.f27601Y = true;
                            throw e10;
                        }
                    } catch (Throwable th2) {
                        this.f27599k += i17;
                        Q();
                        throw th2;
                    }
                }
                this.f27599k += i17;
                Q();
                if (i17 < i10) {
                    int i19 = this.f27595g;
                    int i20 = i19 - this.f27597i;
                    this.f27597i = i19;
                    R(1);
                    while (true) {
                        int i21 = i10 - i20;
                        int i22 = this.f27595g;
                        if (i21 > i22) {
                            i20 += i22;
                            this.f27597i = i22;
                            R(1);
                        } else {
                            this.f27597i = i21;
                            return;
                        }
                    }
                }
            } else {
                S((i16 - i13) - i12);
                throw C2540t0.g();
            }
        } else {
            throw C2540t0.e();
        }
    }

    public final boolean T(int i10) {
        InputStream inputStream;
        int i11 = this.f27597i;
        int i12 = i11 + i10;
        int i13 = this.f27595g;
        if (i12 > i13) {
            int i14 = this.f27599k;
            int i15 = this.f27624c;
            if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f27600l) {
                return false;
            }
            byte[] bArr = this.f27594f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f27599k += i11;
                this.f27595g -= i11;
                this.f27597i = 0;
            }
            int i16 = this.f27595g;
            int min = Math.min(bArr.length - i16, (i15 - this.f27599k) - i16);
            try {
                int read = this.f27593e.read(bArr, i16, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f27595g += read;
                    Q();
                    if (this.f27595g >= i10) {
                        return true;
                    }
                    return T(i10);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (C2540t0 e10) {
                e10.f27601Y = true;
                throw e10;
            }
        }
        throw new IllegalStateException(AbstractC4194d.v("refillBuffer() called when ", i10, " bytes were already available in buffer"));
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void a(int i10) {
        if (this.f27598j == i10) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int e() {
        int i10 = this.f27600l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f27599k + this.f27597i);
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int f() {
        return this.f27599k + this.f27597i;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final boolean g() {
        if (this.f27597i == this.f27595g && !T(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final void k(int i10) {
        this.f27600l = i10;
        Q();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int l(int i10) {
        if (i10 >= 0) {
            int i11 = this.f27599k + this.f27597i + i10;
            int i12 = this.f27600l;
            if (i11 <= i12) {
                this.f27600l = i11;
                Q();
                return i12;
            }
            throw C2540t0.g();
        }
        throw C2540t0.e();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final boolean m() {
        if (O() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final C2532p n() {
        int x10 = x();
        int i10 = this.f27595g;
        int i11 = this.f27597i;
        int i12 = i10 - i11;
        byte[] bArr = this.f27594f;
        if (x10 <= i12 && x10 > 0) {
            C2532p s10 = AbstractC2534q.s(bArr, i11, x10);
            this.f27597i += x10;
            return s10;
        } else if (x10 == 0) {
            return AbstractC2534q.f27581Z;
        } else {
            byte[] K10 = K(x10);
            if (K10 != null) {
                return AbstractC2534q.s(K10, 0, K10.length);
            }
            int i13 = this.f27597i;
            int i14 = this.f27595g;
            int i15 = i14 - i13;
            this.f27599k += i14;
            this.f27597i = 0;
            this.f27595g = 0;
            ArrayList L10 = L(x10 - i15);
            byte[] bArr2 = new byte[x10];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            Iterator it = L10.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
                i15 += bArr3.length;
            }
            C2532p c2532p = AbstractC2534q.f27581Z;
            return new C2532p(bArr2);
        }
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final double o() {
        return Double.longBitsToDouble(N());
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int p() {
        return x();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int q() {
        return M();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final long r() {
        return N();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final float s() {
        return Float.intBitsToFloat(M());
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
        return O();
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
        int i11 = this.f27597i;
        int i12 = this.f27595g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f27594f;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f27597i = i13;
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
                this.f27597i = i14;
                return i10;
            }
        }
        return (int) P();
    }

    @Override // com.google.protobuf.AbstractC2543v
    public final int z() {
        return M();
    }
}
