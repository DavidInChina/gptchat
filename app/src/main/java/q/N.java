package q;

import android.view.View;

/* loaded from: classes.dex */
public abstract class N {
    public static int a(View view) {
        return view.getTextAlignment();
    }

    public static int b(View view) {
        return view.getTextDirection();
    }

    public static void c(View view, int i10) {
        view.setTextAlignment(i10);
    }

    public static void d(View view, int i10) {
        view.setTextDirection(i10);
    }
}
