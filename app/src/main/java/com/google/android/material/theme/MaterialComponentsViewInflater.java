package com.google.android.material.theme;

import H1.b;
import O7.a;
import V7.c;
import a8.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.openai.chatgpt.R;
import i8.C3503u;
import j8.C3924a;
import k8.AbstractC4203a;
import m.C4514K;
import q.C5215i0;
import q.C5230q;
import q.C5233s;
import q.C5235t;
import q.H;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C4514K {
    @Override // m.C4514K
    public final C5230q a(Context context, AttributeSet attributeSet) {
        return new C3503u(context, attributeSet);
    }

    @Override // m.C4514K
    public final C5233s b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // m.C4514K
    public final C5235t c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.a, android.widget.CompoundButton, android.view.View, q.H] */
    @Override // m.C4514K
    public final H d(Context context, AttributeSet attributeSet) {
        ?? h10 = new H(AbstractC4203a.a(context, attributeSet, R.attr.radioButtonStyle, 2131952703), attributeSet);
        Context context2 = h10.getContext();
        TypedArray e10 = k.e(context2, attributeSet, a.f13416o, R.attr.radioButtonStyle, 2131952703, new int[0]);
        if (e10.hasValue(0)) {
            b.c(h10, A7.b.L0(context2, e10, 0));
        }
        h10.f25654m0 = e10.getBoolean(1, false);
        e10.recycle();
        return h10;
    }

    @Override // m.C4514K
    public final C5215i0 e(Context context, AttributeSet attributeSet) {
        C5215i0 c5215i0 = new C5215i0(AbstractC4203a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = c5215i0.getContext();
        if (M3.H.k0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a.f13419r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m10 = C3924a.m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m10 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a.f13418q);
                    int m11 = C3924a.m(c5215i0.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (m11 >= 0) {
                        c5215i0.setLineHeight(m11);
                    }
                }
            }
        }
        return c5215i0;
    }
}
