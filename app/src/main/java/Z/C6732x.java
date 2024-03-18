package z;

import y.AbstractC6463a;

/* renamed from: z.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6732x implements AbstractC6653B {

    /* renamed from: a  reason: collision with root package name */
    public final float f51400a;

    /* renamed from: b  reason: collision with root package name */
    public final float f51401b;

    /* renamed from: c  reason: collision with root package name */
    public final float f51402c;

    public C6732x(float f6, float f10, float f11) {
        this.f51400a = f6;
        this.f51401b = f10;
        this.f51402c = f11;
        if (!Float.isNaN(f6) && !Float.isNaN(0.0f) && !Float.isNaN(f10) && !Float.isNaN(f11)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
        sb2.append(f6);
        sb2.append(", 0.0, ");
        sb2.append(f10);
        sb2.append(", ");
        throw new IllegalArgumentException(AbstractC6463a.k(sb2, f11, '.').toString());
    }

    public static float b(float f6, float f10, float f11) {
        float f12 = 3;
        float f13 = 1 - f11;
        return (f11 * f11 * f11) + (f12 * f10 * f13 * f11 * f11) + (f6 * f12 * f13 * f13 * f11);
    }

    @Override // z.AbstractC6653B
    public final float a(float f6) {
        if (f6 > 0.0f) {
            float f10 = 1.0f;
            if (f6 < 1.0f) {
                float f11 = 0.0f;
                while (true) {
                    float f12 = (f11 + f10) / 2;
                    float b10 = b(this.f51400a, this.f51401b, f12);
                    if (Math.abs(f6 - b10) < 0.001f) {
                        return b(0.0f, this.f51402c, f12);
                    }
                    if (b10 < f6) {
                        f11 = f12;
                    } else {
                        f10 = f12;
                    }
                }
            }
        }
        return f6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6732x) {
            C6732x c6732x = (C6732x) obj;
            if (this.f51400a == c6732x.f51400a && this.f51401b == c6732x.f51401b && this.f51402c == c6732x.f51402c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51402c) + AbstractC6463a.e(this.f51401b, AbstractC6463a.e(0.0f, Float.floatToIntBits(this.f51400a) * 31, 31), 31);
    }
}
