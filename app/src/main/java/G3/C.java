package G3;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class C extends B {

    /* renamed from: i0  reason: collision with root package name */
    public static boolean f5882i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public static boolean f5883j0 = true;

    public void D(View view, Matrix matrix) {
        if (f5882i0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5882i0 = false;
            }
        }
    }

    public void E(View view, Matrix matrix) {
        if (f5883j0) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5883j0 = false;
            }
        }
    }
}
