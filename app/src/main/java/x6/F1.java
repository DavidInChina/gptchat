package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class F1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f48959a;

    public F1(long j6) {
        this.f48959a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F1) && this.f48959a == ((F1) obj).f48959a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f48959a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("FrozenFrame(count="), this.f48959a, Separators.RPAREN);
    }
}
