package dc;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: dc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2623d implements AbstractC2624e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28202a;

    public C2623d(boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, null);
        this.f28202a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2623d)) {
            return false;
        }
        C2623d c2623d = (C2623d) obj;
        c2623d.getClass();
        if (AbstractC3557B.K(null, null) && this.f28202a == c2623d.f28202a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("Set(key=null, enabled="), this.f28202a, Separators.RPAREN);
    }
}
