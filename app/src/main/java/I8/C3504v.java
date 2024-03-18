package i8;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.openai.chatgpt.R;

/* renamed from: i8.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3504v extends AbstractC3498p {

    /* renamed from: e  reason: collision with root package name */
    public final int f32863e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f32864f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.material.datepicker.l f32865g = new com.google.android.material.datepicker.l(3, this);

    public C3504v(C3497o c3497o, int i10) {
        super(c3497o);
        this.f32863e = R.drawable.design_password_eye;
        if (i10 != 0) {
            this.f32863e = i10;
        }
    }

    @Override // i8.AbstractC3498p
    public final void b() {
        q();
    }

    @Override // i8.AbstractC3498p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // i8.AbstractC3498p
    public final int d() {
        return this.f32863e;
    }

    @Override // i8.AbstractC3498p
    public final View.OnClickListener f() {
        return this.f32865g;
    }

    @Override // i8.AbstractC3498p
    public final boolean k() {
        return true;
    }

    @Override // i8.AbstractC3498p
    public final boolean l() {
        boolean z10;
        EditText editText = this.f32864f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // i8.AbstractC3498p
    public final void m(EditText editText) {
        this.f32864f = editText;
        q();
    }

    @Override // i8.AbstractC3498p
    public final void r() {
        EditText editText = this.f32864f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f32864f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // i8.AbstractC3498p
    public final void s() {
        EditText editText = this.f32864f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
