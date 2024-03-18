package na;

import android.content.Intent;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: na.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4783q implements AbstractC4791t {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f40091a;

    public C4783q(Intent intent) {
        AbstractC3557B.c0("intent", intent);
        this.f40091a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4783q) && AbstractC3557B.K(this.f40091a, ((C4783q) obj).f40091a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40091a.hashCode();
    }

    public final String toString() {
        return "LaunchIntent(intent=" + this.f40091a + Separators.RPAREN;
    }
}
