package j$.time.format;

import android.gov.nist.javax.sip.header.ParameterNames;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public final class DateTimeFormatter {

    /* renamed from: h  reason: collision with root package name */
    public static final DateTimeFormatter f34977h;

    /* renamed from: i  reason: collision with root package name */
    public static final DateTimeFormatter f34978i;

    /* renamed from: j  reason: collision with root package name */
    public static final DateTimeFormatter f34979j;

    /* renamed from: k  reason: collision with root package name */
    public static final DateTimeFormatter f34980k;

    /* renamed from: a  reason: collision with root package name */
    private final C3712f f34981a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f34982b;

    /* renamed from: c  reason: collision with root package name */
    private final D f34983c;

    /* renamed from: d  reason: collision with root package name */
    private final F f34984d;

    /* renamed from: f  reason: collision with root package name */
    private final j$.time.chrono.k f34986f;

    /* renamed from: e  reason: collision with root package name */
    private final Set f34985e = null;

    /* renamed from: g  reason: collision with root package name */
    private final ZoneId f34987g = null;

    static {
        x xVar = new x();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        G g10 = G.EXCEEDS_PAD;
        xVar.q(aVar, 4, 10, g10);
        xVar.e('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        xVar.p(aVar2, 2);
        xVar.e('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        xVar.p(aVar3, 2);
        F f6 = F.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.f34946d;
        DateTimeFormatter y10 = xVar.y(f6, rVar);
        f34977h = y10;
        x xVar2 = new x();
        xVar2.u();
        xVar2.a(y10);
        xVar2.j();
        xVar2.y(f6, rVar);
        x xVar3 = new x();
        xVar3.u();
        xVar3.a(y10);
        xVar3.t();
        xVar3.j();
        xVar3.y(f6, rVar);
        x xVar4 = new x();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        xVar4.p(aVar4, 2);
        xVar4.e(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        xVar4.p(aVar5, 2);
        xVar4.t();
        xVar4.e(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        xVar4.p(aVar6, 2);
        xVar4.t();
        xVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter y11 = xVar4.y(f6, null);
        x xVar5 = new x();
        xVar5.u();
        xVar5.a(y11);
        xVar5.j();
        xVar5.y(f6, null);
        x xVar6 = new x();
        xVar6.u();
        xVar6.a(y11);
        xVar6.t();
        xVar6.j();
        xVar6.y(f6, null);
        x xVar7 = new x();
        xVar7.u();
        xVar7.a(y10);
        xVar7.e('T');
        xVar7.a(y11);
        DateTimeFormatter y12 = xVar7.y(f6, rVar);
        f34978i = y12;
        x xVar8 = new x();
        xVar8.u();
        xVar8.a(y12);
        xVar8.w();
        xVar8.j();
        xVar8.x();
        DateTimeFormatter y13 = xVar8.y(f6, rVar);
        f34979j = y13;
        x xVar9 = new x();
        xVar9.a(y13);
        xVar9.t();
        xVar9.e('[');
        xVar9.v();
        xVar9.r();
        xVar9.e(']');
        xVar9.y(f6, rVar);
        x xVar10 = new x();
        xVar10.a(y12);
        xVar10.t();
        xVar10.j();
        xVar10.t();
        xVar10.e('[');
        xVar10.v();
        xVar10.r();
        xVar10.e(']');
        xVar10.y(f6, rVar);
        x xVar11 = new x();
        xVar11.u();
        xVar11.q(aVar, 4, 10, g10);
        xVar11.e('-');
        xVar11.p(j$.time.temporal.a.DAY_OF_YEAR, 3);
        xVar11.t();
        xVar11.j();
        xVar11.y(f6, rVar);
        x xVar12 = new x();
        xVar12.u();
        xVar12.q(j$.time.temporal.j.f35125c, 4, 10, g10);
        xVar12.f("-W");
        xVar12.p(j$.time.temporal.j.f35124b, 2);
        xVar12.e('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        xVar12.p(aVar7, 1);
        xVar12.t();
        xVar12.j();
        xVar12.y(f6, rVar);
        x xVar13 = new x();
        xVar13.u();
        xVar13.c();
        f34980k = xVar13.y(f6, null);
        x xVar14 = new x();
        xVar14.u();
        xVar14.p(aVar, 4);
        xVar14.p(aVar2, 2);
        xVar14.p(aVar3, 2);
        xVar14.t();
        xVar14.w();
        xVar14.i("+HHMMss", "Z");
        xVar14.x();
        xVar14.y(f6, rVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        x xVar15 = new x();
        xVar15.u();
        xVar15.w();
        xVar15.t();
        xVar15.l(aVar7, hashMap);
        xVar15.f(", ");
        xVar15.s();
        xVar15.q(aVar3, 1, 2, G.NOT_NEGATIVE);
        xVar15.e(' ');
        xVar15.l(aVar2, hashMap2);
        xVar15.e(' ');
        xVar15.p(aVar, 4);
        xVar15.e(' ');
        xVar15.p(aVar4, 2);
        xVar15.e(':');
        xVar15.p(aVar5, 2);
        xVar15.t();
        xVar15.e(':');
        xVar15.p(aVar6, 2);
        xVar15.s();
        xVar15.e(' ');
        xVar15.i("+HHMM", "GMT");
        xVar15.y(F.SMART, rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DateTimeFormatter(C3712f c3712f, Locale locale, F f6, j$.time.chrono.r rVar) {
        D d10 = D.f34976a;
        this.f34981a = (C3712f) Objects.requireNonNull(c3712f, "printerParser");
        this.f34982b = (Locale) Objects.requireNonNull(locale, "locale");
        this.f34983c = (D) Objects.requireNonNull(d10, "decimalStyle");
        this.f34984d = (F) Objects.requireNonNull(f6, "resolverStyle");
        this.f34986f = rVar;
    }

    private TemporalAccessor f(CharSequence charSequence) {
        String str;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, ParameterNames.TEXT);
        Objects.requireNonNull(parsePosition, "position");
        y yVar = new y(this);
        int p10 = this.f34981a.p(yVar, charSequence, parsePosition.getIndex());
        if (p10 < 0) {
            parsePosition.setErrorIndex(~p10);
            yVar = null;
        } else {
            parsePosition.setIndex(p10);
        }
        if (yVar == null || parsePosition.getErrorIndex() >= 0 || parsePosition.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            if (parsePosition.getErrorIndex() >= 0) {
                String str2 = "Text '" + str + "' could not be parsed at index " + parsePosition.getErrorIndex();
                parsePosition.getErrorIndex();
                throw new DateTimeParseException(str2, charSequence);
            }
            String str3 = "Text '" + str + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
            parsePosition.getIndex();
            throw new DateTimeParseException(str3, charSequence);
        }
        return yVar.t(this.f34984d, this.f34985e);
    }

    public static DateTimeFormatter ofLocalizedDate(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        x xVar = new x();
        xVar.g(formatStyle, null);
        return xVar.y(F.SMART, j$.time.chrono.r.f34946d);
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        Objects.requireNonNull(formatStyle, "dateTimeStyle");
        x xVar = new x();
        xVar.g(formatStyle, formatStyle);
        return xVar.y(F.SMART, j$.time.chrono.r.f34946d);
    }

    public static DateTimeFormatter ofPattern(String str) {
        x xVar = new x();
        xVar.k(str);
        return xVar.z(Locale.getDefault());
    }

    public final j$.time.chrono.k a() {
        return this.f34986f;
    }

    public final D b() {
        return this.f34983c;
    }

    public final Locale c() {
        return this.f34982b;
    }

    public final ZoneId d() {
        return this.f34987g;
    }

    public final Object e(CharSequence charSequence, j$.time.e eVar) {
        String str;
        Objects.requireNonNull(charSequence, ParameterNames.TEXT);
        Objects.requireNonNull(eVar, "query");
        try {
            return ((E) f(charSequence)).z(eVar);
        } catch (DateTimeParseException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            RuntimeException runtimeException = new RuntimeException("Text '" + str + "' could not be parsed: " + e11.getMessage(), e11);
            charSequence.toString();
            throw runtimeException;
        }
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            this.f34981a.g(new A(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C3712f g() {
        return this.f34981a.a();
    }

    public final String toString() {
        String c3712f = this.f34981a.toString();
        return c3712f.startsWith("[") ? c3712f : c3712f.substring(1, c3712f.length() - 1);
    }
}
