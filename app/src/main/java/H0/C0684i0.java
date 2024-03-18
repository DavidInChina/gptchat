package H0;

import android.view.ViewConfiguration;
import nf.AbstractC4828h;

/* renamed from: H0.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0684i0 implements Y0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewConfiguration f6961a;

    public C0684i0(ViewConfiguration viewConfiguration) {
        this.f6961a = viewConfiguration;
    }

    @Override // H0.Y0
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // H0.Y0
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // H0.Y0
    public final long c() {
        float f6 = 48;
        return AbstractC4828h.g(f6, f6);
    }

    @Override // H0.Y0
    public final float d() {
        return this.f6961a.getScaledMaximumFlingVelocity();
    }

    @Override // H0.Y0
    public final float e() {
        return this.f6961a.getScaledTouchSlop();
    }
}
