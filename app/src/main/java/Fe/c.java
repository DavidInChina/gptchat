package Fe;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5299a;

    static {
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            iArr[i10] = Lg.n.k2("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i10, 0, false, 6);
        }
        f5299a = iArr;
    }

    /* JADX WARN: Finally extract failed */
    public static final String a(String str) {
        String str2;
        int T02;
        AbstractC3557B.c0("<this>", str);
        Me.c cVar = new Me.c();
        try {
            int g22 = Lg.n.g2(str);
            while (true) {
                if (-1 < g22) {
                    if (str.charAt(g22) == '=') {
                        g22--;
                    } else {
                        str2 = str.substring(0, g22 + 1);
                        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str2);
                        break;
                    }
                } else {
                    str2 = "";
                    break;
                }
            }
            N.E0(cVar, str2, 0, str2.length(), Lg.a.f11131a);
            Me.d p10 = cVar.p();
            AbstractC3557B.c0("<this>", p10);
            cVar = new Me.c();
            try {
                byte[] bArr = new byte[4];
                while (p10.m() > 0) {
                    int T03 = Ad.l.T0(p10, bArr, 0, 4);
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (i10 < 4) {
                        i11 |= ((byte) (((byte) f5299a[bArr[i10] & 255]) & 63)) << ((3 - i12) * 6);
                        i10++;
                        i12++;
                    }
                    int i13 = 4 - T03;
                    int i14 = 2;
                    if (i13 <= 2) {
                        while (true) {
                            cVar.k((byte) ((i11 >> (i14 * 8)) & 255));
                            if (i14 != i13) {
                                i14--;
                            }
                        }
                    }
                }
                Me.d p11 = cVar.p();
                AbstractC3557B.c0("<this>", p11);
                byte[] bArr2 = new byte[(int) N.k(N.m(Integer.MAX_VALUE, p11.m()), 0)];
                int i15 = 0;
                while (i15 < Integer.MAX_VALUE && (T02 = Ad.l.T0(p11, bArr2, i15, Math.min(Integer.MAX_VALUE, bArr2.length) - i15)) > 0) {
                    i15 += T02;
                    if (bArr2.length == i15) {
                        bArr2 = Arrays.copyOf(bArr2, i15 * 2);
                        AbstractC3557B.b0("copyOf(this, newSize)", bArr2);
                    }
                }
                if (i15 >= 0) {
                    if (i15 != bArr2.length) {
                        bArr2 = Arrays.copyOf(bArr2, i15);
                        AbstractC3557B.b0("copyOf(this, newSize)", bArr2);
                    }
                    return new String(bArr2, 0, bArr2.length, Lg.a.f11131a);
                }
                throw new EOFException("Not enough bytes available to read 0 bytes: " + (0 - i15) + " more required");
            } finally {
                cVar.close();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final String b(String str) {
        AbstractC3557B.c0("<this>", str);
        Me.c cVar = new Me.c();
        try {
            N.E0(cVar, str, 0, str.length(), Lg.a.f11131a);
            Me.d p10 = cVar.p();
            AbstractC3557B.c0("<this>", p10);
            return c(N.l0(p10));
        } catch (Throwable th2) {
            cVar.close();
            throw th2;
        }
    }

    public static final String c(byte[] bArr) {
        int i10;
        int i11;
        int i12 = 3;
        char[] cArr = new char[android.gov.nist.core.a.z(bArr.length, 8, 6, 3)];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = i13 + 3;
            if (i15 > bArr.length) {
                break;
            }
            int i16 = (bArr[i13 + 2] & 255) | ((bArr[i13] & 255) << 16) | ((bArr[i13 + 1] & 255) << 8);
            int i17 = 3;
            while (-1 < i17) {
                cArr[i14] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i16 >> (i17 * 6)) & 63);
                i17--;
                i14++;
            }
            i13 = i15;
        }
        int length = bArr.length - i13;
        if (length == 0) {
            return Lg.n.Y1(cArr, 0, i14);
        }
        if (length == 1) {
            i10 = (bArr[i13] & 255) << 16;
        } else {
            i10 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
        }
        int i18 = ((3 - length) * 8) / 6;
        if (i18 <= 3) {
            while (true) {
                i11 = i14 + 1;
                cArr[i14] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i10 >> (i12 * 6)) & 63);
                if (i12 == i18) {
                    break;
                }
                i12--;
                i14 = i11;
            }
            i14 = i11;
        }
        int i19 = 0;
        while (i19 < i18) {
            cArr[i14] = '=';
            i19++;
            i14++;
        }
        return Lg.n.Y1(cArr, 0, i14);
    }
}
