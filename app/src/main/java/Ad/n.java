package Ad;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class n implements r {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f824a;

    public n(Intent intent) {
        this.f824a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && AbstractC3557B.K(this.f824a, ((n) obj).f824a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f824a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f824a + Separators.RPAREN;
    }
}
