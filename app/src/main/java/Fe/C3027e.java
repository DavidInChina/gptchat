package fe;

import id.AbstractC3557B;

/* renamed from: fe.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3027e {

    /* renamed from: a  reason: collision with root package name */
    public final String f30250a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30251b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30252c;

    public C3027e(String str, String str2, String str3) {
        this.f30250a = str;
        this.f30251b = str2;
        this.f30252c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3027e)) {
            return false;
        }
        C3027e c3027e = (C3027e) obj;
        if (AbstractC3557B.K(this.f30250a, c3027e.f30250a) && AbstractC3557B.K(this.f30251b, c3027e.f30251b) && AbstractC3557B.K(this.f30252c, c3027e.f30252c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30252c.hashCode() + E9.f.v(this.f30251b, this.f30250a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpdxLicense(identifier=");
        sb2.append(this.f30250a);
        sb2.append(", name=");
        sb2.append(this.f30251b);
        sb2.append(", url=");
        return android.gov.nist.core.a.n(sb2, this.f30252c, ')');
    }
}
