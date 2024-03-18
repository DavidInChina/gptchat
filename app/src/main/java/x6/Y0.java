package x6;

import android.gov.nist.core.Separators;

/* loaded from: classes2.dex */
public final class Y0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49154a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49155b;

    public Y0(long j6, long j10) {
        this.f49154a = j6;
        this.f49155b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        if (this.f49154a == y02.f49154a && this.f49155b == y02.f49155b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49154a;
        long j10 = this.f49155b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirstByte(duration=");
        sb2.append(this.f49154a);
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49155b, Separators.RPAREN);
    }
}
