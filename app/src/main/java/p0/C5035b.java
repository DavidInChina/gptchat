package p0;

import java.util.List;
import r0.C5334A;

/* renamed from: p0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5035b {
    public static float a(float[] fArr) {
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f6 * f12))) - (f12 * f13)) - (f10 * f11)) - (f6 * f14)) * 0.5f;
        if (f15 < 0.0f) {
            return -f15;
        }
        return f15;
    }

    public static float b(float f6, float f10, float f11, float f12) {
        return (f6 * f12) - (f10 * f11);
    }

    public static C5334A c(List list) {
        return new C5334A(list, null, R4.b.r(0.0f, 0.0f), R4.b.r(0.0f, Float.POSITIVE_INFINITY), 0);
    }
}
