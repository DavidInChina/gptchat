package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class N1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49048a;

    public N1(int i10) {
        AbstractC2469q0.q("replayLevel", i10);
        this.f49048a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof N1) && this.f49048a == ((N1) obj).f49048a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC6708l.f(this.f49048a);
    }

    public final String toString() {
        return "Privacy(replayLevel=" + AbstractC6301h1.r(this.f49048a) + Separators.RPAREN;
    }
}
