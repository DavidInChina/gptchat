package i8;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: i8.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3496n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3497o f32790a;

    public C3496n(C3497o c3497o) {
        this.f32790a = c3497o;
    }

    public final void a(TextInputLayout textInputLayout) {
        C3497o c3497o = this.f32790a;
        if (c3497o.f32813z0 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c3497o.f32813z0;
        C3495m c3495m = c3497o.f32794C0;
        if (editText != null) {
            editText.removeTextChangedListener(c3495m);
            if (c3497o.f32813z0.getOnFocusChangeListener() == c3497o.b().e()) {
                c3497o.f32813z0.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c3497o.f32813z0 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c3495m);
        }
        c3497o.b().m(c3497o.f32813z0);
        c3497o.j(c3497o.b());
    }
}
