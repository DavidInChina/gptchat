package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class q extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46999c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47000d;

    public q(float f6, float f10) {
        super(false, true, 1);
        this.f46999c = f6;
        this.f47000d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(this.f46999c, qVar.f46999c) == 0 && Float.compare(this.f47000d, qVar.f47000d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47000d) + (Float.floatToIntBits(this.f46999c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f46999c);
        sb2.append(", y=");
        return AbstractC6463a.k(sb2, this.f47000d, ')');
    }
}
