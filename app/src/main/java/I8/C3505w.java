package i8;

import D1.AbstractC0365n;
import D1.I;
import D1.K;
import D1.Z;
import Df.H;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;
import l8.AbstractC4344b;
import q.C5215i0;

/* renamed from: i8.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3505w extends LinearLayout {

    /* renamed from: h0  reason: collision with root package name */
    public final TextInputLayout f32866h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5215i0 f32867i0;

    /* renamed from: j0  reason: collision with root package name */
    public CharSequence f32868j0;

    /* renamed from: k0  reason: collision with root package name */
    public final CheckableImageButton f32869k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f32870l0;

    /* renamed from: m0  reason: collision with root package name */
    public PorterDuff.Mode f32871m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f32872n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView.ScaleType f32873o0;

    /* renamed from: p0  reason: collision with root package name */
    public View.OnLongClickListener f32874p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f32875q0;

    public C3505w(TextInputLayout textInputLayout, U3.u uVar) {
        super(textInputLayout.getContext());
        CharSequence C10;
        this.f32866h0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f32869k0 = checkableImageButton;
        CharSequence charSequence = null;
        C5215i0 c5215i0 = new C5215i0(getContext(), null);
        this.f32867i0 = c5215i0;
        if (A7.b.h1(getContext())) {
            AbstractC0365n.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f32874p0;
        checkableImageButton.setOnClickListener(null);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
        this.f32874p0 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC4344b.b1(checkableImageButton, null);
        if (uVar.E(69)) {
            this.f32870l0 = A7.b.K0(getContext(), uVar, 69);
        }
        if (uVar.E(70)) {
            this.f32871m0 = H.j0(uVar.x(70, -1), null);
        }
        if (uVar.E(66)) {
            b(uVar.t(66));
            if (uVar.E(65) && checkableImageButton.getContentDescription() != (C10 = uVar.C(65))) {
                checkableImageButton.setContentDescription(C10);
            }
            checkableImageButton.setCheckable(uVar.o(64, true));
        }
        int s10 = uVar.s(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (s10 >= 0) {
            if (s10 != this.f32872n0) {
                this.f32872n0 = s10;
                checkableImageButton.setMinimumWidth(s10);
                checkableImageButton.setMinimumHeight(s10);
            }
            if (uVar.E(68)) {
                ImageView.ScaleType X10 = AbstractC4344b.X(uVar.x(68, -1));
                this.f32873o0 = X10;
                checkableImageButton.setScaleType(X10);
            }
            c5215i0.setVisibility(8);
            c5215i0.setId(R.id.textinput_prefix_text);
            c5215i0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = Z.f3247a;
            K.f(c5215i0, 1);
            c5215i0.setTextAppearance(uVar.z(60, 0));
            if (uVar.E(61)) {
                c5215i0.setTextColor(uVar.p(61));
            }
            CharSequence C11 = uVar.C(59);
            this.f32868j0 = !TextUtils.isEmpty(C11) ? C11 : charSequence;
            c5215i0.setText(C11);
            e();
            addView(checkableImageButton);
            addView(c5215i0);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i10;
        CheckableImageButton checkableImageButton = this.f32869k0;
        if (checkableImageButton.getVisibility() == 0) {
            i10 = AbstractC0365n.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            i10 = 0;
        }
        WeakHashMap weakHashMap = Z.f3247a;
        return I.f(this.f32867i0) + I.f(this) + i10;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f32869k0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f32870l0;
            PorterDuff.Mode mode = this.f32871m0;
            TextInputLayout textInputLayout = this.f32866h0;
            AbstractC4344b.L(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            AbstractC4344b.U0(textInputLayout, checkableImageButton, this.f32870l0);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f32874p0;
        checkableImageButton.setOnClickListener(null);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
        this.f32874p0 = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC4344b.b1(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f32869k0;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            d();
            e();
        }
    }

    public final void d() {
        int i10;
        EditText editText = this.f32866h0.f27299k0;
        if (editText == null) {
            return;
        }
        if (this.f32869k0.getVisibility() == 0) {
            i10 = 0;
        } else {
            WeakHashMap weakHashMap = Z.f3247a;
            i10 = I.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = Z.f3247a;
        I.k(this.f32867i0, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i10;
        int i11 = 8;
        if (this.f32868j0 != null && !this.f32875q0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f32869k0.getVisibility() == 0 || i10 == 0) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f32867i0.setVisibility(i10);
        this.f32866h0.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
