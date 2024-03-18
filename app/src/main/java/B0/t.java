package B0;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final long f1669a;

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static String b(long j6) {
        return "PointerId(value=" + j6 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (this.f1669a != ((t) obj).f1669a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f1669a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return b(this.f1669a);
    }
}
