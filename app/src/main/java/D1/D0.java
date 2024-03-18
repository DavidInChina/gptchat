package D1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* loaded from: classes.dex */
public class D0 extends C0 {
    public D0(J0 j02, WindowInsets windowInsets) {
        super(j02, windowInsets);
    }

    @Override // D1.H0
    public J0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f3213c.consumeDisplayCutout();
        return J0.g(null, consumeDisplayCutout);
    }

    @Override // D1.H0
    public C0359k e() {
        DisplayCutout displayCutout;
        displayCutout = this.f3213c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0359k(displayCutout);
    }

    @Override // D1.B0, D1.H0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        if (Objects.equals(this.f3213c, d02.f3213c) && Objects.equals(this.f3217g, d02.f3217g)) {
            return true;
        }
        return false;
    }

    @Override // D1.H0
    public int hashCode() {
        return this.f3213c.hashCode();
    }
}
