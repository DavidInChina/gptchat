package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6346x {

    /* renamed from: a  reason: collision with root package name */
    public final long f49469a;

    public C6346x(long j6) {
        this.f49469a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6346x) && this.f49469a == ((C6346x) obj).f49469a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49469a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("LongTask(count="), this.f49469a, Separators.RPAREN);
    }
}
