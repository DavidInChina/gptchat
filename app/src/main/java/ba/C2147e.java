package ba;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ba.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2147e extends AbstractC2148f {

    /* renamed from: b  reason: collision with root package name */
    public final String f25677b;

    public C2147e(String str) {
        this.f25677b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2147e) && AbstractC3557B.K(this.f25677b, ((C2147e) obj).f25677b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25677b.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("Search(prompt="), this.f25677b, Separators.RPAREN);
    }
}
