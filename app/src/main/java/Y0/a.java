package Y0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f22014a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (Float.compare(this.f22014a, ((a) obj).f22014a) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22014a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f22014a + ')';
    }
}
