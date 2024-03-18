package pd;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f43058a;

    public d(Intent intent) {
        this.f43058a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && AbstractC3557B.K(this.f43058a, ((d) obj).f43058a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.f43058a;
        if (intent == null) {
            return 0;
        }
        return intent.hashCode();
    }

    public final String toString() {
        return "InboundDeepLink(intent=" + this.f43058a + Separators.RPAREN;
    }
}
