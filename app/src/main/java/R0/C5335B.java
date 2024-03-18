package r0;

import id.AbstractC3557B;
import java.util.Arrays;
import q0.C5250b;
import q0.C5251c;

/* renamed from: r0.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5335B {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f44167a;

    public /* synthetic */ C5335B(float[] fArr) {
        this.f44167a = fArr;
    }

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j6, float[] fArr) {
        float d10 = C5251c.d(j6);
        float e10 = C5251c.e(j6);
        float f6 = 1 / (((fArr[7] * e10) + (fArr[3] * d10)) + fArr[15]);
        if (Float.isInfinite(f6) || Float.isNaN(f6)) {
            f6 = 0.0f;
        }
        return R4.b.r(((fArr[4] * e10) + (fArr[0] * d10) + fArr[12]) * f6, ((fArr[5] * e10) + (fArr[1] * d10) + fArr[13]) * f6);
    }

    public static final void c(float[] fArr, C5250b c5250b) {
        long b10 = b(R4.b.r(c5250b.f43615a, c5250b.f43616b), fArr);
        long b11 = b(R4.b.r(c5250b.f43615a, c5250b.f43618d), fArr);
        long b12 = b(R4.b.r(c5250b.f43617c, c5250b.f43616b), fArr);
        long b13 = b(R4.b.r(c5250b.f43617c, c5250b.f43618d), fArr);
        c5250b.f43615a = Math.min(Math.min(C5251c.d(b10), C5251c.d(b11)), Math.min(C5251c.d(b12), C5251c.d(b13)));
        c5250b.f43616b = Math.min(Math.min(C5251c.e(b10), C5251c.e(b11)), Math.min(C5251c.e(b12), C5251c.e(b13)));
        c5250b.f43617c = Math.max(Math.max(C5251c.d(b10), C5251c.d(b11)), Math.max(C5251c.d(b12), C5251c.d(b13)));
        c5250b.f43618d = Math.max(Math.max(C5251c.e(b10), C5251c.e(b11)), Math.max(C5251c.e(b12), C5251c.e(b13)));
    }

    public static final void d(float[] fArr) {
        float f6;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                fArr[(i11 * 4) + i10] = f6;
            }
        }
    }

    public static final void e(float[] fArr, float[] fArr2) {
        float i10 = androidx.compose.ui.graphics.a.i(fArr, 0, fArr2, 0);
        float i11 = androidx.compose.ui.graphics.a.i(fArr, 0, fArr2, 1);
        float i12 = androidx.compose.ui.graphics.a.i(fArr, 0, fArr2, 2);
        float i13 = androidx.compose.ui.graphics.a.i(fArr, 0, fArr2, 3);
        float i14 = androidx.compose.ui.graphics.a.i(fArr, 1, fArr2, 0);
        float i15 = androidx.compose.ui.graphics.a.i(fArr, 1, fArr2, 1);
        float i16 = androidx.compose.ui.graphics.a.i(fArr, 1, fArr2, 2);
        float i17 = androidx.compose.ui.graphics.a.i(fArr, 1, fArr2, 3);
        float i18 = androidx.compose.ui.graphics.a.i(fArr, 2, fArr2, 0);
        float i19 = androidx.compose.ui.graphics.a.i(fArr, 2, fArr2, 1);
        float i20 = androidx.compose.ui.graphics.a.i(fArr, 2, fArr2, 2);
        float i21 = androidx.compose.ui.graphics.a.i(fArr, 2, fArr2, 3);
        float i22 = androidx.compose.ui.graphics.a.i(fArr, 3, fArr2, 0);
        float i23 = androidx.compose.ui.graphics.a.i(fArr, 3, fArr2, 1);
        float i24 = androidx.compose.ui.graphics.a.i(fArr, 3, fArr2, 2);
        float i25 = androidx.compose.ui.graphics.a.i(fArr, 3, fArr2, 3);
        fArr[0] = i10;
        fArr[1] = i11;
        fArr[2] = i12;
        fArr[3] = i13;
        fArr[4] = i14;
        fArr[5] = i15;
        fArr[6] = i16;
        fArr[7] = i17;
        fArr[8] = i18;
        fArr[9] = i19;
        fArr[10] = i20;
        fArr[11] = i21;
        fArr[12] = i22;
        fArr[13] = i23;
        fArr[14] = i24;
        fArr[15] = i25;
    }

    public static void f(float[] fArr, float f6, float f10) {
        float f11 = (fArr[8] * 0.0f) + (fArr[4] * f10) + (fArr[0] * f6) + fArr[12];
        float f12 = (fArr[9] * 0.0f) + (fArr[5] * f10) + (fArr[1] * f6) + fArr[13];
        float f13 = (fArr[10] * 0.0f) + (fArr[6] * f10) + (fArr[2] * f6) + fArr[14];
        float f14 = fArr[3] * f6;
        float f15 = fArr[11] * 0.0f;
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f15 + (fArr[7] * f10) + f14 + fArr[15];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5335B)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f44167a, ((C5335B) obj).f44167a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44167a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f44167a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return Bi.c.M1(sb2.toString());
    }
}
