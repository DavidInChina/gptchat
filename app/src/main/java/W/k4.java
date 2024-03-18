package W;

import jf.C3970t;

/* loaded from: classes2.dex */
public final class k4 {

    /* renamed from: a  reason: collision with root package name */
    public final long f20197a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20198b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20199c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20200d;

    /* renamed from: e  reason: collision with root package name */
    public final long f20201e;

    public k4(long j6, long j10, long j11, long j12, long j13) {
        this.f20197a = j6;
        this.f20198b = j10;
        this.f20199c = j11;
        this.f20200d = j12;
        this.f20201e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        if (r0.r.c(this.f20197a, k4Var.f20197a) && r0.r.c(this.f20198b, k4Var.f20198b) && r0.r.c(this.f20199c, k4Var.f20199c) && r0.r.c(this.f20200d, k4Var.f20200d) && r0.r.c(this.f20201e, k4Var.f20201e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f20201e) + R.a.n(this.f20200d, R.a.n(this.f20199c, R.a.n(this.f20198b, C3970t.a(this.f20197a) * 31, 31), 31), 31);
    }
}
