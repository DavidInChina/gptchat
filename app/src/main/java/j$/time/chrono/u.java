package j$.time.chrono;

import android.gov.nist.core.Separators;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class u extends AbstractC3698a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final u f34949d = new u();
    private static final long serialVersionUID = 459996390165777884L;

    private u() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate D(int i10, int i11, int i12) {
        return new w(LocalDate.of(i10, i11, i12));
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.w F(j$.time.temporal.a aVar) {
        long year;
        long j6;
        switch (t.f34948a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new DateTimeException("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.w.k(1L, x.x(), 999999999 - x.i().n().getYear());
            case 6:
                return j$.time.temporal.w.k(1L, x.v(), j$.time.temporal.a.DAY_OF_YEAR.p().d());
            case 7:
                year = w.f34951d.getYear();
                j6 = 999999999;
                break;
            case 8:
                year = x.f34955d.getValue();
                j6 = x.i().getValue();
                break;
            default:
                return aVar.p();
        }
        return j$.time.temporal.w.j(year, j6);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime G(Instant instant, ZoneId zoneId) {
        return j.Q(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List I() {
        return j$.com.android.tools.r8.a.m(x.D());
    }

    @Override // j$.time.chrono.k
    public final boolean K(long j6) {
        return r.f34946d.K(j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.lang.Object, j$.time.temporal.p] */
    @Override // j$.time.chrono.AbstractC3698a
    final ChronoLocalDate L(HashMap hashMap, j$.time.format.F f6) {
        w wVar;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l10 = (Long) hashMap.get(aVar);
        x t10 = l10 != null ? x.t(F(aVar).a(l10.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l11 = (Long) hashMap.get(aVar2);
        int a5 = l11 != null ? F(aVar2).a(l11.longValue(), aVar2) : 0;
        if (t10 == null && l11 != null && !hashMap.containsKey(j$.time.temporal.a.YEAR) && f6 != j$.time.format.F.STRICT) {
            t10 = x.D()[x.D().length - 1];
        }
        if (l11 != null && t10 != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (hashMap.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (hashMap.containsKey(aVar4)) {
                    hashMap.remove(aVar);
                    hashMap.remove(aVar2);
                    if (f6 == j$.time.format.F.LENIENT) {
                        return new w(LocalDate.of((t10.n().getYear() + a5) - 1, 1, 1)).S(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).S(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int a10 = F(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
                    int a11 = F(aVar4).a(((Long) hashMap.remove(aVar4)).longValue(), aVar4);
                    if (f6 != j$.time.format.F.SMART) {
                        LocalDate localDate = w.f34951d;
                        Objects.requireNonNull(t10, "era");
                        LocalDate of2 = LocalDate.of((t10.n().getYear() + a5) - 1, a10, a11);
                        if (!of2.T(t10.n()) && t10 == x.h(of2)) {
                            return new w(t10, a5, of2);
                        }
                        throw new DateTimeException("year, month, and day not valid for Era");
                    } else if (a5 < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + a5);
                    } else {
                        int year = (t10.n().getYear() + a5) - 1;
                        try {
                            wVar = new w(LocalDate.of(year, a10, a11));
                        } catch (DateTimeException unused) {
                            wVar = new w(LocalDate.of(year, a10, 1)).V(new Object());
                        }
                        if (wVar.R() == t10 || j$.time.temporal.q.a(wVar, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a5 <= 1) {
                            return wVar;
                        }
                        throw new DateTimeException("Invalid YearOfEra for Era: " + t10 + Separators.SP + a5);
                    }
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (hashMap.containsKey(aVar5)) {
                hashMap.remove(aVar);
                hashMap.remove(aVar2);
                if (f6 == j$.time.format.F.LENIENT) {
                    return new w(LocalDate.Y((t10.n().getYear() + a5) - 1, 1)).S(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int a12 = F(aVar5).a(((Long) hashMap.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = w.f34951d;
                Objects.requireNonNull(t10, "era");
                int year2 = t10.n().getYear();
                LocalDate Y7 = a5 == 1 ? LocalDate.Y(year2, (t10.n().S() + a12) - 1) : LocalDate.Y((year2 + a5) - 1, a12);
                if (!Y7.T(t10.n()) && t10 == x.h(Y7)) {
                    return new w(t10, a5, Y7);
                }
                throw new DateTimeException("Invalid parameters");
            }
        }
        return null;
    }

    @Override // j$.time.chrono.k
    public final l M(int i10) {
        return x.t(i10);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDate h(HashMap hashMap, j$.time.format.F f6) {
        return (w) super.h(hashMap, f6);
    }

    @Override // j$.time.chrono.k
    public final int i(l lVar, int i10) {
        if (lVar instanceof x) {
            x xVar = (x) lVar;
            int year = (xVar.n().getYear() + i10) - 1;
            if (i10 == 1) {
                return year;
            }
            if (year >= -999999999 && year <= 999999999 && year >= xVar.n().getYear() && lVar == x.h(LocalDate.of(year, 1, 1))) {
                return year;
            }
            throw new DateTimeException("Invalid yearOfEra value");
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate n(long j6) {
        return new w(LocalDate.ofEpochDay(j6));
    }

    @Override // j$.time.chrono.AbstractC3698a
    public final ChronoLocalDate p() {
        LocalDate W6 = LocalDate.W(Clock.c());
        return W6 instanceof w ? (w) W6 : new w(LocalDate.P(W6));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof w ? (w) temporalAccessor : new w(LocalDate.P(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDateTime t(LocalDateTime localDateTime) {
        return super.t(localDateTime);
    }

    @Override // j$.time.chrono.k
    public final String v() {
        return "japanese";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i10, int i11) {
        return new w(LocalDate.Y(i10, i11));
    }
}
