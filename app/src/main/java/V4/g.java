package v4;

import android.animation.ValueAnimator;
import i8.C3494l;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f47180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f47181b;

    public /* synthetic */ g(int i10, Object obj) {
        this.f47180a = i10;
        this.f47181b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f47180a;
        Object obj = this.f47181b;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                int i11 = lVar.f47207Q0;
                if (i11 != 0 && i11 == 2) {
                    lVar.invalidateSelf();
                    return;
                }
                E4.c cVar = lVar.f47219q0;
                if (cVar != null) {
                    cVar.o(lVar.f47209Z.d());
                    return;
                }
                return;
            default:
                C3494l c3494l = (C3494l) obj;
                c3494l.getClass();
                c3494l.f32817d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
