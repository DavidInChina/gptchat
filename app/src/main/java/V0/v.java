package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class v extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47017c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47018d;

    public v(float f6, float f10) {
        super(false, false, 3);
        this.f47017c = f6;
        this.f47018d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Float.compare(this.f47017c, vVar.f47017c) == 0 && Float.compare(this.f47018d, vVar.f47018d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47018d) + (Float.floatToIntBits(this.f47017c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f47017c);
        sb2.append(", dy=");
        return AbstractC6463a.k(sb2, this.f47018d, ')');
    }
}
