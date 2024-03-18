package L9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class F implements AbstractC0905k {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f10877a;

    public F(Throwable th2) {
        AbstractC3557B.c0(ParameterNames.CAUSE, th2);
        this.f10877a = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F) && AbstractC3557B.K(this.f10877a, ((F) obj).f10877a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10877a.hashCode();
    }

    public final String toString() {
        return "ConversationStreamRequestError(cause=" + this.f10877a + Separators.RPAREN;
    }
}
