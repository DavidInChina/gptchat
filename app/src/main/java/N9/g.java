package n9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import ca.C2311c;
import id.AbstractC3557B;
import wd.C6168C;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f39674a;

    /* renamed from: b  reason: collision with root package name */
    public final C2311c f39675b;

    public g(String str, C2311c c2311c) {
        AbstractC3557B.c0(ParameterNames.ID, str);
        AbstractC3557B.c0("conversation", c2311c);
        this.f39674a = str;
        this.f39675b = c2311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3557B.K(this.f39674a, gVar.f39674a) && AbstractC3557B.K(this.f39675b, gVar.f39675b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39675b.hashCode() + (this.f39674a.hashCode() * 31);
    }

    public final String toString() {
        String a5 = C6168C.a(this.f39674a);
        return "DBConversation(id=" + a5 + ", conversation=" + this.f39675b + Separators.RPAREN;
    }
}
