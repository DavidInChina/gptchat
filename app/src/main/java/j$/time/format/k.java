package j$.time.format;

import android.gov.nist.core.Separators;
import j$.time.chrono.AbstractC3699b;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k implements AbstractC3713g {

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap f35015c = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a  reason: collision with root package name */
    private final FormatStyle f35016a;

    /* renamed from: b  reason: collision with root package name */
    private final FormatStyle f35017b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.f35016a = formatStyle;
        this.f35017b = formatStyle2;
    }

    private DateTimeFormatter a(Locale locale, j$.time.chrono.k kVar) {
        String id2 = kVar.getId();
        String locale2 = locale.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(id2);
        sb2.append("|");
        sb2.append(locale2);
        sb2.append("|");
        FormatStyle formatStyle = this.f35016a;
        sb2.append(formatStyle);
        FormatStyle formatStyle2 = this.f35017b;
        sb2.append(formatStyle2);
        String sb3 = sb2.toString();
        ConcurrentHashMap concurrentHashMap = f35015c;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(sb3);
        if (dateTimeFormatter == null) {
            Objects.requireNonNull(locale, "locale");
            Objects.requireNonNull(kVar, "chrono");
            if (formatStyle == null && formatStyle2 == null) {
                throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
            }
            DateFormat dateInstance = formatStyle2 == null ? DateFormat.getDateInstance(formatStyle.ordinal(), locale) : formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
            if (!(dateInstance instanceof SimpleDateFormat)) {
                throw new UnsupportedOperationException("Can't determine pattern from " + dateInstance);
            }
            String pattern = ((SimpleDateFormat) dateInstance).toPattern();
            if (pattern == null) {
                pattern = null;
            } else {
                int i10 = 0;
                boolean z10 = pattern.indexOf(66) != -1;
                boolean z11 = pattern.indexOf(98) != -1;
                if (z10 || z11) {
                    StringBuilder sb4 = new StringBuilder(pattern.length());
                    char c10 = ' ';
                    while (i10 < pattern.length()) {
                        char charAt = pattern.charAt(i10);
                        if (charAt == ' ' ? i10 == 0 || (c10 != 'B' && c10 != 'b') : charAt != 'B' && charAt != 'b') {
                            sb4.append(charAt);
                        }
                        i10++;
                        c10 = charAt;
                    }
                    int length = sb4.length() - 1;
                    if (length >= 0 && sb4.charAt(length) == ' ') {
                        sb4.deleteCharAt(length);
                    }
                    pattern = sb4.toString();
                }
            }
            x xVar = new x();
            xVar.k(pattern);
            DateTimeFormatter z12 = xVar.z(locale);
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(sb3, z12);
            return dateTimeFormatter2 != null ? dateTimeFormatter2 : z12;
        }
        return dateTimeFormatter;
    }

    @Override // j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        a(a5.c(), AbstractC3699b.p(a5.d())).g().g(a5, sb2);
        return true;
    }

    @Override // j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        return a(yVar.i(), yVar.h()).g().p(yVar, charSequence, i10);
    }

    public final String toString() {
        Object obj = "";
        Object obj2 = this.f35016a;
        if (obj2 == null) {
            obj2 = obj;
        }
        Object obj3 = this.f35017b;
        if (obj3 != null) {
            obj = obj3;
        }
        return "Localized(" + obj2 + Separators.COMMA + obj + Separators.RPAREN;
    }
}
