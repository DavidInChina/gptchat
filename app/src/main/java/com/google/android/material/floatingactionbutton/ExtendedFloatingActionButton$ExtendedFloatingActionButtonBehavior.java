package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.a;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m1.AbstractC4544a;
import m1.C4547d;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC4544a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // m1.AbstractC4544a
    public final /* bridge */ /* synthetic */ boolean a(View view) {
        a.u(view);
        throw null;
    }

    @Override // m1.AbstractC4544a
    public final void c(C4547d c4547d) {
        if (c4547d.f38858h == 0) {
            c4547d.f38858h = 80;
        }
    }

    @Override // m1.AbstractC4544a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a.u(view);
        throw null;
    }

    @Override // m1.AbstractC4544a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a.u(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13407f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
