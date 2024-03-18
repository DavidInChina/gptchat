package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
final class j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* renamed from: a  reason: collision with root package name */
    private final transient C3703f f34924a;

    /* renamed from: b  reason: collision with root package name */
    private final transient ZoneOffset f34925b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneId f34926c;

    private j(ZoneId zoneId, ZoneOffset zoneOffset, C3703f c3703f) {
        this.f34924a = (C3703f) Objects.requireNonNull(c3703f, "dateTime");
        this.f34925b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.f34926c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    static j L(k kVar, j$.time.temporal.m mVar) {
        j jVar = (j) mVar;
        AbstractC3698a abstractC3698a = (AbstractC3698a) kVar;
        if (abstractC3698a.equals(jVar.a())) {
            return jVar;
        }
        String id2 = abstractC3698a.getId();
        String id3 = jVar.a().getId();
        throw new ClassCastException("Chronology mismatch, required: " + id2 + ", actual: " + id3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r2.contains(r7) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ChronoZonedDateTime P(ZoneId zoneId, ZoneOffset zoneOffset, C3703f c3703f) {
        Objects.requireNonNull(c3703f, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, c3703f);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime O10 = LocalDateTime.O(c3703f);
        List g10 = rules.g(O10);
        if (g10.size() != 1) {
            if (g10.size() == 0) {
                j$.time.zone.b f6 = rules.f(O10);
                c3703f = c3703f.R(f6.r().r());
                zoneOffset = f6.s();
            } else if (zoneOffset != null) {
            }
            Objects.requireNonNull(zoneOffset, "offset");
            return new j(zoneId, zoneOffset, c3703f);
        }
        zoneOffset = (ZoneOffset) g10.get(0);
        Objects.requireNonNull(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, c3703f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j Q(k kVar, Instant instant, ZoneId zoneId) {
        ZoneOffset d10 = zoneId.getRules().d(instant);
        Objects.requireNonNull(d10, "offset");
        return new j(zoneId, d10, (C3703f) kVar.t(LocalDateTime.W(instant.getEpochSecond(), instant.getNano(), d10)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 3, this);
    }

    /* renamed from: A */
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return AbstractC3699b.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime C() {
        return this.f34924a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long N() {
        return AbstractC3699b.o(this);
    }

    /* renamed from: O */
    public final ChronoZonedDateTime g(long j6, j$.time.temporal.u uVar) {
        return L(a(), j$.time.temporal.q.b(this, j6, uVar));
    }

    /* renamed from: R */
    public final ChronoZonedDateTime mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return L(a(), this.f34924a.mo88e(j6, uVar).A(this));
        }
        return L(a(), uVar.p(this, j6));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.i b() {
        return ((C3703f) C()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDate c() {
        return ((C3703f) C()).c();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = AbstractC3706i.f34923a[aVar.ordinal()];
            if (i10 == 1) {
                return mo88e(j6 - AbstractC3699b.o(this), j$.time.temporal.b.SECONDS);
            }
            ZoneId zoneId = this.f34926c;
            C3703f c3703f = this.f34924a;
            if (i10 != 2) {
                return P(zoneId, this.f34925b, c3703f.d(j6, rVar));
            }
            ZoneOffset V10 = ZoneOffset.V(aVar.O(j6));
            c3703f.getClass();
            return Q(a(), Instant.ofEpochSecond(c3703f.T(V10), c3703f.b().S()), zoneId);
        }
        return L(a(), rVar.A(this, j6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && AbstractC3699b.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.z(this));
    }

    public final int hashCode() {
        return (this.f34924a.hashCode() ^ this.f34925b.hashCode()) ^ Integer.rotateLeft(this.f34926c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset k() {
        return this.f34925b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime l(ZoneId zoneId) {
        return P(zoneId, this.f34925b, this.f34924a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return AbstractC3699b.e(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        return L(a(), localDate.A(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) ? rVar.p() : ((C3703f) C()).s(rVar) : rVar.L(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(N(), b().S());
    }

    public final String toString() {
        String c3703f = this.f34924a.toString();
        ZoneOffset zoneOffset = this.f34925b;
        String str = c3703f + zoneOffset.toString();
        ZoneId zoneId = this.f34926c;
        if (zoneOffset != zoneId) {
            return str + "[" + zoneId.toString() + "]";
        }
        return str;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId u() {
        return this.f34926c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = AbstractC3705h.f34922a[((j$.time.temporal.a) rVar).ordinal()];
            return i10 != 1 ? i10 != 2 ? ((C3703f) C()).w(rVar) : k().T() : N();
        }
        return rVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f34924a);
        objectOutput.writeObject(this.f34925b);
        objectOutput.writeObject(this.f34926c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC3699b.l(this, tVar);
    }
}
