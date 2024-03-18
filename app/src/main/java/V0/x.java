package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class x extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47023c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47024d;

    /* renamed from: e  reason: collision with root package name */
    public final float f47025e;

    /* renamed from: f  reason: collision with root package name */
    public final float f47026f;

    public x(float f6, float f10, float f11, float f12) {
        super(true, false, 2);
        this.f47023c = f6;
        this.f47024d = f10;
        this.f47025e = f11;
        this.f47026f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(this.f47023c, xVar.f47023c) == 0 && Float.compare(this.f47024d, xVar.f47024d) == 0 && Float.compare(this.f47025e, xVar.f47025e) == 0 && Float.compare(this.f47026f, xVar.f47026f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47026f) + AbstractC6463a.e(this.f47025e, AbstractC6463a.e(this.f47024d, Float.floatToIntBits(this.f47023c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f47023c);
        sb2.append(", dy1=");
        sb2.append(this.f47024d);
        sb2.append(", dx2=");
        sb2.append(this.f47025e);
        sb2.append(", dy2=");
        return AbstractC6463a.k(sb2, this.f47026f, ')');
    }
}
