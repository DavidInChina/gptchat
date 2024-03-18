package D1;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public u0 f3309a;

    public v0(int i10, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3309a = new t0(AbstractC0379z.h(i10, interpolator, j6));
        } else {
            this.f3309a = new u0(i10, interpolator, j6);
        }
    }
}
