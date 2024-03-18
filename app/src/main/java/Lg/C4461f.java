package lg;

import fg.C3033a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: lg.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4461f {

    /* renamed from: c  reason: collision with root package name */
    public int f38381c;

    /* renamed from: e  reason: collision with root package name */
    public final InputStream f38383e;

    /* renamed from: f  reason: collision with root package name */
    public int f38384f;

    /* renamed from: i  reason: collision with root package name */
    public int f38387i;

    /* renamed from: h  reason: collision with root package name */
    public int f38386h = Integer.MAX_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f38379a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f38380b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f38382d = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f38385g = 0;

    public C4461f(InputStream inputStream) {
        this.f38383e = inputStream;
    }

    public final void a(int i10) {
        if (this.f38384f == i10) {
            return;
        }
        throw new t("Protocol message end-group tag did not match expected tag.");
    }

    public final int b() {
        int i10 = this.f38386h;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f38385g + this.f38382d);
    }

    public final void c(int i10) {
        this.f38386h = i10;
        o();
    }

    public final int d(int i10) {
        if (i10 >= 0) {
            int i11 = this.f38385g + this.f38382d + i10;
            int i12 = this.f38386h;
            if (i11 <= i12) {
                this.f38386h = i11;
                o();
                return i12;
            }
            throw t.a();
        }
        throw new t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final w e() {
        int k10 = k();
        int i10 = this.f38380b;
        int i11 = this.f38382d;
        if (k10 <= i10 - i11 && k10 > 0) {
            byte[] bArr = new byte[k10];
            System.arraycopy(this.f38379a, i11, bArr, 0, k10);
            w wVar = new w(bArr);
            this.f38382d += k10;
            return wVar;
        } else if (k10 == 0) {
            return AbstractC4460e.f38378Y;
        } else {
            return new w(h(k10));
        }
    }

    public final int f() {
        return k();
    }

    public final AbstractC4456a g(C3033a c3033a, C4464i c4464i) {
        int k10 = k();
        if (this.f38387i < 64) {
            int d10 = d(k10);
            this.f38387i++;
            p b10 = c3033a.b(this, c4464i);
            a(0);
            this.f38387i--;
            c(d10);
            return b10;
        }
        throw new t("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] h(int i10) {
        int i11;
        if (i10 <= 0) {
            if (i10 == 0) {
                return s.f38414a;
            }
            throw new t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i12 = this.f38385g;
        int i13 = this.f38382d;
        int i14 = i12 + i13 + i10;
        int i15 = this.f38386h;
        if (i14 <= i15) {
            byte[] bArr = this.f38379a;
            if (i10 < 4096) {
                byte[] bArr2 = new byte[i10];
                int i16 = this.f38380b - i13;
                System.arraycopy(bArr, i13, bArr2, 0, i16);
                int i17 = this.f38380b;
                this.f38382d = i17;
                int i18 = i10 - i16;
                if (i17 - i17 < i18) {
                    p(i18);
                }
                System.arraycopy(bArr, 0, bArr2, i16, i18);
                this.f38382d = i18;
                return bArr2;
            }
            int i19 = this.f38380b;
            this.f38385g = i12 + i19;
            this.f38382d = 0;
            this.f38380b = 0;
            int i20 = i19 - i13;
            int i21 = i10 - i20;
            ArrayList arrayList = new ArrayList();
            while (i21 > 0) {
                int min = Math.min(i21, 4096);
                byte[] bArr3 = new byte[min];
                int i22 = 0;
                while (i22 < min) {
                    InputStream inputStream = this.f38383e;
                    if (inputStream == null) {
                        i11 = -1;
                    } else {
                        i11 = inputStream.read(bArr3, i22, min - i22);
                    }
                    if (i11 != -1) {
                        this.f38385g += i11;
                        i22 += i11;
                    } else {
                        throw t.a();
                    }
                }
                i21 -= min;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i10];
            System.arraycopy(bArr, i13, bArr4, 0, i20);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i20, bArr5.length);
                i20 += bArr5.length;
            }
            return bArr4;
        }
        r((i15 - i12) - i13);
        throw t.a();
    }

    public final int i() {
        int i10 = this.f38382d;
        if (this.f38380b - i10 < 4) {
            p(4);
            i10 = this.f38382d;
        }
        this.f38382d = i10 + 4;
        byte[] bArr = this.f38379a;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long j() {
        int i10 = this.f38382d;
        if (this.f38380b - i10 < 8) {
            p(8);
            i10 = this.f38382d;
        }
        this.f38382d = i10 + 8;
        byte[] bArr = this.f38379a;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int k() {
        int i10;
        int i11;
        byte b10;
        int i12 = this.f38382d;
        int i13 = this.f38380b;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f38379a;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.f38382d = i14;
                return b11;
            } else if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                long j6 = i16;
                if (j6 < 0) {
                    i10 = (int) ((-128) ^ j6);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    long j10 = i18;
                    if (j10 >= 0) {
                        i10 = (int) (16256 ^ j10);
                    } else {
                        int i19 = i12 + 4;
                        long j11 = i18 ^ (bArr[i17] << 21);
                        if (j11 < 0) {
                            i10 = (int) ((-2080896) ^ j11);
                        } else {
                            i17 = i12 + 5;
                            int i20 = (int) ((i11 ^ (b10 << 28)) ^ 266354560);
                            if (bArr[i19] < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i21 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i21;
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
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f38382d = i15;
                return i10;
            }
        }
        return (int) m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if (r3[r2] < 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l() {
        long j6;
        long j10;
        long j11;
        int i10 = this.f38382d;
        int i11 = this.f38380b;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f38379a;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f38382d = i12;
                return b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j12 = (bArr[i12] << 7) ^ b10;
                if (j12 < 0) {
                    j10 = -128;
                } else {
                    int i14 = i10 + 3;
                    long j13 = j12 ^ (bArr[i13] << 14);
                    if (j13 >= 0) {
                        j11 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j12 = j13 ^ (bArr[i14] << 21);
                        if (j12 < 0) {
                            j10 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j13 = j12 ^ (bArr[i13] << 28);
                            if (j13 >= 0) {
                                j11 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j12 = j13 ^ (bArr[i14] << 35);
                                if (j12 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j13 = j12 ^ (bArr[i13] << 42);
                                    if (j13 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j12 = j13 ^ (bArr[i14] << 49);
                                        if (j12 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            int i15 = i10 + 9;
                                            long j14 = (j12 ^ (bArr[i13] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                i13 = i10 + 10;
                                            } else {
                                                i13 = i15;
                                            }
                                            j6 = j14;
                                            this.f38382d = i13;
                                            return j6;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i13 = i14;
                    j6 = j11 ^ j13;
                    this.f38382d = i13;
                    return j6;
                }
                j6 = j10 ^ j12;
                this.f38382d = i13;
                return j6;
            }
        }
        return m();
    }

    public final long m() {
        long j6 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f38382d == this.f38380b) {
                p(1);
            }
            int i11 = this.f38382d;
            this.f38382d = i11 + 1;
            byte b10 = this.f38379a[i11];
            j6 |= (b10 & Byte.MAX_VALUE) << i10;
            if ((b10 & 128) == 0) {
                return j6;
            }
        }
        throw new t("CodedInputStream encountered a malformed varint.");
    }

    public final int n() {
        if (this.f38382d == this.f38380b && !s(1)) {
            this.f38384f = 0;
            return 0;
        }
        int k10 = k();
        this.f38384f = k10;
        if ((k10 >>> 3) != 0) {
            return k10;
        }
        throw new t("Protocol message contained an invalid tag (zero).");
    }

    public final void o() {
        int i10 = this.f38380b + this.f38381c;
        this.f38380b = i10;
        int i11 = this.f38385g + i10;
        int i12 = this.f38386h;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f38381c = i13;
            this.f38380b = i10 - i13;
            return;
        }
        this.f38381c = 0;
    }

    public final void p(int i10) {
        if (s(i10)) {
            return;
        }
        throw t.a();
    }

    public final boolean q(int i10, C4462g c4462g) {
        int n10;
        int i11 = i10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                int i12 = i();
                                c4462g.v(i10);
                                c4462g.t(i12);
                                return true;
                            }
                            throw new t("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    c4462g.v(i10);
                    do {
                        n10 = n();
                        if (n10 == 0) {
                            break;
                        }
                    } while (q(n10, c4462g));
                    int i13 = ((i10 >>> 3) << 3) | 4;
                    a(i13);
                    c4462g.v(i13);
                    return true;
                }
                w e10 = e();
                c4462g.v(i10);
                c4462g.v(e10.size());
                c4462g.r(e10);
                return true;
            }
            long j6 = j();
            c4462g.v(i10);
            c4462g.u(j6);
            return true;
        }
        long l10 = l();
        c4462g.v(i10);
        c4462g.w(l10);
        return true;
    }

    public final void r(int i10) {
        int i11 = this.f38380b;
        int i12 = this.f38382d;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f38382d = i12 + i10;
        } else if (i10 >= 0) {
            int i14 = this.f38385g;
            int i15 = i14 + i12 + i10;
            int i16 = this.f38386h;
            if (i15 <= i16) {
                this.f38382d = i11;
                p(1);
                while (true) {
                    int i17 = i10 - i13;
                    int i18 = this.f38380b;
                    if (i17 > i18) {
                        i13 += i18;
                        this.f38382d = i18;
                        p(1);
                    } else {
                        this.f38382d = i17;
                        return;
                    }
                }
            } else {
                r((i16 - i14) - i12);
                throw t.a();
            }
        } else {
            throw new t("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean s(int i10) {
        InputStream inputStream;
        int i11 = this.f38382d;
        int i12 = i11 + i10;
        int i13 = this.f38380b;
        if (i12 > i13) {
            if (this.f38385g + i11 + i10 <= this.f38386h && (inputStream = this.f38383e) != null) {
                byte[] bArr = this.f38379a;
                if (i11 > 0) {
                    if (i13 > i11) {
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f38385g += i11;
                    this.f38380b -= i11;
                    this.f38382d = 0;
                }
                int i14 = this.f38380b;
                int read = inputStream.read(bArr, i14, bArr.length - i14);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read > 0) {
                        this.f38380b += read;
                        if ((this.f38385g + i10) - 67108864 <= 0) {
                            o();
                            if (this.f38380b >= i10) {
                                return true;
                            }
                            return s(i10);
                        }
                        throw new t("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i10);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }
}
