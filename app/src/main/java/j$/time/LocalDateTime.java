package j$.time;

import android.gov.nist.javax.sip.parser.TokenNames;
import j$.time.chrono.AbstractC3699b;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, ChronoLocalDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = 6207766400415563566L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDate f34882a;

    /* renamed from: b  reason: collision with root package name */
    private final i f34883b;
    public static final LocalDateTime MIN = V(LocalDate.MIN, i.f35084e);
    public static final LocalDateTime MAX = V(LocalDate.MAX, i.f35085f);

    private LocalDateTime(LocalDate localDate, i iVar) {
        this.f34882a = localDate;
        this.f34883b = iVar;
    }

    private int L(LocalDateTime localDateTime) {
        int L10 = this.f34882a.L(localDateTime.c());
        return L10 == 0 ? this.f34883b.compareTo(localDateTime.f34883b) : L10;
    }

    public static LocalDateTime O(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).S();
        }
        if (temporalAccessor instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporalAccessor).S();
        }
        try {
            return new LocalDateTime(LocalDate.P(temporalAccessor), i.P(temporalAccessor));
        } catch (DateTimeException e10) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + name, e10);
        }
    }

    public static LocalDateTime T(int i10) {
        return new LocalDateTime(LocalDate.of(i10, 12, 31), i.U(0));
    }

    public static LocalDateTime U(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new LocalDateTime(LocalDate.of(i10, i11, i12), i.V(i13, i14, i15, 0));
    }

    public static LocalDateTime V(LocalDate localDate, i iVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(iVar, "time");
        return new LocalDateTime(localDate, iVar);
    }

    public static LocalDateTime W(long j6, int i10, ZoneOffset zoneOffset) {
        long T;
        long j10;
        Objects.requireNonNull(zoneOffset, "offset");
        long j11 = i10;
        j$.time.temporal.a.NANO_OF_SECOND.P(j11);
        return new LocalDateTime(LocalDate.ofEpochDay(j$.com.android.tools.r8.a.p(j6 + zoneOffset.T(), 86400)), i.W((((int) j$.com.android.tools.r8.a.o(T, j10)) * 1000000000) + j11));
    }

    private LocalDateTime a0(LocalDate localDate, long j6, long j10, long j11, long j12) {
        int i10 = ((j6 | j10 | j11 | j12) > 0L ? 1 : ((j6 | j10 | j11 | j12) == 0L ? 0 : -1));
        i iVar = this.f34883b;
        if (i10 == 0) {
            return e0(localDate, iVar);
        }
        long j13 = j6 / 24;
        long j14 = j13 + (j10 / 1440) + (j11 / 86400) + (j12 / 86400000000000L);
        long j15 = 1;
        long j16 = ((j6 % 24) * 3600000000000L) + ((j10 % 1440) * 60000000000L) + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long e02 = iVar.e0();
        long j17 = (j16 * j15) + e02;
        long p10 = j$.com.android.tools.r8.a.p(j17, 86400000000000L) + (j14 * j15);
        long o10 = j$.com.android.tools.r8.a.o(j17, 86400000000000L);
        if (o10 != e02) {
            iVar = i.W(o10);
        }
        return e0(localDate.a0(p10), iVar);
    }

    private LocalDateTime e0(LocalDate localDate, i iVar) {
        return (this.f34882a == localDate && this.f34883b == iVar) ? this : new LocalDateTime(localDate, iVar);
    }

    public static LocalDateTime ofInstant(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return W(instant.getEpochSecond(), instant.getNano(), zoneId.getRules().d(instant));
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f34978i;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.e(charSequence, new e(1));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 5, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(c().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).d(b().e0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int P() {
        return this.f34883b.S();
    }

    public final int Q() {
        return this.f34883b.T();
    }

    public final boolean R(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return L(localDateTime) > 0;
        }
        int i10 = (c().toEpochDay() > localDateTime.c().toEpochDay() ? 1 : (c().toEpochDay() == localDateTime.c().toEpochDay() ? 0 : -1));
        return i10 > 0 || (i10 == 0 && this.f34883b.e0() > localDateTime.f34883b.e0());
    }

    public final boolean S(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return L(localDateTime) < 0;
        }
        int i10 = (c().toEpochDay() > localDateTime.c().toEpochDay() ? 1 : (c().toEpochDay() == localDateTime.c().toEpochDay() ? 0 : -1));
        return i10 < 0 || (i10 == 0 && this.f34883b.e0() < localDateTime.f34883b.e0());
    }

    /* renamed from: X */
    public final LocalDateTime mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (g.f35081a[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return a0(this.f34882a, 0L, 0L, 0L, j6);
                case 2:
                    LocalDateTime Y7 = Y(j6 / 86400000000L);
                    return Y7.a0(Y7.f34882a, 0L, 0L, 0L, (j6 % 86400000000L) * 1000);
                case 3:
                    LocalDateTime Y10 = Y(j6 / 86400000);
                    return Y10.a0(Y10.f34882a, 0L, 0L, 0L, (j6 % 86400000) * 1000000);
                case 4:
                    return Z(j6);
                case 5:
                    return a0(this.f34882a, 0L, j6, 0L, 0L);
                case 6:
                    return a0(this.f34882a, j6, 0L, 0L, 0L);
                case 7:
                    LocalDateTime Y11 = Y(j6 / 256);
                    return Y11.a0(Y11.f34882a, (j6 % 256) * 12, 0L, 0L, 0L);
                default:
                    return e0(this.f34882a.mo88e(j6, uVar), this.f34883b);
            }
        }
        return (LocalDateTime) uVar.p(this, j6);
    }

    public final LocalDateTime Y(long j6) {
        return e0(this.f34882a.a0(j6), this.f34883b);
    }

    public final LocalDateTime Z(long j6) {
        return a0(this.f34882a, 0L, 0L, j6, 0L);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) c()).a();
    }

    /* renamed from: atZone */
    public ZonedDateTime o(ZoneId zoneId) {
        return ZonedDateTime.P(this, zoneId, null);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final i b() {
        return this.f34883b;
    }

    public final /* synthetic */ long b0(ZoneOffset zoneOffset) {
        return AbstractC3699b.n(this, zoneOffset);
    }

    /* renamed from: c0 */
    public final LocalDateTime d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean r10 = ((j$.time.temporal.a) rVar).r();
            i iVar = this.f34883b;
            LocalDate localDate = this.f34882a;
            return r10 ? e0(localDate, iVar.d(j6, rVar)) : e0(localDate.d(j6, rVar), iVar);
        }
        return (LocalDateTime) rVar.A(this, j6);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? L((LocalDateTime) chronoLocalDateTime) : AbstractC3699b.c(this, chronoLocalDateTime);
    }

    /* renamed from: d0 */
    public final LocalDateTime r(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return e0(localDate, this.f34883b);
        }
        if (localDate instanceof i) {
            return e0(this.f34882a, (i) localDate);
        }
        if (localDate instanceof LocalDateTime) {
            return (LocalDateTime) localDate;
        }
        localDate.getClass();
        return (LocalDateTime) AbstractC3699b.a(localDate, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f34882a.equals(localDateTime.f34882a) && this.f34883b.equals(localDateTime.f34883b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.z(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.g() || aVar.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f0(DataOutput dataOutput) {
        this.f34882a.i0(dataOutput);
        this.f34883b.i0(dataOutput);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    public int getHour() {
        return this.f34883b.R();
    }

    public int getYear() {
        return this.f34882a.getYear();
    }

    public int hashCode() {
        return this.f34882a.hashCode() ^ this.f34883b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).r() ? this.f34883b.p(rVar) : this.f34882a.p(rVar) : j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) rVar).r()) {
                return this.f34882a.s(rVar);
            }
            i iVar = this.f34883b;
            iVar.getClass();
            return j$.time.temporal.q.d(iVar, rVar);
        }
        return rVar.L(this);
    }

    /* renamed from: toLocalDate */
    public LocalDate c() {
        return this.f34882a;
    }

    public String toString() {
        String localDate = this.f34882a.toString();
        String iVar = this.f34883b.toString();
        return localDate + TokenNames.T + iVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).r() ? this.f34883b.w(rVar) : this.f34882a.w(rVar) : rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.f() ? this.f34882a : AbstractC3699b.k(this, tVar);
    }
}
