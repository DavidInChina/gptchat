package s0;

import com.google.android.gms.internal.play_billing.N;

/* renamed from: s0.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5510l extends AbstractC5502d {

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f45062d;

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f45063e;

    /* renamed from: f  reason: collision with root package name */
    public static final float[] f45064f;

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f45065g;

    static {
        float[] y10 = kotlin.jvm.internal.m.y(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, kotlin.jvm.internal.m.r(AbstractC5500b.f45016b.f45017a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f45062d = y10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f45063e = fArr;
        f45064f = kotlin.jvm.internal.m.x(y10);
        f45065g = kotlin.jvm.internal.m.x(fArr);
    }

    @Override // s0.AbstractC5502d
    public final float a(int i10) {
        if (i10 == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // s0.AbstractC5502d
    public final float b(int i10) {
        if (i10 == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // s0.AbstractC5502d
    public final long d(float f6, float f10, float f11) {
        float o10 = N.o(f6, 0.0f, 1.0f);
        float o11 = N.o(f10, -0.5f, 0.5f);
        float o12 = N.o(f11, -0.5f, 0.5f);
        float[] fArr = f45065g;
        float B10 = kotlin.jvm.internal.m.B(fArr, o10, o11, o12);
        float C10 = kotlin.jvm.internal.m.C(fArr, o10, o11, o12);
        float D6 = kotlin.jvm.internal.m.D(fArr, o10, o11, o12);
        float f12 = B10 * B10 * B10;
        float f13 = C10 * C10 * C10;
        float f14 = D6 * D6 * D6;
        float[] fArr2 = f45064f;
        return (Float.floatToRawIntBits(kotlin.jvm.internal.m.B(fArr2, f12, f13, f14)) << 32) | (Float.floatToRawIntBits(kotlin.jvm.internal.m.C(fArr2, f12, f13, f14)) & 4294967295L);
    }

    @Override // s0.AbstractC5502d
    public final float e(float f6, float f10, float f11) {
        float o10 = N.o(f6, 0.0f, 1.0f);
        float o11 = N.o(f10, -0.5f, 0.5f);
        float o12 = N.o(f11, -0.5f, 0.5f);
        float[] fArr = f45065g;
        float B10 = kotlin.jvm.internal.m.B(fArr, o10, o11, o12);
        float C10 = kotlin.jvm.internal.m.C(fArr, o10, o11, o12);
        float D6 = kotlin.jvm.internal.m.D(fArr, o10, o11, o12);
        float f12 = D6 * D6 * D6;
        return kotlin.jvm.internal.m.D(f45064f, B10 * B10 * B10, C10 * C10 * C10, f12);
    }

    @Override // s0.AbstractC5502d
    public final long f(float f6, float f10, float f11, float f12, AbstractC5502d abstractC5502d) {
        float[] fArr = f45062d;
        float B10 = kotlin.jvm.internal.m.B(fArr, f6, f10, f11);
        float C10 = kotlin.jvm.internal.m.C(fArr, f6, f10, f11);
        float D6 = kotlin.jvm.internal.m.D(fArr, f6, f10, f11);
        double d10 = 0.33333334f;
        float signum = Math.signum(B10) * ((float) Math.pow(Math.abs(B10), d10));
        float signum2 = Math.signum(C10) * ((float) Math.pow(Math.abs(C10), d10));
        float signum3 = Math.signum(D6) * ((float) Math.pow(Math.abs(D6), d10));
        float[] fArr2 = f45063e;
        return androidx.compose.ui.graphics.a.a(kotlin.jvm.internal.m.B(fArr2, signum, signum2, signum3), kotlin.jvm.internal.m.C(fArr2, signum, signum2, signum3), kotlin.jvm.internal.m.D(fArr2, signum, signum2, signum3), f12, abstractC5502d);
    }
}
