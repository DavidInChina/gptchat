package G3;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class E extends D {

    /* renamed from: l0  reason: collision with root package name */
    public static boolean f5885l0 = true;

    @Override // B2.u
    public void z(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.z(view, i10);
        } else if (f5885l0) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f5885l0 = false;
            }
        }
    }
}
