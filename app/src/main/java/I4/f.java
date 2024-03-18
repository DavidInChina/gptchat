package I4;

import android.graphics.PointF;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final PointF f8054a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f6, float f10, float f11) {
        return Math.max(f10, Math.min(f11, f6));
    }

    public static int c(float f6, float f10) {
        boolean z10;
        int i10 = (int) f6;
        int i11 = (int) f10;
        int i12 = i10 / i11;
        if ((i10 ^ i11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static float d(float f6, float f10, float f11) {
        return AbstractC6463a.d(f10, f6, f11, f6);
    }
}
