package jh;

import android.gov.nist.core.Separators;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.protobuf.AbstractC2515j0;
import com.google.protobuf.AbstractC2518k0;
import ei.C2927a;
import id.AbstractC3557B;
import io.sentry.C3633b1;
import io.sentry.C3651h1;
import io.sentry.EnumC3642e1;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import n2.C4711b;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class H1 implements AbstractC2518k0, vg.f, io.sentry.H, io.sentry.S0, C2.i {

    /* renamed from: Y  reason: collision with root package name */
    public final int f36244Y;

    public /* synthetic */ H1(int i10) {
        this.f36244Y = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [ji.j] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, ji.j] */
    public static String h(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12) {
        int i13;
        int i14;
        boolean z14;
        boolean z15;
        boolean z16;
        String str3;
        char[] cArr = Wh.s.f21249j;
        boolean z17 = false;
        if ((i12 & 1) != 0) {
            i13 = 0;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i14 = str.length();
        } else {
            i14 = i11;
        }
        if ((i12 & 8) != 0) {
            z14 = false;
        } else {
            z14 = z10;
        }
        if ((i12 & 16) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        if ((i12 & 32) != 0) {
            z16 = false;
        } else {
            z16 = z12;
        }
        if ((i12 & 64) == 0) {
            z17 = z13;
        }
        AbstractC3557B.c0("<this>", str);
        int i15 = i13;
        while (i15 < i14) {
            int codePointAt = str.codePointAt(i15);
            int i16 = 32;
            int i17 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z17) && !Lg.n.a2(str2, (char) codePointAt) && ((codePointAt != 37 || (z14 && (!z15 || o(i15, i14, str)))) && (codePointAt != 43 || !z16)))) {
                i15 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.R0(i13, i15, str);
                ?? r22 = 0;
                while (i15 < i14) {
                    int codePointAt2 = str.codePointAt(i15);
                    if (!z14 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z16) {
                            if (z14) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.S0(str3);
                        } else if (codePointAt2 >= i16 && codePointAt2 != 127 && ((codePointAt2 < i17 || z17) && !Lg.n.a2(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z14 && (!z15 || o(i15, i14, str)))))) {
                            obj.T0(codePointAt2);
                        } else {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.T0(codePointAt2);
                            while (!r22.H()) {
                                byte readByte = r22.readByte();
                                obj.w0(37);
                                char[] cArr2 = Wh.s.f21249j;
                                obj.w0(cArr2[((readByte & 255) >> 4) & 15]);
                                obj.w0(cArr2[readByte & 15]);
                            }
                        }
                    }
                    i15 += Character.charCount(codePointAt2);
                    i16 = 32;
                    i17 = 128;
                    r22 = r22;
                }
                return obj.V();
            }
        }
        String substring = str.substring(i13, i14);
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public static void i(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ('!' > charAt || charAt >= '\u007f') {
                    throw new IllegalArgumentException(Xh.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static void j(String str, String str2) {
        String str3;
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && (' ' > charAt || charAt >= '\u007f')) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Xh.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i10), str2));
                if (Xh.b.q(str2)) {
                    str3 = "";
                } else {
                    str3 = ": ".concat(str);
                }
                sb2.append(str3);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static Wh.A k(int i10, int i11, Wh.u uVar, byte[] bArr) {
        AbstractC3557B.c0("<this>", bArr);
        long length = bArr.length;
        long j6 = i10;
        long j10 = i11;
        byte[] bArr2 = Xh.b.f21996a;
        if ((j6 | j10) >= 0 && j6 <= length && length - j6 >= j10) {
            return new Wh.A(i11, i10, uVar, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static int l(String str) {
        AbstractC3557B.c0("scheme", str);
        if (AbstractC3557B.K(str, "http")) {
            return 80;
        }
        if (AbstractC3557B.K(str, "https")) {
            return 443;
        }
        return -1;
    }

    public static Wh.H m(String str) {
        AbstractC3557B.c0("javaName", str);
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return Wh.H.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return Wh.H.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return Wh.H.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return Wh.H.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return Wh.H.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static Wh.s n(String str) {
        AbstractC3557B.c0("<this>", str);
        Wh.r rVar = new Wh.r();
        rVar.c(null, str);
        return rVar.b();
    }

    public static boolean o(int i10, int i11, String str) {
        int i12 = i10 + 2;
        if (i12 < i11 && str.charAt(i10) == '%' && Xh.b.r(str.charAt(i10 + 1)) != -1 && Xh.b.r(str.charAt(i12)) != -1) {
            return true;
        }
        return false;
    }

    public static int q(int i10, int i11, int i12) {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(AbstractC2469q0.i("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
    }

    public static Wh.q r(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr2[i11];
                if (str != null) {
                    strArr2[i11] = Lg.n.U2(str).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int J10 = r.f.J(0, strArr2.length - 1, 2);
            if (J10 >= 0) {
                while (true) {
                    String str2 = strArr2[i10];
                    String str3 = strArr2[i10 + 1];
                    i(str2);
                    j(str3, str2);
                    if (i10 == J10) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Wh.q(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static bi.h s(String str) {
        int i10;
        String str2;
        AbstractC3557B.c0("statusLine", str);
        boolean I22 = Lg.n.I2(str, "HTTP/1.", false);
        Wh.x xVar = Wh.x.HTTP_1_0;
        if (I22) {
            i10 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        xVar = Wh.x.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (Lg.n.I2(str, "ICY ", false)) {
            i10 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i11 = i10 + 3;
        if (str.length() >= i11) {
            try {
                String substring = str.substring(i10, i11);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                int parseInt = Integer.parseInt(substring);
                if (str.length() > i11) {
                    if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", str2);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new bi.h(xVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ji.j] */
    public static String t(String str, int i10, int i11, boolean z10, int i12) {
        int i13;
        char[] cArr = Wh.s.f21249j;
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        AbstractC3557B.c0("<this>", str);
        int i14 = i10;
        while (i14 < i11) {
            char charAt = str.charAt(i14);
            if (charAt != '%' && (charAt != '+' || !z10)) {
                i14++;
            } else {
                ?? obj = new Object();
                obj.R0(i10, i14, str);
                while (i14 < i11) {
                    int codePointAt = str.codePointAt(i14);
                    if (codePointAt == 37 && (i13 = i14 + 2) < i11) {
                        int r10 = Xh.b.r(str.charAt(i14 + 1));
                        int r11 = Xh.b.r(str.charAt(i13));
                        if (r10 != -1 && r11 != -1) {
                            obj.w0((r10 << 4) + r11);
                            i14 = Character.charCount(codePointAt) + i13;
                        }
                        obj.T0(codePointAt);
                        i14 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z10) {
                            obj.w0(32);
                            i14++;
                        }
                        obj.T0(codePointAt);
                        i14 += Character.charCount(codePointAt);
                    }
                }
                return obj.V();
            }
        }
        String substring = str.substring(i10, i11);
        AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
        return substring;
    }

    public static ArrayList u(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int k22 = Lg.n.k2(str, '&', i10, false, 4);
            if (k22 == -1) {
                k22 = str.length();
            }
            int k23 = Lg.n.k2(str, '=', i10, false, 4);
            if (k23 != -1 && k23 <= k22) {
                String substring = str.substring(i10, k23);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                arrayList.add(substring);
                String substring2 = str.substring(k23 + 1, k22);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring2);
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i10, k22);
                AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring3);
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i10 = k22 + 1;
        }
        return arrayList;
    }

    public static void v(StringBuilder sb2, List list) {
        AbstractC3557B.c0("<this>", list);
        Cf.e z02 = com.google.android.gms.internal.play_billing.N.z0(com.google.android.gms.internal.play_billing.N.D0(0, list.size()), 2);
        int i10 = z02.f3106Y;
        int i11 = z02.f3107Z;
        int i12 = z02.f3108h0;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i10);
            String str2 = (String) list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
            if (i10 != i11) {
                i10 += i12;
            } else {
                return;
            }
        }
    }

    @Override // com.google.protobuf.AbstractC2518k0
    public AbstractC2515j0 a(int i10) {
        switch (this.f36244Y) {
            case 0:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return I1.LOSSY;
                }
                return I1.RELIABLE;
            case 1:
                return O1.b(i10);
            case 2:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return R1.DISCONNECTED;
                        }
                        return R1.ACTIVE;
                    }
                    return R1.JOINED;
                }
                return R1.JOINING;
            case 3:
                return EnumC3986a2.b(i10);
            case 4:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return EnumC4031j2.SE_TRACK_NOTFOUND;
                    }
                    return EnumC4031j2.SE_CODEC_UNSUPPORTED;
                }
                return EnumC4031j2.SE_UNKNOWN;
            case 5:
                return EnumC4056o2.b(i10);
            case 6:
                return EnumC4085u2.b(i10);
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return EnumC4047m3.SUBSCRIBER;
                }
                return EnumC4047m3.PUBLISHER;
        }
    }

    @Override // io.sentry.H
    public void b(EnumC3642e1 enumC3642e1, Throwable th2, String str, Object... objArr) {
        switch (this.f36244Y) {
            case 0:
                AbstractC3557B.c0("level", enumC3642e1);
                AbstractC3557B.c0("message", str);
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList.add(String.valueOf(obj));
                }
                Log.d("Sentry", enumC3642e1 + Separators.SP + str + ", " + arrayList, th2);
                return;
            default:
                if (th2 == null) {
                    f(enumC3642e1, str, objArr);
                    return;
                }
                PrintStream printStream = System.out;
                String format = String.format(str, objArr);
                String th3 = th2.toString();
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                printStream.println(enumC3642e1 + ": " + format + " \n " + th3 + Separators.RETURN + stringWriter.toString());
                return;
        }
    }

    @Override // C2.i
    public C2.j c(C2.h hVar) {
        int i10;
        int i11 = AbstractC5530A.f45131a;
        if (i11 >= 23 && ((i10 = this.f36244Y) == 1 || (i10 == 0 && i11 >= 31))) {
            int f6 = p2.N.f(hVar.f2542c.f42319q0);
            s2.p.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC5530A.x(f6));
            return new C4711b(f6, false).c(hVar);
        }
        return new P5.c(28).c(hVar);
    }

    @Override // io.sentry.H
    public void d(EnumC3642e1 enumC3642e1, String str, Throwable th2) {
        switch (this.f36244Y) {
            case 0:
                AbstractC3557B.c0("level", enumC3642e1);
                AbstractC3557B.c0("message", str);
                Log.d("Sentry", enumC3642e1 + Separators.SP + str, th2);
                return;
            default:
                if (th2 == null) {
                    f(enumC3642e1, str, new Object[0]);
                    return;
                }
                PrintStream printStream = System.out;
                String format = String.format(str, th2.toString());
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                printStream.println(enumC3642e1 + ": " + format + Separators.RETURN + stringWriter2);
                return;
        }
    }

    @Override // io.sentry.S0
    public io.sentry.R0 e() {
        switch (this.f36244Y) {
            case 0:
                return new C3633b1();
            default:
                return new C3651h1();
        }
    }

    @Override // io.sentry.H
    public void f(EnumC3642e1 enumC3642e1, String str, Object... objArr) {
        switch (this.f36244Y) {
            case 0:
                AbstractC3557B.c0("level", enumC3642e1);
                AbstractC3557B.c0("message", str);
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList.add(String.valueOf(obj));
                }
                Log.d("Sentry", enumC3642e1 + Separators.SP + str + Separators.SP + arrayList);
                return;
            default:
                System.out.println(enumC3642e1 + ": " + String.format(str, objArr));
                return;
        }
    }

    @Override // io.sentry.H
    public boolean g(EnumC3642e1 enumC3642e1) {
        return true;
    }

    @Override // vg.f
    public Bg.A getType() {
        switch (this.f36244Y) {
            case 0:
                throw new IllegalStateException("This method should not be called");
            case 1:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public boolean p() {
        switch (this.f36244Y) {
            case 27:
                return C2927a.f29483e;
            default:
                return ei.d.f29492e;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H1(int i10, int i11) {
        this(8);
        this.f36244Y = i10;
        switch (i10) {
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }

    public H1() {
        this.f36244Y = 0;
    }
}
