package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class K1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49029a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49030b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49031c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49032d;

    public K1(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        AbstractC3557B.c0("versionMajor", str4);
        this.f49029a = str;
        this.f49030b = str2;
        this.f49031c = str3;
        this.f49032d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K1)) {
            return false;
        }
        K1 k12 = (K1) obj;
        if (AbstractC3557B.K(this.f49029a, k12.f49029a) && AbstractC3557B.K(this.f49030b, k12.f49030b) && AbstractC3557B.K(this.f49031c, k12.f49031c) && AbstractC3557B.K(this.f49032d, k12.f49032d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49030b, this.f49029a.hashCode() * 31, 31);
        String str = this.f49031c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f49032d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f49029a);
        sb2.append(", version=");
        sb2.append(this.f49030b);
        sb2.append(", build=");
        sb2.append(this.f49031c);
        sb2.append(", versionMajor=");
        return R.a.t(sb2, this.f49032d, Separators.RPAREN);
    }
}
