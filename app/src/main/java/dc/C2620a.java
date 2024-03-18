package dc;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import k6.AbstractC4194d;

/* renamed from: dc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2620a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28200a;

    public C2620a(boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, null);
        this.f28200a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2620a)) {
            return false;
        }
        C2620a c2620a = (C2620a) obj;
        c2620a.getClass();
        if (AbstractC3557B.K(null, null) && this.f28200a == c2620a.f28200a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return AbstractC4194d.w(new StringBuilder("BetaFeatureSetting(key=null, enabled="), this.f28200a, Separators.RPAREN);
    }
}
