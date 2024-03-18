package y;

import id.AbstractC3557B;
import z.AbstractC6659E;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f50212a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6659E f50213b;

    public f0(float f6, AbstractC6659E abstractC6659E) {
        this.f50212a = f6;
        this.f50213b = abstractC6659E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (Float.compare(this.f50212a, f0Var.f50212a) == 0 && AbstractC3557B.K(this.f50213b, f0Var.f50213b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50213b.hashCode() + (Float.floatToIntBits(this.f50212a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f50212a + ", animationSpec=" + this.f50213b + ')';
    }
}
