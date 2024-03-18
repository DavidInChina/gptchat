package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import i8.C3486d;
import i8.C3494l;
import i8.C3504v;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27157Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f27158Z;

    public /* synthetic */ l(int i10, Object obj) {
        this.f27157Y = i10;
        this.f27158Z = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27157Y;
        Object obj = this.f27158Z;
        switch (i10) {
            case 0:
                int i11 = n.f27162O1;
                ((n) obj).Q();
                throw null;
            case 1:
                C3486d c3486d = (C3486d) obj;
                EditText editText = c3486d.f32762i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    c3486d.q();
                    return;
                }
                return;
            case 2:
                ((C3494l) obj).u();
                return;
            default:
                C3504v c3504v = (C3504v) obj;
                EditText editText2 = c3504v.f32864f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c3504v.f32864f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c3504v.f32864f.setTransformationMethod(null);
                    } else {
                        c3504v.f32864f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        c3504v.f32864f.setSelection(selectionEnd);
                    }
                    c3504v.q();
                    return;
                }
                return;
        }
    }
}
