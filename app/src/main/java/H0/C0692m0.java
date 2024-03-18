package H0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import r0.C5335B;

/* renamed from: H0.m0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0692m0 implements AbstractC0690l0 {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f6975a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f6976b = new int[2];

    public C0692m0(float[] fArr) {
        this.f6975a = fArr;
    }

    @Override // H0.AbstractC0690l0
    public final void a(View view, float[] fArr) {
        C5335B.d(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f6975a;
        if (z10) {
            b((View) parent, fArr);
            C5335B.d(fArr2);
            C5335B.f(fArr2, -view.getScrollX(), -view.getScrollY());
            Q.v(fArr, fArr2);
            C5335B.d(fArr2);
            C5335B.f(fArr2, view.getLeft(), view.getTop());
            Q.v(fArr, fArr2);
        } else {
            int[] iArr = this.f6976b;
            view.getLocationInWindow(iArr);
            C5335B.d(fArr2);
            C5335B.f(fArr2, -view.getScrollX(), -view.getScrollY());
            Q.v(fArr, fArr2);
            C5335B.d(fArr2);
            C5335B.f(fArr2, iArr[0], iArr[1]);
            Q.v(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            androidx.compose.ui.graphics.a.q(matrix, fArr2);
            Q.v(fArr, fArr2);
        }
    }
}
