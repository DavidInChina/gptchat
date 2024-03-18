package pc;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class V extends X {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f42949a;

    public V(Intent intent) {
        this.f42949a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof V) && AbstractC3557B.K(this.f42949a, ((V) obj).f42949a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42949a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f42949a + Separators.RPAREN;
    }
}
