package r0;

import p0.C5035b;

/* loaded from: classes2.dex */
public abstract class w implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public static final C5035b f44270Y = new Object();

    /* renamed from: Z  reason: collision with root package name */
    public static final float f44271Z = Float.intBitsToFloat(1056964608);

    /* JADX WARN: Type inference failed for: r0v0, types: [p0.b, java.lang.Object] */
    static {
        a(1.0f);
        a(-1.0f);
    }

    public static short a(float f6) {
        int i10;
        f44270Y.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f6);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & floatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 == 255) {
            if (i13 != 0) {
                i15 = 512;
            }
        } else {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 <= 0) {
                if (i16 >= -10) {
                    int i17 = (8388608 | i13) >> (1 - i16);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i14 = 0;
                    i15 = i17 >> 13;
                } else {
                    i14 = 0;
                }
            } else {
                i15 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return (short) i10;
                }
                i14 = i16;
            }
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final float b(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - f44271Z;
                if (i13 != 0) {
                    return -intBitsToFloat;
                }
                return intBitsToFloat;
            }
            i10 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i12 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i12 = i14 + 112;
            }
            int i17 = i12;
            i11 = i16;
            i10 = i17;
        }
        return Float.intBitsToFloat((i10 << 23) | (i13 << 16) | i11);
    }
}
