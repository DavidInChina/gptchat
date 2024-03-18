package S1;

import Q1.l;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class j implements TextWatcher {

    /* renamed from: Y  reason: collision with root package name */
    public final EditText f16081Y;

    /* renamed from: h0  reason: collision with root package name */
    public i f16083h0;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f16082Z = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f16084i0 = true;

    public j(EditText editText) {
        this.f16081Y = editText;
    }

    public static void a(EditText editText, int i10) {
        int i11;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l a5 = l.a();
            if (editableText == null) {
                i11 = 0;
            } else {
                a5.getClass();
                i11 = editableText.length();
            }
            a5.g(0, i11, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f16081Y;
        if (!editText.isInEditMode() && this.f16084i0) {
            if ((this.f16082Z || l.c()) && i11 <= i12 && (charSequence instanceof Spannable)) {
                int b10 = l.a().b();
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 3) {
                            return;
                        }
                    } else {
                        l.a().g(i10, i12 + i10, (Spannable) charSequence);
                        return;
                    }
                }
                l a5 = l.a();
                if (this.f16083h0 == null) {
                    this.f16083h0 = new i(editText);
                }
                a5.h(this.f16083h0);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
