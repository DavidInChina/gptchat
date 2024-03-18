package Z4;

import S4.o;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public abstract class l extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: B0  reason: collision with root package name */
    public static final /* synthetic */ int f23183B0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f23184A0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f23185h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f23186i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f23187j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f23188k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f23189l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f23190m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f23191n0;

    /* renamed from: p0  reason: collision with root package name */
    public final ReentrantLock f23193p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Condition f23194q0;

    /* renamed from: s0  reason: collision with root package name */
    public g f23196s0;

    /* renamed from: t0  reason: collision with root package name */
    public j f23197t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f23198u0;

    /* renamed from: v0  reason: collision with root package name */
    public d f23199v0;

    /* renamed from: w0  reason: collision with root package name */
    public e f23200w0;

    /* renamed from: x0  reason: collision with root package name */
    public f f23201x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f23202y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f23203z0;

    /* renamed from: o0  reason: collision with root package name */
    public final o f23192o0 = new o(this);

    /* renamed from: r0  reason: collision with root package name */
    public final WeakReference f23195r0 = new WeakReference(this);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC3557B.c0("context", context);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f23193p0 = reentrantLock;
        this.f23194q0 = reentrantLock.newCondition();
        setSurfaceTextureListener(this);
    }

    public final void a() {
        if (this.f23196s0 == null) {
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.".toString());
    }

    public final void b(int i10, int i11) {
        g gVar = this.f23196s0;
        AbstractC3557B.Z(gVar);
        l lVar = gVar.f23180x0;
        ReentrantLock reentrantLock = lVar.f23193p0;
        Condition condition = lVar.f23194q0;
        reentrantLock.lock();
        try {
            gVar.f23170n0 = i10;
            gVar.f23171o0 = i11;
            gVar.f23177u0 = true;
            gVar.f23173q0 = true;
            gVar.f23175s0 = false;
            if (Thread.currentThread() != gVar) {
                condition.signalAll();
                while (!gVar.f23163Z && !gVar.f23175s0 && gVar.f23167k0 && gVar.f23168l0 && gVar.b()) {
                    if (lVar.getEnableLogSurface$lib_release()) {
                        String str = "onWindowResize waiting for render complete from tid=" + gVar.getId();
                        AbstractC3557B.c0("message", str);
                        if (Ad.l.f821g) {
                            Log.i("Main thread", str);
                        }
                    }
                    try {
                        condition.await();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void finalize() {
        g gVar = this.f23196s0;
        if (gVar != null) {
            AbstractC3557B.Z(gVar);
            gVar.c();
        }
    }

    public final int getDebugFlags() {
        return this.f23202y0;
    }

    public final boolean getEnableLogAttachDetach$lib_release() {
        return this.f23185h0;
    }

    public final boolean getEnableLogEgl$lib_release() {
        return this.f23191n0;
    }

    public final boolean getEnableLogPauseResume$lib_release() {
        return this.f23187j0;
    }

    public final boolean getEnableLogRenderer$lib_release() {
        return this.f23189l0;
    }

    public final boolean getEnableLogRendererDrawFrame$lib_release() {
        return this.f23190m0;
    }

    public final boolean getEnableLogSurface$lib_release() {
        return this.f23188k0;
    }

    public final boolean getEnableLogThreads$lib_release() {
        return this.f23186i0;
    }

    public final boolean getPreserveEGLContextOnPause() {
        return this.f23184A0;
    }

    public final int getRenderMode() {
        g gVar = this.f23196s0;
        AbstractC3557B.Z(gVar);
        ReentrantLock reentrantLock = gVar.f23180x0.f23193p0;
        reentrantLock.lock();
        try {
            return gVar.f23172p0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (this.f23185h0) {
            String str = "onAttachedToWindow reattach =" + this.f23198u0;
            AbstractC3557B.c0("message", str);
            if (Ad.l.f821g) {
                Log.d("GLTextureView", str);
            }
        }
        if (this.f23198u0 && this.f23197t0 != null) {
            g gVar = this.f23196s0;
            if (gVar != null) {
                ReentrantLock reentrantLock = gVar.f23180x0.f23193p0;
                reentrantLock.lock();
                try {
                    i10 = gVar.f23172p0;
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                i10 = 1;
            }
            g gVar2 = new g(this, this.f23195r0);
            this.f23196s0 = gVar2;
            if (i10 != 1) {
                gVar2.d(i10);
            }
            g gVar3 = this.f23196s0;
            AbstractC3557B.Z(gVar3);
            gVar3.start();
        }
        this.f23198u0 = false;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.f23185h0 && Ad.l.f821g) {
            Log.d("GLTextureView", "onDetachedFromWindow");
        }
        g gVar = this.f23196s0;
        if (gVar != null) {
            AbstractC3557B.Z(gVar);
            gVar.c();
        }
        this.f23198u0 = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        getSurfaceTexture();
        b(i12 - i10, i13 - i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        AbstractC3557B.c0("surface", surfaceTexture);
        g gVar = this.f23196s0;
        AbstractC3557B.Z(gVar);
        l lVar = gVar.f23180x0;
        ReentrantLock reentrantLock = lVar.f23193p0;
        reentrantLock.lock();
        try {
            boolean enableLogThreads$lib_release = lVar.getEnableLogThreads$lib_release();
            Condition condition = lVar.f23194q0;
            if (enableLogThreads$lib_release) {
                String str = "surfaceCreated tid=" + gVar.getId();
                AbstractC3557B.c0("message", str);
                if (Ad.l.f821g) {
                    Log.i("GLThread", str);
                }
            }
            gVar.f23164h0 = true;
            gVar.f23169m0 = false;
            condition.signalAll();
            while (gVar.f23166j0 && !gVar.f23169m0 && !gVar.f23163Z) {
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            reentrantLock.unlock();
            b(i10, i11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AbstractC3557B.c0("surface", surfaceTexture);
        g gVar = this.f23196s0;
        AbstractC3557B.Z(gVar);
        l lVar = gVar.f23180x0;
        ReentrantLock reentrantLock = lVar.f23193p0;
        reentrantLock.lock();
        try {
            boolean enableLogThreads$lib_release = lVar.getEnableLogThreads$lib_release();
            Condition condition = lVar.f23194q0;
            if (enableLogThreads$lib_release) {
                String str = "surfaceDestroyed tid=" + gVar.getId();
                AbstractC3557B.c0("message", str);
                if (Ad.l.f821g) {
                    Log.i("GLThread", str);
                }
            }
            gVar.f23164h0 = false;
            condition.signalAll();
            while (!gVar.f23166j0 && !gVar.f23163Z) {
                try {
                    condition.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        AbstractC3557B.c0("surface", surfaceTexture);
        b(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AbstractC3557B.c0("surface", surfaceTexture);
    }

    public final void setDebugFlags(int i10) {
        this.f23202y0 = i10;
    }

    public final void setEGLConfigChooser(d dVar) {
        a();
        this.f23199v0 = dVar;
    }

    public final void setEGLContextClientVersion(int i10) {
        a();
        this.f23203z0 = i10;
    }

    public final void setEGLContextFactory(e eVar) {
        a();
        this.f23200w0 = eVar;
    }

    public final void setEGLWindowSurfaceFactory(f fVar) {
        a();
        this.f23201x0 = fVar;
    }

    public final void setEnableLogAttachDetach$lib_release(boolean z10) {
        this.f23185h0 = z10;
    }

    public final void setEnableLogEgl$lib_release(boolean z10) {
        this.f23191n0 = z10;
    }

    public final void setEnableLogPauseResume$lib_release(boolean z10) {
        this.f23187j0 = z10;
    }

    public final void setEnableLogRenderer$lib_release(boolean z10) {
        this.f23189l0 = z10;
    }

    public final void setEnableLogRendererDrawFrame$lib_release(boolean z10) {
        this.f23190m0 = z10;
    }

    public final void setEnableLogSurface$lib_release(boolean z10) {
        this.f23188k0 = z10;
    }

    public final void setEnableLogThreads$lib_release(boolean z10) {
        this.f23186i0 = z10;
    }

    public final void setPreserveEGLContextOnPause(boolean z10) {
        this.f23184A0 = z10;
    }

    public final void setRenderMode(int i10) {
        g gVar = this.f23196s0;
        AbstractC3557B.Z(gVar);
        gVar.d(i10);
    }

    public final void setRenderer(j jVar) {
        a();
        if (this.f23199v0 == null) {
            this.f23199v0 = new k(this, true);
        }
        if (this.f23200w0 == null) {
            this.f23200w0 = new b(this);
        }
        if (this.f23201x0 == null) {
            this.f23201x0 = new c(this);
        }
        this.f23197t0 = jVar;
        g gVar = new g(this, this.f23195r0);
        this.f23196s0 = gVar;
        gVar.start();
    }

    public final void setEGLConfigChooser(boolean z10) {
        setEGLConfigChooser(new k(this, z10));
    }

    public final void setGLWrapper(h hVar) {
    }
}
