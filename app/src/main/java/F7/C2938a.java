package f7;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import z.AbstractC6708l;

/* renamed from: f7.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2938a {

    /* renamed from: a  reason: collision with root package name */
    public final int f29643a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29644b;

    public C2938a(int i10, long j6) {
        if (i10 != 0) {
            this.f29643a = i10;
            this.f29644b = j6;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2938a)) {
            return false;
        }
        C2938a c2938a = (C2938a) obj;
        if (AbstractC6708l.c(this.f29643a, c2938a.f29643a) && this.f29644b == c2938a.f29644b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f29644b;
        return ((AbstractC6708l.f(this.f29643a) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(AbstractC2469q0.w(this.f29643a));
        sb2.append(", nextRequestWaitMillis=");
        return android.gov.nist.core.a.m(sb2, this.f29644b, "}");
    }
}
