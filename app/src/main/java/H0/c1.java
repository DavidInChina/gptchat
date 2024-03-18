package H0;

import G0.C0571a;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import b0.C2104h;
import id.AbstractC3557B;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import nf.AbstractC4828h;
import q0.C5250b;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5352p;
import r0.C5335B;
import r0.C5339c;
import wf.AbstractC6216a;
import z.C6672L;

/* loaded from: classes2.dex */
public final class c1 extends View implements G0.n0 {

    /* renamed from: A0  reason: collision with root package name */
    public static boolean f6911A0;

    /* renamed from: w0  reason: collision with root package name */
    public static final Z0 f6912w0 = new Z0(0);

    /* renamed from: x0  reason: collision with root package name */
    public static Method f6913x0;

    /* renamed from: y0  reason: collision with root package name */
    public static Field f6914y0;

    /* renamed from: z0  reason: collision with root package name */
    public static boolean f6915z0;

    /* renamed from: h0  reason: collision with root package name */
    public final C0714y f6916h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C0713x0 f6917i0;

    /* renamed from: j0  reason: collision with root package name */
    public wf.k f6918j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC6216a f6919k0;

    /* renamed from: l0  reason: collision with root package name */
    public final I0 f6920l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6921m0;

    /* renamed from: n0  reason: collision with root package name */
    public Rect f6922n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f6923o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f6924p0;

    /* renamed from: q0  reason: collision with root package name */
    public final F4.a f6925q0 = new F4.a(7);

    /* renamed from: r0  reason: collision with root package name */
    public final F0 f6926r0 = new F0(N.f6781j0);

    /* renamed from: s0  reason: collision with root package name */
    public long f6927s0 = r0.P.f44225b;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f6928t0 = true;

    /* renamed from: u0  reason: collision with root package name */
    public final long f6929u0 = View.generateViewId();

    /* renamed from: v0  reason: collision with root package name */
    public int f6930v0;

    public c1(C0714y c0714y, C0713x0 c0713x0, C0571a c0571a, C6672L c6672l) {
        super(c0714y.getContext());
        this.f6916h0 = c0714y;
        this.f6917i0 = c0713x0;
        this.f6918j0 = c0571a;
        this.f6919k0 = c6672l;
        this.f6920l0 = new I0(c0714y.getDensity());
        setWillNotDraw(false);
        c0713x0.addView(this);
    }

    private final r0.E getManualClipPath() {
        if (getClipToOutline()) {
            I0 i02 = this.f6920l0;
            if (!(!i02.f6750i)) {
                i02.e();
                return i02.f6748g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f6923o0) {
            this.f6923o0 = z10;
            this.f6916h0.q(this, z10);
        }
    }

    @Override // G0.n0
    public final void a(C6672L c6672l, C0571a c0571a) {
        this.f6917i0.addView(this);
        this.f6921m0 = false;
        this.f6924p0 = false;
        this.f6927s0 = r0.P.f44225b;
        this.f6918j0 = c0571a;
        this.f6919k0 = c6672l;
    }

    @Override // G0.n0
    public final void b(float[] fArr) {
        C5335B.e(fArr, this.f6926r0.b(this));
    }

    @Override // G0.n0
    public final void c(C5250b c5250b, boolean z10) {
        F0 f02 = this.f6926r0;
        if (z10) {
            float[] a5 = f02.a(this);
            if (a5 != null) {
                C5335B.c(a5, c5250b);
                return;
            }
            c5250b.f43615a = 0.0f;
            c5250b.f43616b = 0.0f;
            c5250b.f43617c = 0.0f;
            c5250b.f43618d = 0.0f;
            return;
        }
        C5335B.c(f02.b(this), c5250b);
    }

    @Override // G0.n0
    public final boolean d(long j6) {
        float d10 = C5251c.d(j6);
        float e10 = C5251c.e(j6);
        if (this.f6921m0) {
            if (0.0f <= d10 && d10 < getWidth() && 0.0f <= e10 && e10 < getHeight()) {
                return true;
            }
            return false;
        } else if (!getClipToOutline()) {
            return true;
        } else {
            return this.f6920l0.c(j6);
        }
    }

    @Override // G0.n0
    public final void destroy() {
        g1 g1Var;
        Reference poll;
        C2104h c2104h;
        setInvalidated(false);
        C0714y c0714y = this.f6916h0;
        c0714y.f7074C0 = true;
        this.f6918j0 = null;
        this.f6919k0 = null;
        do {
            g1Var = c0714y.f7122q1;
            poll = g1Var.f6957b.poll();
            c2104h = g1Var.f6956a;
            if (poll != null) {
                c2104h.m(poll);
                continue;
            }
        } while (poll != null);
        c2104h.b(new WeakReference(this, g1Var.f6957b));
        this.f6917i0.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        F4.a aVar = this.f6925q0;
        Object obj = aVar.f5033Z;
        Canvas canvas2 = ((C5339c) obj).f44230a;
        ((C5339c) obj).f44230a = canvas;
        C5339c c5339c = (C5339c) obj;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            c5339c.h();
            this.f6920l0.a(c5339c);
            z10 = true;
        }
        wf.k kVar = this.f6918j0;
        if (kVar != null) {
            kVar.invoke(c5339c);
        }
        if (z10) {
            c5339c.q();
        }
        ((C5339c) aVar.f5033Z).f44230a = canvas2;
        setInvalidated(false);
    }

    @Override // G0.n0
    public final long e(long j6, boolean z10) {
        F0 f02 = this.f6926r0;
        if (z10) {
            float[] a5 = f02.a(this);
            if (a5 != null) {
                return C5335B.b(j6, a5);
            }
            return C5251c.f43620c;
        }
        return C5335B.b(j6, f02.b(this));
    }

    @Override // G0.n0
    public final void f(long j6) {
        Z0 z02;
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        if (i10 != getWidth() || i11 != getHeight()) {
            float f6 = i10;
            setPivotX(r0.P.a(this.f6927s0) * f6);
            float f10 = i11;
            setPivotY(r0.P.b(this.f6927s0) * f10);
            long i12 = AbstractC4828h.i(f6, f10);
            I0 i02 = this.f6920l0;
            if (!C5254f.a(i02.f6745d, i12)) {
                i02.f6745d = i12;
                i02.f6749h = true;
            }
            if (i02.b() != null) {
                z02 = f6912w0;
            } else {
                z02 = null;
            }
            setOutlineProvider(z02);
            layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
            l();
            this.f6926r0.c();
        }
    }

    @Override // G0.n0
    public final void g(r0.I i10, Z0.l lVar, Z0.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC6216a abstractC6216a;
        Z0 z02;
        boolean z13;
        int i11 = i10.f44181Y | this.f6930v0;
        if ((i11 & 4096) != 0) {
            long j6 = i10.f44194s0;
            this.f6927s0 = j6;
            setPivotX(r0.P.a(j6) * getWidth());
            setPivotY(r0.P.b(this.f6927s0) * getHeight());
        }
        if ((i11 & 1) != 0) {
            setScaleX(i10.f44182Z);
        }
        if ((i11 & 2) != 0) {
            setScaleY(i10.f44183h0);
        }
        if ((i11 & 4) != 0) {
            setAlpha(i10.f44184i0);
        }
        if ((i11 & 8) != 0) {
            setTranslationX(i10.f44185j0);
        }
        if ((i11 & 16) != 0) {
            setTranslationY(i10.f44186k0);
        }
        if ((i11 & 32) != 0) {
            setElevation(i10.f44187l0);
        }
        if ((i11 & 1024) != 0) {
            setRotation(i10.f44192q0);
        }
        if ((i11 & 256) != 0) {
            setRotationX(i10.f44190o0);
        }
        if ((i11 & 512) != 0) {
            setRotationY(i10.f44191p0);
        }
        if ((i11 & 2048) != 0) {
            setCameraDistancePx(i10.f44193r0);
        }
        boolean z14 = true;
        if (getManualClipPath() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z15 = i10.f44196u0;
        r0.F f6 = r0.G.f44171a;
        if (z15 && i10.f44195t0 != f6) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((i11 & 24576) != 0) {
            if (z15 && i10.f44195t0 == f6) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f6921m0 = z13;
            l();
            setClipToOutline(z11);
        }
        boolean d10 = this.f6920l0.d(i10.f44195t0, i10.f44184i0, z11, i10.f44187l0, lVar, bVar);
        I0 i02 = this.f6920l0;
        if (i02.f6749h) {
            if (i02.b() != null) {
                z02 = f6912w0;
            } else {
                z02 = null;
            }
            setOutlineProvider(z02);
        }
        if (getManualClipPath() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12 || (z12 && d10)) {
            invalidate();
        }
        if (!this.f6924p0 && getElevation() > 0.0f && (abstractC6216a = this.f6919k0) != null) {
            abstractC6216a.mo122invoke();
        }
        if ((i11 & 7963) != 0) {
            this.f6926r0.c();
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            int i13 = i11 & 64;
            e1 e1Var = e1.f6949a;
            if (i13 != 0) {
                e1Var.a(this, androidx.compose.ui.graphics.a.s(i10.f44188m0));
            }
            if ((i11 & 128) != 0) {
                e1Var.b(this, androidx.compose.ui.graphics.a.s(i10.f44189n0));
            }
        }
        if (i12 >= 31 && (131072 & i11) != 0) {
            f1.f6953a.a(this, null);
        }
        if ((i11 & 32768) != 0) {
            int i14 = i10.f44197v0;
            if (r0.G.c(i14, 1)) {
                setLayerType(2, null);
            } else if (r0.G.c(i14, 2)) {
                setLayerType(0, null);
                z14 = false;
            } else {
                setLayerType(0, null);
            }
            this.f6928t0 = z14;
        }
        this.f6930v0 = i10.f44181Y;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0713x0 getContainer() {
        return this.f6917i0;
    }

    public long getLayerId() {
        return this.f6929u0;
    }

    public final C0714y getOwnerView() {
        return this.f6916h0;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b1.a(this.f6916h0);
        }
        return -1L;
    }

    @Override // G0.n0
    public final void h(float[] fArr) {
        float[] a5 = this.f6926r0.a(this);
        if (a5 != null) {
            C5335B.e(fArr, a5);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f6928t0;
    }

    @Override // G0.n0
    public final void i(AbstractC5352p abstractC5352p) {
        boolean z10;
        if (getElevation() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6924p0 = z10;
        if (z10) {
            abstractC5352p.u();
        }
        this.f6917i0.a(abstractC5352p, this, getDrawingTime());
        if (this.f6924p0) {
            abstractC5352p.i();
        }
    }

    @Override // android.view.View, G0.n0
    public final void invalidate() {
        if (!this.f6923o0) {
            setInvalidated(true);
            super.invalidate();
            this.f6916h0.invalidate();
        }
    }

    @Override // G0.n0
    public final void j(long j6) {
        int i10 = Z0.i.f22798c;
        int i11 = (int) (j6 >> 32);
        int left = getLeft();
        F0 f02 = this.f6926r0;
        if (i11 != left) {
            offsetLeftAndRight(i11 - getLeft());
            f02.c();
        }
        int i12 = (int) (j6 & 4294967295L);
        if (i12 != getTop()) {
            offsetTopAndBottom(i12 - getTop());
            f02.c();
        }
    }

    @Override // G0.n0
    public final void k() {
        if (this.f6923o0 && !f6911A0) {
            B0.f(this);
            setInvalidated(false);
        }
    }

    public final void l() {
        Rect rect;
        if (this.f6921m0) {
            Rect rect2 = this.f6922n0;
            if (rect2 == null) {
                this.f6922n0 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                AbstractC3557B.Z(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f6922n0;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f6) {
        setCameraDistance(f6 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
