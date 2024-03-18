package x6;

import android.gov.nist.core.Separators;

/* renamed from: x6.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6277A {

    /* renamed from: a  reason: collision with root package name */
    public final long f48907a;

    /* renamed from: b  reason: collision with root package name */
    public final long f48908b;

    public C6277A(long j6, long j10) {
        this.f48907a = j6;
        this.f48908b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6277A)) {
            return false;
        }
        C6277A c6277a = (C6277A) obj;
        if (this.f48907a == c6277a.f48907a && this.f48908b == c6277a.f48908b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f48907a;
        long j10 = this.f48908b;
        return (((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Position(x=");
        sb2.append(this.f48907a);
        sb2.append(", y=");
        return android.gov.nist.core.a.m(sb2, this.f48908b, Separators.RPAREN);
    }
}
