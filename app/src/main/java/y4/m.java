package y4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes2.dex */
public final class m extends k {

    /* renamed from: h  reason: collision with root package name */
    public final PointF f50738h = new PointF();

    /* renamed from: i  reason: collision with root package name */
    public final float[] f50739i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final float[] f50740j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f50741k = new PathMeasure();

    /* renamed from: l  reason: collision with root package name */
    public l f50742l;

    public m(List list) {
        super(list);
    }

    @Override // y4.e
    public final Object e(J4.a aVar, float f6) {
        l lVar = (l) aVar;
        Path path = lVar.f50736q;
        if (path == null) {
            return (PointF) aVar.f8839b;
        }
        l lVar2 = this.f50742l;
        PathMeasure pathMeasure = this.f50741k;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.f50742l = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f6 * length;
        float[] fArr = this.f50739i;
        float[] fArr2 = this.f50740j;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        PointF pointF = this.f50738h;
        pointF.set(fArr[0], fArr[1]);
        if (f10 < 0.0f) {
            pointF.offset(fArr2[0] * f10, fArr2[1] * f10);
        } else if (f10 > length) {
            float f11 = f10 - length;
            pointF.offset(fArr2[0] * f11, fArr2[1] * f11);
        }
        return pointF;
    }
}
