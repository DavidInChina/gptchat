package Z0;

import M3.H;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final o[] f22809b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* renamed from: c  reason: collision with root package name */
    public static final long f22810c = H.b0(Float.NaN, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f22811a;

    public static final boolean a(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final long b(long j6) {
        return f22809b[(int) ((j6 & 1095216660480L) >>> 32)].f22812a;
    }

    public static final float c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    public static int d(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static String e(long j6) {
        long b10 = b(j6);
        if (o.a(b10, 0L)) {
            return "Unspecified";
        }
        if (o.a(b10, 4294967296L)) {
            return c(j6) + ".sp";
        } else if (o.a(b10, 8589934592L)) {
            return c(j6) + ".em";
        } else {
            return "Invalid";
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f22811a != ((n) obj).f22811a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return d(this.f22811a);
    }

    public final String toString() {
        return e(this.f22811a);
    }
}
