package ai;

import Wh.AbstractC1660e;
import Wh.AbstractC1661f;
import Wh.D;
import Wh.w;
import Wh.z;
import bi.C2226a;
import bi.C2227b;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kf.s;
import p2.F;

/* loaded from: classes.dex */
public final class j implements AbstractC1660e {

    /* renamed from: Y  reason: collision with root package name */
    public final w f24255Y;

    /* renamed from: Z  reason: collision with root package name */
    public final z f24256Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f24257h0;

    /* renamed from: i0  reason: collision with root package name */
    public final n f24258i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Wh.n f24259j0;

    /* renamed from: k0  reason: collision with root package name */
    public final i f24260k0;

    /* renamed from: m0  reason: collision with root package name */
    public Object f24262m0;

    /* renamed from: n0  reason: collision with root package name */
    public f f24263n0;

    /* renamed from: o0  reason: collision with root package name */
    public m f24264o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f24265p0;

    /* renamed from: q0  reason: collision with root package name */
    public e f24266q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f24267r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f24268s0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile boolean f24270u0;

    /* renamed from: v0  reason: collision with root package name */
    public volatile e f24271v0;

    /* renamed from: w0  reason: collision with root package name */
    public volatile m f24272w0;

    /* renamed from: l0  reason: collision with root package name */
    public final AtomicBoolean f24261l0 = new AtomicBoolean();

    /* renamed from: t0  reason: collision with root package name */
    public boolean f24269t0 = true;

    public j(w wVar, z zVar, boolean z10) {
        AbstractC3557B.c0("client", wVar);
        AbstractC3557B.c0("originalRequest", zVar);
        this.f24255Y = wVar;
        this.f24256Z = zVar;
        this.f24257h0 = z10;
        this.f24258i0 = (n) wVar.f21303Z.f16184Z;
        Wh.n nVar = (Wh.n) wVar.f21306j0.f32774Z;
        byte[] bArr = Xh.b.f21996a;
        AbstractC3557B.c0("$this_asFactory", nVar);
        this.f24259j0 = nVar;
        i iVar = new i(this);
        iVar.g(wVar.f21295B0, TimeUnit.MILLISECONDS);
        this.f24260k0 = iVar;
    }

    public static final String a(j jVar) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (jVar.f24270u0) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (jVar.f24257h0) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb2.append(str2);
        sb2.append(" to ");
        sb2.append(jVar.f24256Z.f21336a.g());
        return sb2.toString();
    }

    public final void b(m mVar) {
        byte[] bArr = Xh.b.f21996a;
        if (this.f24264o0 == null) {
            this.f24264o0 = mVar;
            mVar.f24292p.add(new h(this, this.f24262m0));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k10;
        byte[] bArr = Xh.b.f21996a;
        m mVar = this.f24264o0;
        if (mVar != null) {
            synchronized (mVar) {
                k10 = k();
            }
            if (this.f24264o0 == null) {
                if (k10 != null) {
                    Xh.b.d(k10);
                }
                this.f24259j0.getClass();
            } else if (k10 != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (this.f24265p0 || !this.f24260k0.j()) {
            iOException2 = iOException;
        } else {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        }
        if (iOException != null) {
            Wh.n nVar = this.f24259j0;
            AbstractC3557B.Z(iOException2);
            nVar.getClass();
        } else {
            this.f24259j0.getClass();
        }
        return iOException2;
    }

    public final Object clone() {
        return new j(this.f24255Y, this.f24256Z, this.f24257h0);
    }

    public final void d() {
        Socket socket;
        if (this.f24270u0) {
            return;
        }
        this.f24270u0 = true;
        e eVar = this.f24271v0;
        if (eVar != null) {
            eVar.f24236d.cancel();
        }
        m mVar = this.f24272w0;
        if (mVar != null && (socket = mVar.f24279c) != null) {
            Xh.b.d(socket);
        }
        this.f24259j0.getClass();
    }

    public final void e(AbstractC1661f abstractC1661f) {
        g c10;
        if (this.f24261l0.compareAndSet(false, true)) {
            ei.m mVar = ei.m.f29511a;
            this.f24262m0 = ei.m.f29511a.g();
            this.f24259j0.getClass();
            F f6 = this.f24255Y.f21302Y;
            g gVar = new g(this, abstractC1661f);
            f6.getClass();
            synchronized (f6) {
                ((ArrayDeque) f6.f41781e).add(gVar);
                if (!this.f24257h0 && (c10 = f6.c(this.f24256Z.f21336a.f21253d)) != null) {
                    gVar.f24251Z = c10.f24251Z;
                }
            }
            f6.f();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final D f() {
        if (this.f24261l0.compareAndSet(false, true)) {
            this.f24260k0.i();
            ei.m mVar = ei.m.f29511a;
            this.f24262m0 = ei.m.f29511a.g();
            this.f24259j0.getClass();
            try {
                F f6 = this.f24255Y.f21302Y;
                synchronized (f6) {
                    ((ArrayDeque) f6.f41783g).add(this);
                }
                return h();
            } finally {
                F f10 = this.f24255Y.f21302Y;
                f10.getClass();
                f10.d((ArrayDeque) f10.f41783g, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void g(boolean z10) {
        e eVar;
        synchronized (this) {
            if (!this.f24269t0) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (eVar = this.f24271v0) != null) {
            eVar.f24236d.cancel();
            eVar.f24233a.i(eVar, true, true, null);
        }
        this.f24266q0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D h() {
        Throwable th2;
        ArrayList arrayList = new ArrayList();
        s.N1(this.f24255Y.f21304h0, arrayList);
        arrayList.add(new bi.g(this.f24255Y));
        arrayList.add(new C2226a(this.f24255Y.f21311o0));
        this.f24255Y.getClass();
        arrayList.add(new Object());
        arrayList.add(C2005a.f24217a);
        if (!this.f24257h0) {
            s.N1(this.f24255Y.f21305i0, arrayList);
        }
        arrayList.add(new C2227b(this.f24257h0));
        z zVar = this.f24256Z;
        w wVar = this.f24255Y;
        boolean z10 = false;
        try {
            D b10 = new bi.f(this, arrayList, 0, null, zVar, wVar.f21296C0, wVar.f21297D0, wVar.f21298E0).b(this.f24256Z);
            if (!this.f24270u0) {
                j(null);
                return b10;
            }
            Xh.b.c(b10);
            throw new IOException("Canceled");
        } catch (IOException e10) {
            try {
                IOException j6 = j(e10);
                AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Throwable", j6);
                throw j6;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (!z10) {
                    j(null);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (!z10) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:14:0x001b, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039), top: B:44:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:14:0x001b, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039), top: B:44:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException i(e eVar, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC3557B.c0("exchange", eVar);
        if (!AbstractC3557B.K(eVar, this.f24271v0)) {
            return iOException;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (!this.f24267r0) {
                    }
                    if (z10) {
                        this.f24267r0 = false;
                    }
                    if (z11) {
                        this.f24268s0 = false;
                    }
                    z14 = this.f24267r0;
                    if (z14 && !this.f24268s0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (!z14 && !this.f24268s0) {
                        if (!this.f24269t0) {
                            z12 = true;
                        }
                    }
                    z13 = z12;
                    z12 = z15;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z11 || !this.f24268s0) {
                z13 = false;
            }
            if (z10) {
            }
            if (z11) {
            }
            z14 = this.f24267r0;
            if (z14) {
            }
            z15 = false;
            if (!z14) {
                if (!this.f24269t0) {
                }
            }
            z13 = z12;
            z12 = z15;
        }
        if (z12) {
            this.f24271v0 = null;
            m mVar = this.f24264o0;
            if (mVar != null) {
                mVar.h();
            }
        }
        if (z13) {
            return c(iOException);
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f24269t0) {
                this.f24269t0 = false;
                if (!this.f24267r0) {
                    if (!this.f24268s0) {
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            return c(iOException);
        }
        return iOException;
    }

    public final Socket k() {
        m mVar = this.f24264o0;
        AbstractC3557B.Z(mVar);
        byte[] bArr = Xh.b.f21996a;
        ArrayList arrayList = mVar.f24292p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (AbstractC3557B.K(((Reference) it.next()).get(), this)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            arrayList.remove(i10);
            this.f24264o0 = null;
            if (arrayList.isEmpty()) {
                mVar.f24293q = System.nanoTime();
                n nVar = this.f24258i0;
                nVar.getClass();
                byte[] bArr2 = Xh.b.f21996a;
                boolean z10 = mVar.f24286j;
                Zh.c cVar = nVar.f24296c;
                if (!z10 && nVar.f24294a != 0) {
                    cVar.c(nVar.f24297d, 0L);
                } else {
                    mVar.f24286j = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = nVar.f24298e;
                    concurrentLinkedQueue.remove(mVar);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cVar.a();
                    }
                    Socket socket = mVar.f24280d;
                    AbstractC3557B.Z(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
