package V1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import id.AbstractC3557B;

/* renamed from: V1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1469j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1471l f18207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f18208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f18209c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e0 f18210d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C1467h f18211e;

    public C1469j(C1471l c1471l, View view, boolean z10, e0 e0Var, C1467h c1467h) {
        this.f18207a = c1471l;
        this.f18208b = view;
        this.f18209c = z10;
        this.f18210d = e0Var;
        this.f18211e = c1467h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC3557B.c0("anim", animator);
        ViewGroup viewGroup = this.f18207a.f18216a;
        View view = this.f18208b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f18209c;
        e0 e0Var = this.f18210d;
        if (z10) {
            int i10 = e0Var.f18183a;
            AbstractC3557B.b0("viewToAnimate", view);
            R.a.i(i10, view);
        }
        this.f18211e.b();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + e0Var + " has ended.");
        }
    }
}
