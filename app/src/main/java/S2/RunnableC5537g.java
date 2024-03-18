package s2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: s2.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5537g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: l0  reason: collision with root package name */
    public static final int[] f45157l0 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: Y  reason: collision with root package name */
    public final Handler f45158Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int[] f45159Z = new int[1];

    /* renamed from: h0  reason: collision with root package name */
    public EGLDisplay f45160h0;

    /* renamed from: i0  reason: collision with root package name */
    public EGLContext f45161i0;

    /* renamed from: j0  reason: collision with root package name */
    public EGLSurface f45162j0;

    /* renamed from: k0  reason: collision with root package name */
    public SurfaceTexture f45163k0;

    public RunnableC5537g(Handler handler) {
        this.f45158Y = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f45158Y.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f45163k0;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
