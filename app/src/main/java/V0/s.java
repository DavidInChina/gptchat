package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class s extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f47008c;

    /* renamed from: d  reason: collision with root package name */
    public final float f47009d;

    /* renamed from: e  reason: collision with root package name */
    public final float f47010e;

    /* renamed from: f  reason: collision with root package name */
    public final float f47011f;

    /* renamed from: g  reason: collision with root package name */
    public final float f47012g;

    /* renamed from: h  reason: collision with root package name */
    public final float f47013h;

    public s(float f6, float f10, float f11, float f12, float f13, float f14) {
        super(true, false, 2);
        this.f47008c = f6;
        this.f47009d = f10;
        this.f47010e = f11;
        this.f47011f = f12;
        this.f47012g = f13;
        this.f47013h = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (Float.compare(this.f47008c, sVar.f47008c) == 0 && Float.compare(this.f47009d, sVar.f47009d) == 0 && Float.compare(this.f47010e, sVar.f47010e) == 0 && Float.compare(this.f47011f, sVar.f47011f) == 0 && Float.compare(this.f47012g, sVar.f47012g) == 0 && Float.compare(this.f47013h, sVar.f47013h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47013h) + AbstractC6463a.e(this.f47012g, AbstractC6463a.e(this.f47011f, AbstractC6463a.e(this.f47010e, AbstractC6463a.e(this.f47009d, Float.floatToIntBits(this.f47008c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f47008c);
        sb2.append(", dy1=");
        sb2.append(this.f47009d);
        sb2.append(", dx2=");
        sb2.append(this.f47010e);
        sb2.append(", dy2=");
        sb2.append(this.f47011f);
        sb2.append(", dx3=");
        sb2.append(this.f47012g);
        sb2.append(", dy3=");
        return AbstractC6463a.k(sb2, this.f47013h, ')');
    }
}
