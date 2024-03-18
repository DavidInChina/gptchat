package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f48981a;

    public G1(long j6) {
        this.f48981a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof G1) && this.f48981a == ((G1) obj).f48981a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f48981a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Frustration(count="), this.f48981a, Separators.RPAREN);
    }
}
