package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* renamed from: x6.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6285c0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49269a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49270b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49271c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49272d;

    public C6285c0(String str, String str2, String str3, String str4) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(ParameterNames.VERSION, str2);
        AbstractC3557B.c0("versionMajor", str4);
        this.f49269a = str;
        this.f49270b = str2;
        this.f49271c = str3;
        this.f49272d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6285c0)) {
            return false;
        }
        C6285c0 c6285c0 = (C6285c0) obj;
        if (AbstractC3557B.K(this.f49269a, c6285c0.f49269a) && AbstractC3557B.K(this.f49270b, c6285c0.f49270b) && AbstractC3557B.K(this.f49271c, c6285c0.f49271c) && AbstractC3557B.K(this.f49272d, c6285c0.f49272d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int v10 = E9.f.v(this.f49270b, this.f49269a.hashCode() * 31, 31);
        String str = this.f49271c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f49272d.hashCode() + ((v10 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Os(name=");
        sb2.append(this.f49269a);
        sb2.append(", version=");
        sb2.append(this.f49270b);
        sb2.append(", build=");
        sb2.append(this.f49271c);
        sb2.append(", versionMajor=");
        return R.a.t(sb2, this.f49272d, Separators.RPAREN);
    }
}
