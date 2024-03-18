package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class w extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47019c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47020d;

    /* renamed from: e  reason: collision with root package name */
    public final float f47021e;

    /* renamed from: f  reason: collision with root package name */
    public final float f47022f;

    public w(float f6, float f10, float f11, float f12) {
        super(false, true, 1);
        this.f47019c = f6;
        this.f47020d = f10;
        this.f47021e = f11;
        this.f47022f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(this.f47019c, wVar.f47019c) == 0 && Float.compare(this.f47020d, wVar.f47020d) == 0 && Float.compare(this.f47021e, wVar.f47021e) == 0 && Float.compare(this.f47022f, wVar.f47022f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47022f) + AbstractC6463a.e(this.f47021e, AbstractC6463a.e(this.f47020d, Float.floatToIntBits(this.f47019c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f47019c);
        sb2.append(", dy1=");
        sb2.append(this.f47020d);
        sb2.append(", dx2=");
        sb2.append(this.f47021e);
        sb2.append(", dy2=");
        return AbstractC6463a.k(sb2, this.f47022f, ')');
    }
}
