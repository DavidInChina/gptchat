package i8;

import D1.H;
import D1.Z;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.openai.chatgpt.R;
import j7.RunnableC3921k;
import java.util.WeakHashMap;
import q.C5200d;

/* renamed from: i8.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3494l extends AbstractC3498p {

    /* renamed from: e  reason: collision with root package name */
    public final int f32775e;

    /* renamed from: f  reason: collision with root package name */
    public final int f32776f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f32777g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f32778h;

    /* renamed from: l  reason: collision with root package name */
    public boolean f32782l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f32783m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f32784n;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f32786p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f32787q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f32788r;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.material.datepicker.l f32779i = new com.google.android.material.datepicker.l(2, this);

    /* renamed from: j  reason: collision with root package name */
    public final View$OnFocusChangeListenerC3483a f32780j = new View$OnFocusChangeListenerC3483a(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final C3493k f32781k = new C3493k(0, this);

    /* renamed from: o  reason: collision with root package name */
    public long f32785o = Long.MAX_VALUE;

    public C3494l(C3497o c3497o) {
        super(c3497o);
        this.f32776f = P4.a.B0(c3497o.getContext(), R.attr.motionDurationShort3, 67);
        this.f32775e = P4.a.B0(c3497o.getContext(), R.attr.motionDurationShort3, 50);
        this.f32777g = P4.a.C0(c3497o.getContext(), R.attr.motionEasingLinearInterpolator, P7.a.f13838a);
    }

    @Override // i8.AbstractC3498p
    public final void a() {
        if (this.f32786p.isTouchExplorationEnabled() && U3.f.c0(this.f32778h) && !this.f32817d.hasFocus()) {
            this.f32778h.dismissDropDown();
        }
        this.f32778h.post(new RunnableC3921k(5, this));
    }

    @Override // i8.AbstractC3498p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // i8.AbstractC3498p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // i8.AbstractC3498p
    public final View.OnFocusChangeListener e() {
        return this.f32780j;
    }

    @Override // i8.AbstractC3498p
    public final View.OnClickListener f() {
        return this.f32779i;
    }

    @Override // i8.AbstractC3498p
    public final E1.d h() {
        return this.f32781k;
    }

    @Override // i8.AbstractC3498p
    public final boolean i(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    @Override // i8.AbstractC3498p
    public final boolean j() {
        return this.f32782l;
    }

    @Override // i8.AbstractC3498p
    public final boolean l() {
        return this.f32784n;
    }

    @Override // i8.AbstractC3498p
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f32778h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: i8.i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z10;
                    C3494l c3494l = C3494l.this;
                    c3494l.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - c3494l.f32785o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            c3494l.f32783m = false;
                        }
                        c3494l.u();
                        c3494l.f32783m = true;
                        c3494l.f32785o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f32778h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: i8.j
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C3494l c3494l = C3494l.this;
                    c3494l.f32783m = true;
                    c3494l.f32785o = System.currentTimeMillis();
                    c3494l.t(false);
                }
            });
            this.f32778h.setThreshold(0);
            TextInputLayout textInputLayout = this.f32814a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!U3.f.c0(editText) && this.f32786p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = Z.f3247a;
                H.s(this.f32817d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // i8.AbstractC3498p
    public final void n(E1.p pVar) {
        boolean z10;
        if (!U3.f.c0(this.f32778h)) {
            pVar.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = pVar.f4118a.isShowingHintText();
        } else {
            z10 = pVar.e(4);
        }
        if (z10) {
            pVar.l(null);
        }
    }

    @Override // i8.AbstractC3498p
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (this.f32786p.isEnabled() && !U3.f.c0(this.f32778h)) {
            if (accessibilityEvent.getEventType() == 32768 && this.f32784n && !this.f32778h.isPopupShowing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z10) {
                u();
                this.f32783m = true;
                this.f32785o = System.currentTimeMillis();
            }
        }
    }

    @Override // i8.AbstractC3498p
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f32777g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f32776f);
        ofFloat.addUpdateListener(new v4.g(1, this));
        this.f32788r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f32775e);
        ofFloat2.addUpdateListener(new v4.g(1, this));
        this.f32787q = ofFloat2;
        ofFloat2.addListener(new C5200d(6, this));
        this.f32786p = (AccessibilityManager) this.f32816c.getSystemService("accessibility");
    }

    @Override // i8.AbstractC3498p
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f32778h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f32778h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f32784n != z10) {
            this.f32784n = z10;
            this.f32788r.cancel();
            this.f32787q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f32778h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f32785o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f32783m = false;
        }
        if (!this.f32783m) {
            t(!this.f32784n);
            if (this.f32784n) {
                this.f32778h.requestFocus();
                this.f32778h.showDropDown();
                return;
            }
            this.f32778h.dismissDropDown();
            return;
        }
        this.f32783m = false;
    }
}
