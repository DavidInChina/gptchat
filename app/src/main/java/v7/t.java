package v7;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import t7.C5682d;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final C5983a f47341a;

    /* renamed from: b  reason: collision with root package name */
    public final C5682d f47342b;

    public /* synthetic */ t(C5983a c5983a, C5682d c5682d) {
        this.f47341a = c5983a;
        this.f47342b = c5682d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof t)) {
            t tVar = (t) obj;
            if (M3.H.P(this.f47341a, tVar.f47341a) && M3.H.P(this.f47342b, tVar.f47342b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47341a, this.f47342b});
    }

    public final String toString() {
        U3.l lVar = new U3.l(this);
        lVar.e(SubscriberAttributeKt.JSON_NAME_KEY, this.f47341a);
        lVar.e("feature", this.f47342b);
        return lVar.toString();
    }
}
