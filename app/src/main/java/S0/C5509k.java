package s0;

import com.google.android.gms.internal.play_billing.N;

/* renamed from: s0.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5509k extends AbstractC5502d {
    @Override // s0.AbstractC5502d
    public final float a(int i10) {
        if (i10 == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    @Override // s0.AbstractC5502d
    public final float b(int i10) {
        if (i10 == 0) {
            return 0.0f;
        }
        return -128.0f;
    }

    @Override // s0.AbstractC5502d
    public final long d(float f6, float f10, float f11) {
        float f12;
        float f13;
        float o10 = (N.o(f6, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float o11 = (N.o(f10, -128.0f, 128.0f) * 0.002f) + o10;
        if (o11 > 0.20689656f) {
            f12 = o11 * o11 * o11;
        } else {
            f12 = (o11 - 0.13793103f) * 0.12841855f;
        }
        if (o10 > 0.20689656f) {
            f13 = o10 * o10 * o10;
        } else {
            f13 = (o10 - 0.13793103f) * 0.12841855f;
        }
        float[] fArr = AbstractC5508j.f45061e;
        float f14 = f13 * fArr[1];
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f12 * fArr[0]) << 32);
    }

    @Override // s0.AbstractC5502d
    public final float e(float f6, float f10, float f11) {
        float f12;
        float o10 = ((N.o(f6, 0.0f, 100.0f) + 16.0f) / 116.0f) - (N.o(f11, -128.0f, 128.0f) * 0.005f);
        if (o10 > 0.20689656f) {
            f12 = o10 * o10 * o10;
        } else {
            f12 = 0.12841855f * (o10 - 0.13793103f);
        }
        return f12 * AbstractC5508j.f45061e[2];
    }

    @Override // s0.AbstractC5502d
    public final long f(float f6, float f10, float f11, float f12, AbstractC5502d abstractC5502d) {
        float f13;
        float f14;
        float f15;
        float[] fArr = AbstractC5508j.f45061e;
        float f16 = f6 / fArr[0];
        float f17 = f10 / fArr[1];
        float f18 = f11 / fArr[2];
        if (f16 > 0.008856452f) {
            f13 = (float) Math.pow(f16, 0.33333334f);
        } else {
            f13 = (f16 * 7.787037f) + 0.13793103f;
        }
        if (f17 > 0.008856452f) {
            f14 = (float) Math.pow(f17, 0.33333334f);
        } else {
            f14 = (f17 * 7.787037f) + 0.13793103f;
        }
        if (f18 > 0.008856452f) {
            f15 = (float) Math.pow(f18, 0.33333334f);
        } else {
            f15 = (f18 * 7.787037f) + 0.13793103f;
        }
        return androidx.compose.ui.graphics.a.a(N.o((116.0f * f14) - 16.0f, 0.0f, 100.0f), N.o((f13 - f14) * 500.0f, -128.0f, 128.0f), N.o((f14 - f15) * 200.0f, -128.0f, 128.0f), f12, abstractC5502d);
    }
}
