package q0;

import M3.H;

/* renamed from: q0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5251c {

    /* renamed from: b  reason: collision with root package name */
    public static final long f43619b = R4.b.r(0.0f, 0.0f);

    /* renamed from: c  reason: collision with root package name */
    public static final long f43620c = R4.b.r(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d  reason: collision with root package name */
    public static final long f43621d = R4.b.r(Float.NaN, Float.NaN);

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f43622e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f43623a;

    public static long a(long j6, int i10) {
        float f6;
        float f10 = 0.0f;
        if ((i10 & 1) != 0) {
            f6 = d(j6);
        } else {
            f6 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f10 = e(j6);
        }
        return R4.b.r(f6, f10);
    }

    public static final boolean b(long j6, long j10) {
        if (j6 == j10) {
            return true;
        }
        return false;
    }

    public static final float c(long j6) {
        return (float) Math.sqrt((e(j6) * e(j6)) + (d(j6) * d(j6)));
    }

    public static final float d(long j6) {
        if (j6 != f43621d) {
            return Float.intBitsToFloat((int) (j6 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static final float e(long j6) {
        if (j6 != f43621d) {
            return Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    public static int f(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static final long g(long j6, long j10) {
        return R4.b.r(d(j6) - d(j10), e(j6) - e(j10));
    }

    public static final long h(long j6, long j10) {
        return R4.b.r(d(j10) + d(j6), e(j10) + e(j6));
    }

    public static final long i(float f6, long j6) {
        return R4.b.r(d(j6) * f6, e(j6) * f6);
    }

    public static String j(long j6) {
        if (R4.b.z1(j6)) {
            return "Offset(" + H.A0(d(j6)) + ", " + H.A0(e(j6)) + ')';
        }
        return "Offset.Unspecified";
    }

    public static final long k(long j6) {
        return R4.b.r(-d(j6), -e(j6));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5251c)) {
            return false;
        }
        if (this.f43623a != ((C5251c) obj).f43623a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return f(this.f43623a);
    }

    public final String toString() {
        return j(this.f43623a);
    }
}
