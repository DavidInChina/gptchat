package W;

import jf.C3970t;

/* loaded from: classes2.dex */
public final class V2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f19745a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19746b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19747c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19748d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19749e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19750f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19751g;

    /* renamed from: h  reason: collision with root package name */
    public final long f19752h;

    /* renamed from: i  reason: collision with root package name */
    public final long f19753i;

    /* renamed from: j  reason: collision with root package name */
    public final long f19754j;

    /* renamed from: k  reason: collision with root package name */
    public final long f19755k;

    /* renamed from: l  reason: collision with root package name */
    public final long f19756l;

    /* renamed from: m  reason: collision with root package name */
    public final long f19757m;

    public V2(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f19745a = j6;
        this.f19746b = j10;
        this.f19747c = j11;
        this.f19748d = j12;
        this.f19749e = j13;
        this.f19750f = j14;
        this.f19751g = j15;
        this.f19752h = j16;
        this.f19753i = j17;
        this.f19754j = j18;
        this.f19755k = j19;
        this.f19756l = j20;
        this.f19757m = j21;
    }

    public final V2 a(long j6, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35 = r0.r.f44263k;
        if (j6 != j35) {
            j22 = j6;
        } else {
            j22 = this.f19745a;
        }
        if (j10 != j35) {
            j23 = j10;
        } else {
            j23 = this.f19746b;
        }
        if (j11 != j35) {
            j24 = j11;
        } else {
            j24 = this.f19747c;
        }
        if (j12 != j35) {
            j25 = j12;
        } else {
            j25 = this.f19748d;
        }
        if (j13 != j35) {
            j26 = j13;
        } else {
            j26 = this.f19749e;
        }
        if (j14 != j35) {
            j27 = j14;
        } else {
            j27 = this.f19750f;
        }
        if (j15 != j35) {
            j28 = j15;
        } else {
            j28 = this.f19751g;
        }
        if (j16 != j35) {
            j29 = j16;
        } else {
            j29 = this.f19752h;
        }
        if (j17 != j35) {
            j30 = j17;
        } else {
            j30 = this.f19753i;
        }
        if (j18 != j35) {
            j31 = j18;
        } else {
            j31 = this.f19754j;
        }
        if (j19 != j35) {
            j32 = j19;
        } else {
            j32 = this.f19755k;
        }
        if (j20 != j35) {
            j33 = j20;
        } else {
            j33 = this.f19756l;
        }
        if (j21 != j35) {
            j34 = j21;
        } else {
            j34 = this.f19757m;
        }
        return new V2(j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof V2)) {
            return false;
        }
        V2 v22 = (V2) obj;
        if (r0.r.c(this.f19745a, v22.f19745a) && r0.r.c(this.f19746b, v22.f19746b) && r0.r.c(this.f19747c, v22.f19747c) && r0.r.c(this.f19748d, v22.f19748d) && r0.r.c(this.f19749e, v22.f19749e) && r0.r.c(this.f19750f, v22.f19750f) && r0.r.c(this.f19751g, v22.f19751g) && r0.r.c(this.f19752h, v22.f19752h) && r0.r.c(this.f19753i, v22.f19753i) && r0.r.c(this.f19754j, v22.f19754j) && r0.r.c(this.f19755k, v22.f19755k) && r0.r.c(this.f19756l, v22.f19756l) && r0.r.c(this.f19757m, v22.f19757m)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f19757m) + R.a.n(this.f19756l, R.a.n(this.f19755k, R.a.n(this.f19754j, R.a.n(this.f19753i, R.a.n(this.f19752h, R.a.n(this.f19751g, R.a.n(this.f19750f, R.a.n(this.f19749e, R.a.n(this.f19748d, R.a.n(this.f19747c, R.a.n(this.f19746b, C3970t.a(this.f19745a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
