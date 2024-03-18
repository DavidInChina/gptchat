package V;

import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final float f17932a;

    /* renamed from: b  reason: collision with root package name */
    public final float f17933b;

    /* renamed from: c  reason: collision with root package name */
    public final float f17934c;

    /* renamed from: d  reason: collision with root package name */
    public final float f17935d;

    public h(float f6, float f10, float f11, float f12) {
        this.f17932a = f6;
        this.f17933b = f10;
        this.f17934c = f11;
        this.f17935d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f17932a == hVar.f17932a && this.f17933b == hVar.f17933b && this.f17934c == hVar.f17934c && this.f17935d == hVar.f17935d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17935d) + AbstractC6463a.e(this.f17934c, AbstractC6463a.e(this.f17933b, Float.floatToIntBits(this.f17932a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f17932a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f17933b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f17934c);
        sb2.append(", pressedAlpha=");
        return AbstractC6463a.k(sb2, this.f17935d, ')');
    }
}
