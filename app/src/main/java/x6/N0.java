package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49046a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49047b;

    public N0(long j6, long j10) {
        this.f49046a = j6;
        this.f49047b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        if (this.f49046a == n02.f49046a && this.f49047b == n02.f49047b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49046a;
        long j10 = this.f49047b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connect(duration=");
        sb2.append(this.f49046a);
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49047b, Separators.RPAREN);
    }
}
