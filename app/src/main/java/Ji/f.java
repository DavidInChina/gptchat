package Ji;

import K4.J;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public long f9297Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f9298Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f9299h0;

    public f(long j6, long j10, long j11) {
        this.f9297Y = j6;
        this.f9298Z = j10;
        this.f9299h0 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6 = this.f9297Y;
        if (j6 != 0) {
            r.f9309a.freeMemory(j6);
            this.f9297Y = 0L;
            J.p(this.f9298Z * this.f9299h0);
        }
    }
}
