package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* loaded from: classes3.dex */
public final class p extends AbstractC3701d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a  reason: collision with root package name */
    private final transient n f34941a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f34942b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f34943c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f34944d;

    private p(n nVar, int i10, int i11, int i12) {
        nVar.T(i10, i11, i12);
        this.f34941a = nVar;
        this.f34942b = i10;
        this.f34943c = i11;
        this.f34944d = i12;
    }

    private p(n nVar, long j6) {
        int[] U10 = nVar.U((int) j6);
        this.f34941a = nVar;
        this.f34942b = U10[0];
        this.f34943c = U10[1];
        this.f34944d = U10[2];
    }

    private int R() {
        return this.f34941a.S(this.f34942b, this.f34943c) + this.f34944d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p S(n nVar, int i10, int i11, int i12) {
        return new p(nVar, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p T(n nVar, long j6) {
        return new p(nVar, j6);
    }

    private p W(int i10, int i11, int i12) {
        n nVar = this.f34941a;
        int V10 = nVar.V(i10, i11);
        if (i12 > V10) {
            i12 = V10;
        }
        return new p(nVar, i10, i11, i12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 6, this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final l B() {
        return q.AH;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final boolean E() {
        return this.f34941a.K(this.f34942b);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate H(long j6, j$.time.temporal.u uVar) {
        return (p) super.g(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final int J() {
        return this.f34941a.W(this.f34942b);
    }

    @Override // j$.time.chrono.AbstractC3701d
    final ChronoLocalDate Q(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = this.f34942b + ((int) j6);
        int i10 = (int) j10;
        if (j10 != i10) {
            throw new ArithmeticException();
        }
        return W(i10, this.f34943c, this.f34944d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final p O(long j6) {
        return new p(this.f34941a, toEpochDay() + j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public final p P(long j6) {
        if (j6 == 0) {
            return this;
        }
        long j10 = (this.f34942b * 12) + (this.f34943c - 1) + j6;
        return W(this.f34941a.P(j$.com.android.tools.r8.a.p(j10, 12L)), ((int) j$.com.android.tools.r8.a.o(j10, 12L)) + 1, this.f34944d);
    }

    /* renamed from: X */
    public final p d(long j6, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            n nVar = this.f34941a;
            nVar.F(aVar).b(j6, aVar);
            int i10 = (int) j6;
            int i11 = o.f34940a[aVar.ordinal()];
            int i12 = this.f34944d;
            int i13 = this.f34943c;
            int i14 = this.f34942b;
            switch (i11) {
                case 1:
                    return W(i14, i13, i10);
                case 2:
                    return O(Math.min(i10, J()) - R());
                case 3:
                    return O((j6 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case 4:
                    return O(j6 - (((int) j$.com.android.tools.r8.a.o(toEpochDay() + 3, 7)) + 1));
                case 5:
                    return O(j6 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case 6:
                    return O(j6 - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case 7:
                    return new p(nVar, j6);
                case 8:
                    return O((j6 - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return W(i14, i10, i12);
                case 10:
                    return P(j6 - (((i14 * 12) + i13) - 1));
                case 11:
                    if (i14 < 1) {
                        i10 = 1 - i10;
                    }
                    return W(i10, i13, i12);
                case 12:
                    return W(i10, i13, i12);
                case 13:
                    return W(1 - i14, i13, i12);
                default:
                    throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
            }
        }
        return (p) super.d(j6, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final k a() {
        return this.f34941a;
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e */
    public final ChronoLocalDate mo88e(long j6, j$.time.temporal.u uVar) {
        return (p) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e  reason: collision with other method in class */
    public final j$.time.temporal.m mo88e(long j6, j$.time.temporal.u uVar) {
        return (p) super.mo88e(j6, uVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f34942b == pVar.f34942b && this.f34943c == pVar.f34943c && this.f34944d == pVar.f34944d && this.f34941a.equals(pVar.f34941a);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m g(long j6, j$.time.temporal.b bVar) {
        return (p) super.g(j6, bVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int hashCode = this.f34941a.getId().hashCode();
        int i10 = this.f34942b;
        return (hashCode ^ (i10 & (-2048))) ^ (((i10 << 11) + (this.f34943c << 6)) + this.f34944d);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate j(j$.time.p pVar) {
        return (p) super.j(pVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate m(j$.time.temporal.n nVar) {
        return (p) super.r(nVar);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.m
    public final j$.time.temporal.m r(LocalDate localDate) {
        return (p) super.r(localDate);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w s(j$.time.temporal.r rVar) {
        int V10;
        long j6;
        if (rVar instanceof j$.time.temporal.a) {
            if (!AbstractC3699b.h(this, rVar)) {
                throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
            }
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = o.f34940a[aVar.ordinal()];
            n nVar = this.f34941a;
            if (i10 == 1) {
                V10 = nVar.V(this.f34942b, this.f34943c);
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return nVar.F(aVar);
                }
                j6 = 5;
                return j$.time.temporal.w.j(1L, j6);
            } else {
                V10 = J();
            }
            j6 = V10;
            return j$.time.temporal.w.j(1L, j6);
        }
        return rVar.L(this);
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f34941a.T(this.f34942b, this.f34943c, this.f34944d);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long w(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = o.f34940a[((j$.time.temporal.a) rVar).ordinal()];
            int i11 = this.f34943c;
            int i12 = 1;
            int i13 = this.f34944d;
            int i14 = this.f34942b;
            switch (i10) {
                case 1:
                    return i13;
                case 2:
                    return R();
                case 3:
                    return ((i13 - 1) / 7) + 1;
                case 4:
                    return ((int) j$.com.android.tools.r8.a.o(toEpochDay() + 3, 7)) + 1;
                case 5:
                    return ((i13 - 1) % 7) + 1;
                case 6:
                    return ((R() - 1) % 7) + 1;
                case 7:
                    return toEpochDay();
                case 8:
                    return ((R() - 1) / 7) + 1;
                case 9:
                    return i11;
                case 10:
                    return ((i14 * 12) + i11) - 1;
                case 11:
                    return i14;
                case 12:
                    return i14;
                case 13:
                    if (i14 <= 1) {
                        i12 = 0;
                    }
                    return i12;
                default:
                    throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
            }
        }
        return rVar.w(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f34941a);
        objectOutput.writeInt(j$.time.temporal.q.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.q.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.q.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }

    @Override // j$.time.chrono.AbstractC3701d, j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDateTime y(j$.time.i iVar) {
        return C3703f.P(this, iVar);
    }
}
