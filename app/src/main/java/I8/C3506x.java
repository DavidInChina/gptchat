package i8;

import D1.C0343c;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import q.C5215i0;

/* renamed from: i8.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3506x extends C0343c {

    /* renamed from: i0  reason: collision with root package name */
    public final TextInputLayout f32876i0;

    public C3506x(TextInputLayout textInputLayout) {
        this.f32876i0 = textInputLayout;
    }

    @Override // D1.C0343c
    public final void e(View view, E1.p pVar) {
        CharSequence charSequence;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f3255Y;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f4118a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f32876i0;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z10 = !isEmpty;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(hint);
        boolean z13 = !textInputLayout.f27326x1;
        boolean z14 = !TextUtils.isEmpty(error);
        if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
            z11 = false;
        }
        if (z12) {
            str = hint.toString();
        } else {
            str = "";
        }
        C3505w c3505w = textInputLayout.f27295i0;
        C5215i0 c5215i0 = c3505w.f32867i0;
        if (c5215i0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c5215i0);
            accessibilityNodeInfo.setTraversalAfter(c5215i0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(c3505w.f32869k0);
        }
        if (z10) {
            pVar.n(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            pVar.n(str);
            if (z13 && placeholderText != null) {
                pVar.n(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            pVar.n(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                pVar.l(str);
            } else {
                if (z10) {
                    str = ((Object) charSequence) + ", " + str;
                }
                pVar.n(str);
            }
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                pVar.h(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z11) {
            if (!z14) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C5215i0 c5215i02 = textInputLayout.f27311q0.f32850y;
        if (c5215i02 != null) {
            accessibilityNodeInfo.setLabelFor(c5215i02);
        }
        textInputLayout.f27297j0.b().n(pVar);
    }

    @Override // D1.C0343c
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        this.f32876i0.f27297j0.b().o(accessibilityEvent);
    }
}
