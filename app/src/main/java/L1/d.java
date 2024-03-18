package L1;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10494a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        switch (this.f10494a) {
            case 0:
                float f10 = f6 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            default:
                float f11 = f6 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
