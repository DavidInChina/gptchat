package j$.time.chrono;

import android.gov.nist.javax.sip.parser.TokenNames;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3703f implements ChronoLocalDateTime, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a  reason: collision with root package name */
    private final transient ChronoLocalDate f34915a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.i f34916b;

    private C3703f(ChronoLocalDate chronoLocalDate, j$.time.i iVar) {
        Objects.requireNonNull(chronoLocalDate, "date");
        Objects.requireNonNull(iVar, "time");
        this.f34915a = chronoLocalDate;
        this.f34916b = iVar;
    }

    static C3703f L(k kVar, j$.time.temporal.m mVar) {
        C3703f c3703f = (C3703f) mVar;
        AbstractC3698a abstractC3698a = (AbstractC3698a) kVar;
        if (abstractC3698a.equals(c3703f.f34915a.a())) {
            return c3703f;
        }
        String id2 = abstractC3698a.getId();
        String id3 = c3703f.f34915a.a().getId();
        throw new ClassCastException("Chronology mismatch, required: " + id2 + ", actual: " + id3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C3703f P(ChronoLocalDate chronoLocalDate, j$.time.i iVar) {
        return new C3703f(chronoLocalDate, iVar);
    }

    private C3703f S(ChronoLocalDate chronoLocalDate, long j6, long j10, long j11, long j12) {
        int i10 = ((j6 | j10 | j11 | j12) > 0L ? 1 : ((j6 | j10 | j11 | j12) == 0L ? 0 : -1));
        j$.time.i iVar = this.f34916b;
        if (i10 == 0) {
            return V(chronoLocalDate, iVar);
        }
        long j13 = j10 / 1440;
        long j14 = j6 / 24;
        long j15 = (j10 % 1440) * 60000000000L;
        long j16 = ((j6 % 24) * 3600000000000L) + j15 + ((j11 % 86400) * 1000000000) + (j12 % 86400000000000L);
        long e02 = iVar.e0();
        long j17 = j16 + e02;
        long p10 = j$.com.android.tools.r8.a.p(j17, 86400000000000L) + j14 + j13 + (j11 / 86400) + (j12 / 86400000000000L);
        long o10 = j$.com.android.tools.r8.a.o(j17, 86400000000000L);
        if (o10 != e02) {
            iVar = j$.time.i.W(o10);
        }
        return V(chronoLocalDate.mo88e(p10, (j$.time.temporal.u) j$.time.temporal.b.DAYS), iVar);
    }

    private C3703f V(j$.time.temporal.m mVar, j$.time.i iVar) {
        ChronoLocalDate chronoLocalDate = this.f34915a;
        return (chronoLocalDate == mVar && this.f34916b == iVar) ? this : new C3703f(AbstractC3701d.L(chronoLocalDate.a(), mVar), iVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 2, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(c().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).d(b().e0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    /* renamed from: O */
    public final ChronoLocalDateTime g(long j6, j$.time.temporal.u uVar) {
        return L(this.f34915a.a(), j$.time.temporal.q.b(this, j6, uVar));
    }

    /* renamed from: Q */
    public final C3703f mo88e(long j6, j$.time.temporal.u uVar) {
        boolean z10 = uVar instanceof j$.time.temporal.b;
        ChronoLocalDate chronoLocalDate = this.f34915a;
        if (z10) {
            int i10 = AbstractC3702e.f34914a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.i iVar = this.f34916b;
            switch (i10) {
                case 1:
                    return S(this.f34915a, 0L, 0L, 0L, j6);
                case 2:
                    C3703f V10 = V(chronoLocalDate.mo88e(j6 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), iVar);
                    return V10.S(V10.f34915a, 0L, 0L, 0L, (j6 % 86400000000L) * 1000);
                case 3:
                    C3703f V11 = V(chronoLocalDate.mo88e(j6 / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), iVar);
                    return V11.S(V11.f34915a, 0L, 0L, 0L, (j6 % 86400000) * 1000000);
                case 4:
                    return R(j6);
                case 5:
                    return S(this.f34915a, 0L, j6, 0L, 0L);
                case 6:
                    return S(this.f34915a, j6, 0L, 0L, 0L);
                case 7:
                    C3703f V12 = V(chronoLocalDate.mo88e(j6 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), iVar);
                    return V12.S(V12.f34915a, (j6 % 256) * 12, 0L, 0L, 0L);
                default:
                    return V(chronoLocalDate.mo88e(j6, uVar), iVar);
            }
        }
        return L(chronoLocalDate.a(), uVar.p(this, j6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C3703f R(long j6) {
        return S(this.f34915a, 0L, 0L, j6, 0L);
    }

    public final /* synthetic */ long T(ZoneOffset zoneOffset) {
        return AbstractC3699b.n(this, zoneOffset);
    }

    /* renamed from: U */
    public final C3703f d(long j6, j$.time.temporal.r rVar) {
        boolean z10 = rVar instanceof j$.time.temporal.a;
        ChronoLocalDate chronoLocalDate = this.f34915a;
        if (z10) {
            boolean r10 = ((j$.time.temporal.a) rVar).r();
            j$.time.i iVar = this.f34916b;
            return r10 ? V(chronoLocalDate, iVar.d(j6, rVar)) : V(chronoLocalDate.d(j6, rVar), iVar);
        }
        return L(chronoLocalDate.a(), rVar.A(this, j6));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k a() {
        return this.f34915a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.i b() {
        return this.f34916b;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate c() {
        return this.f34915a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return AbstractC3699b.c(this, chronoLocalDateTime);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && AbstractC3699b.c(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.z(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.g() || aVar.r();
    }

    public final int hashCode() {
        return this.f34915a.hashCode() ^ this.f34916b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime o(ZoneId zoneId) {
        return j.P(zoneId, null, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).r() ? this.f34916b.p(rVar) : this.f34915a.p(rVar) : s(rVar).a(w(rVar), rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        k a5;
        TemporalAccessor temporalAccessor;
        if (localDate instanceof ChronoLocalDate) {
            return V(localDate, this.f34916b);
        }
        boolean z10 = localDate instanceof j$.time.i;
        ChronoLocalDate chronoLocalDate = this.f34915a;
        if (z10) {
            return V(chronoLocalDate, (j$.time.i) localDate);
        }
        if (localDate instanceof C3703f) {
            a5 = chronoLocalDate.a();
            temporalAccessor = localDate;
        } else {
            a5 = chronoLocalDate.a();
            localDate.getClass();
            temporalAccessor = AbstractC3699b.a(localDate, this);
        }
        return L(a5, (C3703f) temporalAccessor);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) rVar).r()) {
                return this.f34915a.s(rVar);
            }
            j$.time.i iVar = this.f34916b;
            iVar.getClass();
            return j$.time.temporal.q.d(iVar, rVar);
        }
        return rVar.L(this);
    }

    public final String toString() {
        String chronoLocalDate = this.f34915a.toString();
        String iVar = this.f34916b.toString();
        return chronoLocalDate + TokenNames.T + iVar;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).r() ? this.f34916b.w(rVar) : this.f34915a.w(rVar) : rVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f34915a);
        objectOutput.writeObject(this.f34916b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC3699b.k(this, tVar);
    }
}
