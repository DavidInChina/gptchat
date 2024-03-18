package n6;

import android.gov.nist.core.Separators;

/* renamed from: n6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4717a {

    /* renamed from: a  reason: collision with root package name */
    public final long f39619a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39620b;

    /* renamed from: c  reason: collision with root package name */
    public final long f39621c;

    /* renamed from: d  reason: collision with root package name */
    public final long f39622d;

    /* renamed from: e  reason: collision with root package name */
    public final long f39623e;

    /* renamed from: f  reason: collision with root package name */
    public final long f39624f;

    /* renamed from: g  reason: collision with root package name */
    public final long f39625g;

    /* renamed from: h  reason: collision with root package name */
    public final long f39626h;

    /* renamed from: i  reason: collision with root package name */
    public final long f39627i;

    /* renamed from: j  reason: collision with root package name */
    public final long f39628j;

    public C4717a(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.f39619a = j6;
        this.f39620b = j10;
        this.f39621c = j11;
        this.f39622d = j12;
        this.f39623e = j13;
        this.f39624f = j14;
        this.f39625g = j15;
        this.f39626h = j16;
        this.f39627i = j17;
        this.f39628j = j18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4717a)) {
            return false;
        }
        C4717a c4717a = (C4717a) obj;
        if (this.f39619a == c4717a.f39619a && this.f39620b == c4717a.f39620b && this.f39621c == c4717a.f39621c && this.f39622d == c4717a.f39622d && this.f39623e == c4717a.f39623e && this.f39624f == c4717a.f39624f && this.f39625g == c4717a.f39625g && this.f39626h == c4717a.f39626h && this.f39627i == c4717a.f39627i && this.f39628j == c4717a.f39628j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f39619a;
        long j10 = this.f39620b;
        long j11 = this.f39621c;
        long j12 = this.f39622d;
        long j13 = this.f39623e;
        long j14 = this.f39624f;
        long j15 = this.f39625g;
        long j16 = this.f39626h;
        long j17 = this.f39627i;
        long j18 = this.f39628j;
        return (((((((((((((((((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + ((int) ((j18 >>> 32) ^ j18));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceTiming(dnsStart=");
        sb2.append(this.f39619a);
        sb2.append(", dnsDuration=");
        sb2.append(this.f39620b);
        sb2.append(", connectStart=");
        sb2.append(this.f39621c);
        sb2.append(", connectDuration=");
        sb2.append(this.f39622d);
        sb2.append(", sslStart=");
        sb2.append(this.f39623e);
        sb2.append(", sslDuration=");
        sb2.append(this.f39624f);
        sb2.append(", firstByteStart=");
        sb2.append(this.f39625g);
        sb2.append(", firstByteDuration=");
        sb2.append(this.f39626h);
        sb2.append(", downloadStart=");
        sb2.append(this.f39627i);
        sb2.append(", downloadDuration=");
        return android.gov.nist.core.a.m(sb2, this.f39628j, Separators.RPAREN);
    }
}
