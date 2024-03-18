package androidx.glance.appwidget.protobuf;

/* loaded from: classes2.dex */
public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n0 f25264a;

    static {
        n0 n0Var;
        if (m0.f25252e && m0.f25251d && !AbstractC2044d.a()) {
            n0Var = new n0(1);
        } else {
            n0Var = new n0(0);
        }
        f25264a = n0Var;
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return d(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return c(b10, bArr[i10]);
        }
        if (b10 > -12) {
            b10 = -1;
        }
        return b10;
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < '\u0080') {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < '\u0800') {
                i12 += ('\u007f' - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < '\u0800') {
                        i10 += ('\u007f' - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if ('\ud800' <= charAt2 && charAt2 <= '\udfff') {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new o0(i11, length2);
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

    public static int c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
