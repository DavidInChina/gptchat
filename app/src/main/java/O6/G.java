package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.Map;
import m6.C4564c;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class G extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final N f40640j;

    /* renamed from: k  reason: collision with root package name */
    public final Map f40641k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40642l;

    public G(N n10, Map map, C4564c c4564c) {
        this.f40640j = n10;
        this.f40641k = map;
        this.f40642l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (AbstractC3557B.K(this.f40640j, g10.f40640j) && AbstractC3557B.K(this.f40641k, g10.f40641k) && AbstractC3557B.K(this.f40642l, g10.f40642l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40642l.hashCode() + AbstractC6463a.f(this.f40641k, this.f40640j.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StopView(key=" + this.f40640j + ", attributes=" + this.f40641k + ", eventTime=" + this.f40642l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40642l;
    }
}
