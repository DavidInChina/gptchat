package com.google.android.material.appbar;

import D1.Z;
import Gi.e;
import O7.a;
import Q7.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m1.AbstractC4544a;
import m1.C4547d;

/* loaded from: classes2.dex */
public class AppBarLayout$ScrollingViewBehavior extends d {

    /* renamed from: c  reason: collision with root package name */
    public final int f26997c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
        }
    }

    @Override // m1.AbstractC4544a
    public final void b(View view) {
    }

    @Override // m1.AbstractC4544a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i10;
        AbstractC4544a abstractC4544a = ((C4547d) view2.getLayoutParams()).f38851a;
        if (abstractC4544a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC4544a).getClass();
            int i11 = this.f26997c;
            if (i11 == 0) {
                i10 = 0;
            } else {
                i10 = e.q((int) (0.0f * i11), 0, i11);
            }
            int i12 = bottom - i10;
            WeakHashMap weakHashMap = Z.f3247a;
            view.offsetTopAndBottom(i12);
        }
        return false;
    }

    @Override // m1.AbstractC4544a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int i13 = view.getLayoutParams().height;
        if (i13 == -1 || i13 == -2) {
            s(coordinatorLayout.j(view));
            return false;
        }
        return false;
    }

    @Override // m1.AbstractC4544a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // Q7.d
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i10) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i10);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13422u);
        this.f26997c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
