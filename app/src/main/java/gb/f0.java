package gb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class f0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f31428a;

    public f0(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f31428a = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f0) && AbstractC3557B.K(this.f31428a, ((f0) obj).f31428a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31428a.hashCode();
    }

    public final String toString() {
        return "SelectText(message=" + this.f31428a + Separators.RPAREN;
    }
}
