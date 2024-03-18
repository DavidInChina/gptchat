package G3;

import android.view.View;

/* loaded from: classes.dex */
public abstract class B extends B2.u {

    /* renamed from: h0  reason: collision with root package name */
    public static boolean f5881h0 = true;

    public float B(View view) {
        float transitionAlpha;
        if (f5881h0) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f5881h0 = false;
            }
        }
        return view.getAlpha();
    }

    public void C(View view, float f6) {
        if (f5881h0) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f5881h0 = false;
            }
        }
        view.setAlpha(f6);
    }
}
