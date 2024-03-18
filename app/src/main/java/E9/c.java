package E9;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f4550a;

    /* renamed from: b  reason: collision with root package name */
    public final Yg.p f4551b;

    public c(int i10, String str, Yg.p pVar) {
        if (3 == (i10 & 3)) {
            this.f4550a = str;
            this.f4551b = pVar;
            return;
        }
        R4.b.e2(i10, 3, a.f4549b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3557B.K(this.f4550a, cVar.f4550a) && AbstractC3557B.K(this.f4551b, cVar.f4551b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f4550a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return this.f4551b.f22419Y.hashCode() + (i10 * 31);
    }

    public final String toString() {
        return "AcceptTermsOfUseResponse(id=" + this.f4550a + ", termsOfUseAcceptedAt=" + this.f4551b + Separators.RPAREN;
    }
}
