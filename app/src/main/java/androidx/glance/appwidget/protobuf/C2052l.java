package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import k6.AbstractC4194d;

/* renamed from: androidx.glance.appwidget.protobuf.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2052l extends AbstractC2053m {

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f25235e;

    /* renamed from: h  reason: collision with root package name */
    public int f25238h;

    /* renamed from: j  reason: collision with root package name */
    public int f25240j;

    /* renamed from: l  reason: collision with root package name */
    public int f25242l = Integer.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f25236f = new byte[4096];

    /* renamed from: g  reason: collision with root package name */
    public int f25237g = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f25239i = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f25241k = 0;

    public C2052l(io.sentry.instrumentation.file.d dVar) {
        Charset charset = A.f25144a;
        this.f25235e = dVar;
    }

    public final ArrayList A(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f25235e.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.f25241k += read;
                    i11 += read;
                } else {
                    throw C.e();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i10 = this.f25239i;
        if (this.f25237g - i10 < 4) {
            H(4);
            i10 = this.f25239i;
        }
        this.f25239i = i10 + 4;
        byte[] bArr = this.f25236f;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long C() {
        int i10 = this.f25239i;
        if (this.f25237g - i10 < 8) {
            H(8);
            i10 = this.f25239i;
        }
        this.f25239i = i10 + 8;
        byte[] bArr = this.f25236f;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int D() {
        int i10;
        int i11 = this.f25239i;
        int i12 = this.f25237g;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f25236f;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f25239i = i13;
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
                this.f25239i = i14;
                return i10;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j6;
        long j10;
        long j11;
        long j12;
        int i10 = this.f25239i;
        int i11 = this.f25237g;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f25236f;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f25239i = i12;
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
                this.f25239i = i13;
                return j6;
            }
        }
        return F();
    }

    public final long F() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f25239i == this.f25237g) {
                H(1);
            }
            int i11 = this.f25239i;
            this.f25239i = i11 + 1;
            byte b10 = this.f25236f[i11];
            j6 |= (b10 & Byte.MAX_VALUE) << i10;
            if ((b10 & 128) == 0) {
                return j6;
            }
        }
        throw C.c();
    }

    public final void G() {
        int i10 = this.f25237g + this.f25238h;
        this.f25237g = i10;
        int i11 = this.f25241k + i10;
        int i12 = this.f25242l;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f25238h = i13;
            this.f25237g = i10 - i13;
            return;
        }
        this.f25238h = 0;
    }

    public final void H(int i10) {
        if (!J(i10)) {
            if (i10 > (this.f25246c - this.f25241k) - this.f25239i) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C.e();
        }
    }

    public final void I(int i10) {
        int i11 = this.f25237g;
        int i12 = this.f25239i;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f25239i = i12 + i10;
            return;
        }
        InputStream inputStream = this.f25235e;
        if (i10 >= 0) {
            int i13 = this.f25241k;
            int i14 = i13 + i12;
            int i15 = i14 + i10;
            int i16 = this.f25242l;
            if (i15 <= i16) {
                this.f25241k = i14;
                int i17 = i11 - i12;
                this.f25237g = 0;
                this.f25239i = 0;
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
                        } catch (C e10) {
                            e10.f25146Y = true;
                            throw e10;
                        }
                    } catch (Throwable th2) {
                        this.f25241k += i17;
                        G();
                        throw th2;
                    }
                }
                this.f25241k += i17;
                G();
                if (i17 < i10) {
                    int i19 = this.f25237g;
                    int i20 = i19 - this.f25239i;
                    this.f25239i = i19;
                    H(1);
                    while (true) {
                        int i21 = i10 - i20;
                        int i22 = this.f25237g;
                        if (i21 > i22) {
                            i20 += i22;
                            this.f25239i = i22;
                            H(1);
                        } else {
                            this.f25239i = i21;
                            return;
                        }
                    }
                }
            } else {
                I((i16 - i13) - i12);
                throw C.e();
            }
        } else {
            throw C.d();
        }
    }

    public final boolean J(int i10) {
        InputStream inputStream;
        int i11 = this.f25239i;
        int i12 = i11 + i10;
        int i13 = this.f25237g;
        if (i12 > i13) {
            int i14 = this.f25241k;
            int i15 = this.f25246c;
            if (i10 > (i15 - i14) - i11 || i14 + i11 + i10 > this.f25242l) {
                return false;
            }
            byte[] bArr = this.f25236f;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f25241k += i11;
                this.f25237g -= i11;
                this.f25239i = 0;
            }
            int i16 = this.f25237g;
            int min = Math.min(bArr.length - i16, (i15 - this.f25241k) - i16);
            try {
                int read = this.f25235e.read(bArr, i16, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f25237g += read;
                    G();
                    if (this.f25237g >= i10) {
                        return true;
                    }
                    return J(i10);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (C e10) {
                e10.f25146Y = true;
                throw e10;
            }
        }
        throw new IllegalStateException(AbstractC4194d.v("refillBuffer() called when ", i10, " bytes were already available in buffer"));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final void a(int i10) {
        if (this.f25240j == i10) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int b() {
        return this.f25241k + this.f25239i;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final boolean c() {
        if (this.f25239i == this.f25237g && !J(1)) {
            return true;
        }
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final void d(int i10) {
        this.f25242l = i10;
        G();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int e(int i10) {
        if (i10 >= 0) {
            int i11 = this.f25241k + this.f25239i + i10;
            int i12 = this.f25242l;
            if (i11 <= i12) {
                this.f25242l = i11;
                G();
                return i12;
            }
            throw C.e();
        }
        throw C.d();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final boolean f() {
        if (E() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final C2050j g() {
        int D6 = D();
        int i10 = this.f25237g;
        int i11 = this.f25239i;
        int i12 = i10 - i11;
        byte[] bArr = this.f25236f;
        if (D6 <= i12 && D6 > 0) {
            C2050j s10 = AbstractC2049i.s(bArr, i11, D6);
            this.f25239i += D6;
            return s10;
        } else if (D6 == 0) {
            return AbstractC2049i.f25223Z;
        } else {
            byte[] z10 = z(D6);
            if (z10 != null) {
                return AbstractC2049i.s(z10, 0, z10.length);
            }
            int i13 = this.f25239i;
            int i14 = this.f25237g;
            int i15 = i14 - i13;
            this.f25241k += i14;
            this.f25239i = 0;
            this.f25237g = 0;
            ArrayList A10 = A(D6 - i15);
            byte[] bArr2 = new byte[D6];
            System.arraycopy(bArr, i13, bArr2, 0, i15);
            Iterator it = A10.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i15, bArr3.length);
                i15 += bArr3.length;
            }
            C2050j c2050j = AbstractC2049i.f25223Z;
            return new C2050j(bArr2);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int i() {
        return D();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int j() {
        return B();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long k() {
        return C();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int m() {
        return D();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long n() {
        return E();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int o() {
        return B();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long p() {
        return C();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int q() {
        int D6 = D();
        return (-(D6 & 1)) ^ (D6 >>> 1);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long r() {
        long E10 = E();
        return (-(E10 & 1)) ^ (E10 >>> 1);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final String s() {
        int D6 = D();
        byte[] bArr = this.f25236f;
        if (D6 > 0) {
            int i10 = this.f25237g;
            int i11 = this.f25239i;
            if (D6 <= i10 - i11) {
                String str = new String(bArr, i11, D6, A.f25144a);
                this.f25239i += D6;
                return str;
            }
        }
        if (D6 == 0) {
            return "";
        }
        if (D6 <= this.f25237g) {
            H(D6);
            String str2 = new String(bArr, this.f25239i, D6, A.f25144a);
            this.f25239i += D6;
            return str2;
        }
        return new String(y(D6), A.f25144a);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final String t() {
        int D6 = D();
        int i10 = this.f25239i;
        int i11 = this.f25237g;
        int i12 = i11 - i10;
        byte[] bArr = this.f25236f;
        if (D6 <= i12 && D6 > 0) {
            this.f25239i = i10 + D6;
        } else if (D6 == 0) {
            return "";
        } else {
            i10 = 0;
            if (D6 <= i11) {
                H(D6);
                this.f25239i = D6;
            } else {
                bArr = y(D6);
            }
        }
        return p0.f25264a.U1(bArr, i10, D6);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int u() {
        if (c()) {
            this.f25240j = 0;
            return 0;
        }
        int D6 = D();
        this.f25240j = D6;
        if ((D6 >>> 3) != 0) {
            return D6;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final int v() {
        return D();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC2053m
    public final long w() {
        return E();
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
                            I(4);
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
                I(D());
                return true;
            }
            I(8);
            return true;
        }
        int i13 = this.f25237g - this.f25239i;
        byte[] bArr = this.f25236f;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f25239i;
                this.f25239i = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw C.c();
        }
        while (i12 < 10) {
            if (this.f25239i == this.f25237g) {
                H(1);
            }
            int i15 = this.f25239i;
            this.f25239i = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw C.c();
        return true;
    }

    public final byte[] y(int i10) {
        byte[] z10 = z(i10);
        if (z10 != null) {
            return z10;
        }
        int i11 = this.f25239i;
        int i12 = this.f25237g;
        int i13 = i12 - i11;
        this.f25241k += i12;
        this.f25239i = 0;
        this.f25237g = 0;
        ArrayList A10 = A(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f25236f, i11, bArr, 0, i13);
        Iterator it = A10.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i10) {
        if (i10 == 0) {
            return A.f25145b;
        }
        if (i10 >= 0) {
            int i11 = this.f25241k;
            int i12 = this.f25239i;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f25246c <= 0) {
                int i14 = this.f25242l;
                if (i13 <= i14) {
                    int i15 = this.f25237g - i12;
                    int i16 = i10 - i15;
                    InputStream inputStream = this.f25235e;
                    if (i16 >= 4096) {
                        try {
                            if (i16 > inputStream.available()) {
                                return null;
                            }
                        } catch (C e10) {
                            e10.f25146Y = true;
                            throw e10;
                        }
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.f25236f, this.f25239i, bArr, 0, i15);
                    this.f25241k += this.f25237g;
                    this.f25239i = 0;
                    this.f25237g = 0;
                    while (i15 < i10) {
                        try {
                            int read = inputStream.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f25241k += read;
                                i15 += read;
                            } else {
                                throw C.e();
                            }
                        } catch (C e11) {
                            e11.f25146Y = true;
                            throw e11;
                        }
                    }
                    return bArr;
                }
                I((i14 - i11) - i12);
                throw C.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C.d();
    }
}
