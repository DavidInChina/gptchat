package W;

import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class D0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f19023a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19024b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19025c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19026d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19027e;

    /* renamed from: f  reason: collision with root package name */
    public final float f19028f;

    public D0(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f19023a = f6;
        this.f19024b = f10;
        this.f19025c = f11;
        this.f19026d = f12;
        this.f19027e = f13;
        this.f19028f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (Z0.e.a(this.f19023a, d02.f19023a) && Z0.e.a(this.f19024b, d02.f19024b) && Z0.e.a(this.f19025c, d02.f19025c) && Z0.e.a(this.f19026d, d02.f19026d) && Z0.e.a(this.f19028f, d02.f19028f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19028f) + AbstractC6463a.e(this.f19026d, AbstractC6463a.e(this.f19025c, AbstractC6463a.e(this.f19024b, Float.floatToIntBits(this.f19023a) * 31, 31), 31), 31);
    }
}
