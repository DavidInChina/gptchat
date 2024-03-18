package Na;

import Z8.AbstractC1805k0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1805k0 f12762a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f12763b = new LinkedHashMap();

    public a(AbstractC1805k0 abstractC1805k0) {
        this.f12762a = abstractC1805k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && AbstractC3557B.K(this.f12762a, ((a) obj).f12762a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12762a.hashCode();
    }

    public final String toString() {
        return "CompletionLatencyTracker(analyticsService=" + this.f12762a + Separators.RPAREN;
    }
}
