package z;

/* renamed from: z.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6718q extends AbstractC6726u {

    /* renamed from: a  reason: collision with root package name */
    public float f51351a;

    public C6718q(float f6) {
        this.f51351a = f6;
    }

    @Override // z.AbstractC6726u
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f51351a;
        }
        return 0.0f;
    }

    @Override // z.AbstractC6726u
    public final int b() {
        return 1;
    }

    @Override // z.AbstractC6726u
    public final AbstractC6726u c() {
        return new C6718q(0.0f);
    }

    @Override // z.AbstractC6726u
    public final void d() {
        this.f51351a = 0.0f;
    }

    @Override // z.AbstractC6726u
    public final void e(int i10, float f6) {
        if (i10 == 0) {
            this.f51351a = f6;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C6718q) && ((C6718q) obj).f51351a == this.f51351a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f51351a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f51351a;
    }
}
