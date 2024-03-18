package n;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import g.RunnableC3118k;
import q1.AbstractC5260f;
import t1.AbstractC5655a;
import t1.AbstractC5656b;
import t1.AbstractC5657c;

/* renamed from: n.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4698i extends Drawable implements Drawable.Callback {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f39564r0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC4697h f39565Y;

    /* renamed from: Z  reason: collision with root package name */
    public Rect f39566Z;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f39567h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f39568i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f39569j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f39570k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f39571l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f39572m0;

    /* renamed from: n0  reason: collision with root package name */
    public RunnableC3118k f39573n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f39574o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f39575p0;

    /* renamed from: q0  reason: collision with root package name */
    public C4696g f39576q0;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        boolean z12 = true;
        this.f39570k0 = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f39567h0;
        if (drawable2 != null) {
            long j6 = this.f39574o0;
            if (j6 != 0) {
                if (j6 <= uptimeMillis) {
                    drawable2.setAlpha(this.f39569j0);
                    this.f39574o0 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j6 - uptimeMillis) * 255)) / this.f39565Y.f39562y)) * this.f39569j0) / 255);
                    z11 = true;
                    drawable = this.f39568i0;
                    if (drawable == null) {
                        long j10 = this.f39575p0;
                        if (j10 != 0) {
                            if (j10 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.f39568i0 = null;
                                this.f39575p0 = 0L;
                            } else {
                                drawable.setAlpha(((((int) ((j10 - uptimeMillis) * 255)) / this.f39565Y.f39563z) * this.f39569j0) / 255);
                                if (z10 && z12) {
                                    scheduleSelf(this.f39573n0, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.f39575p0 = 0L;
                    }
                    z12 = z11;
                    if (z10) {
                        return;
                    }
                    return;
                }
            }
        } else {
            this.f39574o0 = 0L;
        }
        z11 = false;
        drawable = this.f39568i0;
        if (drawable == null) {
        }
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (theme != null) {
            abstractC4697h.c();
            int i10 = abstractC4697h.f39545h;
            Drawable[] drawableArr = abstractC4697h.f39544g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null && AbstractC5656b.b(drawable)) {
                    AbstractC5656b.a(drawableArr[i11], theme);
                    abstractC4697h.f39542e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                abstractC4697h.f39539b = resources;
                int i12 = resources.getDisplayMetrics().densityDpi;
                if (i12 == 0) {
                    i12 = 160;
                }
                int i13 = abstractC4697h.f39540c;
                abstractC4697h.f39540c = i12;
                if (i13 != i12) {
                    abstractC4697h.f39550m = false;
                    abstractC4697h.f39547j = false;
                    return;
                }
                return;
            }
            return;
        }
        abstractC4697h.getClass();
    }

    public final void b(Drawable drawable) {
        if (this.f39576q0 == null) {
            this.f39576q0 = new C4696g();
        }
        C4696g c4696g = this.f39576q0;
        c4696g.f39530Z = drawable.getCallback();
        drawable.setCallback(c4696g);
        try {
            if (this.f39565Y.f39562y <= 0 && this.f39570k0) {
                drawable.setAlpha(this.f39569j0);
            }
            AbstractC4697h abstractC4697h = this.f39565Y;
            if (abstractC4697h.f39533C) {
                drawable.setColorFilter(abstractC4697h.f39532B);
            } else {
                if (abstractC4697h.f39536F) {
                    AbstractC5656b.h(drawable, abstractC4697h.f39534D);
                }
                AbstractC4697h abstractC4697h2 = this.f39565Y;
                if (abstractC4697h2.f39537G) {
                    AbstractC5656b.i(drawable, abstractC4697h2.f39535E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f39565Y.f39560w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            AbstractC5657c.b(drawable, AbstractC5657c.a(this));
            AbstractC5655a.e(drawable, this.f39565Y.f39531A);
            Rect rect = this.f39566Z;
            if (rect != null) {
                AbstractC5656b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C4696g c4696g2 = this.f39576q0;
            c4696g2.f39530Z = null;
            drawable.setCallback((Drawable.Callback) c4696g2.f39530Z);
        } catch (Throwable th2) {
            C4696g c4696g3 = this.f39576q0;
            c4696g3.f39530Z = null;
            drawable.setCallback((Drawable.Callback) c4696g3.f39530Z);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i10) {
        RunnableC3118k runnableC3118k;
        if (i10 == this.f39571l0) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f39565Y.f39563z > 0) {
            Drawable drawable = this.f39568i0;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f39567h0;
            if (drawable2 != null) {
                this.f39568i0 = drawable2;
                this.f39575p0 = this.f39565Y.f39563z + uptimeMillis;
            } else {
                this.f39568i0 = null;
                this.f39575p0 = 0L;
            }
        } else {
            Drawable drawable3 = this.f39567h0;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            AbstractC4697h abstractC4697h = this.f39565Y;
            if (i10 < abstractC4697h.f39545h) {
                Drawable d10 = abstractC4697h.d(i10);
                this.f39567h0 = d10;
                this.f39571l0 = i10;
                if (d10 != null) {
                    int i11 = this.f39565Y.f39562y;
                    if (i11 > 0) {
                        this.f39574o0 = uptimeMillis + i11;
                    }
                    b(d10);
                }
                if (this.f39574o0 == 0 || this.f39575p0 != 0) {
                    runnableC3118k = this.f39573n0;
                    if (runnableC3118k != null) {
                        this.f39573n0 = new RunnableC3118k(1, this);
                    } else {
                        unscheduleSelf(runnableC3118k);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f39567h0 = null;
        this.f39571l0 = -1;
        if (this.f39574o0 == 0) {
        }
        runnableC3118k = this.f39573n0;
        if (runnableC3118k != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f39565Y.canApplyTheme();
    }

    public abstract void d(C4691b c4691b);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f39568i0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f39569j0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f39565Y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39558u) {
            if (!abstractC4697h.f39559v) {
                return null;
            }
        } else {
            abstractC4697h.c();
            abstractC4697h.f39558u = true;
            int i10 = abstractC4697h.f39545h;
            Drawable[] drawableArr = abstractC4697h.f39544g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    abstractC4697h.f39559v = false;
                    return null;
                }
            }
            abstractC4697h.f39559v = true;
        }
        this.f39565Y.f39541d = getChangingConfigurations();
        return this.f39565Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f39567h0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f39566Z;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39549l) {
            if (!abstractC4697h.f39550m) {
                abstractC4697h.b();
            }
            return abstractC4697h.f39552o;
        }
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39549l) {
            if (!abstractC4697h.f39550m) {
                abstractC4697h.b();
            }
            return abstractC4697h.f39551n;
        }
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39549l) {
            if (!abstractC4697h.f39550m) {
                abstractC4697h.b();
            }
            return abstractC4697h.f39554q;
        }
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39549l) {
            if (!abstractC4697h.f39550m) {
                abstractC4697h.b();
            }
            return abstractC4697h.f39553p;
        }
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f39567h0;
        int i10 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39555r) {
            return abstractC4697h.f39556s;
        }
        abstractC4697h.c();
        int i11 = abstractC4697h.f39545h;
        Drawable[] drawableArr = abstractC4697h.f39544g;
        if (i11 > 0) {
            i10 = drawableArr[0].getOpacity();
        }
        for (int i12 = 1; i12 < i11; i12++) {
            i10 = Drawable.resolveOpacity(i10, drawableArr[i12].getOpacity());
        }
        abstractC4697h.f39556s = i10;
        abstractC4697h.f39555r = true;
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        boolean z10 = false;
        Rect rect2 = null;
        if (!abstractC4697h.f39546i) {
            Rect rect3 = abstractC4697h.f39548k;
            if (rect3 == null && !abstractC4697h.f39547j) {
                abstractC4697h.c();
                Rect rect4 = new Rect();
                int i10 = abstractC4697h.f39545h;
                Drawable[] drawableArr = abstractC4697h.f39544g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                abstractC4697h.f39547j = true;
                abstractC4697h.f39548k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z10 = true;
            }
        } else {
            Drawable drawable = this.f39567h0;
            if (drawable != null) {
                z10 = drawable.getPadding(rect);
            } else {
                z10 = super.getPadding(rect);
            }
        }
        if (this.f39565Y.f39531A && AbstractC5657c.a(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h != null) {
            abstractC4697h.f39555r = false;
            abstractC4697h.f39557t = false;
        }
        if (drawable == this.f39567h0 && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f39565Y.f39531A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f39568i0;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f39568i0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f39567h0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f39570k0) {
                this.f39567h0.setAlpha(this.f39569j0);
            }
        }
        if (this.f39575p0 != 0) {
            this.f39575p0 = 0L;
        } else {
            z11 = z10;
        }
        if (this.f39574o0 != 0) {
            this.f39574o0 = 0L;
        } else if (!z11) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f39572m0 && super.mutate() == this) {
            C4695f c4695f = (C4695f) this;
            C4691b c4691b = new C4691b(c4695f.f39524u0, c4695f, null);
            c4691b.f39517I = c4691b.f39517I.clone();
            c4691b.f39518J = c4691b.f39518J.clone();
            d(c4691b);
            this.f39572m0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f39568i0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f39567h0;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        int i11 = this.f39571l0;
        int i12 = abstractC4697h.f39545h;
        Drawable[] drawableArr = abstractC4697h.f39544g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean b10 = AbstractC5657c.b(drawable, i10);
                if (i13 == i11) {
                    z10 = b10;
                }
            }
        }
        abstractC4697h.f39561x = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f39568i0;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f39567h0;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        if (drawable == this.f39567h0 && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (!this.f39570k0 || this.f39569j0 != i10) {
            this.f39570k0 = true;
            this.f39569j0 = i10;
            Drawable drawable = this.f39567h0;
            if (drawable != null) {
                if (this.f39574o0 == 0) {
                    drawable.setAlpha(i10);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39531A != z10) {
            abstractC4697h.f39531A = z10;
            Drawable drawable = this.f39567h0;
            if (drawable != null) {
                AbstractC5655a.e(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        abstractC4697h.f39533C = true;
        if (abstractC4697h.f39532B != colorFilter) {
            abstractC4697h.f39532B = colorFilter;
            Drawable drawable = this.f39567h0;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        if (abstractC4697h.f39560w != z10) {
            abstractC4697h.f39560w = z10;
            Drawable drawable = this.f39567h0;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f6, float f10) {
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            AbstractC5656b.e(drawable, f6, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f39566Z;
        if (rect == null) {
            this.f39566Z = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f39567h0;
        if (drawable != null) {
            AbstractC5656b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        abstractC4697h.f39536F = true;
        if (abstractC4697h.f39534D != colorStateList) {
            abstractC4697h.f39534D = colorStateList;
            AbstractC5260f.Q(this.f39567h0, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC4697h abstractC4697h = this.f39565Y;
        abstractC4697h.f39537G = true;
        if (abstractC4697h.f39535E != mode) {
            abstractC4697h.f39535E = mode;
            AbstractC5260f.R(this.f39567h0, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f39568i0;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f39567h0;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f39567h0 && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
