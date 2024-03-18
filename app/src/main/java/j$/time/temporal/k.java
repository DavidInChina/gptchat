package j$.time.temporal;

import android.gov.nist.core.Separators;
import j$.time.DateTimeException;
import j$.time.chrono.AbstractC3699b;
import j$.time.format.F;
import java.util.HashMap;

/* loaded from: classes3.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);
    
    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a  reason: collision with root package name */
    private final transient String f35128a;

    /* renamed from: b  reason: collision with root package name */
    private final transient w f35129b;

    /* renamed from: c  reason: collision with root package name */
    private final transient long f35130c;

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j6) {
        this.f35128a = str;
        this.f35129b = w.j((-365243219162L) + j6, 365241780471L + j6);
        this.f35130c = j6;
    }

    @Override // j$.time.temporal.r
    public final m A(m mVar, long j6) {
        if (this.f35129b.i(j6)) {
            return mVar.d(j$.com.android.tools.r8.a.r(j6, this.f35130c), a.EPOCH_DAY);
        }
        throw new DateTimeException("Invalid value: " + this.f35128a + Separators.SP + j6);
    }

    @Override // j$.time.temporal.r
    public final w L(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.f(a.EPOCH_DAY)) {
            return this.f35129b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean g() {
        return true;
    }

    @Override // j$.time.temporal.r
    public final w p() {
        return this.f35129b;
    }

    @Override // j$.time.temporal.r
    public final boolean r() {
        return false;
    }

    @Override // j$.time.temporal.r
    public final TemporalAccessor s(HashMap hashMap, TemporalAccessor temporalAccessor, F f6) {
        long longValue = ((Long) hashMap.remove(this)).longValue();
        j$.time.chrono.k p10 = AbstractC3699b.p(temporalAccessor);
        F f10 = F.LENIENT;
        long j6 = this.f35130c;
        if (f6 == f10) {
            return p10.n(j$.com.android.tools.r8.a.r(longValue, j6));
        }
        this.f35129b.b(longValue, this);
        return p10.n(longValue - j6);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35128a;
    }

    @Override // j$.time.temporal.r
    public final long w(TemporalAccessor temporalAccessor) {
        return temporalAccessor.w(a.EPOCH_DAY) + this.f35130c;
    }

    @Override // j$.time.temporal.r
    public final boolean z(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }
}
