package m6;

import android.gov.nist.core.Separators;

/* renamed from: m6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4564c {

    /* renamed from: a  reason: collision with root package name */
    public final long f38961a;

    /* renamed from: b  reason: collision with root package name */
    public final long f38962b;

    public C4564c(long j6, long j10) {
        this.f38961a = j6;
        this.f38962b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4564c)) {
            return false;
        }
        C4564c c4564c = (C4564c) obj;
        if (this.f38961a == c4564c.f38961a && this.f38962b == c4564c.f38962b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f38961a;
        long j10 = this.f38962b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Time(timestamp=");
        sb2.append(this.f38961a);
        sb2.append(", nanoTime=");
        return android.gov.nist.core.a.m(sb2, this.f38962b, Separators.RPAREN);
    }

    public /* synthetic */ C4564c() {
        this(System.currentTimeMillis(), System.nanoTime());
    }
}
