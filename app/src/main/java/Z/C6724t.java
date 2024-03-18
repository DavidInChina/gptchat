package z;

import y.AbstractC6463a;

/* renamed from: z.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6724t extends AbstractC6726u {

    /* renamed from: a  reason: collision with root package name */
    public float f51373a;

    /* renamed from: b  reason: collision with root package name */
    public float f51374b;

    /* renamed from: c  reason: collision with root package name */
    public float f51375c;

    /* renamed from: d  reason: collision with root package name */
    public float f51376d;

    public C6724t(float f6, float f10, float f11, float f12) {
        this.f51373a = f6;
        this.f51374b = f10;
        this.f51375c = f11;
        this.f51376d = f12;
    }

    @Override // z.AbstractC6726u
    public final float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return 0.0f;
                    }
                    return this.f51376d;
                }
                return this.f51375c;
            }
            return this.f51374b;
        }
        return this.f51373a;
    }

    @Override // z.AbstractC6726u
    public final int b() {
        return 4;
    }

    @Override // z.AbstractC6726u
    public final AbstractC6726u c() {
        return new C6724t(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // z.AbstractC6726u
    public final void d() {
        this.f51373a = 0.0f;
        this.f51374b = 0.0f;
        this.f51375c = 0.0f;
        this.f51376d = 0.0f;
    }

    @Override // z.AbstractC6726u
    public final void e(int i10, float f6) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.f51376d = f6;
                        return;
                    }
                    return;
                }
                this.f51375c = f6;
                return;
            }
            this.f51374b = f6;
            return;
        }
        this.f51373a = f6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6724t) {
            C6724t c6724t = (C6724t) obj;
            if (c6724t.f51373a == this.f51373a && c6724t.f51374b == this.f51374b && c6724t.f51375c == this.f51375c && c6724t.f51376d == this.f51376d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51376d) + AbstractC6463a.e(this.f51375c, AbstractC6463a.e(this.f51374b, Float.floatToIntBits(this.f51373a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f51373a + ", v2 = " + this.f51374b + ", v3 = " + this.f51375c + ", v4 = " + this.f51376d;
    }
}
