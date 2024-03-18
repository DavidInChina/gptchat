package i8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.Locale;
import k8.AbstractC4203a;
import q.C5211g1;
import q.C5230q;
import q.N0;

/* renamed from: i8.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3503u extends C5230q {

    /* renamed from: l0  reason: collision with root package name */
    public final N0 f32855l0;

    /* renamed from: m0  reason: collision with root package name */
    public final AccessibilityManager f32856m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f32857n0 = new Rect();

    /* renamed from: o0  reason: collision with root package name */
    public final int f32858o0;

    /* renamed from: p0  reason: collision with root package name */
    public final float f32859p0;

    /* renamed from: q0  reason: collision with root package name */
    public ColorStateList f32860q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f32861r0;

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f32862s0;

    public C3503u(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        Context context2 = getContext();
        TypedArray e10 = a8.k.e(context2, attributeSet, O7.a.f13410i, R.attr.autoCompleteTextViewStyle, 2131952416, new int[0]);
        if (e10.hasValue(0) && e10.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f32858o0 = e10.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f32859p0 = e10.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (e10.hasValue(2)) {
            this.f32860q0 = ColorStateList.valueOf(e10.getColor(2, 0));
        }
        this.f32861r0 = e10.getColor(4, 0);
        this.f32862s0 = A7.b.L0(context2, e10, 5);
        this.f32856m0 = (AccessibilityManager) context2.getSystemService("accessibility");
        N0 n02 = new N0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f32855l0 = n02;
        n02.f43319D0 = true;
        n02.f43320E0.setFocusable(true);
        n02.f43335t0 = this;
        n02.f43320E0.setInputMethodMode(2);
        n02.o(getAdapter());
        n02.f43336u0 = new C5211g1(this, 1);
        if (e10.hasValue(6)) {
            setSimpleItems(e10.getResourceId(6, 0));
        }
        e10.recycle();
    }

    public static void a(C3503u c3503u, Object obj) {
        c3503u.setText(c3503u.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f32856m0;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f32855l0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f32860q0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.f27273L0) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f32859p0;
    }

    public int getSimpleItemSelectedColor() {
        return this.f32861r0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f32862s0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.f27273L0 && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32855l0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i13 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                N0 n02 = this.f32855l0;
                if (!n02.f43320E0.isShowing()) {
                    i12 = -1;
                } else {
                    i12 = n02.f43323h0.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i12) + 15);
                View view = null;
                int i14 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i13) {
                        view = null;
                        i13 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i14 = Math.max(i14, view.getMeasuredWidth());
                }
                Drawable background = n02.f43320E0.getBackground();
                if (background != null) {
                    Rect rect = this.f32857n0;
                    background.getPadding(rect);
                    i14 += rect.left + rect.right;
                }
                i13 = b10.getEndIconView().getMeasuredWidth() + i14;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i13), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        AccessibilityManager accessibilityManager = this.f32856m0;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f32855l0.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        N0 n02 = this.f32855l0;
        if (n02 != null) {
            n02.j(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f32860q0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof f8.g) {
            ((f8.g) dropDownBackground).k(this.f32860q0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f32855l0.f43337v0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f32861r0 = i10;
        if (getAdapter() instanceof C3502t) {
            ((C3502t) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f32862s0 = colorStateList;
        if (getAdapter() instanceof C3502t) {
            ((C3502t) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f32856m0;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f32855l0.f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C3502t(this, getContext(), this.f32858o0, strArr));
    }
}
