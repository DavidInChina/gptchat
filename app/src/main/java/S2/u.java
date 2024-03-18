package s2;

import java.nio.charset.Charset;
import java.util.Arrays;
import x8.S;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f45190d = {'\r', '\n'};

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f45191e = {'\n'};

    /* renamed from: f  reason: collision with root package name */
    public static final S f45192f = S.U(5, w8.e.f48219a, w8.e.f48221c, w8.e.f48224f, w8.e.f48222d, w8.e.f48223e);

    /* renamed from: a  reason: collision with root package name */
    public byte[] f45193a;

    /* renamed from: b  reason: collision with root package name */
    public int f45194b;

    /* renamed from: c  reason: collision with root package name */
    public int f45195c;

    public u() {
        this.f45193a = AbstractC5530A.f45136f;
    }

    public final long A() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j6 = this.f45193a[this.f45194b];
        int i13 = 7;
        while (true) {
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j6) != 0) {
                i13--;
            } else if (i13 < 6) {
                j6 &= i12 - 1;
                i11 = 7 - i13;
            } else if (i13 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f45193a[this.f45194b + i10] & 192) == 128) {
                    j6 = (j6 << 6) | (b10 & 63);
                } else {
                    throw new NumberFormatException(android.gov.nist.core.a.f("Invalid UTF-8 sequence continuation byte: ", j6));
                }
            }
            this.f45194b += i11;
            return j6;
        }
        throw new NumberFormatException(android.gov.nist.core.a.f("Invalid UTF-8 sequence first byte: ", j6));
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f45193a;
            int i10 = this.f45194b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f45194b = i10 + 3;
                return w8.e.f48221c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f45193a;
            int i11 = this.f45194b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f45194b = i11 + 2;
                return w8.e.f48222d;
            } else if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f45194b = i11 + 2;
                return w8.e.f48223e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void C(int i10) {
        byte[] bArr = this.f45193a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        D(i10, bArr);
    }

    public final void D(int i10, byte[] bArr) {
        this.f45193a = bArr;
        this.f45195c = i10;
        this.f45194b = 0;
    }

    public final void E(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f45193a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        this.f45195c = i10;
    }

    public final void F(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f45195c) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        this.f45194b = i10;
    }

    public final void G(int i10) {
        F(this.f45194b + i10);
    }

    public final int a() {
        return this.f45195c - this.f45194b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f45193a;
        if (i10 > bArr.length) {
            this.f45193a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f45192f.contains(charset);
        Gi.e.k("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b10;
        int i10;
        byte b11;
        byte b12;
        boolean z10;
        boolean z11 = false;
        if ((charset.equals(w8.e.f48221c) || charset.equals(w8.e.f48219a)) && a() >= 1) {
            long j6 = this.f45193a[this.f45194b] & 255;
            char c10 = (char) j6;
            if (c10 == j6) {
                z10 = true;
            } else {
                z10 = false;
            }
            P4.a.q(z10, "Out of range: %s", j6);
            b10 = (byte) c10;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(w8.e.f48224f) || charset.equals(w8.e.f48222d)) && a() >= 2) {
                byte[] bArr = this.f45193a;
                int i11 = this.f45194b;
                b11 = bArr[i11];
                b12 = bArr[i11 + 1];
            } else if (!charset.equals(w8.e.f48223e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f45193a;
                int i12 = this.f45194b;
                b11 = bArr2[i12 + 1];
                b12 = bArr2[i12];
            }
            b10 = (byte) ((char) ((b12 & 255) | (b11 << 8)));
        }
        long j10 = b10;
        char c11 = (char) j10;
        if (c11 == j10) {
            z11 = true;
        }
        P4.a.q(z11, "Out of range: %s", j10);
        return (c11 << 16) + i10;
    }

    public final void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f45193a, this.f45194b, bArr, i10, i11);
        this.f45194b += i11;
    }

    public final char f(Charset charset, char[] cArr) {
        int d10 = d(charset);
        if (d10 != 0) {
            char c10 = (char) (d10 >> 16);
            for (char c11 : cArr) {
                if (c11 == c10) {
                    this.f45194b += d10 & 65535;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        this.f45194b = i10 + 4;
        return (bArr[i10 + 3] & 255) | i11 | ((bArr[i10 + 2] & 255) << 8);
    }

    public final String h(Charset charset) {
        int i10;
        boolean contains = f45192f.contains(charset);
        Gi.e.k("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = w8.e.f48219a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (!charset.equals(w8.e.f48221c) && !charset.equals(charset2)) {
            if (!charset.equals(w8.e.f48224f) && !charset.equals(w8.e.f48223e) && !charset.equals(w8.e.f48222d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f45194b;
        while (true) {
            int i12 = this.f45195c;
            if (i11 < i12 - (i10 - 1)) {
                if (charset.equals(w8.e.f48221c) || charset.equals(w8.e.f48219a)) {
                    byte b10 = this.f45193a[i11];
                    int i13 = AbstractC5530A.f45131a;
                    if (b10 != 10) {
                        if (b10 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (charset.equals(w8.e.f48224f) || charset.equals(w8.e.f48222d)) {
                    byte[] bArr = this.f45193a;
                    if (bArr[i11] == 0) {
                        byte b11 = bArr[i11 + 1];
                        int i14 = AbstractC5530A.f45131a;
                        if (b11 != 10) {
                            if (b11 == 13) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (charset.equals(w8.e.f48223e)) {
                    byte[] bArr2 = this.f45193a;
                    if (bArr2[i11 + 1] == 0) {
                        byte b12 = bArr2[i11];
                        int i15 = AbstractC5530A.f45131a;
                        if (b12 == 10 || b12 == 13) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String s10 = s(i11 - this.f45194b, charset);
        if (this.f45194b == this.f45195c) {
            return s10;
        }
        if (f(charset, f45190d) == '\r') {
            f(charset, f45191e);
        }
        return s10;
    }

    public final int i() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        this.f45194b = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long j() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        long j6 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40);
        this.f45194b = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | j6 | ((bArr[i10 + 6] & 255) << 48);
    }

    public final short k() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 2;
        return (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    public final long l() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("Top bit not zero: ", i10));
    }

    public final int n() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 2;
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public final long o() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        long j6 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24);
        this.f45194b = i10 + 8;
        return (bArr[i10 + 7] & 255) | j6 | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f45194b;
        while (i10 < this.f45195c && this.f45193a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f45193a;
        int i11 = this.f45194b;
        int i12 = AbstractC5530A.f45131a;
        String str = new String(bArr, i11, i10 - i11, w8.e.f48221c);
        this.f45194b = i10;
        if (i10 < this.f45195c) {
            this.f45194b = i10 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f45194b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f45195c && this.f45193a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f45193a;
        int i14 = AbstractC5530A.f45131a;
        String str = new String(bArr, i12, i11, w8.e.f48221c);
        this.f45194b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 2;
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    public final String s(int i10, Charset charset) {
        String str = new String(this.f45193a, this.f45194b, i10, charset);
        this.f45194b += i10;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long v() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 4;
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final int w() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        int i11 = (bArr[i10 + 1] & 255) << 8;
        this.f45194b = i10 + 3;
        return (bArr[i10 + 2] & 255) | i11 | ((bArr[i10] & 255) << 16);
    }

    public final int x() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(android.gov.nist.core.a.e("Top bit not zero: ", g10));
    }

    public final long y() {
        long o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(android.gov.nist.core.a.f("Top bit not zero: ", o10));
    }

    public final int z() {
        byte[] bArr = this.f45193a;
        int i10 = this.f45194b;
        this.f45194b = i10 + 2;
        return (bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8);
    }

    public u(int i10) {
        this.f45193a = new byte[i10];
        this.f45195c = i10;
    }

    public u(byte[] bArr) {
        this.f45193a = bArr;
        this.f45195c = bArr.length;
    }

    public u(int i10, byte[] bArr) {
        this.f45193a = bArr;
        this.f45195c = i10;
    }
}
