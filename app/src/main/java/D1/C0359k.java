package D1;

import android.view.DisplayCutout;

/* renamed from: D1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359k {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f3274a;

    public C0359k(DisplayCutout displayCutout) {
        this.f3274a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0359k.class == obj.getClass()) {
            return C1.b.a(this.f3274a, ((C0359k) obj).f3274a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f3274a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3274a + "}";
    }
}
