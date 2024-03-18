package J2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import s2.AbstractC5530A;
import s2.RunnableC5537g;

/* loaded from: classes.dex */
public final class l extends Surface {

    /* renamed from: i0  reason: collision with root package name */
    public static int f8796i0;

    /* renamed from: j0  reason: collision with root package name */
    public static boolean f8797j0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f8798Y;

    /* renamed from: Z  reason: collision with root package name */
    public final k f8799Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f8800h0;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f8799Z = kVar;
        this.f8798Y = z10;
    }

    public static synchronized boolean a(Context context) {
        boolean z10;
        int i10;
        synchronized (l.class) {
            try {
                z10 = false;
                if (!f8797j0) {
                    int i11 = AbstractC5530A.f45131a;
                    if (i11 >= 24 && ((i11 >= 26 || (!"samsung".equals(AbstractC5530A.f45133c) && !"XT1650".equals(AbstractC5530A.f45134d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && s2.h.l("EGL_EXT_protected_content")))) {
                        if (i11 >= 17 && s2.h.l("EGL_KHR_surfaceless_context")) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        f8796i0 = i10;
                        f8797j0 = true;
                    }
                    i10 = 0;
                    f8796i0 = i10;
                    f8797j0 = true;
                }
                if (f8796i0 != 0) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.os.HandlerThread, java.lang.Thread, J2.k, android.os.Handler$Callback, java.lang.Object] */
    public static l c(Context context, boolean z10) {
        boolean z11;
        int i10;
        boolean z12 = false;
        if (z10 && !a(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        Gi.e.n(z11);
        ?? handlerThread = new HandlerThread("ExoPlayer:PlaceholderSurface");
        if (z10) {
            i10 = f8796i0;
        } else {
            i10 = 0;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), handlerThread);
        handlerThread.f8792Z = handler;
        handlerThread.f8791Y = new RunnableC5537g(handler);
        synchronized (handlerThread) {
            handlerThread.f8792Z.obtainMessage(1, i10, 0).sendToTarget();
            while (handlerThread.f8795j0 == null && handlerThread.f8794i0 == null && handlerThread.f8793h0 == null) {
                try {
                    handlerThread.wait();
                } catch (InterruptedException unused) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThread.f8794i0;
        if (runtimeException == null) {
            Error error = handlerThread.f8793h0;
            if (error == null) {
                l lVar = handlerThread.f8795j0;
                lVar.getClass();
                return lVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f8799Z) {
            try {
                if (!this.f8800h0) {
                    k kVar = this.f8799Z;
                    kVar.f8792Z.getClass();
                    kVar.f8792Z.sendEmptyMessage(2);
                    this.f8800h0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
