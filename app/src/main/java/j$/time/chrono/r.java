package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class r extends AbstractC3698a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final r f34946d = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    private r() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.AbstractC3698a
    final ChronoLocalDate A(HashMap hashMap, j$.time.format.F f6) {
        int i10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int O10 = aVar.O(((Long) hashMap.remove(aVar)).longValue());
        boolean z10 = true;
        if (f6 == j$.time.format.F.LENIENT) {
            return LocalDate.of(O10, 1, 1).plusMonths(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).a0(j$.com.android.tools.r8.a.r(((Long) hashMap.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int O11 = aVar2.O(((Long) hashMap.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int O12 = aVar3.O(((Long) hashMap.remove(aVar3)).longValue());
        if (f6 == j$.time.format.F.SMART) {
            if (O11 == 4 || O11 == 6 || O11 == 9 || O11 == 11) {
                i10 = 30;
            } else if (O11 == 2) {
                j$.time.k kVar = j$.time.k.FEBRUARY;
                long j6 = O10;
                int i11 = j$.time.s.f35109b;
                if ((3 & j6) != 0 || (j6 % 100 == 0 && j6 % 400 != 0)) {
                    z10 = false;
                }
                i10 = kVar.O(z10);
            }
            O12 = Math.min(O12, i10);
        }
        return LocalDate.of(O10, O11, O12);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate D(int i10, int i11, int i12) {
        return LocalDate.of(i10, i11, i12);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.w F(j$.time.temporal.a aVar) {
        return aVar.p();
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime G(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.O(instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List I() {
        return j$.com.android.tools.r8.a.m(s.values());
    }

    @Override // j$.time.chrono.k
    public final boolean K(long j6) {
        return (3 & j6) == 0 && (j6 % 100 != 0 || j6 % 400 == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r11 > 0) goto L15;
     */
    @Override // j$.time.chrono.AbstractC3698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final ChronoLocalDate L(HashMap hashMap, j$.time.format.F f6) {
        j$.time.temporal.a aVar;
        long r10;
        long longValue;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) hashMap.remove(aVar2);
        if (l10 == null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
            if (!hashMap.containsKey(aVar3)) {
                return null;
            }
            aVar3.P(((Long) hashMap.get(aVar3)).longValue());
            return null;
        }
        if (f6 != j$.time.format.F.LENIENT) {
            aVar2.P(l10.longValue());
        }
        Long l11 = (Long) hashMap.remove(j$.time.temporal.a.ERA);
        if (l11 != null) {
            if (l11.longValue() == 1) {
                aVar = j$.time.temporal.a.YEAR;
                r10 = l10.longValue();
            } else if (l11.longValue() != 0) {
                throw new DateTimeException("Invalid value for era: " + l11);
            } else {
                aVar = j$.time.temporal.a.YEAR;
                r10 = j$.com.android.tools.r8.a.r(1L, l10.longValue());
            }
            AbstractC3698a.g(hashMap, aVar, r10);
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.YEAR;
        Long l12 = (Long) hashMap.get(aVar4);
        if (f6 != j$.time.format.F.STRICT) {
            if (l12 == null || l12.longValue() > 0) {
                longValue = l10.longValue();
                AbstractC3698a.g(hashMap, aVar4, longValue);
                return null;
            }
            longValue = l10.longValue();
            longValue = j$.com.android.tools.r8.a.r(1L, longValue);
            AbstractC3698a.g(hashMap, aVar4, longValue);
            return null;
        } else if (l12 == null) {
            hashMap.put(aVar2, l10);
            return null;
        } else {
            int i10 = (l12.longValue() > 0L ? 1 : (l12.longValue() == 0L ? 0 : -1));
            longValue = l10.longValue();
        }
    }

    @Override // j$.time.chrono.k
    public final l M(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return s.CE;
            }
            throw new DateTimeException("Invalid era: " + i10);
        }
        return s.BCE;
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDate h(HashMap hashMap, j$.time.format.F f6) {
        return (LocalDate) super.h(hashMap, f6);
    }

    @Override // j$.time.chrono.k
    public final int i(l lVar, int i10) {
        if (lVar instanceof s) {
            return lVar == s.CE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate n(long j6) {
        return LocalDate.ofEpochDay(j6);
    }

    @Override // j$.time.chrono.AbstractC3698a
    public final ChronoLocalDate p() {
        Clock c10 = Clock.c();
        Objects.requireNonNull(c10, "clock");
        return LocalDate.P(LocalDate.W(c10));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return LocalDate.P(temporalAccessor);
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDateTime t(LocalDateTime localDateTime) {
        return LocalDateTime.O(localDateTime);
    }

    @Override // j$.time.chrono.k
    public final String v() {
        return "iso8601";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i10, int i11) {
        return LocalDate.Y(i10, i11);
    }

    @Override // j$.time.chrono.AbstractC3698a
    final void z(HashMap hashMap, j$.time.format.F f6) {
        long j6;
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l10 = (Long) hashMap.remove(aVar);
        if (l10 != null) {
            if (f6 != j$.time.format.F.LENIENT) {
                aVar.P(l10.longValue());
            }
            AbstractC3698a.g(hashMap, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.o(l10.longValue(), j6)) + 1);
            AbstractC3698a.g(hashMap, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.p(l10.longValue(), 12));
        }
    }
}
