package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final long f48914a;

    public B(long j6) {
        this.f48914a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B) && this.f48914a == ((B) obj).f48914a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f48914a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Resource(count="), this.f48914a, Separators.RPAREN);
    }
}
