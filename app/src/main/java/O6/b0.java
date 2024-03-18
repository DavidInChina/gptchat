package o6;

import android.gov.nist.core.Separators;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f40807a;

    /* renamed from: b  reason: collision with root package name */
    public final long f40808b;

    public b0(long j6, long j10) {
        this.f40807a = j6;
        this.f40808b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f40807a == b0Var.f40807a && this.f40808b == b0Var.f40808b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f40807a;
        long j10 = this.f40808b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Timing(startTime=");
        sb2.append(this.f40807a);
        sb2.append(", duration=");
        return android.gov.nist.core.a.m(sb2, this.f40808b, Separators.RPAREN);
    }
}
