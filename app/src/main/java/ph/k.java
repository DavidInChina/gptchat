package ph;

import android.gov.nist.core.Separators;
import yh.l1;

/* loaded from: classes.dex */
public class k extends g {

    /* renamed from: a  reason: collision with root package name */
    public final String f43208a = "ByteBuddy";

    /* renamed from: b  reason: collision with root package name */
    public final String f43209b = "net.bytebuddy.renamed";

    /* renamed from: c  reason: collision with root package name */
    public final j f43210c;

    public k(j jVar) {
        this.f43210c = jVar;
    }

    @Override // ph.g
    public String a(l1 l1Var) {
        String a5 = this.f43210c.a(l1Var);
        if (a5.startsWith("java.")) {
            String str = this.f43209b;
            if (!str.equals("")) {
                a5 = android.gov.nist.core.a.j(str, Separators.DOT, a5);
            }
        }
        StringBuilder r10 = android.gov.nist.core.a.r(a5, "$");
        r10.append(this.f43208a);
        return r10.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f43208a.equals(kVar.f43208a) && this.f43209b.equals(kVar.f43209b) && this.f43210c.equals(kVar.f43210c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f43210c.hashCode() + E9.f.v(this.f43209b, E9.f.v(this.f43208a, getClass().hashCode() * 31, 31), 31);
    }
}
