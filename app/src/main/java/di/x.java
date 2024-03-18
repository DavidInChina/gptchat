package di;

import id.AbstractC3557B;
import ji.AbstractC4120I;
import ji.C4124M;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class x implements AbstractC4120I {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f28668Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4135j f28669Z = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public boolean f28670h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2724A f28671i0;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ji.j] */
    public x(C2724A c2724a, boolean z10) {
        this.f28671i0 = c2724a;
        this.f28668Y = z10;
    }

    public final void a(boolean z10) {
        long min;
        boolean z11;
        boolean z12;
        C2724A c2724a = this.f28671i0;
        synchronized (c2724a) {
            c2724a.f28526l.i();
            while (c2724a.f28519e >= c2724a.f28520f && !this.f28668Y && !this.f28670h0 && c2724a.f() == null) {
                c2724a.l();
            }
            c2724a.f28526l.m();
            c2724a.b();
            min = Math.min(c2724a.f28520f - c2724a.f28519e, this.f28669Z.f36721Z);
            c2724a.f28519e += min;
            if (z10) {
                if (min == this.f28669Z.f36721Z) {
                    z11 = true;
                    z12 = z11;
                }
            }
            z11 = false;
            z12 = z11;
        }
        this.f28671i0.f28526l.i();
        try {
            C2724A c2724a2 = this.f28671i0;
            c2724a2.f28516b.r(c2724a2.f28515a, z12, this.f28669Z, min);
        } finally {
            this.f28671i0.f28526l.m();
        }
    }

    @Override // ji.AbstractC4120I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z10;
        C2724A c2724a = this.f28671i0;
        byte[] bArr = Xh.b.f21996a;
        synchronized (c2724a) {
            if (this.f28670h0) {
                return;
            }
            if (c2724a.f() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2724A c2724a2 = this.f28671i0;
            if (!c2724a2.f28524j.f28668Y) {
                if (this.f28669Z.f36721Z > 0) {
                    while (this.f28669Z.f36721Z > 0) {
                        a(true);
                    }
                } else if (z10) {
                    c2724a2.f28516b.r(c2724a2.f28515a, true, null, 0L);
                }
            }
            synchronized (this.f28671i0) {
                this.f28670h0 = true;
            }
            this.f28671i0.f28516b.flush();
            this.f28671i0.a();
        }
    }

    @Override // ji.AbstractC4120I
    public final C4124M f() {
        return this.f28671i0.f28526l;
    }

    @Override // ji.AbstractC4120I, java.io.Flushable
    public final void flush() {
        C2724A c2724a = this.f28671i0;
        byte[] bArr = Xh.b.f21996a;
        synchronized (c2724a) {
            c2724a.b();
        }
        while (this.f28669Z.f36721Z > 0) {
            a(false);
            this.f28671i0.f28516b.flush();
        }
    }

    @Override // ji.AbstractC4120I
    public final void o(C4135j c4135j, long j6) {
        AbstractC3557B.c0("source", c4135j);
        byte[] bArr = Xh.b.f21996a;
        C4135j c4135j2 = this.f28669Z;
        c4135j2.o(c4135j, j6);
        while (c4135j2.f36721Z >= 16384) {
            a(false);
        }
    }
}
