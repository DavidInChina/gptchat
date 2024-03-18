package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f35122a;

    static {
        Duration duration = Duration.f34874c;
    }

    i(String str) {
        this.f35122a = str;
    }

    @Override // j$.time.temporal.u
    public final boolean g() {
        return true;
    }

    @Override // j$.time.temporal.u
    public final m p(m mVar, long j6) {
        int i10 = c.f35118a[ordinal()];
        if (i10 == 1) {
            r rVar = j.f35125c;
            return mVar.d(j$.com.android.tools.r8.a.k(mVar.p(rVar), j6), rVar);
        } else if (i10 != 2) {
            throw new IllegalStateException("Unreachable");
        } else {
            return mVar.mo88e(j6 / 4, b.YEARS).mo88e((j6 % 4) * 3, b.MONTHS);
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35122a;
    }
}
