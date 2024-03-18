package Ca;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class G {
    public static final F Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f2816a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2817b;

    public G(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, E.f2815b);
            throw null;
        }
        this.f2816a = str;
        this.f2817b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (AbstractC3557B.K(this.f2816a, g10.f2816a) && AbstractC3557B.K(this.f2817b, g10.f2817b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2817b.hashCode() + (this.f2816a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomInstructionsUpdateRequest(aboutUserMessage=");
        sb2.append(this.f2816a);
        sb2.append(", aboutModelMessage=");
        return R.a.t(sb2, this.f2817b, Separators.RPAREN);
    }

    public G(String str, String str2) {
        this.f2816a = str;
        this.f2817b = str2;
    }
}
