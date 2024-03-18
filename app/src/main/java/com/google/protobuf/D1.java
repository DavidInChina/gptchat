package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D1 extends AbstractC2508h {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f27392c;

    public static int a0(long j6, byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return F1.d(i10, C1.g(j6, bArr), C1.g(j6 + 1, bArr));
                }
                throw new AssertionError();
            }
            return F1.c(i10, C1.g(j6, bArr));
        }
        D1 d12 = F1.f27398a;
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String W(byte[] bArr, int i10, int i11) {
        switch (this.f27392c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                    int i12 = i10 + i11;
                    char[] cArr = new char[i11];
                    int i13 = 0;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (AbstractC2508h.b(b10)) {
                            i10++;
                            cArr[i13] = (char) b10;
                            i13++;
                        } else {
                            int i14 = i13;
                            while (i10 < i12) {
                                int i15 = i10 + 1;
                                byte b11 = bArr[i10];
                                if (AbstractC2508h.b(b11)) {
                                    int i16 = i14 + 1;
                                    cArr[i14] = (char) b11;
                                    while (i15 < i12) {
                                        byte b12 = bArr[i15];
                                        if (AbstractC2508h.b(b12)) {
                                            i15++;
                                            cArr[i16] = (char) b12;
                                            i16++;
                                        } else {
                                            i14 = i16;
                                            i10 = i15;
                                        }
                                    }
                                    i14 = i16;
                                    i10 = i15;
                                } else if (b11 < -32) {
                                    if (i15 < i12) {
                                        i10 += 2;
                                        AbstractC2508h.c(b11, bArr[i15], cArr, i14);
                                        i14++;
                                    } else {
                                        throw C2540t0.b();
                                    }
                                } else if (b11 < -16) {
                                    if (i15 < i12 - 1) {
                                        int i17 = i10 + 2;
                                        i10 += 3;
                                        AbstractC2508h.d(b11, bArr[i15], bArr[i17], cArr, i14);
                                        i14++;
                                    } else {
                                        throw C2540t0.b();
                                    }
                                } else if (i15 < i12 - 2) {
                                    byte b13 = bArr[i15];
                                    int i18 = i10 + 3;
                                    i10 += 4;
                                    AbstractC2508h.a(b11, b13, bArr[i10 + 2], bArr[i18], cArr, i14);
                                    i14 += 2;
                                } else {
                                    throw C2540t0.b();
                                }
                            }
                            return new String(cArr, 0, i14);
                        }
                    }
                    int i142 = i13;
                    while (i10 < i12) {
                    }
                    return new String(cArr, 0, i142);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            default:
                Charset charset = AbstractC2536r0.f27584a;
                String str = new String(bArr, i10, i11, charset);
                if (!str.contains("\ufffd") || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    return str;
                }
                throw C2540t0.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String X(ByteBuffer byteBuffer, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        switch (this.f27392c) {
            case 0:
                return AbstractC2508h.J(byteBuffer, i10, i11);
            default:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                    long j6 = C1.f27385c.j(C1.f27389g, byteBuffer) + i10;
                    long j10 = i11 + j6;
                    char[] cArr = new char[i11];
                    int i12 = 0;
                    while (j6 < j10) {
                        byte e10 = C1.f27385c.e(j6);
                        if (AbstractC2508h.b(e10)) {
                            j6++;
                            cArr[i12] = (char) e10;
                            i12++;
                        } else {
                            while (j6 < j10) {
                                long j11 = j6 + 1;
                                B1 b1 = C1.f27385c;
                                byte e11 = b1.e(j6);
                                if (AbstractC2508h.b(e11)) {
                                    int i13 = i12 + 1;
                                    cArr[i12] = (char) e11;
                                    while (j11 < j10) {
                                        byte e12 = C1.f27385c.e(j11);
                                        if (AbstractC2508h.b(e12)) {
                                            j11++;
                                            cArr[i13] = (char) e12;
                                            i13++;
                                        } else {
                                            i12 = i13;
                                            j6 = j11;
                                        }
                                    }
                                    i12 = i13;
                                    j6 = j11;
                                } else {
                                    if (e11 < -32) {
                                        z10 = z12;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        if (j11 < j10) {
                                            j6 += 2;
                                            AbstractC2508h.c(e11, b1.e(j11), cArr, i12);
                                            i12++;
                                        } else {
                                            throw C2540t0.b();
                                        }
                                    } else {
                                        if (e11 < -16) {
                                            z11 = z12;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            if (j11 < j10 - 1) {
                                                long j12 = j6 + 2;
                                                j6 += 3;
                                                AbstractC2508h.d(e11, b1.e(j11), b1.e(j12), cArr, i12);
                                                i12++;
                                            } else {
                                                throw C2540t0.b();
                                            }
                                        } else if (j11 < j10 - 2) {
                                            long j13 = j6 + 3;
                                            j6 += 4;
                                            AbstractC2508h.a(e11, b1.e(j11), b1.e(j6 + 2), b1.e(j13), cArr, i12);
                                            i12 += 2;
                                        } else {
                                            throw C2540t0.b();
                                        }
                                    }
                                }
                                z12 = true;
                            }
                            return new String(cArr, 0, i12);
                        }
                    }
                    while (j6 < j10) {
                    }
                    return new String(cArr, 0, i12);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Y(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        char charAt;
        long j6;
        int i13;
        char charAt2;
        char c10 = '\u0800';
        char c11 = '\u0080';
        switch (this.f27392c) {
            case 0:
                int length = charSequence.length();
                int i14 = i11 + i10;
                int i15 = 0;
                while (i15 < length) {
                    int i16 = i15 + i10;
                    if (i16 < i14 && (charAt = charSequence.charAt(i15)) < '\u0080') {
                        bArr[i16] = (byte) charAt;
                        i15++;
                    }
                    if (i15 != length) {
                        return i10 + length;
                    }
                    int i17 = i10 + i15;
                    while (i15 < length) {
                        char charAt3 = charSequence.charAt(i15);
                        if (charAt3 < '\u0080' && i17 < i14) {
                            bArr[i17] = (byte) charAt3;
                            i17++;
                        } else if (charAt3 < '\u0800' && i17 <= i14 - 2) {
                            int i18 = i17 + 1;
                            bArr[i17] = (byte) ((charAt3 >>> 6) | 960);
                            i17 += 2;
                            bArr[i18] = (byte) ((charAt3 & '?') | 128);
                        } else if ((charAt3 < '\ud800' || '\udfff' < charAt3) && i17 <= i14 - 3) {
                            bArr[i17] = (byte) ((charAt3 >>> '\f') | 480);
                            int i19 = i17 + 2;
                            bArr[i17 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                            i17 += 3;
                            bArr[i19] = (byte) ((charAt3 & '?') | 128);
                        } else if (i17 <= i14 - 4) {
                            int i20 = i15 + 1;
                            if (i20 != charSequence.length()) {
                                char charAt4 = charSequence.charAt(i20);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i21 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i21] = (byte) ((codePoint & 63) | 128);
                                    i15 = i20;
                                } else {
                                    i15 = i20;
                                }
                            }
                            throw new E1(i15 - 1, length);
                        } else if ('\ud800' <= charAt3 && charAt3 <= '\udfff' && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt3, charSequence.charAt(i12)))) {
                            throw new E1(i15, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i17);
                        }
                        i15++;
                    }
                    return i17;
                }
                if (i15 != length) {
                }
                break;
            default:
                long j10 = i10;
                long j11 = i11 + j10;
                int length2 = charSequence.length();
                if (length2 <= i11 && bArr.length - i11 >= i10) {
                    int i22 = 0;
                    while (i22 < length2 && (charAt2 = charSequence.charAt(i22)) < '\u0080') {
                        C1.o(bArr, j10, (byte) charAt2);
                        i22++;
                        j10++;
                    }
                    if (i22 != length2) {
                        while (i22 < length2) {
                            char charAt5 = charSequence.charAt(i22);
                            if (charAt5 < c11 && j10 < j11) {
                                C1.o(bArr, j10, (byte) charAt5);
                                j6 = j11;
                                j10++;
                            } else if (charAt5 < c10 && j10 <= j11 - 2) {
                                long j12 = j10 + 1;
                                C1.o(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                                j10 += 2;
                                C1.o(bArr, j12, (byte) ((charAt5 & '?') | c11));
                                j6 = j11;
                            } else if ((charAt5 >= '\ud800' && '\udfff' >= charAt5) || j10 > j11 - 3) {
                                j6 = j11;
                                if (j10 <= j6 - 4) {
                                    int i23 = i22 + 1;
                                    if (i23 != length2) {
                                        char charAt6 = charSequence.charAt(i23);
                                        if (Character.isSurrogatePair(charAt5, charAt6)) {
                                            int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                            C1.o(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                            C1.o(bArr, j10 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j13 = 3 + j10;
                                            C1.o(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j10 += 4;
                                            C1.o(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                            i22 = i23;
                                        } else {
                                            i22 = i23;
                                        }
                                    }
                                    throw new E1(i22 - 1, length2);
                                } else if ('\ud800' <= charAt5 && charAt5 <= '\udfff' && ((i13 = i22 + 1) == length2 || !Character.isSurrogatePair(charAt5, charSequence.charAt(i13)))) {
                                    throw new E1(i22, length2);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j10);
                                }
                            } else {
                                C1.o(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                                j6 = j11;
                                long j14 = j10 + 2;
                                C1.o(bArr, j10 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                                j10 += 3;
                                C1.o(bArr, j14, (byte) ((charAt5 & '?') | 128));
                            }
                            i22++;
                            j11 = j6;
                            c10 = '\u0800';
                            c11 = '\u0080';
                        }
                    }
                    return (int) j10;
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length2 - 1) + " at index " + (i10 + i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        r1 = r7 + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r1 > r0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if ((com.google.protobuf.C1.f27385c.j(com.google.protobuf.C1.f27388f + r3, r25) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        r3 = r3 + 8;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r7 >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        r10 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (com.google.protobuf.C1.g(r3, r25) >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        r7 = r7 + 1;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        r7 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int Z(int i10, int i11, byte[] bArr) {
        int i12;
        int i13 = i10;
        switch (this.f27392c) {
            case 0:
                while (i13 < i11 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i11) {
                    while (i13 < i11) {
                        int i14 = i13 + 1;
                        byte b10 = bArr[i13];
                        if (b10 < 0) {
                            if (b10 < -32) {
                                if (i14 >= i11) {
                                    return b10;
                                }
                                if (b10 >= -62) {
                                    i13 += 2;
                                    if (bArr[i14] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b10 < -16) {
                                if (i14 >= i11 - 1) {
                                    return F1.a(bArr, i14, i11);
                                }
                                int i15 = i13 + 2;
                                byte b11 = bArr[i14];
                                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                    i13 += 3;
                                    if (bArr[i15] > -65) {
                                    }
                                }
                            } else if (i14 >= i11 - 2) {
                                return F1.a(bArr, i14, i11);
                            } else {
                                int i16 = i13 + 2;
                                byte b12 = bArr[i14];
                                if (b12 <= -65 && (((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                                    int i17 = i13 + 3;
                                    if (bArr[i16] <= -65) {
                                        i13 += 4;
                                        if (bArr[i17] > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i13 = i14;
                    }
                }
                return 0;
            default:
                if ((i13 | i11 | (bArr.length - i11)) >= 0) {
                    long j6 = i13;
                    int i18 = (int) (i11 - j6);
                    if (i18 < 16) {
                        i12 = 0;
                    } else {
                        int i19 = 8 - (((int) j6) & 7);
                        long j10 = j6;
                        i12 = 0;
                        while (true) {
                            if (i12 < i19) {
                                long j11 = j10 + 1;
                                if (C1.g(j10, bArr) >= 0) {
                                    i12++;
                                    j10 = j11;
                                }
                            }
                        }
                    }
                    int i20 = i18 - i12;
                    long j12 = j6 + i12;
                    while (true) {
                        byte b13 = 0;
                        while (true) {
                            if (i20 > 0) {
                                long j13 = j12 + 1;
                                b13 = C1.g(j12, bArr);
                                if (b13 >= 0) {
                                    i20--;
                                    j12 = j13;
                                } else {
                                    j12 = j13;
                                }
                            }
                        }
                        if (i20 == 0) {
                            return 0;
                        }
                        int i21 = i20 - 1;
                        if (b13 < -32) {
                            if (i21 == 0) {
                                return b13;
                            }
                            i20 -= 2;
                            if (b13 < -62) {
                                break;
                            } else {
                                long j14 = j12 + 1;
                                if (C1.g(j12, bArr) > -65) {
                                    break;
                                } else {
                                    j12 = j14;
                                }
                            }
                        } else if (b13 < -16) {
                            if (i21 < 2) {
                                return a0(j12, bArr, b13, i21);
                            }
                            i20 -= 3;
                            long j15 = j12 + 1;
                            byte g10 = C1.g(j12, bArr);
                            if (g10 <= -65 && ((b13 != -32 || g10 >= -96) && (b13 != -19 || g10 < -96))) {
                                j12 += 2;
                                if (C1.g(j15, bArr) > -65) {
                                    break;
                                }
                            }
                        } else if (i21 < 3) {
                            return a0(j12, bArr, b13, i21);
                        } else {
                            i20 -= 4;
                            long j16 = j12 + 1;
                            byte g11 = C1.g(j12, bArr);
                            if (g11 <= -65 && (((g11 + 112) + (b13 << 28)) >> 30) == 0) {
                                long j17 = 2 + j12;
                                if (C1.g(j16, bArr) > -65) {
                                    break;
                                } else {
                                    j12 += 3;
                                    if (C1.g(j17, bArr) > -65) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                break;
        }
    }
}
