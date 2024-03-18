package q;

import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import w.C6053E;

/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    public Object f43261a;

    /* renamed from: b  reason: collision with root package name */
    public Object f43262b;

    /* renamed from: c  reason: collision with root package name */
    public Object f43263c;

    /* renamed from: d  reason: collision with root package name */
    public Object f43264d;

    /* renamed from: e  reason: collision with root package name */
    public Object f43265e;

    /* renamed from: f  reason: collision with root package name */
    public Object f43266f;

    /* renamed from: g  reason: collision with root package name */
    public Object f43267g;

    public D1(Z4.l lVar, WeakReference weakReference) {
        AbstractC3557B.c0("this$0", lVar);
        AbstractC3557B.c0("mGLTextureViewWeakRef", weakReference);
        this.f43267g = lVar;
        this.f43261a = weakReference;
    }

    public final GL a() {
        int i10;
        Z4.i iVar;
        EGLContext eGLContext = (EGLContext) this.f43266f;
        AbstractC3557B.Z(eGLContext);
        GL gl = eGLContext.getGL();
        Z4.l lVar = (Z4.l) ((WeakReference) this.f43261a).get();
        if (lVar != null) {
            int i11 = Z4.l.f23183B0;
            int i12 = lVar.f23202y0;
            if ((i12 & 3) != 0) {
                if ((i12 & 1) != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i12 & 2) != 0) {
                    iVar = new Z4.i();
                } else {
                    iVar = null;
                }
                gl = GLDebugHelper.wrap(gl, i10, iVar);
            }
        }
        AbstractC3557B.b0("gl", gl);
        return gl;
    }

    public final boolean b() {
        if (((Z4.l) this.f43267g).getEnableLogEgl$lib_release()) {
            String str = "createSurface()  tid=" + Thread.currentThread().getId();
            AbstractC3557B.c0("message", str);
            if (Ad.l.f821g) {
                AbstractC3612c.r("EglHelper", str);
            }
        }
        if (((EGL10) this.f43262b) != null) {
            if (((EGLDisplay) this.f43263c) != null) {
                if (((EGLConfig) this.f43265e) != null) {
                    c();
                    Z4.l lVar = (Z4.l) ((WeakReference) this.f43261a).get();
                    EGLSurface eGLSurface = null;
                    if (lVar != null && lVar.f23201x0 != null) {
                        EGL10 egl10 = (EGL10) this.f43262b;
                        EGLDisplay eGLDisplay = (EGLDisplay) this.f43263c;
                        EGLConfig eGLConfig = (EGLConfig) this.f43265e;
                        SurfaceTexture surfaceTexture = lVar.getSurfaceTexture();
                        if (egl10 != null) {
                            try {
                                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
                            } catch (IllegalArgumentException e10) {
                                if (Ad.l.f821g) {
                                    AbstractC3612c.d("GLTextureView", "eglCreateWindowSurface", e10);
                                }
                            }
                        }
                    }
                    this.f43264d = eGLSurface;
                    if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                        EGL10 egl102 = (EGL10) this.f43262b;
                        AbstractC3557B.Z(egl102);
                        EGLSurface eGLSurface2 = (EGLSurface) this.f43264d;
                        if (!egl102.eglMakeCurrent((EGLDisplay) this.f43263c, eGLSurface2, eGLSurface2, (EGLContext) this.f43266f)) {
                            EGL10 egl103 = (EGL10) this.f43262b;
                            AbstractC3557B.Z(egl103);
                            String z10 = r.f.z(egl103.eglGetError(), "eglMakeCurrent");
                            AbstractC3557B.c0("message", z10);
                            if (Ad.l.f821g) {
                                AbstractC3612c.r("EGLHelper", z10);
                            }
                            return false;
                        }
                        return true;
                    }
                    EGL10 egl104 = (EGL10) this.f43262b;
                    AbstractC3557B.Z(egl104);
                    if (egl104.eglGetError() == 12299 && Ad.l.f821g) {
                        AbstractC3612c.c("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                throw new RuntimeException("mEglConfig not initialized");
            }
            throw new RuntimeException("eglDisplay not initialized");
        }
        throw new RuntimeException("egl not initialized");
    }

    public final void c() {
        Object obj = this.f43264d;
        if (((EGLSurface) obj) != null) {
            EGLSurface eGLSurface = (EGLSurface) obj;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                EGL10 egl10 = (EGL10) this.f43262b;
                AbstractC3557B.Z(egl10);
                egl10.eglMakeCurrent((EGLDisplay) this.f43263c, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                Z4.l lVar = (Z4.l) ((WeakReference) this.f43261a).get();
                if (lVar != null && lVar.f23201x0 != null) {
                    EGL10 egl102 = (EGL10) this.f43262b;
                    EGLDisplay eGLDisplay = (EGLDisplay) this.f43263c;
                    EGLSurface eGLSurface3 = (EGLSurface) this.f43264d;
                    if (egl102 != null) {
                        egl102.eglDestroySurface(eGLDisplay, eGLSurface3);
                    }
                }
                this.f43264d = null;
            }
        }
    }

    public final void d() {
        int i10;
        EGLConfig eGLConfig;
        EGLContext eGLContext;
        if (((Z4.l) this.f43267g).getEnableLogEgl$lib_release()) {
            String str = "start() tid=" + Thread.currentThread().getId();
            AbstractC3557B.c0("message", str);
            if (Ad.l.f821g) {
                AbstractC3612c.r("EglHelper", str);
            }
        }
        EGL egl = EGLContext.getEGL();
        if (egl != null) {
            EGL10 egl10 = (EGL10) egl;
            this.f43262b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f43263c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                EGL10 egl102 = (EGL10) this.f43262b;
                AbstractC3557B.Z(egl102);
                if (egl102.eglInitialize((EGLDisplay) this.f43263c, new int[2])) {
                    Z4.l lVar = (Z4.l) ((WeakReference) this.f43261a).get();
                    if (lVar == null) {
                        this.f43265e = null;
                        this.f43266f = null;
                    } else {
                        Z4.d dVar = lVar.f23199v0;
                        if (dVar == null) {
                            eGLConfig = null;
                        } else {
                            EGL10 egl103 = (EGL10) this.f43262b;
                            EGLDisplay eGLDisplay = (EGLDisplay) this.f43263c;
                            Z4.a aVar = (Z4.a) dVar;
                            int[] iArr = new int[1];
                            if (egl103 != null && egl103.eglChooseConfig(eGLDisplay, aVar.f23149a, null, 0, iArr)) {
                                int i11 = iArr[0];
                                if (i11 > 0) {
                                    EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                                    if (egl103.eglChooseConfig(eGLDisplay, aVar.f23149a, eGLConfigArr, i11, iArr)) {
                                        C6053E f02 = com.google.android.gms.internal.play_billing.N.f0(eGLConfigArr);
                                        while (true) {
                                            if (f02.hasNext()) {
                                                eGLConfig = (EGLConfig) f02.next();
                                                int a5 = aVar.a(egl103, eGLDisplay, eGLConfig, 12325);
                                                int a10 = aVar.a(egl103, eGLDisplay, eGLConfig, 12326);
                                                if (a5 >= aVar.f23156h && a10 >= aVar.f23157i) {
                                                    int a11 = aVar.a(egl103, eGLDisplay, eGLConfig, 12324);
                                                    int a12 = aVar.a(egl103, eGLDisplay, eGLConfig, 12323);
                                                    int a13 = aVar.a(egl103, eGLDisplay, eGLConfig, 12322);
                                                    int a14 = aVar.a(egl103, eGLDisplay, eGLConfig, 12321);
                                                    if (a11 == aVar.f23152d && a12 == aVar.f23153e && a13 == aVar.f23154f && a14 == aVar.f23155g) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                eGLConfig = null;
                                                break;
                                            }
                                        }
                                        if (eGLConfig == null) {
                                            throw new IllegalArgumentException("No config chosen");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("eglChooseConfig#2 failed".toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException("No configs match configSpec".toString());
                                }
                            } else {
                                throw new IllegalArgumentException("eglChooseConfig failed".toString());
                            }
                        }
                        this.f43265e = eGLConfig;
                        Z4.e eVar = lVar.f23200w0;
                        if (eVar != null) {
                            EGL10 egl104 = (EGL10) this.f43262b;
                            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f43263c;
                            Z4.b bVar = (Z4.b) eVar;
                            int i12 = bVar.f23160b.f23203z0;
                            int[] iArr2 = {bVar.f23159a, i12, 12344};
                            if (egl104 != null) {
                                EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
                                if (i12 == 0) {
                                    iArr2 = null;
                                }
                                eGLContext = egl104.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext2, iArr2);
                                this.f43266f = eGLContext;
                            }
                        }
                        eGLContext = null;
                        this.f43266f = eGLContext;
                    }
                    EGLContext eGLContext3 = (EGLContext) this.f43266f;
                    if (eGLContext3 != null && eGLContext3 != EGL10.EGL_NO_CONTEXT) {
                        if (((Z4.l) this.f43267g).getEnableLogEgl$lib_release()) {
                            String str2 = "createContext " + ((EGLContext) this.f43266f) + " tid=" + Thread.currentThread().getId();
                            AbstractC3557B.c0("message", str2);
                            if (Ad.l.f821g) {
                                AbstractC3612c.r("EglHelper", str2);
                            }
                        }
                        this.f43264d = null;
                        return;
                    }
                    this.f43266f = null;
                    EGL10 egl105 = (EGL10) this.f43262b;
                    if (egl105 == null) {
                        i10 = -1;
                    } else {
                        i10 = egl105.eglGetError();
                    }
                    throw new RuntimeException(r.f.z(i10, "createContext"));
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
    }

    public final int e() {
        EGL10 egl10 = (EGL10) this.f43262b;
        AbstractC3557B.Z(egl10);
        if (!egl10.eglSwapBuffers((EGLDisplay) this.f43263c, (EGLSurface) this.f43264d)) {
            EGL10 egl102 = (EGL10) this.f43262b;
            AbstractC3557B.Z(egl102);
            return egl102.eglGetError();
        }
        return 12288;
    }
}
