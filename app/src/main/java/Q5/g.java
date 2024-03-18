package q5;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.Map;
import kf.w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f43936e = {ParameterNames.ID, "name", "email"};

    /* renamed from: a  reason: collision with root package name */
    public final String f43937a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43938b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43939c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f43940d;

    public g(String str, String str2, String str3, Map map) {
        AbstractC3557B.c0("additionalProperties", map);
        this.f43937a = str;
        this.f43938b = str2;
        this.f43939c = str3;
        this.f43940d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3557B.K(this.f43937a, gVar.f43937a) && AbstractC3557B.K(this.f43938b, gVar.f43938b) && AbstractC3557B.K(this.f43939c, gVar.f43939c) && AbstractC3557B.K(this.f43940d, gVar.f43940d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f43937a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i13 = i10 * 31;
        String str2 = this.f43938b;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f43939c;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return this.f43940d.hashCode() + ((i14 + i12) * 31);
    }

    public final String toString() {
        return "UserInfo(id=" + this.f43937a + ", name=" + this.f43938b + ", email=" + this.f43939c + ", additionalProperties=" + this.f43940d + Separators.RPAREN;
    }

    public /* synthetic */ g() {
        this(null, null, null, w.f37484Y);
    }
}
