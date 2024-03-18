package fe;

import id.AbstractC3557B;

/* renamed from: fe.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3028f {

    /* renamed from: a  reason: collision with root package name */
    public final String f30253a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30254b;

    public C3028f(String str, String str2) {
        this.f30253a = str;
        this.f30254b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3028f)) {
            return false;
        }
        C3028f c3028f = (C3028f) obj;
        if (AbstractC3557B.K(this.f30253a, c3028f.f30253a) && AbstractC3557B.K(this.f30254b, c3028f.f30254b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f30253a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i12 = i10 * 31;
        String str2 = this.f30254b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnknownLicense(name=");
        sb2.append(this.f30253a);
        sb2.append(", url=");
        return android.gov.nist.core.a.n(sb2, this.f30254b, ')');
    }
}
