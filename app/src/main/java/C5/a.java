package C5;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f2682a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2683b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2684c;

    public a(long j6, long j10, boolean z10) {
        this.f2682a = j6;
        this.f2683b = z10;
        this.f2684c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2682a == aVar.f2682a && this.f2683b == aVar.f2683b && this.f2684c == aVar.f2684c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f2682a;
        int i10 = ((int) (j6 ^ (j6 >>> 32))) * 31;
        boolean z10 = this.f2683b;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        long j10 = this.f2684c;
        return ((i10 + i11) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "BatchClosedMetadata(lastTimeWasUsedInMs=" + this.f2682a + ", forcedNew=" + this.f2683b + ", eventsCount=" + this.f2684c + Separators.RPAREN;
    }
}
