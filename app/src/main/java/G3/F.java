package G3;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class F extends E {
    @Override // G3.B
    public final float B(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // G3.B
    public final void C(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // G3.C
    public final void D(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // G3.C
    public final void E(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // G3.D
    public final void F(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // G3.E, B2.u
    public final void z(View view, int i10) {
        view.setTransitionVisibility(i10);
    }
}
