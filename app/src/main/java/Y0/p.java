package Y0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static final p f22039c = new p(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f22040a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22041b;

    public p(float f6, float f10) {
        this.f22040a = f6;
        this.f22041b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f22040a == pVar.f22040a && this.f22041b == pVar.f22041b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f22041b) + (Float.floatToIntBits(this.f22040a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f22040a);
        sb2.append(", skewX=");
        return AbstractC6463a.k(sb2, this.f22041b, ')');
    }
}
