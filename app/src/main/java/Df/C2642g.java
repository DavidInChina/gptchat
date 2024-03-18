package df;

import id.AbstractC3557B;

/* renamed from: df.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2642g {

    /* renamed from: a  reason: collision with root package name */
    public final long f28270a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28271b;

    public C2642g(long j6, String str) {
        AbstractC3557B.c0("config", str);
        this.f28270a = j6;
        this.f28271b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2642g)) {
            return false;
        }
        C2642g c2642g = (C2642g) obj;
        if (this.f28270a == c2642g.f28270a && AbstractC3557B.K(this.f28271b, c2642g.f28271b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f28270a;
        return this.f28271b.hashCode() + (((int) (j6 ^ (j6 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SdpFmtp(payload=");
        sb2.append(this.f28270a);
        sb2.append(", config=");
        return android.gov.nist.core.a.n(sb2, this.f28271b, ')');
    }
}
