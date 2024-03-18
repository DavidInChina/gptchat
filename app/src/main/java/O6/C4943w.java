package o6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import m6.C4564c;

/* renamed from: o6.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4943w extends L4.a {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f40906j;

    /* renamed from: k  reason: collision with root package name */
    public final long f40907k;

    /* renamed from: l  reason: collision with root package name */
    public final C4564c f40908l;

    public C4943w(boolean z10, long j6) {
        C4564c c4564c = new C4564c();
        this.f40906j = z10;
        this.f40907k = j6;
        this.f40908l = c4564c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4943w)) {
            return false;
        }
        C4943w c4943w = (C4943w) obj;
        if (this.f40906j == c4943w.f40906j && this.f40907k == c4943w.f40907k && AbstractC3557B.K(this.f40908l, c4943w.f40908l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f40906j;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        long j6 = this.f40907k;
        return this.f40908l.hashCode() + (((i10 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        return "SdkInit(isAppInForeground=" + this.f40906j + ", appStartTimeNs=" + this.f40907k + ", eventTime=" + this.f40908l + Separators.RPAREN;
    }

    @Override // L4.a
    public final C4564c v0() {
        return this.f40908l;
    }
}
