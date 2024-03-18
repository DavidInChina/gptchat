package J2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import s2.AbstractC5530A;
import s2.AbstractC5533c;
import s2.RunnableC5537g;

/* loaded from: classes.dex */
public final class k extends HandlerThread implements Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public RunnableC5537g f8791Y;

    /* renamed from: Z  reason: collision with root package name */
    public Handler f8792Z;

    /* renamed from: h0  reason: collision with root package name */
    public Error f8793h0;

    /* renamed from: i0  reason: collision with root package name */
    public RuntimeException f8794i0;

    /* renamed from: j0  reason: collision with root package name */
    public l f8795j0;

    public final void a(int i10) {
        boolean z10;
        boolean z11;
        int[] iArr;
        boolean z12;
        EGLSurface eGLSurface;
        int[] iArr2;
        boolean z13;
        boolean z14 = false;
        this.f8791Y.getClass();
        RunnableC5537g runnableC5537g = this.f8791Y;
        runnableC5537g.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5533c.c("eglGetDisplay failed", z10);
        int[] iArr3 = new int[2];
        AbstractC5533c.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        runnableC5537g.f45160h0 = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC5537g.f45157l0, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
        int i11 = AbstractC5530A.f45131a;
        AbstractC5533c.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z11);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = runnableC5537g.f45160h0;
        if (i10 == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC5533c.c("eglCreateContext failed", z12);
        runnableC5537g.f45161i0 = eglCreateContext;
        EGLDisplay eGLDisplay2 = runnableC5537g.f45160h0;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i10 == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eGLSurface != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC5533c.c("eglCreatePbufferSurface failed", z13);
        }
        AbstractC5533c.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eglCreateContext));
        runnableC5537g.f45162j0 = eGLSurface;
        int[] iArr5 = runnableC5537g.f45159Z;
        GLES20.glGenTextures(1, iArr5, 0);
        AbstractC5533c.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
        runnableC5537g.f45163k0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC5537g);
        SurfaceTexture surfaceTexture2 = this.f8791Y.f45163k0;
        surfaceTexture2.getClass();
        if (i10 != 0) {
            z14 = true;
        }
        this.f8795j0 = new l(this, surfaceTexture2, z14);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public final void b() {
        this.f8791Y.getClass();
        RunnableC5537g runnableC5537g = this.f8791Y;
        runnableC5537g.f45158Y.removeCallbacks(runnableC5537g);
        try {
            SurfaceTexture surfaceTexture = runnableC5537g.f45163k0;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC5537g.f45159Z, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC5537g.f45160h0;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC5537g.f45160h0;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC5537g.f45162j0;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC5537g.f45160h0, runnableC5537g.f45162j0);
            }
            EGLContext eGLContext = runnableC5537g.f45161i0;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC5537g.f45160h0, eGLContext);
            }
            if (AbstractC5530A.f45131a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = runnableC5537g.f45160h0;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC5537g.f45160h0);
            }
            runnableC5537g.f45160h0 = null;
            runnableC5537g.f45161i0 = null;
            runnableC5537g.f45162j0 = null;
            runnableC5537g.f45163k0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                s2.p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                this.f8793h0 = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                s2.p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f8794i0 = e11;
                synchronized (this) {
                    notify();
                }
            } catch (s2.i e12) {
                s2.p.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.f8794i0 = new IllegalStateException(e12);
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
