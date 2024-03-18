package bi;

import K4.J;
import Lg.n;
import Wh.C1666k;
import Wh.D;
import Wh.q;
import Wh.s;
import android.gov.nist.core.Separators;
import ei.l;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import jh.L1;
import ji.C4138m;
import kf.v;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes2.dex */
public abstract class e {
    static {
        C4138m c4138m = C4138m.f36722i0;
        l.g("\"\\");
        l.g("\t ,=");
    }

    public static final boolean a(D d10) {
        if (AbstractC3557B.K(d10.f21130Y.f21337b, "HEAD")) {
            return false;
        }
        int i10 = d10.f21133i0;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && Xh.b.k(d10) == -1 && !n.f2("chunked", D.h(d10, "Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v2 */
    public static final void b(Wh.l lVar, s sVar, q qVar) {
        List list;
        int i10;
        C1666k c1666k;
        long j6;
        String str;
        String str2;
        String str3;
        AbstractC3557B.c0("<this>", lVar);
        AbstractC3557B.c0("url", sVar);
        AbstractC3557B.c0("headers", qVar);
        if (lVar == Wh.l.f21232b) {
            return;
        }
        Pattern pattern = C1666k.f21219j;
        List U10 = qVar.U("Set-Cookie");
        int size = U10.size();
        int i11 = 0;
        int i12 = 0;
        ArrayList arrayList = null;
        while (i12 < size) {
            String str4 = (String) U10.get(i12);
            AbstractC3557B.c0("setCookie", str4);
            long currentTimeMillis = System.currentTimeMillis();
            char c10 = ';';
            int g10 = Xh.b.g(str4, ';', i11, i11, 6);
            char c11 = '=';
            int g11 = Xh.b.g(str4, '=', i11, g10, 2);
            if (g11 != g10) {
                String z10 = Xh.b.z(i11, g11, str4);
                if (z10.length() != 0 && Xh.b.m(z10) == -1) {
                    String z11 = Xh.b.z(g11 + 1, g10, str4);
                    if (Xh.b.m(z11) == -1) {
                        int i13 = g10 + 1;
                        int length = str4.length();
                        int i14 = i11;
                        boolean z12 = i14 == 1 ? 1 : 0;
                        boolean z13 = i14 == 1 ? 1 : 0;
                        boolean z14 = i14 == 1 ? 1 : 0;
                        boolean z15 = z12;
                        boolean z16 = z15;
                        long j10 = -1;
                        long j11 = 253402300799999L;
                        String str5 = null;
                        String str6 = null;
                        boolean z17 = true;
                        boolean z18 = i14;
                        while (true) {
                            long j12 = Long.MAX_VALUE;
                            long j13 = Long.MIN_VALUE;
                            if (i13 < length) {
                                int e10 = Xh.b.e(c10, i13, length, str4);
                                int e11 = Xh.b.e(c11, i13, e10, str4);
                                String z19 = Xh.b.z(i13, e11, str4);
                                if (e11 < e10) {
                                    str3 = Xh.b.z(e11 + 1, e10, str4);
                                } else {
                                    str3 = "";
                                }
                                if (n.f2(z19, "expires")) {
                                    try {
                                        j11 = L1.q(str3.length(), str3);
                                        z16 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i13 = e10 + 1;
                                    c10 = ';';
                                    c11 = '=';
                                    z18 = z18;
                                } else if (n.f2(z19, "max-age")) {
                                    try {
                                        long parseLong = Long.parseLong(str3);
                                        if (parseLong > 0) {
                                            j13 = parseLong;
                                        }
                                        j10 = j13;
                                    } catch (NumberFormatException e12) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        AbstractC3557B.b0("compile(...)", compile);
                                        if (compile.matcher(str3).matches()) {
                                            if (n.I2(str3, "-", false)) {
                                                j12 = Long.MIN_VALUE;
                                            }
                                            j10 = j12;
                                        } else {
                                            throw e12;
                                        }
                                    }
                                    z16 = true;
                                    i13 = e10 + 1;
                                    c10 = ';';
                                    c11 = '=';
                                    z18 = z18;
                                } else {
                                    if (n.f2(z19, "domain")) {
                                        if (!n.c2(str3, Separators.DOT, false)) {
                                            String h02 = J.h0(n.v2(Separators.DOT, str3));
                                            if (h02 != null) {
                                                str6 = h02;
                                                z17 = false;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Failed requirement.".toString());
                                        }
                                    } else if (n.f2(z19, "path")) {
                                        str5 = str3;
                                    } else if (n.f2(z19, "secure")) {
                                        z18 = 1;
                                    } else if (n.f2(z19, "httponly")) {
                                        z15 = true;
                                    }
                                    i13 = e10 + 1;
                                    c10 = ';';
                                    c11 = '=';
                                    z18 = z18;
                                }
                            } else {
                                if (j10 == Long.MIN_VALUE) {
                                    j6 = Long.MIN_VALUE;
                                } else if (j10 != -1) {
                                    if (j10 <= 9223372036854775L) {
                                        j12 = j10 * 1000;
                                    }
                                    long j14 = currentTimeMillis + j12;
                                    if (j14 >= currentTimeMillis && j14 <= 253402300799999L) {
                                        j6 = j14;
                                    } else {
                                        j6 = 253402300799999L;
                                    }
                                } else {
                                    j6 = j11;
                                }
                                String str7 = sVar.f21253d;
                                if (str6 == null) {
                                    str = str7;
                                } else if (AbstractC3557B.K(str7, str6) || (n.c2(str7, str6, false) && str7.charAt((str7.length() - str6.length()) - 1) == '.' && !Xh.b.f22001f.b(str7))) {
                                    str = str6;
                                } else {
                                    i10 = 0;
                                }
                                if (str7.length() != str.length() && PublicSuffixDatabase.f41492g.a(str) == null) {
                                    c1666k = null;
                                    i10 = 0;
                                } else {
                                    String str8 = Separators.SLASH;
                                    i10 = 0;
                                    if (str5 != null && n.I2(str5, str8, false)) {
                                        str2 = str5;
                                    } else {
                                        String b10 = sVar.b();
                                        int o22 = n.o2(b10, '/', 0, 6);
                                        if (o22 != 0) {
                                            str8 = b10.substring(0, o22);
                                            AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", str8);
                                        }
                                        str2 = str8;
                                    }
                                    c1666k = new C1666k(z10, z11, j6, str, str2, z18, z15, z16, z17);
                                }
                            }
                        }
                    }
                }
            }
            i10 = i11;
            c1666k = null;
            if (c1666k != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1666k);
            }
            i12++;
            i11 = i10;
        }
        if (arrayList != null) {
            list = Collections.unmodifiableList(arrayList);
            AbstractC3557B.b0("{\n        Collections.un\u2026ableList(cookies)\n      }", list);
        } else {
            list = v.f37483Y;
        }
        list.isEmpty();
    }
}
