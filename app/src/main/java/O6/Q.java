package o6;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Map;
import k6.AbstractC4194d;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final N f40706a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f40707b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f40708c;

    public Q(N n10, Map map, boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, n10);
        AbstractC3557B.c0("attributes", map);
        this.f40706a = n10;
        this.f40707b = map;
        this.f40708c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        if (AbstractC3557B.K(this.f40706a, q10.f40706a) && AbstractC3557B.K(this.f40707b, q10.f40707b) && this.f40708c == q10.f40708c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int f6 = AbstractC6463a.f(this.f40707b, this.f40706a.hashCode() * 31, 31);
        boolean z10 = this.f40708c;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return f6 + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RumViewInfo(key=");
        sb2.append(this.f40706a);
        sb2.append(", attributes=");
        sb2.append(this.f40707b);
        sb2.append(", isActive=");
        return AbstractC4194d.w(sb2, this.f40708c, Separators.RPAREN);
    }
}
