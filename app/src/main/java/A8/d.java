package a8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import q.F0;

/* loaded from: classes2.dex */
public abstract class d extends F0 {

    /* renamed from: A0  reason: collision with root package name */
    public final boolean f23987A0;

    /* renamed from: w0  reason: collision with root package name */
    public Drawable f23989w0;

    /* renamed from: z0  reason: collision with root package name */
    public int f23992z0;

    /* renamed from: x0  reason: collision with root package name */
    public final Rect f23990x0 = new Rect();

    /* renamed from: y0  reason: collision with root package name */
    public final Rect f23991y0 = new Rect();

    /* renamed from: B0  reason: collision with root package name */
    public boolean f23988B0 = false;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f23992z0 = 119;
        this.f23987A0 = true;
        int[] iArr = O7.a.f13409h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f23992z0 = obtainStyledAttributes.getInt(1, this.f23992z0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f23987A0 = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f23989w0;
        if (drawable != null) {
            if (this.f23988B0) {
                this.f23988B0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z10 = this.f23987A0;
                Rect rect = this.f23990x0;
                if (z10) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i10 = this.f23992z0;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f23991y0;
                Gravity.apply(i10, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f6, float f10) {
        super.drawableHotspotChanged(f6, f10);
        Drawable drawable = this.f23989w0;
        if (drawable != null) {
            drawable.setHotspot(f6, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f23989w0;
        if (drawable != null && drawable.isStateful()) {
            this.f23989w0.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f23989w0;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f23992z0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f23989w0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // q.F0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f23988B0 = z10 | this.f23988B0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f23988B0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f23989w0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f23989w0);
            }
            this.f23989w0 = drawable;
            this.f23988B0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f23992z0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f23992z0 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f23992z0 = i10;
            if (i10 == 119 && this.f23989w0 != null) {
                this.f23989w0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f23989w0) {
            return false;
        }
        return true;
    }
}
