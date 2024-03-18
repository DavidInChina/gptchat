package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49003a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49004b;

    public H1(long j6, long j10) {
        this.f49003a = j6;
        this.f49004b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        if (this.f49003a == h12.f49003a && this.f49004b == h12.f49004b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49003a;
        long j10 = this.f49004b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InForegroundPeriod(start=");
        sb2.append(this.f49003a);
        sb2.append(", duration=");
        return android.gov.nist.core.a.m(sb2, this.f49004b, Separators.RPAREN);
    }
}
