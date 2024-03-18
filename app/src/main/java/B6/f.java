package B6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f1927a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1928b = "configuration";

    public f(c cVar) {
        this.f1927a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3557B.K(this.f1927a, ((f) obj).f1927a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1927a.hashCode();
    }

    public final String toString() {
        return "Telemetry(configuration=" + this.f1927a + Separators.RPAREN;
    }
}
