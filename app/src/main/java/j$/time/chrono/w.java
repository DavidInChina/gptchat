package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class w extends AbstractC3701d {

    /* renamed from: d  reason: collision with root package name */
    static final LocalDate f34951d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a  reason: collision with root package name */
    private final transient LocalDate f34952a;

    /* renamed from: b  reason: collision with root package name */
    private transient x f34953b;

    /* renamed from: c  reason: collision with root package name */
    private transient int f34954c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(LocalDate localDate) {
        if (!localDate.T(f34951d)) {
            x h10 = x.h(localDate);
            this.f34953b = h10;
            this.f34954c = (localDate.getYear() - h10.n().getYear()) + 1;
            this.f34952a = localDate;
            return;
        }
        throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar, int i10, LocalDate localDate) {
        if (!localDate.T(f34951d)) {
            this.f34953b = xVar;
            this.f34954c = i10;
            this.f34952a = localDate;
            return;
        }
        throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
    }

    private w U(LocalDate localDate) {
        return localDate.equals(this.f34952a) ? this : new w(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 4, this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final l B() {
        return this.f34953b;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(long j6, j$.time.temporal.u uVar) {
        return (w) super.g(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final int J() {
        x xVar = this.f34953b;
        x q10 = xVar.q();
        LocalDate localDate = this.f34952a;
        int J10 = (q10 == null || q10.n().getYear() != localDate.getYear()) ? localDate.J() : q10.n().S() - 1;
        return this.f34954c == 1 ? J10 - (xVar.n().S() - 1) : J10;
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate O(long j6) {
        return U(this.f34952a.a0(j6));
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate P(long j6) {
        return U(this.f34952a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate Q(long j6) {
        return U(this.f34952a.c0(j6));
    }

    public final x R() {
        return this.f34953b;
    }

    public final w S(long j6, j$.time.temporal.b bVar) {
        return (w) super.mo88e(j6, (j$.time.temporal.u) bVar);
    }

    /* renamed from: T */
    public final w d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (w(aVar) == j6) {
                return this;
            }
            int[] iArr = v.f34950a;
            int i10 = iArr[aVar.ordinal()];
            LocalDate localDate = this.f34952a;
            if (i10 == 3 || i10 == 8 || i10 == 9) {
                u uVar = u.f34949d;
                int a5 = uVar.F(aVar).a(j6, aVar);
                int i11 = iArr[aVar.ordinal()];
                if (i11 == 3) {
                    return U(localDate.h0(uVar.i(this.f34953b, a5)));
                }
                if (i11 == 8) {
                    return U(localDate.h0(uVar.i(x.t(a5), this.f34954c)));
                }
                if (i11 == 9) {
                    return U(localDate.h0(a5));
                }
            }
            return U(localDate.d(j6, rVar));
        }
        return (w) super.d(j6, rVar);
    }

    public final w V(j$.time.temporal.p pVar) {
        return (w) super.r(pVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return u.f34949d;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e */
    public final ChronoLocalDate mo88e(long j6, j$.time.temporal.u uVar) {
        return (w) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e  reason: collision with other method in class */
    public final j$.time.temporal.m mo88e(long j6, j$.time.temporal.u uVar) {
        return (w) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.f34952a.equals(((w) obj).f34952a);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return rVar instanceof j$.time.temporal.a ? rVar.g() : rVar != null && rVar.z(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return (w) super.g(j6, bVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        u.f34949d.getClass();
        return this.f34952a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.p pVar) {
        return (w) super.j(pVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (w) super.r(nVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        return (w) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        int U10;
        if (rVar instanceof j$.time.temporal.a) {
            if (!f(rVar)) {
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
            }
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = v.f34950a[aVar.ordinal()];
            if (i10 == 1) {
                U10 = this.f34952a.U();
            } else if (i10 == 2) {
                U10 = J();
            } else if (i10 != 3) {
                return u.f34949d.F(aVar);
            } else {
                x xVar = this.f34953b;
                int year = xVar.n().getYear();
                x q10 = xVar.q();
                U10 = q10 != null ? (q10.n().getYear() - year) + 1 : 999999999 - year;
            }
            return j$.time.temporal.w.j(1L, U10);
        }
        return rVar.L(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34952a.toEpochDay();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = v.f34950a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = this.f34954c;
            x xVar = this.f34953b;
            LocalDate localDate = this.f34952a;
            switch (i10) {
                case 2:
                    return i11 == 1 ? (localDate.S() - xVar.n().S()) + 1 : localDate.S();
                case 3:
                    return i11;
                case 4:
                case 5:
                case 6:
                case 7:
                    throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
                case 8:
                    return xVar.getValue();
                default:
                    return localDate.w(rVar);
            }
        }
        return rVar.w(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(j$.time.i iVar) {
        return C3703f.P(this, iVar);
    }
}
