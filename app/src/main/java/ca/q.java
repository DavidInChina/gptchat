package Ca;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class q {
    public static final p Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2846a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2847b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2848c;

    public q(int i10, String str, String str2, boolean z10) {
        if (7 == (i10 & 7)) {
            this.f2846a = z10;
            this.f2847b = str;
            this.f2848c = str2;
            return;
        }
        R4.b.e2(i10, 7, o.f2845b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f2846a == qVar.f2846a && AbstractC3557B.K(this.f2847b, qVar.f2847b) && AbstractC3557B.K(this.f2848c, qVar.f2848c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f2846a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return this.f2848c.hashCode() + E9.f.v(this.f2847b, i10 * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomInstructionsResponse(enabled=");
        sb2.append(this.f2846a);
        sb2.append(", aboutUserMessage=");
        sb2.append(this.f2847b);
        sb2.append(", aboutModelMessage=");
        return R.a.t(sb2, this.f2848c, Separators.RPAREN);
    }
}
