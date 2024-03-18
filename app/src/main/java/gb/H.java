package gb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class H implements L {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f31363a;

    public H(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        this.f31363a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H) && AbstractC3557B.K(this.f31363a, ((H) obj).f31363a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31363a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f31363a + Separators.RPAREN;
    }
}
