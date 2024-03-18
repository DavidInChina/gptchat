package w3;

import android.animation.ValueAnimator;

/* renamed from: w3.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6107n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6108o f47920a;

    public C6107n(C6108o c6108o) {
        this.f47920a = c6108o;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C6108o c6108o = this.f47920a;
        c6108o.f47927c.setAlpha(floatValue);
        c6108o.f47928d.setAlpha(floatValue);
        c6108o.f47943s.invalidate();
    }
}
