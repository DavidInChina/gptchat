package w3;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: w3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC6104k implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47914Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f47915Z;

    public /* synthetic */ RunnableC6104k(int i10, Object obj) {
        this.f47914Y = i10;
        this.f47915Z = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f47914Y;
        Object obj = this.f47915Z;
        switch (i10) {
            case 0:
                C6108o c6108o = (C6108o) obj;
                int i11 = c6108o.f47923A;
                ValueAnimator valueAnimator = c6108o.f47950z;
                if (i11 != 1) {
                    if (i11 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                c6108o.f47923A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).z0();
                return;
        }
    }
}
