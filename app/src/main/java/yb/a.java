package Yb;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f22209a;

    public a(Intent intent) {
        this.f22209a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && AbstractC3557B.K(this.f22209a, ((a) obj).f22209a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22209a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f22209a + Separators.RPAREN;
    }
}
