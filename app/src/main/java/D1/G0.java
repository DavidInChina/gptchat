package D1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import s1.C5523e;

/* loaded from: classes.dex */
public final class G0 extends F0 {

    /* renamed from: q  reason: collision with root package name */
    public static final J0 f3228q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f3228q = J0.g(null, windowInsets);
    }

    public G0(J0 j02, WindowInsets windowInsets) {
        super(j02, windowInsets);
    }

    @Override // D1.B0, D1.H0
    public C5523e f(int i10) {
        Insets insets;
        insets = this.f3213c.getInsets(I0.a(i10));
        return C5523e.c(insets);
    }

    @Override // D1.B0, D1.H0
    public C5523e g(int i10) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f3213c.getInsetsIgnoringVisibility(I0.a(i10));
        return C5523e.c(insetsIgnoringVisibility);
    }

    @Override // D1.B0, D1.H0
    public boolean p(int i10) {
        boolean isVisible;
        isVisible = this.f3213c.isVisible(I0.a(i10));
        return isVisible;
    }

    @Override // D1.B0, D1.H0
    public final void d(View view) {
    }
}
