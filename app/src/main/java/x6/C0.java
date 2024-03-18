package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f48927a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48928b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48929c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48930d;

    public C0(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        AbstractC3557B.c0("versionMajor", str4);
        this.f48927a = str;
        this.f48928b = str2;
        this.f48929c = str3;
        this.f48930d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (AbstractC3557B.K(this.f48927a, c02.f48927a) && AbstractC3557B.K(this.f48928b, c02.f48928b) && AbstractC3557B.K(this.f48929c, c02.f48929c) && AbstractC3557B.K(this.f48930d, c02.f48930d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f48928b, this.f48927a.hashCode() * 31, 31);
        String str = this.f48929c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f48930d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f48927a);
        sb2.append(", version=");
        sb2.append(this.f48928b);
        sb2.append(", build=");
        sb2.append(this.f48929c);
        sb2.append(", versionMajor=");
        return R.a.t(sb2, this.f48930d, Separators.RPAREN);
    }
}
