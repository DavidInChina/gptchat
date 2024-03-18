package s0;

import com.google.android.gms.internal.play_billing.N;

/* renamed from: s0.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5518t extends AbstractC5502d {
    public static float g(float f6) {
        return N.o(f6, -2.0f, 2.0f);
    }

    @Override // s0.AbstractC5502d
    public final float a(int i10) {
        return 2.0f;
    }

    @Override // s0.AbstractC5502d
    public final float b(int i10) {
        return -2.0f;
    }

    @Override // s0.AbstractC5502d
    public final long d(float f6, float f10, float f11) {
        float g10 = g(f6);
        float g11 = g(f10);
        return (Float.floatToRawIntBits(g11) & 4294967295L) | (Float.floatToRawIntBits(g10) << 32);
    }

    @Override // s0.AbstractC5502d
    public final float e(float f6, float f10, float f11) {
        return g(f11);
    }

    @Override // s0.AbstractC5502d
    public final long f(float f6, float f10, float f11, float f12, AbstractC5502d abstractC5502d) {
        return androidx.compose.ui.graphics.a.a(g(f6), g(f10), g(f11), f12, abstractC5502d);
    }
}
