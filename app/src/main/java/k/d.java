package K;

import q0.C5254f;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f9316a;

    public d(float f6) {
        this.f9316a = f6;
        if (f6 >= 0.0f && f6 <= 100.0f) {
            return;
        }
        throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
    }

    @Override // K.b
    public final float a(long j6, Z0.b bVar) {
        return (this.f9316a / 100.0f) * C5254f.c(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && Float.compare(this.f9316a, ((d) obj).f9316a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9316a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f9316a + "%)";
    }
}
