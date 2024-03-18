package D1;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class O {
    public static J0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        J0 g10 = J0.g(null, rootWindowInsets);
        H0 h02 = g10.f3232a;
        h02.r(g10);
        h02.d(view.getRootView());
        return g10;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
