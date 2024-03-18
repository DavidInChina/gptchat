package j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.AbstractC3699b;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* renamed from: a  reason: collision with root package name */
    private final long f34877a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34878b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    private Instant(long j6, int i10) {
        this.f34877a = j6;
        this.f34878b = i10;
    }

    private static Instant L(long j6, int i10) {
        if ((i10 | j6) == 0) {
            return EPOCH;
        }
        if (j6 >= -31557014167219200L && j6 <= 31556889864403199L) {
            return new Instant(j6, i10);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    public static Instant O(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.w(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.p(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e10) {
            String name = temporalAccessor.getClass().getName();
            throw new RuntimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + name, e10);
        }
    }

    public static Instant P(long j6) {
        return L(j6, 0);
    }

    private Instant Q(long j6, long j10) {
        if ((j6 | j10) == 0) {
            return this;
        }
        return ofEpochSecond(j$.com.android.tools.r8.a.k(j$.com.android.tools.r8.a.k(this.f34877a, j6), j10 / 1000000000), this.f34878b + (j10 % 1000000000));
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j6) {
        long j10 = 1000;
        return L(j$.com.android.tools.r8.a.p(j6, j10), ((int) j$.com.android.tools.r8.a.o(j6, j10)) * UtilsKt.MICROS_MULTIPLIER);
    }

    public static Instant ofEpochSecond(long j6, long j10) {
        return L(j$.com.android.tools.r8.a.k(j6, j$.com.android.tools.r8.a.p(j10, 1000000000L)), (int) j$.com.android.tools.r8.a.o(j10, 1000000000L));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(this.f34877a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f34878b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    /* renamed from: R */
    public final Instant mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (d.f34963b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return plusNanos(j6);
                case 2:
                    return Q(j6 / 1000000, (j6 % 1000000) * 1000);
                case 3:
                    return Q(j6 / 1000, (j6 % 1000) * 1000000);
                case 4:
                    return plusSeconds(j6);
                case 5:
                    return plusSeconds(j$.com.android.tools.r8.a.q(j6, 60));
                case 6:
                    return plusSeconds(j$.com.android.tools.r8.a.q(j6, 3600));
                case 7:
                    return plusSeconds(j$.com.android.tools.r8.a.q(j6, 43200));
                case 8:
                    return plusSeconds(j$.com.android.tools.r8.a.q(j6, 86400));
                default:
                    throw new DateTimeException("Unsupported unit: " + uVar);
            }
        }
        return (Instant) uVar.p(this, j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(DataOutput dataOutput) {
        dataOutput.writeLong(this.f34877a);
        dataOutput.writeInt(this.f34878b);
    }

    public int compareTo(Instant instant) {
        int compare = Long.compare(this.f34877a, instant.f34877a);
        return compare != 0 ? compare : this.f34878b - instant.f34878b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r6 != r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r6 != r2) goto L20;
     */
    @Override // j$.time.temporal.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j$.time.temporal.m d(long j6, j$.time.temporal.r rVar) {
        int i10;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            aVar.P(j6);
            int i11 = d.f34962a[aVar.ordinal()];
            int i12 = this.f34878b;
            long j10 = this.f34877a;
            if (i11 == 1) {
                if (j6 != i12) {
                    i10 = (int) j6;
                    return L(j10, i10);
                }
                return this;
            } else if (i11 != 2) {
                if (i11 == 3) {
                    i10 = ((int) j6) * UtilsKt.MICROS_MULTIPLIER;
                } else if (i11 != 4) {
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
                } else {
                    if (j6 != j10) {
                        return L(j6, i12);
                    }
                }
                return this;
            } else {
                i10 = ((int) j6) * 1000;
            }
        } else {
            return (Instant) rVar.A(this, j6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f34877a == instant.f34877a && this.f34878b == instant.f34878b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND : rVar != null && rVar.z(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    public long getEpochSecond() {
        return this.f34877a;
    }

    public int getNano() {
        return this.f34878b;
    }

    public int hashCode() {
        long j6 = this.f34877a;
        return (this.f34878b * 51) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = d.f34962a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = this.f34878b;
            if (i10 == 1) {
                return i11;
            }
            if (i10 == 2) {
                return i11 / 1000;
            }
            if (i10 == 3) {
                return i11 / UtilsKt.MICROS_MULTIPLIER;
            }
            if (i10 == 4) {
                j$.time.temporal.a.INSTANT_SECONDS.O(this.f34877a);
            }
            throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
        return j$.time.temporal.q.d(this, rVar).a(rVar.w(this), rVar);
    }

    public Instant plusNanos(long j6) {
        return Q(0L, j6);
    }

    public Instant plusSeconds(long j6) {
        return Q(j6, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        localDate.getClass();
        return (Instant) AbstractC3699b.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.d(this, rVar);
    }

    public long toEpochMilli() {
        long q10;
        int i10;
        long j6 = this.f34877a;
        int i11 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        int i12 = this.f34878b;
        if (i11 >= 0 || i12 <= 0) {
            q10 = j$.com.android.tools.r8.a.q(j6, 1000);
            i10 = i12 / UtilsKt.MICROS_MULTIPLIER;
        } else {
            q10 = j$.com.android.tools.r8.a.q(j6 + 1, 1000);
            i10 = (i12 / UtilsKt.MICROS_MULTIPLIER) - 1000;
        }
        return j$.com.android.tools.r8.a.k(q10, i10);
    }

    public String toString() {
        return DateTimeFormatter.f34980k.format(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        int i10;
        if (rVar instanceof j$.time.temporal.a) {
            int i11 = d.f34962a[((j$.time.temporal.a) rVar).ordinal()];
            int i12 = this.f34878b;
            if (i11 == 1) {
                return i12;
            }
            if (i11 == 2) {
                i10 = i12 / 1000;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
                }
                return this.f34877a;
            } else {
                i10 = i12 / UtilsKt.MICROS_MULTIPLIER;
            }
            return i10;
        }
        return rVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.q.j()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar != j$.time.temporal.q.e() && tVar != j$.time.temporal.q.l() && tVar != j$.time.temporal.q.k() && tVar != j$.time.temporal.q.i() && tVar != j$.time.temporal.q.f() && tVar != j$.time.temporal.q.g()) {
            return tVar.a(this);
        }
        return null;
    }
}
