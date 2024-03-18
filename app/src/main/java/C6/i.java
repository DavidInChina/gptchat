package c6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f26310e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f26311a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26312b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26313c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f26314d;

    public i(String str, String str2, String str3, Map map) {
        this.f26311a = str;
        this.f26312b = str2;
        this.f26313c = str3;
        this.f26314d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3557B.K(this.f26311a, iVar.f26311a) && AbstractC3557B.K(this.f26312b, iVar.f26312b) && AbstractC3557B.K(this.f26313c, iVar.f26313c) && AbstractC3557B.K(this.f26314d, iVar.f26314d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f26311a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f26312b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f26313c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f26314d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f26311a + ", name=" + this.f26312b + ", email=" + this.f26313c + ", additionalProperties=" + this.f26314d + Separators.RPAREN;
    }
}
