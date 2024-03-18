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
public final class z extends AbstractC3698a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final z f34961d = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    private z() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate D(int i10, int i11, int i12) {
        return new B(LocalDate.of(i10 + 1911, i11, i12));
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.w F(j$.time.temporal.a aVar) {
        int i10 = y.f34960a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.w p10 = j$.time.temporal.a.PROLEPTIC_MONTH.p();
            return j$.time.temporal.w.j(p10.e() - 22932, p10.d() - 22932);
        } else if (i10 == 2) {
            j$.time.temporal.w p11 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.w.k(1L, p11.d() - 1911, (-p11.e()) + 1912);
        } else if (i10 != 3) {
            return aVar.p();
        } else {
            j$.time.temporal.w p12 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.w.j(p12.e() - 1911, p12.d() - 1911);
        }
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime G(Instant instant, ZoneId zoneId) {
        return j.Q(this, instant, zoneId);
    }

    @Override // j$.time.chrono.k
    public final List I() {
        return j$.com.android.tools.r8.a.m(C.values());
    }

    @Override // j$.time.chrono.k
    public final boolean K(long j6) {
        return r.f34946d.K(j6 + 1911);
    }

    @Override // j$.time.chrono.k
    public final l M(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return C.ROC;
            }
            throw new DateTimeException("Invalid era: " + i10);
        }
        return C.BEFORE_ROC;
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDate h(HashMap hashMap, j$.time.format.F f6) {
        return (B) super.h(hashMap, f6);
    }

    @Override // j$.time.chrono.k
    public final int i(l lVar, int i10) {
        if (lVar instanceof C) {
            return lVar == C.ROC ? i10 : 1 - i10;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate n(long j6) {
        return new B(LocalDate.ofEpochDay(j6));
    }

    @Override // j$.time.chrono.AbstractC3698a
    public final ChronoLocalDate p() {
        LocalDate W6 = LocalDate.W(Clock.c());
        return W6 instanceof B ? (B) W6 : new B(LocalDate.P(W6));
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate q(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof B ? (B) temporalAccessor : new B(LocalDate.P(temporalAccessor));
    }

    @Override // j$.time.chrono.AbstractC3698a, j$.time.chrono.k
    public final ChronoLocalDateTime t(LocalDateTime localDateTime) {
        return super.t(localDateTime);
    }

    @Override // j$.time.chrono.k
    public final String v() {
        return "roc";
    }

    Object writeReplace() {
        return new D((byte) 1, this);
    }

    @Override // j$.time.chrono.k
    public final ChronoLocalDate x(int i10, int i11) {
        return new B(LocalDate.Y(i10 + 1911, i11));
    }
}
