package s0;

/* renamed from: s0.r  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5516r {

    /* renamed from: a  reason: collision with root package name */
    public final double f45089a;

    /* renamed from: b  reason: collision with root package name */
    public final double f45090b;

    /* renamed from: c  reason: collision with root package name */
    public final double f45091c;

    /* renamed from: d  reason: collision with root package name */
    public final double f45092d;

    /* renamed from: e  reason: collision with root package name */
    public final double f45093e;

    /* renamed from: f  reason: collision with root package name */
    public final double f45094f;

    /* renamed from: g  reason: collision with root package name */
    public final double f45095g;

    public /* synthetic */ C5516r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5516r)) {
            return false;
        }
        C5516r c5516r = (C5516r) obj;
        if (Double.compare(this.f45089a, c5516r.f45089a) == 0 && Double.compare(this.f45090b, c5516r.f45090b) == 0 && Double.compare(this.f45091c, c5516r.f45091c) == 0 && Double.compare(this.f45092d, c5516r.f45092d) == 0 && Double.compare(this.f45093e, c5516r.f45093e) == 0 && Double.compare(this.f45094f, c5516r.f45094f) == 0 && Double.compare(this.f45095g, c5516r.f45095g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f45089a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f45090b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f45091c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f45092d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f45093e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f45094f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f45095g);
        return (((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7));
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f45089a + ", a=" + this.f45090b + ", b=" + this.f45091c + ", c=" + this.f45092d + ", d=" + this.f45093e + ", e=" + this.f45094f + ", f=" + this.f45095g + ')';
    }

    public C5516r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f45089a = d10;
        this.f45090b = d11;
        this.f45091c = d12;
        this.f45092d = d13;
        this.f45093e = d14;
        this.f45094f = d15;
        this.f45095g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        } else if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        } else {
            if (d14 >= 1.0d && d13 == 0.0d) {
                throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
            }
            if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
                throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
            }
            if (d13 < 0.0d) {
                throw new IllegalArgumentException("The transfer function must be increasing");
            }
            if (d11 >= 0.0d && d10 >= 0.0d) {
                return;
            }
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
