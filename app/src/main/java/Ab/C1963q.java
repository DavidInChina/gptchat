package ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ab.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1963q implements AbstractC1964r {

    /* renamed from: a  reason: collision with root package name */
    public final String f24120a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24121b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24122c;

    /* renamed from: d  reason: collision with root package name */
    public final Wa.n f24123d;

    public C1963q(String str, String str2, String str3, Wa.n nVar) {
        AbstractC3557B.c0("actionId", str);
        AbstractC3557B.c0("operationKey", str3);
        this.f24120a = str;
        this.f24121b = str2;
        this.f24122c = str3;
        this.f24123d = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1963q)) {
            return false;
        }
        C1963q c1963q = (C1963q) obj;
        if (AbstractC3557B.K(this.f24120a, c1963q.f24120a) && AbstractC3557B.K(this.f24121b, c1963q.f24121b) && AbstractC3557B.K(this.f24122c, c1963q.f24122c) && this.f24123d == c1963q.f24123d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f24120a.hashCode() * 31;
        String str = this.f24121b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f24123d.hashCode() + E9.f.v(this.f24122c, (hashCode + i10) * 31, 31);
    }

    public final String toString() {
        return "UpdateOperation(actionId=" + this.f24120a + ", domain=" + this.f24121b + ", operationKey=" + this.f24122c + ", operationStatus=" + this.f24123d + Separators.RPAREN;
    }
}
