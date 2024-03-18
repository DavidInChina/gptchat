package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class u extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47015c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47016d;

    public u(float f6, float f10) {
        super(false, false, 3);
        this.f47015c = f6;
        this.f47016d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (Float.compare(this.f47015c, uVar.f47015c) == 0 && Float.compare(this.f47016d, uVar.f47016d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47016d) + (Float.floatToIntBits(this.f47015c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f47015c);
        sb2.append(", dy=");
        return AbstractC6463a.k(sb2, this.f47016d, ')');
    }
}
