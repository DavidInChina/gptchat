package v4;

import G4.t;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.C5241w;
import w4.C6119a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class l extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: R0  reason: collision with root package name */
    public static final boolean f47188R0;

    /* renamed from: S0  reason: collision with root package name */
    public static final List f47189S0;

    /* renamed from: T0  reason: collision with root package name */
    public static final ThreadPoolExecutor f47190T0;

    /* renamed from: A0  reason: collision with root package name */
    public RectF f47191A0;

    /* renamed from: B0  reason: collision with root package name */
    public C6119a f47192B0;

    /* renamed from: C0  reason: collision with root package name */
    public Rect f47193C0;

    /* renamed from: D0  reason: collision with root package name */
    public Rect f47194D0;

    /* renamed from: E0  reason: collision with root package name */
    public RectF f47195E0;

    /* renamed from: F0  reason: collision with root package name */
    public RectF f47196F0;

    /* renamed from: G0  reason: collision with root package name */
    public Matrix f47197G0;

    /* renamed from: H0  reason: collision with root package name */
    public Matrix f47198H0;

    /* renamed from: K0  reason: collision with root package name */
    public Handler f47201K0;

    /* renamed from: L0  reason: collision with root package name */
    public h f47202L0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f47207Q0;

    /* renamed from: Y  reason: collision with root package name */
    public C5971a f47208Y;

    /* renamed from: Z  reason: collision with root package name */
    public final I4.d f47209Z;

    /* renamed from: k0  reason: collision with root package name */
    public A4.a f47213k0;

    /* renamed from: l0  reason: collision with root package name */
    public C5241w f47214l0;

    /* renamed from: m0  reason: collision with root package name */
    public Map f47215m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f47216n0;

    /* renamed from: q0  reason: collision with root package name */
    public E4.c f47219q0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f47221s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f47222t0;

    /* renamed from: x0  reason: collision with root package name */
    public Bitmap f47226x0;

    /* renamed from: y0  reason: collision with root package name */
    public Canvas f47227y0;

    /* renamed from: z0  reason: collision with root package name */
    public Rect f47228z0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f47210h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f47211i0 = false;

    /* renamed from: O0  reason: collision with root package name */
    public int f47205O0 = 1;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f47212j0 = new ArrayList();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f47217o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f47218p0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public int f47220r0 = 255;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f47223u0 = false;

    /* renamed from: P0  reason: collision with root package name */
    public int f47206P0 = 1;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f47224v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public final Matrix f47225w0 = new Matrix();

    /* renamed from: I0  reason: collision with root package name */
    public boolean f47199I0 = false;

    /* renamed from: J0  reason: collision with root package name */
    public final Semaphore f47200J0 = new Semaphore(1);

    /* renamed from: M0  reason: collision with root package name */
    public final h f47203M0 = new h(this, 0);

    /* renamed from: N0  reason: collision with root package name */
    public float f47204N0 = -3.4028235E38f;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        f47188R0 = z10;
        f47189S0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f47190T0 = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new I4.c());
    }

    public l() {
        I4.d dVar = new I4.d();
        this.f47209Z = dVar;
        g gVar = new g(0, this);
        dVar.addUpdateListener(gVar);
    }

    public static void c(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void a() {
        C5971a c5971a = this.f47208Y;
        if (c5971a == null) {
            return;
        }
        U3.c cVar = t.f6030a;
        Rect rect = c5971a.f47158k;
        E4.c cVar2 = new E4.c(this, new E4.e(Collections.emptyList(), c5971a, "__container", -1L, 1, -1L, null, Collections.emptyList(), new C4.e(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null, 1), c5971a.f47157j, c5971a);
        this.f47219q0 = cVar2;
        if (this.f47221s0) {
            cVar2.n(true);
        }
        this.f47219q0.f4465I = this.f47218p0;
    }

    public final void b() {
        C5971a c5971a = this.f47208Y;
        if (c5971a == null) {
            return;
        }
        int i10 = this.f47206P0;
        int i11 = Build.VERSION.SDK_INT;
        boolean z10 = c5971a.f47162o;
        int i12 = c5971a.f47163p;
        int f6 = AbstractC6708l.f(i10);
        boolean z11 = false;
        if (f6 != 1 && (f6 == 2 || ((z10 && i11 < 28) || i12 > 4 || i11 <= 25))) {
            z11 = true;
        }
        this.f47224v0 = z11;
    }

    public final void d(Canvas canvas) {
        E4.c cVar = this.f47219q0;
        C5971a c5971a = this.f47208Y;
        if (cVar != null && c5971a != null) {
            Matrix matrix = this.f47225w0;
            matrix.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                matrix.preScale(bounds.width() / c5971a.f47158k.width(), bounds.height() / c5971a.f47158k.height());
                matrix.preTranslate(bounds.left, bounds.top);
            }
            cVar.e(canvas, matrix, this.f47220r0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        E4.c cVar = this.f47219q0;
        if (cVar == null) {
            return;
        }
        int i10 = this.f47207Q0;
        if (i10 != 0 && i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ThreadPoolExecutor threadPoolExecutor = f47190T0;
        Semaphore semaphore = this.f47200J0;
        h hVar = this.f47203M0;
        I4.d dVar = this.f47209Z;
        if (z10) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (z10) {
                    semaphore.release();
                    if (cVar.f4464H == dVar.d()) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    semaphore.release();
                    if (cVar.f4464H != dVar.d()) {
                        threadPoolExecutor.execute(hVar);
                    }
                }
                throw th2;
            }
        }
        if (z10 && j()) {
            i(dVar.d());
        }
        if (this.f47211i0) {
            try {
                if (this.f47224v0) {
                    f(canvas, cVar);
                } else {
                    d(canvas);
                }
            } catch (Throwable unused2) {
                I4.b.f8035a.getClass();
            }
        } else if (this.f47224v0) {
            f(canvas, cVar);
        } else {
            d(canvas);
        }
        this.f47199I0 = false;
        if (z10) {
            semaphore.release();
            if (cVar.f4464H == dVar.d()) {
                return;
            }
            threadPoolExecutor.execute(hVar);
        }
    }

    public final void e() {
        float f6;
        float f10;
        if (this.f47219q0 == null) {
            this.f47212j0.add(new f(this, 1));
            return;
        }
        b();
        boolean z10 = this.f47210h0;
        I4.d dVar = this.f47209Z;
        if (z10 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.f8052r0 = true;
                boolean h10 = dVar.h();
                Iterator it = dVar.f8041Z.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(dVar, h10);
                    } else {
                        animatorListener.onAnimationStart(dVar);
                    }
                }
                if (dVar.h()) {
                    f10 = dVar.e();
                } else {
                    f10 = dVar.f();
                }
                dVar.r((int) f10);
                dVar.f8045k0 = 0L;
                dVar.f8048n0 = 0;
                if (dVar.f8052r0) {
                    dVar.m(false);
                    Choreographer.getInstance().postFrameCallback(dVar);
                }
                this.f47205O0 = 1;
            } else {
                this.f47205O0 = 2;
            }
        }
        if (!z10) {
            B4.f fVar = null;
            for (String str : f47189S0) {
                C5971a c5971a = this.f47208Y;
                int size = c5971a.f47154g.size();
                for (int i10 = 0; i10 < size; i10++) {
                    B4.f fVar2 = (B4.f) c5971a.f47154g.get(i10);
                    String str2 = fVar2.f1863a;
                    if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                        fVar = fVar2;
                        continue;
                        break;
                    }
                }
                fVar = null;
                continue;
                if (fVar != null) {
                    break;
                }
            }
            if (fVar != null) {
                h((int) fVar.f1864b);
            } else {
                if (dVar.f8043i0 < 0.0f) {
                    f6 = dVar.f();
                } else {
                    f6 = dVar.e();
                }
                h((int) f6);
            }
            dVar.m(true);
            dVar.i(dVar.h());
            if (!isVisible()) {
                this.f47205O0 = 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e3, code lost:
        if ((!((android.view.ViewGroup) r3).getClipChildren()) != false) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v32, types: [w4.a, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas, E4.c cVar) {
        if (this.f47208Y != null) {
            if (this.f47227y0 == null) {
                this.f47227y0 = new Canvas();
                this.f47196F0 = new RectF();
                this.f47197G0 = new Matrix();
                this.f47198H0 = new Matrix();
                this.f47228z0 = new Rect();
                this.f47191A0 = new RectF();
                this.f47192B0 = new Paint();
                this.f47193C0 = new Rect();
                this.f47194D0 = new Rect();
                this.f47195E0 = new RectF();
            }
            canvas.getMatrix(this.f47197G0);
            canvas.getClipBounds(this.f47228z0);
            Rect rect = this.f47228z0;
            this.f47191A0.set(rect.left, rect.top, rect.right, rect.bottom);
            this.f47197G0.mapRect(this.f47191A0);
            c(this.f47191A0, this.f47228z0);
            if (this.f47218p0) {
                this.f47196F0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
            } else {
                cVar.c(this.f47196F0, null, false);
            }
            this.f47197G0.mapRect(this.f47196F0);
            Rect bounds = getBounds();
            float width = bounds.width() / getIntrinsicWidth();
            float height = bounds.height() / getIntrinsicHeight();
            RectF rectF = this.f47196F0;
            rectF.set(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
            Drawable.Callback callback = getCallback();
            if (callback instanceof View) {
                ViewParent parent = ((View) callback).getParent();
                if (parent instanceof ViewGroup) {
                }
            }
            RectF rectF2 = this.f47196F0;
            Rect rect2 = this.f47228z0;
            rectF2.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
            int ceil = (int) Math.ceil(this.f47196F0.width());
            int ceil2 = (int) Math.ceil(this.f47196F0.height());
            if (ceil > 0 && ceil2 > 0) {
                Bitmap bitmap = this.f47226x0;
                if (bitmap != null && bitmap.getWidth() >= ceil && this.f47226x0.getHeight() >= ceil2) {
                    if (this.f47226x0.getWidth() > ceil || this.f47226x0.getHeight() > ceil2) {
                        Bitmap createBitmap = Bitmap.createBitmap(this.f47226x0, 0, 0, ceil, ceil2);
                        this.f47226x0 = createBitmap;
                        this.f47227y0.setBitmap(createBitmap);
                        this.f47199I0 = true;
                    }
                } else {
                    Bitmap createBitmap2 = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.f47226x0 = createBitmap2;
                    this.f47227y0.setBitmap(createBitmap2);
                    this.f47199I0 = true;
                }
                if (this.f47199I0) {
                    Matrix matrix = this.f47225w0;
                    matrix.set(this.f47197G0);
                    matrix.preScale(width, height);
                    RectF rectF3 = this.f47196F0;
                    matrix.postTranslate(-rectF3.left, -rectF3.top);
                    this.f47226x0.eraseColor(0);
                    cVar.e(this.f47227y0, matrix, this.f47220r0);
                    this.f47197G0.invert(this.f47198H0);
                    this.f47198H0.mapRect(this.f47195E0, this.f47196F0);
                    c(this.f47195E0, this.f47194D0);
                }
                this.f47193C0.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f47226x0, this.f47193C0, this.f47194D0, this.f47192B0);
            }
        }
    }

    public final void g() {
        float f6;
        if (this.f47219q0 == null) {
            this.f47212j0.add(new f(this, 0));
            return;
        }
        b();
        boolean z10 = this.f47210h0;
        I4.d dVar = this.f47209Z;
        if (z10 || dVar.getRepeatCount() == 0) {
            if (isVisible()) {
                dVar.f8052r0 = true;
                dVar.m(false);
                Choreographer.getInstance().postFrameCallback(dVar);
                dVar.f8045k0 = 0L;
                if (dVar.h() && dVar.f8047m0 == dVar.f()) {
                    dVar.r(dVar.e());
                } else if (!dVar.h() && dVar.f8047m0 == dVar.e()) {
                    dVar.r(dVar.f());
                }
                Iterator it = dVar.f8042h0.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(dVar);
                }
                this.f47205O0 = 1;
            } else {
                this.f47205O0 = 3;
            }
        }
        if (!z10) {
            if (dVar.f8043i0 < 0.0f) {
                f6 = dVar.f();
            } else {
                f6 = dVar.e();
            }
            h((int) f6);
            dVar.m(true);
            dVar.i(dVar.h());
            if (!isVisible()) {
                this.f47205O0 = 1;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f47220r0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C5971a c5971a = this.f47208Y;
        if (c5971a == null) {
            return -1;
        }
        return c5971a.f47158k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C5971a c5971a = this.f47208Y;
        if (c5971a == null) {
            return -1;
        }
        return c5971a.f47158k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(final int i10) {
        if (this.f47208Y == null) {
            this.f47212j0.add(new k() { // from class: v4.j
                @Override // v4.k
                public final void run() {
                    l.this.h(i10);
                }
            });
        } else {
            this.f47209Z.r(i10);
        }
    }

    public final void i(final float f6) {
        C5971a c5971a = this.f47208Y;
        if (c5971a == null) {
            this.f47212j0.add(new k() { // from class: v4.i
                @Override // v4.k
                public final void run() {
                    l.this.i(f6);
                }
            });
            return;
        }
        this.f47209Z.r(I4.f.d(c5971a.f47159l, c5971a.f47160m, f6));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f47199I0) {
            return;
        }
        this.f47199I0 = true;
        if ((!f47188R0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        I4.d dVar = this.f47209Z;
        if (dVar == null) {
            return false;
        }
        return dVar.f8052r0;
    }

    public final boolean j() {
        C5971a c5971a = this.f47208Y;
        if (c5971a == null) {
            return false;
        }
        float f6 = this.f47204N0;
        float d10 = this.f47209Z.d();
        this.f47204N0 = d10;
        if (Math.abs(d10 - f6) * c5971a.b() < 50.0f) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f47220r0 = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        I4.b.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.f47205O0;
            if (i10 == 2) {
                e();
            } else if (i10 == 3) {
                g();
            }
        } else {
            I4.d dVar = this.f47209Z;
            if (dVar.f8052r0) {
                this.f47212j0.clear();
                dVar.m(true);
                Iterator it = dVar.f8042h0.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(dVar);
                }
                if (!isVisible()) {
                    this.f47205O0 = 1;
                }
                this.f47205O0 = 3;
            } else if (!z12) {
                this.f47205O0 = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        e();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f47212j0.clear();
        I4.d dVar = this.f47209Z;
        dVar.m(true);
        dVar.i(dVar.h());
        if (!isVisible()) {
            this.f47205O0 = 1;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
