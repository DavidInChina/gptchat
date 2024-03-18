package D1;

import android.view.WindowInsets;
import s1.C5523e;

/* loaded from: classes2.dex */
public class y0 extends A0 {

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets.Builder f3324c;

    public y0() {
        this.f3324c = A1.a.g();
    }

    @Override // D1.A0
    public J0 b() {
        WindowInsets build;
        a();
        build = this.f3324c.build();
        J0 g10 = J0.g(null, build);
        g10.f3232a.q(this.f3205b);
        return g10;
    }

    @Override // D1.A0
    public void d(C5523e c5523e) {
        this.f3324c.setMandatorySystemGestureInsets(c5523e.d());
    }

    @Override // D1.A0
    public void e(C5523e c5523e) {
        this.f3324c.setStableInsets(c5523e.d());
    }

    @Override // D1.A0
    public void f(C5523e c5523e) {
        this.f3324c.setSystemGestureInsets(c5523e.d());
    }

    @Override // D1.A0
    public void g(C5523e c5523e) {
        this.f3324c.setSystemWindowInsets(c5523e.d());
    }

    @Override // D1.A0
    public void h(C5523e c5523e) {
        this.f3324c.setTappableElementInsets(c5523e.d());
    }

    public y0(J0 j02) {
        super(j02);
        WindowInsets.Builder builder;
        WindowInsets f6 = j02.f();
        if (f6 != null) {
            builder = A1.a.h(f6);
        } else {
            builder = A1.a.g();
        }
        this.f3324c = builder;
    }
}
