package y;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f50215a;

    /* renamed from: b  reason: collision with root package name */
    public final float f50216b;

    /* renamed from: c  reason: collision with root package name */
    public final long f50217c;

    public g0(float f6, float f10, long j6) {
        this.f50215a = f6;
        this.f50216b = f10;
        this.f50217c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (Float.compare(this.f50215a, g0Var.f50215a) == 0 && Float.compare(this.f50216b, g0Var.f50216b) == 0 && this.f50217c == g0Var.f50217c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int e10 = AbstractC6463a.e(this.f50216b, Float.floatToIntBits(this.f50215a) * 31, 31);
        long j6 = this.f50217c;
        return e10 + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f50215a + ", distance=" + this.f50216b + ", duration=" + this.f50217c + ')';
    }
}
