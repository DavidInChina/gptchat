package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.x1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6348x1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49471a;

    public C6348x1(long j6) {
        this.f49471a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6348x1) && this.f49471a == ((C6348x1) obj).f49471a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49471a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Crash(count="), this.f49471a, Separators.RPAREN);
    }
}
