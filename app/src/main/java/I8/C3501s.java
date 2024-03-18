package i8;

import D1.I;
import D1.K;
import D1.Z;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q.C5215i0;

/* renamed from: i8.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3501s {

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f32824A;

    /* renamed from: B  reason: collision with root package name */
    public Typeface f32825B;

    /* renamed from: a  reason: collision with root package name */
    public final int f32826a;

    /* renamed from: b  reason: collision with root package name */
    public final int f32827b;

    /* renamed from: c  reason: collision with root package name */
    public final int f32828c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f32829d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f32830e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f32831f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f32832g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f32833h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f32834i;

    /* renamed from: j  reason: collision with root package name */
    public int f32835j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f32836k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f32837l;

    /* renamed from: m  reason: collision with root package name */
    public final float f32838m;

    /* renamed from: n  reason: collision with root package name */
    public int f32839n;

    /* renamed from: o  reason: collision with root package name */
    public int f32840o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f32841p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f32842q;

    /* renamed from: r  reason: collision with root package name */
    public C5215i0 f32843r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f32844s;

    /* renamed from: t  reason: collision with root package name */
    public int f32845t;

    /* renamed from: u  reason: collision with root package name */
    public int f32846u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f32847v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f32848w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f32849x;

    /* renamed from: y  reason: collision with root package name */
    public C5215i0 f32850y;

    /* renamed from: z  reason: collision with root package name */
    public int f32851z;

    public C3501s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f32832g = context;
        this.f32833h = textInputLayout;
        this.f32838m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f32826a = P4.a.B0(context, R.attr.motionDurationShort4, 217);
        this.f32827b = P4.a.B0(context, R.attr.motionDurationMedium4, 167);
        this.f32828c = P4.a.B0(context, R.attr.motionDurationShort4, 167);
        this.f32829d = P4.a.C0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, P7.a.f13841d);
        LinearInterpolator linearInterpolator = P7.a.f13838a;
        this.f32830e = P4.a.C0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f32831f = P4.a.C0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        if (this.f32834i == null && this.f32836k == null) {
            Context context = this.f32832g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f32834i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f32834i;
            TextInputLayout textInputLayout = this.f32833h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f32836k = new FrameLayout(context);
            this.f32834i.addView(this.f32836k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            this.f32834i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f32836k.setVisibility(0);
            this.f32836k.addView(textView);
        }
        this.f32834i.setVisibility(0);
        this.f32835j++;
    }

    public final void b() {
        if (this.f32834i != null) {
            TextInputLayout textInputLayout = this.f32833h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f32832g;
                boolean h12 = A7.b.h1(context);
                LinearLayout linearLayout = this.f32834i;
                WeakHashMap weakHashMap = Z.f3247a;
                int f6 = I.f(editText);
                if (h12) {
                    f6 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (h12) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int e10 = I.e(editText);
                if (h12) {
                    e10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                I.k(linearLayout, f6, dimensionPixelSize, e10, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f32837l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        float f6;
        long j6;
        TimeInterpolator timeInterpolator;
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f6);
                int i13 = this.f32828c;
                if (z11) {
                    j6 = this.f32827b;
                } else {
                    j6 = i13;
                }
                ofFloat.setDuration(j6);
                if (z11) {
                    timeInterpolator = this.f32830e;
                } else {
                    timeInterpolator = this.f32831f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    ofFloat.setStartDelay(i13);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f32838m, 0.0f);
                    ofFloat2.setDuration(this.f32826a);
                    ofFloat2.setInterpolator(this.f32829d);
                    ofFloat2.setStartDelay(i13);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f32850y;
        }
        return this.f32843r;
    }

    public final void f() {
        this.f32841p = null;
        c();
        if (this.f32839n == 1) {
            if (this.f32849x && !TextUtils.isEmpty(this.f32848w)) {
                this.f32840o = 2;
            } else {
                this.f32840o = 0;
            }
        }
        i(this.f32839n, this.f32840o, h(this.f32843r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f32834i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f32836k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f32835j - 1;
        this.f32835j = i11;
        LinearLayout linearLayout2 = this.f32834i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = Z.f3247a;
        TextInputLayout textInputLayout = this.f32833h;
        if (K.c(textInputLayout) && textInputLayout.isEnabled() && (this.f32840o != this.f32839n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView e10;
        TextView e11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f32837l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f32849x, this.f32850y, 2, i10, i11);
            d(arrayList, this.f32842q, this.f32843r, 1, i10, i11);
            P4.a.w0(animatorSet, arrayList);
            animatorSet.addListener(new C3499q(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e11 = e(i11)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(4);
                if (i10 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f32839n = i11;
        }
        TextInputLayout textInputLayout = this.f32833h;
        textInputLayout.r();
        textInputLayout.u(z10, false);
        textInputLayout.x();
    }
}
