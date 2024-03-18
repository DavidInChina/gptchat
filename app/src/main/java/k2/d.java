package k2;

import android.view.animation.Interpolator;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f36959a;

    /* renamed from: b  reason: collision with root package name */
    public final float f36960b;

    public d(float[] fArr) {
        this.f36959a = fArr;
        this.f36960b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f36959a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f10 = this.f36960b;
        float f11 = fArr[min];
        return AbstractC6463a.d(fArr[min + 1], f11, (f6 - (min * f10)) / f10, f11);
    }
}
