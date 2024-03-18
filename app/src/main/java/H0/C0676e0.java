package H0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import jf.C3963m;
import kf.C4288m;
import nf.AbstractC4831k;

/* renamed from: H0.e0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0676e0 extends Ng.B {

    /* renamed from: q0  reason: collision with root package name */
    public static final C3963m f6937q0 = R4.b.D1(P.f6853o0);

    /* renamed from: r0  reason: collision with root package name */
    public static final C0672c0 f6938r0 = new C0672c0(0);

    /* renamed from: Z  reason: collision with root package name */
    public final Choreographer f6939Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Handler f6940h0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6945m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6946n0;

    /* renamed from: p0  reason: collision with root package name */
    public final C0680g0 f6948p0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f6941i0 = new Object();

    /* renamed from: j0  reason: collision with root package name */
    public final C4288m f6942j0 = new C4288m();

    /* renamed from: k0  reason: collision with root package name */
    public List f6943k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    public List f6944l0 = new ArrayList();

    /* renamed from: o0  reason: collision with root package name */
    public final Choreographer$FrameCallbackC0674d0 f6947o0 = new Choreographer$FrameCallbackC0674d0(this);

    public C0676e0(Choreographer choreographer, Handler handler) {
        this.f6939Z = choreographer;
        this.f6940h0 = handler;
        this.f6948p0 = new C0680g0(choreographer, this);
    }

    public static final void w0(C0676e0 c0676e0) {
        boolean z10;
        do {
            Runnable F02 = c0676e0.F0();
            while (F02 != null) {
                F02.run();
                F02 = c0676e0.F0();
            }
            synchronized (c0676e0.f6941i0) {
                if (c0676e0.f6942j0.isEmpty()) {
                    z10 = false;
                    c0676e0.f6945m0 = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    public final Runnable F0() {
        Object obj;
        Runnable runnable;
        synchronized (this.f6941i0) {
            C4288m c4288m = this.f6942j0;
            if (c4288m.isEmpty()) {
                obj = null;
            } else {
                obj = c4288m.removeFirst();
            }
            runnable = (Runnable) obj;
        }
        return runnable;
    }

    @Override // Ng.B
    public final void r(AbstractC4831k abstractC4831k, Runnable runnable) {
        synchronized (this.f6941i0) {
            this.f6942j0.addLast(runnable);
            if (!this.f6945m0) {
                this.f6945m0 = true;
                this.f6940h0.post(this.f6947o0);
                if (!this.f6946n0) {
                    this.f6946n0 = true;
                    this.f6939Z.postFrameCallback(this.f6947o0);
                }
            }
        }
    }
}
