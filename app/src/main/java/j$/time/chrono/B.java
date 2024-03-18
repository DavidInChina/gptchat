package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes3.dex */
public final class B extends AbstractC3701d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a  reason: collision with root package name */
    private final transient LocalDate f34901a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.f34901a = localDate;
    }

    private int R() {
        return this.f34901a.getYear() - 1911;
    }

    private B T(LocalDate localDate) {
        return localDate.equals(this.f34901a) ? this : new B(localDate);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final l B() {
        return R() >= 1 ? C.ROC : C.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(long j6, j$.time.temporal.u uVar) {
        return (B) super.g(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate O(long j6) {
        return T(this.f34901a.a0(j6));
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate P(long j6) {
        return T(this.f34901a.plusMonths(j6));
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate Q(long j6) {
        return T(this.f34901a.c0(j6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != 7) goto L19;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (w(aVar) == j6) {
                return this;
            }
            int[] iArr = A.f34900a;
            int i10 = iArr[aVar.ordinal()];
            LocalDate localDate = this.f34901a;
            if (i10 != 4) {
                if (i10 == 5) {
                    z.f34961d.F(aVar).b(j6, aVar);
                    return T(localDate.plusMonths(j6 - (((R() * 12) + localDate.getMonthValue()) - 1)));
                } else if (i10 != 6) {
                }
            }
            int a5 = z.f34961d.F(aVar).a(j6, aVar);
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 4) {
                return T(localDate.h0(R() >= 1 ? a5 + 1911 : 1912 - a5));
            } else if (i11 == 6) {
                return T(localDate.h0(a5 + 1911));
            } else {
                if (i11 == 7) {
                    return T(localDate.h0(1912 - R()));
                }
                return T(localDate.d(j6, rVar));
            }
        }
        return (B) super.d(j6, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return z.f34961d;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e */
    public final ChronoLocalDate mo88e(long j6, j$.time.temporal.u uVar) {
        return (B) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e  reason: collision with other method in class */
    public final j$.time.temporal.m mo88e(long j6, j$.time.temporal.u uVar) {
        return (B) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        return this.f34901a.equals(((B) obj).f34901a);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return (B) super.g(j6, bVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        z.f34961d.getClass();
        return this.f34901a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.p pVar) {
        return (B) super.j(pVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (B) super.r(nVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        return (B) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!AbstractC3699b.h(this, rVar)) {
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
            }
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = A.f34900a[aVar.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                return this.f34901a.s(rVar);
            }
            if (i10 != 4) {
                return z.f34961d.F(aVar);
            }
            j$.time.temporal.w p10 = j$.time.temporal.a.YEAR.p();
            return j$.time.temporal.w.j(1L, R() <= 0 ? (-p10.e()) + 1912 : p10.d() - 1911);
        }
        return rVar.L(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34901a.toEpochDay();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = A.f34900a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = 1;
            if (i10 == 4) {
                int R10 = R();
                if (R10 < 1) {
                    R10 = 1 - R10;
                }
                return R10;
            }
            LocalDate localDate = this.f34901a;
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
