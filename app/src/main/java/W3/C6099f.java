package w3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: w3.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6099f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Y f47856a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f47857b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f47858c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f47859d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f47860e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C6103j f47861f;

    public C6099f(C6103j c6103j, Y y10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f47861f = c6103j;
        this.f47856a = y10;
        this.f47857b = i10;
        this.f47858c = view;
        this.f47859d = i11;
        this.f47860e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f47857b;
        View view = this.f47858c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f47859d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f47860e.setListener(null);
        C6103j c6103j = this.f47861f;
        Y y10 = this.f47856a;
        c6103j.c(y10);
        c6103j.f47908p.remove(y10);
        c6103j.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f47861f.getClass();
    }
}
