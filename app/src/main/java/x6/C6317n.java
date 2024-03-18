package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6317n {

    /* renamed from: a  reason: collision with root package name */
    public final long f49381a;

    public C6317n(long j6) {
        this.f49381a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6317n) && this.f49381a == ((C6317n) obj).f49381a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49381a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Crash(count="), this.f49381a, Separators.RPAREN);
    }
}
