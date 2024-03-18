package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6292e1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49290a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49291b;

    public C6292e1(long j6, long j10) {
        this.f49290a = j6;
        this.f49291b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6292e1)) {
            return false;
        }
        C6292e1 c6292e1 = (C6292e1) obj;
        if (this.f49290a == c6292e1.f49290a && this.f49291b == c6292e1.f49291b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f49290a;
        long j10 = this.f49291b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Redirect(duration=");
        sb2.append(this.f49290a);
        sb2.append(", start=");
        return android.gov.nist.core.a.m(sb2, this.f49291b, Separators.RPAREN);
    }
}
