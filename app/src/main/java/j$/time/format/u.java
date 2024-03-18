package j$.time.format;

import android.gov.nist.core.Separators;
import j$.util.Objects;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class u extends l {

    /* renamed from: g  reason: collision with root package name */
    private char f35051g;

    /* renamed from: h  reason: collision with root package name */
    private int f35052h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(char c10, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, G.NOT_NEGATIVE, i13);
        this.f35051g = c10;
        this.f35052h = i10;
    }

    private l h(Locale locale) {
        j$.time.temporal.r i10;
        j$.time.temporal.u uVar = j$.time.temporal.y.f35156h;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.y g10 = j$.time.temporal.y.g(j$.time.c.SUNDAY.O(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c10 = this.f35051g;
        if (c10 == 'W') {
            i10 = g10.i();
        } else if (c10 == 'Y') {
            j$.time.temporal.r h10 = g10.h();
            int i11 = this.f35052h;
            if (i11 == 2) {
                return new r(h10, r.f35043i, this.f35023e);
            }
            return new l(h10, i11, 19, i11 < 4 ? G.NORMAL : G.EXCEEDS_PAD, this.f35023e);
        } else if (c10 == 'c' || c10 == 'e') {
            i10 = g10.d();
        } else if (c10 != 'w') {
            throw new IllegalStateException("unreachable");
        } else {
            i10 = g10.j();
        }
        return new l(i10, this.f35020b, this.f35021c, G.NOT_NEGATIVE, this.f35023e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final l e() {
        if (this.f35023e == -1) {
            return this;
        }
        return new u(this.f35051g, this.f35052h, this.f35020b, this.f35021c, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.format.l
    public final l f(int i10) {
        return new u(this.f35051g, this.f35052h, this.f35020b, this.f35021c, this.f35023e + i10);
    }

    @Override // j$.time.format.l, j$.time.format.AbstractC3713g
    public final boolean g(A a5, StringBuilder sb2) {
        return h(a5.c()).g(a5, sb2);
    }

    @Override // j$.time.format.l, j$.time.format.AbstractC3713g
    public final int p(y yVar, CharSequence charSequence, int i10) {
        return h(yVar.i()).p(yVar, charSequence, i10);
    }

    @Override // j$.time.format.l
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f35052h;
        char c10 = this.f35051g;
        if (c10 == 'Y') {
            if (i10 == 1) {
                str2 = "WeekBasedYear";
            } else if (i10 == 2) {
                str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb2.append("WeekBasedYear,");
                sb2.append(i10);
                sb2.append(",19,");
                sb2.append(i10 < 4 ? G.NORMAL : G.EXCEEDS_PAD);
            }
            sb2.append(str2);
        } else {
            if (c10 == 'W') {
                str = "WeekOfMonth";
            } else if (c10 == 'c' || c10 == 'e') {
                str = "DayOfWeek";
            } else {
                if (c10 == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb2.append(Separators.COMMA);
                sb2.append(i10);
            }
            sb2.append(str);
            sb2.append(Separators.COMMA);
            sb2.append(i10);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
