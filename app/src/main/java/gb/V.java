package gb;

import aa.C1939b;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class V implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1939b f31377a;

    public V(C1939b c1939b) {
        AbstractC3557B.c0("data", c1939b);
        this.f31377a = c1939b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof V) && AbstractC3557B.K(this.f31377a, ((V) obj).f31377a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31377a.hashCode();
    }

    public final String toString() {
        return "CustomActionPrivacyPolicy(data=" + this.f31377a + Separators.RPAREN;
    }
}
