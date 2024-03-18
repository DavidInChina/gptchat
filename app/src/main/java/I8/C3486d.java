package i8;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.openai.chatgpt.R;
import j7.RunnableC3921k;

/* renamed from: i8.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3486d extends AbstractC3498p {

    /* renamed from: e  reason: collision with root package name */
    public final int f32758e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32759f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f32760g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f32761h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f32762i;

    /* renamed from: j  reason: collision with root package name */
    public final com.google.android.material.datepicker.l f32763j = new com.google.android.material.datepicker.l(1, this);

    /* renamed from: k  reason: collision with root package name */
    public final View$OnFocusChangeListenerC3483a f32764k = new View$OnFocusChangeListenerC3483a(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f32765l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f32766m;

    public C3486d(C3497o c3497o) {
        super(c3497o);
        this.f32758e = P4.a.B0(c3497o.getContext(), R.attr.motionDurationShort3, 100);
        this.f32759f = P4.a.B0(c3497o.getContext(), R.attr.motionDurationShort3, 150);
        this.f32760g = P4.a.C0(c3497o.getContext(), R.attr.motionEasingLinearInterpolator, P7.a.f13838a);
        this.f32761h = P4.a.C0(c3497o.getContext(), R.attr.motionEasingEmphasizedInterpolator, P7.a.f13841d);
    }

    @Override // i8.AbstractC3498p
    public final void a() {
        if (this.f32815b.f32810w0 != null) {
            return;
        }
        t(u());
    }

    @Override // i8.AbstractC3498p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // i8.AbstractC3498p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // i8.AbstractC3498p
    public final View.OnFocusChangeListener e() {
        return this.f32764k;
    }

    @Override // i8.AbstractC3498p
    public final View.OnClickListener f() {
        return this.f32763j;
    }

    @Override // i8.AbstractC3498p
    public final View.OnFocusChangeListener g() {
        return this.f32764k;
    }

    @Override // i8.AbstractC3498p
    public final void m(EditText editText) {
        this.f32762i = editText;
        this.f32814a.setEndIconVisible(u());
    }

    @Override // i8.AbstractC3498p
    public final void p(boolean z10) {
        if (this.f32815b.f32810w0 == null) {
            return;
        }
        t(z10);
    }

    @Override // i8.AbstractC3498p
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f32761h);
        ofFloat.setDuration(this.f32759f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: i8.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C3486d f32755b;

            {
                this.f32755b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i10 = r2;
                C3486d c3486d = this.f32755b;
                c3486d.getClass();
                switch (i10) {
                    case 0:
                        c3486d.f32817d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3486d.f32817d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f32760g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i10 = this.f32758e;
        ofFloat2.setDuration(i10);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: i8.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C3486d f32755b;

            {
                this.f32755b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i102 = r2;
                C3486d c3486d = this.f32755b;
                c3486d.getClass();
                switch (i102) {
                    case 0:
                        c3486d.f32817d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3486d.f32817d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32765l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f32765l.addListener(new C3485c(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i10);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: i8.b

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ C3486d f32755b;

            {
                this.f32755b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i102 = r2;
                C3486d c3486d = this.f32755b;
                c3486d.getClass();
                switch (i102) {
                    case 0:
                        c3486d.f32817d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c3486d.f32817d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f32766m = ofFloat3;
        ofFloat3.addListener(new C3485c(this, 1));
    }

    @Override // i8.AbstractC3498p
    public final void s() {
        EditText editText = this.f32762i;
        if (editText != null) {
            editText.post(new RunnableC3921k(4, this));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f32815b.d() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f32765l.isRunning()) {
            this.f32766m.cancel();
            this.f32765l.start();
            if (z11) {
                this.f32765l.end();
            }
        } else if (!z10) {
            this.f32765l.cancel();
            this.f32766m.start();
            if (z11) {
                this.f32766m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f32762i;
        if (editText != null && ((editText.hasFocus() || this.f32817d.hasFocus()) && this.f32762i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
