package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class H extends AbstractC3701d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* renamed from: a  reason: collision with root package name */
    private final transient LocalDate f34908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f34908a = localDate;
    }

    private int R() {
        return this.f34908a.getYear() + 543;
    }

    private H T(LocalDate localDate) {
        return localDate.equals(this.f34908a) ? this : new H(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 8, this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final l B() {
        return R() >= 1 ? I.BE : I.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(long j6, j$.time.temporal.u uVar) {
        return (H) super.g(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate O(long j6) {
        return T(this.f34908a.a0(j6));
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate P(long j6) {
        return T(this.f34908a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate Q(long j6) {
        return T(this.f34908a.c0(j6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != 7) goto L19;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (w(aVar) == j6) {
                return this;
            }
            int[] iArr = G.f34907a;
            int i10 = iArr[aVar.ordinal()];
            LocalDate localDate = this.f34908a;
            if (i10 != 4) {
                if (i10 == 5) {
                    F.f34906d.F(aVar).b(j6, aVar);
                    return T(localDate.plusMonths(j6 - (((R() * 12) + localDate.getMonthValue()) - 1)));
                } else if (i10 != 6) {
                }
            }
            int a5 = F.f34906d.F(aVar).a(j6, aVar);
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 4) {
                if (R() < 1) {
                    a5 = 1 - a5;
                }
                return T(localDate.h0(a5 - 543));
            } else if (i11 == 6) {
                return T(localDate.h0(a5 - 543));
            } else {
                if (i11 == 7) {
                    return T(localDate.h0((-542) - R()));
                }
                return T(localDate.d(j6, rVar));
            }
        }
        return (H) super.d(j6, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return F.f34906d;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e */
    public final ChronoLocalDate mo88e(long j6, j$.time.temporal.u uVar) {
        return (H) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e  reason: collision with other method in class */
    public final j$.time.temporal.m mo88e(long j6, j$.time.temporal.u uVar) {
        return (H) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        return this.f34908a.equals(((H) obj).f34908a);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return (H) super.g(j6, bVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        F.f34906d.getClass();
        return this.f34908a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.p pVar) {
        return (H) super.j(pVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (H) super.r(nVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        return (H) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!AbstractC3699b.h(this, rVar)) {
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
            }
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = G.f34907a[aVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return this.f34908a.s(rVar);
            }
            if (i10 != 4) {
                return F.f34906d.F(aVar);
            }
            j$.time.temporal.w p10 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.w.j(1L, R() <= 0 ? (-(p10.e() + 543)) + 1 : 543 + p10.d());
        }
        return rVar.L(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34908a.toEpochDay();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = G.f34907a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = 1;
            if (i10 == 4) {
                int R10 = R();
                if (R10 < 1) {
                    R10 = 1 - R10;
                }
                return R10;
            }
            LocalDate localDate = this.f34908a;
            if (i10 == 5) {
                return ((R() * 12) + localDate.getMonthValue()) - 1;
            }
            if (i10 == 6) {
                return R();
            }
            if (i10 != 7) {
                return localDate.w(rVar);
            }
            if (R() < 1) {
                i11 = 0;
            }
            return i11;
        }
        return rVar.w(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(j$.time.i iVar) {
        return C3703f.P(this, iVar);
    }
}
