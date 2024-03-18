package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class o extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46991c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46992d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46993e;

    /* renamed from: f  reason: collision with root package name */
    public final float f46994f;

    public o(float f6, float f10, float f11, float f12) {
        super(false, true, 1);
        this.f46991c = f6;
        this.f46992d = f10;
        this.f46993e = f11;
        this.f46994f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (Float.compare(this.f46991c, oVar.f46991c) == 0 && Float.compare(this.f46992d, oVar.f46992d) == 0 && Float.compare(this.f46993e, oVar.f46993e) == 0 && Float.compare(this.f46994f, oVar.f46994f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46994f) + AbstractC6463a.e(this.f46993e, AbstractC6463a.e(this.f46992d, Float.floatToIntBits(this.f46991c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f46991c);
        sb2.append(", y1=");
        sb2.append(this.f46992d);
        sb2.append(", x2=");
        sb2.append(this.f46993e);
        sb2.append(", y2=");
        return AbstractC6463a.k(sb2, this.f46994f, ')');
    }
}
