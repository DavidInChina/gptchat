package di;

import id.AbstractC3557B;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: di.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2724A {

    /* renamed from: a  reason: collision with root package name */
    public final int f28515a;

    /* renamed from: b  reason: collision with root package name */
    public final t f28516b;

    /* renamed from: c  reason: collision with root package name */
    public long f28517c;

    /* renamed from: d  reason: collision with root package name */
    public long f28518d;

    /* renamed from: e  reason: collision with root package name */
    public long f28519e;

    /* renamed from: f  reason: collision with root package name */
    public long f28520f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f28521g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f28522h;

    /* renamed from: i  reason: collision with root package name */
    public final y f28523i;

    /* renamed from: j  reason: collision with root package name */
    public final x f28524j;

    /* renamed from: k  reason: collision with root package name */
    public final z f28525k = new z(this);

    /* renamed from: l  reason: collision with root package name */
    public final z f28526l = new z(this);

    /* renamed from: m  reason: collision with root package name */
    public EnumC2728b f28527m;

    /* renamed from: n  reason: collision with root package name */
    public IOException f28528n;

    public C2724A(int i10, t tVar, boolean z10, boolean z11, Wh.q qVar) {
        this.f28515a = i10;
        this.f28516b = tVar;
        this.f28520f = tVar.f28646x0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f28521g = arrayDeque;
        this.f28523i = new y(this, tVar.f28645w0.a(), z11);
        this.f28524j = new x(this, z10);
        if (qVar != null) {
            if (!h()) {
                arrayDeque.add(qVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z10;
        boolean i10;
        byte[] bArr = Xh.b.f21996a;
        synchronized (this) {
            try {
                y yVar = this.f28523i;
                if (!yVar.f28673Z && yVar.f28676j0) {
                    x xVar = this.f28524j;
                    if (xVar.f28668Y || xVar.f28670h0) {
                        z10 = true;
                        i10 = i();
                    }
                }
                z10 = false;
                i10 = i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            c(EnumC2728b.CANCEL, null);
        } else if (!i10) {
            this.f28516b.k(this.f28515a);
        }
    }

    public final void b() {
        x xVar = this.f28524j;
        if (!xVar.f28670h0) {
            if (!xVar.f28668Y) {
                if (this.f28527m != null) {
                    IOException iOException = this.f28528n;
                    if (iOException == null) {
                        EnumC2728b enumC2728b = this.f28527m;
                        AbstractC3557B.Z(enumC2728b);
                        throw new F(enumC2728b);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(EnumC2728b enumC2728b, IOException iOException) {
        if (!d(enumC2728b, iOException)) {
            return;
        }
        t tVar = this.f28516b;
        tVar.getClass();
        tVar.f28625D0.p(this.f28515a, enumC2728b);
    }

    public final boolean d(EnumC2728b enumC2728b, IOException iOException) {
        byte[] bArr = Xh.b.f21996a;
        synchronized (this) {
            if (this.f28527m != null) {
                return false;
            }
            this.f28527m = enumC2728b;
            this.f28528n = iOException;
            notifyAll();
            if (this.f28523i.f28673Z) {
                if (this.f28524j.f28668Y) {
                    return false;
                }
            }
            this.f28516b.k(this.f28515a);
            return true;
        }
    }

    public final void e(EnumC2728b enumC2728b) {
        if (!d(enumC2728b, null)) {
            return;
        }
        this.f28516b.F(this.f28515a, enumC2728b);
    }

    public final synchronized EnumC2728b f() {
        return this.f28527m;
    }

    public final x g() {
        synchronized (this) {
            if (!this.f28522h && !h()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f28524j;
    }

    public final boolean h() {
        boolean z10;
        if ((this.f28515a & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f28516b.f28628Y == z10) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f28527m != null) {
            return false;
        }
        y yVar = this.f28523i;
        if (yVar.f28673Z || yVar.f28676j0) {
            x xVar = this.f28524j;
            if (xVar.f28668Y || xVar.f28670h0) {
                if (this.f28522h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:11:0x0018, B:13:0x0021, B:14:0x0025), top: B:20:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Wh.q qVar, boolean z10) {
        boolean i10;
        AbstractC3557B.c0("headers", qVar);
        byte[] bArr = Xh.b.f21996a;
        synchronized (this) {
            try {
                if (this.f28522h && z10) {
                    this.f28523i.getClass();
                    if (z10) {
                        this.f28523i.f28673Z = true;
                    }
                    i10 = i();
                    notifyAll();
                }
                this.f28522h = true;
                this.f28521g.add(qVar);
                if (z10) {
                }
                i10 = i();
                notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!i10) {
            this.f28516b.k(this.f28515a);
        }
    }

    public final synchronized void k(EnumC2728b enumC2728b) {
        if (this.f28527m == null) {
            this.f28527m = enumC2728b;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
