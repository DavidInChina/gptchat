package D1;

import android.graphics.Insets;
import android.view.WindowInsets;
import s1.C5523e;

/* loaded from: classes.dex */
public class F0 extends D0 {

    /* renamed from: n  reason: collision with root package name */
    public C5523e f3225n = null;

    /* renamed from: o  reason: collision with root package name */
    public C5523e f3226o = null;

    /* renamed from: p  reason: collision with root package name */
    public C5523e f3227p = null;

    public F0(J0 j02, WindowInsets windowInsets) {
        super(j02, windowInsets);
    }

    @Override // D1.H0
    public C5523e h() {
        Insets mandatorySystemGestureInsets;
        if (this.f3226o == null) {
            mandatorySystemGestureInsets = this.f3213c.getMandatorySystemGestureInsets();
            this.f3226o = C5523e.c(mandatorySystemGestureInsets);
        }
        return this.f3226o;
    }

    @Override // D1.H0
    public C5523e j() {
        Insets systemGestureInsets;
        if (this.f3225n == null) {
            systemGestureInsets = this.f3213c.getSystemGestureInsets();
            this.f3225n = C5523e.c(systemGestureInsets);
        }
        return this.f3225n;
    }

    @Override // D1.H0
    public C5523e l() {
        Insets tappableElementInsets;
        if (this.f3227p == null) {
            tappableElementInsets = this.f3213c.getTappableElementInsets();
            this.f3227p = C5523e.c(tappableElementInsets);
        }
        return this.f3227p;
    }

    @Override // D1.B0, D1.H0
    public J0 m(int i10, int i11, int i12, int i13) {
        WindowInsets inset;
        inset = this.f3213c.inset(i10, i11, i12, i13);
        return J0.g(null, inset);
    }

    @Override // D1.C0, D1.H0
    public void s(C5523e c5523e) {
    }
}
