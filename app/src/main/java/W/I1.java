package W;

import jf.C3970t;

/* loaded from: classes2.dex */
public final class I1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f19212a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19213b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19214c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19215d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19216e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19217f;

    public I1(long j6, long j10, long j11, long j12, long j13, long j14) {
        this.f19212a = j6;
        this.f19213b = j10;
        this.f19214c = j11;
        this.f19215d = j12;
        this.f19216e = j13;
        this.f19217f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        if (r0.r.c(this.f19212a, i12.f19212a) && r0.r.c(this.f19213b, i12.f19213b) && r0.r.c(this.f19214c, i12.f19214c) && r0.r.c(this.f19215d, i12.f19215d) && r0.r.c(this.f19216e, i12.f19216e) && r0.r.c(this.f19217f, i12.f19217f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f19217f) + R.a.n(this.f19216e, R.a.n(this.f19215d, R.a.n(this.f19214c, R.a.n(this.f19213b, C3970t.a(this.f19212a) * 31, 31), 31), 31), 31);
    }
}
