package Lg;

import A.AbstractC0044t0;
import K4.J;
import Kg.s;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import kf.q;
import l8.AbstractC4344b;
import r9.C5384a;
import xe.C6431t;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public abstract class n extends m {
    public static String A2(String str, String str2, String str3) {
        AbstractC3557B.c0("<this>", str);
        int i22 = i2(0, str, str2, false);
        if (i22 >= 0) {
            int length = str2.length();
            int i10 = 1;
            if (length >= 1) {
                i10 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb2 = new StringBuilder(length2);
                int i11 = 0;
                do {
                    sb2.append((CharSequence) str, i11, i22);
                    sb2.append(str3);
                    i11 = i22 + length;
                    if (i22 >= str.length()) {
                        break;
                    }
                    i22 = i2(i22 + i10, str, str2, false);
                } while (i22 > 0);
                sb2.append((CharSequence) str, i11, str.length());
                String sb3 = sb2.toString();
                AbstractC3557B.b0("toString(...)", sb3);
                return sb3;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static String B2(String str, String str2, String str3) {
        AbstractC3557B.c0("<this>", str);
        int l22 = l2(str, str2, 0, false, 2);
        if (l22 >= 0) {
            return C2(str, l22, str2.length() + l22, str3).toString();
        }
        return str;
    }

    public static StringBuilder C2(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("replacement", charSequence2);
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            sb2.append(charSequence2);
            sb2.append(charSequence, i11, charSequence.length());
            return sb2;
        }
        throw new IndexOutOfBoundsException(AbstractC0044t0.y("End index (", i11, ") is less than start index (", i10, ")."));
    }

    public static final void D2(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Limit must be non-negative, but was ", i10).toString());
    }

    public static final List E2(int i10, CharSequence charSequence, String str, boolean z10) {
        boolean z11;
        D2(i10);
        int i11 = 0;
        int i22 = i2(0, charSequence, str, z10);
        if (i22 != -1 && i10 != 1) {
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = 10;
            if (z11 && i10 <= 10) {
                i12 = i10;
            }
            ArrayList arrayList = new ArrayList(i12);
            do {
                arrayList.add(charSequence.subSequence(i11, i22).toString());
                i11 = str.length() + i22;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                i22 = i2(i11, charSequence, str, z10);
            } while (i22 != -1);
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return AbstractC4344b.F0(charSequence.toString());
    }

    public static List F2(CharSequence charSequence, char[] cArr) {
        AbstractC3557B.c0("<this>", charSequence);
        if (cArr.length == 1) {
            return E2(0, charSequence, String.valueOf(cArr[0]), false);
        }
        D2(0);
        kf.o oVar = new kf.o(2, new c(charSequence, 0, 0, new C5384a((Object) cArr, false, 4)));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(oVar, 10));
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(L2(charSequence, (Cf.g) it.next()));
        }
        return arrayList;
    }

    public static List G2(CharSequence charSequence, String[] strArr) {
        AbstractC3557B.c0("<this>", charSequence);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return E2(0, charSequence, str, false);
            }
        }
        kf.o oVar = new kf.o(2, s2(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(oVar, 10));
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            arrayList.add(L2(charSequence, (Cf.g) it.next()));
        }
        return arrayList;
    }

    public static boolean H2(int i10, String str, String str2, boolean z10) {
        AbstractC3557B.c0("<this>", str);
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return t2(i10, 0, str2.length(), str, str2, z10);
    }

    public static boolean I2(String str, String str2, boolean z10) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("prefix", str2);
        if (!z10) {
            return str.startsWith(str2);
        }
        return t2(0, 0, str2.length(), str, str2, z10);
    }

    public static boolean J2(CharSequence charSequence, char c10) {
        AbstractC3557B.c0("<this>", charSequence);
        if (charSequence.length() <= 0 || !J.q(charSequence.charAt(0), c10, false)) {
            return false;
        }
        return true;
    }

    public static boolean K2(CharSequence charSequence, CharSequence charSequence2) {
        AbstractC3557B.c0("<this>", charSequence);
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return I2((String) charSequence, (String) charSequence2, false);
        }
        return u2(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static final String L2(CharSequence charSequence, Cf.g gVar) {
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("range", gVar);
        return charSequence.subSequence(gVar.f3106Y, gVar.f3107Z + 1).toString();
    }

    public static String M2(String str, Cf.g gVar) {
        AbstractC3557B.c0("range", gVar);
        String substring = str.substring(gVar.f3106Y, gVar.f3107Z + 1);
        AbstractC3557B.b0("substring(...)", substring);
        return substring;
    }

    public static String N2(char c10, String str, String str2) {
        AbstractC3557B.c0("missingDelimiterValue", str2);
        int k22 = k2(str, c10, 0, false, 6);
        if (k22 != -1) {
            String substring = str.substring(k22 + 1, str.length());
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str2;
    }

    public static String O2(String str, String str2, String str3) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("delimiter", str2);
        AbstractC3557B.c0("missingDelimiterValue", str3);
        int l22 = l2(str, str2, 0, false, 6);
        if (l22 != -1) {
            String substring = str.substring(str2.length() + l22, str.length());
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str3;
    }

    public static String P2(char c10, String str, String str2) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("missingDelimiterValue", str2);
        int o22 = o2(str, c10, 0, 6);
        if (o22 != -1) {
            String substring = str.substring(o22 + 1, str.length());
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str2;
    }

    public static String Q2(String str, String str2, String str3) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("missingDelimiterValue", str3);
        int l22 = l2(str, str2, 0, false, 6);
        if (l22 != -1) {
            String substring = str.substring(0, l22);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str3;
    }

    public static String R2(String str, char c10) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("missingDelimiterValue", str);
        int k22 = k2(str, c10, 0, false, 6);
        if (k22 != -1) {
            String substring = str.substring(0, k22);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str;
    }

    public static String S2(String str, String str2) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("missingDelimiterValue", str2);
        int p22 = p2(str, Separators.DOT, 6);
        if (p22 != -1) {
            String substring = str.substring(0, p22);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str2;
    }

    public static String T2(String str, char c10) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("missingDelimiterValue", str);
        int o22 = o2(str, c10, 0, 6);
        if (o22 != -1) {
            String substring = str.substring(0, o22);
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str;
    }

    public static CharSequence U2(CharSequence charSequence) {
        int i10;
        AbstractC3557B.c0("<this>", charSequence);
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            if (!z10) {
                i10 = i11;
            } else {
                i10 = length;
            }
            boolean I10 = J.I(charSequence.charAt(i10));
            if (!z10) {
                if (!I10) {
                    z10 = true;
                } else {
                    i11++;
                }
            } else if (!I10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static String V2(String str, char... cArr) {
        CharSequence charSequence;
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!q.T2(cArr, str.charAt(i10))) {
                    charSequence = str.subSequence(i10, str.length());
                    break;
                }
                i10++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    public static String Y1(char[] cArr, int i10, int i11) {
        AbstractC3557B.c0("<this>", cArr);
        C6431t.f(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean Z1(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("other", charSequence2);
        if (charSequence2 instanceof String) {
            if (l2(charSequence, (String) charSequence2, 0, z10, 2) < 0) {
                return false;
            }
        } else if (j2(charSequence, charSequence2, 0, charSequence.length(), z10, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean a2(CharSequence charSequence, char c10) {
        AbstractC3557B.c0("<this>", charSequence);
        if (k2(charSequence, c10, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static byte[] b2(String str) {
        AbstractC3557B.c0("<this>", str);
        byte[] bytes = str.getBytes(a.f11131a);
        AbstractC3557B.b0("getBytes(...)", bytes);
        return bytes;
    }

    public static boolean c2(String str, String str2, boolean z10) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("suffix", str2);
        if (!z10) {
            return str.endsWith(str2);
        }
        return t2(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static boolean d2(CharSequence charSequence, char c10) {
        AbstractC3557B.c0("<this>", charSequence);
        if (charSequence.length() <= 0 || !J.q(charSequence.charAt(g2(charSequence)), c10, false)) {
            return false;
        }
        return true;
    }

    public static boolean e2(CharSequence charSequence, String str) {
        AbstractC3557B.c0("<this>", charSequence);
        if (charSequence instanceof String) {
            return c2((String) charSequence, str, false);
        }
        return u2(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean f2(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static int g2(CharSequence charSequence) {
        AbstractC3557B.c0("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Cf.g, Cf.e] */
    public static final boolean h2(int i10, String str) {
        if (!new Cf.e(0, str.length() - 2, 1).s(i10) || !Character.isHighSurrogate(str.charAt(i10)) || !Character.isLowSurrogate(str.charAt(i10 + 1))) {
            return false;
        }
        return true;
    }

    public static final int i2(int i10, CharSequence charSequence, String str, boolean z10) {
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("string", str);
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return j2(charSequence, str, i10, charSequence.length(), z10, false);
    }

    public static final int j2(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        Cf.e eVar;
        if (!z11) {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            eVar = new Cf.e(i10, i11, 1);
        } else {
            int g22 = g2(charSequence);
            if (i10 > g22) {
                i10 = g22;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            eVar = new Cf.e(i10, i11, -1);
        }
        boolean z12 = charSequence instanceof String;
        int i12 = eVar.f3108h0;
        int i13 = eVar.f3107Z;
        int i14 = eVar.f3106Y;
        if (z12 && (charSequence2 instanceof String)) {
            if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
                while (!t2(0, i14, charSequence2.length(), (String) charSequence2, (String) charSequence, z10)) {
                    if (i14 != i13) {
                        i14 += i12;
                    }
                }
                return i14;
            }
        } else if ((i12 > 0 && i14 <= i13) || (i12 < 0 && i13 <= i14)) {
            while (!u2(charSequence2, 0, charSequence, i14, charSequence2.length(), z10)) {
                if (i14 != i13) {
                    i14 += i12;
                }
            }
            return i14;
        }
        return -1;
    }

    public static int k2(CharSequence charSequence, char c10, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        AbstractC3557B.c0("<this>", charSequence);
        if (!z10 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return m2(i10, charSequence, z10, new char[]{c10});
    }

    public static /* synthetic */ int l2(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return i2(i10, charSequence, str, z10);
    }

    public static final int m2(int i10, CharSequence charSequence, boolean z10, char[] cArr) {
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("chars", cArr);
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(q.u3(cArr), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        Cf.f it = new Cf.e(i10, g2(charSequence), 1).iterator();
        while (it.f3111h0) {
            int a5 = it.a();
            char charAt = charSequence.charAt(a5);
            for (char c10 : cArr) {
                if (J.q(c10, charAt, z10)) {
                    return a5;
                }
            }
        }
        return -1;
    }

    public static boolean n2(CharSequence charSequence) {
        AbstractC3557B.c0("<this>", charSequence);
        if (charSequence.length() == 0) {
            return true;
        }
        Cf.e eVar = new Cf.e(0, charSequence.length() - 1, 1);
        if ((eVar instanceof Collection) && ((Collection) eVar).isEmpty()) {
            return true;
        }
        Cf.f it = eVar.iterator();
        while (it.f3111h0) {
            if (!J.I(charSequence.charAt(it.a()))) {
                return false;
            }
        }
        return true;
    }

    public static int o2(CharSequence charSequence, char c10, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = g2(charSequence);
        }
        AbstractC3557B.c0("<this>", charSequence);
        if (!(charSequence instanceof String)) {
            char[] cArr = {c10};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(q.u3(cArr), i10);
            }
            int g22 = g2(charSequence);
            if (i10 > g22) {
                i10 = g22;
            }
            while (-1 < i10) {
                if (J.q(cArr[0], charSequence.charAt(i10), false)) {
                    return i10;
                }
                i10--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static int p2(CharSequence charSequence, String str, int i10) {
        int i11;
        if ((i10 & 2) != 0) {
            i11 = g2(charSequence);
        } else {
            i11 = 0;
        }
        int i12 = i11;
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("string", str);
        if (!(charSequence instanceof String)) {
            return j2(charSequence, str, i12, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i12);
    }

    public static final s q2(CharSequence charSequence) {
        AbstractC3557B.c0("<this>", charSequence);
        return Kg.m.n1(s2(charSequence, new String[]{Separators.NEWLINE, Separators.RETURN, "\r"}, false, 0), new Xf.f(16, charSequence));
    }

    public static String r2(String str, int i10) {
        CharSequence charSequence;
        AbstractC3557B.c0("<this>", str);
        if (i10 >= 0) {
            if (i10 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i10);
                Cf.f it = new Cf.e(1, i10 - str.length(), 1).iterator();
                while (it.f3111h0) {
                    it.a();
                    sb2.append('0');
                }
                sb2.append((CharSequence) str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(AbstractC4194d.v("Desired length ", i10, " is less than zero."));
    }

    public static c s2(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        D2(i10);
        return new c(charSequence, 0, i10, new C5384a(q.Q2(strArr), z10, 5));
    }

    public static boolean t2(int i10, int i11, int i12, String str, String str2, boolean z10) {
        AbstractC3557B.c0("<this>", str);
        AbstractC3557B.c0("other", str2);
        if (!z10) {
            return str.regionMatches(i10, str2, i11, i12);
        }
        return str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static final boolean u2(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        AbstractC3557B.c0("<this>", charSequence);
        AbstractC3557B.c0("other", charSequence2);
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!J.q(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String v2(CharSequence charSequence, String str) {
        AbstractC3557B.c0("<this>", str);
        if (K2(str, charSequence)) {
            String substring = str.substring(charSequence.length());
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str;
    }

    public static String w2(String str, String str2) {
        AbstractC3557B.c0("<this>", str2);
        if (e2(str2, str)) {
            String substring = str2.substring(0, str2.length() - str.length());
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str2;
    }

    public static String x2(String str) {
        AbstractC3557B.c0("<this>", str);
        if (str.length() >= Separators.DOUBLE_QUOTE.length() + Separators.DOUBLE_QUOTE.length() && K2(str, Separators.DOUBLE_QUOTE) && e2(str, Separators.DOUBLE_QUOTE)) {
            String substring = str.substring(Separators.DOUBLE_QUOTE.length(), str.length() - Separators.DOUBLE_QUOTE.length());
            AbstractC3557B.b0("substring(...)", substring);
            return substring;
        }
        return str;
    }

    public static String y2(int i10, String str) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return "";
            }
            if (i10 != 1) {
                int length = str.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb2 = new StringBuilder(str.length() * i10);
                    Cf.f it = new Cf.e(1, i10, 1).iterator();
                    while (it.f3111h0) {
                        it.a();
                        sb2.append((CharSequence) str);
                    }
                    String sb3 = sb2.toString();
                    AbstractC3557B.Z(sb3);
                    return sb3;
                }
                char charAt = str.charAt(0);
                char[] cArr = new char[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    cArr[i11] = charAt;
                }
                return new String(cArr);
            }
            return str.toString();
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
    }

    public static String z2(String str, char c10, char c11) {
        AbstractC3557B.c0("<this>", str);
        String replace = str.replace(c10, c11);
        AbstractC3557B.b0("replace(...)", replace);
        return replace;
    }
}
