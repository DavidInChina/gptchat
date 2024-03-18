package y4;

import android.graphics.PointF;

/* loaded from: classes2.dex */
public final class j extends k {
    @Override // y4.e
    public final Object e(J4.a aVar, float f6) {
        return Integer.valueOf(h(aVar, f6));
    }

    public final int h(J4.a aVar, float f6) {
        Object obj = aVar.f8839b;
        if (obj != null && aVar.f8840c != null) {
            if (aVar.f8848k == 784923401) {
                aVar.f8848k = ((Integer) obj).intValue();
            }
            int i10 = aVar.f8848k;
            if (aVar.f8849l == 784923401) {
                aVar.f8849l = ((Integer) aVar.f8840c).intValue();
            }
            int i11 = aVar.f8849l;
            PointF pointF = I4.f.f8054a;
            return (int) ((f6 * (i11 - i10)) + i10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
