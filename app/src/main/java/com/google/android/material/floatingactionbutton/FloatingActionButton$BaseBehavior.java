package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.a;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m1.AbstractC4544a;
import m1.C4547d;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC4544a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // m1.AbstractC4544a
    public final boolean a(View view) {
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

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O7.a.f13408g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
