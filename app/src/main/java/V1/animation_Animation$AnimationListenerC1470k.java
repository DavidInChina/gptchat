package V1;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import id.AbstractC3557B;

/* renamed from: V1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.Animation$AnimationListenerC1470k implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e0 f18212a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1471l f18213b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f18214c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1467h f18215d;

    public animation.Animation$AnimationListenerC1470k(View view, C1467h c1467h, C1471l c1471l, e0 e0Var) {
        this.f18212a = e0Var;
        this.f18213b = c1471l;
        this.f18214c = view;
        this.f18215d = c1467h;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC3557B.c0("animation", animation);
        C1471l c1471l = this.f18213b;
        c1471l.f18216a.post(new Q1.n(c1471l, this.f18214c, this.f18215d, 3));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18212a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC3557B.c0("animation", animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC3557B.c0("animation", animation);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f18212a + " has reached onAnimationStart.");
        }
    }
}
