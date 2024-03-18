package com.google.android.material.snackbar;

import D1.I;
import D1.Z;
import P4.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.openai.chatgpt.R;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: h0  reason: collision with root package name */
    public TextView f27251h0;

    /* renamed from: i0  reason: collision with root package name */
    public Button f27252i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f27253j0;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.C0(context, R.attr.motionEasingEmphasizedInterpolator, P7.a.f13839b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f27251h0.getPaddingTop() == i11 && this.f27251h0.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f27251h0;
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.g(textView)) {
            I.k(textView, I.f(textView), i11, I.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f27252i0;
    }

    public TextView getMessageView() {
        return this.f27251h0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f27251h0 = (TextView) findViewById(R.id.snackbar_text);
        this.f27252i0 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f27251h0.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f27253j0 > 0 && this.f27252i0.getMeasuredWidth() > this.f27253j0) {
            if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
        } else {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f27253j0 = i10;
    }
}
