package H0;

import android.graphics.Matrix;
import id.AbstractC3557B;
import r0.C5335B;

/* loaded from: classes2.dex */
public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public final wf.n f6727a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f6728b;

    /* renamed from: c  reason: collision with root package name */
    public Matrix f6729c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f6730d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f6731e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6732f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6733g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6734h = true;

    public F0(N n10) {
        this.f6727a = n10;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.f6731e;
        if (fArr == null) {
            fArr = C5335B.a();
            this.f6731e = fArr;
        }
        if (this.f6733g) {
            this.f6734h = Df.H.Z(b(obj), fArr);
            this.f6733g = false;
        }
        if (!this.f6734h) {
            return null;
        }
        return fArr;
    }

    public final float[] b(Object obj) {
        float[] fArr = this.f6730d;
        if (fArr == null) {
            fArr = C5335B.a();
            this.f6730d = fArr;
        }
        if (!this.f6732f) {
            return fArr;
        }
        Matrix matrix = this.f6728b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6728b = matrix;
        }
        this.f6727a.invoke(obj, matrix);
        Matrix matrix2 = this.f6729c;
        if (matrix2 == null || !AbstractC3557B.K(matrix, matrix2)) {
            androidx.compose.ui.graphics.a.q(matrix, fArr);
            this.f6728b = matrix2;
            this.f6729c = matrix;
        }
        this.f6732f = false;
        return fArr;
    }

    public final void c() {
        this.f6732f = true;
        this.f6733g = true;
    }
}
