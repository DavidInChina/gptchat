package D1;

import android.view.WindowInsetsAnimation;
import s1.C5523e;

/* loaded from: classes.dex */
public final class t0 extends u0 {

    /* renamed from: e  reason: collision with root package name */
    public final WindowInsetsAnimation f3304e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f3304e = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds e(U3.l lVar) {
        return new WindowInsetsAnimation.Bounds(((C5523e) lVar.f17423Z).d(), ((C5523e) lVar.f17424h0).d());
    }

    @Override // D1.u0
    public final long a() {
        long durationMillis;
        durationMillis = this.f3304e.getDurationMillis();
        return durationMillis;
    }

    @Override // D1.u0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f3304e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // D1.u0
    public final int c() {
        int typeMask;
        typeMask = this.f3304e.getTypeMask();
        return typeMask;
    }

    @Override // D1.u0
    public final void d(float f6) {
        this.f3304e.setFraction(f6);
    }
}
