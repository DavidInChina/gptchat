package G5;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final long f6055a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6056b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6057c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6058d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6059e;

    /* renamed from: f  reason: collision with root package name */
    public final long f6060f;

    /* renamed from: g  reason: collision with root package name */
    public final long f6061g;

    public e(long j6, long j10, long j11, int i10, long j12, long j13, long j14) {
        this.f6055a = j6;
        this.f6056b = j10;
        this.f6057c = j11;
        this.f6058d = i10;
        this.f6059e = j12;
        this.f6060f = j13;
        this.f6061g = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f6055a == eVar.f6055a && this.f6056b == eVar.f6056b && this.f6057c == eVar.f6057c && this.f6058d == eVar.f6058d && this.f6059e == eVar.f6059e && this.f6060f == eVar.f6060f && this.f6061g == eVar.f6061g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f6055a;
        long j10 = this.f6056b;
        long j11 = this.f6057c;
        long j12 = this.f6059e;
        long j13 = this.f6060f;
        long j14 = this.f6061g;
        return (((((((((((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f6058d) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilePersistenceConfig(recentDelayMs=");
        sb2.append(this.f6055a);
        sb2.append(", maxBatchSize=");
        sb2.append(this.f6056b);
        sb2.append(", maxItemSize=");
        sb2.append(this.f6057c);
        sb2.append(", maxItemsPerBatch=");
        sb2.append(this.f6058d);
        sb2.append(", oldFileThreshold=");
        sb2.append(this.f6059e);
        sb2.append(", maxDiskSpace=");
        sb2.append(this.f6060f);
        sb2.append(", cleanupFrequencyThreshold=");
        return android.gov.nist.core.a.m(sb2, this.f6061g, Separators.RPAREN);
    }
}
