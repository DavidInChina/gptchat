package j$.time;

import android.gov.nist.core.Separators;
import com.statsig.androidsdk.ErrorBoundaryKt;
import j$.time.chrono.AbstractC3699b;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.n, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a  reason: collision with root package name */
    private final int f34879a;

    /* renamed from: b  reason: collision with root package name */
    private final short f34880b;

    /* renamed from: c  reason: collision with root package name */
    private final short f34881c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    private LocalDate(int i10, int i11, int i12) {
        this.f34879a = i10;
        this.f34880b = (short) i11;
        this.f34881c = (short) i12;
    }

    private static LocalDate O(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else if (j$.time.chrono.r.f34946d.K(i10)) {
                i13 = 29;
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + k.Q(i11).name() + Separators.SP + i12 + Separators.QUOTE);
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate P(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.z(j$.time.temporal.q.f());
        if (localDate != null) {
            return localDate;
        }
        String name = temporalAccessor.getClass().getName();
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + name);
    }

    private int Q(j$.time.temporal.r rVar) {
        int i10;
        int i11 = f.f34965a[((j$.time.temporal.a) rVar).ordinal()];
        short s10 = this.f34881c;
        int i12 = this.f34879a;
        switch (i11) {
            case 1:
                return s10;
            case 2:
                return S();
            case 3:
                i10 = (s10 - 1) / 7;
                break;
            case 4:
                return i12 >= 1 ? i12 : 1 - i12;
            case 5:
                return R().getValue();
            case 6:
                i10 = (s10 - 1) % 7;
                break;
            case 7:
                return ((S() - 1) % 7) + 1;
            case 8:
                throw new DateTimeException("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((S() - 1) / 7) + 1;
            case 10:
                return this.f34880b;
            case 11:
                throw new DateTimeException("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i12;
            case 13:
                return i12 >= 1 ? 1 : 0;
            default:
                throw new DateTimeException(b.a("Unsupported field: ", rVar));
        }
        return i10 + 1;
    }

    public static LocalDate W(Clock clock) {
        Objects.requireNonNull(clock, "clock");
        Instant instant = clock.instant();
        ZoneId a5 = clock.a();
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(a5, "zone");
        return ofEpochDay(j$.com.android.tools.r8.a.p(instant.getEpochSecond() + a5.getRules().d(instant).T(), 86400));
    }

    public static LocalDate X(int i10, k kVar, int i11) {
        j$.time.temporal.a.YEAR.P(i10);
        Objects.requireNonNull(kVar, "month");
        j$.time.temporal.a.DAY_OF_MONTH.P(i11);
        return O(i10, kVar.getValue(), i11);
    }

    public static LocalDate Y(int i10, int i11) {
        long j6 = i10;
        j$.time.temporal.a.YEAR.P(j6);
        j$.time.temporal.a.DAY_OF_YEAR.P(i11);
        boolean K10 = j$.time.chrono.r.f34946d.K(j6);
        if (i11 == 366 && !K10) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        k Q = k.Q(((i11 - 1) / 31) + 1);
        if (i11 > (Q.O(K10) + Q.L(K10)) - 1) {
            Q = Q.R();
        }
        return new LocalDate(i10, Q.getValue(), (i11 - Q.L(K10)) + 1);
    }

    private static LocalDate d0(int i10, int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
                i13 = 30;
            }
            return new LocalDate(i10, i11, i12);
        }
        i13 = j$.time.chrono.r.f34946d.K((long) i10) ? 29 : 28;
        i12 = Math.min(i12, i13);
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate of(int i10, int i11, int i12) {
        j$.time.temporal.a.YEAR.P(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.P(i11);
        j$.time.temporal.a.DAY_OF_MONTH.P(i12);
        return O(i10, i11, i12);
    }

    public static LocalDate ofEpochDay(long j6) {
        long j10;
        j$.time.temporal.a.EPOCH_DAY.P(j6);
        long j11 = 719468 + j6;
        if (j11 < 0) {
            long j12 = ((j6 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i10 = (int) j14;
        int i11 = ((i10 * 5) + 2) / 153;
        return new LocalDate(j$.time.temporal.a.YEAR.O(j13 + j10 + (i11 / 10)), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static LocalDate parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f34977h;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.e(charSequence, new e(0));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return AbstractC3699b.a(this, mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.l B() {
        return getYear() >= 1 ? j$.time.chrono.s.CE : j$.time.chrono.s.BCE;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean E() {
        return j$.time.chrono.r.f34946d.K(this.f34879a);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int J() {
        return E() ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int L(LocalDate localDate) {
        int i10 = this.f34879a - localDate.f34879a;
        if (i10 == 0) {
            int i11 = this.f34880b - localDate.f34880b;
            return i11 == 0 ? this.f34881c - localDate.f34881c : i11;
        }
        return i10;
    }

    public final c R() {
        return c.L(((int) j$.com.android.tools.r8.a.o(toEpochDay() + 3, 7)) + 1);
    }

    public final int S() {
        return (k.Q(this.f34880b).L(E()) + this.f34881c) - 1;
    }

    public final boolean T(LocalDate localDate) {
        return localDate instanceof LocalDate ? L(localDate) < 0 : toEpochDay() < localDate.toEpochDay();
    }

    public final int U() {
        short s10 = this.f34880b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : E() ? 29 : 28;
    }

    /* renamed from: V */
    public final LocalDate g(long j6, j$.time.temporal.b bVar) {
        return j6 == Long.MIN_VALUE ? mo88e(Long.MAX_VALUE, bVar).mo88e(1L, bVar) : mo88e(-j6, bVar);
    }

    /* renamed from: Z */
    public final LocalDate mo88e(long j6, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (f.f34966b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return a0(j6);
                case 2:
                    return b0(j6);
                case 3:
                    return plusMonths(j6);
                case 4:
                    return c0(j6);
                case 5:
                    return c0(j$.com.android.tools.r8.a.q(j6, 10));
                case 6:
                    return c0(j$.com.android.tools.r8.a.q(j6, 100));
                case 7:
                    return c0(j$.com.android.tools.r8.a.q(j6, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return d(j$.com.android.tools.r8.a.k(w(aVar), j6), aVar);
                default:
                    throw new DateTimeException("Unsupported unit: " + uVar);
            }
        }
        return (LocalDate) uVar.p(this, j6);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.k a() {
        return j$.time.chrono.r.f34946d;
    }

    public final LocalDate a0(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = this.f34881c + j6;
        if (j10 > 0) {
            int i10 = (j10 > 28L ? 1 : (j10 == 28L ? 0 : -1));
            short s10 = this.f34880b;
            int i11 = this.f34879a;
            if (i10 <= 0) {
                return new LocalDate(i11, s10, (int) j10);
            }
            if (j10 <= 59) {
                long U10 = U();
                if (j10 <= U10) {
                    return new LocalDate(i11, s10, (int) j10);
                }
                if (s10 < 12) {
                    return new LocalDate(i11, s10 + 1, (int) (j10 - U10));
                }
                int i12 = i11 + 1;
                j$.time.temporal.a.YEAR.P(i12);
                return new LocalDate(i12, 1, (int) (j10 - U10));
            }
        }
        return ofEpochDay(j$.com.android.tools.r8.a.k(toEpochDay(), j6));
    }

    public final LocalDate b0(long j6) {
        return a0(j$.com.android.tools.r8.a.q(j6, 7));
    }

    public final LocalDate c0(long j6) {
        return j6 == 0 ? this : d0(j$.time.temporal.a.YEAR.O(this.f34879a + j6), this.f34880b, this.f34881c);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        return chronoLocalDate instanceof LocalDate ? L((LocalDate) chronoLocalDate) : AbstractC3699b.b(this, chronoLocalDate);
    }

    /* renamed from: e0 */
    public final LocalDate d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            aVar.P(j6);
            int i10 = f.f34965a[aVar.ordinal()];
            short s10 = this.f34881c;
            short s11 = this.f34880b;
            int i11 = this.f34879a;
            switch (i10) {
                case 1:
                    int i12 = (int) j6;
                    return s10 == i12 ? this : of(i11, s11, i12);
                case 2:
                    return g0((int) j6);
                case 3:
                    return b0(j6 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
                case 4:
                    if (i11 < 1) {
                        j6 = 1 - j6;
                    }
                    return h0((int) j6);
                case 5:
                    return a0(j6 - R().getValue());
                case 6:
                    return a0(j6 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 7:
                    return a0(j6 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 8:
                    return ofEpochDay(j6);
                case 9:
                    return b0(j6 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
                case 10:
                    int i13 = (int) j6;
                    if (s11 == i13) {
                        return this;
                    }
                    j$.time.temporal.a.MONTH_OF_YEAR.P(i13);
                    return d0(i11, i13, s10);
                case 11:
                    return plusMonths(j6 - (((i11 * 12) + s11) - 1));
                case 12:
                    return h0((int) j6);
                case 13:
                    return w(j$.time.temporal.a.ERA) == j6 ? this : h0(1 - i11);
                default:
                    throw new DateTimeException(b.a("Unsupported field: ", rVar));
            }
        }
        return (LocalDate) rVar.A(this, j6);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && L((LocalDate) obj) == 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return AbstractC3699b.h(this, rVar);
    }

    /* renamed from: f0 */
    public final LocalDate r(j$.time.temporal.n nVar) {
        return nVar instanceof LocalDate ? (LocalDate) nVar : (LocalDate) nVar.A(this);
    }

    public final LocalDate g0(int i10) {
        return S() == i10 ? this : Y(this.f34879a, i10);
    }

    public int getDayOfMonth() {
        return this.f34881c;
    }

    public int getMonthValue() {
        return this.f34880b;
    }

    public int getYear() {
        return this.f34879a;
    }

    public final LocalDate h0(int i10) {
        if (this.f34879a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.P(i10);
        return d0(i10, this.f34880b, this.f34881c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i10 = this.f34879a;
        return (((i10 << 11) + (this.f34880b << 6)) + this.f34881c) ^ (i10 & (-2048));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f34879a);
        dataOutput.writeByte(this.f34880b);
        dataOutput.writeByte(this.f34881c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(p pVar) {
        if (pVar instanceof p) {
            return plusMonths(pVar.e()).a0(pVar.b());
        }
        Objects.requireNonNull(pVar, "amountToAdd");
        return (LocalDate) pVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int p(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? Q(rVar) : j$.time.temporal.q.a(this, rVar);
    }

    public LocalDate plusMonths(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (this.f34879a * 12) + (this.f34880b - 1) + j6;
        long j11 = 12;
        return d0(j$.time.temporal.a.YEAR.O(j$.com.android.tools.r8.a.p(j10, j11)), ((int) j$.com.android.tools.r8.a.o(j10, j11)) + 1, this.f34881c);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        int U10;
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (!aVar.g()) {
                throw new DateTimeException(b.a("Unsupported field: ", rVar));
            }
            int i10 = f.f34965a[aVar.ordinal()];
            if (i10 == 1) {
                U10 = U();
            } else if (i10 != 2) {
                if (i10 == 3) {
                    return j$.time.temporal.w.j(1L, (k.Q(this.f34880b) != k.FEBRUARY || E()) ? 5L : 4L);
                } else if (i10 != 4) {
                    return rVar.p();
                } else {
                    return j$.time.temporal.w.j(1L, getYear() <= 0 ? 1000000000L : 999999999L);
                }
            } else {
                U10 = J();
            }
            return j$.time.temporal.w.j(1L, U10);
        }
        return rVar.L(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j6 = this.f34879a;
        long j10 = this.f34880b;
        long j11 = 365 * j6;
        long j12 = (((367 * j10) - 362) / 12) + (j6 >= 0 ? ((j6 + 399) / 400) + (((3 + j6) / 4) - ((99 + j6) / 100)) + j11 : j11 - ((j6 / (-400)) + ((j6 / (-4)) - (j6 / (-100))))) + (this.f34881c - 1);
        if (j10 > 2) {
            j12 = !E() ? j12 - 2 : j12 - 1;
        }
        return j12 - 719528;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i10;
        int i11 = this.f34879a;
        int abs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs < 1000) {
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                i10 = 1;
            } else {
                sb2.append(i11 + ErrorBoundaryKt.SAMPLING_RATE);
                i10 = 0;
            }
            sb2.deleteCharAt(i10);
        } else {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        }
        String str = "-";
        short s10 = this.f34880b;
        sb2.append(s10 < 10 ? "-0" : str);
        sb2.append((int) s10);
        short s11 = this.f34881c;
        if (s11 < 10) {
            str = "-0";
        }
        sb2.append(str);
        sb2.append((int) s11);
        return sb2.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.EPOCH_DAY ? toEpochDay() : rVar == j$.time.temporal.a.PROLEPTIC_MONTH ? ((this.f34879a * 12) + this.f34880b) - 1 : Q(rVar) : rVar.w(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(i iVar) {
        return LocalDateTime.V(this, iVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.q.f() ? this : AbstractC3699b.j(this, tVar);
    }
}
