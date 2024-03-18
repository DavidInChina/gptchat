package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.LocalDate;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: h  reason: collision with root package name */
    private static final C3707a f35062h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static final HashMap f35063i;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f35064j = 0;

    /* renamed from: a  reason: collision with root package name */
    private x f35065a;

    /* renamed from: b  reason: collision with root package name */
    private final x f35066b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f35067c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f35068d;

    /* renamed from: e  reason: collision with root package name */
    private int f35069e;

    /* renamed from: f  reason: collision with root package name */
    private char f35070f;

    /* renamed from: g  reason: collision with root package name */
    private int f35071g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a, java.lang.Object] */
    static {
        HashMap hashMap = new HashMap();
        f35063i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.f35123a;
        hashMap.put('Q', rVar);
        hashMap.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.l.f35131a);
    }

    public x() {
        this.f35065a = this;
        this.f35067c = new ArrayList();
        this.f35071g = -1;
        this.f35066b = null;
        this.f35068d = false;
    }

    private x(x xVar) {
        this.f35065a = this;
        this.f35067c = new ArrayList();
        this.f35071g = -1;
        this.f35066b = xVar;
        this.f35068d = true;
    }

    private DateTimeFormatter A(Locale locale, F f6, j$.time.chrono.r rVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f35065a.f35066b != null) {
            s();
        }
        C3712f c3712f = new C3712f(this.f35067c, false);
        D d10 = D.f34976a;
        return new DateTimeFormatter(c3712f, locale, f6, rVar);
    }

    private int d(AbstractC3713g abstractC3713g) {
        Objects.requireNonNull(abstractC3713g, "pp");
        x xVar = this.f35065a;
        int i10 = xVar.f35069e;
        if (i10 > 0) {
            if (abstractC3713g != null) {
                abstractC3713g = new n(abstractC3713g, i10, xVar.f35070f);
            }
            xVar.f35069e = 0;
            xVar.f35070f = (char) 0;
        }
        xVar.f35067c.add(abstractC3713g);
        x xVar2 = this.f35065a;
        xVar2.f35071g = -1;
        return xVar2.f35067c.size() - 1;
    }

    private void n(l lVar) {
        l lVar2;
        G g10;
        x xVar = this.f35065a;
        int i10 = xVar.f35071g;
        if (i10 < 0) {
            xVar.f35071g = d(lVar);
            return;
        }
        l lVar3 = (l) xVar.f35067c.get(i10);
        int i11 = lVar.f35020b;
        int i12 = lVar.f35021c;
        if (i11 == i12) {
            g10 = lVar.f35022d;
            if (g10 == G.NOT_NEGATIVE) {
                lVar2 = lVar3.f(i12);
                d(lVar.e());
                this.f35065a.f35071g = i10;
                this.f35065a.f35067c.set(i10, lVar2);
            }
        }
        lVar2 = lVar3.e();
        this.f35065a.f35071g = d(lVar);
        this.f35065a.f35067c.set(i10, lVar2);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.g());
    }

    public final void b(j$.time.temporal.a aVar, int i10, int i11, boolean z10) {
        if (i10 != i11 || z10) {
            d(new C3714h(aVar, i10, i11, z10));
        } else {
            n(new C3714h(aVar, i10, i11, z10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.g, java.lang.Object] */
    public final void c() {
        d(new Object());
    }

    public final void e(char c10) {
        d(new C3711e(c10));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (!str.isEmpty()) {
            d(str.length() == 1 ? new C3711e(str.charAt(0)) : new j(str, 1));
        }
    }

    public final void g(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        d(new k(formatStyle, formatStyle2));
    }

    public final void h(H h10) {
        Objects.requireNonNull(h10, "style");
        if (h10 == H.FULL || h10 == H.SHORT) {
            d(new j(h10, 0));
            return;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public final void i(String str, String str2) {
        d(new m(str, str2));
    }

    public final void j() {
        d(m.f35025e);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0417 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(String str) {
        int i10;
        u uVar;
        String str2;
        String str3;
        H h10;
        w wVar;
        G g10;
        boolean z10;
        u uVar2;
        H h11;
        int i11;
        int i12;
        Objects.requireNonNull(str, "pattern");
        int i13 = 0;
        while (i13 < str.length()) {
            char charAt = str.charAt(i13);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i14 = i13 + 1;
                while (i14 < str.length() && str.charAt(i14) == charAt) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (charAt == 'p') {
                    if (i14 >= str.length() || (((charAt = str.charAt(i14)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i11 = i14;
                        i12 = i15;
                        i15 = 0;
                    } else {
                        i11 = i14 + 1;
                        while (i11 < str.length() && str.charAt(i11) == charAt) {
                            i11++;
                        }
                        i12 = i11 - i14;
                    }
                    if (i15 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i15 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i15);
                    }
                    x xVar = this.f35065a;
                    xVar.f35069e = i15;
                    xVar.f35070f = ' ';
                    xVar.f35071g = -1;
                    i15 = i12;
                    i10 = i11;
                } else {
                    i10 = i14;
                }
                j$.time.temporal.r rVar = (j$.time.temporal.r) f35063i.get(Character.valueOf(charAt));
                if (rVar != null) {
                    if (charAt != 'A') {
                        if (charAt != 'Q') {
                            if (charAt != 'S') {
                                if (charAt != 'a') {
                                    if (charAt != 'k') {
                                        if (charAt != 'q') {
                                            if (charAt != 's') {
                                                if (charAt != 'u' && charAt != 'y') {
                                                    if (charAt != 'g') {
                                                        if (charAt != 'h' && charAt != 'm') {
                                                            if (charAt != 'n') {
                                                                switch (charAt) {
                                                                    case 'D':
                                                                        if (i15 != 1) {
                                                                            if (i15 != 2 && i15 != 3) {
                                                                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                            }
                                                                            q(rVar, i15, 3, G.NOT_NEGATIVE);
                                                                            break;
                                                                        }
                                                                        o(rVar);
                                                                        break;
                                                                    case 'E':
                                                                        break;
                                                                    case 'F':
                                                                        if (i15 != 1) {
                                                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                        }
                                                                        o(rVar);
                                                                        break;
                                                                    case 'G':
                                                                        if (i15 != 1 && i15 != 2 && i15 != 3) {
                                                                            if (i15 != 4) {
                                                                                if (i15 != 5) {
                                                                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                                }
                                                                                h11 = H.NARROW;
                                                                                m(rVar, h11);
                                                                                break;
                                                                            }
                                                                            h11 = H.FULL;
                                                                            m(rVar, h11);
                                                                        }
                                                                        break;
                                                                    case 'H':
                                                                        break;
                                                                    default:
                                                                        switch (charAt) {
                                                                            case 'K':
                                                                                break;
                                                                            case 'L':
                                                                                break;
                                                                            case 'M':
                                                                                break;
                                                                            case 'N':
                                                                                break;
                                                                            default:
                                                                                switch (charAt) {
                                                                                    case 'c':
                                                                                        if (i15 == 1) {
                                                                                            uVar2 = new u(charAt, i15, i15, i15, 0);
                                                                                            n(uVar2);
                                                                                            break;
                                                                                        } else if (i15 == 2) {
                                                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                                        }
                                                                                        break;
                                                                                    case 'd':
                                                                                        break;
                                                                                    case 'e':
                                                                                        break;
                                                                                    default:
                                                                                        if (i15 != 1) {
                                                                                            p(rVar, i15);
                                                                                            break;
                                                                                        } else {
                                                                                            o(rVar);
                                                                                            break;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    g10 = G.NORMAL;
                                                    q(rVar, i15, 19, g10);
                                                } else if (i15 == 2) {
                                                    LocalDate localDate = r.f35043i;
                                                    Objects.requireNonNull(rVar, "field");
                                                    Objects.requireNonNull(localDate, "baseDate");
                                                    n(new r(rVar, localDate));
                                                } else {
                                                    if (i15 >= 4) {
                                                        g10 = G.EXCEEDS_PAD;
                                                        q(rVar, i15, 19, g10);
                                                    }
                                                    g10 = G.NORMAL;
                                                    q(rVar, i15, 19, g10);
                                                }
                                            }
                                        }
                                        z10 = true;
                                        if (i15 == 1 && i15 != 2) {
                                            if (i15 != 3) {
                                                if (i15 == 4) {
                                                    if (z10) {
                                                        h11 = H.FULL_STANDALONE;
                                                    }
                                                    h11 = H.FULL;
                                                } else if (i15 != 5) {
                                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                } else {
                                                    if (z10) {
                                                        h11 = H.NARROW_STANDALONE;
                                                    }
                                                    h11 = H.NARROW;
                                                }
                                            } else if (z10) {
                                                h11 = H.SHORT_STANDALONE;
                                            }
                                            m(rVar, h11);
                                        } else if (charAt != 'e') {
                                            uVar2 = new u(charAt, i15, i15, i15, 0);
                                            n(uVar2);
                                        } else if (charAt != 'E') {
                                            if (i15 != 1) {
                                                p(rVar, 2);
                                            }
                                            o(rVar);
                                        }
                                    }
                                    if (i15 != 1) {
                                        if (i15 != 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                        }
                                        p(rVar, i15);
                                    }
                                    o(rVar);
                                } else if (i15 != 1) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                h11 = H.SHORT;
                                m(rVar, h11);
                            } else {
                                b(j$.time.temporal.a.NANO_OF_SECOND, i15, i15, false);
                            }
                        }
                        z10 = false;
                        if (i15 == 1) {
                        }
                        if (charAt != 'e') {
                        }
                    }
                    g10 = G.NOT_NEGATIVE;
                    q(rVar, i15, 19, g10);
                } else if (charAt == 'z') {
                    if (i15 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    d(i15 == 4 ? new w(H.FULL, false) : new w(H.SHORT, false));
                } else if (charAt == 'V') {
                    if (i15 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                    d(new v(j$.time.temporal.q.l(), "ZoneId()"));
                } else if (charAt == 'v') {
                    if (i15 == 1) {
                        wVar = new w(H.SHORT, true);
                    } else if (i15 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + charAt);
                    } else {
                        wVar = new w(H.FULL, true);
                    }
                    d(wVar);
                } else {
                    String str4 = "+0000";
                    if (charAt == 'Z') {
                        if (i15 < 4) {
                            str2 = "+HHMM";
                            i(str2, str4);
                        } else {
                            if (i15 != 4) {
                                if (i15 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                str3 = "+HH:MM:ss";
                                i(str3, "Z");
                            }
                            h10 = H.FULL;
                            h(h10);
                        }
                    } else if (charAt == 'O') {
                        if (i15 == 1) {
                            h10 = H.SHORT;
                            h(h10);
                        } else {
                            if (i15 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            h10 = H.FULL;
                            h(h10);
                        }
                    } else if (charAt == 'X') {
                        if (i15 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        str3 = m.f35024d[i15 + (i15 == 1 ? 0 : 1)];
                        i(str3, "Z");
                    } else if (charAt != 'x') {
                        if (charAt == 'W') {
                            if (i15 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            uVar = new u(charAt, i15, i15, i15, 0);
                        } else if (charAt == 'w') {
                            if (i15 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            uVar = new u(charAt, i15, i15, 2, 0);
                        } else if (charAt != 'Y') {
                            throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                        } else {
                            uVar = i15 == 2 ? new u(charAt, i15, i15, 2, 0) : new u(charAt, i15, i15, 19, 0);
                        }
                        n(uVar);
                    } else if (i15 > 5) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else {
                        if (i15 == 1) {
                            str4 = "+00";
                        } else if (i15 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = m.f35024d[i15 + (i15 == 1 ? 0 : 1)];
                        i(str2, str4);
                    }
                }
                i13 = (-1) + i10;
            } else if (charAt == '\'') {
                int i16 = i13 + 1;
                int i17 = i16;
                while (i17 < str.length()) {
                    if (str.charAt(i17) == '\'') {
                        int i18 = i17 + 1;
                        if (i18 < str.length() && str.charAt(i18) == '\'') {
                            i17 = i18;
                        }
                        if (i17 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i16, i17);
                        if (substring.isEmpty()) {
                            e('\'');
                        } else {
                            f(substring.replace("''", Separators.QUOTE));
                        }
                        i13 = i17;
                    }
                    i17++;
                }
                if (i17 < str.length()) {
                }
            } else if (charAt == '[') {
                t();
            } else if (charAt == ']') {
                if (this.f35065a.f35066b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                s();
            } else if (charAt == '{' || charAt == '}' || charAt == '#') {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + Separators.QUOTE);
            } else {
                e(charAt);
            }
            i13++;
        }
    }

    public final void l(j$.time.temporal.a aVar, HashMap hashMap) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        H h10 = H.FULL;
        d(new t(aVar, h10, new C3708b(new B(Collections.singletonMap(h10, linkedHashMap)))));
    }

    public final void m(j$.time.temporal.r rVar, H h10) {
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(h10, "textStyle");
        d(new t(rVar, h10, C.d()));
    }

    public final void o(j$.time.temporal.r rVar) {
        Objects.requireNonNull(rVar, "field");
        n(new l(rVar, 1, 19, G.NORMAL));
    }

    public final void p(j$.time.temporal.r rVar, int i10) {
        Objects.requireNonNull(rVar, "field");
        if (i10 >= 1 && i10 <= 19) {
            n(new l(rVar, i10, i10, G.NOT_NEGATIVE));
            return;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
    }

    public final void q(j$.time.temporal.r rVar, int i10, int i11, G g10) {
        if (i10 == i11 && g10 == G.NOT_NEGATIVE) {
            p(rVar, i11);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(g10, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        } else if (i11 >= i10) {
            n(new l(rVar, i10, i11, g10));
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    public final void r() {
        d(new v(f35062h, "ZoneRegionId()"));
    }

    public final void s() {
        x xVar = this.f35065a;
        if (xVar.f35066b != null) {
            if (xVar.f35067c.size() <= 0) {
                this.f35065a = this.f35065a.f35066b;
                return;
            }
            x xVar2 = this.f35065a;
            C3712f c3712f = new C3712f(xVar2.f35067c, xVar2.f35068d);
            this.f35065a = this.f35065a.f35066b;
            d(c3712f);
            return;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public final void t() {
        x xVar = this.f35065a;
        xVar.f35071g = -1;
        this.f35065a = new x(xVar);
    }

    public final void u() {
        d(s.INSENSITIVE);
    }

    public final void v() {
        d(s.SENSITIVE);
    }

    public final void w() {
        d(s.LENIENT);
    }

    public final void x() {
        d(s.STRICT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter y(F f6, j$.time.chrono.r rVar) {
        return A(Locale.getDefault(), f6, rVar);
    }

    public final DateTimeFormatter z(Locale locale) {
        return A(locale, F.SMART, null);
    }
}
