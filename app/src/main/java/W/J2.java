package W;

import jf.C3970t;

/* loaded from: classes2.dex */
public final class J2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f19256a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19257b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19258c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19259d;

    public J2(long j6, long j10, long j11, long j12) {
        this.f19256a = j6;
        this.f19257b = j10;
        this.f19258c = j11;
        this.f19259d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J2)) {
            return false;
        }
        J2 j22 = (J2) obj;
        if (r0.r.c(this.f19256a, j22.f19256a) && r0.r.c(this.f19257b, j22.f19257b) && r0.r.c(this.f19258c, j22.f19258c) && r0.r.c(this.f19259d, j22.f19259d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f19259d) + R.a.n(this.f19258c, R.a.n(this.f19257b, C3970t.a(this.f19256a) * 31, 31), 31);
    }
}
