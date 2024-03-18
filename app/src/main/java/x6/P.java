package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final Q f49060a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49061b;

    public P(Q q10, int i10) {
        AbstractC2469q0.q("source", i10);
        this.f49060a = q10;
        this.f49061b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (AbstractC3557B.K(this.f49060a, p10.f49060a) && this.f49061b == p10.f49061b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f49061b) + (this.f49060a.f49065a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f49060a + ", source=" + AbstractC6287d.F(this.f49061b) + Separators.RPAREN;
    }
}
