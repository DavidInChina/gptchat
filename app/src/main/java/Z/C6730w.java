package z;

/* renamed from: z.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6730w {

    /* renamed from: a  reason: collision with root package name */
    public double f51396a;

    /* renamed from: b  reason: collision with root package name */
    public double f51397b;

    public C6730w(double d10, double d11) {
        this.f51396a = d10;
        this.f51397b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6730w)) {
            return false;
        }
        C6730w c6730w = (C6730w) obj;
        if (Double.compare(this.f51396a, c6730w.f51396a) == 0 && Double.compare(this.f51397b, c6730w.f51397b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f51396a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f51397b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f51396a + ", _imaginary=" + this.f51397b + ')';
    }
}
