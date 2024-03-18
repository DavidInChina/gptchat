package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: x6.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6349y {

    /* renamed from: a  reason: collision with root package name */
    public final String f49472a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49473b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49474c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49475d;

    public C6349y(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        AbstractC3557B.c0("versionMajor", str4);
        this.f49472a = str;
        this.f49473b = str2;
        this.f49474c = str3;
        this.f49475d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6349y)) {
            return false;
        }
        C6349y c6349y = (C6349y) obj;
        if (AbstractC3557B.K(this.f49472a, c6349y.f49472a) && AbstractC3557B.K(this.f49473b, c6349y.f49473b) && AbstractC3557B.K(this.f49474c, c6349y.f49474c) && AbstractC3557B.K(this.f49475d, c6349y.f49475d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49473b, this.f49472a.hashCode() * 31, 31);
        String str = this.f49474c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f49475d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f49472a);
        sb2.append(", version=");
        sb2.append(this.f49473b);
        sb2.append(", build=");
        sb2.append(this.f49474c);
        sb2.append(", versionMajor=");
        return R.a.t(sb2, this.f49475d, Separators.RPAREN);
    }
}
