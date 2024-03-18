package E;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public float f3931a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3932b = true;

    /* renamed from: c  reason: collision with root package name */
    public r.f f3933c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (Float.compare(this.f3931a, o0Var.f3931a) == 0 && this.f3932b == o0Var.f3932b && AbstractC3557B.K(this.f3933c, o0Var.f3933c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int floatToIntBits = Float.floatToIntBits(this.f3931a) * 31;
        if (this.f3932b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (floatToIntBits + i10) * 31;
        r.f fVar = this.f3933c;
        if (fVar == null) {
            i11 = 0;
        } else {
            i11 = fVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f3931a + ", fill=" + this.f3932b + ", crossAxisAlignment=" + this.f3933c + ')';
    }
}
