package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.j1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6307j1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49342a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49343b;

    public C6307j1(long j6, long j10) {
        this.f49342a = j6;
        this.f49343b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6307j1)) {
            return false;
        }
        C6307j1 c6307j1 = (C6307j1) obj;
        if (this.f49342a == c6307j1.f49342a && this.f49343b == c6307j1.f49343b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49342a;
        long j10 = this.f49343b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ssl(duration=");
        sb2.append(this.f49342a);
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49343b, Separators.RPAREN);
    }
}
