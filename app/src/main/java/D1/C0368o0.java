package D1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import s1.C5523e;

/* renamed from: D1.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368o0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0 f3277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J0 f3278b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ J0 f3279c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3280d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f3281e;

    public C0368o0(v0 v0Var, J0 j02, J0 j03, int i10, View view) {
        this.f3277a = v0Var;
        this.f3278b = j02;
        this.f3279c = j03;
        this.f3280d = i10;
        this.f3281e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        A0 a02;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        v0 v0Var = this.f3277a;
        v0Var.f3309a.d(animatedFraction);
        float b10 = v0Var.f3309a.b();
        PathInterpolator pathInterpolator = r0.f3295e;
        int i10 = Build.VERSION.SDK_INT;
        J0 j02 = this.f3278b;
        if (i10 >= 30) {
            a02 = new z0(j02);
        } else if (i10 >= 29) {
            a02 = new y0(j02);
        } else {
            a02 = new x0(j02);
        }
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((this.f3280d & i11) == 0) {
                a02.c(i11, j02.f3232a.f(i11));
            } else {
                C5523e f6 = j02.f3232a.f(i11);
                C5523e f10 = this.f3279c.f3232a.f(i11);
                float f11 = 1.0f - b10;
                a02.c(i11, J0.e(f6, (int) (((f6.f45106a - f10.f45106a) * f11) + 0.5d), (int) (((f6.f45107b - f10.f45107b) * f11) + 0.5d), (int) (((f6.f45108c - f10.f45108c) * f11) + 0.5d), (int) (((f6.f45109d - f10.f45109d) * f11) + 0.5d)));
            }
        }
        r0.g(this.f3281e, a02.b(), Collections.singletonList(v0Var));
    }
}
