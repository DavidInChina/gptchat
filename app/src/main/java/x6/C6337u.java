package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6337u {

    /* renamed from: a  reason: collision with root package name */
    public final long f49444a;

    public C6337u(long j6) {
        this.f49444a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6337u) && this.f49444a == ((C6337u) obj).f49444a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49444a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Error(count="), this.f49444a, Separators.RPAREN);
    }
}
