package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public abstract class L0 {

    /* renamed from: a  reason: collision with root package name */
    public static final G f26862a;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.play_billing.G, java.lang.Object] */
    static {
        if (J0.f26857e && J0.f26856d) {
            int i10 = AbstractC2485z.f26996a;
        }
        f26862a = new Object();
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    byte b11 = bArr[i10];
                    byte b12 = bArr[i10 + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return (b12 << 16) ^ ((b11 << 8) ^ b10);
                    }
                    return -1;
                }
                throw new AssertionError();
            }
            byte b13 = bArr[i10];
            if (b10 <= -12 && b13 <= -65) {
                return (b13 << 8) ^ b10;
            }
            return -1;
        } else if (b10 <= -12) {
            return b10;
        } else {
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char charAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (charAt = str.charAt(i15)) >= '\u0080') {
                break;
            }
            bArr[i14] = (byte) charAt;
            i15++;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char charAt2 = str.charAt(i15);
            if (charAt2 < '\u0080' && i16 < i12) {
                bArr[i16] = (byte) charAt2;
                i16++;
            } else if (charAt2 < '\u0800' && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                i16 += 2;
            } else if ((charAt2 < '\ud800' || charAt2 > '\udfff') && i16 <= i12 - 3) {
                bArr[i16] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                i16 += 3;
            } else if (i16 <= i12 - 4) {
                int i17 = i15 + 1;
                if (i17 != str.length()) {
                    char charAt3 = str.charAt(i17);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int i18 = i16 + 3;
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                        bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i16 += 4;
                        bArr[i18] = (byte) ((codePoint & 63) | 128);
                        i15 = i17;
                    } else {
                        i15 = i17;
                    }
                }
                throw new K0(i15 - 1, length);
            } else if (charAt2 >= '\ud800' && charAt2 <= '\udfff' && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                throw new K0(i15, length);
            } else {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
            }
            i15++;
        }
        return i16;
    }

    public static int c(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < '\u0080') {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < '\u0800') {
                i12 += ('\u007f' - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < '\u0800') {
                        i10 += ('\u007f' - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= '\ud800' && charAt2 <= '\udfff') {
                            if (Character.codePointAt(str, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new K0(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static boolean d(byte[] bArr, int i10, int i11) {
        f26862a.getClass();
        return G.a(bArr, i10, i11);
    }
}
