package g2;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final long f31044a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31045b;

    /* renamed from: c  reason: collision with root package name */
    public final long f31046c;

    /* renamed from: d  reason: collision with root package name */
    public final H f31047d;

    public J() {
        Mg.a aVar = Mg.b.f12127Z;
        Mg.d dVar = Mg.d.f12134i0;
        long x02 = Df.H.x0(45, dVar);
        long x03 = Df.H.x0(5, dVar);
        long x04 = Df.H.x0(5, dVar);
        H.f31041a.getClass();
        C3142G c3142g = C3142G.f31039b;
        this.f31044a = x02;
        this.f31045b = x03;
        this.f31046c = x04;
        this.f31047d = c3142g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j6 = (J) obj;
        if (Mg.b.d(this.f31044a, j6.f31044a) && Mg.b.d(this.f31045b, j6.f31045b) && Mg.b.d(this.f31046c, j6.f31046c) && AbstractC3557B.K(this.f31047d, j6.f31047d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int g10 = Mg.b.g(this.f31045b);
        int g11 = Mg.b.g(this.f31046c);
        return this.f31047d.hashCode() + ((g11 + ((g10 + (Mg.b.g(this.f31044a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) Mg.b.m(this.f31044a)) + ", additionalTime=" + ((Object) Mg.b.m(this.f31045b)) + ", idleTimeout=" + ((Object) Mg.b.m(this.f31046c)) + ", timeSource=" + this.f31047d + ')';
    }
}
