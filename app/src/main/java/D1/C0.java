package D1;

import android.view.WindowInsets;
import s1.C5523e;

/* loaded from: classes.dex */
public class C0 extends B0 {

    /* renamed from: m  reason: collision with root package name */
    public C5523e f3218m = null;

    public C0(J0 j02, WindowInsets windowInsets) {
        super(j02, windowInsets);
    }

    @Override // D1.H0
    public J0 b() {
        return J0.g(null, this.f3213c.consumeStableInsets());
    }

    @Override // D1.H0
    public J0 c() {
        return J0.g(null, this.f3213c.consumeSystemWindowInsets());
    }

    @Override // D1.H0
    public final C5523e i() {
        if (this.f3218m == null) {
            WindowInsets windowInsets = this.f3213c;
            this.f3218m = C5523e.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3218m;
    }

    @Override // D1.H0
    public boolean n() {
        return this.f3213c.isConsumed();
    }

    @Override // D1.H0
    public void s(C5523e c5523e) {
        this.f3218m = c5523e;
    }
}
