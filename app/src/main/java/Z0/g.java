package Z0;

import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final long f22792b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f22793c = AbstractC4828h.g(Float.NaN, Float.NaN);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f22794d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f22795a;

    static {
        float f6 = 0;
        f22792b = AbstractC4828h.g(f6, f6);
    }

    public /* synthetic */ g(long j6) {
        this.f22795a = j6;
    }

    public static final float a(long j6) {
        if (j6 != f22793c) {
            return Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static final float b(long j6) {
        if (j6 != f22793c) {
            return Float.intBitsToFloat((int) (j6 >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    public static String c(long j6) {
        if (j6 != f22793c) {
            return ((Object) e.b(b(j6))) + " x " + ((Object) e.b(a(j6)));
        }
        return "DpSize.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f22795a != ((g) obj).f22795a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f22795a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return c(this.f22795a);
    }
}
