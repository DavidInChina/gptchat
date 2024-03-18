package ab;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: ab.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962p implements AbstractC1964r {

    /* renamed from: a  reason: collision with root package name */
    public final String f24119a;

    public C1962p(String str) {
        this.f24119a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1962p) && AbstractC3557B.K(this.f24119a, ((C1962p) obj).f24119a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24119a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("PrivacyPolicy(url="), this.f24119a, Separators.RPAREN);
    }
}
