package He;

import id.AbstractC3557B;
import xe.C6420i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f7677a;

    public c(String str) {
        AbstractC3557B.c0("pattern", str);
        this.f7677a = str;
        if (str.length() > 0) {
            return;
        }
        throw new IllegalStateException("Date parser pattern shouldn't be empty.".toString());
    }

    public static void a(C6420i c6420i, char c10, String str) {
        e eVar;
        int i10 = c6420i.f49898a;
        if (c10 == 's') {
            Integer valueOf = Integer.valueOf(Integer.parseInt(str));
            switch (i10) {
                case 0:
                    c6420i.f49899b = valueOf;
                    return;
                default:
                    c6420i.f49899b = valueOf;
                    return;
            }
        } else if (c10 == 'm') {
            Integer valueOf2 = Integer.valueOf(Integer.parseInt(str));
            switch (i10) {
                case 0:
                    c6420i.f49900c = valueOf2;
                    return;
                default:
                    c6420i.f49900c = valueOf2;
                    return;
            }
        } else if (c10 == 'h') {
            Integer valueOf3 = Integer.valueOf(Integer.parseInt(str));
            switch (i10) {
                case 0:
                    c6420i.f49901d = valueOf3;
                    return;
                default:
                    c6420i.f49901d = valueOf3;
                    return;
            }
        } else if (c10 == 'd') {
            Integer valueOf4 = Integer.valueOf(Integer.parseInt(str));
            switch (i10) {
                case 0:
                    c6420i.f49902e = valueOf4;
                    return;
                default:
                    c6420i.f49902e = valueOf4;
                    return;
            }
        } else {
            int i11 = 0;
            if (c10 == 'M') {
                e[] values = e.values();
                int length = values.length;
                while (true) {
                    if (i11 < length) {
                        eVar = values[i11];
                        if (AbstractC3557B.K(eVar.f7679Y, str)) {
                            break;
                        }
                        i11++;
                    } else {
                        eVar = null;
                        break;
                    }
                }
                if (eVar != null) {
                    switch (i10) {
                        case 0:
                            c6420i.f49903f = eVar;
                            return;
                        default:
                            c6420i.f49903f = eVar;
                            return;
                    }
                }
                throw new IllegalStateException("Invalid month: ".concat(str).toString());
            } else if (c10 == 'Y') {
                Integer valueOf5 = Integer.valueOf(Integer.parseInt(str));
                switch (i10) {
                    case 0:
                        c6420i.f49904g = valueOf5;
                        return;
                    default:
                        c6420i.f49904g = valueOf5;
                        return;
                }
            } else if (c10 == 'z') {
                if (!AbstractC3557B.K(str, "GMT")) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else if (c10 != '*') {
                while (i11 < str.length()) {
                    if (str.charAt(i11) == c10) {
                        i11++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
        }
    }

    public final b b(String str) {
        int i10 = 1;
        C6420i c6420i = new C6420i(1);
        String str2 = this.f7677a;
        int i11 = 0;
        char charAt = str2.charAt(0);
        int i12 = 0;
        while (i10 < str2.length()) {
            try {
                if (str2.charAt(i10) == charAt) {
                    i10++;
                } else {
                    int i13 = (i11 + i10) - i12;
                    String substring = str.substring(i11, i13);
                    AbstractC3557B.b0("this as java.lang.String\u2026ing(startIndex, endIndex)", substring);
                    a(c6420i, charAt, substring);
                    try {
                        charAt = str2.charAt(i10);
                        i12 = i10;
                        i10++;
                        i11 = i13;
                    } catch (Throwable unused) {
                        i11 = i13;
                        StringBuilder sb2 = new StringBuilder("Failed to parse date string: \"");
                        sb2.append(str);
                        sb2.append("\" at index ");
                        sb2.append(i11);
                        sb2.append(". Pattern: \"");
                        throw new IllegalStateException(android.gov.nist.core.a.n(sb2, str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i11 < str.length()) {
            String substring2 = str.substring(i11);
            AbstractC3557B.b0("this as java.lang.String).substring(startIndex)", substring2);
            a(c6420i, charAt, substring2);
        }
        return c6420i.a();
    }
}
