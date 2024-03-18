package androidx.appcompat.widget;

import D1.H;
import D1.Z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import l.AbstractC4308a;
import q.AbstractC5193a1;
import q.C5194b;

/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: h0  reason: collision with root package name */
    public boolean f24448h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f24449i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f24450j0;

    /* renamed from: k0  reason: collision with root package name */
    public Drawable f24451k0;

    /* renamed from: l0  reason: collision with root package name */
    public Drawable f24452l0;

    /* renamed from: m0  reason: collision with root package name */
    public Drawable f24453m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f24454n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24455o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f24456p0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5194b c5194b = new C5194b(this);
        WeakHashMap weakHashMap = Z.f3247a;
        H.q(this, c5194b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4308a.f37664a);
        boolean z10 = false;
        this.f24451k0 = obtainStyledAttributes.getDrawable(0);
        this.f24452l0 = obtainStyledAttributes.getDrawable(2);
        this.f24456p0 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f24454n0 = true;
            this.f24453m0 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f24454n0 ? !(this.f24451k0 != null || this.f24452l0 != null) : this.f24453m0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24451k0;
        if (drawable != null && drawable.isStateful()) {
            this.f24451k0.setState(getDrawableState());
        }
        Drawable drawable2 = this.f24452l0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f24452l0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f24453m0;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f24453m0.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24451k0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f24452l0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f24453m0;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f24449i0 = findViewById(R.id.action_bar);
        this.f24450j0 = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f24448h0 && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f24454n0) {
            Drawable drawable = this.f24453m0;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.f24451k0 != null) {
                if (this.f24449i0.getVisibility() == 0) {
                    this.f24451k0.setBounds(this.f24449i0.getLeft(), this.f24449i0.getTop(), this.f24449i0.getRight(), this.f24449i0.getBottom());
                } else {
                    View view = this.f24450j0;
                    if (view != null && view.getVisibility() == 0) {
                        this.f24451k0.setBounds(this.f24450j0.getLeft(), this.f24450j0.getTop(), this.f24450j0.getRight(), this.f24450j0.getBottom());
                    } else {
                        this.f24451k0.setBounds(0, 0, 0, 0);
                    }
                }
                z11 = true;
            } else {
                z11 = false;
            }
            this.f24455o0 = false;
            if (!z11) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f24449i0 == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f24456p0) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f24449i0 == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f24451k0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f24451k0);
        }
        this.f24451k0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f24449i0;
            if (view != null) {
                this.f24451k0.setBounds(view.getLeft(), this.f24449i0.getTop(), this.f24449i0.getRight(), this.f24449i0.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f24454n0 ? !(this.f24451k0 != null || this.f24452l0 != null) : this.f24453m0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f24453m0;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f24453m0);
        }
        this.f24453m0 = drawable;
        boolean z10 = this.f24454n0;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f24453m0) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f24451k0 != null || this.f24452l0 != null) : this.f24453m0 == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f24452l0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f24452l0);
        }
        this.f24452l0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f24455o0 && this.f24452l0 != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f24454n0 ? !(this.f24451k0 != null || this.f24452l0 != null) : this.f24453m0 == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z10) {
        int i10;
        this.f24448h0 = z10;
        if (z10) {
            i10 = 393216;
        } else {
            i10 = 262144;
        }
        setDescendantFocusability(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f24451k0;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f24452l0;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f24453m0;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f24451k0;
        boolean z10 = this.f24454n0;
        if ((drawable == drawable2 && !z10) || ((drawable == this.f24452l0 && this.f24455o0) || ((drawable == this.f24453m0 && z10) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(AbstractC5193a1 abstractC5193a1) {
    }
}
