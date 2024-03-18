package j$.time;

import j$.time.chrono.AbstractC3699b;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class o implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a  reason: collision with root package name */
    private final i f35099a;

    /* renamed from: b  reason: collision with root package name */
    private final ZoneOffset f35100b;

    static {
        i iVar = i.f35084e;
        ZoneOffset zoneOffset = ZoneOffset.f34890g;
        iVar.getClass();
        L(iVar, zoneOffset);
        i iVar2 = i.f35085f;
        ZoneOffset zoneOffset2 = ZoneOffset.f34889f;
        iVar2.getClass();
        L(iVar2, zoneOffset2);
    }

    private o(i iVar, ZoneOffset zoneOffset) {
        this.f35099a = (i) Objects.requireNonNull(iVar, "time");
        this.f35100b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static o L(i iVar, ZoneOffset zoneOffset) {
        return new o(iVar, zoneOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o P(ObjectInput objectInput) {
        return new o(i.d0(objectInput), ZoneOffset.X(objectInput));
    }

    private o Q(i iVar, ZoneOffset zoneOffset) {
        return (this.f35099a != iVar || !this.f35100b.equals(zoneOffset)) ? new o(iVar, zoneOffset) : this;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(this.f35099a.e0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f35100b.T(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    /* renamed from: O */
    public final o mo88e(long j6, j$.time.temporal.u uVar) {
        return uVar instanceof j$.time.temporal.b ? Q(this.f35099a.mo88e(j6, uVar), this.f35100b) : (o) uVar.p(this, j6);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compare;
        o oVar = (o) obj;
        ZoneOffset zoneOffset = oVar.f35100b;
        ZoneOffset zoneOffset2 = this.f35100b;
        boolean equals = zoneOffset2.equals(zoneOffset);
        i iVar = oVar.f35099a;
        i iVar2 = this.f35099a;
        return (!equals && (compare = Long.compare(iVar2.e0() - (((long) zoneOffset2.T()) * 1000000000), iVar.e0() - (((long) oVar.f35100b.T()) * 1000000000))) != 0) ? compare : iVar2.compareTo(iVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            i iVar = this.f35099a;
            return rVar == aVar ? Q(iVar, ZoneOffset.V(((j$.time.temporal.a) rVar).O(j6))) : Q(iVar.d(j6, rVar), this.f35100b);
        }
        return (o) rVar.A(this, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f35099a.equals(oVar.f35099a) && this.f35100b.equals(oVar.f35100b);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar.r() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.z(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    public final int hashCode() {
        return this.f35099a.hashCode() ^ this.f35100b.hashCode();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        if (localDate instanceof i) {
            return Q((i) localDate, this.f35100b);
        }
        if (localDate instanceof ZoneOffset) {
            return Q(this.f35099a, (ZoneOffset) localDate);
        }
        boolean z10 = localDate instanceof o;
        TemporalAccessor temporalAccessor = localDate;
        if (!z10) {
            localDate.getClass();
            temporalAccessor = AbstractC3699b.a(localDate, this);
        }
        return (o) temporalAccessor;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return rVar.p();
            }
            i iVar = this.f35099a;
            iVar.getClass();
            return j$.time.temporal.q.d(iVar, rVar);
        }
        return rVar.L(this);
    }

    public final String toString() {
        String iVar = this.f35099a.toString();
        String zoneOffset = this.f35100b.toString();
        return iVar + zoneOffset;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS ? this.f35100b.T() : this.f35099a.w(rVar) : rVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f35099a.i0(objectOutput);
        this.f35100b.Y(objectOutput);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.i() || tVar == j$.time.temporal.q.k()) {
            return this.f35100b;
        }
        boolean z10 = false;
        boolean z11 = tVar == j$.time.temporal.q.l();
        if (tVar == j$.time.temporal.q.e()) {
            z10 = true;
        }
        if ((z11 || z10) || tVar == j$.time.temporal.q.f()) {
            return null;
        }
        return tVar == j$.time.temporal.q.g() ? this.f35099a : tVar == j$.time.temporal.q.j() ? j$.time.temporal.b.NANOS : tVar.a(this);
    }
}
