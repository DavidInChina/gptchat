package w3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: w3.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6106m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47917a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f47918b = false;

    /* renamed from: c  reason: collision with root package name */
    public final Object f47919c;

    public C6106m(View view) {
        this.f47919c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f47917a) {
            case 0:
                this.f47918b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f47917a;
        Object obj = this.f47919c;
        switch (i10) {
            case 0:
                if (this.f47918b) {
                    this.f47918b = false;
                    return;
                }
                C6108o c6108o = (C6108o) obj;
                if (((Float) c6108o.f47950z.getAnimatedValue()).floatValue() == 0.0f) {
                    c6108o.f47923A = 0;
                    c6108o.f(0);
                    return;
                }
                c6108o.f47923A = 2;
                c6108o.f47943s.invalidate();
                return;
            default:
                View view = (View) obj;
                G3.A.f5879a.C(view, 1.0f);
                if (this.f47918b) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f47917a) {
            case 1:
                View view = (View) this.f47919c;
                WeakHashMap weakHashMap = D1.Z.f3247a;
                if (D1.H.h(view) && view.getLayerType() == 0) {
                    this.f47918b = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C6106m(C6108o c6108o) {
        this.f47919c = c6108o;
    }
}
