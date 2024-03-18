package H9;

import android.gov.nist.core.Separators;
import ca.C2311c;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public final C2311c f7519a;

    public j(C2311c c2311c) {
        AbstractC3557B.c0("conversation", c2311c);
        this.f7519a = c2311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && AbstractC3557B.K(this.f7519a, ((j) obj).f7519a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7519a.hashCode();
    }

    public final String toString() {
        return "UnarchiveConversation(conversation=" + this.f7519a + Separators.RPAREN;
    }
}
