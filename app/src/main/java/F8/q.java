package f8;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class q extends r {

    /* renamed from: b  reason: collision with root package name */
    public float f29748b;

    /* renamed from: c  reason: collision with root package name */
    public float f29749c;

    @Override // f8.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29750a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f29748b, this.f29749c);
        path.transform(matrix);
    }
}
