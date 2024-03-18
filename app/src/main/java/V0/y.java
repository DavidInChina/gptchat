package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class y extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47027c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47028d;

    public y(float f6, float f10) {
        super(false, true, 1);
        this.f47027c = f6;
        this.f47028d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Float.compare(this.f47027c, yVar.f47027c) == 0 && Float.compare(this.f47028d, yVar.f47028d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47028d) + (Float.floatToIntBits(this.f47027c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f47027c);
        sb2.append(", dy=");
        return AbstractC6463a.k(sb2, this.f47028d, ')');
    }
}
