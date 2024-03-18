package y;

import id.AbstractC3557B;
import z.AbstractC6659E;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f50228a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50229b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6659E f50230c;

    public k0(float f6, long j6, AbstractC6659E abstractC6659E) {
        this.f50228a = f6;
        this.f50229b = j6;
        this.f50230c = abstractC6659E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (Float.compare(this.f50228a, k0Var.f50228a) != 0) {
            return false;
        }
        int i10 = r0.P.f44226c;
        if (this.f50229b == k0Var.f50229b && AbstractC3557B.K(this.f50230c, k0Var.f50230c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.P.f44226c;
        long j6 = this.f50229b;
        int i11 = (int) (j6 ^ (j6 >>> 32));
        return this.f50230c.hashCode() + ((i11 + (Float.floatToIntBits(this.f50228a) * 31)) * 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f50228a + ", transformOrigin=" + ((Object) r0.P.c(this.f50229b)) + ", animationSpec=" + this.f50230c + ')';
    }
}
