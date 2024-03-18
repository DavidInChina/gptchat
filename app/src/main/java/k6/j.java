package K6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f9511e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f9512a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9513b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9514c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f9515d;

    public j(String str, String str2, String str3, Map map) {
        this.f9512a = str;
        this.f9513b = str2;
        this.f9514c = str3;
        this.f9515d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3557B.K(this.f9512a, jVar.f9512a) && AbstractC3557B.K(this.f9513b, jVar.f9513b) && AbstractC3557B.K(this.f9514c, jVar.f9514c) && AbstractC3557B.K(this.f9515d, jVar.f9515d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f9512a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f9513b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f9514c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f9515d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f9512a + ", name=" + this.f9513b + ", email=" + this.f9514c + ", additionalProperties=" + this.f9515d + Separators.RPAREN;
    }
}
