package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f48954e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f48955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48956b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48957c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f48958d;

    public F0(String str, String str2, String str3, Map map) {
        this.f48955a = str;
        this.f48956b = str2;
        this.f48957c = str3;
        this.f48958d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        if (AbstractC3557B.K(this.f48955a, f02.f48955a) && AbstractC3557B.K(this.f48956b, f02.f48956b) && AbstractC3557B.K(this.f48957c, f02.f48957c) && AbstractC3557B.K(this.f48958d, f02.f48958d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f48955a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f48956b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f48957c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f48958d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f48955a + ", name=" + this.f48956b + ", email=" + this.f48957c + ", additionalProperties=" + this.f48958d + Separators.RPAREN;
    }
}
