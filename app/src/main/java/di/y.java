package di;

import id.AbstractC3557B;
import ji.AbstractC4122K;
import ji.C4124M;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class y implements AbstractC4122K {

    /* renamed from: Y  reason: collision with root package name */
    public final long f28672Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f28673Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4135j f28674h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public final C4135j f28675i0 = new Object();

    /* renamed from: j0  reason: collision with root package name */
    public boolean f28676j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C2724A f28677k0;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ji.j] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ji.j] */
    public y(C2724A c2724a, long j6, boolean z10) {
        this.f28677k0 = c2724a;
        this.f28672Y = j6;
        this.f28673Z = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j6;
        C2724A c2724a = this.f28677k0;
        synchronized (c2724a) {
            this.f28676j0 = true;
            C4135j c4135j = this.f28675i0;
            j6 = c4135j.f36721Z;
            c4135j.a();
            c2724a.notifyAll();
        }
        if (j6 > 0) {
            byte[] bArr = Xh.b.f21996a;
            this.f28677k0.f28516b.p(j6);
        }
        this.f28677k0.a();
    }

    @Override // ji.AbstractC4122K
    public final C4124M f() {
        return this.f28677k0.f28525k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
        throw new java.io.IOException("stream closed");
     */
    @Override // ji.AbstractC4122K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g0(C4135j c4135j, long j6) {
        Throwable th2;
        boolean z10;
        long j10;
        AbstractC3557B.c0("sink", c4135j);
        long j11 = 0;
        if (j6 >= 0) {
            while (true) {
                C2724A c2724a = this.f28677k0;
                synchronized (c2724a) {
                    c2724a.f28525k.i();
                    if (c2724a.f() != null && !this.f28673Z) {
                        th2 = c2724a.f28528n;
                        if (th2 == null) {
                            EnumC2728b f6 = c2724a.f();
                            AbstractC3557B.Z(f6);
                            th2 = new F(f6);
                        }
                    } else {
                        th2 = null;
                    }
                    if (this.f28676j0) {
                        break;
                    }
                    C4135j c4135j2 = this.f28675i0;
                    long j12 = c4135j2.f36721Z;
                    z10 = false;
                    if (j12 > j11) {
                        j10 = c4135j2.g0(c4135j, Math.min(j6, j12));
                        long j13 = c2724a.f28517c + j10;
                        c2724a.f28517c = j13;
                        long j14 = j13 - c2724a.f28518d;
                        if (th2 == null && j14 >= c2724a.f28516b.f28645w0.a() / 2) {
                            c2724a.f28516b.O(c2724a.f28515a, j14);
                            c2724a.f28518d = c2724a.f28517c;
                        }
                    } else {
                        if (!this.f28673Z && th2 == null) {
                            c2724a.l();
                            z10 = true;
                        }
                        j10 = -1;
                    }
                    c2724a.f28525k.m();
                }
                if (z10) {
                    j11 = 0;
                } else if (j10 != -1) {
                    return j10;
                } else {
                    if (th2 == null) {
                        return -1L;
                    }
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException(android.gov.nist.core.a.f("byteCount < 0: ", j6).toString());
        }
    }
}
