package e2;

import id.AbstractC3557B;
import java.util.List;

/* renamed from: e2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2783o {

    /* renamed from: a  reason: collision with root package name */
    public final float f28782a;

    /* renamed from: b  reason: collision with root package name */
    public final List f28783b;

    static {
        new C2783o(0.0f, 3);
    }

    public C2783o(float f6, int i10) {
        this((i10 & 1) != 0 ? 0 : f6, kf.v.f37483Y);
    }

    public final C2783o a(C2783o c2783o) {
        return new C2783o(this.f28782a + c2783o.f28782a, kf.t.w2(c2783o.f28783b, this.f28783b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2783o)) {
            return false;
        }
        C2783o c2783o = (C2783o) obj;
        if (Z0.e.a(this.f28782a, c2783o.f28782a) && AbstractC3557B.K(this.f28783b, c2783o.f28783b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28783b.hashCode() + (Float.floatToIntBits(this.f28782a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) Z0.e.b(this.f28782a)) + ", resourceIds=" + this.f28783b + ')';
    }

    public C2783o(float f6, List list) {
        this.f28782a = f6;
        this.f28783b = list;
    }
}
