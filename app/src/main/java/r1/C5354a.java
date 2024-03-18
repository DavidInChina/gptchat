package r1;

import android.graphics.Color;
import s1.AbstractC5521c;

/* renamed from: r1.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5354a {

    /* renamed from: a  reason: collision with root package name */
    public final float f44273a;

    /* renamed from: b  reason: collision with root package name */
    public final float f44274b;

    /* renamed from: c  reason: collision with root package name */
    public final float f44275c;

    /* renamed from: d  reason: collision with root package name */
    public final float f44276d;

    /* renamed from: e  reason: collision with root package name */
    public final float f44277e;

    /* renamed from: f  reason: collision with root package name */
    public final float f44278f;

    public C5354a(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.f44273a = f6;
        this.f44274b = f10;
        this.f44275c = f11;
        this.f44276d = f12;
        this.f44277e = f13;
        this.f44278f = f14;
    }

    public static C5354a a(int i10) {
        float f6;
        float pow;
        q qVar = q.f44309k;
        float d10 = AbstractC5355b.d(Color.red(i10));
        float d11 = AbstractC5355b.d(Color.green(i10));
        float d12 = AbstractC5355b.d(Color.blue(i10));
        float[][] fArr = AbstractC5355b.f44282d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * d12) + (fArr2[1] * d11) + (fArr2[0] * d10);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * d12) + (fArr3[1] * d11) + (fArr3[0] * d10);
        float[] fArr4 = fArr[2];
        float f12 = (d12 * fArr4[2]) + (d11 * fArr4[1]) + (d10 * fArr4[0]);
        float[][] fArr5 = AbstractC5355b.f44279a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = fArr7[1] * f11;
        float f15 = fArr7[2] * f12;
        float[] fArr8 = fArr5[2];
        float f16 = f10 * fArr8[0];
        float f17 = f12 * fArr8[2];
        float[] fArr9 = qVar.f44316g;
        float f18 = fArr9[0] * f13;
        float f19 = fArr9[1] * (f15 + f14 + (fArr7[0] * f10));
        float f20 = fArr9[2] * (f17 + (f11 * fArr8[1]) + f16);
        float abs = Math.abs(f18);
        float f21 = qVar.f44317h;
        float pow2 = (float) Math.pow((abs * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d13 = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d13)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d13 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float f29 = f26 * qVar.f44311b;
        float f30 = qVar.f44310a;
        float f31 = qVar.f44313d;
        float pow5 = ((float) Math.pow(f29 / f30, qVar.f44319j * f31)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f32 = f30 + 4.0f;
        if (f27 < 20.14d) {
            f6 = 360.0f + f27;
        } else {
            f6 = f27;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, qVar.f44315f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f6 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * qVar.f44314e) * qVar.f44312c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f31) / f32);
        float f33 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((qVar.f44318i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d14 = f28;
        return new C5354a(f27, pow6, pow5, f33, log * ((float) Math.cos(d14)), log * ((float) Math.sin(d14)));
    }

    public static C5354a b(float f6, float f10, float f11) {
        q qVar;
        double d10;
        float f12 = q.f44309k.f44313d;
        Math.sqrt(f6 / 100.0d);
        Math.sqrt(((f10 / ((float) Math.sqrt(d10))) * qVar.f44313d) / (qVar.f44310a + 4.0f));
        float f13 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((qVar.f44318i * f10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f11) / 180.0f;
        return new C5354a(f11, f10, f6, f13, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(q qVar) {
        float f6;
        float[] fArr;
        float f10 = this.f44274b;
        int i10 = (f10 > 0.0d ? 1 : (f10 == 0.0d ? 0 : -1));
        float f11 = this.f44275c;
        if (i10 != 0) {
            double d10 = f11;
            if (d10 != 0.0d) {
                f6 = f10 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, qVar.f44315f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f44273a * 3.1415927f) / 180.0f;
                float pow2 = qVar.f44310a * ((float) Math.pow(f11 / 100.0d, (1.0d / qVar.f44313d) / qVar.f44319j));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * qVar.f44314e * qVar.f44312c;
                float f12 = pow2 / qVar.f44311b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17)));
                float signum = Math.signum(f17);
                float f20 = 100.0f / qVar.f44317h;
                float pow3 = signum * f20 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f18) * f20 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float[] fArr2 = qVar.f44316g;
                float f21 = pow3 / fArr2[0];
                float f22 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f19) * f20) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = AbstractC5355b.f44280b;
                float[] fArr4 = fArr3[0];
                float f23 = (fArr4[2] * signum3) + (fArr4[1] * f22) + (fArr4[0] * f21);
                float[] fArr5 = fArr3[1];
                float f24 = fArr5[1] * f22;
                float f25 = fArr5[2] * signum3;
                float f26 = f21 * fArr3[2][0];
                return AbstractC5521c.a(f23, f25 + f24 + (fArr5[0] * f21), (signum3 * fArr[2]) + (f22 * fArr[1]) + f26);
            }
        }
        f6 = 0.0f;
        float pow4 = (float) Math.pow(f6 / Math.pow(1.64d - Math.pow(0.29d, qVar.f44315f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f44273a * 3.1415927f) / 180.0f;
        float pow22 = qVar.f44310a * ((float) Math.pow(f11 / 100.0d, (1.0d / qVar.f44313d) / qVar.f44319j));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * qVar.f44314e * qVar.f44312c;
        float f122 = pow22 / qVar.f44311b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172)));
        float signum4 = Math.signum(f172);
        float f202 = 100.0f / qVar.f44317h;
        float pow32 = signum4 * f202 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f182) * f202 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float[] fArr22 = qVar.f44316g;
        float f212 = pow32 / fArr22[0];
        float f222 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f192) * f202) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = AbstractC5355b.f44280b;
        float[] fArr42 = fArr32[0];
        float f232 = (fArr42[2] * signum32) + (fArr42[1] * f222) + (fArr42[0] * f212);
        float[] fArr52 = fArr32[1];
        float f242 = fArr52[1] * f222;
        float f252 = fArr52[2] * signum32;
        float f262 = f212 * fArr32[2][0];
        return AbstractC5521c.a(f232, f252 + f242 + (fArr52[0] * f212), (signum32 * fArr[2]) + (f222 * fArr[1]) + f262);
    }
}
