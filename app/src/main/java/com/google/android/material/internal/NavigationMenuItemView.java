package com.google.android.material.internal;

import D1.H;
import D1.Z;
import H1.t;
import Q7.a;
import a8.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import p.D;
import p.q;
import q.E0;
import r1.i;
import r1.p;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements D {

    /* renamed from: N0  reason: collision with root package name */
    public static final int[] f27215N0 = {16842912};

    /* renamed from: C0  reason: collision with root package name */
    public int f27216C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f27217D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f27218E0;

    /* renamed from: F0  reason: collision with root package name */
    public final boolean f27219F0 = true;

    /* renamed from: G0  reason: collision with root package name */
    public final CheckedTextView f27220G0;

    /* renamed from: H0  reason: collision with root package name */
    public FrameLayout f27221H0;

    /* renamed from: I0  reason: collision with root package name */
    public q f27222I0;

    /* renamed from: J0  reason: collision with root package name */
    public ColorStateList f27223J0;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f27224K0;

    /* renamed from: L0  reason: collision with root package name */
    public Drawable f27225L0;

    /* renamed from: M0  reason: collision with root package name */
    public final a f27226M0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(3, this);
        this.f27226M0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f27220G0 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Z.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f27221H0 == null) {
                this.f27221H0 = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f27221H0.removeAllViews();
            this.f27221H0.addView(view);
        }
    }

    @Override // p.D
    public final void b(q qVar) {
        int i10;
        StateListDrawable stateListDrawable;
        this.f27222I0 = qVar;
        int i11 = qVar.f41635a;
        if (i11 > 0) {
            setId(i11);
        }
        if (qVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f27215N0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Z.f3247a;
            H.q(this, stateListDrawable);
        }
        setCheckable(qVar.isCheckable());
        setChecked(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        setTitle(qVar.f41639e);
        setIcon(qVar.getIcon());
        setActionView(qVar.getActionView());
        setContentDescription(qVar.f41651q);
        m.I(this, qVar.f41652r);
        q qVar2 = this.f27222I0;
        CharSequence charSequence = qVar2.f41639e;
        CheckedTextView checkedTextView = this.f27220G0;
        if (charSequence == null && qVar2.getIcon() == null && this.f27222I0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f27221H0;
            if (frameLayout != null) {
                E0 e02 = (E0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) e02).width = -1;
                this.f27221H0.setLayoutParams(e02);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f27221H0;
        if (frameLayout2 != null) {
            E0 e03 = (E0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) e03).width = -2;
            this.f27221H0.setLayoutParams(e03);
        }
    }

    @Override // p.D
    public q getItemData() {
        return this.f27222I0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        q qVar = this.f27222I0;
        if (qVar != null && qVar.isCheckable() && this.f27222I0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f27215N0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f27218E0 != z10) {
            this.f27218E0 = z10;
            this.f27226M0.i(this.f27220G0, 2048);
        }
    }

    public void setChecked(boolean z10) {
        int i10;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f27220G0;
        checkedTextView.setChecked(z10);
        Typeface typeface = checkedTextView.getTypeface();
        if (z10 && this.f27219F0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        checkedTextView.setTypeface(typeface, i10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f27224K0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC5656b.h(drawable, this.f27223J0);
            }
            int i10 = this.f27216C0;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f27217D0) {
            if (this.f27225L0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = p.f44306a;
                Drawable a5 = i.a(resources, R.drawable.navigation_empty_icon, theme);
                this.f27225L0 = a5;
                if (a5 != null) {
                    int i11 = this.f27216C0;
                    a5.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f27225L0;
        }
        t.e(this.f27220G0, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f27220G0.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f27216C0 = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z10;
        this.f27223J0 = colorStateList;
        if (colorStateList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27224K0 = z10;
        q qVar = this.f27222I0;
        if (qVar != null) {
            setIcon(qVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f27220G0.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f27217D0 = z10;
    }

    public void setTextAppearance(int i10) {
        this.f27220G0.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f27220G0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f27220G0.setText(charSequence);
    }
}
