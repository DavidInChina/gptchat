package D1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3305a;

    /* renamed from: b  reason: collision with root package name */
    public float f3306b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f3307c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3308d;

    public u0(int i10, Interpolator interpolator, long j6) {
        this.f3305a = i10;
        this.f3307c = interpolator;
        this.f3308d = j6;
    }

    public long a() {
        return this.f3308d;
    }

    public float b() {
        Interpolator interpolator = this.f3307c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f3306b);
        }
        return this.f3306b;
    }

    public int c() {
        return this.f3305a;
    }

    public void d(float f6) {
        this.f3306b = f6;
    }
}
