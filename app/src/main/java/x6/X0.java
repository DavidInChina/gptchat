package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class X0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49145a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49146b;

    public X0(long j6, long j10) {
        this.f49145a = j6;
        this.f49146b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        if (this.f49145a == x02.f49145a && this.f49146b == x02.f49146b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49145a;
        long j10 = this.f49146b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Download(duration=");
        sb2.append(this.f49145a);
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49146b, Separators.RPAREN);
    }
}
