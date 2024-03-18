package j$.time;

import j$.time.chrono.AbstractC3699b;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.n, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f34884a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f34885b;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f34890g;
        localDateTime.getClass();
        O(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f34889f;
        localDateTime2.getClass();
        O(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.f34884a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.f34885b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static OffsetDateTime L(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof OffsetDateTime) {
            return (OffsetDateTime) temporalAccessor;
        }
        try {
            ZoneOffset S = ZoneOffset.S(temporalAccessor);
            LocalDate localDate = (LocalDate) temporalAccessor.z(j$.time.temporal.q.f());
            i iVar = (i) temporalAccessor.z(j$.time.temporal.q.g());
            return (localDate == null || iVar == null) ? P(Instant.O(temporalAccessor), S) : new OffsetDateTime(LocalDateTime.V(localDate, iVar), S);
        } catch (DateTimeException e10) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + name, e10);
        }
    }

    public static OffsetDateTime O(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime P(Instant instant, ZoneOffset zoneOffset) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneOffset, "zone");
        zoneOffset.getClass();
        ZoneOffset d10 = ZoneRules.i(zoneOffset).d(instant);
        return new OffsetDateTime(LocalDateTime.W(instant.getEpochSecond(), instant.getNano(), d10), d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OffsetDateTime R(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDate localDate = LocalDate.MIN;
        return new OffsetDateTime(LocalDateTime.V(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.d0(objectInput)), ZoneOffset.X(objectInput));
    }

    private OffsetDateTime T(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f34884a != localDateTime || !this.f34885b.equals(zoneOffset)) ? new OffsetDateTime(localDateTime, zoneOffset) : this;
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f34979j;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (OffsetDateTime) dateTimeFormatter.e(charSequence, new e(2));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f34884a;
        return mVar.d(localDateTime.c().toEpochDay(), aVar).d(localDateTime.b().e0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f34885b.T(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    /* renamed from: Q */
    public final OffsetDateTime mo88e(long j6, j$.time.temporal.u uVar) {
        return uVar instanceof j$.time.temporal.b ? T(this.f34884a.mo88e(j6, uVar), this.f34885b) : (OffsetDateTime) uVar.p(this, j6);
    }

    public final LocalDateTime S() {
        return this.f34884a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int i10;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.f34885b;
        ZoneOffset zoneOffset2 = this.f34885b;
        boolean equals = zoneOffset2.equals(zoneOffset);
        LocalDateTime localDateTime = offsetDateTime2.f34884a;
        LocalDateTime localDateTime2 = this.f34884a;
        if (equals) {
            i10 = localDateTime2.compareTo((ChronoLocalDateTime<?>) localDateTime);
        } else {
            localDateTime2.getClass();
            long n10 = AbstractC3699b.n(localDateTime2, zoneOffset2);
            localDateTime.getClass();
            i10 = Long.compare(n10, AbstractC3699b.n(localDateTime, offsetDateTime2.f34885b));
            if (i10 == 0) {
                i10 = localDateTime2.b().S() - localDateTime.b().S();
            }
        }
        return i10 == 0 ? localDateTime2.compareTo((ChronoLocalDateTime<?>) localDateTime) : i10;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = n.f35098a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.f34885b;
            LocalDateTime localDateTime = this.f34884a;
            return i10 != 1 ? i10 != 2 ? T(localDateTime.d(j6, rVar), zoneOffset) : T(localDateTime, ZoneOffset.V(aVar.O(j6))) : P(Instant.ofEpochSecond(j6, localDateTime.P()), zoneOffset);
        }
        return (OffsetDateTime) rVar.A(this, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.f34884a.equals(offsetDateTime.f34884a) && this.f34885b.equals(offsetDateTime.f34885b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.z(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    public final int hashCode() {
        return this.f34884a.hashCode() ^ this.f34885b.hashCode();
    }

    public final ZoneOffset k() {
        return this.f34885b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = n.f35098a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i10 != 2 ? this.f34884a.p(rVar) : this.f34885b.T();
        }
        return j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        boolean z10 = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.f34884a;
        ZoneOffset zoneOffset = this.f34885b;
        if (z10 || (localDate instanceof i) || (localDate instanceof LocalDateTime)) {
            return T(localDateTime.r(localDate), zoneOffset);
        }
        if (localDate instanceof Instant) {
            return P((Instant) localDate, zoneOffset);
        }
        if (localDate instanceof ZoneOffset) {
            return T(localDateTime, (ZoneOffset) localDate);
        }
        boolean z11 = localDate instanceof OffsetDateTime;
        TemporalAccessor temporalAccessor = localDate;
        if (!z11) {
            localDate.getClass();
            temporalAccessor = AbstractC3699b.a(localDate, this);
        }
        return (OffsetDateTime) temporalAccessor;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? rVar.p() : this.f34884a.s(rVar) : rVar.L(this);
    }

    public Instant toInstant() {
        LocalDateTime localDateTime = this.f34884a;
        localDateTime.getClass();
        return Instant.ofEpochSecond(localDateTime.b0(this.f34885b), localDateTime.b().S());
    }

    public final String toString() {
        String localDateTime = this.f34884a.toString();
        String zoneOffset = this.f34885b.toString();
        return localDateTime + zoneOffset;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = n.f35098a[((j$.time.temporal.a) rVar).ordinal()];
            ZoneOffset zoneOffset = this.f34885b;
            LocalDateTime localDateTime = this.f34884a;
            if (i10 != 1) {
                return i10 != 2 ? localDateTime.w(rVar) : zoneOffset.T();
            }
            localDateTime.getClass();
            return AbstractC3699b.n(localDateTime, zoneOffset);
        }
        return rVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f34884a.f0(objectOutput);
        this.f34885b.Y(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.i() || tVar == j$.time.temporal.q.k()) {
            return this.f34885b;
        }
        if (tVar == j$.time.temporal.q.l()) {
            return null;
        }
        j$.time.temporal.t f6 = j$.time.temporal.q.f();
        LocalDateTime localDateTime = this.f34884a;
        return tVar == f6 ? localDateTime.c() : tVar == j$.time.temporal.q.g() ? localDateTime.b() : tVar == j$.time.temporal.q.e() ? j$.time.chrono.r.f34946d : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }
}
