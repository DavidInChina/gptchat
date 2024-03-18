package Z4;

import android.gov.nist.core.Separators;
import android.opengl.GLES20;
import android.util.Log;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import q.D1;

/* loaded from: classes2.dex */
public final class g extends Thread {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f23162Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f23163Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f23164h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f23165i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f23166j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f23167k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f23168l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f23169m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f23170n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f23171o0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f23175s0;

    /* renamed from: v0  reason: collision with root package name */
    public D1 f23178v0;

    /* renamed from: w0  reason: collision with root package name */
    public final WeakReference f23179w0;

    /* renamed from: x0  reason: collision with root package name */
    public final /* synthetic */ l f23180x0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f23173q0 = true;

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f23176t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public boolean f23177u0 = true;

    /* renamed from: p0  reason: collision with root package name */
    public int f23172p0 = 1;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f23174r0 = false;

    public g(l lVar, WeakReference weakReference) {
        AbstractC3557B.c0("this$0", lVar);
        AbstractC3557B.c0("GLTextureViewWeakRef", weakReference);
        this.f23180x0 = lVar;
        this.f23179w0 = weakReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0351 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ReentrantLock reentrantLock;
        Throwable th2;
        Throwable th3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        j jVar;
        j jVar2;
        boolean z16;
        boolean z17;
        boolean z18;
        Condition condition;
        Object obj;
        int i10;
        int i11;
        boolean z19;
        boolean z20;
        boolean z21;
        l lVar;
        boolean z22;
        WeakReference weakReference;
        boolean z23;
        boolean z24;
        boolean z25;
        g gVar = this;
        l lVar2 = gVar.f23180x0;
        WeakReference weakReference2 = gVar.f23179w0;
        D1 d12 = new D1(lVar2, weakReference2);
        ReentrantLock reentrantLock2 = lVar2.f23193p0;
        gVar.f23178v0 = d12;
        gVar.f23167k0 = false;
        gVar.f23168l0 = false;
        gVar.f23174r0 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        boolean z29 = false;
        boolean z30 = false;
        boolean z31 = false;
        boolean z32 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            Object obj2 = null;
            while (true) {
                try {
                    reentrantLock2.lock();
                    while (!gVar.f23162Y) {
                        try {
                            ArrayList arrayList = gVar.f23176t0;
                            boolean isEmpty = arrayList.isEmpty();
                            z10 = z26;
                            Condition condition2 = lVar2.f23194q0;
                            z11 = z27;
                            boolean z33 = z28;
                            if (!isEmpty) {
                                obj2 = arrayList.remove(0);
                                z28 = z33;
                            } else {
                                if (z29) {
                                    f();
                                    e();
                                    z29 = false;
                                }
                                if (!gVar.f23164h0 && !gVar.f23166j0) {
                                    if (lVar2.getEnableLogSurface$lib_release()) {
                                        long id2 = getId();
                                        z17 = z29;
                                        StringBuilder sb2 = new StringBuilder();
                                        z16 = z30;
                                        sb2.append("noticed surfaceView surface lost tid=");
                                        sb2.append(id2);
                                        String sb3 = sb2.toString();
                                        AbstractC3557B.c0("message", sb3);
                                        if (Ad.l.f821g) {
                                            Log.i("GLThread", sb3);
                                        }
                                    } else {
                                        z17 = z29;
                                        z16 = z30;
                                    }
                                    if (gVar.f23168l0) {
                                        f();
                                    }
                                    gVar.f23166j0 = true;
                                    gVar.f23165i0 = false;
                                    condition2.signalAll();
                                } else {
                                    z17 = z29;
                                    z16 = z30;
                                }
                                if (gVar.f23164h0 && gVar.f23166j0) {
                                    if (lVar2.getEnableLogSurface$lib_release()) {
                                        String str = "noticed surfaceView surface acquired tid=" + getId();
                                        AbstractC3557B.c0("message", str);
                                        if (Ad.l.f821g) {
                                            Log.i("GLThread", str);
                                        }
                                    }
                                    gVar.f23166j0 = false;
                                    condition2.signalAll();
                                }
                                if (z32) {
                                    if (lVar2.getEnableLogSurface$lib_release()) {
                                        String str2 = "sending render notification tid=" + getId();
                                        AbstractC3557B.c0("message", str2);
                                        if (Ad.l.f821g) {
                                            Log.i("GLThread", str2);
                                        }
                                    }
                                    gVar.f23174r0 = false;
                                    gVar.f23175s0 = true;
                                    condition2.signalAll();
                                    z32 = false;
                                }
                                if (b()) {
                                    if (!gVar.f23167k0) {
                                        try {
                                            D1 d13 = gVar.f23178v0;
                                            AbstractC3557B.Z(d13);
                                            d13.d();
                                            gVar.f23167k0 = true;
                                            condition2.signalAll();
                                            z10 = true;
                                        } catch (RuntimeException e10) {
                                            l lVar3 = (l) lVar2.f23192o0.f16184Z;
                                            lVar3.f23193p0.lock();
                                            lVar3.f23194q0.signalAll();
                                            throw e10;
                                        }
                                    }
                                    if (gVar.f23167k0 && !gVar.f23168l0) {
                                        gVar.f23168l0 = true;
                                        z18 = true;
                                        z30 = true;
                                        z11 = true;
                                    } else {
                                        z18 = z33;
                                        z30 = z16;
                                    }
                                    if (gVar.f23168l0) {
                                        if (gVar.f23177u0) {
                                            i12 = gVar.f23170n0;
                                            i13 = gVar.f23171o0;
                                            gVar.f23174r0 = true;
                                            if (lVar2.getEnableLogSurface$lib_release()) {
                                                long id3 = getId();
                                                StringBuilder sb4 = new StringBuilder();
                                                z24 = z18;
                                                sb4.append("noticing that we want render notification tid=");
                                                sb4.append(id3);
                                                String sb5 = sb4.toString();
                                                AbstractC3557B.c0("message", sb5);
                                                if (Ad.l.f821g) {
                                                    Log.i("GLThread", sb5);
                                                }
                                            } else {
                                                z24 = z18;
                                            }
                                            gVar.f23177u0 = false;
                                            z25 = false;
                                            z30 = true;
                                            z11 = true;
                                        } else {
                                            z24 = z18;
                                            z25 = false;
                                        }
                                        gVar.f23173q0 = z25;
                                        condition2.signalAll();
                                        if (gVar.f23174r0) {
                                            z31 = true;
                                        }
                                        z28 = z24;
                                        z29 = z17;
                                    }
                                } else {
                                    z18 = z33;
                                    z30 = z16;
                                }
                                if (lVar2.getEnableLogThreads$lib_release()) {
                                    l lVar4 = lVar2;
                                    long id4 = getId();
                                    weakReference = weakReference2;
                                    boolean z34 = gVar.f23167k0;
                                    z22 = z18;
                                    boolean z35 = gVar.f23168l0;
                                    lVar = lVar4;
                                    boolean z36 = gVar.f23169m0;
                                    z21 = z30;
                                    boolean z37 = gVar.f23164h0;
                                    z20 = z31;
                                    boolean z38 = gVar.f23165i0;
                                    z19 = z32;
                                    boolean z39 = gVar.f23166j0;
                                    i11 = i12;
                                    int i14 = gVar.f23170n0;
                                    i10 = i13;
                                    int i15 = gVar.f23171o0;
                                    obj = obj2;
                                    boolean z40 = gVar.f23173q0;
                                    reentrantLock = reentrantLock;
                                    try {
                                        int i16 = gVar.f23172p0;
                                        StringBuilder sb6 = new StringBuilder();
                                        condition = condition2;
                                        sb6.append("waiting tid=");
                                        sb6.append(id4);
                                        sb6.append(" mHaveEglContext: ");
                                        sb6.append(z34);
                                        sb6.append(" mHaveEglSurface: ");
                                        sb6.append(z35);
                                        sb6.append(" mFinishedCreatingEglSurface: ");
                                        sb6.append(z36);
                                        sb6.append(" mPaused: ");
                                        z23 = false;
                                        sb6.append(false);
                                        sb6.append(" mHasSurface: ");
                                        sb6.append(z37);
                                        sb6.append(" mSurfaceIsBad: ");
                                        sb6.append(z38);
                                        sb6.append(" mWaitingForSurface: ");
                                        sb6.append(z39);
                                        sb6.append(" mWidth: ");
                                        sb6.append(i14);
                                        sb6.append(" mHeight: ");
                                        sb6.append(i15);
                                        sb6.append(" mRequestRender: ");
                                        sb6.append(z40);
                                        sb6.append(" mRenderMode: ");
                                        sb6.append(i16);
                                        String sb7 = sb6.toString();
                                        AbstractC3557B.c0("message", sb7);
                                        if (Ad.l.f821g) {
                                            Log.i("GLThread", sb7);
                                        }
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        try {
                                            throw th3;
                                        } catch (Throwable th5) {
                                            th2 = th5;
                                            reentrantLock.lock();
                                            try {
                                                f();
                                                e();
                                                throw th2;
                                            } finally {
                                                reentrantLock.unlock();
                                            }
                                        }
                                    }
                                } else {
                                    lVar = lVar2;
                                    weakReference = weakReference2;
                                    reentrantLock = reentrantLock;
                                    condition = condition2;
                                    z22 = z18;
                                    z21 = z30;
                                    z20 = z31;
                                    z19 = z32;
                                    i11 = i12;
                                    i10 = i13;
                                    obj = obj2;
                                    z23 = false;
                                }
                                condition.await();
                                gVar = this;
                                weakReference2 = weakReference;
                                z26 = z10;
                                z27 = z11;
                                z28 = z22;
                                z29 = z17;
                                lVar2 = lVar;
                                z30 = z21;
                                z31 = z20;
                                z32 = z19;
                                i12 = i11;
                                i13 = i10;
                                obj2 = obj;
                                reentrantLock2 = reentrantLock;
                            }
                            reentrantLock.unlock();
                            if (obj2 != null) {
                                break;
                            }
                            if (z11) {
                                if (lVar2.getEnableLogSurface$lib_release() && Ad.l.f821g) {
                                    AbstractC3612c.r("GLThread", "egl createSurface");
                                }
                                D1 d14 = gVar.f23178v0;
                                AbstractC3557B.Z(d14);
                                if (d14.b()) {
                                    reentrantLock.lock();
                                    gVar.f23169m0 = true;
                                    condition2.signalAll();
                                    reentrantLock.unlock();
                                    z11 = false;
                                } else {
                                    reentrantLock.lock();
                                    gVar.f23169m0 = true;
                                    gVar.f23165i0 = true;
                                    condition2.signalAll();
                                    reentrantLock.unlock();
                                    z26 = z10;
                                    z27 = z11;
                                }
                            }
                            if (z28) {
                                D1 d15 = gVar.f23178v0;
                                AbstractC3557B.Z(d15);
                                GL10 gl10 = (GL10) d15.a();
                                z28 = false;
                            }
                            if (z10) {
                                if (lVar2.getEnableLogRenderer$lib_release() && Ad.l.f821g) {
                                    AbstractC3612c.r("GLThread", "onSurfaceCreated");
                                }
                                l lVar5 = (l) weakReference2.get();
                                if (lVar5 != null && (jVar2 = lVar5.f23197t0) != null) {
                                    z12 = z28;
                                    AbstractC3557B.Z(gVar.f23178v0);
                                    ((X4.a) jVar2).c();
                                    z10 = false;
                                }
                                z12 = z28;
                                z10 = false;
                            } else {
                                z12 = z28;
                            }
                            if (z30) {
                                if (lVar2.getEnableLogRenderer$lib_release()) {
                                    String str3 = "onSurfaceChanged(" + i12 + ", " + i13 + Separators.RPAREN;
                                    AbstractC3557B.c0("message", str3);
                                    if (Ad.l.f821g) {
                                        AbstractC3612c.r("GLThread", str3);
                                    }
                                }
                                l lVar6 = (l) weakReference2.get();
                                if (lVar6 != null && lVar6.f23197t0 != null) {
                                    GLES20.glViewport(0, 0, i12, i13);
                                }
                                z30 = false;
                            }
                            if (lVar2.getEnableLogRendererDrawFrame$lib_release()) {
                                long id5 = getId();
                                z14 = z29;
                                StringBuilder sb8 = new StringBuilder();
                                z13 = z30;
                                sb8.append("onDrawFrame tid=");
                                sb8.append(id5);
                                String sb9 = sb8.toString();
                                AbstractC3557B.c0("message", sb9);
                                if (Ad.l.f821g) {
                                    AbstractC3612c.r("GLThread", sb9);
                                }
                            } else {
                                z14 = z29;
                                z13 = z30;
                            }
                            l lVar7 = (l) weakReference2.get();
                            if (lVar7 != null && (jVar = lVar7.f23197t0) != null) {
                                ((X4.a) jVar).b();
                            }
                            D1 d16 = gVar.f23178v0;
                            AbstractC3557B.Z(d16);
                            int e11 = d16.e();
                            if (e11 != 12288) {
                                if (e11 != 12302) {
                                    String z41 = r.f.z(e11, "eglSwapBuffers");
                                    AbstractC3557B.c0("message", z41);
                                    if (Ad.l.f821g) {
                                        AbstractC3612c.r("GLThread", z41);
                                    }
                                    reentrantLock.lock();
                                    z15 = true;
                                    gVar.f23165i0 = true;
                                    condition2.signalAll();
                                    reentrantLock.unlock();
                                } else {
                                    z15 = true;
                                    if (lVar2.getEnableLogSurface$lib_release()) {
                                        String str4 = "egl context lost tid=" + getId();
                                        AbstractC3557B.c0("message", str4);
                                        if (Ad.l.f821g) {
                                            Log.i("GLThread", str4);
                                        }
                                    }
                                    z29 = true;
                                    if (!z31) {
                                        z32 = z15;
                                        z26 = z10;
                                        z27 = z11;
                                        z28 = z12;
                                        z30 = z13;
                                        z31 = false;
                                    } else {
                                        z26 = z10;
                                        z27 = z11;
                                        z28 = z12;
                                        z30 = z13;
                                    }
                                }
                            } else {
                                z15 = true;
                            }
                            z29 = z14;
                            if (!z31) {
                            }
                        } catch (Throwable th6) {
                            th3 = th6;
                            reentrantLock = reentrantLock;
                            throw th3;
                        }
                    }
                    reentrantLock.unlock();
                    reentrantLock.lock();
                    f();
                    e();
                    return;
                } catch (Throwable th7) {
                    th2 = th7;
                    reentrantLock = reentrantLock2;
                }
            }
            ((Runnable) obj2).run();
            z26 = z10;
            z27 = z11;
        }
    }

    public final boolean b() {
        if (this.f23164h0 && !this.f23165i0 && this.f23170n0 > 0 && this.f23171o0 > 0 && (this.f23173q0 || this.f23172p0 == 1)) {
            return true;
        }
        return false;
    }

    public final void c() {
        l lVar = this.f23180x0;
        ReentrantLock reentrantLock = lVar.f23193p0;
        reentrantLock.lock();
        try {
            this.f23162Y = true;
            lVar.f23194q0.signalAll();
            while (!this.f23163Z) {
                try {
                    lVar.f23194q0.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(int i10) {
        if (i10 >= 0 && i10 <= 1) {
            l lVar = this.f23180x0;
            ReentrantLock reentrantLock = lVar.f23193p0;
            reentrantLock.lock();
            try {
                this.f23172p0 = i10;
                lVar.f23194q0.signalAll();
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalArgumentException("renderMode".toString());
    }

    public final void e() {
        e eVar;
        int i10;
        if (this.f23167k0) {
            D1 d12 = this.f23178v0;
            AbstractC3557B.Z(d12);
            if (((l) d12.f43267g).getEnableLogEgl$lib_release()) {
                String str = "finish() tid=" + Thread.currentThread().getId();
                AbstractC3557B.c0("message", str);
                if (Ad.l.f821g) {
                    AbstractC3612c.r("EglHelper", str);
                }
            }
            if (((EGLContext) d12.f43266f) != null) {
                l lVar = (l) ((WeakReference) d12.f43261a).get();
                if (lVar != null && (eVar = lVar.f23200w0) != null) {
                    EGL10 egl10 = (EGL10) d12.f43262b;
                    EGLDisplay eGLDisplay = (EGLDisplay) d12.f43263c;
                    EGLContext eGLContext = (EGLContext) d12.f43266f;
                    b bVar = (b) eVar;
                    if (egl10 == null || !egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        String str2 = "display:" + eGLDisplay + " context: " + eGLContext;
                        AbstractC3557B.c0("message", str2);
                        if (Ad.l.f821g) {
                            AbstractC3612c.c("DefaultContextFactory", str2);
                        }
                        if (bVar.f23160b.getEnableLogThreads$lib_release()) {
                            String str3 = "tid=" + Thread.currentThread().getId();
                            AbstractC3557B.c0("message", str3);
                            if (Ad.l.f821g) {
                                Log.i("DefaultContextFactory", str3);
                            }
                        }
                        if (egl10 == null) {
                            i10 = -1;
                        } else {
                            i10 = egl10.eglGetError();
                        }
                        throw new RuntimeException(r.f.z(i10, "eglDestroyContex"));
                    }
                }
                d12.f43266f = null;
            }
            if (((EGLDisplay) d12.f43263c) != null) {
                EGL10 egl102 = (EGL10) d12.f43262b;
                AbstractC3557B.Z(egl102);
                egl102.eglTerminate((EGLDisplay) d12.f43263c);
                d12.f43263c = null;
            }
            this.f23167k0 = false;
            l lVar2 = (l) this.f23180x0.f23192o0.f16184Z;
            ReentrantLock reentrantLock = lVar2.f23193p0;
            reentrantLock.lock();
            try {
                lVar2.f23194q0.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void f() {
        if (this.f23168l0) {
            this.f23168l0 = false;
            D1 d12 = this.f23178v0;
            AbstractC3557B.Z(d12);
            if (((l) d12.f43267g).getEnableLogEgl$lib_release()) {
                String str = "destroySurface()  tid=" + Thread.currentThread().getId();
                AbstractC3557B.c0("message", str);
                if (Ad.l.f821g) {
                    AbstractC3612c.r("EglHelper", str);
                }
            }
            d12.c();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("GLThread " + getId());
        l lVar = this.f23180x0;
        if (lVar.getEnableLogThreads$lib_release()) {
            String str = "starting tid=" + getId();
            AbstractC3557B.c0("message", str);
            if (Ad.l.f821g) {
                Log.i("GLThread", str);
            }
        }
        try {
            a();
        } catch (InterruptedException unused) {
        } catch (Throwable th2) {
            lVar.f23192o0.p(this);
            throw th2;
        }
        lVar.f23192o0.p(this);
    }
}
