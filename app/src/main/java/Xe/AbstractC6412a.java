package xe;

import A.X;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kf.AbstractC4273I;
import l8.AbstractC4344b;
import oe.C4992a;
import yf.AbstractC6583a;
import zc.C6821H;

/* renamed from: xe.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6412a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f49873a;

    /* renamed from: b  reason: collision with root package name */
    public static final Set f49874b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set f49875c;

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f49876d;

    /* renamed from: e  reason: collision with root package name */
    public static final Set f49877e;

    /* renamed from: f  reason: collision with root package name */
    public static final ArrayList f49878f;

    static {
        ArrayList w22 = kf.t.w2(new Cf.a('0', '9'), kf.t.u2(new Cf.a('a', 'z'), new Cf.a('A', 'Z')));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(w22, 10));
        Iterator it = w22.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f49873a = kf.t.P2(arrayList);
        f49874b = kf.t.P2(kf.t.w2(new Cf.a('0', '9'), kf.t.u2(new Cf.a('a', 'z'), new Cf.a('A', 'Z'))));
        f49875c = kf.t.P2(kf.t.w2(new Cf.a('0', '9'), kf.t.u2(new Cf.a('a', 'f'), new Cf.a('A', 'F'))));
        Set<Character> X12 = R4.b.X1(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(X12, 10));
        for (Character ch2 : X12) {
            arrayList2.add(Byte.valueOf((byte) ch2.charValue()));
        }
        f49876d = arrayList2;
        f49877e = R4.b.X1(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        AbstractC4273I.u2(f49874b, R4.b.X1('!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'));
        List<Character> G02 = AbstractC4344b.G0('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(G02, 10));
        for (Character ch3 : G02) {
            arrayList3.add(Byte.valueOf((byte) ch3.charValue()));
        }
        f49878f = arrayList3;
    }

    public static final String a(byte b10) {
        int i10;
        int i11;
        int i12 = (b10 & 255) >> 4;
        if (i12 >= 0 && i12 < 10) {
            i10 = i12 + 48;
        } else {
            i10 = ((char) (i12 + 65)) - '\n';
        }
        char c10 = (char) i10;
        int i13 = b10 & 15;
        if (i13 >= 0 && i13 < 10) {
            i11 = i13 + 48;
        } else {
            i11 = ((char) (i13 + 65)) - '\n';
        }
        return new String(new char[]{'%', c10, (char) i11});
    }

    public static final int b(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        return -1;
    }

    public static final String c(String str, int i10, int i11, boolean z10, Charset charset) {
        int i12;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt != '%' && (!z10 || charAt != '+')) {
                i13++;
            } else {
                int i14 = i11 - i10;
                if (i14 > 255) {
                    i14 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i14);
                if (i13 > i10) {
                    sb2.append((CharSequence) str, i10, i13);
                }
                byte[] bArr = null;
                while (i13 < i11) {
                    char charAt2 = str.charAt(i13);
                    if (z10 && charAt2 == '+') {
                        sb2.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i11 - i13) / 3];
                        }
                        int i15 = 0;
                        while (i13 < i11 && str.charAt(i13) == '%') {
                            int i16 = i13 + 2;
                            if (i16 < i11) {
                                int b10 = b(str.charAt(i13 + 1));
                                int b11 = b(str.charAt(i16));
                                if (b10 != -1 && b11 != -1) {
                                    bArr[i15] = (byte) ((b10 * 16) + b11);
                                    i13 += 3;
                                    i15++;
                                } else {
                                    throw new C4992a("Wrong HEX escape: %" + str.charAt(i12) + str.charAt(i16) + ", in " + ((Object) str) + ", at " + i13, 2);
                                }
                            } else {
                                throw new C4992a("Incomplete trailing HEX escape: " + str.subSequence(i13, str.length()).toString() + ", in " + ((Object) str) + " at " + i13, 2);
                            }
                        }
                        sb2.append(new String(bArr, 0, i15, charset));
                    } else {
                        sb2.append(charAt2);
                    }
                    i13++;
                }
                String sb3 = sb2.toString();
                AbstractC3557B.b0("sb.toString()", sb3);
                return sb3;
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str;
        }
        String substring = str.substring(i10, i11);
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public static String d(String str) {
        int length = str.length();
        Charset charset = Lg.a.f11131a;
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("charset", charset);
        return c(str, 0, length, false, charset);
    }

    public static String e(String str, int i10, int i11, boolean z10, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        Charset charset = Lg.a.f11131a;
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("charset", charset);
        return c(str, i10, i11, z10, charset);
    }

    public static final String f(String str, boolean z10) {
        AbstractC3557B.c0("<this>", str);
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = Lg.a.f11131a.newEncoder();
        AbstractC3557B.b0("UTF_8.newEncoder()", newEncoder);
        h(AbstractC3557B.z0(newEncoder, str, 0, str.length()), new X(sb2, z10, 4));
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [Cf.c, Cf.a] */
    public static final String g(String str, boolean z10) {
        int i10;
        int i11;
        AbstractC3557B.c0("<this>", str);
        StringBuilder sb2 = new StringBuilder();
        Charset charset = Lg.a.f11131a;
        int i12 = 0;
        while (i12 < str.length()) {
            char charAt = str.charAt(i12);
            if (z10 || charAt != '/') {
                if (!f49874b.contains(Character.valueOf(charAt))) {
                    if (!f49877e.contains(Character.valueOf(charAt))) {
                        if (charAt == '%' && (i11 = i12 + 2) < str.length()) {
                            int i13 = i12 + 1;
                            Character valueOf = Character.valueOf(str.charAt(i13));
                            Set set = f49875c;
                            if (set.contains(valueOf) && set.contains(Character.valueOf(str.charAt(i11)))) {
                                sb2.append(charAt);
                                sb2.append(str.charAt(i13));
                                sb2.append(str.charAt(i11));
                                i12 += 3;
                            }
                        }
                        if (new Cf.a('\ud800', '\udfff').r(charAt)) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        CharsetEncoder newEncoder = charset.newEncoder();
                        AbstractC3557B.b0("charset.newEncoder()", newEncoder);
                        int i14 = i10 + i12;
                        h(AbstractC3557B.z0(newEncoder, str, i12, i14), new C6821H(16, sb2));
                        i12 = i14;
                    }
                }
            }
            sb2.append(charAt);
            i12++;
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb3);
        return sb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        throw new java.io.EOFException("No readable bytes available.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(Me.d dVar, wf.k kVar) {
        Throwable th2;
        boolean z10 = true;
        Ne.c b10 = Ne.d.b(dVar, 1);
        if (b10 == null) {
            return;
        }
        while (true) {
            try {
                int i10 = b10.f12023c;
                int i11 = b10.f12022b;
                if (i10 > i11) {
                    if (i11 == i10) {
                        break;
                    }
                    b10.f12022b = i11 + 1;
                    kVar.invoke(Byte.valueOf(b10.f12021a.get(i11)));
                } else {
                    try {
                        b10 = Ne.d.c(dVar, b10);
                        if (b10 == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = false;
                        if (z10) {
                            Ne.d.a(dVar, b10);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }
}
