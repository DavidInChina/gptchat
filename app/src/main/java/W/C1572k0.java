package W;

import jf.C3970t;

/* renamed from: W.k0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1572k0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f20183a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20184b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20185c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20186d;

    public C1572k0(long j6, long j10, long j11, long j12) {
        this.f20183a = j6;
        this.f20184b = j10;
        this.f20185c = j11;
        this.f20186d = j12;
    }

    public final C1572k0 a(long j6, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17 = r0.r.f44263k;
        if (j6 != j17) {
            j13 = j6;
        } else {
            j13 = this.f20183a;
        }
        if (j10 != j17) {
            j14 = j10;
        } else {
            j14 = this.f20184b;
        }
        if (j11 != j17) {
            j15 = j11;
        } else {
            j15 = this.f20185c;
        }
        if (j12 != j17) {
            j16 = j12;
        } else {
            j16 = this.f20186d;
        }
        return new C1572k0(j13, j14, j15, j16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1572k0)) {
            return false;
        }
        C1572k0 c1572k0 = (C1572k0) obj;
        if (r0.r.c(this.f20183a, c1572k0.f20183a) && r0.r.c(this.f20184b, c1572k0.f20184b) && r0.r.c(this.f20185c, c1572k0.f20185c) && r0.r.c(this.f20186d, c1572k0.f20186d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f20186d) + R.a.n(this.f20185c, R.a.n(this.f20184b, C3970t.a(this.f20183a) * 31, 31), 31);
    }
}
