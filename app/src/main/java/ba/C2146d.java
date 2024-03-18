package ba;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ba.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146d extends AbstractC2148f {

    /* renamed from: b  reason: collision with root package name */
    public final String f25676b;

    public C2146d(String str) {
        this.f25676b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2146d) && AbstractC3557B.K(this.f25676b, ((C2146d) obj).f25676b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25676b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Quote(url="), this.f25676b, Separators.RPAREN);
    }
}
