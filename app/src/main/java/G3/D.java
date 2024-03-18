package G3;

import android.view.View;

/* loaded from: classes.dex */
public abstract class D extends C {

    /* renamed from: k0  reason: collision with root package name */
    public static boolean f5884k0 = true;

    public void F(View view, int i10, int i11, int i12, int i13) {
        if (f5884k0) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f5884k0 = false;
            }
        }
    }
}
