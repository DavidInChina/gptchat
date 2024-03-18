package w3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: w3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6100g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6101h f47873b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f47874c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f47875d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C6103j f47876e;

    public /* synthetic */ C6100g(C6103j c6103j, C6101h c6101h, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f47872a = i10;
        this.f47876e = c6103j;
        this.f47873b = c6101h;
        this.f47874c = viewPropertyAnimator;
        this.f47875d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f47872a;
        C6103j c6103j = this.f47876e;
        C6101h c6101h = this.f47873b;
        View view = this.f47875d;
        ViewPropertyAnimator viewPropertyAnimator = this.f47874c;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c6103j.c(c6101h.f47883a);
                c6103j.f47910r.remove(c6101h.f47883a);
                c6103j.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                c6103j.c(c6101h.f47884b);
                c6103j.f47910r.remove(c6101h.f47884b);
                c6103j.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f47872a;
        C6103j c6103j = this.f47876e;
        C6101h c6101h = this.f47873b;
        switch (i10) {
            case 0:
                Y y10 = c6101h.f47883a;
                c6103j.getClass();
                return;
            default:
                Y y11 = c6101h.f47884b;
                c6103j.getClass();
                return;
        }
    }
}
