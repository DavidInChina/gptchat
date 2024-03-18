package q5;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final long f43932a;

    /* renamed from: b  reason: collision with root package name */
    public final long f43933b;

    /* renamed from: c  reason: collision with root package name */
    public final long f43934c;

    /* renamed from: d  reason: collision with root package name */
    public final long f43935d;

    public f(long j6, long j10, long j11, long j12) {
        this.f43932a = j6;
        this.f43933b = j10;
        this.f43934c = j11;
        this.f43935d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f43932a == fVar.f43932a && this.f43933b == fVar.f43933b && this.f43934c == fVar.f43934c && this.f43935d == fVar.f43935d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f43932a;
        long j10 = this.f43933b;
        long j11 = this.f43934c;
        long j12 = this.f43935d;
        return (((((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeInfo(deviceTimeNs=");
        sb2.append(this.f43932a);
        sb2.append(", serverTimeNs=");
        sb2.append(this.f43933b);
        sb2.append(", serverTimeOffsetNs=");
        sb2.append(this.f43934c);
        sb2.append(", serverTimeOffsetMs=");
        return android.gov.nist.core.a.m(sb2, this.f43935d, Separators.RPAREN);
    }
}
