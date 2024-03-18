package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4935n extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final C4564c f40889j;

    /* renamed from: k  reason: collision with root package name */
    public final long f40890k;

    public C4935n(C4564c c4564c, long j6) {
        this.f40889j = c4564c;
        this.f40890k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4935n)) {
            return false;
        }
        C4935n c4935n = (C4935n) obj;
        if (AbstractC3557B.K(this.f40889j, c4935n.f40889j) && this.f40890k == c4935n.f40890k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f40890k;
        return (this.f40889j.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "ApplicationStarted(eventTime=" + this.f40889j + ", applicationStartupNanos=" + this.f40890k + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40889j;
    }
}
