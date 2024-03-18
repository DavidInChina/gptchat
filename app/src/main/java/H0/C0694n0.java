package H0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: H0.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0694n0 implements AbstractC0690l0 {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f6979a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f6980b = new int[2];

    @Override // H0.AbstractC0690l0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f6979a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        int[] iArr = this.f6980b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        androidx.compose.ui.graphics.a.q(matrix, fArr);
    }
}
