package Z0;

import A.AbstractC0044t0;
import H0.B0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f22779b = {18, 20, 17, 15};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f22780c = {65535, 262143, 32767, 8191};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f22781d = {32767, 8191, 65535, 262143};

    /* renamed from: a  reason: collision with root package name */
    public final long f22782a;

    public /* synthetic */ a(long j6) {
        this.f22782a = j6;
    }

    public static long a(long j6, int i10, int i11, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i10 = j(j6);
        }
        if ((i14 & 2) != 0) {
            i11 = h(j6);
        }
        if ((i14 & 4) != 0) {
            i12 = i(j6);
        }
        if ((i14 & 8) != 0) {
            i13 = g(j6);
        }
        if (i12 >= 0 && i10 >= 0) {
            if (i11 < i10 && i11 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')').toString());
            } else if (i13 < i12 && i13 != Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')').toString());
            } else {
                return B0.c(i10, i11, i12, i13);
            }
        }
        throw new IllegalArgumentException(AbstractC0044t0.y("minHeight(", i12, ") and minWidth(", i10, ") must be >= 0").toString());
    }

    public static final boolean b(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final boolean c(long j6) {
        int i10 = (int) (3 & j6);
        if ((((int) (j6 >> (f22779b[i10] + 31))) & f22781d[i10]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j6) {
        if ((((int) (j6 >> 33)) & f22780c[(int) (3 & j6)]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j6) {
        if (g(j6) == i(j6)) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j6) {
        if (h(j6) == j(j6)) {
            return true;
        }
        return false;
    }

    public static final int g(long j6) {
        int i10 = (int) (3 & j6);
        int i11 = ((int) (j6 >> (f22779b[i10] + 31))) & f22781d[i10];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int h(long j6) {
        int i10 = ((int) (j6 >> 33)) & f22780c[(int) (3 & j6)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int i(long j6) {
        int i10 = (int) (3 & j6);
        return ((int) (j6 >> f22779b[i10])) & f22781d[i10];
    }

    public static final int j(long j6) {
        return ((int) (j6 >> 2)) & f22780c[(int) (3 & j6)];
    }

    public static String k(long j6) {
        String str;
        int h10 = h(j6);
        String str2 = "Infinity";
        if (h10 == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(h10);
        }
        int g10 = g(j6);
        if (g10 != Integer.MAX_VALUE) {
            str2 = String.valueOf(g10);
        }
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j6));
        sb2.append(", maxWidth = ");
        sb2.append(str);
        sb2.append(", minHeight = ");
        sb2.append(i(j6));
        sb2.append(", maxHeight = ");
        return android.gov.nist.core.a.n(sb2, str2, ')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f22782a != ((a) obj).f22782a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22782a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return k(this.f22782a);
    }
}
