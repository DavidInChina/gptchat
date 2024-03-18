package K;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f9315a;

    public c(float f6) {
        this.f9315a = f6;
    }

    @Override // K.b
    public final float a(long j6, Z0.b bVar) {
        return bVar.R(this.f9315a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && Z0.e.a(this.f9315a, ((c) obj).f9315a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9315a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f9315a + ".dp)";
    }
}
