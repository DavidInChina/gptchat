package i8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: i8.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3485c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32756a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3486d f32757b;

    public /* synthetic */ C3485c(C3486d c3486d, int i10) {
        this.f32756a = i10;
        this.f32757b = c3486d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32756a) {
            case 1:
                this.f32757b.f32815b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f32756a) {
            case 0:
                this.f32757b.f32815b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
