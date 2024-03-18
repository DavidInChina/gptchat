package Z0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final long f22812a;

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j6) {
        if (a(j6, 0L)) {
            return "Unspecified";
        }
        if (a(j6, 4294967296L)) {
            return "Sp";
        }
        if (a(j6, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (this.f22812a != ((o) obj).f22812a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22812a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return b(this.f22812a);
    }
}
