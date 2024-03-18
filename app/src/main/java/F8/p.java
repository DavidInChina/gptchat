package f8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class p extends r {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f29741h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f29742b;

    /* renamed from: c  reason: collision with root package name */
    public final float f29743c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29744d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29745e;

    /* renamed from: f  reason: collision with root package name */
    public float f29746f;

    /* renamed from: g  reason: collision with root package name */
    public float f29747g;

    public p(float f6, float f10, float f11, float f12) {
        this.f29742b = f6;
        this.f29743c = f10;
        this.f29744d = f11;
        this.f29745e = f12;
    }

    @Override // f8.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f29750a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f29741h;
        rectF.set(this.f29742b, this.f29743c, this.f29744d, this.f29745e);
        path.arcTo(rectF, this.f29746f, this.f29747g, false);
        path.transform(matrix);
    }
}
