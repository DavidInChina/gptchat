package com.google.android.material.snackbar;

import U3.i;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h8.AbstractC3333c;
import y7.b;

/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i  reason: collision with root package name */
    public final b f27250i = new b((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, m1.AbstractC4544a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b bVar = this.f27250i;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (i.f17413j0 == null) {
                    i.f17413j0 = new i(9);
                }
                i iVar = i.f17413j0;
                AbstractC2469q0.p(bVar.f50831Z);
                synchronized (iVar.f17414Y) {
                    AbstractC2469q0.p(iVar.f17416h0);
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (i.f17413j0 == null) {
                i.f17413j0 = new i(9);
            }
            i iVar2 = i.f17413j0;
            AbstractC2469q0.p(bVar.f50831Z);
            iVar2.G();
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f27250i.getClass();
        return view instanceof AbstractC3333c;
    }
}
