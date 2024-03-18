package com.google.android.material.transformation;

import D1.K;
import D1.Z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m1.AbstractC4544a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC4544a {
    public ExpandableBehavior() {
    }

    @Override // m1.AbstractC4544a
    public abstract void b(View view);

    @Override // m1.AbstractC4544a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC2469q0.p(view2);
        throw null;
    }

    @Override // m1.AbstractC4544a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = Z.f3247a;
        if (!K.c(view)) {
            ArrayList j6 = coordinatorLayout.j(view);
            int size = j6.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) j6.get(i11);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
