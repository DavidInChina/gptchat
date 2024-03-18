package bb;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f25868a;

    /* renamed from: b  reason: collision with root package name */
    public final H0 f25869b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25870c;

    public l0(String str, H0 h02, String str2) {
        AbstractC3557B.c0("query", str);
        AbstractC3557B.c0(ParameterNames.ID, str2);
        this.f25868a = str;
        this.f25869b = h02;
        this.f25870c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (AbstractC3557B.K(this.f25868a, l0Var.f25868a) && AbstractC3557B.K(this.f25869b, l0Var.f25869b) && AbstractC3557B.K(this.f25870c, l0Var.f25870c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f25869b.hashCode();
        return this.f25870c.hashCode() + ((hashCode + (this.f25868a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoStoreSearchResult(query=");
        sb2.append(this.f25868a);
        sb2.append(", category=");
        sb2.append(this.f25869b);
        sb2.append(", id=");
        return R.a.t(sb2, this.f25870c, Separators.RPAREN);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ l0(String str, H0 h02) {
        this(str, h02, r0);
        String uuid = UUID.randomUUID().toString();
        AbstractC3557B.b0("toString(...)", uuid);
    }
}
