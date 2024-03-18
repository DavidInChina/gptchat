package j$.time.chrono;

import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class F extends AbstractC3698a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final F f34906d = new F();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"\u0e1e.\u0e28.", "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a", "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"});
    }

    private F() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate D(int i10, int i11, int i12) {
        return new H(LocalDate.of(i10 - 543, i11, i12));
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.w F(j$.time.temporal.a aVar) {
        int i10 = E.f34905a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.w p10 = j$.time.temporal.a.PROLEPTIC_MONTH.p();
            return j$.time.temporal.w.j(p10.e() + 6516, p10.d() + 6516);
        } else if (i10 == 2) {
            j$.time.temporal.w p11 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.w.k(1L, (-(p11.e() + 543)) + 1, p11.d() + 543);
        } else if (i10 != 3) {
            return aVar.p();
        } else {
            j$.time.temporal.w p12 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.w.j(p12.e() + 543, p12.d() + 543);
        }
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime G(Instant instant, ZoneId zoneId) {
        return j.Q(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List I() {
        return j$.com.android.tools.r8.a.m(I.values());
    }

    @Override // j$.time.chrono.k
    public final boolean K(long j6) {
        return r.f34946d.K(j6 - 543);
    }

    @Override // j$.time.chrono.k
    public final l M(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return I.BE;
            }
            throw new DateTimeException("Invalid era: " + i10);
        }
        return I.BEFORE_BE;
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDate h(HashMap hashMap, j$.time.format.F f6) {
        return (H) super.h(hashMap, f6);
    }

    @Override // j$.time.chrono.k
    public final int i(l lVar, int i10) {
        if (lVar instanceof I) {
            return lVar == I.BE ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate n(long j6) {
        return new H(LocalDate.ofEpochDay(j6));
    }

    @Override // j$.time.chrono.AbstractC3698a
    public final ChronoLocalDate p() {
        LocalDate W6 = LocalDate.W(Clock.c());
        return W6 instanceof H ? (H) W6 : new H(LocalDate.P(W6));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof H ? (H) temporalAccessor : new H(LocalDate.P(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDateTime t(LocalDateTime localDateTime) {
        return super.t(localDateTime);
    }

    @Override // j$.time.chrono.k
    public final String v() {
        return "buddhist";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i10, int i11) {
        return new H(LocalDate.Y(i10 - 543, i11));
    }
}
