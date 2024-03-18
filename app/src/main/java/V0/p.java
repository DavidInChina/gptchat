package v0;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class p extends AbstractC5938B {

    /* renamed from: c  reason: collision with root package name */
    public final float f46995c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46996d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46997e;

    /* renamed from: f  reason: collision with root package name */
    public final float f46998f;

    public p(float f6, float f10, float f11, float f12) {
        super(true, false, 2);
        this.f46995c = f6;
        this.f46996d = f10;
        this.f46997e = f11;
        this.f46998f = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.compare(this.f46995c, pVar.f46995c) == 0 && Float.compare(this.f46996d, pVar.f46996d) == 0 && Float.compare(this.f46997e, pVar.f46997e) == 0 && Float.compare(this.f46998f, pVar.f46998f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46998f) + AbstractC6463a.e(this.f46997e, AbstractC6463a.e(this.f46996d, Float.floatToIntBits(this.f46995c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f46995c);
        sb2.append(", y1=");
        sb2.append(this.f46996d);
        sb2.append(", x2=");
        sb2.append(this.f46997e);
        sb2.append(", y2=");
        return AbstractC6463a.k(sb2, this.f46998f, ')');
    }
}
