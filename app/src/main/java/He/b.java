package He;

import E9.f;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Calendar;
import java.util.Locale;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final int f7668Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7669Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f7670h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f7671i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f7672j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f7673k0;

    /* renamed from: l0  reason: collision with root package name */
    public final e f7674l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f7675m0;

    /* renamed from: n0  reason: collision with root package name */
    public final long f7676n0;

    static {
        Calendar calendar = Calendar.getInstance(a.f7667a, Locale.ROOT);
        AbstractC3557B.Z(calendar);
        a.b(calendar, 0L);
    }

    public b(int i10, int i11, int i12, int i13, int i14, int i15, e eVar, int i16, long j6) {
        AbstractC2469q0.q("dayOfWeek", i13);
        AbstractC3557B.c0("month", eVar);
        this.f7668Y = i10;
        this.f7669Z = i11;
        this.f7670h0 = i12;
        this.f7671i0 = i13;
        this.f7672j0 = i14;
        this.f7673k0 = i15;
        this.f7674l0 = eVar;
        this.f7675m0 = i16;
        this.f7676n0 = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        AbstractC3557B.c0("other", bVar);
        int i10 = (this.f7676n0 > bVar.f7676n0 ? 1 : (this.f7676n0 == bVar.f7676n0 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 0;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f7668Y == bVar.f7668Y && this.f7669Z == bVar.f7669Z && this.f7670h0 == bVar.f7670h0 && this.f7671i0 == bVar.f7671i0 && this.f7672j0 == bVar.f7672j0 && this.f7673k0 == bVar.f7673k0 && this.f7674l0 == bVar.f7674l0 && this.f7675m0 == bVar.f7675m0 && this.f7676n0 == bVar.f7676n0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f7671i0;
        int hashCode = this.f7674l0.hashCode();
        long j6 = this.f7676n0;
        return ((((hashCode + ((((AbstractC6708l.d(i10, ((((this.f7668Y * 31) + this.f7669Z) * 31) + this.f7670h0) * 31, 31) + this.f7672j0) * 31) + this.f7673k0) * 31)) * 31) + this.f7675m0) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f7668Y + ", minutes=" + this.f7669Z + ", hours=" + this.f7670h0 + ", dayOfWeek=" + f.M(this.f7671i0) + ", dayOfMonth=" + this.f7672j0 + ", dayOfYear=" + this.f7673k0 + ", month=" + this.f7674l0 + ", year=" + this.f7675m0 + ", timestamp=" + this.f7676n0 + ')';
    }
}
