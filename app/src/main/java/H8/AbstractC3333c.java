package h8;

import D1.L;
import D1.N;
import D1.Z;
import Df.H;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.openai.chatgpt.R;
import f8.g;
import f8.j;
import java.util.WeakHashMap;
import k8.AbstractC4203a;
import t1.AbstractC5656b;

/* renamed from: h8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3333c extends FrameLayout {

    /* renamed from: p0  reason: collision with root package name */
    public static final View$OnTouchListenerC3332b f31944p0 = new Object();

    /* renamed from: h0  reason: collision with root package name */
    public final j f31945h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f31946i0;

    /* renamed from: j0  reason: collision with root package name */
    public final float f31947j0;

    /* renamed from: k0  reason: collision with root package name */
    public final float f31948k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f31949l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f31950m0;

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f31951n0;

    /* renamed from: o0  reason: collision with root package name */
    public PorterDuff.Mode f31952o0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3333c(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, O7.a.f13425x);
        if (obtainStyledAttributes.hasValue(6)) {
            WeakHashMap weakHashMap = Z.f3247a;
            N.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f31946i0 = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f31945h0 = j.b(context2, attributeSet, 0, 0).a();
        }
        this.f31947j0 = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(A7.b.L0(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(H.j0(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f31948k0 = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f31949l0 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f31950m0 = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f31944p0);
        setFocusable(true);
        if (getBackground() == null) {
            int k02 = P4.a.k0(getBackgroundOverlayColorAlpha(), P4.a.R(this, R.attr.colorSurface), P4.a.R(this, R.attr.colorOnSurface));
            j jVar = this.f31945h0;
            if (jVar != null) {
                int i10 = AbstractC3334d.f31953a;
                g gVar = new g(jVar);
                gVar.k(ColorStateList.valueOf(k02));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i11 = AbstractC3334d.f31953a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(k02);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f31951n0;
            if (colorStateList != null) {
                AbstractC5656b.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = Z.f3247a;
            D1.H.q(this, gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f31948k0;
    }

    public int getAnimationMode() {
        return this.f31946i0;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f31947j0;
    }

    public int getMaxInlineActionWidth() {
        return this.f31950m0;
    }

    public int getMaxWidth() {
        return this.f31949l0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = Z.f3247a;
        L.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f31949l0;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
    }

    public void setAnimationMode(int i10) {
        this.f31946i0 = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f31951n0 != null) {
            drawable = drawable.mutate();
            AbstractC5656b.h(drawable, this.f31951n0);
            AbstractC5656b.i(drawable, this.f31952o0);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f31951n0 = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC5656b.h(mutate, colorStateList);
            AbstractC5656b.i(mutate, this.f31952o0);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f31952o0 = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC5656b.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        View$OnTouchListenerC3332b view$OnTouchListenerC3332b;
        if (onClickListener != null) {
            view$OnTouchListenerC3332b = null;
        } else {
            view$OnTouchListenerC3332b = f31944p0;
        }
        setOnTouchListener(view$OnTouchListenerC3332b);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(AbstractC3334d abstractC3334d) {
    }
}
