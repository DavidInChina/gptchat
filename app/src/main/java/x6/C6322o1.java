package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.o1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6322o1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49409a;

    public C6322o1(long j6) {
        this.f49409a = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6322o1) && this.f49409a == ((C6322o1) obj).f49409a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49409a;
        return (int) (j6 ^ (j6 >>> 32));
    }

    public final String toString() {
        return android.gov.nist.core.a.m(new StringBuilder("Action(count="), this.f49409a, Separators.RPAREN);
    }
}
