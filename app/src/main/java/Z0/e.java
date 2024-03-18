package Z0;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final float f22788Y;

    public static final boolean a(float f6, float f10) {
        if (Float.compare(f6, f10) == 0) {
            return true;
        }
        return false;
    }

    public static String b(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f22788Y, ((e) obj).f22788Y);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (Float.compare(this.f22788Y, ((e) obj).f22788Y) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22788Y);
    }

    public final String toString() {
        return b(this.f22788Y);
    }
}
