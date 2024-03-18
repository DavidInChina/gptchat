package com.google.android.material.behavior;

import D1.H;
import D1.Z;
import E1.h;
import L1.e;
import R7.a;
import S4.o;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import m1.AbstractC4544a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC4544a {

    /* renamed from: a  reason: collision with root package name */
    public e f27011a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27012b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27013c;

    /* renamed from: d  reason: collision with root package name */
    public int f27014d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final float f27015e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f27016f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f27017g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final a f27018h = new a(this);

    @Override // m1.AbstractC4544a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f27012b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f27012b = false;
            }
        } else {
            z10 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f27012b = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f27011a == null) {
            this.f27011a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f27018h);
        }
        if (!this.f27013c && this.f27011a.p(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // m1.AbstractC4544a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = Z.f3247a;
        if (H.c(view) == 0) {
            H.s(view, 1);
            Z.i(view, 1048576);
            Z.g(view, 0);
            if (r(view)) {
                Z.j(view, h.f4107l, new o(4, this));
            }
        }
        return false;
    }

    @Override // m1.AbstractC4544a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f27011a != null) {
            if (!this.f27013c || motionEvent.getActionMasked() != 3) {
                this.f27011a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean r(View view) {
        return true;
    }
}
