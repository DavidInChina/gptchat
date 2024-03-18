package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a  reason: collision with root package name */
    public final Q0 f49062a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49063b;

    public P0(Q0 q02, int i10) {
        AbstractC2469q0.q("source", i10);
        this.f49062a = q02;
        this.f49063b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        if (AbstractC3557B.K(this.f49062a, p02.f49062a) && this.f49063b == p02.f49063b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f49063b) + (this.f49062a.f49066a.hashCode() * 31);
    }

    public final String toString() {
        return "Container(view=" + this.f49062a + ", source=" + AbstractC6301h1.k(this.f49063b) + Separators.RPAREN;
    }
}
