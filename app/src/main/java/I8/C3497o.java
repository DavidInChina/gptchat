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
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l8.AbstractC4344b;
import p.View$OnAttachStateChangeListenerC5030f;
import q.C5215i0;

/* renamed from: i8.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3497o extends LinearLayout {

    /* renamed from: D0  reason: collision with root package name */
    public static final /* synthetic */ int f32791D0 = 0;

    /* renamed from: B0  reason: collision with root package name */
    public E1.d f32793B0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextInputLayout f32795h0;

    /* renamed from: i0  reason: collision with root package name */
    public final FrameLayout f32796i0;

    /* renamed from: j0  reason: collision with root package name */
    public final CheckableImageButton f32797j0;

    /* renamed from: k0  reason: collision with root package name */
    public ColorStateList f32798k0;

    /* renamed from: l0  reason: collision with root package name */
    public PorterDuff.Mode f32799l0;

    /* renamed from: m0  reason: collision with root package name */
    public View.OnLongClickListener f32800m0;

    /* renamed from: n0  reason: collision with root package name */
    public final CheckableImageButton f32801n0;

    /* renamed from: o0  reason: collision with root package name */
    public final j.j f32802o0;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f32805r0;

    /* renamed from: s0  reason: collision with root package name */
    public PorterDuff.Mode f32806s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f32807t0;

    /* renamed from: u0  reason: collision with root package name */
    public ImageView.ScaleType f32808u0;

    /* renamed from: v0  reason: collision with root package name */
    public View.OnLongClickListener f32809v0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence f32810w0;

    /* renamed from: x0  reason: collision with root package name */
    public final C5215i0 f32811x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f32812y0;

    /* renamed from: z0  reason: collision with root package name */
    public EditText f32813z0;

    /* renamed from: p0  reason: collision with root package name */
    public int f32803p0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public final LinkedHashSet f32804q0 = new LinkedHashSet();

    /* renamed from: C0  reason: collision with root package name */
    public final C3495m f32794C0 = new C3495m(this);

    /* renamed from: A0  reason: collision with root package name */
    public final AccessibilityManager f32792A0 = (AccessibilityManager) getContext().getSystemService("accessibility");

    /* JADX WARN: Type inference failed for: r11v1, types: [j.j, java.lang.Object] */
    public C3497o(TextInputLayout textInputLayout, U3.u uVar) {
        super(textInputLayout.getContext());
        CharSequence C10;
        C3496n c3496n = new C3496n(this);
        this.f32795h0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f32796i0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a5 = a(this, from, R.id.text_input_error_icon);
        this.f32797j0 = a5;
        CheckableImageButton a10 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f32801n0 = a10;
        ?? obj = new Object();
        obj.f35819h0 = new SparseArray();
        obj.f35820i0 = this;
        obj.f35817Y = uVar.z(28, 0);
        obj.f35818Z = uVar.z(52, 0);
        this.f32802o0 = obj;
        CharSequence charSequence = null;
        C5215i0 c5215i0 = new C5215i0(getContext(), null);
        this.f32811x0 = c5215i0;
        if (uVar.E(38)) {
            this.f32798k0 = A7.b.K0(getContext(), uVar, 38);
        }
        if (uVar.E(39)) {
            this.f32799l0 = H.j0(uVar.x(39, -1), null);
        }
        if (uVar.E(37)) {
            i(uVar.t(37));
        }
        a5.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = Z.f3247a;
        D1.H.s(a5, 2);
        a5.setClickable(false);
        a5.setPressable(false);
        a5.setFocusable(false);
        if (!uVar.E(53)) {
            if (uVar.E(32)) {
                this.f32805r0 = A7.b.K0(getContext(), uVar, 32);
            }
            if (uVar.E(33)) {
                this.f32806s0 = H.j0(uVar.x(33, -1), null);
            }
        }
        if (uVar.E(30)) {
            g(uVar.x(30, 0));
            if (uVar.E(27) && a10.getContentDescription() != (C10 = uVar.C(27))) {
                a10.setContentDescription(C10);
            }
            a10.setCheckable(uVar.o(26, true));
        } else if (uVar.E(53)) {
            if (uVar.E(54)) {
                this.f32805r0 = A7.b.K0(getContext(), uVar, 54);
            }
            if (uVar.E(55)) {
                this.f32806s0 = H.j0(uVar.x(55, -1), null);
            }
            g(uVar.o(53, false) ? 1 : 0);
            CharSequence C11 = uVar.C(51);
            if (a10.getContentDescription() != C11) {
                a10.setContentDescription(C11);
            }
        }
        int s10 = uVar.s(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (s10 >= 0) {
            if (s10 != this.f32807t0) {
                this.f32807t0 = s10;
                a10.setMinimumWidth(s10);
                a10.setMinimumHeight(s10);
                a5.setMinimumWidth(s10);
                a5.setMinimumHeight(s10);
            }
            if (uVar.E(31)) {
                ImageView.ScaleType X10 = AbstractC4344b.X(uVar.x(31, -1));
                this.f32808u0 = X10;
                a10.setScaleType(X10);
                a5.setScaleType(X10);
            }
            c5215i0.setVisibility(8);
            c5215i0.setId(R.id.textinput_suffix_text);
            c5215i0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            K.f(c5215i0, 1);
            c5215i0.setTextAppearance(uVar.z(72, 0));
            if (uVar.E(73)) {
                c5215i0.setTextColor(uVar.p(73));
            }
            CharSequence C12 = uVar.C(71);
            this.f32810w0 = !TextUtils.isEmpty(C12) ? C12 : charSequence;
            c5215i0.setText(C12);
            n();
            frameLayout.addView(a10);
            addView(c5215i0);
            addView(frameLayout);
            addView(a5);
            textInputLayout.f27296i1.add(c3496n);
            if (textInputLayout.f27299k0 != null) {
                c3496n.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5030f(5, this));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (A7.b.h1(getContext())) {
            AbstractC0365n.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final AbstractC3498p b() {
        int i10 = this.f32803p0;
        j.j jVar = this.f32802o0;
        AbstractC3498p abstractC3498p = (AbstractC3498p) ((SparseArray) jVar.f35819h0).get(i10);
        if (abstractC3498p == null) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                abstractC3498p = new C3494l((C3497o) jVar.f35820i0);
                            } else {
                                throw new IllegalArgumentException(android.gov.nist.core.a.e("Invalid end icon mode: ", i10));
                            }
                        } else {
                            abstractC3498p = new C3486d((C3497o) jVar.f35820i0);
                        }
                    } else {
                        abstractC3498p = new C3504v((C3497o) jVar.f35820i0, jVar.f35818Z);
                    }
                } else {
                    abstractC3498p = new C3487e((C3497o) jVar.f35820i0, 1);
                }
            } else {
                abstractC3498p = new C3487e((C3497o) jVar.f35820i0, 0);
            }
            ((SparseArray) jVar.f35819h0).append(i10, abstractC3498p);
        }
        return abstractC3498p;
    }

    public final int c() {
        int i10;
        if (!d() && !e()) {
            i10 = 0;
        } else {
            CheckableImageButton checkableImageButton = this.f32801n0;
            i10 = AbstractC0365n.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = Z.f3247a;
        return I.e(this.f32811x0) + I.e(this) + i10;
    }

    public final boolean d() {
        if (this.f32796i0.getVisibility() == 0 && this.f32801n0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f32797j0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean z12;
        AbstractC3498p b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.f32801n0;
        boolean z13 = true;
        if (k10 && (z12 = checkableImageButton.f27212k0) != b10.l()) {
            checkableImageButton.setChecked(!z12);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof C3494l) && (isActivated = checkableImageButton.isActivated()) != b10.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z13 = z11;
        }
        if (z10 || z13) {
            AbstractC4344b.U0(this.f32795h0, checkableImageButton, this.f32805r0);
        }
    }

    public final void g(int i10) {
        boolean z10;
        Drawable drawable;
        if (this.f32803p0 == i10) {
            return;
        }
        AbstractC3498p b10 = b();
        E1.d dVar = this.f32793B0;
        AccessibilityManager accessibilityManager = this.f32792A0;
        if (dVar != null && accessibilityManager != null) {
            E1.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.f32793B0 = null;
        b10.s();
        this.f32803p0 = i10;
        Iterator it = this.f32804q0.iterator();
        if (!it.hasNext()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h(z10);
            AbstractC3498p b11 = b();
            int i11 = this.f32802o0.f35817Y;
            if (i11 == 0) {
                i11 = b11.d();
            }
            if (i11 != 0) {
                drawable = kotlin.jvm.internal.m.u(getContext(), i11);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f32801n0;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f32795h0;
            if (drawable != null) {
                AbstractC4344b.L(textInputLayout, checkableImageButton, this.f32805r0, this.f32806s0);
                AbstractC4344b.U0(textInputLayout, checkableImageButton, this.f32805r0);
            }
            int c10 = b11.c();
            if (c10 != 0) {
                charSequence = getResources().getText(c10);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.k());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.r();
                E1.d h10 = b11.h();
                this.f32793B0 = h10;
                if (h10 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = Z.f3247a;
                    if (K.b(this)) {
                        E1.c.a(accessibilityManager, this.f32793B0);
                    }
                }
                View.OnClickListener f6 = b11.f();
                View.OnLongClickListener onLongClickListener = this.f32809v0;
                checkableImageButton.setOnClickListener(f6);
                AbstractC4344b.b1(checkableImageButton, onLongClickListener);
                EditText editText = this.f32813z0;
                if (editText != null) {
                    b11.m(editText);
                    j(b11);
                }
                AbstractC4344b.L(textInputLayout, checkableImageButton, this.f32805r0, this.f32806s0);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final void h(boolean z10) {
        int i10;
        if (d() != z10) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f32801n0.setVisibility(i10);
            k();
            m();
            this.f32795h0.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f32797j0;
        checkableImageButton.setImageDrawable(drawable);
        l();
        AbstractC4344b.L(this.f32795h0, checkableImageButton, this.f32798k0, this.f32799l0);
    }

    public final void j(AbstractC3498p abstractC3498p) {
        if (this.f32813z0 == null) {
            return;
        }
        if (abstractC3498p.e() != null) {
            this.f32813z0.setOnFocusChangeListener(abstractC3498p.e());
        }
        if (abstractC3498p.g() != null) {
            this.f32801n0.setOnFocusChangeListener(abstractC3498p.g());
        }
    }

    public final void k() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.f32801n0.getVisibility() == 0 && !e()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f32796i0.setVisibility(i10);
        if (this.f32810w0 != null && !this.f32812y0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (d() || e() || !z10) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void l() {
        int i10;
        CheckableImageButton checkableImageButton = this.f32797j0;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f32795h0;
        if (drawable != null && textInputLayout.f27311q0.f32842q && textInputLayout.m()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        k();
        m();
        if (this.f32803p0 == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i10;
        TextInputLayout textInputLayout = this.f32795h0;
        if (textInputLayout.f27299k0 == null) {
            return;
        }
        if (!d() && !e()) {
            EditText editText = textInputLayout.f27299k0;
            WeakHashMap weakHashMap = Z.f3247a;
            i10 = I.e(editText);
        } else {
            i10 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f27299k0.getPaddingTop();
        int paddingBottom = textInputLayout.f27299k0.getPaddingBottom();
        WeakHashMap weakHashMap2 = Z.f3247a;
        I.k(this.f32811x0, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void n() {
        int i10;
        C5215i0 c5215i0 = this.f32811x0;
        int visibility = c5215i0.getVisibility();
        boolean z10 = false;
        if (this.f32810w0 != null && !this.f32812y0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            AbstractC3498p b10 = b();
            if (i10 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        k();
        c5215i0.setVisibility(i10);
        this.f32795h0.q();
    }
}
