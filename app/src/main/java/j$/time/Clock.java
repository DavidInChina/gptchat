package j$.time;

/* loaded from: classes3.dex */
public abstract class Clock {
    public static Clock c() {
        return new a(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return a.f34896b;
    }

    public abstract ZoneId a();

    public long b() {
        return instant().toEpochMilli();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public abstract Instant instant();
}
