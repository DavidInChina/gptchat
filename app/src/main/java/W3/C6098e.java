package w3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: w3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6098e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47847a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Y f47848b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f47849c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f47850d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C6103j f47851e;

    public C6098e(C6103j c6103j, Y y10, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f47851e = c6103j;
        this.f47848b = y10;
        this.f47849c = view;
        this.f47850d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47847a) {
            case 1:
                this.f47849c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f47847a;
        Y y10 = this.f47848b;
        C6103j c6103j = this.f47851e;
        ViewPropertyAnimator viewPropertyAnimator = this.f47850d;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f47849c.setAlpha(1.0f);
                c6103j.c(y10);
                c6103j.f47909q.remove(y10);
                c6103j.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                c6103j.c(y10);
                c6103j.f47907o.remove(y10);
                c6103j.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f47847a;
        C6103j c6103j = this.f47851e;
        switch (i10) {
            case 0:
                c6103j.getClass();
                return;
            default:
                c6103j.getClass();
                return;
        }
    }

    public C6098e(C6103j c6103j, Y y10, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f47851e = c6103j;
        this.f47848b = y10;
        this.f47850d = viewPropertyAnimator;
        this.f47849c = view;
    }
}
