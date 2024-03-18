package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class P1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49064a;

    public P1(long j6) {
        this.f49064a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof P1) && this.f49064a == ((P1) obj).f49064a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49064a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Resource(count="), this.f49064a, Separators.RPAREN);
    }
}
