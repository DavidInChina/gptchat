package A;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: A.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021h0 extends EdgeEffect {

    /* renamed from: a  reason: collision with root package name */
    public final float f211a;

    /* renamed from: b  reason: collision with root package name */
    public float f212b;

    public C0021h0(Context context) {
        super(context);
        this.f211a = R4.b.j(context).f22785Y * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f212b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6) {
        this.f212b = 0.0f;
        super.onPull(f6);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f212b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f6, float f10) {
        this.f212b = 0.0f;
        super.onPull(f6, f10);
    }
}
