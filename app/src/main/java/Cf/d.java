package Cf;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f3104a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3105b;

    public d(float f6, float f10) {
        this.f3104a = f6;
        this.f3105b = f10;
    }

    public static boolean b(Comparable comparable, Comparable comparable2) {
        if (((Number) comparable).floatValue() <= ((Number) comparable2).floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (this.f3104a > this.f3105b) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!a() || !((d) obj).a()) {
                d dVar = (d) obj;
                if (this.f3104a != dVar.f3104a || this.f3105b != dVar.f3105b) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f3104a) * 31) + Float.floatToIntBits(this.f3105b);
    }

    public final String toString() {
        return this.f3104a + ".." + this.f3105b;
    }
}
