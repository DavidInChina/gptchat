package j4;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.gms.internal.play_billing.N;
import h4.h;
import java.util.ArrayList;
import l8.AbstractC4344b;
import r4.g;
import t1.AbstractC5656b;

/* renamed from: j4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3909a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: Y  reason: collision with root package name */
    public final g f36019Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f36020Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f36021h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f36022i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f36023j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public final int f36024k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f36025l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f36026m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f36027n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f36028o0;

    /* renamed from: p0  reason: collision with root package name */
    public Drawable f36029p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Drawable f36030q0;

    public C3909a(Drawable drawable, g gVar, int i10, boolean z10, boolean z11) {
        Integer num;
        Integer num2;
        this.f36019Y = gVar;
        this.f36020Z = i10;
        this.f36021h0 = z10;
        this.f36022i0 = z11;
        Drawable drawable2 = null;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        this.f36024k0 = a(null, num);
        if (drawable != null) {
            num2 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num2 = null;
        }
        this.f36025l0 = a(null, num2);
        this.f36027n0 = 255;
        this.f36029p0 = null;
        drawable2 = drawable != null ? drawable.mutate() : drawable2;
        this.f36030q0 = drawable2;
        if (i10 > 0) {
            Drawable drawable3 = this.f36029p0;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawable2 != null) {
                drawable2.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    public final int a(Integer num, Integer num2) {
        int i10;
        int i11 = -1;
        if (!this.f36022i0 && ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1))) {
            return -1;
        }
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        if (num2 != null) {
            i11 = num2.intValue();
        }
        return Math.max(i10, i11);
    }

    public final void b() {
        this.f36028o0 = 2;
        this.f36029p0 = null;
        ArrayList arrayList = this.f36023j0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ColorStateList colorStateList = ((V7.a) arrayList.get(i10)).f18412b.f18433v0;
            if (colorStateList != null) {
                AbstractC5656b.h(this, colorStateList);
            }
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double a5 = h.a(intrinsicWidth, intrinsicHeight, width, height, this.f36019Y);
            double d10 = 2;
            int X02 = AbstractC4344b.X0((width - (intrinsicWidth * a5)) / d10);
            int X03 = AbstractC4344b.X0((height - (a5 * intrinsicHeight)) / d10);
            drawable.setBounds(rect.left + X02, rect.top + X03, rect.right - X02, rect.bottom - X03);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        int save;
        Drawable drawable;
        int i10 = this.f36028o0;
        if (i10 == 0) {
            Drawable drawable2 = this.f36029p0;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f36027n0);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f36030q0;
        if (i10 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f36027n0);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.f36026m0) / this.f36020Z;
        double n10 = N.n(uptimeMillis, 0.0d, 1.0d);
        int i11 = this.f36027n0;
        int i12 = (int) (n10 * i11);
        if (this.f36021h0) {
            i11 -= i12;
        }
        if (uptimeMillis >= 1.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (drawable = this.f36029p0) != null) {
            drawable.setAlpha(i11);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i12);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f36027n0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i10 = this.f36028o0;
        if (i10 != 0) {
            Drawable drawable = this.f36030q0;
            if (i10 != 1) {
                if (i10 != 2 || drawable == null) {
                    return null;
                }
                return drawable.getColorFilter();
            } else if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            } else {
                Drawable drawable2 = this.f36029p0;
                if (drawable2 == null) {
                    return null;
                }
                return drawable2.getColorFilter();
            }
        }
        Drawable drawable3 = this.f36029p0;
        if (drawable3 == null) {
            return null;
        }
        return drawable3.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f36025l0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f36024k0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f36029p0;
        int i10 = this.f36028o0;
        if (i10 == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        }
        Drawable drawable2 = this.f36030q0;
        if (i10 == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.f36028o0 == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            z10 = drawable.setLevel(i10);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            z11 = drawable2.setLevel(i10);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            z10 = drawable.setState(iArr);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            z11 = drawable2.setState(iArr);
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        scheduleSelf(runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (i10 >= 0 && i10 < 256) {
            this.f36027n0 = i10;
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Invalid alpha: ", i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36029p0;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Drawable drawable = this.f36029p0;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f36028o0 != 0) {
            return;
        }
        this.f36028o0 = 1;
        this.f36026m0 = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f36023j0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((V7.a) arrayList.get(i10)).a(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Drawable drawable = this.f36029p0;
        Animatable animatable2 = null;
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.f36030q0;
        if (drawable2 instanceof Animatable) {
            animatable2 = (Animatable) drawable2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f36028o0 != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
