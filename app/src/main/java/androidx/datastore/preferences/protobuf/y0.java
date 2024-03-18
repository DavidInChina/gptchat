package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public final class y0 extends V {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f25137c;

    public static int n(long j6, byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return A0.d(i10, x0.f(j6, bArr), x0.f(j6 + 1, bArr));
                }
                throw new AssertionError();
            }
            return A0.c(i10, x0.f(j6, bArr));
        }
        y0 y0Var = A0.f24958a;
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k(byte[] bArr, int i10, int i11) {
        int i12 = 1;
        byte b10 = -16;
        byte b11 = -32;
        switch (this.f25137c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                    int i13 = i10 + i11;
                    char[] cArr = new char[i11];
                    int i14 = i10;
                    int i15 = 0;
                    while (i14 < i13) {
                        byte b12 = bArr[i14];
                        if (!V.b(b12)) {
                            while (true) {
                                int i16 = 1;
                                if (i14 >= i13) {
                                    int i17 = i14 + 1;
                                    byte b13 = bArr[i14];
                                    if (V.b(b13)) {
                                        int i18 = i15 + 1;
                                        cArr[i15] = (char) b13;
                                        while (i17 < i13) {
                                            byte b14 = bArr[i17];
                                            if (V.b(b14)) {
                                                i17 += i16;
                                                cArr[i18] = (char) b14;
                                                i18++;
                                                i16 = 1;
                                            } else {
                                                i15 = i18;
                                                i14 = i17;
                                            }
                                        }
                                        i15 = i18;
                                        i14 = i17;
                                    } else if (b13 < -32) {
                                        if (i17 < i13) {
                                            i14 += 2;
                                            V.c(b13, bArr[i17], cArr, i15);
                                            i15++;
                                        } else {
                                            throw D.a();
                                        }
                                    } else if (b13 < -16) {
                                        if (i17 < i13 - 1) {
                                            int i19 = i14 + 2;
                                            i14 += 3;
                                            V.d(b13, bArr[i17], bArr[i19], cArr, i15);
                                            i15++;
                                        } else {
                                            throw D.a();
                                        }
                                    } else if (i17 < i13 - 2) {
                                        int i20 = i14 + 3;
                                        i14 += 4;
                                        V.a(b13, bArr[i17], bArr[i14 + 2], bArr[i20], cArr, i15);
                                        i15 += 2;
                                    } else {
                                        throw D.a();
                                    }
                                } else {
                                    return new String(cArr, 0, i15);
                                }
                            }
                        } else {
                            i14++;
                            cArr[i15] = (char) b12;
                            i15++;
                        }
                    }
                    while (true) {
                        int i162 = 1;
                        if (i14 >= i13) {
                        }
                    }
                } else {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
            default:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                    int i21 = i10 + i11;
                    char[] cArr2 = new char[i11];
                    int i22 = i10;
                    int i23 = 0;
                    while (i22 < i21) {
                        byte f6 = x0.f(i22, bArr);
                        if (V.b(f6)) {
                            i22++;
                            cArr2[i23] = (char) f6;
                            i23++;
                        } else {
                            int i24 = i23;
                            while (i22 < i21) {
                                int i25 = i22 + 1;
                                byte f10 = x0.f(i22, bArr);
                                if (V.b(f10)) {
                                    int i26 = i24 + 1;
                                    cArr2[i24] = (char) f10;
                                    while (i25 < i21) {
                                        byte f11 = x0.f(i25, bArr);
                                        if (V.b(f11)) {
                                            i25 += i12;
                                            cArr2[i26] = (char) f11;
                                            i26++;
                                        } else {
                                            i24 = i26;
                                            i22 = i25;
                                        }
                                    }
                                    i24 = i26;
                                    i22 = i25;
                                } else if (f10 < b11) {
                                    if (i25 < i21) {
                                        i22 += 2;
                                        V.c(f10, x0.f(i25, bArr), cArr2, i24);
                                        i24++;
                                    } else {
                                        throw D.a();
                                    }
                                } else if (f10 < b10) {
                                    if (i25 < i21 - 1) {
                                        int i27 = i22 + 2;
                                        i22 += 3;
                                        V.d(f10, x0.f(i25, bArr), x0.f(i27, bArr), cArr2, i24);
                                        i24++;
                                    } else {
                                        throw D.a();
                                    }
                                } else if (i25 < i21 - 2) {
                                    byte f12 = x0.f(i25, bArr);
                                    int i28 = i22 + 3;
                                    byte f13 = x0.f(i22 + 2, bArr);
                                    i22 += 4;
                                    int i29 = i24;
                                    V.a(f10, f12, f13, x0.f(i28, bArr), cArr2, i29);
                                    i24 = i29 + 2;
                                } else {
                                    throw D.a();
                                }
                                i12 = 1;
                                b10 = -16;
                                b11 = -32;
                            }
                            return new String(cArr2, 0, i24);
                        }
                    }
                    int i242 = i23;
                    while (i22 < i21) {
                    }
                    return new String(cArr2, 0, i242);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        char charAt;
        long j6;
        int i13;
        char charAt2;
        char c10 = '\u0800';
        char c11 = '\u0080';
        switch (this.f25137c) {
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
                            throw new z0(i15 - 1, length);
                        } else if ('\ud800' <= charAt3 && charAt3 <= '\udfff' && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt3, charSequence.charAt(i12)))) {
                            throw new z0(i15, length);
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
                        x0.m(bArr, j10, (byte) charAt2);
                        i22++;
                        j10++;
                    }
                    if (i22 != length2) {
                        while (i22 < length2) {
                            char charAt5 = charSequence.charAt(i22);
                            if (charAt5 < c11 && j10 < j11) {
                                x0.m(bArr, j10, (byte) charAt5);
                                j6 = j11;
                                j10++;
                            } else if (charAt5 < c10 && j10 <= j11 - 2) {
                                long j12 = j10 + 1;
                                x0.m(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                                j10 += 2;
                                x0.m(bArr, j12, (byte) ((charAt5 & '?') | c11));
                                j6 = j11;
                            } else if ((charAt5 >= '\ud800' && '\udfff' >= charAt5) || j10 > j11 - 3) {
                                j6 = j11;
                                if (j10 <= j6 - 4) {
                                    int i23 = i22 + 1;
                                    if (i23 != length2) {
                                        char charAt6 = charSequence.charAt(i23);
                                        if (Character.isSurrogatePair(charAt5, charAt6)) {
                                            int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                            x0.m(bArr, j10, (byte) ((codePoint2 >>> 18) | 240));
                                            x0.m(bArr, j10 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                            long j13 = 3 + j10;
                                            x0.m(bArr, j10 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                            j10 += 4;
                                            x0.m(bArr, j13, (byte) ((codePoint2 & 63) | 128));
                                            i22 = i23;
                                        } else {
                                            i22 = i23;
                                        }
                                    }
                                    throw new z0(i22 - 1, length2);
                                } else if ('\ud800' <= charAt5 && charAt5 <= '\udfff' && ((i13 = i22 + 1) == length2 || !Character.isSurrogatePair(charAt5, charSequence.charAt(i13)))) {
                                    throw new z0(i22, length2);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j10);
                                }
                            } else {
                                x0.m(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                                j6 = j11;
                                long j14 = j10 + 2;
                                x0.m(bArr, j10 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                                j10 += 3;
                                x0.m(bArr, j14, (byte) ((charAt5 & '?') | 128));
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

    public final int m(int i10, int i11, byte[] bArr) {
        int i12;
        int i13 = i10;
        byte b10 = -62;
        byte b11 = -16;
        switch (this.f25137c) {
            case 0:
                while (i13 < i11 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i11) {
                    while (i13 < i11) {
                        int i14 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 < 0) {
                            if (b12 < -32) {
                                if (i14 >= i11) {
                                    return b12;
                                }
                                if (b12 >= -62) {
                                    i13 += 2;
                                    if (bArr[i14] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b12 < -16) {
                                if (i14 >= i11 - 1) {
                                    return A0.a(bArr, i14, i11);
                                }
                                int i15 = i13 + 2;
                                byte b13 = bArr[i14];
                                if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                                    i13 += 3;
                                    if (bArr[i15] > -65) {
                                    }
                                }
                            } else if (i14 >= i11 - 2) {
                                return A0.a(bArr, i14, i11);
                            } else {
                                int i16 = i13 + 2;
                                byte b14 = bArr[i14];
                                if (b14 <= -65 && (((b14 + 112) + (b12 << 28)) >> 30) == 0) {
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
                        long j10 = j6;
                        i12 = 0;
                        while (true) {
                            if (i12 < i18) {
                                long j11 = j10 + 1;
                                if (x0.f(j10, bArr) >= 0) {
                                    i12++;
                                    j10 = j11;
                                }
                            } else {
                                i12 = i18;
                            }
                        }
                    }
                    int i19 = i18 - i12;
                    long j12 = j6 + i12;
                    while (true) {
                        byte b15 = 0;
                        while (true) {
                            if (i19 > 0) {
                                long j13 = j12 + 1;
                                b15 = x0.f(j12, bArr);
                                if (b15 >= 0) {
                                    i19--;
                                    j12 = j13;
                                } else {
                                    j12 = j13;
                                }
                            }
                        }
                        if (i19 == 0) {
                            return 0;
                        }
                        int i20 = i19 - 1;
                        if (b15 < -32) {
                            if (i20 == 0) {
                                return b15;
                            }
                            i19 -= 2;
                            if (b15 >= b10) {
                                long j14 = j12 + 1;
                                if (x0.f(j12, bArr) <= -65) {
                                    j12 = j14;
                                    b10 = -62;
                                    b11 = -16;
                                }
                            }
                        } else if (b15 < b11) {
                            if (i20 < 2) {
                                return n(j12, bArr, b15, i20);
                            }
                            i19 -= 3;
                            long j15 = j12 + 1;
                            byte f6 = x0.f(j12, bArr);
                            if (f6 <= -65 && ((b15 != -32 || f6 >= -96) && (b15 != -19 || f6 < -96))) {
                                j12 += 2;
                                if (x0.f(j15, bArr) <= -65) {
                                    b10 = -62;
                                    b11 = -16;
                                }
                            }
                        } else if (i20 < 3) {
                            return n(j12, bArr, b15, i20);
                        } else {
                            i19 -= 4;
                            long j16 = j12 + 1;
                            byte f10 = x0.f(j12, bArr);
                            if (f10 <= -65 && (((f10 + 112) + (b15 << 28)) >> 30) == 0) {
                                long j17 = 2 + j12;
                                if (x0.f(j16, bArr) <= -65) {
                                    j12 += 3;
                                    if (x0.f(j17, bArr) <= -65) {
                                        b10 = -62;
                                        b11 = -16;
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }
}
