package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class m extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46987c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46988d;

    public m(float f6, float f10) {
        super(false, false, 3);
        this.f46987c = f6;
        this.f46988d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Float.compare(this.f46987c, mVar.f46987c) == 0 && Float.compare(this.f46988d, mVar.f46988d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46988d) + (Float.floatToIntBits(this.f46987c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f46987c);
        sb2.append(", y=");
        return AbstractC6463a.k(sb2, this.f46988d, ')');
    }
}
