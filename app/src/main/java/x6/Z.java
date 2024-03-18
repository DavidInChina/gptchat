package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final String f49197a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49198b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49199c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49200d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f49201e;

    public /* synthetic */ Z(String str, String str2, String str3, String str4, int i10) {
        this(str, (i10 & 2) != 0 ? null : str2, str3, str4, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        if (AbstractC3557B.K(this.f49197a, z10.f49197a) && AbstractC3557B.K(this.f49198b, z10.f49198b) && AbstractC3557B.K(this.f49199c, z10.f49199c) && AbstractC3557B.K(this.f49200d, z10.f49200d) && AbstractC3557B.K(this.f49201e, z10.f49201e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f49197a.hashCode() * 31;
        int i12 = 0;
        String str = this.f49198b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int v10 = E9.f.v(this.f49199c, (hashCode + i10) * 31, 31);
        String str2 = this.f49200d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i13 = (v10 + i11) * 31;
        Boolean bool = this.f49201e;
        if (bool != null) {
            i12 = bool.hashCode();
        }
        return i13 + i12;
    }

    public final String toString() {
        return "ErrorEventView(id=" + this.f49197a + ", referrer=" + this.f49198b + ", url=" + this.f49199c + ", name=" + this.f49200d + ", inForeground=" + this.f49201e + Separators.RPAREN;
    }

    public Z(String str, String str2, String str3, String str4, Boolean bool) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("url", str3);
        this.f49197a = str;
        this.f49198b = str2;
        this.f49199c = str3;
        this.f49200d = str4;
        this.f49201e = bool;
    }
}
