package W;

import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class Y2 {

    /* renamed from: a  reason: collision with root package name */
    public final float f19849a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19850b;

    /* renamed from: c  reason: collision with root package name */
    public final float f19851c;

    /* renamed from: d  reason: collision with root package name */
    public final float f19852d;

    /* renamed from: e  reason: collision with root package name */
    public final float f19853e;

    /* renamed from: f  reason: collision with root package name */
    public final float f19854f;

    public Y2(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f19849a = f6;
        this.f19850b = f10;
        this.f19851c = f11;
        this.f19852d = f12;
        this.f19853e = f13;
        this.f19854f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y2)) {
            return false;
        }
        Y2 y22 = (Y2) obj;
        if (Z0.e.a(this.f19849a, y22.f19849a) && Z0.e.a(this.f19850b, y22.f19850b) && Z0.e.a(this.f19851c, y22.f19851c) && Z0.e.a(this.f19852d, y22.f19852d) && Z0.e.a(this.f19854f, y22.f19854f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f19854f) + AbstractC6463a.e(this.f19852d, AbstractC6463a.e(this.f19851c, AbstractC6463a.e(this.f19850b, Float.floatToIntBits(this.f19849a) * 31, 31), 31), 31);
    }
}
