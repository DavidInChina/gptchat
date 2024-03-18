package W;

import jf.C3970t;

/* renamed from: W.n1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1588n1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f20239a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20240b;

    /* renamed from: c  reason: collision with root package name */
    public final long f20241c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20242d;

    public C1588n1(long j6, long j10, long j11, long j12) {
        this.f20239a = j6;
        this.f20240b = j10;
        this.f20241c = j11;
        this.f20242d = j12;
    }

    public final C1588n1 a(long j6, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17 = r0.r.f44263k;
        if (j6 != j17) {
            j13 = j6;
        } else {
            j13 = this.f20239a;
        }
        if (j10 != j17) {
            j14 = j10;
        } else {
            j14 = this.f20240b;
        }
        if (j11 != j17) {
            j15 = j11;
        } else {
            j15 = this.f20241c;
        }
        if (j12 != j17) {
            j16 = j12;
        } else {
            j16 = this.f20242d;
        }
        return new C1588n1(j13, j14, j15, j16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1588n1)) {
            return false;
        }
        C1588n1 c1588n1 = (C1588n1) obj;
        if (r0.r.c(this.f20239a, c1588n1.f20239a) && r0.r.c(this.f20240b, c1588n1.f20240b) && r0.r.c(this.f20241c, c1588n1.f20241c) && r0.r.c(this.f20242d, c1588n1.f20242d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r0.r.f44264l;
        return C3970t.a(this.f20242d) + R.a.n(this.f20241c, R.a.n(this.f20240b, C3970t.a(this.f20239a) * 31, 31), 31);
    }
}
