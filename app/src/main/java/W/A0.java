package W;

import jf.C3970t;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f18966a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18967b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18968c;

    /* renamed from: d  reason: collision with root package name */
    public final long f18969d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18970e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18971f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18972g;

    /* renamed from: h  reason: collision with root package name */
    public final long f18973h;

    public A0(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f18966a = j6;
        this.f18967b = j10;
        this.f18968c = j11;
        this.f18969d = j12;
        this.f18970e = j13;
        this.f18971f = j14;
        this.f18972g = j15;
        this.f18973h = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        if (r0.r.c(this.f18966a, a02.f18966a) && r0.r.c(this.f18967b, a02.f18967b) && r0.r.c(this.f18968c, a02.f18968c) && r0.r.c(this.f18969d, a02.f18969d) && r0.r.c(this.f18970e, a02.f18970e) && r0.r.c(this.f18971f, a02.f18971f) && r0.r.c(this.f18972g, a02.f18972g) && r0.r.c(this.f18973h, a02.f18973h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f18973h) + R.a.n(this.f18972g, R.a.n(this.f18971f, R.a.n(this.f18970e, R.a.n(this.f18969d, R.a.n(this.f18968c, R.a.n(this.f18967b, C3970t.a(this.f18966a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
