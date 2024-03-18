package D1;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a  reason: collision with root package name */
    public final P5.c f3241a;

    public P0(WindowInsetsController windowInsetsController) {
        this.f3241a = new O0(windowInsetsController, new F4.a(windowInsetsController));
    }

    public P0(Window window, View view) {
        WindowInsetsController insetsController;
        F4.a aVar = new F4.a(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            insetsController = window.getInsetsController();
            O0 o02 = new O0(insetsController, aVar);
            o02.f3240i0 = window;
            this.f3241a = o02;
        } else if (i10 >= 26) {
            this.f3241a = new K0(window, aVar);
        } else {
            this.f3241a = new K0(window, aVar);
        }
    }
}
