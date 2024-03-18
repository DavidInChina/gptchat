package r1;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: k  reason: collision with root package name */
    public static final q f44309k;

    /* renamed from: a  reason: collision with root package name */
    public final float f44310a;

    /* renamed from: b  reason: collision with root package name */
    public final float f44311b;

    /* renamed from: c  reason: collision with root package name */
    public final float f44312c;

    /* renamed from: d  reason: collision with root package name */
    public final float f44313d;

    /* renamed from: e  reason: collision with root package name */
    public final float f44314e;

    /* renamed from: f  reason: collision with root package name */
    public final float f44315f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f44316g;

    /* renamed from: h  reason: collision with root package name */
    public final float f44317h;

    /* renamed from: i  reason: collision with root package name */
    public final float f44318i;

    /* renamed from: j  reason: collision with root package name */
    public final float f44319j;

    static {
        float f6;
        float[] fArr = AbstractC5355b.f44281c;
        float g10 = (float) ((AbstractC5355b.g() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC5355b.f44279a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + (fArr3[0] * f10);
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f6 = 0.69f;
        } else {
            f6 = 0.655f;
        }
        float f17 = f6;
        float exp = (1.0f - (((float) Math.exp(((-g10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * g10) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(g10 * 5.0d))) + (f19 * g10);
        float g11 = AbstractC5355b.g() / fArr[1];
        double d11 = g11;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f44309k = new q(g11, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f17, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public q(float f6, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f44315f = f6;
        this.f44310a = f10;
        this.f44311b = f11;
        this.f44312c = f12;
        this.f44313d = f13;
        this.f44314e = f14;
        this.f44316g = fArr;
        this.f44317h = f15;
        this.f44318i = f16;
        this.f44319j = f17;
    }
}
