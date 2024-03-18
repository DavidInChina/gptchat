package Z0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final long f22804a;

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j6) {
        return ((int) (j6 >> 32)) + " x " + ((int) (j6 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.f22804a != ((k) obj).f22804a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22804a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return b(this.f22804a);
    }
}
