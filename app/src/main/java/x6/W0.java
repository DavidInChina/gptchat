package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class W0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49122a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49123b;

    public W0(long j6, long j10) {
        this.f49122a = j6;
        this.f49123b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        if (this.f49122a == w02.f49122a && this.f49123b == w02.f49123b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49122a;
        long j10 = this.f49123b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dns(duration=");
        sb2.append(this.f49122a);
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49123b, Separators.RPAREN);
    }
}
