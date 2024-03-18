package D1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;
import s1.C5523e;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: b  reason: collision with root package name */
    public static final J0 f3231b;

    /* renamed from: a  reason: collision with root package name */
    public final H0 f3232a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3231b = G0.f3228q;
        } else {
            f3231b = H0.f3229b;
        }
    }

    public J0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f3232a = new G0(this, windowInsets);
        } else if (i10 >= 29) {
            this.f3232a = new F0(this, windowInsets);
        } else if (i10 >= 28) {
            this.f3232a = new D0(this, windowInsets);
        } else {
            this.f3232a = new C0(this, windowInsets);
        }
    }

    public static C5523e e(C5523e c5523e, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, c5523e.f45106a - i10);
        int max2 = Math.max(0, c5523e.f45107b - i11);
        int max3 = Math.max(0, c5523e.f45108c - i12);
        int max4 = Math.max(0, c5523e.f45109d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return c5523e;
        }
        return C5523e.b(max, max2, max3, max4);
    }

    public static J0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        J0 j02 = new J0(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = Z.f3247a;
            if (K.b(view)) {
                J0 a5 = O.a(view);
                H0 h02 = j02.f3232a;
                h02.r(a5);
                h02.d(view.getRootView());
            }
        }
        return j02;
    }

    public final int a() {
        return this.f3232a.k().f45109d;
    }

    public final int b() {
        return this.f3232a.k().f45106a;
    }

    public final int c() {
        return this.f3232a.k().f45108c;
    }

    public final int d() {
        return this.f3232a.k().f45107b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        return C1.b.a(this.f3232a, ((J0) obj).f3232a);
    }

    public final WindowInsets f() {
        H0 h02 = this.f3232a;
        if (h02 instanceof B0) {
            return ((B0) h02).f3213c;
        }
        return null;
    }

    public final int hashCode() {
        H0 h02 = this.f3232a;
        if (h02 == null) {
            return 0;
        }
        return h02.hashCode();
    }

    public J0() {
        this.f3232a = new H0(this);
    }
}
