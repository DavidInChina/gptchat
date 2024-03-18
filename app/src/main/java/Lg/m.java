package Lg;

import K4.J;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public abstract class m extends l {
    public static final void U1(String str) {
        throw new NumberFormatException(android.gov.nist.core.a.h("Invalid number format: '", str, '\''));
    }

    public static Double V1(String str) {
        AbstractC3557B.c0("<this>", str);
        try {
            if (!j.f11154a.b(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer W1(String str) {
        int i10;
        boolean z10;
        Integer valueOf;
        int i11;
        AbstractC3557B.c0("<this>", str);
        J.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        if (AbstractC3557B.e0(charAt, 48) < 0) {
            i10 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
            i10 = 0;
        }
        int i14 = -59652323;
        while (i10 < length) {
            int digit = Character.digit((int) str.charAt(i10), 10);
            if (digit < 0) {
                return null;
            }
            if ((i12 < i14 && (i14 != -59652323 || i12 < (i14 = i13 / 10))) || (i11 = i12 * 10) < i13 + digit) {
                return null;
            }
            i12 = i11 - digit;
            i10++;
        }
        if (z10) {
            valueOf = Integer.valueOf(i12);
        } else {
            valueOf = Integer.valueOf(-i12);
        }
        return valueOf;
    }

    public static Long X1(String str) {
        boolean z10;
        Long valueOf;
        AbstractC3557B.c0("<this>", str);
        J.j(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        long j6 = -9223372036854775807L;
        if (AbstractC3557B.e0(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j6 = Long.MIN_VALUE;
                i10 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z10 = false;
                i10 = 1;
            }
        } else {
            z10 = false;
        }
        long j10 = -256204778801521550L;
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int digit = Character.digit((int) str.charAt(i10), 10);
            if (digit < 0) {
                return null;
            }
            if (j11 < j12) {
                if (j12 != j10) {
                    return null;
                }
                j12 = j6 / 10;
                if (j11 < j12) {
                    return null;
                }
            }
            long j13 = j11 * 10;
            long j14 = digit;
            if (j13 < j6 + j14) {
                return null;
            }
            j11 = j13 - j14;
            i10++;
            j10 = -256204778801521550L;
        }
        if (z10) {
            valueOf = Long.valueOf(j11);
        } else {
            valueOf = Long.valueOf(-j11);
        }
        return valueOf;
    }
}
