package D1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: D1.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354h0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3270b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3271c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3272d;

    public /* synthetic */ C0354h0(Object obj, Object obj2, Object obj3, int i10) {
        this.f3269a = i10;
        this.f3272d = obj;
        this.f3271c = obj2;
        this.f3270b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f3269a) {
            case 0:
                ((AbstractC0360k0) this.f3271c).b((View) this.f3270b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f3269a;
        Object obj = this.f3271c;
        switch (i10) {
            case 0:
                ((AbstractC0360k0) obj).d();
                return;
            default:
                v0 v0Var = (v0) obj;
                v0Var.f3309a.d(1.0f);
                r0.e((View) this.f3270b, v0Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3269a) {
            case 0:
                ((AbstractC0360k0) this.f3271c).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
