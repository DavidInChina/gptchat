package ji;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import ki.AbstractC4301a;
import livekit.org.webrtc.WebrtcBuildVersion;

/* renamed from: ji.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4135j implements AbstractC4137l, AbstractC4136k, Cloneable, ByteChannel {

    /* renamed from: Y  reason: collision with root package name */
    public C4117F f36720Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f36721Z;

    @Override // ji.AbstractC4137l
    public final long A(C4115D c4115d) {
        long j6 = this.f36721Z;
        if (j6 > 0) {
            c4115d.o(this, j6);
        }
        return j6;
    }

    public final void A0(long j6) {
        boolean z10;
        byte[] bArr;
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 == 0) {
            w0(48);
            return;
        }
        int i11 = 1;
        if (i10 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                S0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j6 < 100000000) {
            if (j6 < 10000) {
                if (j6 < 100) {
                    if (j6 >= 10) {
                        i11 = 2;
                    }
                } else if (j6 < 1000) {
                    i11 = 3;
                } else {
                    i11 = 4;
                }
            } else if (j6 < 1000000) {
                if (j6 < 100000) {
                    i11 = 5;
                } else {
                    i11 = 6;
                }
            } else if (j6 < 10000000) {
                i11 = 7;
            } else {
                i11 = 8;
            }
        } else if (j6 < 1000000000000L) {
            if (j6 < 10000000000L) {
                if (j6 < 1000000000) {
                    i11 = 9;
                } else {
                    i11 = 10;
                }
            } else if (j6 < 100000000000L) {
                i11 = 11;
            } else {
                i11 = 12;
            }
        } else if (j6 < 1000000000000000L) {
            if (j6 < 10000000000000L) {
                i11 = 13;
            } else if (j6 < 100000000000000L) {
                i11 = 14;
            } else {
                i11 = 15;
            }
        } else if (j6 < 100000000000000000L) {
            if (j6 < 10000000000000000L) {
                i11 = 16;
            } else {
                i11 = 17;
            }
        } else if (j6 < 1000000000000000000L) {
            i11 = 18;
        } else {
            i11 = 19;
        }
        if (z10) {
            i11++;
        }
        C4117F d02 = d0(i11);
        int i12 = d02.f36676c + i11;
        while (true) {
            int i13 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
            bArr = d02.f36674a;
            if (i13 == 0) {
                break;
            }
            long j10 = 10;
            i12--;
            bArr[i12] = AbstractC4301a.f37593a[(int) (j6 % j10)];
            j6 /= j10;
        }
        if (z10) {
            bArr[i12 - 1] = 45;
        }
        d02.f36676c += i11;
        this.f36721Z += i11;
    }

    @Override // ji.AbstractC4137l
    public final long C0() {
        long readLong = readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // ji.AbstractC4137l
    public final long D0(C4138m c4138m) {
        AbstractC3557B.c0("targetBytes", c4138m);
        return p(0L, c4138m);
    }

    public final C4133h F(C4133h c4133h) {
        AbstractC3557B.c0("unsafeCursor", c4133h);
        byte[] bArr = AbstractC4301a.f37593a;
        if (c4133h == AbstractC4127b.f36696a) {
            c4133h = new C4133h();
        }
        if (c4133h.f36711Y == null) {
            c4133h.f36711Y = this;
            c4133h.f36712Z = true;
            return c4133h;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public final void F0(long j6) {
        if (j6 == 0) {
            w0(48);
            return;
        }
        long j10 = (j6 >>> 1) | j6;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        C4117F d02 = d0(i10);
        int i11 = d02.f36676c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            d02.f36674a[i12] = AbstractC4301a.f37593a[(int) (15 & j6)];
            j6 >>>= 4;
        }
        d02.f36676c += i10;
        this.f36721Z += i10;
    }

    @Override // ji.AbstractC4137l
    public final boolean H() {
        if (this.f36721Z == 0) {
            return true;
        }
        return false;
    }

    public final void H0(int i10) {
        C4117F d02 = d0(4);
        int i11 = d02.f36676c;
        byte[] bArr = d02.f36674a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        d02.f36676c = i11 + 4;
        this.f36721Z += 4;
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k I(int i10) {
        w0(i10);
        return this;
    }

    @Override // ji.AbstractC4136k
    public final long I0(AbstractC4122K abstractC4122K) {
        AbstractC3557B.c0("source", abstractC4122K);
        long j6 = 0;
        while (true) {
            long g02 = abstractC4122K.g0(this, 8192L);
            if (g02 != -1) {
                j6 += g02;
            } else {
                return j6;
            }
        }
    }

    @Override // ji.AbstractC4137l
    public final void J0(long j6) {
        if (this.f36721Z >= j6) {
            return;
        }
        throw new EOFException();
    }

    @Override // ji.AbstractC4137l
    public final void K0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        long j10 = this.f36721Z;
        if (j10 >= j6) {
            c4135j.o(this, j6);
        } else {
            c4135j.o(this, j10);
            throw new EOFException();
        }
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k M(C4138m c4138m) {
        f0(c4138m);
        return this;
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k M0(long j6) {
        A0(j6);
        return this;
    }

    public final byte[] O(long j6) {
        if (j6 >= 0 && j6 <= 2147483647L) {
            if (this.f36721Z >= j6) {
                byte[] bArr = new byte[(int) j6];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount: ", j6).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[EDGE_INSN: B:42:0x00a4->B:37:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ji.j] */
    @Override // ji.AbstractC4137l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long O0() {
        int i10;
        if (this.f36721Z != 0) {
            int i11 = 0;
            boolean z10 = false;
            long j6 = 0;
            do {
                C4117F c4117f = this.f36720Y;
                AbstractC3557B.Z(c4117f);
                int i12 = c4117f.f36675b;
                int i13 = c4117f.f36676c;
                while (i12 < i13) {
                    byte b10 = c4117f.f36674a[i12];
                    if (b10 >= 48 && b10 <= 57) {
                        i10 = b10 - 48;
                    } else if (b10 >= 97 && b10 <= 102) {
                        i10 = b10 - 87;
                    } else if (b10 >= 65 && b10 <= 70) {
                        i10 = b10 - 55;
                    } else if (i11 != 0) {
                        z10 = true;
                        if (i12 != i13) {
                            this.f36720Y = c4117f.a();
                            AbstractC4118G.a(c4117f);
                        } else {
                            c4117f.f36675b = i12;
                        }
                        if (!z10) {
                            break;
                        }
                    } else {
                        char[] cArr = ki.b.f37594a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]})));
                    }
                    if ((j6 & (-1152921504606846976L)) == 0) {
                        j6 = (j6 << 4) | i10;
                        i12++;
                        i11++;
                    } else {
                        ?? obj = new Object();
                        obj.F0(j6);
                        obj.w0(b10);
                        throw new NumberFormatException("Number too large: ".concat(obj.V()));
                    }
                }
                if (i12 != i13) {
                }
                if (!z10) {
                }
            } while (this.f36720Y != null);
            this.f36721Z -= i11;
            return j6;
        }
        throw new EOFException();
    }

    public final short P() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    public final void P0(int i10) {
        C4117F d02 = d0(2);
        int i11 = d02.f36676c;
        byte[] bArr = d02.f36674a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        d02.f36676c = i11 + 2;
        this.f36721Z += 2;
    }

    @Override // ji.AbstractC4137l
    public final C4134i Q0() {
        return new C4134i(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ji.j] */
    @Override // ji.AbstractC4137l
    public final String R(long j6) {
        if (j6 >= 0) {
            long j10 = Long.MAX_VALUE;
            if (j6 != Long.MAX_VALUE) {
                j10 = j6 + 1;
            }
            long m10 = m((byte) 10, 0L, j10);
            if (m10 != -1) {
                return AbstractC4301a.a(this, m10);
            }
            if (j10 < this.f36721Z && k(j10 - 1) == 13 && k(j10) == 10) {
                return AbstractC4301a.a(this, j10);
            }
            ?? obj = new Object();
            j(0L, Math.min(32, this.f36721Z), obj);
            throw new EOFException("\\n not found: limit=" + Math.min(this.f36721Z, j6) + " content=" + obj.q(obj.f36721Z).e() + '\u2026');
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("limit < 0: ", j6).toString());
    }

    public final void R0(int i10, int i11, String str) {
        char charAt;
        char c10;
        AbstractC3557B.c0("string", str);
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= str.length()) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < '\u0080') {
                            C4117F d02 = d0(1);
                            int i12 = d02.f36676c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            byte[] bArr = d02.f36674a;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= '\u0080') {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = d02.f36676c;
                            int i15 = (i12 + i10) - i14;
                            d02.f36676c = i14 + i15;
                            this.f36721Z += i15;
                        } else {
                            if (charAt2 < '\u0800') {
                                C4117F d03 = d0(2);
                                int i16 = d03.f36676c;
                                byte[] bArr2 = d03.f36674a;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                d03.f36676c = i16 + 2;
                                this.f36721Z += 2;
                            } else if (charAt2 >= '\ud800' && charAt2 <= '\udfff') {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c10 = str.charAt(i17);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= '\udbff' && '\udc00' <= c10 && c10 < '\ue000') {
                                    int i18 = (((charAt2 & '\u03ff') << 10) | (c10 & '\u03ff')) + 65536;
                                    C4117F d04 = d0(4);
                                    int i19 = d04.f36676c;
                                    byte[] bArr3 = d04.f36674a;
                                    bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                    bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                    bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                    bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                    d04.f36676c = i19 + 4;
                                    this.f36721Z += 4;
                                    i10 += 2;
                                } else {
                                    w0(63);
                                    i10 = i17;
                                }
                            } else {
                                C4117F d05 = d0(3);
                                int i20 = d05.f36676c;
                                byte[] bArr4 = d05.f36674a;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                d05.f36676c = i20 + 3;
                                this.f36721Z += 3;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder q10 = android.gov.nist.core.a.q("endIndex > string.length: ", i11, " > ");
                q10.append(str.length());
                throw new IllegalArgumentException(q10.toString().toString());
            }
            throw new IllegalArgumentException(AbstractC2469q0.i("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("beginIndex < 0: ", i10).toString());
    }

    public final String S(long j6, Charset charset) {
        AbstractC3557B.c0("charset", charset);
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 >= 0 && j6 <= 2147483647L) {
            if (this.f36721Z >= j6) {
                if (i10 == 0) {
                    return "";
                }
                C4117F c4117f = this.f36720Y;
                AbstractC3557B.Z(c4117f);
                int i11 = c4117f.f36675b;
                if (i11 + j6 > c4117f.f36676c) {
                    return new String(O(j6), charset);
                }
                int i12 = (int) j6;
                String str = new String(c4117f.f36674a, i11, i12, charset);
                int i13 = c4117f.f36675b + i12;
                c4117f.f36675b = i13;
                this.f36721Z -= j6;
                if (i13 == c4117f.f36676c) {
                    this.f36720Y = c4117f.a();
                    AbstractC4118G.a(c4117f);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount: ", j6).toString());
    }

    public final void S0(String str) {
        AbstractC3557B.c0("string", str);
        R0(0, str.length(), str);
    }

    public final void T0(int i10) {
        String str;
        int i11 = 0;
        if (i10 < 128) {
            w0(i10);
        } else if (i10 < 2048) {
            C4117F d02 = d0(2);
            int i12 = d02.f36676c;
            byte[] bArr = d02.f36674a;
            bArr[i12] = (byte) ((i10 >> 6) | 192);
            bArr[1 + i12] = (byte) ((i10 & 63) | 128);
            d02.f36676c = i12 + 2;
            this.f36721Z += 2;
        } else if (55296 <= i10 && i10 < 57344) {
            w0(63);
        } else if (i10 < 65536) {
            C4117F d03 = d0(3);
            int i13 = d03.f36676c;
            byte[] bArr2 = d03.f36674a;
            bArr2[i13] = (byte) ((i10 >> 12) | 224);
            bArr2[1 + i13] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[2 + i13] = (byte) ((i10 & 63) | 128);
            d03.f36676c = i13 + 3;
            this.f36721Z += 3;
        } else if (i10 <= 1114111) {
            C4117F d04 = d0(4);
            int i14 = d04.f36676c;
            byte[] bArr3 = d04.f36674a;
            bArr3[i14] = (byte) ((i10 >> 18) | 240);
            bArr3[1 + i14] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[2 + i14] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[3 + i14] = (byte) ((i10 & 63) | 128);
            d04.f36676c = i14 + 4;
            this.f36721Z += 4;
        } else {
            StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
            if (i10 != 0) {
                char[] cArr = ki.b.f37594a;
                char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                while (i11 < 8 && cArr2[i11] == '0') {
                    i11++;
                }
                str = Lg.n.Y1(cArr2, i11, 8);
            } else {
                str = WebrtcBuildVersion.maint_version;
            }
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final String V() {
        return S(this.f36721Z, Lg.a.f11131a);
    }

    public final void a() {
        skip(this.f36721Z);
    }

    public final C4138m a0(int i10) {
        if (i10 == 0) {
            return C4138m.f36722i0;
        }
        AbstractC4127b.b(this.f36721Z, 0L, i10);
        C4117F c4117f = this.f36720Y;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            AbstractC3557B.Z(c4117f);
            int i14 = c4117f.f36676c;
            int i15 = c4117f.f36675b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                c4117f = c4117f.f36679f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        C4117F c4117f2 = this.f36720Y;
        int i16 = 0;
        while (i11 < i10) {
            AbstractC3557B.Z(c4117f2);
            bArr[i16] = c4117f2.f36674a;
            i11 += c4117f2.f36676c - c4117f2.f36675b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = c4117f2.f36675b;
            c4117f2.f36677d = true;
            i16++;
            c4117f2 = c4117f2.f36679f;
        }
        return new C4119H(bArr, iArr);
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k c0(String str) {
        S0(str);
        return this;
    }

    public final C4117F d0(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            C4117F c4117f = this.f36720Y;
            if (c4117f == null) {
                C4117F b10 = AbstractC4118G.b();
                this.f36720Y = b10;
                b10.f36680g = b10;
                b10.f36679f = b10;
                return b10;
            }
            C4117F c4117f2 = c4117f.f36680g;
            AbstractC3557B.Z(c4117f2);
            if (c4117f2.f36676c + i10 <= 8192 && c4117f2.f36678e) {
                return c4117f2;
            }
            C4117F b11 = AbstractC4118G.b();
            c4117f2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4135j) {
                long j6 = this.f36721Z;
                C4135j c4135j = (C4135j) obj;
                if (j6 == c4135j.f36721Z) {
                    if (j6 != 0) {
                        C4117F c4117f = this.f36720Y;
                        AbstractC3557B.Z(c4117f);
                        C4117F c4117f2 = c4135j.f36720Y;
                        AbstractC3557B.Z(c4117f2);
                        int i10 = c4117f.f36675b;
                        int i11 = c4117f2.f36675b;
                        long j10 = 0;
                        while (j10 < this.f36721Z) {
                            long min = Math.min(c4117f.f36676c - i10, c4117f2.f36676c - i11);
                            long j11 = 0;
                            while (j11 < min) {
                                int i12 = i10 + 1;
                                byte b10 = c4117f.f36674a[i10];
                                int i13 = i11 + 1;
                                if (b10 == c4117f2.f36674a[i11]) {
                                    j11++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == c4117f.f36676c) {
                                C4117F c4117f3 = c4117f.f36679f;
                                AbstractC3557B.Z(c4117f3);
                                i10 = c4117f3.f36675b;
                                c4117f = c4117f3;
                            }
                            if (i11 == c4117f2.f36676c) {
                                c4117f2 = c4117f2.f36679f;
                                AbstractC3557B.Z(c4117f2);
                                i11 = c4117f2.f36675b;
                            }
                            j10 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return C4124M.f36687d;
    }

    public final void f0(C4138m c4138m) {
        AbstractC3557B.c0("byteString", c4138m);
        c4138m.s(this, c4138m.d());
    }

    @Override // ji.AbstractC4122K
    public final long g0(C4135j c4135j, long j6) {
        AbstractC3557B.c0("sink", c4135j);
        if (j6 >= 0) {
            long j10 = this.f36721Z;
            if (j10 == 0) {
                return -1L;
            }
            if (j6 > j10) {
                j6 = j10;
            }
            c4135j.o(this, j6);
            return j6;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ji.j] */
    /* renamed from: h */
    public final C4135j clone() {
        ?? obj = new Object();
        if (this.f36721Z != 0) {
            C4117F c4117f = this.f36720Y;
            AbstractC3557B.Z(c4117f);
            C4117F c10 = c4117f.c();
            obj.f36720Y = c10;
            c10.f36680g = c10;
            c10.f36679f = c10;
            for (C4117F c4117f2 = c4117f.f36679f; c4117f2 != c4117f; c4117f2 = c4117f2.f36679f) {
                C4117F c4117f3 = c10.f36680g;
                AbstractC3557B.Z(c4117f3);
                AbstractC3557B.Z(c4117f2);
                c4117f3.b(c4117f2.c());
            }
            obj.f36721Z = this.f36721Z;
        }
        return obj;
    }

    @Override // ji.AbstractC4137l
    public final String h0(Charset charset) {
        return S(this.f36721Z, charset);
    }

    public final int hashCode() {
        C4117F c4117f = this.f36720Y;
        if (c4117f == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = c4117f.f36676c;
            for (int i12 = c4117f.f36675b; i12 < i11; i12++) {
                i10 = (i10 * 31) + c4117f.f36674a[i12];
            }
            c4117f = c4117f.f36679f;
            AbstractC3557B.Z(c4117f);
        } while (c4117f != this.f36720Y);
        return i10;
    }

    public final long i() {
        long j6 = this.f36721Z;
        if (j6 == 0) {
            return 0L;
        }
        C4117F c4117f = this.f36720Y;
        AbstractC3557B.Z(c4117f);
        C4117F c4117f2 = c4117f.f36680g;
        AbstractC3557B.Z(c4117f2);
        int i10 = c4117f2.f36676c;
        if (i10 < 8192 && c4117f2.f36678e) {
            j6 -= i10 - c4117f2.f36675b;
        }
        return j6;
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k i0(byte[] bArr, int i10, int i11) {
        u0(bArr, i10, i11);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j(long j6, long j10, C4135j c4135j) {
        AbstractC3557B.c0("out", c4135j);
        AbstractC4127b.b(this.f36721Z, j6, j10);
        if (j10 != 0) {
            c4135j.f36721Z += j10;
            C4117F c4117f = this.f36720Y;
            while (true) {
                AbstractC3557B.Z(c4117f);
                long j11 = c4117f.f36676c - c4117f.f36675b;
                if (j6 >= j11) {
                    j6 -= j11;
                    c4117f = c4117f.f36679f;
                }
            }
            while (j10 > 0) {
                AbstractC3557B.Z(c4117f);
                C4117F c10 = c4117f.c();
                int i10 = c10.f36675b + ((int) j6);
                c10.f36675b = i10;
                c10.f36676c = Math.min(i10 + ((int) j10), c10.f36676c);
                C4117F c4117f2 = c4135j.f36720Y;
                if (c4117f2 == null) {
                    c10.f36680g = c10;
                    c10.f36679f = c10;
                    c4135j.f36720Y = c10;
                } else {
                    C4117F c4117f3 = c4117f2.f36680g;
                    AbstractC3557B.Z(c4117f3);
                    c4117f3.b(c10);
                }
                j10 -= c10.f36676c - c10.f36675b;
                c4117f = c4117f.f36679f;
                j6 = 0;
            }
        }
    }

    public final byte k(long j6) {
        AbstractC4127b.b(this.f36721Z, j6, 1L);
        C4117F c4117f = this.f36720Y;
        if (c4117f != null) {
            long j10 = this.f36721Z;
            if (j10 - j6 < j6) {
                while (j10 > j6) {
                    c4117f = c4117f.f36680g;
                    AbstractC3557B.Z(c4117f);
                    j10 -= c4117f.f36676c - c4117f.f36675b;
                }
                return c4117f.f36674a[(int) ((c4117f.f36675b + j6) - j10)];
            }
            long j11 = 0;
            while (true) {
                int i10 = c4117f.f36676c;
                int i11 = c4117f.f36675b;
                long j12 = (i10 - i11) + j11;
                if (j12 <= j6) {
                    c4117f = c4117f.f36679f;
                    AbstractC3557B.Z(c4117f);
                    j11 = j12;
                } else {
                    return c4117f.f36674a[(int) ((i11 + j6) - j11)];
                }
            }
        } else {
            AbstractC3557B.Z(null);
            throw null;
        }
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k l0(long j6) {
        F0(j6);
        return this;
    }

    public final long m(byte b10, long j6, long j10) {
        C4117F c4117f;
        long j11 = 0;
        if (0 <= j6 && j6 <= j10) {
            long j12 = this.f36721Z;
            if (j10 > j12) {
                j10 = j12;
            }
            if (j6 == j10 || (c4117f = this.f36720Y) == null) {
                return -1L;
            }
            if (j12 - j6 < j6) {
                while (j12 > j6) {
                    c4117f = c4117f.f36680g;
                    AbstractC3557B.Z(c4117f);
                    j12 -= c4117f.f36676c - c4117f.f36675b;
                }
                while (j12 < j10) {
                    int min = (int) Math.min(c4117f.f36676c, (c4117f.f36675b + j10) - j12);
                    for (int i10 = (int) ((c4117f.f36675b + j6) - j12); i10 < min; i10++) {
                        if (c4117f.f36674a[i10] == b10) {
                            return (i10 - c4117f.f36675b) + j12;
                        }
                    }
                    j12 += c4117f.f36676c - c4117f.f36675b;
                    c4117f = c4117f.f36679f;
                    AbstractC3557B.Z(c4117f);
                    j6 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (c4117f.f36676c - c4117f.f36675b) + j11;
                if (j13 <= j6) {
                    c4117f = c4117f.f36679f;
                    AbstractC3557B.Z(c4117f);
                    j11 = j13;
                }
            }
            while (j11 < j10) {
                int min2 = (int) Math.min(c4117f.f36676c, (c4117f.f36675b + j10) - j11);
                for (int i11 = (int) ((c4117f.f36675b + j6) - j11); i11 < min2; i11++) {
                    if (c4117f.f36674a[i11] == b10) {
                        return (i11 - c4117f.f36675b) + j11;
                    }
                }
                j11 += c4117f.f36676c - c4117f.f36675b;
                c4117f = c4117f.f36679f;
                AbstractC3557B.Z(c4117f);
                j6 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f36721Z + " fromIndex=" + j6 + " toIndex=" + j10).toString());
    }

    public final void m0(byte[] bArr) {
        AbstractC3557B.c0("source", bArr);
        u0(bArr, 0, bArr.length);
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        C4117F c4117f;
        C4117F c4117f2;
        C4117F c4117f3;
        int i10;
        AbstractC3557B.c0("source", c4135j);
        if (c4135j != this) {
            AbstractC4127b.b(c4135j.f36721Z, 0L, j6);
            while (j6 > 0) {
                C4117F c4117f4 = c4135j.f36720Y;
                AbstractC3557B.Z(c4117f4);
                int i11 = c4117f4.f36676c;
                AbstractC3557B.Z(c4135j.f36720Y);
                int i12 = (j6 > (i11 - c4117f.f36675b) ? 1 : (j6 == (i11 - c4117f.f36675b) ? 0 : -1));
                int i13 = 0;
                if (i12 < 0) {
                    C4117F c4117f5 = this.f36720Y;
                    if (c4117f5 != null) {
                        c4117f2 = c4117f5.f36680g;
                    } else {
                        c4117f2 = null;
                    }
                    if (c4117f2 != null && c4117f2.f36678e) {
                        long j10 = c4117f2.f36676c + j6;
                        if (c4117f2.f36677d) {
                            i10 = 0;
                        } else {
                            i10 = c4117f2.f36675b;
                        }
                        if (j10 - i10 <= 8192) {
                            C4117F c4117f6 = c4135j.f36720Y;
                            AbstractC3557B.Z(c4117f6);
                            c4117f6.d(c4117f2, (int) j6);
                            c4135j.f36721Z -= j6;
                            this.f36721Z += j6;
                            return;
                        }
                    }
                    C4117F c4117f7 = c4135j.f36720Y;
                    AbstractC3557B.Z(c4117f7);
                    int i14 = (int) j6;
                    if (i14 > 0 && i14 <= c4117f7.f36676c - c4117f7.f36675b) {
                        if (i14 >= 1024) {
                            c4117f3 = c4117f7.c();
                        } else {
                            c4117f3 = AbstractC4118G.b();
                            int i15 = c4117f7.f36675b;
                            kf.q.X2(c4117f7.f36674a, 0, c4117f3.f36674a, i15, i15 + i14);
                        }
                        c4117f3.f36676c = c4117f3.f36675b + i14;
                        c4117f7.f36675b += i14;
                        C4117F c4117f8 = c4117f7.f36680g;
                        AbstractC3557B.Z(c4117f8);
                        c4117f8.b(c4117f3);
                        c4135j.f36720Y = c4117f3;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C4117F c4117f9 = c4135j.f36720Y;
                AbstractC3557B.Z(c4117f9);
                long j11 = c4117f9.f36676c - c4117f9.f36675b;
                c4135j.f36720Y = c4117f9.a();
                C4117F c4117f10 = this.f36720Y;
                if (c4117f10 == null) {
                    this.f36720Y = c4117f9;
                    c4117f9.f36680g = c4117f9;
                    c4117f9.f36679f = c4117f9;
                } else {
                    C4117F c4117f11 = c4117f10.f36680g;
                    AbstractC3557B.Z(c4117f11);
                    c4117f11.b(c4117f9);
                    C4117F c4117f12 = c4117f9.f36680g;
                    if (c4117f12 != c4117f9) {
                        AbstractC3557B.Z(c4117f12);
                        if (c4117f12.f36678e) {
                            int i16 = c4117f9.f36676c - c4117f9.f36675b;
                            C4117F c4117f13 = c4117f9.f36680g;
                            AbstractC3557B.Z(c4117f13);
                            int i17 = 8192 - c4117f13.f36676c;
                            C4117F c4117f14 = c4117f9.f36680g;
                            AbstractC3557B.Z(c4117f14);
                            if (!c4117f14.f36677d) {
                                C4117F c4117f15 = c4117f9.f36680g;
                                AbstractC3557B.Z(c4117f15);
                                i13 = c4117f15.f36675b;
                            }
                            if (i16 <= i17 + i13) {
                                C4117F c4117f16 = c4117f9.f36680g;
                                AbstractC3557B.Z(c4117f16);
                                c4117f9.d(c4117f16, i16);
                                c4117f9.a();
                                AbstractC4118G.a(c4117f9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                c4135j.f36721Z -= j11;
                this.f36721Z += j11;
                j6 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // ji.AbstractC4137l
    public final boolean o0(long j6) {
        if (this.f36721Z >= j6) {
            return true;
        }
        return false;
    }

    public final long p(long j6, C4138m c4138m) {
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3557B.c0("targetBytes", c4138m);
        long j10 = 0;
        if (j6 >= 0) {
            C4117F c4117f = this.f36720Y;
            if (c4117f == null) {
                return -1L;
            }
            long j11 = this.f36721Z;
            int i14 = ((j11 - j6) > j6 ? 1 : ((j11 - j6) == j6 ? 0 : -1));
            byte[] bArr = c4138m.f36723Y;
            if (i14 < 0) {
                while (j11 > j6) {
                    c4117f = c4117f.f36680g;
                    AbstractC3557B.Z(c4117f);
                    j11 -= c4117f.f36676c - c4117f.f36675b;
                }
                if (bArr.length == 2) {
                    byte b10 = bArr[0];
                    byte b11 = bArr[1];
                    while (j11 < this.f36721Z) {
                        i12 = (int) ((c4117f.f36675b + j6) - j11);
                        int i15 = c4117f.f36676c;
                        while (i12 < i15) {
                            byte b12 = c4117f.f36674a[i12];
                            if (b12 != b10 && b12 != b11) {
                                i12++;
                            } else {
                                i13 = c4117f.f36675b;
                            }
                        }
                        j11 += c4117f.f36676c - c4117f.f36675b;
                        c4117f = c4117f.f36679f;
                        AbstractC3557B.Z(c4117f);
                        j6 = j11;
                    }
                    return -1L;
                }
                while (j11 < this.f36721Z) {
                    i12 = (int) ((c4117f.f36675b + j6) - j11);
                    int i16 = c4117f.f36676c;
                    while (i12 < i16) {
                        byte b13 = c4117f.f36674a[i12];
                        for (byte b14 : bArr) {
                            if (b13 == b14) {
                                i13 = c4117f.f36675b;
                            }
                        }
                        i12++;
                    }
                    j11 += c4117f.f36676c - c4117f.f36675b;
                    c4117f = c4117f.f36679f;
                    AbstractC3557B.Z(c4117f);
                    j6 = j11;
                }
                return -1L;
                return (i12 - i13) + j11;
            }
            while (true) {
                long j12 = (c4117f.f36676c - c4117f.f36675b) + j10;
                if (j12 > j6) {
                    break;
                }
                c4117f = c4117f.f36679f;
                AbstractC3557B.Z(c4117f);
                j10 = j12;
            }
            if (bArr.length == 2) {
                byte b15 = bArr[0];
                byte b16 = bArr[1];
                while (j10 < this.f36721Z) {
                    i10 = (int) ((c4117f.f36675b + j6) - j10);
                    int i17 = c4117f.f36676c;
                    while (i10 < i17) {
                        byte b17 = c4117f.f36674a[i10];
                        if (b17 != b15 && b17 != b16) {
                            i10++;
                        } else {
                            i11 = c4117f.f36675b;
                        }
                    }
                    j10 += c4117f.f36676c - c4117f.f36675b;
                    c4117f = c4117f.f36679f;
                    AbstractC3557B.Z(c4117f);
                    j6 = j10;
                }
                return -1L;
            }
            while (j10 < this.f36721Z) {
                i10 = (int) ((c4117f.f36675b + j6) - j10);
                int i18 = c4117f.f36676c;
                while (i10 < i18) {
                    byte b18 = c4117f.f36674a[i10];
                    for (byte b19 : bArr) {
                        if (b18 == b19) {
                            i11 = c4117f.f36675b;
                        }
                    }
                    i10++;
                }
                j10 += c4117f.f36676c - c4117f.f36675b;
                c4117f = c4117f.f36679f;
                AbstractC3557B.Z(c4117f);
                j6 = j10;
            }
            return -1L;
            return (i10 - i11) + j10;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("fromIndex < 0: ", j6).toString());
    }

    @Override // ji.AbstractC4137l
    public final int p0(C4112A c4112a) {
        AbstractC3557B.c0("options", c4112a);
        int b10 = AbstractC4301a.b(this, c4112a, false);
        if (b10 == -1) {
            return -1;
        }
        skip(c4112a.f36658Y[b10].d());
        return b10;
    }

    @Override // ji.AbstractC4137l
    public final C4116E peek() {
        return R4.b.J(new C4114C(this));
    }

    @Override // ji.AbstractC4137l
    public final C4138m q(long j6) {
        if (j6 >= 0 && j6 <= 2147483647L) {
            if (this.f36721Z >= j6) {
                if (j6 >= 4096) {
                    C4138m a02 = a0((int) j6);
                    skip(j6);
                    return a02;
                }
                return new C4138m(O(j6));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount: ", j6).toString());
    }

    public final boolean r(long j6, C4138m c4138m) {
        AbstractC3557B.c0("bytes", c4138m);
        byte[] bArr = c4138m.f36723Y;
        int length = bArr.length;
        if (j6 < 0 || length < 0 || this.f36721Z - j6 < length || bArr.length < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (k(i10 + j6) != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC3557B.c0("sink", byteBuffer);
        C4117F c4117f = this.f36720Y;
        if (c4117f == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c4117f.f36676c - c4117f.f36675b);
        byteBuffer.put(c4117f.f36674a, c4117f.f36675b, min);
        int i10 = c4117f.f36675b + min;
        c4117f.f36675b = i10;
        this.f36721Z -= min;
        if (i10 == c4117f.f36676c) {
            this.f36720Y = c4117f.a();
            AbstractC4118G.a(c4117f);
        }
        return min;
    }

    @Override // ji.AbstractC4137l
    public final byte readByte() {
        if (this.f36721Z != 0) {
            C4117F c4117f = this.f36720Y;
            AbstractC3557B.Z(c4117f);
            int i10 = c4117f.f36675b;
            int i11 = c4117f.f36676c;
            int i12 = i10 + 1;
            byte b10 = c4117f.f36674a[i10];
            this.f36721Z--;
            if (i12 == i11) {
                this.f36720Y = c4117f.a();
                AbstractC4118G.a(c4117f);
            } else {
                c4117f.f36675b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // ji.AbstractC4137l
    public final void readFully(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int read = read(bArr, i10, bArr.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // ji.AbstractC4137l
    public final int readInt() {
        if (this.f36721Z >= 4) {
            C4117F c4117f = this.f36720Y;
            AbstractC3557B.Z(c4117f);
            int i10 = c4117f.f36675b;
            int i11 = c4117f.f36676c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = c4117f.f36674a;
            int i12 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
            int i13 = i10 + 3;
            int i14 = i10 + 4;
            int i15 = i12 | ((bArr[i10 + 2] & 255) << 8) | (bArr[i13] & 255);
            this.f36721Z -= 4;
            if (i14 == i11) {
                this.f36720Y = c4117f.a();
                AbstractC4118G.a(c4117f);
            } else {
                c4117f.f36675b = i14;
            }
            return i15;
        }
        throw new EOFException();
    }

    @Override // ji.AbstractC4137l
    public final long readLong() {
        if (this.f36721Z >= 8) {
            C4117F c4117f = this.f36720Y;
            AbstractC3557B.Z(c4117f);
            int i10 = c4117f.f36675b;
            int i11 = c4117f.f36676c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = c4117f.f36674a;
            long j6 = ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40);
            int i12 = i10 + 7;
            int i13 = i10 + 8;
            long j10 = j6 | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8) | (bArr[i12] & 255);
            this.f36721Z -= 8;
            if (i13 == i11) {
                this.f36720Y = c4117f.a();
                AbstractC4118G.a(c4117f);
            } else {
                c4117f.f36675b = i13;
            }
            return j10;
        }
        throw new EOFException();
    }

    @Override // ji.AbstractC4137l
    public final short readShort() {
        if (this.f36721Z >= 2) {
            C4117F c4117f = this.f36720Y;
            AbstractC3557B.Z(c4117f);
            int i10 = c4117f.f36675b;
            int i11 = c4117f.f36676c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i12 = i10 + 1;
            byte[] bArr = c4117f.f36674a;
            int i13 = i10 + 2;
            int i14 = (bArr[i12] & 255) | ((bArr[i10] & 255) << 8);
            this.f36721Z -= 2;
            if (i13 == i11) {
                this.f36720Y = c4117f.a();
                AbstractC4118G.a(c4117f);
            } else {
                c4117f.f36675b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // ji.AbstractC4137l
    public final void skip(long j6) {
        while (j6 > 0) {
            C4117F c4117f = this.f36720Y;
            if (c4117f != null) {
                int min = (int) Math.min(j6, c4117f.f36676c - c4117f.f36675b);
                long j10 = min;
                this.f36721Z -= j10;
                j6 -= j10;
                int i10 = c4117f.f36675b + min;
                c4117f.f36675b = i10;
                if (i10 == c4117f.f36676c) {
                    this.f36720Y = c4117f.a();
                    AbstractC4118G.a(c4117f);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // ji.AbstractC4137l
    public final String t0() {
        return R(Long.MAX_VALUE);
    }

    public final String toString() {
        long j6 = this.f36721Z;
        if (j6 <= 2147483647L) {
            return a0((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f36721Z).toString());
    }

    public final void u0(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("source", bArr);
        long j6 = i11;
        AbstractC4127b.b(bArr.length, i10, j6);
        int i12 = i11 + i10;
        while (i10 < i12) {
            C4117F d02 = d0(1);
            int min = Math.min(i12 - i10, 8192 - d02.f36676c);
            int i13 = i10 + min;
            kf.q.X2(bArr, d02.f36676c, d02.f36674a, i10, i13);
            d02.f36676c += min;
            i10 = i13;
        }
        this.f36721Z += j6;
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k v(int i10) {
        P0(i10);
        return this;
    }

    @Override // ji.AbstractC4137l
    public final int v0() {
        return AbstractC4127b.d(readInt());
    }

    public final void w0(int i10) {
        C4117F d02 = d0(1);
        int i11 = d02.f36676c;
        d02.f36676c = i11 + 1;
        d02.f36674a[i11] = (byte) i10;
        this.f36721Z++;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC3557B.c0("source", byteBuffer);
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            C4117F d02 = d0(1);
            int min = Math.min(i10, 8192 - d02.f36676c);
            byteBuffer.get(d02.f36674a, d02.f36676c, min);
            i10 -= min;
            d02.f36676c += min;
        }
        this.f36721Z += remaining;
        return remaining;
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k y(int i10) {
        H0(i10);
        return this;
    }

    @Override // ji.AbstractC4136k
    public final /* bridge */ /* synthetic */ AbstractC4136k z0(byte[] bArr) {
        m0(bArr);
        return this;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        AbstractC3557B.c0("sink", bArr);
        AbstractC4127b.b(bArr.length, i10, i11);
        C4117F c4117f = this.f36720Y;
        if (c4117f == null) {
            return -1;
        }
        int min = Math.min(i11, c4117f.f36676c - c4117f.f36675b);
        int i12 = c4117f.f36675b;
        kf.q.X2(c4117f.f36674a, i10, bArr, i12, i12 + min);
        int i13 = c4117f.f36675b + min;
        c4117f.f36675b = i13;
        this.f36721Z -= min;
        if (i13 == c4117f.f36676c) {
            this.f36720Y = c4117f.a();
            AbstractC4118G.a(c4117f);
        }
        return min;
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k N() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ji.AbstractC4120I
    public final void close() {
    }

    @Override // ji.AbstractC4137l
    public final C4135j d() {
        return this;
    }

    @Override // ji.AbstractC4136k, ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
    }

    @Override // ji.AbstractC4136k
    public final AbstractC4136k u() {
        return this;
    }
}
