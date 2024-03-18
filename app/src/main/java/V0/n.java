package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class n extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46989c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46990d;

    public n(float f6, float f10) {
        super(false, false, 3);
        this.f46989c = f6;
        this.f46990d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Float.compare(this.f46989c, nVar.f46989c) == 0 && Float.compare(this.f46990d, nVar.f46990d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46990d) + (Float.floatToIntBits(this.f46989c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f46989c);
        sb2.append(", y=");
        return AbstractC6463a.k(sb2, this.f46990d, ')');
    }
}
