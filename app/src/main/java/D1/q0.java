package D1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import java.util.WeakHashMap;
import s1.C5523e;

/* loaded from: classes.dex */
public final class q0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0366n0 f3293a;

    /* renamed from: b  reason: collision with root package name */
    public J0 f3294b;

    public q0(View view, AbstractC0366n0 abstractC0366n0) {
        J0 j02;
        A0 a02;
        this.f3293a = abstractC0366n0;
        WeakHashMap weakHashMap = Z.f3247a;
        J0 a5 = O.a(view);
        if (a5 != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                a02 = new z0(a5);
            } else if (i10 >= 29) {
                a02 = new y0(a5);
            } else {
                a02 = new x0(a5);
            }
            j02 = a02.b();
        } else {
            j02 = null;
        }
        this.f3294b = j02;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        H0 h02;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f3294b = J0.g(view, windowInsets);
            return r0.i(view, windowInsets);
        }
        J0 g10 = J0.g(view, windowInsets);
        if (this.f3294b == null) {
            WeakHashMap weakHashMap = Z.f3247a;
            this.f3294b = O.a(view);
        }
        if (this.f3294b == null) {
            this.f3294b = g10;
            return r0.i(view, windowInsets);
        }
        AbstractC0366n0 j6 = r0.j(view);
        if (j6 != null && Objects.equals(j6.f3275Y, windowInsets)) {
            return r0.i(view, windowInsets);
        }
        J0 j02 = this.f3294b;
        int i10 = 1;
        int i11 = 0;
        while (true) {
            h02 = g10.f3232a;
            if (i10 > 256) {
                break;
            }
            if (!h02.f(i10).equals(j02.f3232a.f(i10))) {
                i11 |= i10;
            }
            i10 <<= 1;
        }
        if (i11 == 0) {
            return r0.i(view, windowInsets);
        }
        J0 j03 = this.f3294b;
        if ((i11 & 8) != 0) {
            if (h02.f(8).f45109d > j03.f3232a.f(8).f45109d) {
                interpolator = r0.f3295e;
            } else {
                interpolator = r0.f3296f;
            }
        } else {
            interpolator = r0.f3297g;
        }
        v0 v0Var = new v0(i11, interpolator, 160L);
        v0Var.f3309a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f3309a.a());
        C5523e f6 = h02.f(i11);
        C5523e f10 = j03.f3232a.f(i11);
        int min = Math.min(f6.f45106a, f10.f45106a);
        int i12 = f6.f45107b;
        int i13 = f10.f45107b;
        int min2 = Math.min(i12, i13);
        int i14 = f6.f45108c;
        int i15 = f10.f45108c;
        int min3 = Math.min(i14, i15);
        int i16 = f6.f45109d;
        int i17 = i11;
        int i18 = f10.f45109d;
        U3.l lVar = new U3.l(C5523e.b(min, min2, min3, Math.min(i16, i18)), 3, C5523e.b(Math.max(f6.f45106a, f10.f45106a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
        r0.f(view, v0Var, windowInsets, false);
        duration.addUpdateListener(new C0368o0(v0Var, g10, j03, i17, view));
        duration.addListener(new C0354h0(this, v0Var, view, 1));
        ViewTreeObserver$OnPreDrawListenerC0377x.a(view, new RunnableC0370p0(this, view, v0Var, lVar, duration, 0));
        this.f3294b = g10;
        return r0.i(view, windowInsets);
    }
}
