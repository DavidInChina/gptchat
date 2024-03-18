package o6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final String f40685a;

    /* renamed from: b  reason: collision with root package name */
    public final String f40686b;

    /* renamed from: c  reason: collision with root package name */
    public final String f40687c;

    public N(String str, String str2, String str3) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("url", str2);
        AbstractC3557B.c0("name", str3);
        this.f40685a = str;
        this.f40686b = str2;
        this.f40687c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        if (AbstractC3557B.K(this.f40685a, n10.f40685a) && AbstractC3557B.K(this.f40686b, n10.f40686b) && AbstractC3557B.K(this.f40687c, n10.f40687c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40687c.hashCode() + E9.f.v(this.f40686b, this.f40685a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RumScopeKey(id=");
        sb2.append(this.f40685a);
        sb2.append(", url=");
        sb2.append(this.f40686b);
        sb2.append(", name=");
        return R.a.t(sb2, this.f40687c, Separators.RPAREN);
    }
}
