package nc;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f40259a;

    public t(Intent intent) {
        this.f40259a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && AbstractC3557B.K(this.f40259a, ((t) obj).f40259a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40259a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f40259a + Separators.RPAREN;
    }
}
