package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class r implements AbstractC4791t {

    /* renamed from: a  reason: collision with root package name */
    public final String f40098a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f40099b;

    public r(String str, boolean z10) {
        this.f40098a = str;
        this.f40099b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f40098a, rVar.f40098a) && this.f40099b == rVar.f40099b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f40098a.hashCode() * 31;
        if (this.f40099b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode + i10;
    }

    public final String toString() {
        String F22 = AbstractC3557B.F2(this.f40098a);
        return "NavigateTo(route=" + F22 + ", replace=" + this.f40099b + Separators.RPAREN;
    }
}
