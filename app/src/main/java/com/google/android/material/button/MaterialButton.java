package com.google.android.material.button;

import A7.b;
import D1.I;
import D1.Z;
import Df.H;
import H1.t;
import T7.a;
import T7.c;
import a8.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.openai.chatgpt.R;
import d7.h;
import d8.AbstractC2605a;
import f8.C2944a;
import f8.j;
import f8.u;
import io.sentry.android.core.AbstractC3612c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k8.AbstractC4203a;
import kotlin.jvm.internal.m;
import p1.AbstractC5042g;
import q.C5233s;
import t1.AbstractC5656b;

/* loaded from: classes.dex */
public class MaterialButton extends C5233s implements Checkable, u {

    /* renamed from: y0  reason: collision with root package name */
    public static final int[] f27071y0 = {16842911};

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f27072z0 = {16842912};

    /* renamed from: k0  reason: collision with root package name */
    public final c f27073k0;

    /* renamed from: m0  reason: collision with root package name */
    public a f27075m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f27076n0;

    /* renamed from: o0  reason: collision with root package name */
    public ColorStateList f27077o0;

    /* renamed from: p0  reason: collision with root package name */
    public Drawable f27078p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f27079q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f27080r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f27081s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f27082t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f27083u0;

    /* renamed from: x0  reason: collision with root package name */
    public int f27086x0;

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet f27074l0 = new LinkedHashSet();

    /* renamed from: v0  reason: collision with root package name */
    public boolean f27084v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f27085w0 = false;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.materialButtonStyle, 2131952678), attributeSet, R.attr.materialButtonStyle);
        boolean z10 = false;
        Context context2 = getContext();
        TypedArray e10 = k.e(context2, attributeSet, O7.a.f13411j, R.attr.materialButtonStyle, 2131952678, new int[0]);
        this.f27083u0 = e10.getDimensionPixelSize(12, 0);
        int i10 = e10.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f27076n0 = H.j0(i10, mode);
        this.f27077o0 = b.L0(getContext(), e10, 14);
        this.f27078p0 = b.O0(getContext(), e10, 10);
        this.f27086x0 = e10.getInteger(11, 1);
        this.f27080r0 = e10.getDimensionPixelSize(13, 0);
        c cVar = new c(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, 2131952678).a());
        this.f27073k0 = cVar;
        cVar.f16931c = e10.getDimensionPixelOffset(1, 0);
        cVar.f16932d = e10.getDimensionPixelOffset(2, 0);
        cVar.f16933e = e10.getDimensionPixelOffset(3, 0);
        cVar.f16934f = e10.getDimensionPixelOffset(4, 0);
        if (e10.hasValue(8)) {
            int dimensionPixelSize = e10.getDimensionPixelSize(8, -1);
            cVar.f16935g = dimensionPixelSize;
            float f6 = dimensionPixelSize;
            h e11 = cVar.f16930b.e();
            e11.f28076e = new C2944a(f6);
            e11.f28077f = new C2944a(f6);
            e11.f28078g = new C2944a(f6);
            e11.f28079h = new C2944a(f6);
            cVar.c(e11.a());
            cVar.f16944p = true;
        }
        cVar.f16936h = e10.getDimensionPixelSize(20, 0);
        cVar.f16937i = H.j0(e10.getInt(7, -1), mode);
        cVar.f16938j = b.L0(getContext(), e10, 6);
        cVar.f16939k = b.L0(getContext(), e10, 19);
        cVar.f16940l = b.L0(getContext(), e10, 16);
        cVar.f16945q = e10.getBoolean(5, false);
        cVar.f16948t = e10.getDimensionPixelSize(9, 0);
        cVar.f16946r = e10.getBoolean(21, true);
        WeakHashMap weakHashMap = Z.f3247a;
        int f10 = I.f(this);
        int paddingTop = getPaddingTop();
        int e12 = I.e(this);
        int paddingBottom = getPaddingBottom();
        if (e10.hasValue(0)) {
            cVar.f16943o = true;
            setSupportBackgroundTintList(cVar.f16938j);
            setSupportBackgroundTintMode(cVar.f16937i);
        } else {
            cVar.e();
        }
        I.k(this, f10 + cVar.f16931c, paddingTop + cVar.f16933e, e12 + cVar.f16932d, paddingBottom + cVar.f16934f);
        e10.recycle();
        setCompoundDrawablePadding(this.f27083u0);
        d(this.f27078p0 != null ? true : z10);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f6 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f6);
    }

    public final boolean a() {
        c cVar = this.f27073k0;
        if (cVar != null && cVar.f16945q) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        c cVar = this.f27073k0;
        if (cVar != null && !cVar.f16943o) {
            return true;
        }
        return false;
    }

    public final void c() {
        int i10 = this.f27086x0;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10) {
            t.e(this, this.f27078p0, null, null, null);
        } else if (i10 != 3 && i10 != 4) {
            if (i10 == 16 || i10 == 32) {
                t.e(this, null, this.f27078p0, null, null);
            }
        } else {
            t.e(this, null, null, this.f27078p0, null);
        }
    }

    public final void d(boolean z10) {
        Drawable drawable = this.f27078p0;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f27078p0 = mutate;
            AbstractC5656b.h(mutate, this.f27077o0);
            PorterDuff.Mode mode = this.f27076n0;
            if (mode != null) {
                AbstractC5656b.i(this.f27078p0, mode);
            }
            int i10 = this.f27080r0;
            if (i10 == 0) {
                i10 = this.f27078p0.getIntrinsicWidth();
            }
            int i11 = this.f27080r0;
            if (i11 == 0) {
                i11 = this.f27078p0.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f27078p0;
            int i12 = this.f27081s0;
            int i13 = this.f27082t0;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f27078p0.setVisible(true, z10);
        }
        if (z10) {
            c();
            return;
        }
        Drawable[] a5 = t.a(this);
        Drawable drawable3 = a5[0];
        Drawable drawable4 = a5[1];
        Drawable drawable5 = a5[2];
        int i14 = this.f27086x0;
        if (((i14 == 1 || i14 == 2) && drawable3 != this.f27078p0) || (((i14 == 3 || i14 == 4) && drawable5 != this.f27078p0) || ((i14 == 16 || i14 == 32) && drawable4 != this.f27078p0))) {
            c();
        }
    }

    public final void e(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (this.f27078p0 != null && getLayout() != null) {
            int i12 = this.f27086x0;
            boolean z12 = true;
            if (i12 != 1 && i12 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && i12 != 3 && i12 != 4) {
                if (i12 == 16 || i12 == 32) {
                    this.f27081s0 = 0;
                    if (i12 == 16) {
                        this.f27082t0 = 0;
                        d(false);
                        return;
                    }
                    int i13 = this.f27080r0;
                    if (i13 == 0) {
                        i13 = this.f27078p0.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f27083u0) - getPaddingBottom()) / 2);
                    if (this.f27082t0 != max) {
                        this.f27082t0 = max;
                        d(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f27082t0 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f27086x0;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.f27080r0;
                if (i15 == 0) {
                    i15 = this.f27078p0.getIntrinsicWidth();
                }
                int textLayoutWidth = i10 - getTextLayoutWidth();
                WeakHashMap weakHashMap = Z.f3247a;
                int e10 = (((textLayoutWidth - I.e(this)) - i15) - this.f27083u0) - I.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (I.d(this) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f27086x0 != 4) {
                    z12 = false;
                }
                if (z11 != z12) {
                    e10 = -e10;
                }
                if (this.f27081s0 != e10) {
                    this.f27081s0 = e10;
                    d(false);
                    return;
                }
                return;
            }
            this.f27081s0 = 0;
            d(false);
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f27079q0)) {
            return this.f27079q0;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f27073k0.f16935g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f27078p0;
    }

    public int getIconGravity() {
        return this.f27086x0;
    }

    public int getIconPadding() {
        return this.f27083u0;
    }

    public int getIconSize() {
        return this.f27080r0;
    }

    public ColorStateList getIconTint() {
        return this.f27077o0;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f27076n0;
    }

    public int getInsetBottom() {
        return this.f27073k0.f16934f;
    }

    public int getInsetTop() {
        return this.f27073k0.f16933e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f27073k0.f16940l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (b()) {
            return this.f27073k0.f16930b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f27073k0.f16939k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f27073k0.f16936h;
        }
        return 0;
    }

    @Override // q.C5233s
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f27073k0.f16938j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // q.C5233s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f27073k0.f16937i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f27084v0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            M3.H.s0(this, this.f27073k0.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f27071y0);
        }
        if (this.f27084v0) {
            View.mergeDrawableStates(onCreateDrawableState, f27072z0);
        }
        return onCreateDrawableState;
    }

    @Override // q.C5233s, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f27084v0);
    }

    @Override // q.C5233s, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f27084v0);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // q.C5233s, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof T7.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        T7.b bVar = (T7.b) parcelable;
        super.onRestoreInstanceState(bVar.f9325Y);
        setChecked(bVar.f16928h0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T7.b, android.os.Parcelable, K1.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new K1.b(super.onSaveInstanceState());
        bVar.f16928h0 = this.f27084v0;
        return bVar;
    }

    @Override // q.C5233s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f27073k0.f16946r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f27078p0 != null) {
            if (this.f27078p0.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f27079q0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (b()) {
            c cVar = this.f27073k0;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // q.C5233s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                AbstractC3612c.r("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f27073k0;
                cVar.f16943o = true;
                ColorStateList colorStateList = cVar.f16938j;
                MaterialButton materialButton = cVar.f16929a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f16937i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // q.C5233s, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = m.u(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (b()) {
            this.f27073k0.f16945q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f27084v0 != z10) {
            this.f27084v0 = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f27084v0;
                if (!materialButtonToggleGroup.f27093m0) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (this.f27085w0) {
                return;
            }
            this.f27085w0 = true;
            Iterator it = this.f27074l0.iterator();
            if (!it.hasNext()) {
                this.f27085w0 = false;
            } else {
                AbstractC2469q0.p(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (b()) {
            c cVar = this.f27073k0;
            if (!cVar.f16944p || cVar.f16935g != i10) {
                cVar.f16935g = i10;
                cVar.f16944p = true;
                float f6 = i10;
                h e10 = cVar.f16930b.e();
                e10.f28076e = new C2944a(f6);
                e10.f28077f = new C2944a(f6);
                e10.f28078g = new C2944a(f6);
                e10.f28079h = new C2944a(f6);
                cVar.c(e10.a());
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (b()) {
            this.f27073k0.b(false).j(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f27078p0 != drawable) {
            this.f27078p0 = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f27086x0 != i10) {
            this.f27086x0 = i10;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f27083u0 != i10) {
            this.f27083u0 = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = m.u(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f27080r0 != i10) {
                this.f27080r0 = i10;
                d(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f27077o0 != colorStateList) {
            this.f27077o0 = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f27076n0 != mode) {
            this.f27076n0 = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(AbstractC5042g.b(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        c cVar = this.f27073k0;
        cVar.d(cVar.f16933e, i10);
    }

    public void setInsetTop(int i10) {
        c cVar = this.f27073k0;
        cVar.d(i10, cVar.f16934f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f27075m0 = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f27075m0;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((y7.b) aVar).f50831Z).invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f27073k0;
            if (cVar.f16940l != colorStateList) {
                cVar.f16940l = colorStateList;
                MaterialButton materialButton = cVar.f16929a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC2605a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (b()) {
            setRippleColor(AbstractC5042g.b(getContext(), i10));
        }
    }

    @Override // f8.u
    public void setShapeAppearanceModel(j jVar) {
        if (b()) {
            this.f27073k0.c(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (b()) {
            c cVar = this.f27073k0;
            cVar.f16942n = z10;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f27073k0;
            if (cVar.f16939k != colorStateList) {
                cVar.f16939k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (b()) {
            setStrokeColor(AbstractC5042g.b(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (b()) {
            c cVar = this.f27073k0;
            if (cVar.f16936h != i10) {
                cVar.f16936h = i10;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // q.C5233s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f27073k0;
            if (cVar.f16938j != colorStateList) {
                cVar.f16938j = colorStateList;
                if (cVar.b(false) != null) {
                    AbstractC5656b.h(cVar.b(false), cVar.f16938j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // q.C5233s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            c cVar = this.f27073k0;
            if (cVar.f16937i != mode) {
                cVar.f16937i = mode;
                if (cVar.b(false) != null && cVar.f16937i != null) {
                    AbstractC5656b.i(cVar.b(false), cVar.f16937i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f27073k0.f16946r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f27084v0);
    }
}
