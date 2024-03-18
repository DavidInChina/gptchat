package sb;

import android.gov.nist.core.Separators;
import fa.C2969F;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C2969F f45523a;

    public s(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        this.f45523a = c2969f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && AbstractC3557B.K(this.f45523a, ((s) obj).f45523a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45523a.hashCode();
    }

    public final String toString() {
        return "ThumbsDown(message=" + this.f45523a + Separators.RPAREN;
    }
}
