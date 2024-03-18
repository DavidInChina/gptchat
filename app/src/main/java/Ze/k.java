package Ze;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class k {
    public static final j Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final Lg.i f23709d = new Lg.i("L(\\d)T(\\d)(h|_KEY|_KEY_SHIFT)?");

    /* renamed from: a  reason: collision with root package name */
    public final int f23710a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23711b;

    /* renamed from: c  reason: collision with root package name */
    public final String f23712c;

    public k(int i10, int i11, String str) {
        AbstractC3557B.c0("suffix", str);
        this.f23710a = i10;
        this.f23711b = i11;
        this.f23712c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f23710a == kVar.f23710a && this.f23711b == kVar.f23711b && AbstractC3557B.K(this.f23712c, kVar.f23712c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23712c.hashCode() + (((this.f23710a * 31) + this.f23711b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScalabilityMode(spatial=");
        sb2.append(this.f23710a);
        sb2.append(", temporal=");
        sb2.append(this.f23711b);
        sb2.append(", suffix=");
        return android.gov.nist.core.a.n(sb2, this.f23712c, ')');
    }
}
