package nc;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f40242a;

    public j(Intent intent) {
        this.f40242a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && AbstractC3557B.K(this.f40242a, ((j) obj).f40242a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40242a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f40242a + Separators.RPAREN;
    }
}
