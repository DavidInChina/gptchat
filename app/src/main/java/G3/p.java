package G3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import w.C6059f;

/* loaded from: classes2.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5937a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5938b;

    public /* synthetic */ p(Object obj, C6059f c6059f) {
        this.f5938b = obj;
        this.f5937a = c6059f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((C6059f) this.f5937a).remove(animator);
        ((s) this.f5938b).f5959r0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((s) this.f5938b).f5959r0.add(animator);
    }
}
