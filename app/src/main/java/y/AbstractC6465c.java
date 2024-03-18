package y;

/* renamed from: y.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6465c {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f50183a;

    static {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float[] fArr = new float[101];
        f50183a = fArr;
        float[] fArr2 = new float[101];
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f19 = i10 / 100;
            float f20 = 1.0f;
            while (true) {
                f6 = ((f20 - f17) / 2.0f) + f17;
                f10 = 1.0f - f6;
                f11 = f6 * 3.0f * f10;
                f12 = f6 * f6 * f6;
                float f21 = (((f6 * 0.35000002f) + (f10 * 0.175f)) * f11) + f12;
                if (Math.abs(f21 - f19) < 1.0E-5d) {
                    break;
                } else if (f21 > f19) {
                    f20 = f6;
                } else {
                    f17 = f6;
                }
            }
            float f22 = 0.5f;
            fArr[i10] = (((f10 * 0.5f) + f6) * f11) + f12;
            float f23 = 1.0f;
            while (true) {
                f13 = ((f23 - f18) / 2.0f) + f18;
                f14 = 1.0f - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f24 = (((f14 * f22) + f13) * f15) + f16;
                if (Math.abs(f24 - f19) >= 1.0E-5d) {
                    if (f24 > f19) {
                        f23 = f13;
                    } else {
                        f18 = f13;
                    }
                    f22 = 0.5f;
                }
            }
            fArr2[i10] = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
        }
        fArr2[100] = 1.0f;
        fArr[100] = 1.0f;
    }

    public static C6464b a(float f6) {
        float f10;
        float f11;
        float f12 = 100;
        int i10 = (int) (f12 * f6);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = f50183a;
            float f15 = fArr[i10];
            f11 = (fArr[i11] - f15) / (f14 - f13);
            f10 = AbstractC6463a.d(f6, f13, f11, f15);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        return new C6464b(f10, f11);
    }
}
