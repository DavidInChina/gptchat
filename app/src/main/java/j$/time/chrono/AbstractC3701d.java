package j$.time.chrono;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3701d implements ChronoLocalDate, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ChronoLocalDate L(k kVar, j$.time.temporal.m mVar) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) mVar;
        AbstractC3698a abstractC3698a = (AbstractC3698a) kVar;
        if (abstractC3698a.equals(chronoLocalDate.a())) {
            return chronoLocalDate;
        }
        String id2 = abstractC3698a.getId();
        String id3 = chronoLocalDate.a().getId();
        throw new ClassCastException("Chronology mismatch, expected: " + id2 + ", actual: " + id3);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return AbstractC3699b.a(this, mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public l B() {
        return a().M(j$.time.temporal.q.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean E() {
        return a().K(w(j$.time.temporal.a.YEAR));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: H */
    public ChronoLocalDate g(long j6, j$.time.temporal.u uVar) {
        return L(a(), j$.time.temporal.q.b(this, j6, uVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int J() {
        return E() ? 366 : 365;
    }

    abstract ChronoLocalDate O(long j6);

    abstract ChronoLocalDate P(long j6);

    abstract ChronoLocalDate Q(long j6);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate
    public final /* synthetic */ int compareTo(ChronoLocalDate chronoLocalDate) {
        return AbstractC3699b.b(this, chronoLocalDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    public ChronoLocalDate d(long j6, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return L(a(), rVar.A(this, j6));
        }
        throw new DateTimeException(j$.time.b.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.m
    /* renamed from: e */
    public ChronoLocalDate mo88e(long j6, j$.time.temporal.u uVar) {
        boolean z10 = uVar instanceof j$.time.temporal.b;
        if (!z10) {
            if (!z10) {
                return L(a(), uVar.p(this, j6));
            }
            throw new DateTimeException("Unsupported unit: " + uVar);
        }
        switch (AbstractC3700c.f34913a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return O(j6);
            case 2:
                return O(j$.com.android.tools.r8.a.q(j6, 7));
            case 3:
                return P(j6);
            case 4:
                return Q(j6);
            case 5:
                return Q(j$.com.android.tools.r8.a.q(j6, 10));
            case 6:
                return Q(j$.com.android.tools.r8.a.q(j6, 100));
            case 7:
                return Q(j$.com.android.tools.r8.a.q(j6, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.k(w(aVar), j6), (j$.time.temporal.r) aVar);
            default:
                throw new DateTimeException("Unsupported unit: " + uVar);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && AbstractC3699b.b(this, (ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC3699b.h(this, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ ((AbstractC3698a) a()).hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDate j(j$.time.p pVar) {
        return L(a(), pVar.a(this));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* renamed from: m */
    public ChronoLocalDate r(j$.time.temporal.n nVar) {
        return L(a(), nVar.A(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int p(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.a(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.w s(j$.time.temporal.r rVar) {
        return j$.time.temporal.q.d(this, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long w10 = w(j$.time.temporal.a.YEAR_OF_ERA);
        long w11 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long w12 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(((AbstractC3698a) a()).getId());
        sb2.append(Separators.SP);
        sb2.append(B());
        sb2.append(Separators.SP);
        sb2.append(w10);
        String str = "-";
        sb2.append(w11 < 10 ? "-0" : str);
        sb2.append(w11);
        if (w12 < 10) {
            str = "-0";
        }
        sb2.append(str);
        sb2.append(w12);
        return sb2.toString();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public ChronoLocalDateTime y(j$.time.i iVar) {
        return C3703f.P(this, iVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC3699b.j(this, tVar);
    }
}
