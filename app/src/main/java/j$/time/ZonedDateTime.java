package j$.time;

import j$.time.chrono.AbstractC3699b;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f34893a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f34894b;

    /* renamed from: c  reason: collision with root package name */
    private final ZoneId f34895c;

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f34893a = localDateTime;
        this.f34894b = zoneOffset;
        this.f34895c = zoneId;
    }

    private static ZonedDateTime L(long j6, int i10, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.getRules().d(Instant.ofEpochSecond(j6, i10));
        return new ZonedDateTime(LocalDateTime.W(j6, i10, d10), zoneId, d10);
    }

    public static ZonedDateTime O(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return L(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime P(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Object requireNonNull;
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List g10 = rules.g(localDateTime);
        if (g10.size() != 1) {
            if (g10.size() == 0) {
                j$.time.zone.b f6 = rules.f(localDateTime);
                localDateTime = localDateTime.Z(f6.r().r());
                zoneOffset = f6.s();
            } else if (zoneOffset == null || !g10.contains(zoneOffset)) {
                requireNonNull = Objects.requireNonNull((ZoneOffset) g10.get(0), "offset");
            }
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        requireNonNull = g10.get(0);
        zoneOffset = (ZoneOffset) requireNonNull;
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZonedDateTime R(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        LocalDate localDate = LocalDate.MIN;
        LocalDateTime V10 = LocalDateTime.V(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.d0(objectInput));
        ZoneOffset X10 = ZoneOffset.X(objectInput);
        ZoneId zoneId = (ZoneId) q.a(objectInput);
        Objects.requireNonNull(V10, "localDateTime");
        Objects.requireNonNull(X10, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (!(zoneId instanceof ZoneOffset) || X10.equals(zoneId)) {
            return new ZonedDateTime(V10, zoneId, X10);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    /* renamed from: A */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC3699b.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime C() {
        return this.f34893a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long N() {
        return AbstractC3699b.o(this);
    }

    /* renamed from: Q */
    public final ZonedDateTime mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            boolean g10 = uVar.g();
            ZoneOffset zoneOffset = this.f34894b;
            ZoneId zoneId = this.f34895c;
            LocalDateTime localDateTime = this.f34893a;
            if (g10) {
                return P(localDateTime.mo88e(j6, uVar), zoneId, zoneOffset);
            }
            LocalDateTime mo88e = localDateTime.mo88e(j6, uVar);
            Objects.requireNonNull(mo88e, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.getRules().g(mo88e).contains(zoneOffset)) {
                return new ZonedDateTime(mo88e, zoneId, zoneOffset);
            }
            mo88e.getClass();
            return L(AbstractC3699b.n(mo88e, zoneOffset), mo88e.P(), zoneId);
        }
        return (ZonedDateTime) uVar.p(this, j6);
    }

    public final LocalDateTime S() {
        return this.f34893a;
    }

    /* renamed from: T */
    public final ZonedDateTime r(LocalDate localDate) {
        boolean z10 = localDate instanceof LocalDate;
        ZoneOffset zoneOffset = this.f34894b;
        ZoneId zoneId = this.f34895c;
        LocalDateTime localDateTime = this.f34893a;
        if (z10) {
            return P(LocalDateTime.V(localDate, localDateTime.b()), zoneId, zoneOffset);
        }
        if (localDate instanceof i) {
            return P(LocalDateTime.V(localDateTime.c(), (i) localDate), zoneId, zoneOffset);
        }
        if (localDate instanceof LocalDateTime) {
            return P((LocalDateTime) localDate, zoneId, zoneOffset);
        }
        if (localDate instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) localDate;
            return P(offsetDateTime.S(), zoneId, offsetDateTime.k());
        } else if (localDate instanceof Instant) {
            Instant instant = (Instant) localDate;
            return L(instant.getEpochSecond(), instant.getNano(), zoneId);
        } else if (localDate instanceof ZoneOffset) {
            ZoneOffset zoneOffset2 = (ZoneOffset) localDate;
            return (zoneOffset2.equals(zoneOffset) || !zoneId.getRules().g(localDateTime).contains(zoneOffset2)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffset2);
        } else {
            localDate.getClass();
            return (ZonedDateTime) AbstractC3699b.a(localDate, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(DataOutput dataOutput) {
        this.f34893a.f0(dataOutput);
        this.f34894b.Y(dataOutput);
        this.f34895c.Q(dataOutput);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final i b() {
        return this.f34893a.b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate c() {
        return this.f34893a.c();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = w.f35168a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f34893a;
            ZoneId zoneId = this.f34895c;
            if (i10 == 1) {
                return L(j6, localDateTime.P(), zoneId);
            }
            ZoneOffset zoneOffset = this.f34894b;
            if (i10 != 2) {
                return P(localDateTime.d(j6, rVar), zoneId, zoneOffset);
            }
            ZoneOffset V10 = ZoneOffset.V(aVar.O(j6));
            return (V10.equals(zoneOffset) || !zoneId.getRules().g(localDateTime).contains(V10)) ? this : new ZonedDateTime(localDateTime, zoneId, V10);
        }
        return (ZonedDateTime) rVar.A(this, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f34893a.equals(zonedDateTime.f34893a) && this.f34894b.equals(zonedDateTime.f34894b) && this.f34895c.equals(zonedDateTime.f34895c);
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
        return (this.f34893a.hashCode() ^ this.f34894b.hashCode()) ^ Integer.rotateLeft(this.f34895c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset k() {
        return this.f34894b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime l(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f34895c.equals(zoneId) ? this : P(this.f34893a, zoneId, this.f34894b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = w.f35168a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new DateTimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return i10 != 2 ? this.f34893a.p(rVar) : this.f34894b.T();
        }
        return AbstractC3699b.e(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? rVar.p() : this.f34893a.s(rVar) : rVar.L(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(N(), b().S());
    }

    public final String toString() {
        String localDateTime = this.f34893a.toString();
        ZoneOffset zoneOffset = this.f34894b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.f34895c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId u() {
        return this.f34895c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = w.f35168a[((j$.time.temporal.a) rVar).ordinal()];
            return i10 != 1 ? i10 != 2 ? this.f34893a.w(rVar) : this.f34894b.T() : AbstractC3699b.o(this);
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.f() ? this.f34893a.c() : AbstractC3699b.l(this, tVar);
    }
}
