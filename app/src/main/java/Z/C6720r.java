package z;

/* renamed from: z.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6720r extends AbstractC6726u {

    /* renamed from: a  reason: collision with root package name */
    public float f51354a;

    /* renamed from: b  reason: collision with root package name */
    public float f51355b;

    public C6720r(float f6, float f10) {
        this.f51354a = f6;
        this.f51355b = f10;
    }

    @Override // z.AbstractC6726u
    public final float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return 0.0f;
            }
            return this.f51355b;
        }
        return this.f51354a;
    }

    @Override // z.AbstractC6726u
    public final int b() {
        return 2;
    }

    @Override // z.AbstractC6726u
    public final AbstractC6726u c() {
        return new C6720r(0.0f, 0.0f);
    }

    @Override // z.AbstractC6726u
    public final void d() {
        this.f51354a = 0.0f;
        this.f51355b = 0.0f;
    }

    @Override // z.AbstractC6726u
    public final void e(int i10, float f6) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f51355b = f6;
                return;
            }
            return;
        }
        this.f51354a = f6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6720r) {
            C6720r c6720r = (C6720r) obj;
            if (c6720r.f51354a == this.f51354a && c6720r.f51355b == this.f51355b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51355b) + (Float.floatToIntBits(this.f51354a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f51354a + ", v2 = " + this.f51355b;
    }
}
