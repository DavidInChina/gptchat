package z;

import y.AbstractC6463a;

/* renamed from: z.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6722s extends AbstractC6726u {

    /* renamed from: a  reason: collision with root package name */
    public float f51367a;

    /* renamed from: b  reason: collision with root package name */
    public float f51368b;

    /* renamed from: c  reason: collision with root package name */
    public float f51369c;

    public C6722s(float f6, float f10, float f11) {
        this.f51367a = f6;
        this.f51368b = f10;
        this.f51369c = f11;
    }

    @Override // z.AbstractC6726u
    public final float a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return 0.0f;
                }
                return this.f51369c;
            }
            return this.f51368b;
        }
        return this.f51367a;
    }

    @Override // z.AbstractC6726u
    public final int b() {
        return 3;
    }

    @Override // z.AbstractC6726u
    public final AbstractC6726u c() {
        return new C6722s(0.0f, 0.0f, 0.0f);
    }

    @Override // z.AbstractC6726u
    public final void d() {
        this.f51367a = 0.0f;
        this.f51368b = 0.0f;
        this.f51369c = 0.0f;
    }

    @Override // z.AbstractC6726u
    public final void e(int i10, float f6) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f51369c = f6;
                    return;
                }
                return;
            }
            this.f51368b = f6;
            return;
        }
        this.f51367a = f6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6722s) {
            C6722s c6722s = (C6722s) obj;
            if (c6722s.f51367a == this.f51367a && c6722s.f51368b == this.f51368b && c6722s.f51369c == this.f51369c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51369c) + AbstractC6463a.e(this.f51368b, Float.floatToIntBits(this.f51367a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f51367a + ", v2 = " + this.f51368b + ", v3 = " + this.f51369c;
    }
}
