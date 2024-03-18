package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f49036a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49037b;

    public L1(int i10, long j6) {
        AbstractC2469q0.q("state", i10);
        this.f49036a = i10;
        this.f49037b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L1)) {
            return false;
        }
        L1 l12 = (L1) obj;
        if (this.f49036a == l12.f49036a && this.f49037b == l12.f49037b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49037b;
        return (AbstractC6708l.f(this.f49036a) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageState(state=");
        sb2.append(AbstractC6301h1.s(this.f49036a));
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49037b, Separators.RPAREN);
    }
}
