package bb;

import android.gov.nist.core.Separators;
import cb.C2372m;
import cb.C2373n;
import id.AbstractC3557B;

/* renamed from: bb.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2172l implements AbstractC2174n {

    /* renamed from: a  reason: collision with root package name */
    public final C2373n f25867a;

    static {
        C2372m c2372m = C2373n.Companion;
    }

    public C2172l(C2373n c2373n) {
        AbstractC3557B.c0("social", c2373n);
        this.f25867a = c2373n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2172l) && AbstractC3557B.K(this.f25867a, ((C2172l) obj).f25867a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25867a.hashCode();
    }

    public final String toString() {
        return "OpenSocialLink(social=" + this.f25867a + Separators.RPAREN;
    }
}
