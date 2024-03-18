package com.google.android.material.textfield;

import A9.a;
import B1.c;
import B1.p;
import B1.q;
import D1.AbstractC0365n;
import D1.H;
import D1.I;
import D1.K;
import D1.P;
import D1.Z;
import G3.C0605i;
import G3.s;
import G3.v;
import H1.t;
import U3.f;
import U3.u;
import a8.b;
import a8.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.C2304a;
import c8.C2306c;
import com.google.android.material.internal.CheckableImageButton;
import com.openai.chatgpt.R;
import d7.h;
import f8.C2944a;
import f8.e;
import f8.g;
import f8.j;
import g.RunnableC3118k;
import i8.AbstractC3490h;
import i8.AbstractC3507y;
import i8.C3488f;
import i8.C3494l;
import i8.C3496n;
import i8.C3497o;
import i8.C3500r;
import i8.C3501s;
import i8.C3503u;
import i8.C3505w;
import i8.C3506x;
import i8.C3508z;
import j7.RunnableC3921k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k8.AbstractC4203a;
import kotlin.jvm.internal.m;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import p1.AbstractC5039d;
import p1.AbstractC5042g;
import q.AbstractC5238u0;
import q.C5196b1;
import q.C5215i0;
import q.C5243x;
import q.X0;
import s1.AbstractC5521c;
import t1.AbstractC5656b;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: F1  reason: collision with root package name */
    public static final int[][] f27256F1 = {new int[]{16842919}, new int[0]};

    /* renamed from: A0  reason: collision with root package name */
    public C5215i0 f27257A0;

    /* renamed from: A1  reason: collision with root package name */
    public boolean f27258A1;

    /* renamed from: B0  reason: collision with root package name */
    public ColorStateList f27259B0;

    /* renamed from: B1  reason: collision with root package name */
    public ValueAnimator f27260B1;

    /* renamed from: C0  reason: collision with root package name */
    public int f27261C0;

    /* renamed from: C1  reason: collision with root package name */
    public boolean f27262C1;

    /* renamed from: D0  reason: collision with root package name */
    public C0605i f27263D0;

    /* renamed from: D1  reason: collision with root package name */
    public boolean f27264D1;

    /* renamed from: E0  reason: collision with root package name */
    public C0605i f27265E0;

    /* renamed from: F0  reason: collision with root package name */
    public ColorStateList f27267F0;

    /* renamed from: G0  reason: collision with root package name */
    public ColorStateList f27268G0;

    /* renamed from: H0  reason: collision with root package name */
    public ColorStateList f27269H0;

    /* renamed from: I0  reason: collision with root package name */
    public ColorStateList f27270I0;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f27271J0;

    /* renamed from: K0  reason: collision with root package name */
    public CharSequence f27272K0;

    /* renamed from: L0  reason: collision with root package name */
    public boolean f27273L0;

    /* renamed from: M0  reason: collision with root package name */
    public g f27274M0;

    /* renamed from: N0  reason: collision with root package name */
    public g f27275N0;

    /* renamed from: O0  reason: collision with root package name */
    public StateListDrawable f27276O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f27277P0;

    /* renamed from: Q0  reason: collision with root package name */
    public g f27278Q0;

    /* renamed from: R0  reason: collision with root package name */
    public g f27279R0;

    /* renamed from: S0  reason: collision with root package name */
    public j f27280S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f27281T0;

    /* renamed from: U0  reason: collision with root package name */
    public final int f27282U0;

    /* renamed from: V0  reason: collision with root package name */
    public int f27283V0;

    /* renamed from: W0  reason: collision with root package name */
    public int f27284W0;

    /* renamed from: X0  reason: collision with root package name */
    public int f27285X0;

    /* renamed from: Y0  reason: collision with root package name */
    public int f27286Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public int f27287Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f27288a1;
    public int b1;

    /* renamed from: f1  reason: collision with root package name */
    public Typeface f27292f1;
    public ColorDrawable g1;

    /* renamed from: h0  reason: collision with root package name */
    public final FrameLayout f27293h0;

    /* renamed from: h1  reason: collision with root package name */
    public int f27294h1;

    /* renamed from: i0  reason: collision with root package name */
    public final C3505w f27295i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C3497o f27297j0;

    /* renamed from: j1  reason: collision with root package name */
    public ColorDrawable f27298j1;

    /* renamed from: k0  reason: collision with root package name */
    public EditText f27299k0;

    /* renamed from: k1  reason: collision with root package name */
    public int f27300k1;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f27301l0;

    /* renamed from: l1  reason: collision with root package name */
    public Drawable f27302l1;

    /* renamed from: m1  reason: collision with root package name */
    public ColorStateList f27304m1;

    /* renamed from: n1  reason: collision with root package name */
    public ColorStateList f27306n1;

    /* renamed from: o1  reason: collision with root package name */
    public int f27308o1;

    /* renamed from: p1  reason: collision with root package name */
    public int f27310p1;

    /* renamed from: q1  reason: collision with root package name */
    public int f27312q1;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f27313r0;

    /* renamed from: r1  reason: collision with root package name */
    public ColorStateList f27314r1;

    /* renamed from: s0  reason: collision with root package name */
    public int f27315s0;

    /* renamed from: s1  reason: collision with root package name */
    public int f27316s1;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f27317t0;

    /* renamed from: t1  reason: collision with root package name */
    public int f27318t1;

    /* renamed from: u1  reason: collision with root package name */
    public int f27320u1;

    /* renamed from: v0  reason: collision with root package name */
    public C5215i0 f27321v0;

    /* renamed from: v1  reason: collision with root package name */
    public int f27322v1;

    /* renamed from: w0  reason: collision with root package name */
    public int f27323w0;

    /* renamed from: w1  reason: collision with root package name */
    public int f27324w1;

    /* renamed from: x0  reason: collision with root package name */
    public int f27325x0;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f27326x1;

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence f27327y0;

    /* renamed from: y1  reason: collision with root package name */
    public final b f27328y1;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f27329z0;

    /* renamed from: z1  reason: collision with root package name */
    public boolean f27330z1;

    /* renamed from: m0  reason: collision with root package name */
    public int f27303m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public int f27305n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public int f27307o0 = -1;

    /* renamed from: p0  reason: collision with root package name */
    public int f27309p0 = -1;

    /* renamed from: q0  reason: collision with root package name */
    public final C3501s f27311q0 = new C3501s(this);

    /* renamed from: u0  reason: collision with root package name */
    public AbstractC3507y f27319u0 = new a(16);

    /* renamed from: c1  reason: collision with root package name */
    public final Rect f27289c1 = new Rect();

    /* renamed from: d1  reason: collision with root package name */
    public final Rect f27290d1 = new Rect();

    /* renamed from: e1  reason: collision with root package name */
    public final RectF f27291e1 = new RectF();

    /* renamed from: i1  reason: collision with root package name */
    public final LinkedHashSet f27296i1 = new LinkedHashSet();

    /* renamed from: E1  reason: collision with root package name */
    public boolean f27266E1 = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC4203a.a(context, attributeSet, R.attr.textInputStyle, 2131952491), attributeSet, R.attr.textInputStyle);
        ?? r42;
        b bVar = new b(this);
        this.f27328y1 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f27293h0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = P7.a.f13838a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f23965g != 8388659) {
            bVar.f23965g = 8388659;
            bVar.h(false);
        }
        int[] iArr = O7.a.f13400A;
        k.a(context2, attributeSet, R.attr.textInputStyle, 2131952491);
        k.b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131952491, 22, 20, 40, 45, 49);
        u uVar = new u(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131952491));
        C3505w c3505w = new C3505w(this, uVar);
        this.f27295i0 = c3505w;
        this.f27271J0 = uVar.o(48, true);
        setHint(uVar.C(4));
        this.f27258A1 = uVar.o(47, true);
        this.f27330z1 = uVar.o(42, true);
        if (uVar.E(6)) {
            setMinEms(uVar.x(6, -1));
        } else if (uVar.E(3)) {
            setMinWidth(uVar.s(3, -1));
        }
        if (uVar.E(5)) {
            setMaxEms(uVar.x(5, -1));
        } else if (uVar.E(2)) {
            setMaxWidth(uVar.s(2, -1));
        }
        this.f27280S0 = j.b(context2, attributeSet, R.attr.textInputStyle, 2131952491).a();
        this.f27282U0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f27284W0 = uVar.r(9, 0);
        this.f27286Y0 = uVar.s(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f27287Z0 = uVar.s(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f27285X0 = this.f27286Y0;
        float dimension = ((TypedArray) uVar.f17493h0).getDimension(13, -1.0f);
        float dimension2 = ((TypedArray) uVar.f17493h0).getDimension(12, -1.0f);
        float dimension3 = ((TypedArray) uVar.f17493h0).getDimension(10, -1.0f);
        float dimension4 = ((TypedArray) uVar.f17493h0).getDimension(11, -1.0f);
        h e10 = this.f27280S0.e();
        if (dimension >= 0.0f) {
            e10.f28076e = new C2944a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e10.f28077f = new C2944a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e10.f28078g = new C2944a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e10.f28079h = new C2944a(dimension4);
        }
        this.f27280S0 = e10.a();
        ColorStateList K02 = A7.b.K0(context2, uVar, 7);
        if (K02 != null) {
            int defaultColor = K02.getDefaultColor();
            this.f27316s1 = defaultColor;
            this.b1 = defaultColor;
            if (K02.isStateful()) {
                this.f27318t1 = K02.getColorForState(new int[]{-16842910}, -1);
                this.f27320u1 = K02.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f27322v1 = K02.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f27320u1 = this.f27316s1;
                ColorStateList b10 = AbstractC5042g.b(context2, R.color.mtrl_filled_background_color);
                this.f27318t1 = b10.getColorForState(new int[]{-16842910}, -1);
                this.f27322v1 = b10.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.b1 = 0;
            this.f27316s1 = 0;
            this.f27318t1 = 0;
            this.f27320u1 = 0;
            this.f27322v1 = 0;
        }
        if (uVar.E(1)) {
            ColorStateList p10 = uVar.p(1);
            this.f27306n1 = p10;
            this.f27304m1 = p10;
        }
        ColorStateList K03 = A7.b.K0(context2, uVar, 14);
        this.f27312q1 = ((TypedArray) uVar.f17493h0).getColor(14, 0);
        Object obj = AbstractC5042g.f41723a;
        this.f27308o1 = AbstractC5039d.a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f27324w1 = AbstractC5039d.a(context2, R.color.mtrl_textinput_disabled_color);
        this.f27310p1 = AbstractC5039d.a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (K03 != null) {
            setBoxStrokeColorStateList(K03);
        }
        if (uVar.E(15)) {
            setBoxStrokeErrorColor(A7.b.K0(context2, uVar, 15));
        }
        if (uVar.z(49, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(uVar.z(49, 0));
        } else {
            r42 = 0;
        }
        this.f27269H0 = uVar.p(24);
        this.f27270I0 = uVar.p(25);
        int i10 = r42 == true ? 1 : 0;
        int i11 = r42 == true ? 1 : 0;
        int z10 = uVar.z(40, i10);
        CharSequence C10 = uVar.C(35);
        int x10 = uVar.x(34, 1);
        boolean o10 = uVar.o(36, r42);
        int z11 = uVar.z(45, r42);
        boolean o11 = uVar.o(44, r42);
        CharSequence C11 = uVar.C(43);
        int z12 = uVar.z(57, r42);
        CharSequence C12 = uVar.C(56);
        boolean o12 = uVar.o(18, r42);
        setCounterMaxLength(uVar.x(19, -1));
        this.f27325x0 = uVar.z(22, 0);
        this.f27323w0 = uVar.z(20, 0);
        setBoxBackgroundMode(uVar.x(8, 0));
        setErrorContentDescription(C10);
        setErrorAccessibilityLiveRegion(x10);
        setCounterOverflowTextAppearance(this.f27323w0);
        setHelperTextTextAppearance(z11);
        setErrorTextAppearance(z10);
        setCounterTextAppearance(this.f27325x0);
        setPlaceholderText(C12);
        setPlaceholderTextAppearance(z12);
        if (uVar.E(41)) {
            setErrorTextColor(uVar.p(41));
        }
        if (uVar.E(46)) {
            setHelperTextColor(uVar.p(46));
        }
        if (uVar.E(50)) {
            setHintTextColor(uVar.p(50));
        }
        if (uVar.E(23)) {
            setCounterTextColor(uVar.p(23));
        }
        if (uVar.E(21)) {
            setCounterOverflowTextColor(uVar.p(21));
        }
        if (uVar.E(58)) {
            setPlaceholderTextColor(uVar.p(58));
        }
        C3497o c3497o = new C3497o(this, uVar);
        this.f27297j0 = c3497o;
        boolean o13 = uVar.o(0, true);
        uVar.N();
        H.s(this, 2);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && i12 >= 26) {
            P.m(this, 1);
        }
        frameLayout.addView(c3505w);
        frameLayout.addView(c3497o);
        addView(frameLayout);
        setEnabled(o13);
        setHelperTextEnabled(o11);
        setErrorEnabled(o10);
        setCounterEnabled(o12);
        setHelperText(C11);
    }

    private Drawable getEditTextBoxBackground() {
        int i10;
        EditText editText = this.f27299k0;
        if ((editText instanceof AutoCompleteTextView) && !f.c0(editText)) {
            int R10 = P4.a.R(this.f27299k0, R.attr.colorControlHighlight);
            int i11 = this.f27283V0;
            int[][] iArr = f27256F1;
            if (i11 == 2) {
                Context context = getContext();
                g gVar = this.f27274M0;
                TypedValue l02 = M3.H.l0(R.attr.colorSurface, context, "TextInputLayout");
                int i12 = l02.resourceId;
                if (i12 != 0) {
                    Object obj = AbstractC5042g.f41723a;
                    i10 = AbstractC5039d.a(context, i12);
                } else {
                    i10 = l02.data;
                }
                g gVar2 = new g(gVar.f29688Y.f29665a);
                int k02 = P4.a.k0(0.1f, R10, i10);
                gVar2.k(new ColorStateList(iArr, new int[]{k02, 0}));
                gVar2.setTint(i10);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{k02, i10});
                g gVar3 = new g(gVar.f29688Y.f29665a);
                gVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
            } else if (i11 == 1) {
                g gVar4 = this.f27274M0;
                int i13 = this.b1;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{P4.a.k0(0.1f, R10, i13), i13}), gVar4, gVar4);
            } else {
                return null;
            }
        }
        return this.f27274M0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f27276O0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f27276O0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f27276O0.addState(new int[0], f(false));
        }
        return this.f27276O0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f27275N0 == null) {
            this.f27275N0 = f(true);
        }
        return this.f27275N0;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f27299k0 == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f27299k0 = editText;
            int i10 = this.f27303m0;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f27307o0);
            }
            int i11 = this.f27305n0;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f27309p0);
            }
            this.f27277P0 = false;
            i();
            setTextInputAccessibilityDelegate(new C3506x(this));
            Typeface typeface = this.f27299k0.getTypeface();
            b bVar = this.f27328y1;
            bVar.m(typeface);
            float textSize = this.f27299k0.getTextSize();
            if (bVar.f23966h != textSize) {
                bVar.f23966h = textSize;
                bVar.h(false);
            }
            int i12 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f27299k0.getLetterSpacing();
            if (bVar.f23949W != letterSpacing) {
                bVar.f23949W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.f27299k0.getGravity();
            int i13 = (gravity & (-113)) | 48;
            if (bVar.f23965g != i13) {
                bVar.f23965g = i13;
                bVar.h(false);
            }
            if (bVar.f23963f != gravity) {
                bVar.f23963f = gravity;
                bVar.h(false);
            }
            this.f27299k0.addTextChangedListener(new C5196b1(this, 1));
            if (this.f27304m1 == null) {
                this.f27304m1 = this.f27299k0.getHintTextColors();
            }
            if (this.f27271J0) {
                if (TextUtils.isEmpty(this.f27272K0)) {
                    CharSequence hint = this.f27299k0.getHint();
                    this.f27301l0 = hint;
                    setHint(hint);
                    this.f27299k0.setHint((CharSequence) null);
                }
                this.f27273L0 = true;
            }
            if (i12 >= 29) {
                p();
            }
            if (this.f27321v0 != null) {
                n(this.f27299k0.getText());
            }
            r();
            this.f27311q0.b();
            this.f27295i0.bringToFront();
            C3497o c3497o = this.f27297j0;
            c3497o.bringToFront();
            Iterator it = this.f27296i1.iterator();
            while (it.hasNext()) {
                ((C3496n) it.next()).a(this);
            }
            c3497o.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f27272K0)) {
            this.f27272K0 = charSequence;
            b bVar = this.f27328y1;
            if (charSequence == null || !TextUtils.equals(bVar.f23931A, charSequence)) {
                bVar.f23931A = charSequence;
                bVar.f23932B = null;
                Bitmap bitmap = bVar.f23935E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f23935E = null;
                }
                bVar.h(false);
            }
            if (!this.f27326x1) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f27329z0 == z10) {
            return;
        }
        if (z10) {
            C5215i0 c5215i0 = this.f27257A0;
            if (c5215i0 != null) {
                this.f27293h0.addView(c5215i0);
                this.f27257A0.setVisibility(0);
            }
        } else {
            C5215i0 c5215i02 = this.f27257A0;
            if (c5215i02 != null) {
                c5215i02.setVisibility(8);
            }
            this.f27257A0 = null;
        }
        this.f27329z0 = z10;
    }

    public final void a(float f6) {
        b bVar = this.f27328y1;
        if (bVar.f23955b == f6) {
            return;
        }
        if (this.f27260B1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f27260B1 = valueAnimator;
            valueAnimator.setInterpolator(P4.a.C0(getContext(), R.attr.motionEasingEmphasizedInterpolator, P7.a.f13839b));
            this.f27260B1.setDuration(P4.a.B0(getContext(), R.attr.motionDurationMedium4, 167));
            this.f27260B1.addUpdateListener(new S7.a(1, this));
        }
        this.f27260B1.setFloatValues(bVar.f23955b, f6);
        this.f27260B1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f27293h0;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        ColorStateList colorStateList;
        int i10;
        int i11;
        g gVar = this.f27274M0;
        if (gVar == null) {
            return;
        }
        j jVar = gVar.f29688Y.f29665a;
        j jVar2 = this.f27280S0;
        if (jVar != jVar2) {
            gVar.setShapeAppearanceModel(jVar2);
        }
        if (this.f27283V0 == 2 && (i10 = this.f27285X0) > -1 && (i11 = this.f27288a1) != 0) {
            g gVar2 = this.f27274M0;
            gVar2.f29688Y.f29675k = i10;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i11);
            f8.f fVar = gVar2.f29688Y;
            if (fVar.f29668d != valueOf) {
                fVar.f29668d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i12 = this.b1;
        if (this.f27283V0 == 1) {
            i12 = AbstractC5521c.b(this.b1, P4.a.Q(getContext(), R.attr.colorSurface, 0));
        }
        this.b1 = i12;
        this.f27274M0.k(ColorStateList.valueOf(i12));
        g gVar3 = this.f27278Q0;
        if (gVar3 != null && this.f27279R0 != null) {
            if (this.f27285X0 > -1 && this.f27288a1 != 0) {
                if (this.f27299k0.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.f27308o1);
                } else {
                    colorStateList = ColorStateList.valueOf(this.f27288a1);
                }
                gVar3.k(colorStateList);
                this.f27279R0.k(ColorStateList.valueOf(this.f27288a1));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d10;
        if (!this.f27271J0) {
            return 0;
        }
        int i10 = this.f27283V0;
        b bVar = this.f27328y1;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            d10 = bVar.d() / 2.0f;
        } else {
            d10 = bVar.d();
        }
        return (int) d10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G3.s, G3.i] */
    public final C0605i d() {
        ?? sVar = new s();
        sVar.f5924C0 = 3;
        sVar.f5949h0 = P4.a.B0(getContext(), R.attr.motionDurationShort2, 87);
        sVar.f5950i0 = P4.a.C0(getContext(), R.attr.motionEasingLinearInterpolator, P7.a.f13838a);
        return sVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f27299k0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f27301l0 != null) {
            boolean z10 = this.f27273L0;
            this.f27273L0 = false;
            CharSequence hint = editText.getHint();
            this.f27299k0.setHint(this.f27301l0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f27299k0.setHint(hint);
                this.f27273L0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f27293h0;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f27299k0) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f27264D1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f27264D1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i10;
        super.draw(canvas);
        boolean z10 = this.f27271J0;
        b bVar = this.f27328y1;
        if (z10) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f23932B != null) {
                RectF rectF = bVar.f23961e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f23944N;
                    textPaint.setTextSize(bVar.f23937G);
                    float f6 = bVar.f23974p;
                    float f10 = bVar.f23975q;
                    float f11 = bVar.f23936F;
                    if (f11 != 1.0f) {
                        canvas.scale(f11, f11, f6, f10);
                    }
                    if (bVar.f23960d0 > 1 && !bVar.f23933C) {
                        int alpha = textPaint.getAlpha();
                        canvas.translate(bVar.f23974p - bVar.f23951Y.getLineStart(0), f10);
                        float f12 = alpha;
                        textPaint.setAlpha((int) (bVar.f23956b0 * f12));
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            float f13 = bVar.f23938H;
                            float f14 = bVar.f23939I;
                            float f15 = bVar.f23940J;
                            int i12 = bVar.f23941K;
                            textPaint.setShadowLayer(f13, f14, f15, AbstractC5521c.d(i12, (textPaint.getAlpha() * Color.alpha(i12)) / 255));
                        }
                        bVar.f23951Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f23954a0 * f12));
                        if (i11 >= 31) {
                            float f16 = bVar.f23938H;
                            float f17 = bVar.f23939I;
                            float f18 = bVar.f23940J;
                            int i13 = bVar.f23941K;
                            textPaint.setShadowLayer(f16, f17, f18, AbstractC5521c.d(i13, (Color.alpha(i13) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f23951Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f23958c0;
                        float f19 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f19, textPaint);
                        if (i11 >= 31) {
                            textPaint.setShadowLayer(bVar.f23938H, bVar.f23939I, bVar.f23940J, bVar.f23941K);
                        }
                        String trim = bVar.f23958c0.toString().trim();
                        if (trim.endsWith("\u2026")) {
                            i10 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i10 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f23951Y.getLineEnd(i10), str.length()), 0.0f, f19, (Paint) textPaint);
                    } else {
                        canvas.translate(f6, f10);
                        bVar.f23951Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f27279R0 != null && (gVar = this.f27278Q0) != null) {
            gVar.draw(canvas);
            if (this.f27299k0.isFocused()) {
                Rect bounds = this.f27279R0.getBounds();
                Rect bounds2 = this.f27278Q0.getBounds();
                float f20 = bVar.f23955b;
                int centerX = bounds2.centerX();
                bounds.left = P7.a.c(f20, centerX, bounds2.left);
                bounds.right = P7.a.c(f20, centerX, bounds2.right);
                this.f27279R0.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        if (this.f27262C1) {
            return;
        }
        boolean z11 = true;
        this.f27262C1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f27328y1;
        if (bVar != null) {
            bVar.f23942L = drawableState;
            ColorStateList colorStateList2 = bVar.f23969k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f23968j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z10 = true;
                if (this.f27299k0 != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    if (!K.c(this) || !isEnabled()) {
                        z11 = false;
                    }
                    u(z11, false);
                }
                r();
                x();
                if (z10) {
                    invalidate();
                }
                this.f27262C1 = false;
            }
        }
        z10 = false;
        if (this.f27299k0 != null) {
        }
        r();
        x();
        if (z10) {
        }
        this.f27262C1 = false;
    }

    public final boolean e() {
        if (this.f27271J0 && !TextUtils.isEmpty(this.f27272K0) && (this.f27274M0 instanceof AbstractC3490h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [f8.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [nf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [nf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [nf.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [nf.h, java.lang.Object] */
    public final g f(boolean z10) {
        float f6;
        ColorStateList colorStateList;
        int i10;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = 0.0f;
        if (z10) {
            f10 = dimensionPixelOffset;
        }
        EditText editText = this.f27299k0;
        if (editText instanceof C3503u) {
            f6 = ((C3503u) editText).getPopupElevation();
        } else {
            f6 = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e J10 = M3.H.J();
        e J11 = M3.H.J();
        e J12 = M3.H.J();
        e J13 = M3.H.J();
        C2944a c2944a = new C2944a(f10);
        C2944a c2944a2 = new C2944a(f10);
        C2944a c2944a3 = new C2944a(dimensionPixelOffset);
        C2944a c2944a4 = new C2944a(dimensionPixelOffset);
        ?? obj5 = new Object();
        obj5.f29710a = obj;
        obj5.f29711b = obj2;
        obj5.f29712c = obj3;
        obj5.f29713d = obj4;
        obj5.f29714e = c2944a;
        obj5.f29715f = c2944a2;
        obj5.f29716g = c2944a4;
        obj5.f29717h = c2944a3;
        obj5.f29718i = J10;
        obj5.f29719j = J11;
        obj5.f29720k = J12;
        obj5.f29721l = J13;
        EditText editText2 = this.f27299k0;
        if (editText2 instanceof C3503u) {
            colorStateList = ((C3503u) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g.f29686B0;
            TypedValue l02 = M3.H.l0(R.attr.colorSurface, context, g.class.getSimpleName());
            int i11 = l02.resourceId;
            if (i11 != 0) {
                Object obj6 = AbstractC5042g.f41723a;
                i10 = AbstractC5039d.a(context, i11);
            } else {
                i10 = l02.data;
            }
            colorStateList = ColorStateList.valueOf(i10);
        }
        g gVar = new g();
        gVar.i(context);
        gVar.k(colorStateList);
        gVar.j(f6);
        gVar.setShapeAppearanceModel(obj5);
        f8.f fVar = gVar.f29688Y;
        if (fVar.f29672h == null) {
            fVar.f29672h = new Rect();
        }
        gVar.f29688Y.f29672h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (!z10 && getPrefixText() != null) {
            compoundPaddingLeft = this.f27295i0.a();
        } else if (z10 && getSuffixText() != null) {
            compoundPaddingLeft = this.f27297j0.c();
        } else {
            compoundPaddingLeft = this.f27299k0.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f27299k0;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public g getBoxBackground() {
        int i10 = this.f27283V0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.f27274M0;
    }

    public int getBoxBackgroundColor() {
        return this.b1;
    }

    public int getBoxBackgroundMode() {
        return this.f27283V0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f27284W0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean b02 = Df.H.b0(this);
        RectF rectF = this.f27291e1;
        if (b02) {
            return this.f27280S0.f29717h.a(rectF);
        }
        return this.f27280S0.f29716g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean b02 = Df.H.b0(this);
        RectF rectF = this.f27291e1;
        if (b02) {
            return this.f27280S0.f29716g.a(rectF);
        }
        return this.f27280S0.f29717h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean b02 = Df.H.b0(this);
        RectF rectF = this.f27291e1;
        if (b02) {
            return this.f27280S0.f29714e.a(rectF);
        }
        return this.f27280S0.f29715f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean b02 = Df.H.b0(this);
        RectF rectF = this.f27291e1;
        if (b02) {
            return this.f27280S0.f29715f.a(rectF);
        }
        return this.f27280S0.f29714e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f27312q1;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f27314r1;
    }

    public int getBoxStrokeWidth() {
        return this.f27286Y0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f27287Z0;
    }

    public int getCounterMaxLength() {
        return this.f27315s0;
    }

    public CharSequence getCounterOverflowDescription() {
        C5215i0 c5215i0;
        if (this.f27313r0 && this.f27317t0 && (c5215i0 = this.f27321v0) != null) {
            return c5215i0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f27268G0;
    }

    public ColorStateList getCounterTextColor() {
        return this.f27267F0;
    }

    public ColorStateList getCursorColor() {
        return this.f27269H0;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f27270I0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f27304m1;
    }

    public EditText getEditText() {
        return this.f27299k0;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f27297j0.f32801n0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f27297j0.f32801n0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f27297j0.f32807t0;
    }

    public int getEndIconMode() {
        return this.f27297j0.f32803p0;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f27297j0.f32808u0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f27297j0.f32801n0;
    }

    public CharSequence getError() {
        C3501s c3501s = this.f27311q0;
        if (c3501s.f32842q) {
            return c3501s.f32841p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f27311q0.f32845t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f27311q0.f32844s;
    }

    public int getErrorCurrentTextColors() {
        C5215i0 c5215i0 = this.f27311q0.f32843r;
        if (c5215i0 != null) {
            return c5215i0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f27297j0.f32797j0.getDrawable();
    }

    public CharSequence getHelperText() {
        C3501s c3501s = this.f27311q0;
        if (c3501s.f32849x) {
            return c3501s.f32848w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C5215i0 c5215i0 = this.f27311q0.f32850y;
        if (c5215i0 != null) {
            return c5215i0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f27271J0) {
            return this.f27272K0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f27328y1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f27328y1;
        return bVar.e(bVar.f23969k);
    }

    public ColorStateList getHintTextColor() {
        return this.f27306n1;
    }

    public AbstractC3507y getLengthCounter() {
        return this.f27319u0;
    }

    public int getMaxEms() {
        return this.f27305n0;
    }

    public int getMaxWidth() {
        return this.f27309p0;
    }

    public int getMinEms() {
        return this.f27303m0;
    }

    public int getMinWidth() {
        return this.f27307o0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f27297j0.f32801n0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f27297j0.f32801n0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f27329z0) {
            return this.f27327y0;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f27261C0;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f27259B0;
    }

    public CharSequence getPrefixText() {
        return this.f27295i0.f32868j0;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f27295i0.f32867i0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f27295i0.f32867i0;
    }

    public j getShapeAppearanceModel() {
        return this.f27280S0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f27295i0.f32869k0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f27295i0.f32869k0.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f27295i0.f32872n0;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f27295i0.f32873o0;
    }

    public CharSequence getSuffixText() {
        return this.f27297j0.f32810w0;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f27297j0.f32811x0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f27297j0.f32811x0;
    }

    public Typeface getTypeface() {
        return this.f27292f1;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight;
        if (!z10 && getSuffixText() != null) {
            compoundPaddingRight = this.f27297j0.c();
        } else if (z10 && getPrefixText() != null) {
            compoundPaddingRight = this.f27295i0.a();
        } else {
            compoundPaddingRight = this.f27299k0.getCompoundPaddingRight();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        int i10 = this.f27283V0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.f27271J0 && !(this.f27274M0 instanceof AbstractC3490h)) {
                        j jVar = this.f27280S0;
                        int i11 = AbstractC3490h.f32769D0;
                        if (jVar == null) {
                            jVar = new j();
                        }
                        this.f27274M0 = new AbstractC3490h(new C3488f(jVar, new RectF()));
                    } else {
                        this.f27274M0 = new g(this.f27280S0);
                    }
                    this.f27278Q0 = null;
                    this.f27279R0 = null;
                } else {
                    throw new IllegalArgumentException(android.gov.nist.core.a.l(new StringBuilder(), this.f27283V0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f27274M0 = new g(this.f27280S0);
                this.f27278Q0 = new g();
                this.f27279R0 = new g();
            }
        } else {
            this.f27274M0 = null;
            this.f27278Q0 = null;
            this.f27279R0 = null;
        }
        s();
        x();
        if (this.f27283V0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f27284W0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (A7.b.h1(getContext())) {
                this.f27284W0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f27299k0 != null && this.f27283V0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f27299k0;
                WeakHashMap weakHashMap = Z.f3247a;
                I.k(editText, I.f(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), I.e(this.f27299k0), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (A7.b.h1(getContext())) {
                EditText editText2 = this.f27299k0;
                WeakHashMap weakHashMap2 = Z.f3247a;
                I.k(editText2, I.f(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), I.e(this.f27299k0), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f27283V0 != 0) {
            t();
        }
        EditText editText3 = this.f27299k0;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f27283V0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f6;
        RectF rectF;
        float f10;
        int i10;
        float f11;
        float f12;
        int i11;
        if (!e()) {
            return;
        }
        int width = this.f27299k0.getWidth();
        int gravity = this.f27299k0.getGravity();
        b bVar = this.f27328y1;
        boolean b10 = bVar.b(bVar.f23931A);
        bVar.f23933C = b10;
        Rect rect = bVar.f23959d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b10) {
                    f12 = rect.right;
                    f11 = bVar.f23952Z;
                } else {
                    i11 = rect.left;
                    f6 = i11;
                }
            } else if (b10) {
                i11 = rect.left;
                f6 = i11;
            } else {
                f12 = rect.right;
                f11 = bVar.f23952Z;
            }
            float max = Math.max(f6, rect.left);
            rectF = this.f27291e1;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (bVar.f23933C) {
                        i10 = rect.right;
                        f10 = i10;
                    } else {
                        f10 = bVar.f23952Z + max;
                    }
                } else if (bVar.f23933C) {
                    f10 = max + bVar.f23952Z;
                } else {
                    i10 = rect.right;
                    f10 = i10;
                }
            } else {
                f10 = (width / 2.0f) + (bVar.f23952Z / 2.0f);
            }
            rectF.right = Math.min(f10, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f13 = rectF.left;
                float f14 = this.f27282U0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f27285X0);
                AbstractC3490h abstractC3490h = (AbstractC3490h) this.f27274M0;
                abstractC3490h.getClass();
                abstractC3490h.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f12 = width / 2.0f;
        f11 = bVar.f23952Z / 2.0f;
        f6 = f12 - f11;
        float max2 = Math.max(f6, rect.left);
        rectF = this.f27291e1;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f10 = (width / 2.0f) + (bVar.f23952Z / 2.0f);
        rectF.right = Math.min(f10, rect.right);
        rectF.bottom = bVar.d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void l(TextView textView, int i10) {
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(2131952067);
        Context context = getContext();
        Object obj = AbstractC5042g.f41723a;
        textView.setTextColor(AbstractC5039d.a(context, R.color.design_error));
    }

    public final boolean m() {
        C3501s c3501s = this.f27311q0;
        if (c3501s.f32840o == 1 && c3501s.f32843r != null && !TextUtils.isEmpty(c3501s.f32841p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z10;
        int i11;
        c cVar;
        ((a) this.f27319u0).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z11 = this.f27317t0;
        int i12 = this.f27315s0;
        String str = null;
        if (i12 == -1) {
            this.f27321v0.setText(String.valueOf(i10));
            this.f27321v0.setContentDescription(null);
            this.f27317t0 = false;
        } else {
            if (i10 > i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f27317t0 = z10;
            Context context = getContext();
            C5215i0 c5215i0 = this.f27321v0;
            int i13 = this.f27315s0;
            if (this.f27317t0) {
                i11 = R.string.character_counter_overflowed_content_description;
            } else {
                i11 = R.string.character_counter_content_description;
            }
            c5215i0.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z11 != this.f27317t0) {
                o();
            }
            String str2 = c.f1712d;
            Locale locale = Locale.getDefault();
            int i14 = q.f1731a;
            if (p.a(locale) == 1) {
                cVar = c.f1715g;
            } else {
                cVar = c.f1714f;
            }
            C5215i0 c5215i02 = this.f27321v0;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.f27315s0));
            if (string == null) {
                cVar.getClass();
            } else {
                str = cVar.c(string, cVar.f1718c).toString();
            }
            c5215i02.setText(str);
        }
        if (this.f27299k0 != null && z11 != this.f27317t0) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C5215i0 c5215i0 = this.f27321v0;
        if (c5215i0 != null) {
            if (this.f27317t0) {
                i10 = this.f27323w0;
            } else {
                i10 = this.f27325x0;
            }
            l(c5215i0, i10);
            if (!this.f27317t0 && (colorStateList2 = this.f27267F0) != null) {
                this.f27321v0.setTextColor(colorStateList2);
            }
            if (this.f27317t0 && (colorStateList = this.f27268G0) != null) {
                this.f27321v0.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f27328y1.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        C3497o c3497o = this.f27297j0;
        c3497o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.f27266E1 = false;
        if (this.f27299k0 != null && this.f27299k0.getMeasuredHeight() < (max = Math.max(c3497o.getMeasuredHeight(), this.f27295i0.getMeasuredHeight()))) {
            this.f27299k0.setMinimumHeight(max);
            z10 = true;
        }
        boolean q10 = q();
        if (z10 || q10) {
            this.f27299k0.post(new RunnableC3921k(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f27299k0;
        if (editText != null) {
            ThreadLocal threadLocal = a8.c.f23985a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f27289c1;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = a8.c.f23985a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            a8.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = a8.c.f23986b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f27278Q0;
            if (gVar != null) {
                int i16 = rect.bottom;
                gVar.setBounds(rect.left, i16 - this.f27286Y0, rect.right, i16);
            }
            g gVar2 = this.f27279R0;
            if (gVar2 != null) {
                int i17 = rect.bottom;
                gVar2.setBounds(rect.left, i17 - this.f27287Z0, rect.right, i17);
            }
            if (this.f27271J0) {
                float textSize = this.f27299k0.getTextSize();
                b bVar = this.f27328y1;
                if (bVar.f23966h != textSize) {
                    bVar.f23966h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f27299k0.getGravity();
                int i18 = (gravity & (-113)) | 48;
                if (bVar.f23965g != i18) {
                    bVar.f23965g = i18;
                    bVar.h(false);
                }
                if (bVar.f23963f != gravity) {
                    bVar.f23963f = gravity;
                    bVar.h(false);
                }
                if (this.f27299k0 != null) {
                    boolean b02 = Df.H.b0(this);
                    int i19 = rect.bottom;
                    Rect rect2 = this.f27290d1;
                    rect2.bottom = i19;
                    int i20 = this.f27283V0;
                    if (i20 != 1) {
                        if (i20 != 2) {
                            rect2.left = g(rect.left, b02);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, b02);
                        } else {
                            rect2.left = this.f27299k0.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f27299k0.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, b02);
                        rect2.top = rect.top + this.f27284W0;
                        rect2.right = h(rect.right, b02);
                    }
                    int i21 = rect2.left;
                    int i22 = rect2.top;
                    int i23 = rect2.right;
                    int i24 = rect2.bottom;
                    Rect rect3 = bVar.f23959d;
                    if (rect3.left != i21 || rect3.top != i22 || rect3.right != i23 || rect3.bottom != i24) {
                        rect3.set(i21, i22, i23, i24);
                        bVar.f23943M = true;
                    }
                    if (this.f27299k0 != null) {
                        TextPaint textPaint = bVar.f23945O;
                        textPaint.setTextSize(bVar.f23966h);
                        textPaint.setTypeface(bVar.f23979u);
                        textPaint.setLetterSpacing(bVar.f23949W);
                        float f6 = -textPaint.ascent();
                        rect2.left = this.f27299k0.getCompoundPaddingLeft() + rect.left;
                        if (this.f27283V0 == 1 && this.f27299k0.getMinLines() <= 1) {
                            i14 = (int) (rect.centerY() - (f6 / 2.0f));
                        } else {
                            i14 = rect.top + this.f27299k0.getCompoundPaddingTop();
                        }
                        rect2.top = i14;
                        rect2.right = rect.right - this.f27299k0.getCompoundPaddingRight();
                        if (this.f27283V0 == 1 && this.f27299k0.getMinLines() <= 1) {
                            i15 = (int) (rect2.top + f6);
                        } else {
                            i15 = rect.bottom - this.f27299k0.getCompoundPaddingBottom();
                        }
                        rect2.bottom = i15;
                        int i25 = rect2.left;
                        int i26 = rect2.top;
                        int i27 = rect2.right;
                        Rect rect4 = bVar.f23957c;
                        if (rect4.left != i25 || rect4.top != i26 || rect4.right != i27 || rect4.bottom != i15) {
                            rect4.set(i25, i26, i27, i15);
                            bVar.f23943M = true;
                        }
                        bVar.h(false);
                        if (e() && !this.f27326x1) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.f27266E1;
        C3497o c3497o = this.f27297j0;
        if (!z10) {
            c3497o.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f27266E1 = true;
        }
        if (this.f27257A0 != null && (editText = this.f27299k0) != null) {
            this.f27257A0.setGravity(editText.getGravity());
            this.f27257A0.setPadding(this.f27299k0.getCompoundPaddingLeft(), this.f27299k0.getCompoundPaddingTop(), this.f27299k0.getCompoundPaddingRight(), this.f27299k0.getCompoundPaddingBottom());
        }
        c3497o.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3508z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3508z c3508z = (C3508z) parcelable;
        super.onRestoreInstanceState(c3508z.f9325Y);
        setError(c3508z.f32877h0);
        if (c3508z.f32878i0) {
            post(new RunnableC3118k(17, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        boolean z10;
        super.onRtlPropertiesChanged(i10);
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f27281T0) {
            f8.c cVar = this.f27280S0.f29714e;
            RectF rectF = this.f27291e1;
            float a5 = cVar.a(rectF);
            float a10 = this.f27280S0.f29715f.a(rectF);
            float a11 = this.f27280S0.f29717h.a(rectF);
            float a12 = this.f27280S0.f29716g.a(rectF);
            j jVar = this.f27280S0;
            AbstractC4828h abstractC4828h = jVar.f29710a;
            AbstractC4828h abstractC4828h2 = jVar.f29711b;
            AbstractC4828h abstractC4828h3 = jVar.f29713d;
            AbstractC4828h abstractC4828h4 = jVar.f29712c;
            h hVar = new h(1);
            hVar.f28072a = abstractC4828h2;
            h.b(abstractC4828h2);
            hVar.f28073b = abstractC4828h;
            h.b(abstractC4828h);
            hVar.f28075d = abstractC4828h4;
            h.b(abstractC4828h4);
            hVar.f28074c = abstractC4828h3;
            h.b(abstractC4828h3);
            hVar.f28076e = new C2944a(a10);
            hVar.f28077f = new C2944a(a5);
            hVar.f28079h = new C2944a(a12);
            hVar.f28078g = new C2944a(a11);
            j a13 = hVar.a();
            this.f27281T0 = z10;
            setShapeAppearanceModel(a13);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, K1.b, i8.z] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        ?? bVar = new K1.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f32877h0 = getError();
        }
        C3497o c3497o = this.f27297j0;
        if (c3497o.f32803p0 != 0 && c3497o.f32801n0.f27212k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.f32878i0 = z10;
        return bVar;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f27269H0;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue j02 = M3.H.j0(context, R.attr.colorControlActivated);
            if (j02 != null) {
                int i10 = j02.resourceId;
                if (i10 != 0) {
                    colorStateList2 = AbstractC5042g.b(context, i10);
                } else {
                    int i11 = j02.data;
                    if (i11 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i11);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f27299k0;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f27299k0.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((m() || (this.f27321v0 != null && this.f27317t0)) && (colorStateList = this.f27270I0) != null) {
                    colorStateList2 = colorStateList;
                }
                AbstractC5656b.h(mutate, colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z10;
        C3497o c3497o;
        Drawable[] a5;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f27299k0 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z11 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C3505w c3505w = this.f27295i0;
            if (c3505w.getMeasuredWidth() > 0) {
                int measuredWidth = c3505w.getMeasuredWidth() - this.f27299k0.getPaddingLeft();
                if (this.g1 == null || this.f27294h1 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.g1 = colorDrawable3;
                    this.f27294h1 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] a10 = t.a(this.f27299k0);
                Drawable drawable2 = a10[0];
                ColorDrawable colorDrawable4 = this.g1;
                if (drawable2 != colorDrawable4) {
                    t.e(this.f27299k0, colorDrawable4, a10[1], a10[2], a10[3]);
                    z10 = true;
                    c3497o = this.f27297j0;
                    if ((!c3497o.e() || ((c3497o.f32803p0 != 0 && c3497o.d()) || c3497o.f32810w0 != null)) && c3497o.getMeasuredWidth() > 0) {
                        int measuredWidth2 = c3497o.f32811x0.getMeasuredWidth() - this.f27299k0.getPaddingRight();
                        if (!c3497o.e()) {
                            checkableImageButton = c3497o.f32797j0;
                        } else if (c3497o.f32803p0 != 0 && c3497o.d()) {
                            checkableImageButton = c3497o.f32801n0;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = AbstractC0365n.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        a5 = t.a(this.f27299k0);
                        colorDrawable = this.f27298j1;
                        if (colorDrawable == null && this.f27300k1 != measuredWidth2) {
                            this.f27300k1 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            t.e(this.f27299k0, a5[0], a5[1], this.f27298j1, a5[3]);
                        } else {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f27298j1 = colorDrawable5;
                                this.f27300k1 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = a5[2];
                            colorDrawable2 = this.f27298j1;
                            if (drawable == colorDrawable2) {
                                this.f27302l1 = drawable;
                                t.e(this.f27299k0, a5[0], a5[1], colorDrawable2, a5[3]);
                            } else {
                                z11 = z10;
                            }
                        }
                    } else if (this.f27298j1 != null) {
                        Drawable[] a11 = t.a(this.f27299k0);
                        if (a11[2] == this.f27298j1) {
                            t.e(this.f27299k0, a11[0], a11[1], this.f27302l1, a11[3]);
                        } else {
                            z11 = z10;
                        }
                        this.f27298j1 = null;
                    } else {
                        return z10;
                    }
                    return z11;
                }
                z10 = false;
                c3497o = this.f27297j0;
                if (!c3497o.e()) {
                }
                int measuredWidth22 = c3497o.f32811x0.getMeasuredWidth() - this.f27299k0.getPaddingRight();
                if (!c3497o.e()) {
                }
                if (checkableImageButton != null) {
                }
                a5 = t.a(this.f27299k0);
                colorDrawable = this.f27298j1;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = a5[2];
                colorDrawable2 = this.f27298j1;
                if (drawable == colorDrawable2) {
                }
                return z11;
            }
        }
        if (this.g1 != null) {
            Drawable[] a12 = t.a(this.f27299k0);
            t.e(this.f27299k0, null, a12[1], a12[2], a12[3]);
            this.g1 = null;
            z10 = true;
            c3497o = this.f27297j0;
            if (!c3497o.e()) {
            }
            int measuredWidth222 = c3497o.f32811x0.getMeasuredWidth() - this.f27299k0.getPaddingRight();
            if (!c3497o.e()) {
            }
            if (checkableImageButton != null) {
            }
            a5 = t.a(this.f27299k0);
            colorDrawable = this.f27298j1;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = a5[2];
            colorDrawable2 = this.f27298j1;
            if (drawable == colorDrawable2) {
            }
            return z11;
        }
        z10 = false;
        c3497o = this.f27297j0;
        if (!c3497o.e()) {
        }
        int measuredWidth2222 = c3497o.f32811x0.getMeasuredWidth() - this.f27299k0.getPaddingRight();
        if (!c3497o.e()) {
        }
        if (checkableImageButton != null) {
        }
        a5 = t.a(this.f27299k0);
        colorDrawable = this.f27298j1;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = a5[2];
        colorDrawable2 = this.f27298j1;
        if (drawable == colorDrawable2) {
        }
        return z11;
    }

    public final void r() {
        Drawable background;
        C5215i0 c5215i0;
        PorterDuffColorFilter h10;
        EditText editText = this.f27299k0;
        if (editText == null || this.f27283V0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC5238u0.f43561a;
        Drawable mutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = C5243x.f43584b;
            synchronized (C5243x.class) {
                h10 = X0.h(errorCurrentTextColors, mode);
            }
            mutate.setColorFilter(h10);
        } else if (this.f27317t0 && (c5215i0 = this.f27321v0) != null) {
            mutate.setColorFilter(C5243x.c(c5215i0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f27299k0.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f27299k0;
        if (editText != null && this.f27274M0 != null) {
            if ((this.f27277P0 || editText.getBackground() == null) && this.f27283V0 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f27299k0;
                WeakHashMap weakHashMap = Z.f3247a;
                H.q(editText2, editTextBoxBackground);
                this.f27277P0 = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.b1 != i10) {
            this.b1 = i10;
            this.f27316s1 = i10;
            this.f27320u1 = i10;
            this.f27322v1 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = AbstractC5042g.f41723a;
        setBoxBackgroundColor(AbstractC5039d.a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f27316s1 = defaultColor;
        this.b1 = defaultColor;
        this.f27318t1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f27320u1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f27322v1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f27283V0) {
            return;
        }
        this.f27283V0 = i10;
        if (this.f27299k0 != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f27284W0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        h e10 = this.f27280S0.e();
        f8.c cVar = this.f27280S0.f29714e;
        AbstractC4828h I10 = M3.H.I(i10);
        e10.f28072a = I10;
        h.b(I10);
        e10.f28076e = cVar;
        f8.c cVar2 = this.f27280S0.f29715f;
        AbstractC4828h I11 = M3.H.I(i10);
        e10.f28073b = I11;
        h.b(I11);
        e10.f28077f = cVar2;
        f8.c cVar3 = this.f27280S0.f29717h;
        AbstractC4828h I12 = M3.H.I(i10);
        e10.f28075d = I12;
        h.b(I12);
        e10.f28079h = cVar3;
        f8.c cVar4 = this.f27280S0.f29716g;
        AbstractC4828h I13 = M3.H.I(i10);
        e10.f28074c = I13;
        h.b(I13);
        e10.f28078g = cVar4;
        this.f27280S0 = e10.a();
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f27312q1 != i10) {
            this.f27312q1 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f27308o1 = colorStateList.getDefaultColor();
            this.f27324w1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f27310p1 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f27312q1 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f27312q1 != colorStateList.getDefaultColor()) {
            this.f27312q1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f27314r1 != colorStateList) {
            this.f27314r1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f27286Y0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f27287Z0 = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f27313r0 != z10) {
            Editable editable = null;
            C3501s c3501s = this.f27311q0;
            if (z10) {
                C5215i0 c5215i0 = new C5215i0(getContext(), null);
                this.f27321v0 = c5215i0;
                c5215i0.setId(R.id.textinput_counter);
                Typeface typeface = this.f27292f1;
                if (typeface != null) {
                    this.f27321v0.setTypeface(typeface);
                }
                this.f27321v0.setMaxLines(1);
                c3501s.a(this.f27321v0, 2);
                AbstractC0365n.h((ViewGroup.MarginLayoutParams) this.f27321v0.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f27321v0 != null) {
                    EditText editText = this.f27299k0;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                c3501s.g(this.f27321v0, 2);
                this.f27321v0 = null;
            }
            this.f27313r0 = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable editable;
        if (this.f27315s0 != i10) {
            if (i10 > 0) {
                this.f27315s0 = i10;
            } else {
                this.f27315s0 = -1;
            }
            if (this.f27313r0 && this.f27321v0 != null) {
                EditText editText = this.f27299k0;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                n(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f27323w0 != i10) {
            this.f27323w0 = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f27268G0 != colorStateList) {
            this.f27268G0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f27325x0 != i10) {
            this.f27325x0 = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f27267F0 != colorStateList) {
            this.f27267F0 = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f27269H0 != colorStateList) {
            this.f27269H0 = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f27270I0 != colorStateList) {
            this.f27270I0 = colorStateList;
            if (m() || (this.f27321v0 != null && this.f27317t0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f27304m1 = colorStateList;
        this.f27306n1 = colorStateList;
        if (this.f27299k0 != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f27297j0.f32801n0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f27297j0.f32801n0.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        C3497o c3497o = this.f27297j0;
        CharSequence text = i10 != 0 ? c3497o.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = c3497o.f32801n0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        C3497o c3497o = this.f27297j0;
        Drawable u10 = i10 != 0 ? m.u(c3497o.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = c3497o.f32801n0;
        checkableImageButton.setImageDrawable(u10);
        if (u10 != null) {
            ColorStateList colorStateList = c3497o.f32805r0;
            PorterDuff.Mode mode = c3497o.f32806s0;
            TextInputLayout textInputLayout = c3497o.f32795h0;
            AbstractC4344b.L(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC4344b.U0(textInputLayout, checkableImageButton, c3497o.f32805r0);
        }
    }

    public void setEndIconMinSize(int i10) {
        C3497o c3497o = this.f27297j0;
        if (i10 >= 0) {
            if (i10 != c3497o.f32807t0) {
                c3497o.f32807t0 = i10;
                CheckableImageButton checkableImageButton = c3497o.f32801n0;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = c3497o.f32797j0;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        c3497o.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.f27297j0.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C3497o c3497o = this.f27297j0;
        View.OnLongClickListener onLongClickListener = c3497o.f32809v0;
        CheckableImageButton checkableImageButton = c3497o.f32801n0;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32809v0 = onLongClickListener;
        CheckableImageButton checkableImageButton = c3497o.f32801n0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32808u0 = scaleType;
        c3497o.f32801n0.setScaleType(scaleType);
        c3497o.f32797j0.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C3497o c3497o = this.f27297j0;
        if (c3497o.f32805r0 != colorStateList) {
            c3497o.f32805r0 = colorStateList;
            AbstractC4344b.L(c3497o.f32795h0, c3497o.f32801n0, colorStateList, c3497o.f32806s0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C3497o c3497o = this.f27297j0;
        if (c3497o.f32806s0 != mode) {
            c3497o.f32806s0 = mode;
            AbstractC4344b.L(c3497o.f32795h0, c3497o.f32801n0, c3497o.f32805r0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f27297j0.h(z10);
    }

    public void setError(CharSequence charSequence) {
        C3501s c3501s = this.f27311q0;
        if (!c3501s.f32842q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            c3501s.c();
            c3501s.f32841p = charSequence;
            c3501s.f32843r.setText(charSequence);
            int i10 = c3501s.f32839n;
            if (i10 != 1) {
                c3501s.f32840o = 1;
            }
            c3501s.i(i10, c3501s.f32840o, c3501s.h(c3501s.f32843r, charSequence));
            return;
        }
        c3501s.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        C3501s c3501s = this.f27311q0;
        c3501s.f32845t = i10;
        C5215i0 c5215i0 = c3501s.f32843r;
        if (c5215i0 != null) {
            WeakHashMap weakHashMap = Z.f3247a;
            K.f(c5215i0, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C3501s c3501s = this.f27311q0;
        c3501s.f32844s = charSequence;
        C5215i0 c5215i0 = c3501s.f32843r;
        if (c5215i0 != null) {
            c5215i0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        C3501s c3501s = this.f27311q0;
        if (c3501s.f32842q != z10) {
            c3501s.c();
            TextInputLayout textInputLayout = c3501s.f32833h;
            if (z10) {
                C5215i0 c5215i0 = new C5215i0(c3501s.f32832g, null);
                c3501s.f32843r = c5215i0;
                c5215i0.setId(R.id.textinput_error);
                c3501s.f32843r.setTextAlignment(5);
                Typeface typeface = c3501s.f32825B;
                if (typeface != null) {
                    c3501s.f32843r.setTypeface(typeface);
                }
                int i10 = c3501s.f32846u;
                c3501s.f32846u = i10;
                C5215i0 c5215i02 = c3501s.f32843r;
                if (c5215i02 != null) {
                    textInputLayout.l(c5215i02, i10);
                }
                ColorStateList colorStateList = c3501s.f32847v;
                c3501s.f32847v = colorStateList;
                C5215i0 c5215i03 = c3501s.f32843r;
                if (c5215i03 != null && colorStateList != null) {
                    c5215i03.setTextColor(colorStateList);
                }
                CharSequence charSequence = c3501s.f32844s;
                c3501s.f32844s = charSequence;
                C5215i0 c5215i04 = c3501s.f32843r;
                if (c5215i04 != null) {
                    c5215i04.setContentDescription(charSequence);
                }
                int i11 = c3501s.f32845t;
                c3501s.f32845t = i11;
                C5215i0 c5215i05 = c3501s.f32843r;
                if (c5215i05 != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    K.f(c5215i05, i11);
                }
                c3501s.f32843r.setVisibility(4);
                c3501s.a(c3501s.f32843r, 0);
            } else {
                c3501s.f();
                c3501s.g(c3501s.f32843r, 0);
                c3501s.f32843r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            c3501s.f32842q = z10;
        }
    }

    public void setErrorIconDrawable(int i10) {
        C3497o c3497o = this.f27297j0;
        c3497o.i(i10 != 0 ? m.u(c3497o.getContext(), i10) : null);
        AbstractC4344b.U0(c3497o.f32795h0, c3497o.f32797j0, c3497o.f32798k0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C3497o c3497o = this.f27297j0;
        CheckableImageButton checkableImageButton = c3497o.f32797j0;
        View.OnLongClickListener onLongClickListener = c3497o.f32800m0;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32800m0 = onLongClickListener;
        CheckableImageButton checkableImageButton = c3497o.f32797j0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C3497o c3497o = this.f27297j0;
        if (c3497o.f32798k0 != colorStateList) {
            c3497o.f32798k0 = colorStateList;
            AbstractC4344b.L(c3497o.f32795h0, c3497o.f32797j0, colorStateList, c3497o.f32799l0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C3497o c3497o = this.f27297j0;
        if (c3497o.f32799l0 != mode) {
            c3497o.f32799l0 = mode;
            AbstractC4344b.L(c3497o.f32795h0, c3497o.f32797j0, c3497o.f32798k0, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        C3501s c3501s = this.f27311q0;
        c3501s.f32846u = i10;
        C5215i0 c5215i0 = c3501s.f32843r;
        if (c5215i0 != null) {
            c3501s.f32833h.l(c5215i0, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C3501s c3501s = this.f27311q0;
        c3501s.f32847v = colorStateList;
        C5215i0 c5215i0 = c3501s.f32843r;
        if (c5215i0 != null && colorStateList != null) {
            c5215i0.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f27330z1 != z10) {
            this.f27330z1 = z10;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C3501s c3501s = this.f27311q0;
        if (isEmpty) {
            if (c3501s.f32849x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c3501s.f32849x) {
            setHelperTextEnabled(true);
        }
        c3501s.c();
        c3501s.f32848w = charSequence;
        c3501s.f32850y.setText(charSequence);
        int i10 = c3501s.f32839n;
        if (i10 != 2) {
            c3501s.f32840o = 2;
        }
        c3501s.i(i10, c3501s.f32840o, c3501s.h(c3501s.f32850y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C3501s c3501s = this.f27311q0;
        c3501s.f32824A = colorStateList;
        C5215i0 c5215i0 = c3501s.f32850y;
        if (c5215i0 != null && colorStateList != null) {
            c5215i0.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        C3501s c3501s = this.f27311q0;
        if (c3501s.f32849x != z10) {
            c3501s.c();
            if (z10) {
                C5215i0 c5215i0 = new C5215i0(c3501s.f32832g, null);
                c3501s.f32850y = c5215i0;
                c5215i0.setId(R.id.textinput_helper_text);
                c3501s.f32850y.setTextAlignment(5);
                Typeface typeface = c3501s.f32825B;
                if (typeface != null) {
                    c3501s.f32850y.setTypeface(typeface);
                }
                c3501s.f32850y.setVisibility(4);
                K.f(c3501s.f32850y, 1);
                int i10 = c3501s.f32851z;
                c3501s.f32851z = i10;
                C5215i0 c5215i02 = c3501s.f32850y;
                if (c5215i02 != null) {
                    c5215i02.setTextAppearance(i10);
                }
                ColorStateList colorStateList = c3501s.f32824A;
                c3501s.f32824A = colorStateList;
                C5215i0 c5215i03 = c3501s.f32850y;
                if (c5215i03 != null && colorStateList != null) {
                    c5215i03.setTextColor(colorStateList);
                }
                c3501s.a(c3501s.f32850y, 1);
                c3501s.f32850y.setAccessibilityDelegate(new C3500r(c3501s));
            } else {
                c3501s.c();
                int i11 = c3501s.f32839n;
                if (i11 == 2) {
                    c3501s.f32840o = 0;
                }
                c3501s.i(i11, c3501s.f32840o, c3501s.h(c3501s.f32850y, ""));
                c3501s.g(c3501s.f32850y, 1);
                c3501s.f32850y = null;
                TextInputLayout textInputLayout = c3501s.f32833h;
                textInputLayout.r();
                textInputLayout.x();
            }
            c3501s.f32849x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        C3501s c3501s = this.f27311q0;
        c3501s.f32851z = i10;
        C5215i0 c5215i0 = c3501s.f32850y;
        if (c5215i0 != null) {
            c5215i0.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f27271J0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f27258A1 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f27271J0) {
            this.f27271J0 = z10;
            if (!z10) {
                this.f27273L0 = false;
                if (!TextUtils.isEmpty(this.f27272K0) && TextUtils.isEmpty(this.f27299k0.getHint())) {
                    this.f27299k0.setHint(this.f27272K0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f27299k0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f27272K0)) {
                        setHint(hint);
                    }
                    this.f27299k0.setHint((CharSequence) null);
                }
                this.f27273L0 = true;
            }
            if (this.f27299k0 != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.f27328y1;
        View view = bVar.f23953a;
        C2306c c2306c = new C2306c(view.getContext(), i10);
        ColorStateList colorStateList = c2306c.f26361j;
        if (colorStateList != null) {
            bVar.f23969k = colorStateList;
        }
        float f6 = c2306c.f26362k;
        if (f6 != 0.0f) {
            bVar.f23967i = f6;
        }
        ColorStateList colorStateList2 = c2306c.f26352a;
        if (colorStateList2 != null) {
            bVar.f23947U = colorStateList2;
        }
        bVar.S = c2306c.f26356e;
        bVar.T = c2306c.f26357f;
        bVar.f23946R = c2306c.f26358g;
        bVar.f23948V = c2306c.f26360i;
        C2304a c2304a = bVar.f23983y;
        if (c2304a != null) {
            c2304a.f26347j = true;
        }
        y7.b bVar2 = new y7.b(3, bVar);
        c2306c.a();
        bVar.f23983y = new C2304a(bVar2, c2306c.f26365n);
        c2306c.c(view.getContext(), bVar.f23983y);
        bVar.h(false);
        this.f27306n1 = bVar.f23969k;
        if (this.f27299k0 != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f27306n1 != colorStateList) {
            if (this.f27304m1 == null) {
                b bVar = this.f27328y1;
                if (bVar.f23969k != colorStateList) {
                    bVar.f23969k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f27306n1 = colorStateList;
            if (this.f27299k0 != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(AbstractC3507y abstractC3507y) {
        this.f27319u0 = abstractC3507y;
    }

    public void setMaxEms(int i10) {
        this.f27305n0 = i10;
        EditText editText = this.f27299k0;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f27309p0 = i10;
        EditText editText = this.f27299k0;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f27303m0 = i10;
        EditText editText = this.f27299k0;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f27307o0 = i10;
        EditText editText = this.f27299k0;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32801n0.setContentDescription(i10 != 0 ? c3497o.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32801n0.setImageDrawable(i10 != 0 ? m.u(c3497o.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        C3497o c3497o = this.f27297j0;
        if (z10 && c3497o.f32803p0 != 1) {
            c3497o.g(1);
        } else if (!z10) {
            c3497o.g(0);
        } else {
            c3497o.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32805r0 = colorStateList;
        AbstractC4344b.L(c3497o.f32795h0, c3497o.f32801n0, colorStateList, c3497o.f32806s0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C3497o c3497o = this.f27297j0;
        c3497o.f32806s0 = mode;
        AbstractC4344b.L(c3497o.f32795h0, c3497o.f32801n0, c3497o.f32805r0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f27257A0 == null) {
            C5215i0 c5215i0 = new C5215i0(getContext(), null);
            this.f27257A0 = c5215i0;
            c5215i0.setId(R.id.textinput_placeholder);
            H.s(this.f27257A0, 2);
            C0605i d10 = d();
            this.f27263D0 = d10;
            d10.f5948Z = 67L;
            this.f27265E0 = d();
            setPlaceholderTextAppearance(this.f27261C0);
            setPlaceholderTextColor(this.f27259B0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f27329z0) {
                setPlaceholderTextEnabled(true);
            }
            this.f27327y0 = charSequence;
        }
        EditText editText = this.f27299k0;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f27261C0 = i10;
        C5215i0 c5215i0 = this.f27257A0;
        if (c5215i0 != null) {
            c5215i0.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f27259B0 != colorStateList) {
            this.f27259B0 = colorStateList;
            C5215i0 c5215i0 = this.f27257A0;
            if (c5215i0 != null && colorStateList != null) {
                c5215i0.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        C3505w c3505w = this.f27295i0;
        c3505w.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        c3505w.f32868j0 = charSequence2;
        c3505w.f32867i0.setText(charSequence);
        c3505w.e();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f27295i0.f32867i0.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f27295i0.f32867i0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.f27274M0;
        if (gVar != null && gVar.f29688Y.f29665a != jVar) {
            this.f27280S0 = jVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f27295i0.f32869k0.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27295i0.f32869k0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? m.u(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        C3505w c3505w = this.f27295i0;
        if (i10 >= 0) {
            if (i10 != c3505w.f32872n0) {
                c3505w.f32872n0 = i10;
                CheckableImageButton checkableImageButton = c3505w.f32869k0;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        c3505w.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C3505w c3505w = this.f27295i0;
        View.OnLongClickListener onLongClickListener = c3505w.f32874p0;
        CheckableImageButton checkableImageButton = c3505w.f32869k0;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3505w c3505w = this.f27295i0;
        c3505w.f32874p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = c3505w.f32869k0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC4344b.b1(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C3505w c3505w = this.f27295i0;
        c3505w.f32873o0 = scaleType;
        c3505w.f32869k0.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C3505w c3505w = this.f27295i0;
        if (c3505w.f32870l0 != colorStateList) {
            c3505w.f32870l0 = colorStateList;
            AbstractC4344b.L(c3505w.f32866h0, c3505w.f32869k0, colorStateList, c3505w.f32871m0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C3505w c3505w = this.f27295i0;
        if (c3505w.f32871m0 != mode) {
            c3505w.f32871m0 = mode;
            AbstractC4344b.L(c3505w.f32866h0, c3505w.f32869k0, c3505w.f32870l0, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f27295i0.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        C3497o c3497o = this.f27297j0;
        c3497o.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        c3497o.f32810w0 = charSequence2;
        c3497o.f32811x0.setText(charSequence);
        c3497o.n();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f27297j0.f32811x0.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f27297j0.f32811x0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C3506x c3506x) {
        EditText editText = this.f27299k0;
        if (editText != null) {
            Z.l(editText, c3506x);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f27292f1) {
            this.f27292f1 = typeface;
            this.f27328y1.m(typeface);
            C3501s c3501s = this.f27311q0;
            if (typeface != c3501s.f32825B) {
                c3501s.f32825B = typeface;
                C5215i0 c5215i0 = c3501s.f32843r;
                if (c5215i0 != null) {
                    c5215i0.setTypeface(typeface);
                }
                C5215i0 c5215i02 = c3501s.f32850y;
                if (c5215i02 != null) {
                    c5215i02.setTypeface(typeface);
                }
            }
            C5215i0 c5215i03 = this.f27321v0;
            if (c5215i03 != null) {
                c5215i03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f27283V0 != 1) {
            FrameLayout frameLayout = this.f27293h0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        C5215i0 c5215i0;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f27299k0;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f27299k0;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.f27304m1;
        b bVar = this.f27328y1;
        if (colorStateList3 != null) {
            bVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f27304m1;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.f27324w1);
            } else {
                i10 = this.f27324w1;
            }
            bVar.i(ColorStateList.valueOf(i10));
        } else if (m()) {
            C5215i0 c5215i02 = this.f27311q0.f32843r;
            if (c5215i02 != null) {
                colorStateList2 = c5215i02.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.i(colorStateList2);
        } else if (this.f27317t0 && (c5215i0 = this.f27321v0) != null) {
            bVar.i(c5215i0.getTextColors());
        } else if (z13 && (colorStateList = this.f27306n1) != null && bVar.f23969k != colorStateList) {
            bVar.f23969k = colorStateList;
            bVar.h(false);
        }
        C3497o c3497o = this.f27297j0;
        C3505w c3505w = this.f27295i0;
        if (!z12 && this.f27330z1 && (!isEnabled() || !z13)) {
            if (z11 || !this.f27326x1) {
                ValueAnimator valueAnimator = this.f27260B1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f27260B1.cancel();
                }
                if (z10 && this.f27258A1) {
                    a(0.0f);
                } else {
                    bVar.k(0.0f);
                }
                if (e() && (!((AbstractC3490h) this.f27274M0).f32770C0.f32768v.isEmpty()) && e()) {
                    ((AbstractC3490h) this.f27274M0).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f27326x1 = true;
                C5215i0 c5215i03 = this.f27257A0;
                if (c5215i03 != null && this.f27329z0) {
                    c5215i03.setText((CharSequence) null);
                    v.a(this.f27293h0, this.f27265E0);
                    this.f27257A0.setVisibility(4);
                }
                c3505w.f32875q0 = true;
                c3505w.e();
                c3497o.f32812y0 = true;
                c3497o.n();
            }
        } else if (z11 || this.f27326x1) {
            ValueAnimator valueAnimator2 = this.f27260B1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f27260B1.cancel();
            }
            if (z10 && this.f27258A1) {
                a(1.0f);
            } else {
                bVar.k(1.0f);
            }
            this.f27326x1 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f27299k0;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            v(editable);
            c3505w.f32875q0 = false;
            c3505w.e();
            c3497o.f32812y0 = false;
            c3497o.n();
        }
    }

    public final void v(Editable editable) {
        ((a) this.f27319u0).getClass();
        FrameLayout frameLayout = this.f27293h0;
        if ((editable == null || editable.length() == 0) && !this.f27326x1) {
            if (this.f27257A0 != null && this.f27329z0 && !TextUtils.isEmpty(this.f27327y0)) {
                this.f27257A0.setText(this.f27327y0);
                v.a(frameLayout, this.f27263D0);
                this.f27257A0.setVisibility(0);
                this.f27257A0.bringToFront();
                announceForAccessibility(this.f27327y0);
                return;
            }
            return;
        }
        C5215i0 c5215i0 = this.f27257A0;
        if (c5215i0 != null && this.f27329z0) {
            c5215i0.setText((CharSequence) null);
            v.a(frameLayout, this.f27265E0);
            this.f27257A0.setVisibility(4);
        }
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.f27314r1.getDefaultColor();
        int colorForState = this.f27314r1.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f27314r1.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f27288a1 = colorForState2;
        } else if (z11) {
            this.f27288a1 = colorForState;
        } else {
            this.f27288a1 = defaultColor;
        }
    }

    public final void x() {
        boolean z10;
        C5215i0 c5215i0;
        EditText editText;
        EditText editText2;
        if (this.f27274M0 != null && this.f27283V0 != 0) {
            boolean z11 = false;
            if (!isFocused() && ((editText2 = this.f27299k0) == null || !editText2.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (isHovered() || ((editText = this.f27299k0) != null && editText.isHovered())) {
                z11 = true;
            }
            if (!isEnabled()) {
                this.f27288a1 = this.f27324w1;
            } else if (m()) {
                if (this.f27314r1 != null) {
                    w(z10, z11);
                } else {
                    this.f27288a1 = getErrorCurrentTextColors();
                }
            } else if (this.f27317t0 && (c5215i0 = this.f27321v0) != null) {
                if (this.f27314r1 != null) {
                    w(z10, z11);
                } else {
                    this.f27288a1 = c5215i0.getCurrentTextColor();
                }
            } else if (z10) {
                this.f27288a1 = this.f27312q1;
            } else if (z11) {
                this.f27288a1 = this.f27310p1;
            } else {
                this.f27288a1 = this.f27308o1;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            C3497o c3497o = this.f27297j0;
            c3497o.l();
            CheckableImageButton checkableImageButton = c3497o.f32797j0;
            ColorStateList colorStateList = c3497o.f32798k0;
            TextInputLayout textInputLayout = c3497o.f32795h0;
            AbstractC4344b.U0(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = c3497o.f32805r0;
            CheckableImageButton checkableImageButton2 = c3497o.f32801n0;
            AbstractC4344b.U0(textInputLayout, checkableImageButton2, colorStateList2);
            if (c3497o.b() instanceof C3494l) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    AbstractC5656b.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    AbstractC4344b.L(textInputLayout, checkableImageButton2, c3497o.f32805r0, c3497o.f32806s0);
                }
            }
            C3505w c3505w = this.f27295i0;
            AbstractC4344b.U0(c3505w.f32866h0, c3505w.f32869k0, c3505w.f32870l0);
            if (this.f27283V0 == 2) {
                int i10 = this.f27285X0;
                if (z10 && isEnabled()) {
                    this.f27285X0 = this.f27287Z0;
                } else {
                    this.f27285X0 = this.f27286Y0;
                }
                if (this.f27285X0 != i10 && e() && !this.f27326x1) {
                    if (e()) {
                        ((AbstractC3490h) this.f27274M0).o(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f27283V0 == 1) {
                if (!isEnabled()) {
                    this.b1 = this.f27318t1;
                } else if (z11 && !z10) {
                    this.b1 = this.f27322v1;
                } else if (z10) {
                    this.b1 = this.f27320u1;
                } else {
                    this.b1 = this.f27316s1;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f27295i0.b(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f27297j0.f32801n0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f27297j0.f32801n0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f27297j0.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f27297j0.f32801n0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C3497o c3497o = this.f27297j0;
        CheckableImageButton checkableImageButton = c3497o.f32801n0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c3497o.f32805r0;
            PorterDuff.Mode mode = c3497o.f32806s0;
            TextInputLayout textInputLayout = c3497o.f32795h0;
            AbstractC4344b.L(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC4344b.U0(textInputLayout, checkableImageButton, c3497o.f32805r0);
        }
    }
}
