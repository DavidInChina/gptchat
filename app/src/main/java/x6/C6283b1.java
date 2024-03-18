package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: x6.b1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6283b1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49262a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49263b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49264c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49265d;

    public C6283b1(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        AbstractC3557B.c0("versionMajor", str4);
        this.f49262a = str;
        this.f49263b = str2;
        this.f49264c = str3;
        this.f49265d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6283b1)) {
            return false;
        }
        C6283b1 c6283b1 = (C6283b1) obj;
        if (AbstractC3557B.K(this.f49262a, c6283b1.f49262a) && AbstractC3557B.K(this.f49263b, c6283b1.f49263b) && AbstractC3557B.K(this.f49264c, c6283b1.f49264c) && AbstractC3557B.K(this.f49265d, c6283b1.f49265d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49263b, this.f49262a.hashCode() * 31, 31);
        String str = this.f49264c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f49265d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f49262a);
        sb2.append(", version=");
        sb2.append(this.f49263b);
        sb2.append(", build=");
        sb2.append(this.f49264c);
        sb2.append(", versionMajor=");
        return R.a.t(sb2, this.f49265d, Separators.RPAREN);
    }
}
