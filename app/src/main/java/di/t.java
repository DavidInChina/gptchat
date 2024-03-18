package di;

import id.AbstractC3557B;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import ji.AbstractC4136k;
import ji.AbstractC4137l;
import ji.C4135j;

/* loaded from: classes2.dex */
public final class t implements Closeable {

    /* renamed from: G0  reason: collision with root package name */
    public static final E f28621G0;

    /* renamed from: A0  reason: collision with root package name */
    public long f28622A0;

    /* renamed from: B0  reason: collision with root package name */
    public long f28623B0;

    /* renamed from: C0  reason: collision with root package name */
    public final Socket f28624C0;

    /* renamed from: D0  reason: collision with root package name */
    public final C2725B f28625D0;

    /* renamed from: E0  reason: collision with root package name */
    public final n f28626E0;

    /* renamed from: F0  reason: collision with root package name */
    public final LinkedHashSet f28627F0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f28628Y;

    /* renamed from: Z  reason: collision with root package name */
    public final j f28629Z;

    /* renamed from: h0  reason: collision with root package name */
    public final LinkedHashMap f28630h0 = new LinkedHashMap();

    /* renamed from: i0  reason: collision with root package name */
    public final String f28631i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f28632j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f28633k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f28634l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Zh.f f28635m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Zh.c f28636n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Zh.c f28637o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Zh.c f28638p0;

    /* renamed from: q0  reason: collision with root package name */
    public final P5.c f28639q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f28640r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f28641s0;

    /* renamed from: t0  reason: collision with root package name */
    public long f28642t0;

    /* renamed from: u0  reason: collision with root package name */
    public long f28643u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f28644v0;

    /* renamed from: w0  reason: collision with root package name */
    public final E f28645w0;

    /* renamed from: x0  reason: collision with root package name */
    public E f28646x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f28647y0;

    /* renamed from: z0  reason: collision with root package name */
    public long f28648z0;

    static {
        E e10 = new E();
        e10.c(7, 65535);
        e10.c(5, 16384);
        f28621G0 = e10;
    }

    public t(h hVar) {
        int i10;
        boolean z10 = hVar.f28583a;
        this.f28628Y = z10;
        this.f28629Z = hVar.f28589g;
        String str = hVar.f28586d;
        if (str != null) {
            this.f28631i0 = str;
            if (z10) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f28633k0 = i10;
            Zh.f fVar = hVar.f28584b;
            this.f28635m0 = fVar;
            Zh.c f6 = fVar.f();
            this.f28636n0 = f6;
            this.f28637o0 = fVar.f();
            this.f28638p0 = fVar.f();
            this.f28639q0 = hVar.f28590h;
            E e10 = new E();
            if (z10) {
                e10.c(7, 16777216);
            }
            this.f28645w0 = e10;
            E e11 = f28621G0;
            this.f28646x0 = e11;
            this.f28623B0 = e11.a();
            Socket socket = hVar.f28585c;
            if (socket != null) {
                this.f28624C0 = socket;
                AbstractC4136k abstractC4136k = hVar.f28588f;
                if (abstractC4136k != null) {
                    this.f28625D0 = new C2725B(abstractC4136k, z10);
                    AbstractC4137l abstractC4137l = hVar.f28587e;
                    if (abstractC4137l != null) {
                        this.f28626E0 = new n(this, new w(abstractC4137l, z10));
                        this.f28627F0 = new LinkedHashSet();
                        int i11 = hVar.f28591i;
                        if (i11 != 0) {
                            long nanos = TimeUnit.MILLISECONDS.toNanos(i11);
                            f6.c(new r(str.concat(" ping"), this, nanos, 0), nanos);
                            return;
                        }
                        return;
                    }
                    AbstractC3557B.C2("source");
                    throw null;
                }
                AbstractC3557B.C2("sink");
                throw null;
            }
            AbstractC3557B.C2("socket");
            throw null;
        }
        AbstractC3557B.C2("connectionName");
        throw null;
    }

    public final void F(int i10, EnumC2728b enumC2728b) {
        this.f28636n0.c(new q(this.f28631i0 + '[' + i10 + "] writeSynReset", this, i10, enumC2728b, 1), 0L);
    }

    public final void O(int i10, long j6) {
        this.f28636n0.c(new s(this.f28631i0 + '[' + i10 + "] windowUpdate", this, i10, j6), 0L);
    }

    public final void a(EnumC2728b enumC2728b, EnumC2728b enumC2728b2, IOException iOException) {
        int i10;
        Object[] objArr;
        byte[] bArr = Xh.b.f21996a;
        try {
            m(enumC2728b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f28630h0.isEmpty()) {
                objArr = this.f28630h0.values().toArray(new C2724A[0]);
                this.f28630h0.clear();
            } else {
                objArr = null;
            }
        }
        C2724A[] c2724aArr = (C2724A[]) objArr;
        if (c2724aArr != null) {
            for (C2724A c2724a : c2724aArr) {
                try {
                    c2724a.c(enumC2728b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f28625D0.close();
        } catch (IOException unused3) {
        }
        try {
            this.f28624C0.close();
        } catch (IOException unused4) {
        }
        this.f28636n0.e();
        this.f28637o0.e();
        this.f28638p0.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(EnumC2728b.NO_ERROR, EnumC2728b.CANCEL, null);
    }

    public final void flush() {
        this.f28625D0.flush();
    }

    public final void h(IOException iOException) {
        EnumC2728b enumC2728b = EnumC2728b.PROTOCOL_ERROR;
        a(enumC2728b, enumC2728b, iOException);
    }

    public final synchronized C2724A i(int i10) {
        return (C2724A) this.f28630h0.get(Integer.valueOf(i10));
    }

    public final synchronized boolean j(long j6) {
        if (this.f28634l0) {
            return false;
        }
        if (this.f28643u0 < this.f28642t0) {
            if (j6 >= this.f28644v0) {
                return false;
            }
        }
        return true;
    }

    public final synchronized C2724A k(int i10) {
        C2724A c2724a;
        c2724a = (C2724A) this.f28630h0.remove(Integer.valueOf(i10));
        notifyAll();
        return c2724a;
    }

    public final void m(EnumC2728b enumC2728b) {
        synchronized (this.f28625D0) {
            synchronized (this) {
                if (this.f28634l0) {
                    return;
                }
                this.f28634l0 = true;
                this.f28625D0.j(this.f28632j0, enumC2728b, Xh.b.f21996a);
            }
        }
    }

    public final synchronized void p(long j6) {
        long j10 = this.f28647y0 + j6;
        this.f28647y0 = j10;
        long j11 = j10 - this.f28648z0;
        if (j11 >= this.f28645w0.a() / 2) {
            O(0, j11);
            this.f28648z0 += j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f28625D0.f28533i0);
        r6 = r2;
        r8.f28622A0 += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i10, boolean z10, C4135j c4135j, long j6) {
        int min;
        long j10;
        boolean z11;
        if (j6 == 0) {
            this.f28625D0.h(z10, i10, c4135j, 0);
            return;
        }
        loop0: while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j11 = this.f28622A0;
                            long j12 = this.f28623B0;
                            if (j11 < j12) {
                                break;
                            } else if (!this.f28630h0.containsKey(Integer.valueOf(i10))) {
                                break loop0;
                            } else {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            j6 -= j10;
            C2725B c2725b = this.f28625D0;
            if (z10 && j6 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c2725b.h(z11, i10, c4135j, min);
        }
    }
}
