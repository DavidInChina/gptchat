package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public enum b implements u {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f35117a;

    static {
        Duration duration = Duration.f34874c;
        Duration.w(Long.MAX_VALUE, 999999999L);
    }

    b(String str) {
        this.f35117a = str;
    }

    @Override // j$.time.temporal.u
    public final boolean g() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    @Override // j$.time.temporal.u
    public final m p(m mVar, long j6) {
        return mVar.mo88e(j6, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35117a;
    }
}
