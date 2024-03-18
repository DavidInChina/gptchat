package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f48940e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f48941a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48942b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48943c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f48944d;

    public E(String str, String str2, String str3, Map map) {
        this.f48941a = str;
        this.f48942b = str2;
        this.f48943c = str3;
        this.f48944d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (AbstractC3557B.K(this.f48941a, e10.f48941a) && AbstractC3557B.K(this.f48942b, e10.f48942b) && AbstractC3557B.K(this.f48943c, e10.f48943c) && AbstractC3557B.K(this.f48944d, e10.f48944d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f48941a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f48942b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f48943c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f48944d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f48941a + ", name=" + this.f48942b + ", email=" + this.f48943c + ", additionalProperties=" + this.f48944d + Separators.RPAREN;
    }
}
