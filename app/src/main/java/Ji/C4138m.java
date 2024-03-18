package ji;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: ji.m */
/* loaded from: classes.dex */
public class C4138m implements Serializable, Comparable {

    /* renamed from: i0 */
    public static final C4138m f36722i0 = new C4138m(new byte[0]);

    /* renamed from: Y */
    public final byte[] f36723Y;

    /* renamed from: Z */
    public transient int f36724Z;

    /* renamed from: h0 */
    public transient String f36725h0;

    public C4138m(byte[] bArr) {
        AbstractC3557B.c0("data", bArr);
        this.f36723Y = bArr;
    }

    public static int g(C4138m c4138m, C4138m c4138m2) {
        c4138m.getClass();
        AbstractC3557B.c0("other", c4138m2);
        return c4138m.f(0, c4138m2.f36723Y);
    }

    public static int k(C4138m c4138m, C4138m c4138m2) {
        c4138m.getClass();
        AbstractC3557B.c0("other", c4138m2);
        return c4138m.j(-1234567890, c4138m2.f36723Y);
    }

    public static /* synthetic */ C4138m o(C4138m c4138m, int i10, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = -1234567890;
        }
        return c4138m.n(i10, i11);
    }

    public String a() {
        byte[] bArr = AbstractC4126a.f36695a;
        byte[] bArr2 = this.f36723Y;
        AbstractC3557B.c0("<this>", bArr2);
        AbstractC3557B.c0("map", bArr);
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr2[i10];
            int i12 = i10 + 2;
            byte b11 = bArr2[i10 + 1];
            i10 += 3;
            byte b12 = bArr2[i12];
            bArr3[i11] = bArr[(b10 & 255) >> 2];
            bArr3[i11 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr3[i11 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr3[i13] = bArr[b12 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i14 = i10 + 1;
                byte b13 = bArr2[i10];
                byte b14 = bArr2[i14];
                bArr3[i11] = bArr[(b13 & 255) >> 2];
                bArr3[i11 + 1] = bArr[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
                bArr3[i11 + 2] = bArr[(b14 & 15) << 2];
                bArr3[i11 + 3] = 61;
            }
        } else {
            byte b15 = bArr2[i10];
            bArr3[i11] = bArr[(b15 & 255) >> 2];
            bArr3[i11 + 1] = bArr[(b15 & 3) << 4];
            bArr3[i11 + 2] = 61;
            bArr3[i11 + 3] = 61;
        }
        return new String(bArr3, Lg.a.f11131a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L9;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(C4138m c4138m) {
        AbstractC3557B.c0("other", c4138m);
        int d10 = d();
        int d11 = c4138m.d();
        int min = Math.min(d10, d11);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = i(i10) & 255;
            int i12 = c4138m.i(i10) & 255;
            if (i11 == i12) {
            }
        }
        if (d10 == d11) {
            return 0;
        }
    }

    public C4138m c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f36723Y, 0, d());
        byte[] digest = messageDigest.digest();
        AbstractC3557B.Z(digest);
        return new C4138m(digest);
    }

    public int d() {
        return this.f36723Y.length;
    }

    public String e() {
        byte[] bArr = this.f36723Y;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = ki.b.f37594a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4138m) {
            C4138m c4138m = (C4138m) obj;
            int d10 = c4138m.d();
            byte[] bArr = this.f36723Y;
            if (d10 == bArr.length && c4138m.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i10, byte[] bArr) {
        AbstractC3557B.c0("other", bArr);
        byte[] bArr2 = this.f36723Y;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!AbstractC4127b.a(bArr2, max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f36723Y;
    }

    public int hashCode() {
        int i10 = this.f36724Z;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f36723Y);
            this.f36724Z = hashCode;
            return hashCode;
        }
        return i10;
    }

    public byte i(int i10) {
        return this.f36723Y[i10];
    }

    public int j(int i10, byte[] bArr) {
        AbstractC3557B.c0("other", bArr);
        int c10 = AbstractC4127b.c(i10, this);
        byte[] bArr2 = this.f36723Y;
        for (int min = Math.min(c10, bArr2.length - bArr.length); -1 < min; min--) {
            if (AbstractC4127b.a(bArr2, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i10, int i11, int i12, byte[] bArr) {
        AbstractC3557B.c0("other", bArr);
        if (i10 >= 0) {
            byte[] bArr2 = this.f36723Y;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && AbstractC4127b.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public boolean m(int i10, C4138m c4138m, int i11) {
        AbstractC3557B.c0("other", c4138m);
        return c4138m.l(0, i10, i11, this.f36723Y);
    }

    public C4138m n(int i10, int i11) {
        int c10 = AbstractC4127b.c(i11, this);
        if (i10 >= 0) {
            byte[] bArr = this.f36723Y;
            if (c10 <= bArr.length) {
                if (c10 - i10 >= 0) {
                    if (i10 == 0 && c10 == bArr.length) {
                        return this;
                    }
                    return new C4138m(kf.q.b3(bArr, i10, c10));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(AbstractC2469q0.j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public C4138m p() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f36723Y;
            if (i10 < bArr.length) {
                byte b10 = bArr[i10];
                if (b10 >= 65 && b10 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    AbstractC3557B.b0("copyOf(...)", copyOf);
                    copyOf[i10] = (byte) (b10 + 32);
                    for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                        byte b11 = copyOf[i11];
                        if (b11 >= 65 && b11 <= 90) {
                            copyOf[i11] = (byte) (b11 + 32);
                        }
                    }
                    return new C4138m(copyOf);
                }
                i10++;
            } else {
                return this;
            }
        }
    }

    public byte[] q() {
        byte[] bArr = this.f36723Y;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC3557B.b0("copyOf(...)", copyOf);
        return copyOf;
    }

    public final String r() {
        String str = this.f36725h0;
        if (str == null) {
            byte[] h10 = h();
            AbstractC3557B.c0("<this>", h10);
            String str2 = new String(h10, Lg.a.f11131a);
            this.f36725h0 = str2;
            return str2;
        }
        return str;
    }

    public void s(C4135j c4135j, int i10) {
        AbstractC3557B.c0("buffer", c4135j);
        c4135j.u0(this.f36723Y, 0, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0120, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0124, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0130, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x015c, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0163, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x016a, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x019b, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x019e, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a1, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a4, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007a, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c8, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e8, code lost:
        if (r6 == 64) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f0, code lost:
        if (r6 == 64) goto L146;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        C4138m c4138m;
        int i10;
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        byte[] bArr = this.f36723Y;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        loop0: while (true) {
            if (i16 >= length) {
                break;
            }
            byte b11 = bArr[i16];
            if (b11 >= 0) {
                int i19 = i18 + 1;
                if (i18 == 64) {
                    break;
                } else if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (Byte.MAX_VALUE <= b11 && b11 < 160))) || b11 == 65533) {
                    break;
                } else {
                    if (b11 < 65536) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    i17 += i10;
                    i16++;
                    while (true) {
                        i18 = i19;
                        if (i16 < length && (b10 = bArr[i16]) >= 0) {
                            i16++;
                            i19 = i18 + 1;
                            if (i18 == 64) {
                                break loop0;
                            } else if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (Byte.MAX_VALUE <= b10 && b10 < 160))) || b10 == 65533) {
                                break loop0;
                            } else {
                                if (b10 < 65536) {
                                    i11 = 1;
                                } else {
                                    i11 = 2;
                                }
                                i17 += i11;
                            }
                        }
                    }
                }
            } else if ((b11 >> 5) == -2) {
                int i20 = i16 + 1;
                if (length > i20) {
                    byte b12 = bArr[i20];
                    if ((b12 & 192) == 128) {
                        int i21 = (b12 ^ 3968) ^ (b11 << 6);
                        if (i21 >= 128) {
                            i12 = i18 + 1;
                            if (i18 == 64) {
                                break;
                            } else if ((i21 != 10 && i21 != 13 && ((i21 >= 0 && i21 < 32) || (127 <= i21 && i21 < 160))) || i21 == 65533) {
                                break;
                            } else {
                                if (i21 < 65536) {
                                    i15 = 1;
                                } else {
                                    i15 = 2;
                                }
                                i17 += i15;
                                i16 += 2;
                                i18 = i12;
                            }
                        }
                    }
                }
            } else if ((b11 >> 4) == -2) {
                int i22 = i16 + 2;
                if (length > i22) {
                    byte b13 = bArr[i16 + 1];
                    if ((b13 & 192) == 128) {
                        byte b14 = bArr[i22];
                        if ((b14 & 192) == 128) {
                            int i23 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                            if (i23 >= 2048) {
                                if (55296 > i23 || i23 >= 57344) {
                                    i12 = i18 + 1;
                                    if (i18 == 64) {
                                        break;
                                    } else if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                                        break;
                                    } else {
                                        if (i23 < 65536) {
                                            i14 = 1;
                                        } else {
                                            i14 = 2;
                                        }
                                        i17 += i14;
                                        i16 += 3;
                                        i18 = i12;
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((b11 >> 3) == -2) {
                int i24 = i16 + 3;
                if (length > i24) {
                    byte b15 = bArr[i16 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i16 + 2];
                        if ((b16 & 192) == 128) {
                            byte b17 = bArr[i24];
                            if ((b17 & 192) == 128) {
                                int i25 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                                if (i25 <= 1114111) {
                                    if (55296 > i25 || i25 >= 57344) {
                                        if (i25 >= 65536) {
                                            i12 = i18 + 1;
                                            if (i18 == 64) {
                                                break;
                                            } else if ((i25 != 10 && i25 != 13 && ((i25 >= 0 && i25 < 32) || (127 <= i25 && i25 < 160))) || i25 == 65533) {
                                                break;
                                            } else {
                                                if (i25 < 65536) {
                                                    i13 = 1;
                                                } else {
                                                    i13 = 2;
                                                }
                                                i17 += i13;
                                                i16 += 4;
                                                i18 = i12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i17 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + e() + ']';
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(bArr.length);
            sb2.append(" hex=");
            int c10 = AbstractC4127b.c(64, this);
            if (c10 <= bArr.length) {
                if (c10 >= 0) {
                    if (c10 == bArr.length) {
                        c4138m = this;
                    } else {
                        c4138m = new C4138m(kf.q.b3(bArr, 0, c10));
                    }
                    sb2.append(c4138m.e());
                    sb2.append("\u2026]");
                    return sb2.toString();
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(AbstractC2469q0.j(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        String r10 = r();
        String substring = r10.substring(0, i17);
        AbstractC3557B.b0("substring(...)", substring);
        String A22 = Lg.n.A2(Lg.n.A2(Lg.n.A2(substring, "\\", "\\\\"), Separators.RETURN, "\\n"), "\r", "\\r");
        if (i17 < r10.length()) {
            return R.a.s(new StringBuilder("[size="), bArr.length, " text=", A22, "\u2026]");
        }
        return android.gov.nist.core.a.h("[text=", A22, ']');
    }
}
