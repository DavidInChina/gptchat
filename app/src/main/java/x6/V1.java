package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes.dex */
public final class V1 {

    /* renamed from: e  reason: collision with root package name */
    public static final R1 f49115e = new R1(2, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f49116f = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f49117a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49118b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49119c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f49120d;

    public V1(String str, String str2, String str3, Map map) {
        this.f49117a = str;
        this.f49118b = str2;
        this.f49119c = str3;
        this.f49120d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V1)) {
            return false;
        }
        V1 v12 = (V1) obj;
        if (AbstractC3557B.K(this.f49117a, v12.f49117a) && AbstractC3557B.K(this.f49118b, v12.f49118b) && AbstractC3557B.K(this.f49119c, v12.f49119c) && AbstractC3557B.K(this.f49120d, v12.f49120d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f49117a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f49118b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f49119c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f49120d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "Usr(id=" + this.f49117a + ", name=" + this.f49118b + ", email=" + this.f49119c + ", additionalProperties=" + this.f49120d + Separators.RPAREN;
    }
}
