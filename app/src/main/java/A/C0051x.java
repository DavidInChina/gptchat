package A;

import id.AbstractC3557B;
import r0.AbstractC5350n;

/* renamed from: A.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0051x {

    /* renamed from: a  reason: collision with root package name */
    public final float f321a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5350n f322b;

    public C0051x(float f6, r0.N n10) {
        this.f321a = f6;
        this.f322b = n10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0051x)) {
            return false;
        }
        C0051x c0051x = (C0051x) obj;
        if (Z0.e.a(this.f321a, c0051x.f321a) && AbstractC3557B.K(this.f322b, c0051x.f322b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f322b.hashCode() + (Float.floatToIntBits(this.f321a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) Z0.e.b(this.f321a)) + ", brush=" + this.f322b + ')';
    }
}
