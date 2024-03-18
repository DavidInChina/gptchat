package y;

/* renamed from: y.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6464b {

    /* renamed from: a  reason: collision with root package name */
    public final float f50179a;

    /* renamed from: b  reason: collision with root package name */
    public final float f50180b;

    public C6464b(float f6, float f10) {
        this.f50179a = f6;
        this.f50180b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6464b)) {
            return false;
        }
        C6464b c6464b = (C6464b) obj;
        if (Float.compare(this.f50179a, c6464b.f50179a) == 0 && Float.compare(this.f50180b, c6464b.f50180b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50180b) + (Float.floatToIntBits(this.f50179a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f50179a);
        sb2.append(", velocityCoefficient=");
        return AbstractC6463a.k(sb2, this.f50180b, ')');
    }
}
