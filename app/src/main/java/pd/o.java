package pd;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class o extends s {

    /* renamed from: a  reason: collision with root package name */
    public final String f43066a;

    public o(String str) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        this.f43066a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && AbstractC3557B.K(this.f43066a, ((o) obj).f43066a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43066a.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("LoggedIn(key="), this.f43066a, Separators.RPAREN);
    }
}
