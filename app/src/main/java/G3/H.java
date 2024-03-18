package G3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter implements r {

    /* renamed from: a  reason: collision with root package name */
    public final View f5890a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5891b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f5892c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5894e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5895f = false;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5893d = true;

    public H(View view, int i10) {
        this.f5890a = view;
        this.f5891b = i10;
        this.f5892c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // G3.r
    public final void a() {
        f(false);
    }

    @Override // G3.r
    public final void d(s sVar) {
        if (!this.f5895f) {
            A.f5879a.z(this.f5890a, this.f5891b);
            ViewGroup viewGroup = this.f5892c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        sVar.w(this);
    }

    @Override // G3.r
    public final void e() {
        f(true);
    }

    public final void f(boolean z10) {
        ViewGroup viewGroup;
        if (this.f5893d && this.f5894e != z10 && (viewGroup = this.f5892c) != null) {
            this.f5894e = z10;
            L4.a.T0(viewGroup, z10);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5895f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f5895f) {
            A.f5879a.z(this.f5890a, this.f5891b);
            ViewGroup viewGroup = this.f5892c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f5895f) {
            A.f5879a.z(this.f5890a, this.f5891b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f5895f) {
            A.f5879a.z(this.f5890a, 0);
        }
    }

    @Override // G3.r
    public final void b() {
    }

    @Override // G3.r
    public final void c(s sVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
