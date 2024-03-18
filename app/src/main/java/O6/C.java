package o6;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;
import m6.C4564c;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class C extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final N f40620j;

    /* renamed from: k  reason: collision with root package name */
    public final Map f40621k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40622l;

    public C(N n10, Map map, C4564c c4564c) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, n10);
        AbstractC3557B.c0("attributes", map);
        AbstractC3557B.c0("eventTime", c4564c);
        this.f40620j = n10;
        this.f40621k = map;
        this.f40622l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (AbstractC3557B.K(this.f40620j, c10.f40620j) && AbstractC3557B.K(this.f40621k, c10.f40621k) && AbstractC3557B.K(this.f40622l, c10.f40622l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40622l.hashCode() + AbstractC6463a.f(this.f40621k, this.f40620j.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StartView(key=" + this.f40620j + ", attributes=" + this.f40621k + ", eventTime=" + this.f40622l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40622l;
    }
}
