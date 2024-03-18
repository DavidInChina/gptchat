package w6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final k f48062e = new k(0, Double.MAX_VALUE, -1.7976931348623157E308d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    public final int f48063a;

    /* renamed from: b  reason: collision with root package name */
    public final double f48064b;

    /* renamed from: c  reason: collision with root package name */
    public final double f48065c;

    /* renamed from: d  reason: collision with root package name */
    public final double f48066d;

    public k(int i10, double d10, double d11, double d12) {
        this.f48063a = i10;
        this.f48064b = d10;
        this.f48065c = d11;
        this.f48066d = d12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f48063a == kVar.f48063a && Double.compare(this.f48064b, kVar.f48064b) == 0 && Double.compare(this.f48065c, kVar.f48065c) == 0 && Double.compare(this.f48066d, kVar.f48066d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f48064b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f48065c);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f48066d);
        return (((((this.f48063a * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public final String toString() {
        return "VitalInfo(sampleCount=" + this.f48063a + ", minValue=" + this.f48064b + ", maxValue=" + this.f48065c + ", meanValue=" + this.f48066d + Separators.RPAREN;
    }
}
