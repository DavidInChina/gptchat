package C0;

import B0.C0187d;
import B0.u;
import Z.C1724m0;
import Z.o1;
import kf.v;
import nf.AbstractC4828h;
import q0.C5251c;
import r9.y;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final C1724m0 f2497a = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public static final void a(d dVar, u uVar) {
        boolean booleanValue = ((Boolean) f2497a.getValue()).booleanValue();
        v vVar = v.f37483Y;
        int i10 = 0;
        if (booleanValue) {
            if (y.W(uVar)) {
                dVar.c();
            }
            boolean Y7 = y.Y(uVar);
            long j6 = uVar.f1671b;
            if (!Y7) {
                ?? r02 = uVar.f1680k;
                if (r02 != 0) {
                    vVar = r02;
                }
                int size = vVar.size();
                while (i10 < size) {
                    C0187d c0187d = (C0187d) vVar.get(i10);
                    dVar.a(c0187d.f1628a, c0187d.f1630c);
                    i10++;
                }
                dVar.a(j6, uVar.f1681l);
            }
            if (y.Y(uVar) && j6 - dVar.f2496d > 40) {
                dVar.c();
            }
            dVar.f2496d = j6;
            return;
        }
        boolean W6 = y.W(uVar);
        long j10 = uVar.f1672c;
        if (W6) {
            dVar.f2495c = j10;
            dVar.c();
        }
        ?? r03 = uVar.f1680k;
        if (r03 != 0) {
            vVar = r03;
        }
        int size2 = vVar.size();
        long j11 = uVar.f1676g;
        while (i10 < size2) {
            C0187d c0187d2 = (C0187d) vVar.get(i10);
            long h10 = C5251c.h(dVar.f2495c, C5251c.g(c0187d2.f1629b, j11));
            dVar.f2495c = h10;
            dVar.a(c0187d2.f1628a, h10);
            i10++;
            j11 = c0187d2.f1629b;
        }
        long h11 = C5251c.h(dVar.f2495c, C5251c.g(j10, j11));
        dVar.f2495c = h11;
        dVar.a(uVar.f1671b, h11);
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f6 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f6 += fArr[i10] * fArr2[i10];
        }
        return f6;
    }

    public static final void c(float[] fArr, float[] fArr2, int i10, float[] fArr3) {
        float f6;
        if (i10 != 0) {
            int i11 = 2;
            if (2 >= i10) {
                i11 = i10 - 1;
            }
            int i12 = i11 + 1;
            float[][] fArr4 = new float[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                fArr4[i13] = new float[i10];
            }
            for (int i14 = 0; i14 < i10; i14++) {
                fArr4[0][i14] = 1.0f;
                for (int i15 = 1; i15 < i12; i15++) {
                    fArr4[i15][i14] = fArr4[i15 - 1][i14] * fArr[i14];
                }
            }
            float[][] fArr5 = new float[i12];
            for (int i16 = 0; i16 < i12; i16++) {
                fArr5[i16] = new float[i10];
            }
            float[][] fArr6 = new float[i12];
            for (int i17 = 0; i17 < i12; i17++) {
                fArr6[i17] = new float[i12];
            }
            for (int i18 = 0; i18 < i12; i18++) {
                float[] fArr7 = fArr5[i18];
                float[] fArr8 = fArr4[i18];
                for (int i19 = 0; i19 < i10; i19++) {
                    fArr7[i19] = fArr8[i19];
                }
                for (int i20 = 0; i20 < i18; i20++) {
                    float[] fArr9 = fArr5[i20];
                    float b10 = b(fArr7, fArr9);
                    for (int i21 = 0; i21 < i10; i21++) {
                        fArr7[i21] = fArr7[i21] - (fArr9[i21] * b10);
                    }
                }
                float sqrt = (float) Math.sqrt(b(fArr7, fArr7));
                if (sqrt >= 1.0E-6f) {
                    float f10 = 1.0f / sqrt;
                    for (int i22 = 0; i22 < i10; i22++) {
                        fArr7[i22] = fArr7[i22] * f10;
                    }
                    float[] fArr10 = fArr6[i18];
                    for (int i23 = 0; i23 < i12; i23++) {
                        if (i23 < i18) {
                            f6 = 0.0f;
                        } else {
                            f6 = b(fArr7, fArr4[i23]);
                        }
                        fArr10[i23] = f6;
                    }
                } else {
                    throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                }
            }
            for (int i24 = i11; -1 < i24; i24--) {
                fArr3[i24] = b(fArr5[i24], fArr2);
                int i25 = i24 + 1;
                if (i25 <= i11) {
                    int i26 = i11;
                    while (true) {
                        fArr3[i24] = fArr3[i24] - (fArr6[i24][i26] * fArr3[i26]);
                        if (i26 != i25) {
                            i26--;
                        }
                    }
                }
                fArr3[i24] = fArr3[i24] / fArr6[i24][i24];
            }
            return;
        }
        throw new IllegalArgumentException("At least one point must be provided");
    }
}
