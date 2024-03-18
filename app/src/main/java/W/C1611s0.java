package W;

import jf.C3970t;

/* renamed from: W.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1611s0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f20398a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20399b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20400c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20401d;

    public C1611s0(long j6, long j10, long j11, long j12) {
        this.f20398a = j6;
        this.f20399b = j10;
        this.f20400c = j11;
        this.f20401d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1611s0)) {
            return false;
        }
        C1611s0 c1611s0 = (C1611s0) obj;
        if (r0.r.c(this.f20398a, c1611s0.f20398a) && r0.r.c(this.f20399b, c1611s0.f20399b) && r0.r.c(this.f20400c, c1611s0.f20400c) && r0.r.c(this.f20401d, c1611s0.f20401d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f20401d) + R.a.n(this.f20400c, R.a.n(this.f20399b, C3970t.a(this.f20398a) * 31, 31), 31);
    }
}
