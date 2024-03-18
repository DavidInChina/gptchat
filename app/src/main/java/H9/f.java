package H9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f7515a;

    public f(C2311c c2311c) {
        AbstractC3557B.c0("conversation", c2311c);
        this.f7515a = c2311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f7515a, ((f) obj).f7515a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7515a.hashCode();
    }

    public final String toString() {
        return "DeleteConversation(conversation=" + this.f7515a + Separators.RPAREN;
    }
}
