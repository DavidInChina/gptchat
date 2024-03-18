package Ai;

import A.AbstractC0044t0;
import Ji.g;
import Ji.q;
import Ji.r;
import Ji.s;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import li.AbstractC4499c;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f991w = {4, 2, 3, 5};

    /* renamed from: a  reason: collision with root package name */
    public int f992a;

    /* renamed from: b  reason: collision with root package name */
    public long f993b;

    /* renamed from: c  reason: collision with root package name */
    public int f994c;

    /* renamed from: d  reason: collision with root package name */
    public long f995d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f996e;

    /* renamed from: f  reason: collision with root package name */
    public s f997f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f998g;

    /* renamed from: h  reason: collision with root package name */
    public Ji.d f999h;

    /* renamed from: i  reason: collision with root package name */
    public int f1000i;

    /* renamed from: j  reason: collision with root package name */
    public long f1001j;

    /* renamed from: k  reason: collision with root package name */
    public int f1002k;

    /* renamed from: l  reason: collision with root package name */
    public long f1003l;

    /* renamed from: m  reason: collision with root package name */
    public float[] f1004m;

    /* renamed from: n  reason: collision with root package name */
    public Ji.d f1005n;

    /* renamed from: o  reason: collision with root package name */
    public float[] f1006o;

    /* renamed from: p  reason: collision with root package name */
    public Ji.d f1007p;

    /* renamed from: q  reason: collision with root package name */
    public float[] f1008q;

    /* renamed from: r  reason: collision with root package name */
    public Ji.d f1009r;

    /* renamed from: s  reason: collision with root package name */
    public float[] f1010s;

    /* renamed from: t  reason: collision with root package name */
    public Ji.d f1011t;

    /* renamed from: u  reason: collision with root package name */
    public int f1012u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1013v;

    public final void a(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        int i15 = i11 * i10;
        int i16 = i10 * 2;
        for (int i17 = 0; i17 < i11; i17++) {
            int i18 = (i17 * i16) + i13;
            int i19 = (i17 * i10) + i12;
            int i20 = i19 + i15;
            float f6 = fArr[i19];
            float f10 = fArr[i20];
            fArr2[i18] = f6 + f10;
            fArr2[(i18 + i16) - 1] = f6 - f10;
        }
        int i21 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i22 = 0;
            while (i22 < i11) {
                i16 = i22 * i10;
                int i23 = i16 * 2;
                int i24 = i23 + i10;
                int i25 = i16 + i15;
                for (int i26 = i21; i26 < i10; i26 += 2) {
                    int i27 = (i26 - 1) + i14;
                    int i28 = i13 + i26 + i23;
                    int i29 = i13 + (i10 - i26) + i24;
                    int i30 = i12 + i26;
                    int i31 = i30 + i16;
                    int i32 = i30 + i25;
                    float f11 = fArr[i31 - 1];
                    float f12 = fArr[i31];
                    float f13 = fArr[i32 - 1];
                    float f14 = fArr[i32];
                    float[] fArr3 = this.f1006o;
                    float f15 = fArr3[i27 - 1];
                    float f16 = fArr3[i27];
                    float f17 = (f16 * f14) + (f15 * f13);
                    float f18 = (f15 * f14) - (f16 * f13);
                    fArr2[i28] = f12 + f18;
                    fArr2[i28 - 1] = f11 + f17;
                    fArr2[i29] = f18 - f12;
                    fArr2[i29 - 1] = f11 - f17;
                }
                i22++;
                i21 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            }
            i21 = 2;
        }
        int i33 = i16 * i21;
        for (int i34 = 0; i34 < i11; i34++) {
            int i35 = i13 + i33 + i10;
            int i36 = ((i12 + i10) - 1) + (i34 * i10);
            fArr2[i35] = -fArr[i36 + i15];
            fArr2[i35 - 1] = fArr[i36];
        }
    }

    public final void b(long j6, long j10, long j11, long j12, long j13, Ji.d dVar, Ji.d dVar2) {
        long j14;
        long j15;
        long j16 = j10 * j6;
        long j17 = 2;
        long j18 = j6 * 2;
        long j19 = 0;
        while (j19 < j10) {
            long j20 = (j19 * j18) + j12;
            long j21 = (j19 * j6) + j11;
            float b10 = dVar.b(j21);
            float b11 = dVar.b(j21 + j16);
            dVar2.c(AbstractC0044t0.E(b10, b11, dVar2, j20, b10, b11), (j20 + j18) - 1);
            j19++;
            j18 = j18;
            j17 = 2;
        }
        long j22 = j17;
        long j23 = j18;
        int i10 = (j6 > j22 ? 1 : (j6 == j22 ? 0 : -1));
        if (i10 < 0) {
            return;
        }
        if (i10 != 0) {
            j15 = j23;
            long j24 = 0;
            while (j24 < j10) {
                j15 = j24 * j6;
                long j25 = j15 * j22;
                long j26 = j25 + j6;
                long j27 = j15 + j16;
                long j28 = 2;
                while (j28 < j6) {
                    long j29 = (j28 - 1) + j13;
                    long j30 = j12 + j28 + j25;
                    long j31 = j12 + (j6 - j28) + j26;
                    long j32 = j11 + j28;
                    long j33 = j32 + j15;
                    long j34 = j15;
                    long j35 = j32 + j27;
                    long j36 = j16;
                    float b12 = dVar.b(j33 - 1);
                    float b13 = dVar.b(j33);
                    float b14 = dVar.b(j35 - 1);
                    float b15 = dVar.b(j35);
                    Ji.d dVar3 = this.f1007p;
                    float b16 = dVar3.b(j29 - 1);
                    float b17 = dVar3.b(j29);
                    float f6 = (b17 * b15) + (b16 * b14);
                    float f10 = (b16 * b15) - (b17 * b14);
                    dVar2.c(b13 + f10, j30);
                    dVar2.c(AbstractC0044t0.E(b12, f6, dVar2, j30 - 1, f10, b13), j31);
                    dVar2.c(b12 - f6, j31 - 1);
                    j28 += 2;
                    j24 = j24;
                    j16 = j36;
                    j15 = j34;
                }
                j22 = 2;
                j24++;
            }
            j14 = j16;
            if (j6 % j22 == 1) {
                return;
            }
        } else {
            j14 = j16;
            j15 = j23;
        }
        long j37 = j15 * j22;
        for (long j38 = 0; j38 < j10; j38++) {
            long j39 = j12 + j37 + j6;
            long j40 = ((j11 + j6) - 1) + (j38 * j6);
            dVar2.c(-dVar.b(j40 + j14), j39);
            dVar2.c(dVar.b(j40), j39 - 1);
        }
    }

    public final void c(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        char c10;
        char c11;
        int i15 = i14 + i10;
        int i16 = i11 * i10;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            c10 = 0;
            c11 = '\ub3d7';
            if (i18 >= i11) {
                break;
            }
            int i19 = i18 * i10;
            int i20 = ((i18 * 3) + 1) * i10;
            int i21 = i12 + i19;
            int i22 = i21 + i16;
            int i23 = (i16 * 2) + i21;
            float f6 = fArr[i21];
            float f10 = fArr[i22];
            float f11 = fArr[i23];
            float f12 = f10 + f11;
            fArr2[(i19 * 3) + i13] = f6 + f12;
            fArr2[i13 + i20 + i10] = (f11 - f10) * 0.8660254f;
            fArr2[((i13 + i10) - 1) + i20] = (f12 * (-0.5f)) + f6;
            i18++;
        }
        if (i10 == 1) {
            return;
        }
        while (i17 < i11) {
            int i24 = i17 * i10;
            int i25 = i24 * 3;
            int i26 = i24 + i16;
            int i27 = i26 + i16;
            int i28 = i25 + i10;
            int i29 = i28 + i10;
            int i30 = 2;
            while (i30 < i10) {
                int i31 = i30 - 1;
                int i32 = i31 + i14;
                int i33 = i31 + i15;
                float[] fArr3 = this.f1006o;
                float f13 = fArr3[i32 - 1];
                float f14 = fArr3[i32];
                float f15 = fArr3[i33 - 1];
                float f16 = fArr3[i33];
                int i34 = i12 + i30;
                int i35 = i13 + i30;
                int i36 = i34 + i24;
                int i37 = i34 + i26;
                int i38 = i34 + i27;
                float f17 = fArr[i36 - 1];
                float f18 = fArr[i36];
                float f19 = fArr[i37 - 1];
                float f20 = fArr[i37];
                float f21 = fArr[i38 - 1];
                float f22 = fArr[i38];
                float f23 = (f14 * f20) + (f13 * f19);
                float f24 = (f13 * f20) - (f14 * f19);
                float f25 = (f16 * f22) + (f15 * f21);
                float f26 = (f15 * f22) - (f16 * f21);
                float f27 = f23 + f25;
                float f28 = f24 + f26;
                float f29 = (f27 * (-0.5f)) + f17;
                float f30 = (f28 * (-0.5f)) + f18;
                float f31 = (f24 - f26) * 0.8660254f;
                float f32 = (f25 - f23) * 0.8660254f;
                int i39 = i35 + i25;
                int i40 = i13 + (i10 - i30) + i28;
                int i41 = i35 + i29;
                fArr2[i39 - 1] = f17 + f27;
                fArr2[i39] = f18 + f28;
                fArr2[i40 - 1] = f29 - f31;
                fArr2[i40] = f32 - f30;
                fArr2[i41 - 1] = f29 + f31;
                fArr2[i41] = f30 + f32;
                i30 += 2;
                c10 = 0;
                c11 = '\ub3d7';
            }
            i17++;
            c11 = c11;
        }
    }

    public final void d(long j6, long j10, long j11, long j12, long j13, Ji.d dVar, Ji.d dVar2) {
        long j14;
        long j15 = j13 + j6;
        long j16 = j10 * j6;
        long j17 = 0;
        while (true) {
            j14 = 3;
            if (j17 >= j10) {
                break;
            }
            long j18 = j17 * j6;
            long j19 = ((j17 * 3) + 1) * j6;
            long j20 = j11 + j18;
            long j21 = j20 + j16;
            long j22 = j15;
            long j23 = j20 + (2 * j16);
            float b10 = dVar.b(j20);
            float b11 = dVar.b(j21);
            float b12 = dVar.b(j23);
            float f6 = b11 + b12;
            dVar2.c(b10 + f6, (j18 * 3) + j12);
            dVar2.c((b12 - b11) * 0.8660254f, j12 + j19 + j6);
            dVar2.c((f6 * (-0.5f)) + b10, ((j12 + j6) - 1) + j19);
            j17++;
            j15 = j22;
        }
        long j24 = j15;
        if (j6 == 1) {
            return;
        }
        long j25 = 0;
        while (j25 < j10) {
            long j26 = j25 * j6;
            long j27 = j26 * j14;
            long j28 = j26 + j16;
            long j29 = j28 + j16;
            long j30 = j27 + j6;
            long j31 = j30 + j6;
            long j32 = 2;
            while (j32 < j6) {
                long j33 = j32 - 1;
                long j34 = j33 + j13;
                long j35 = j33 + j24;
                long j36 = j16;
                Ji.d dVar3 = this.f1007p;
                float b13 = dVar3.b(j34 - 1);
                float b14 = dVar3.b(j34);
                float b15 = dVar3.b(j35 - 1);
                float b16 = dVar3.b(j35);
                long j37 = j11 + j32;
                long j38 = j12 + j32;
                long j39 = j37 + j26;
                long j40 = j26;
                long j41 = j37 + j28;
                long j42 = j37 + j29;
                long j43 = j27;
                float b17 = dVar.b(j39 - 1);
                float b18 = dVar.b(j39);
                float b19 = dVar.b(j41 - 1);
                float b20 = dVar.b(j41);
                float b21 = dVar.b(j42 - 1);
                float b22 = dVar.b(j42);
                float f10 = (b14 * b20) + (b13 * b19);
                float f11 = (b13 * b20) - (b14 * b19);
                float f12 = (b16 * b22) + (b15 * b21);
                float f13 = (b15 * b22) - (b16 * b21);
                float f14 = f10 + f12;
                float f15 = f11 + f13;
                float f16 = (f14 * (-0.5f)) + b17;
                float f17 = (f15 * (-0.5f)) + b18;
                float f18 = (f11 - f13) * 0.8660254f;
                float f19 = (f12 - f10) * 0.8660254f;
                long j44 = j38 + j43;
                long j45 = j12 + (j6 - j32) + j30;
                long j46 = j38 + j31;
                dVar2.c(AbstractC0044t0.s(b17, f14, dVar2, j44 - 1, b18, f15), j44);
                dVar2.c(AbstractC0044t0.D(f16, f18, dVar2, j45 - 1, f19, f17), j45);
                dVar2.c(AbstractC0044t0.s(f16, f18, dVar2, j46 - 1, f17, f19), j46);
                j32 += 2;
                j27 = j43;
                j16 = j36;
                j26 = j40;
            }
            j25++;
            j14 = 3;
        }
    }

    public final void e(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i11 * i10;
        for (int i18 = 0; i18 < i11; i18++) {
            int i19 = i18 * i10;
            int i20 = i19 * 4;
            int i21 = i19 + i17;
            int i22 = i21 + i17;
            int i23 = i22 + i17;
            float f6 = fArr[i12 + i19];
            float f10 = fArr[i12 + i21];
            float f11 = fArr[i12 + i22];
            float f12 = fArr[i12 + i23];
            float f13 = f10 + f12;
            float f14 = f6 + f11;
            int i24 = i13 + i20 + i10 + i10;
            fArr2[i13 + i20] = f13 + f14;
            int i25 = i24 - 1;
            fArr2[i25 + i10 + i10] = f14 - f13;
            fArr2[i25] = f6 - f11;
            fArr2[i24] = f12 - f10;
        }
        int i26 = 2;
        if (i10 < 2) {
            return;
        }
        if (i10 != 2) {
            int i27 = 0;
            while (i27 < i11) {
                int i28 = i27 * i10;
                int i29 = i28 + i17;
                int i30 = i29 + i17;
                int i31 = i30 + i17;
                int i32 = i28 * 4;
                int i33 = i32 + i10;
                int i34 = i33 + i10;
                int i35 = i34 + i10;
                for (int i36 = i26; i36 < i10; i36 += 2) {
                    int i37 = i36 - 1;
                    int i38 = i37 + i14;
                    int i39 = i37 + i15;
                    int i40 = i37 + i16;
                    float[] fArr3 = this.f1006o;
                    float f15 = fArr3[i38 - 1];
                    float f16 = fArr3[i38];
                    float f17 = fArr3[i39 - 1];
                    float f18 = fArr3[i39];
                    float f19 = fArr3[i40 - 1];
                    float f20 = fArr3[i40];
                    int i41 = i12 + i36;
                    int i42 = i13 + i36;
                    int i43 = i13 + (i10 - i36);
                    int i44 = i41 + i28;
                    int i45 = i41 + i29;
                    int i46 = i41 + i30;
                    int i47 = i41 + i31;
                    float f21 = fArr[i44 - 1];
                    float f22 = fArr[i44];
                    float f23 = fArr[i45 - 1];
                    float f24 = fArr[i45];
                    float f25 = fArr[i46 - 1];
                    float f26 = fArr[i46];
                    float f27 = fArr[i47 - 1];
                    float f28 = fArr[i47];
                    float f29 = (f16 * f24) + (f15 * f23);
                    float f30 = (f15 * f24) - (f16 * f23);
                    float f31 = (f18 * f26) + (f17 * f25);
                    float f32 = (f17 * f26) - (f18 * f25);
                    float f33 = (f20 * f28) + (f19 * f27);
                    float f34 = (f19 * f28) - (f20 * f27);
                    float f35 = f29 + f33;
                    float f36 = f33 - f29;
                    float f37 = f30 + f34;
                    float f38 = f30 - f34;
                    float f39 = f22 + f32;
                    float f40 = f22 - f32;
                    float f41 = f21 + f31;
                    float f42 = f21 - f31;
                    int i48 = i42 + i32;
                    int i49 = i43 + i33;
                    int i50 = i42 + i34;
                    int i51 = i43 + i35;
                    fArr2[i48 - 1] = f35 + f41;
                    fArr2[i51 - 1] = f41 - f35;
                    fArr2[i48] = f37 + f39;
                    fArr2[i51] = f37 - f39;
                    fArr2[i50 - 1] = f38 + f42;
                    fArr2[i49 - 1] = f42 - f38;
                    fArr2[i50] = f36 + f40;
                    fArr2[i49] = f36 - f40;
                }
                i27++;
                i26 = 2;
            }
            if (i10 % 2 == 1) {
                return;
            }
        }
        for (int i52 = 0; i52 < i11; i52++) {
            int i53 = i52 * i10;
            int i54 = i53 * 4;
            int i55 = i53 + i17;
            int i56 = i55 + i17;
            int i57 = i56 + i17;
            int i58 = i54 + i10;
            int i59 = i58 + i10;
            int i60 = (i12 + i10) - 1;
            float f43 = fArr[i53 + i60];
            float f44 = fArr[i55 + i60];
            float f45 = fArr[i56 + i60];
            float f46 = fArr[i60 + i57];
            float f47 = (f44 + f46) * (-0.70710677f);
            float f48 = (f44 - f46) * 0.70710677f;
            int i61 = (i13 + i10) - 1;
            fArr2[i54 + i61] = f48 + f43;
            fArr2[i61 + i59] = f43 - f48;
            fArr2[i13 + i58] = f47 - f45;
            fArr2[i13 + i59 + i10] = f47 + f45;
        }
    }

    public final void f(long j6, long j10, long j11, long j12, long j13, Ji.d dVar, Ji.d dVar2) {
        long j14;
        Ji.d dVar3;
        Ji.d dVar4 = dVar;
        Ji.d dVar5 = dVar2;
        long j15 = j13 + j6;
        long j16 = j15 + j6;
        long j17 = j10 * j6;
        long j18 = 0;
        while (j18 < j10) {
            long j19 = j18 * j6;
            long j20 = 4 * j19;
            long j21 = j19 + j17;
            long j22 = j21 + j17;
            float b10 = dVar4.b(j11 + j19);
            float b11 = dVar4.b(j11 + j21);
            float b12 = dVar4.b(j11 + j22);
            float b13 = dVar4.b(j11 + j22 + j17);
            float f6 = b11 + b13;
            float f10 = b10 + b12;
            long j23 = j12 + j20 + j6 + j6;
            dVar5.c(f6 + f10, j12 + j20);
            long j24 = j23 - 1;
            dVar5.c(AbstractC0044t0.D(f10, f6, dVar2, j24 + j6 + j6, b10, b12), j24);
            dVar5.c(b13 - b11, j23);
            j18++;
            j16 = j16;
            j15 = j15;
        }
        long j25 = j15;
        long j26 = j16;
        long j27 = 2;
        int i10 = (j6 > 2L ? 1 : (j6 == 2L ? 0 : -1));
        if (i10 < 0) {
            return;
        }
        if (i10 != 0) {
            long j28 = 0;
            while (j28 < j10) {
                long j29 = j28 * j6;
                long j30 = j29 + j17;
                long j31 = j30 + j17;
                long j32 = j31 + j17;
                long j33 = j29 * 4;
                long j34 = j33 + j6;
                long j35 = j34 + j6;
                long j36 = j35 + j6;
                long j37 = j27;
                while (j37 < j6) {
                    long j38 = j37 - 1;
                    long j39 = j38 + j13;
                    long j40 = j38 + j25;
                    long j41 = j38 + j26;
                    long j42 = j17;
                    long j43 = j28;
                    Ji.d dVar6 = this.f1007p;
                    float b14 = dVar6.b(j39 - 1);
                    float b15 = dVar6.b(j39);
                    float b16 = dVar6.b(j40 - 1);
                    float b17 = dVar6.b(j40);
                    float b18 = dVar6.b(j41 - 1);
                    float b19 = dVar6.b(j41);
                    long j44 = j11 + j37;
                    long j45 = j12 + j37;
                    long j46 = j12 + (j6 - j37);
                    long j47 = j44 + j29;
                    long j48 = j44 + j30;
                    long j49 = j44 + j31;
                    long j50 = j44 + j32;
                    float b20 = dVar4.b(j47 - 1);
                    float b21 = dVar4.b(j47);
                    float b22 = dVar4.b(j48 - 1);
                    float b23 = dVar4.b(j48);
                    float b24 = dVar4.b(j49 - 1);
                    float b25 = dVar4.b(j49);
                    float b26 = dVar4.b(j50 - 1);
                    float b27 = dVar4.b(j50);
                    float f11 = (b15 * b23) + (b14 * b22);
                    float f12 = (b14 * b23) - (b15 * b22);
                    float f13 = (b17 * b25) + (b16 * b24);
                    float f14 = (b16 * b25) - (b17 * b24);
                    float f15 = (b19 * b27) + (b18 * b26);
                    float f16 = (b18 * b27) - (b19 * b26);
                    float f17 = f11 + f15;
                    float f18 = f15 - f11;
                    float f19 = f12 + f16;
                    float f20 = f12 - f16;
                    float f21 = b21 + f14;
                    float f22 = b21 - f14;
                    float f23 = b20 + f13;
                    float f24 = b20 - f13;
                    long j51 = j45 + j33;
                    long j52 = j46 + j34;
                    long j53 = j45 + j35;
                    long j54 = j46 + j36;
                    dVar2.c(f17 + f23, j51 - 1);
                    dVar2.c(AbstractC0044t0.F(f23, f17, dVar2, j54 - 1, f19, f21), j51);
                    dVar2.c(f19 - f21, j54);
                    dVar2.c(f20 + f24, j53 - 1);
                    dVar2.c(AbstractC0044t0.F(f24, f20, dVar2, j52 - 1, f18, f22), j53);
                    dVar2.c(f18 - f22, j52);
                    j37 += 2;
                    dVar5 = dVar2;
                    j27 = 2;
                    j17 = j42;
                    j28 = j43;
                    j29 = j29;
                    dVar4 = dVar;
                }
                j28++;
                dVar4 = dVar;
            }
            dVar3 = dVar5;
            j14 = j17;
            if (j6 % j27 == 1) {
                return;
            }
        } else {
            dVar3 = dVar5;
            j14 = j17;
        }
        long j55 = 0;
        while (j55 < j10) {
            long j56 = j55 * j6;
            long j57 = j56 * 4;
            long j58 = j56 + j14;
            long j59 = j58 + j14;
            long j60 = j59 + j14;
            long j61 = j57 + j6;
            long j62 = j61 + j6;
            long j63 = (j11 + j6) - 1;
            long j64 = j55;
            Ji.d dVar7 = dVar3;
            float b28 = dVar.b(j63 + j56);
            float b29 = dVar.b(j63 + j58);
            float b30 = dVar.b(j63 + j59);
            float b31 = dVar.b(j63 + j60);
            float f25 = (b29 + b31) * (-0.70710677f);
            float f26 = (b29 - b31) * 0.70710677f;
            long j65 = (j12 + j6) - 1;
            dVar7.c(f26 + b28, j65 + j57);
            dVar7.c(b28 - f26, j65 + j62);
            dVar7.c(f25 - b30, j12 + j61);
            dVar7.c(f25 + b30, j12 + j62 + j6);
            dVar3 = dVar7;
            j55 = j64 + 1;
        }
    }

    public final void g(int i10, int i11, int i12, int i13, int i14, float[] fArr, float[] fArr2) {
        char c10;
        char c11;
        int i15 = i14 + i10;
        int i16 = i15 + i10;
        int i17 = i16 + i10;
        int i18 = i11 * i10;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            c10 = '\u7871';
            c11 = '\u1bbd';
            if (i20 >= i11) {
                break;
            }
            int i21 = i20 * i10;
            int i22 = i21 * 5;
            int i23 = i22 + i10;
            int i24 = i23 + i10;
            int i25 = i24 + i10;
            int i26 = i21 + i18;
            int i27 = i26 + i18;
            int i28 = i27 + i18;
            int i29 = (i13 + i10) - 1;
            float f6 = fArr[i12 + i21];
            float f10 = fArr[i12 + i26];
            float f11 = fArr[i12 + i27];
            float f12 = fArr[i12 + i28];
            float f13 = fArr[i12 + i28 + i18];
            float f14 = f13 + f10;
            float f15 = f13 - f10;
            float f16 = f12 + f11;
            float f17 = f12 - f11;
            fArr2[i13 + i22] = f6 + f14 + f16;
            fArr2[i29 + i23] = (f16 * (-0.809017f)) + (f14 * 0.309017f) + f6;
            fArr2[i13 + i24] = (f17 * 0.58778524f) + (f15 * 0.95105654f);
            fArr2[i29 + i25] = (f16 * 0.309017f) + (f14 * (-0.809017f)) + f6;
            fArr2[i13 + i25 + i10] = (f15 * 0.58778524f) - (f17 * 0.95105654f);
            i20++;
        }
        if (i10 == 1) {
            return;
        }
        while (i19 < i11) {
            int i30 = i19 * i10;
            int i31 = i30 * 5;
            int i32 = i31 + i10;
            int i33 = i32 + i10;
            int i34 = i33 + i10;
            int i35 = i34 + i10;
            int i36 = i30 + i18;
            int i37 = i36 + i18;
            int i38 = i37 + i18;
            int i39 = i38 + i18;
            int i40 = 2;
            while (i40 < i10) {
                int i41 = i40 - 1;
                int i42 = i41 + i14;
                int i43 = i41 + i15;
                int i44 = i41 + i16;
                int i45 = i41 + i17;
                float[] fArr3 = this.f1006o;
                float f18 = fArr3[i42 - 1];
                float f19 = fArr3[i42];
                float f20 = fArr3[i43 - 1];
                float f21 = fArr3[i43];
                float f22 = fArr3[i44 - 1];
                float f23 = fArr3[i44];
                float f24 = fArr3[i45 - 1];
                float f25 = fArr3[i45];
                int i46 = i12 + i40;
                int i47 = i13 + i40;
                int i48 = i13 + (i10 - i40);
                int i49 = i46 + i30;
                int i50 = i46 + i36;
                int i51 = i46 + i37;
                int i52 = i46 + i38;
                int i53 = i46 + i39;
                float f26 = fArr[i49 - 1];
                float f27 = fArr[i49];
                float f28 = fArr[i50 - 1];
                float f29 = fArr[i50];
                float f30 = fArr[i51 - 1];
                float f31 = fArr[i51];
                float f32 = fArr[i52 - 1];
                float f33 = fArr[i52];
                float f34 = fArr[i53 - 1];
                float f35 = fArr[i53];
                float f36 = (f19 * f29) + (f18 * f28);
                float f37 = (f18 * f29) - (f19 * f28);
                float f38 = (f21 * f31) + (f20 * f30);
                float f39 = (f20 * f31) - (f21 * f30);
                float f40 = (f23 * f33) + (f22 * f32);
                float f41 = (f22 * f33) - (f23 * f32);
                float f42 = (f25 * f35) + (f24 * f34);
                float f43 = (f24 * f35) - (f25 * f34);
                float f44 = f36 + f42;
                float f45 = f42 - f36;
                float f46 = f37 - f43;
                float f47 = f37 + f43;
                float f48 = f38 + f40;
                float f49 = f40 - f38;
                float f50 = f39 - f41;
                float f51 = f39 + f41;
                float f52 = (f48 * (-0.809017f)) + (f44 * 0.309017f) + f26;
                float f53 = (f51 * (-0.809017f)) + (f47 * 0.309017f) + f27;
                float f54 = (f48 * 0.309017f) + (f44 * (-0.809017f)) + f26;
                float f55 = (f51 * 0.309017f) + (f47 * (-0.809017f)) + f27;
                float f56 = (f50 * 0.58778524f) + (f46 * 0.95105654f);
                float f57 = (f49 * 0.58778524f) + (f45 * 0.95105654f);
                float f58 = (f46 * 0.58778524f) - (f50 * 0.95105654f);
                float f59 = (f45 * 0.58778524f) - (f49 * 0.95105654f);
                int i54 = i47 + i31;
                int i55 = i48 + i32;
                int i56 = i47 + i33;
                int i57 = i48 + i34;
                int i58 = i47 + i35;
                fArr2[i54 - 1] = f26 + f44 + f48;
                fArr2[i54] = f27 + f47 + f51;
                fArr2[i56 - 1] = f52 + f56;
                fArr2[i55 - 1] = f52 - f56;
                fArr2[i56] = f53 + f57;
                fArr2[i55] = f57 - f53;
                fArr2[i58 - 1] = f54 + f58;
                fArr2[i57 - 1] = f54 - f58;
                fArr2[i58] = f55 + f59;
                fArr2[i57] = f59 - f55;
                i40 += 2;
                c10 = '\u7871';
                c11 = '\u1bbd';
            }
            i19++;
            c10 = c10;
        }
    }

    public final void h(long j6, long j10, long j11, long j12, long j13, Ji.d dVar, Ji.d dVar2) {
        Ji.d dVar3 = dVar;
        Ji.d dVar4 = dVar2;
        long j14 = j13 + j6;
        long j15 = j14 + j6;
        long j16 = j15 + j6;
        long j17 = j10 * j6;
        long j18 = 0;
        while (j18 < j10) {
            long j19 = j18 * j6;
            long j20 = 5 * j19;
            long j21 = j20 + j6;
            long j22 = j21 + j6;
            long j23 = j22 + j6;
            long j24 = j19 + j17;
            long j25 = j24 + j17;
            long j26 = j25 + j17;
            long j27 = (j12 + j6) - 1;
            float b10 = dVar3.b(j11 + j19);
            float b11 = dVar3.b(j11 + j24);
            float b12 = dVar3.b(j11 + j25);
            long j28 = j16;
            float b13 = dVar3.b(j11 + j26);
            float b14 = dVar3.b(j11 + j26 + j17);
            float f6 = b14 + b11;
            float f10 = b14 - b11;
            float f11 = b13 + b12;
            float f12 = b13 - b12;
            dVar4.c(b10 + f6 + f11, j12 + j20);
            dVar4.c((f11 * (-0.809017f)) + (f6 * 0.309017f) + b10, j27 + j21);
            dVar4.c((f12 * 0.58778524f) + (f10 * 0.95105654f), j12 + j22);
            dVar4.c((f11 * 0.309017f) + (f6 * (-0.809017f)) + b10, j27 + j23);
            dVar4.c((f10 * 0.58778524f) - (f12 * 0.95105654f), j12 + j23 + j6);
            j18++;
            dVar3 = dVar;
            j16 = j28;
        }
        long j29 = j16;
        if (j6 == 1) {
            return;
        }
        for (long j30 = 0; j30 < j10; j30++) {
            long j31 = j30 * j6;
            long j32 = j31 * 5;
            long j33 = j32 + j6;
            long j34 = j33 + j6;
            long j35 = j34 + j6;
            long j36 = j35 + j6;
            long j37 = j31 + j17;
            long j38 = j37 + j17;
            long j39 = j38 + j17;
            long j40 = j39 + j17;
            long j41 = 2;
            while (j41 < j6) {
                long j42 = j41 - 1;
                long j43 = j42 + j13;
                long j44 = j42 + j14;
                long j45 = j42 + j15;
                long j46 = j42 + j29;
                long j47 = j14;
                long j48 = j15;
                Ji.d dVar5 = this.f1007p;
                float b15 = dVar5.b(j43 - 1);
                float b16 = dVar5.b(j43);
                float b17 = dVar5.b(j44 - 1);
                float b18 = dVar5.b(j44);
                float b19 = dVar5.b(j45 - 1);
                float b20 = dVar5.b(j45);
                float b21 = dVar5.b(j46 - 1);
                float b22 = dVar5.b(j46);
                long j49 = j11 + j41;
                long j50 = j12 + j41;
                long j51 = j12 + (j6 - j41);
                long j52 = j49 + j31;
                long j53 = j31;
                long j54 = j49 + j37;
                long j55 = j49 + j38;
                long j56 = j49 + j39;
                long j57 = j49 + j40;
                float b23 = dVar.b(j52 - 1);
                float b24 = dVar.b(j52);
                float b25 = dVar.b(j54 - 1);
                float b26 = dVar.b(j54);
                float b27 = dVar.b(j55 - 1);
                float b28 = dVar.b(j55);
                float b29 = dVar.b(j56 - 1);
                float b30 = dVar.b(j56);
                float b31 = dVar.b(j57 - 1);
                float b32 = dVar.b(j57);
                float f13 = (b16 * b26) + (b15 * b25);
                float f14 = (b15 * b26) - (b16 * b25);
                float f15 = (b18 * b28) + (b17 * b27);
                float f16 = (b17 * b28) - (b18 * b27);
                float f17 = (b20 * b30) + (b19 * b29);
                float f18 = (b30 * b19) - (b20 * b29);
                float f19 = (b22 * b32) + (b21 * b31);
                float f20 = (b21 * b32) - (b31 * b22);
                float f21 = f13 + f19;
                float f22 = f19 - f13;
                float f23 = f14 - f20;
                float f24 = f14 + f20;
                float f25 = f15 + f17;
                float f26 = f17 - f15;
                float f27 = f16 - f18;
                float f28 = f16 + f18;
                float f29 = (f21 * 0.309017f) + b23 + (f25 * (-0.809017f));
                float f30 = (f28 * (-0.809017f)) + (f24 * 0.309017f) + b24;
                float f31 = (f21 * (-0.809017f)) + b23 + (f25 * 0.309017f);
                float f32 = (f28 * 0.309017f) + (f24 * (-0.809017f)) + b24;
                float f33 = (f27 * 0.58778524f) + (f23 * 0.95105654f);
                float f34 = (f26 * 0.58778524f) + (f22 * 0.95105654f);
                float f35 = (f23 * 0.58778524f) - (f27 * 0.95105654f);
                float f36 = (f22 * 0.58778524f) - (f26 * 0.95105654f);
                long j58 = j50 + j32;
                long j59 = j51 + j33;
                long j60 = j50 + j34;
                long j61 = j51 + j35;
                long j62 = j50 + j36;
                dVar2.c(f21 + b23 + f25, j58 - 1);
                dVar2.c(b24 + f24 + f28, j58);
                dVar2.c(f29 + f33, j60 - 1);
                dVar2.c(AbstractC0044t0.F(f29, f33, dVar2, j59 - 1, f30, f34), j60);
                dVar2.c(f34 - f30, j59);
                dVar2.c(f31 + f35, j62 - 1);
                dVar2.c(AbstractC0044t0.F(f31, f35, dVar2, j61 - 1, f32, f36), j62);
                dVar2.c(f36 - f32, j61);
                j41 += 2;
                dVar4 = dVar2;
                j14 = j47;
                j15 = j48;
                j31 = j53;
                j17 = j17;
            }
        }
    }

    public final void i(int i10, int i11, int i12, int i13, float[] fArr, int i14, float[] fArr2, int i15, int i16) {
        int i17;
        float f6;
        int i18;
        int i19 = i11;
        double d10 = 6.2831855f / i19;
        float b10 = (float) AbstractC4499c.b(d10);
        float g10 = (float) AbstractC4499c.g(d10);
        int i20 = (i19 + 1) / 2;
        int i21 = (i10 - 1) / 2;
        if (i10 != 1) {
            for (int i22 = 0; i22 < i13; i22++) {
                fArr2[i15 + i22] = fArr[i14 + i22];
            }
            for (int i23 = 1; i23 < i19; i23++) {
                int i24 = i23 * i12 * i10;
                for (int i25 = 0; i25 < i12; i25++) {
                    int i26 = (i25 * i10) + i24;
                    fArr2[i15 + i26] = fArr[i14 + i26];
                }
            }
            float[] fArr3 = this.f1006o;
            if (i21 <= i12) {
                int i27 = -i10;
                for (int i28 = 1; i28 < i19; i28++) {
                    i27 += i10;
                    int i29 = i27 - 1;
                    int i30 = i28 * i12 * i10;
                    int i31 = 2;
                    while (i31 < i10) {
                        i29 += 2;
                        int i32 = i29 + i16;
                        int i33 = i14 + i31;
                        int i34 = i15 + i31;
                        float f10 = fArr3[i32 - 1];
                        float f11 = fArr3[i32];
                        int i35 = i27;
                        for (int i36 = 0; i36 < i12; i36++) {
                            int i37 = (i36 * i10) + i30;
                            int i38 = i34 + i37;
                            int i39 = i33 + i37;
                            float f12 = fArr[i39 - 1];
                            float f13 = fArr[i39];
                            fArr2[i38 - 1] = (f11 * f13) + (f10 * f12);
                            fArr2[i38] = (f13 * f10) - (f12 * f11);
                        }
                        i31 += 2;
                        i27 = i35;
                    }
                }
            } else {
                int i40 = -i10;
                int i41 = 1;
                while (i41 < i19) {
                    i40 += i10;
                    int i42 = i41 * i12 * i10;
                    float f14 = g10;
                    int i43 = 0;
                    while (i43 < i12) {
                        int i44 = i40 - 1;
                        int i45 = (i43 * i10) + i42;
                        int i46 = i40;
                        for (int i47 = 2; i47 < i10; i47 += 2) {
                            i44 += 2;
                            int i48 = i44 + i16;
                            float f15 = fArr3[i48 - 1];
                            float f16 = fArr3[i48];
                            int i49 = i15 + i47 + i45;
                            int i50 = i14 + i47 + i45;
                            float f17 = fArr[i50 - 1];
                            float f18 = fArr[i50];
                            fArr2[i49 - 1] = (f16 * f18) + (f15 * f17);
                            fArr2[i49] = (f15 * f18) - (f16 * f17);
                        }
                        i43++;
                        i40 = i46;
                    }
                    i41++;
                    g10 = f14;
                }
            }
            f6 = g10;
            i18 = 2;
            if (i21 >= i12) {
                for (int i51 = 1; i51 < i20; i51++) {
                    int i52 = i51 * i12 * i10;
                    int i53 = (i19 - i51) * i12 * i10;
                    int i54 = 0;
                    while (i54 < i12) {
                        int i55 = i54 * i10;
                        int i56 = i55 + i52;
                        int i57 = i55 + i53;
                        int i58 = i53;
                        for (int i59 = 2; i59 < i10; i59 += 2) {
                            int i60 = i14 + i59;
                            int i61 = i15 + i59;
                            int i62 = i60 + i56;
                            int i63 = i60 + i57;
                            int i64 = i61 + i56;
                            int i65 = i61 + i57;
                            float f19 = fArr2[i64 - 1];
                            float f20 = fArr2[i64];
                            float f21 = fArr2[i65 - 1];
                            float f22 = fArr2[i65];
                            fArr[i62 - 1] = f19 + f21;
                            fArr[i62] = f20 + f22;
                            fArr[i63 - 1] = f20 - f22;
                            fArr[i63] = f21 - f19;
                        }
                        i54++;
                        i53 = i58;
                    }
                }
            } else {
                for (int i66 = 1; i66 < i20; i66++) {
                    int i67 = i66 * i12 * i10;
                    int i68 = (i19 - i66) * i12 * i10;
                    int i69 = 2;
                    while (i69 < i10) {
                        int i70 = i14 + i69;
                        int i71 = i15 + i69;
                        int i72 = i21;
                        for (int i73 = 0; i73 < i12; i73++) {
                            int i74 = i73 * i10;
                            int i75 = i74 + i67;
                            int i76 = i74 + i68;
                            int i77 = i70 + i75;
                            int i78 = i70 + i76;
                            int i79 = i71 + i75;
                            int i80 = i71 + i76;
                            float f23 = fArr2[i79 - 1];
                            float f24 = fArr2[i79];
                            float f25 = fArr2[i80 - 1];
                            float f26 = fArr2[i80];
                            fArr[i77 - 1] = f23 + f25;
                            fArr[i77] = f24 + f26;
                            fArr[i78 - 1] = f24 - f26;
                            fArr[i78] = f25 - f23;
                        }
                        i69 += 2;
                        i21 = i72;
                    }
                }
            }
            i17 = i21;
        } else {
            f6 = g10;
            i18 = 2;
            i17 = i21;
            System.arraycopy(fArr2, i15, fArr, i14, i13);
        }
        for (int i81 = 1; i81 < i20; i81++) {
            int i82 = i81 * i12 * i10;
            int i83 = (i19 - i81) * i12 * i10;
            for (int i84 = 0; i84 < i12; i84++) {
                int i85 = i84 * i10;
                int i86 = i85 + i82;
                int i87 = i85 + i83;
                float f27 = fArr2[i15 + i86];
                float f28 = fArr2[i15 + i87];
                fArr[i86 + i14] = f27 + f28;
                fArr[i87 + i14] = f28 - f27;
            }
        }
        int i88 = (i19 - 1) * i13;
        float f29 = 1.0f;
        float f30 = 0.0f;
        int i89 = 1;
        while (i89 < i20) {
            float f31 = (b10 * f29) - (f6 * f30);
            f30 = (f30 * b10) + (f29 * f6);
            int i90 = i89 * i13;
            int i91 = (i19 - i89) * i13;
            float f32 = b10;
            for (int i92 = 0; i92 < i13; i92++) {
                int i93 = i15 + i92;
                int i94 = i14 + i92;
                fArr2[i93 + i90] = (fArr[i94 + i13] * f31) + fArr[i94];
                fArr2[i93 + i91] = fArr[i94 + i88] * f30;
            }
            float f33 = f30;
            float f34 = f31;
            int i95 = i18;
            while (i95 < i20) {
                float f35 = (f31 * f34) - (f30 * f33);
                f33 = (f34 * f30) + (f33 * f31);
                int i96 = i95 * i13;
                int i97 = (i19 - i95) * i13;
                int i98 = i88;
                for (int i99 = 0; i99 < i13; i99++) {
                    int i100 = i15 + i99;
                    int i101 = i14 + i99;
                    int i102 = i100 + i90;
                    fArr2[i102] = (fArr[i101 + i96] * f35) + fArr2[i102];
                    int i103 = i100 + i91;
                    fArr2[i103] = (fArr[i101 + i97] * f33) + fArr2[i103];
                }
                i95++;
                i88 = i98;
                f34 = f35;
            }
            i89++;
            f29 = f31;
            b10 = f32;
        }
        for (int i104 = 1; i104 < i20; i104++) {
            int i105 = i104 * i13;
            for (int i106 = 0; i106 < i13; i106++) {
                int i107 = i15 + i106;
                fArr2[i107] = fArr2[i107] + fArr[i14 + i106 + i105];
            }
        }
        if (i10 >= i12) {
            for (int i108 = 0; i108 < i12; i108++) {
                int i109 = i108 * i10;
                int i110 = i109 * i19;
                for (int i111 = 0; i111 < i10; i111++) {
                    fArr[i14 + i111 + i110] = fArr2[i15 + i111 + i109];
                }
            }
        } else {
            for (int i112 = 0; i112 < i10; i112++) {
                for (int i113 = 0; i113 < i12; i113++) {
                    int i114 = i113 * i10;
                    fArr[(i114 * i19) + i14 + i112] = fArr2[i15 + i112 + i114];
                }
            }
        }
        int i115 = i19 * i10;
        for (int i116 = 1; i116 < i20; i116++) {
            int i117 = i116 * i12 * i10;
            int i118 = (i19 - i116) * i12 * i10;
            int i119 = i116 * 2 * i10;
            for (int i120 = 0; i120 < i12; i120++) {
                int i121 = i120 * i10;
                int i122 = i120 * i115;
                fArr[((((i14 + i10) - 1) + i119) - i10) + i122] = fArr2[i121 + i117 + i15];
                fArr[i14 + i119 + i122] = fArr2[i121 + i118 + i15];
            }
        }
        if (i10 == 1) {
            return;
        }
        if (i17 >= i12) {
            for (int i123 = 1; i123 < i20; i123++) {
                int i124 = i123 * i12 * i10;
                int i125 = (i19 - i123) * i12 * i10;
                int i126 = i123 * 2 * i10;
                int i127 = 0;
                while (i127 < i12) {
                    int i128 = i127 * i115;
                    int i129 = i127 * i10;
                    int i130 = i115;
                    for (int i131 = i18; i131 < i10; i131 += 2) {
                        int i132 = i14 + i131 + i126 + i128;
                        int i133 = (((i14 + (i10 - i131)) + i126) - i10) + i128;
                        int i134 = i15 + i131 + i129;
                        int i135 = i134 + i124;
                        int i136 = i134 + i125;
                        float f36 = fArr2[i135 - 1];
                        float f37 = fArr2[i135];
                        float f38 = fArr2[i136 - 1];
                        float f39 = fArr2[i136];
                        fArr[i132 - 1] = f36 + f38;
                        fArr[i133 - 1] = f36 - f38;
                        fArr[i132] = f37 + f39;
                        fArr[i133] = f39 - f37;
                    }
                    i127++;
                    i115 = i130;
                }
            }
            return;
        }
        int i137 = 1;
        while (i137 < i20) {
            int i138 = i137 * i12 * i10;
            int i139 = (i19 - i137) * i12 * i10;
            int i140 = i137 * 2 * i10;
            for (int i141 = i18; i141 < i10; i141 += 2) {
                int i142 = i14 + i141;
                int i143 = (i10 - i141) + i14;
                int i144 = i15 + i141;
                for (int i145 = 0; i145 < i12; i145++) {
                    int i146 = i145 * i115;
                    int i147 = i142 + i140 + i146;
                    int i148 = ((i143 + i140) - i10) + i146;
                    int i149 = i144 + (i145 * i10);
                    int i150 = i149 + i138;
                    int i151 = i149 + i139;
                    float f40 = fArr2[i150 - 1];
                    float f41 = fArr2[i150];
                    float f42 = fArr2[i151 - 1];
                    float f43 = fArr2[i151];
                    fArr[i147 - 1] = f40 + f42;
                    fArr[i148 - 1] = f40 - f42;
                    fArr[i147] = f41 + f43;
                    fArr[i148] = f43 - f41;
                }
            }
            i137++;
            i19 = i11;
        }
    }

    public final void j(long j6, long j10, long j11, long j12, Ji.d dVar, long j13, Ji.d dVar2, long j14, long j15) {
        float f6;
        float f10;
        int i10;
        long j16 = j6;
        long j17 = j10;
        Ji.d dVar3 = dVar2;
        double d10 = 6.2831855f / ((float) j17);
        float b10 = (float) AbstractC4499c.b(d10);
        float g10 = (float) AbstractC4499c.g(d10);
        long j18 = (j17 + 1) / 2;
        long j19 = (j16 - 1) / 2;
        int i11 = (j16 > 1L ? 1 : (j16 == 1L ? 0 : -1));
        if (i11 != 0) {
            for (long j20 = 0; j20 < j12; j20++) {
                dVar3.c(dVar.b(j13 + j20), j14 + j20);
            }
            for (long j21 = 1; j21 < j17; j21++) {
                long j22 = j21 * j11 * j16;
                long j23 = 0;
                while (j23 < j11) {
                    long j24 = (j23 * j16) + j22;
                    dVar3.c(dVar.b(j13 + j24), j14 + j24);
                    j23++;
                    j22 = j22;
                }
            }
            int i12 = (j19 > j11 ? 1 : (j19 == j11 ? 0 : -1));
            Ji.d dVar4 = this.f1007p;
            if (i12 <= 0) {
                long j25 = -j16;
                long j26 = 1;
                while (j26 < j17) {
                    long j27 = j25 + j16;
                    long j28 = j27 - 1;
                    long j29 = j26 * j11 * j16;
                    long j30 = 2;
                    while (j30 < j16) {
                        j28 += 2;
                        long j31 = j27;
                        long j32 = j28 + j15;
                        long j33 = j13 + j30;
                        long j34 = j14 + j30;
                        float b11 = dVar4.b(j32 - 1);
                        float b12 = dVar4.b(j32);
                        long j35 = 0;
                        while (j35 < j11) {
                            long j36 = (j35 * j16) + j29;
                            float f11 = b10;
                            long j37 = j34 + j36;
                            int i13 = i12;
                            long j38 = j33 + j36;
                            float b13 = dVar.b(j38 - 1);
                            float b14 = dVar.b(j38);
                            dVar3.c((b12 * b14) + (b11 * b13), j37 - 1);
                            dVar3.c((b14 * b11) - (b13 * b12), j37);
                            j35++;
                            i12 = i13;
                            b10 = f11;
                            g10 = g10;
                            dVar4 = dVar4;
                        }
                        j30 += 2;
                        j27 = j31;
                    }
                    j26++;
                    j17 = j10;
                    j25 = j27;
                }
                f10 = b10;
                f6 = g10;
                i10 = i12;
            } else {
                i10 = i12;
                f10 = b10;
                f6 = g10;
                long j39 = -j16;
                long j40 = 1;
                while (j40 < j10) {
                    j39 += j16;
                    long j41 = j40 * j11 * j16;
                    long j42 = 0;
                    while (j42 < j11) {
                        long j43 = j39 - 1;
                        long j44 = (j42 * j16) + j41;
                        long j45 = 2;
                        while (j45 < j16) {
                            long j46 = j43 + 2;
                            long j47 = j39;
                            long j48 = j46 + j15;
                            long j49 = j41;
                            float b15 = dVar4.b(j48 - 1);
                            float b16 = dVar4.b(j48);
                            long j50 = j14 + j45 + j44;
                            long j51 = j13 + j45 + j44;
                            float b17 = dVar.b(j51 - 1);
                            float b18 = dVar.b(j51);
                            i10 = i10;
                            dVar3.c((b16 * b18) + (b15 * b17), j50 - 1);
                            dVar3.c((b15 * b18) - (b16 * b17), j50);
                            j45 += 2;
                            j16 = j6;
                            j39 = j47;
                            j41 = j49;
                            j40 = j40;
                            j43 = j46;
                        }
                        j42++;
                        j16 = j6;
                    }
                    j40++;
                    j16 = j6;
                }
            }
            if (i10 >= 0) {
                long j52 = 1;
                while (j52 < j18) {
                    long j53 = j52 * j11 * j6;
                    long j54 = (j10 - j52) * j11 * j6;
                    for (long j55 = 0; j55 < j11; j55++) {
                        long j56 = j55 * j6;
                        long j57 = j56 + j53;
                        long j58 = j56 + j54;
                        long j59 = 2;
                        while (j59 < j6) {
                            long j60 = j13 + j59;
                            long j61 = j14 + j59;
                            long j62 = j60 + j57;
                            long j63 = j60 + j58;
                            long j64 = j61 + j57;
                            long j65 = j61 + j58;
                            long j66 = j54;
                            float b19 = dVar3.b(j64 - 1);
                            float b20 = dVar3.b(j64);
                            float b21 = dVar3.b(j65 - 1);
                            float b22 = dVar3.b(j65);
                            dVar.c(AbstractC0044t0.s(b19, b21, dVar, j62 - 1, b20, b22), j62);
                            dVar.c(AbstractC0044t0.D(b20, b22, dVar, j63 - 1, b21, b19), j63);
                            j59 += 2;
                            j54 = j66;
                            j52 = j52;
                            j53 = j53;
                        }
                    }
                    j52++;
                }
            } else {
                long j67 = 1;
                while (j67 < j18) {
                    long j68 = j67 * j11 * j6;
                    long j69 = (j10 - j67) * j11 * j6;
                    for (long j70 = 2; j70 < j6; j70 += 2) {
                        long j71 = j13 + j70;
                        long j72 = j14 + j70;
                        long j73 = 0;
                        while (j73 < j11) {
                            long j74 = j73 * j6;
                            long j75 = j74 + j68;
                            long j76 = j74 + j69;
                            long j77 = j71 + j75;
                            long j78 = j71 + j76;
                            long j79 = j72 + j75;
                            long j80 = j72 + j76;
                            long j81 = j69;
                            float b23 = dVar3.b(j79 - 1);
                            float b24 = dVar3.b(j79);
                            float b25 = dVar3.b(j80 - 1);
                            float b26 = dVar3.b(j80);
                            dVar.c(AbstractC0044t0.s(b23, b25, dVar, j77 - 1, b24, b26), j77);
                            dVar.c(AbstractC0044t0.D(b24, b26, dVar, j78 - 1, b25, b23), j78);
                            j73++;
                            j69 = j81;
                            j67 = j67;
                            j68 = j68;
                        }
                    }
                    j67++;
                }
            }
        } else {
            f10 = b10;
            f6 = g10;
            r.a(j14, j13, j12, dVar2, dVar);
        }
        for (long j82 = 1; j82 < j18; j82++) {
            long j83 = j82 * j11 * j6;
            long j84 = (j10 - j82) * j11 * j6;
            long j85 = 0;
            while (j85 < j11) {
                long j86 = j85 * j6;
                long j87 = j86 + j83;
                long j88 = j86 + j84;
                long j89 = j84;
                float b27 = dVar3.b(j14 + j87);
                float b28 = dVar3.b(j14 + j88);
                dVar.c(b27 + b28, j13 + j87);
                dVar.c(b28 - b27, j13 + j88);
                j85++;
                j84 = j89;
            }
        }
        long j90 = (j10 - 1) * j12;
        float f12 = 1.0f;
        float f13 = 0.0f;
        long j91 = 1;
        while (j91 < j18) {
            float f14 = (f10 * f12) - (f6 * f13);
            f13 = (f6 * f12) + (f10 * f13);
            long j92 = j91 * j12;
            long j93 = (j10 - j91) * j12;
            long j94 = 0;
            while (j94 < j12) {
                long j95 = j14 + j94;
                long j96 = j91;
                long j97 = j13 + j94;
                dVar3.c((dVar.b(j97 + j12) * f14) + dVar.b(j97), j95 + j92);
                dVar3.c(dVar.b(j97 + j90) * f13, j95 + j93);
                j94++;
                j91 = j96;
                j92 = j92;
            }
            long j98 = j91;
            long j99 = j92;
            float f15 = f13;
            float f16 = f14;
            long j100 = 2;
            while (j100 < j18) {
                float f17 = (f14 * f16) - (f13 * f15);
                f15 = (f15 * f14) + (f16 * f13);
                long j101 = j100 * j12;
                long j102 = (j10 - j100) * j12;
                long j103 = 0;
                while (j103 < j12) {
                    long j104 = j14 + j103;
                    long j105 = j13 + j103;
                    long j106 = j90;
                    long j107 = j104 + j99;
                    dVar3.c((dVar.b(j105 + j101) * f17) + dVar3.b(j107), j107);
                    long j108 = j104 + j93;
                    dVar3.c((dVar.b(j105 + j102) * f15) + dVar3.b(j108), j108);
                    j103++;
                    f13 = f13;
                    j90 = j106;
                    j100 = j100;
                }
                j100++;
                f16 = f17;
            }
            j91 = j98 + 1;
            f12 = f14;
            j90 = j90;
        }
        for (long j109 = 1; j109 < j18; j109++) {
            long j110 = j109 * j12;
            for (long j111 = 0; j111 < j12; j111++) {
                long j112 = j14 + j111;
                dVar3.c(dVar.b(j13 + j111 + j110) + dVar3.b(j112), j112);
            }
        }
        if (j6 >= j11) {
            for (long j113 = 0; j113 < j11; j113++) {
                long j114 = j113 * j6;
                long j115 = j114 * j10;
                for (long j116 = 0; j116 < j6; j116++) {
                    dVar.c(dVar3.b(j14 + j116 + j114), j13 + j116 + j115);
                }
            }
        } else {
            for (long j117 = 0; j117 < j6; j117++) {
                for (long j118 = 0; j118 < j11; j118++) {
                    long j119 = j118 * j6;
                    dVar.c(dVar3.b(j14 + j117 + j119), (j119 * j10) + j13 + j117);
                }
            }
        }
        long j120 = j10 * j6;
        for (long j121 = 1; j121 < j18; j121++) {
            long j122 = j121 * j11 * j6;
            long j123 = (j10 - j121) * j11 * j6;
            long j124 = j121 * 2 * j6;
            long j125 = 0;
            while (j125 < j11) {
                long j126 = j125 * j6;
                long j127 = j125 * j120;
                dVar.c(dVar3.b(j14 + j126 + j122), ((((j13 + j6) - 1) + j124) - j6) + j127);
                dVar.c(dVar3.b(j14 + j126 + j123), j13 + j124 + j127);
                j125++;
                j123 = j123;
                j122 = j122;
            }
        }
        if (i11 == 0) {
            return;
        }
        if (j19 >= j11) {
            long j128 = 1;
            while (j128 < j18) {
                long j129 = j128 * j11 * j6;
                long j130 = (j10 - j128) * j11 * j6;
                long j131 = j128 * 2 * j6;
                long j132 = 0;
                while (j132 < j11) {
                    long j133 = j132 * j120;
                    long j134 = j132 * j6;
                    long j135 = 2;
                    while (j135 < j6) {
                        long j136 = j13 + j135 + j131 + j133;
                        long j137 = (((j13 + (j6 - j135)) + j131) - j6) + j133;
                        long j138 = j14 + j135 + j134;
                        long j139 = j138 + j129;
                        long j140 = j138 + j130;
                        long j141 = j129;
                        float b29 = dVar3.b(j139 - 1);
                        float b30 = dVar3.b(j139);
                        float b31 = dVar3.b(j140 - 1);
                        float b32 = dVar3.b(j140);
                        dVar.c(b29 + b31, j136 - 1);
                        dVar.c(AbstractC0044t0.F(b29, b31, dVar, j137 - 1, b30, b32), j136);
                        dVar.c(b32 - b30, j137);
                        j135 += 2;
                        j129 = j141;
                        dVar3 = dVar2;
                        j120 = j120;
                    }
                    j132++;
                    dVar3 = dVar2;
                }
                j128++;
                dVar3 = dVar2;
            }
            return;
        }
        long j142 = j120;
        long j143 = 1;
        while (j143 < j18) {
            long j144 = j143 * j11 * j6;
            long j145 = (j10 - j143) * j11 * j6;
            long j146 = j143 * 2 * j6;
            long j147 = 2;
            while (j147 < j6) {
                long j148 = j13 + j147;
                long j149 = j13 + (j6 - j147);
                long j150 = j14 + j147;
                long j151 = 0;
                while (j151 < j11) {
                    long j152 = j142;
                    long j153 = j151 * j152;
                    long j154 = j148 + j146 + j153;
                    long j155 = ((j149 + j146) - j6) + j153;
                    long j156 = j150 + (j151 * j6);
                    long j157 = j156 + j144;
                    long j158 = j156 + j145;
                    long j159 = j145;
                    float b33 = dVar2.b(j157 - 1);
                    float b34 = dVar2.b(j157);
                    float b35 = dVar2.b(j158 - 1);
                    float b36 = dVar2.b(j158);
                    dVar.c(b33 + b35, j154 - 1);
                    dVar.c(AbstractC0044t0.F(b33, b35, dVar, j155 - 1, b34, b36), j154);
                    dVar.c(b36 - b34, j155);
                    j151++;
                    j145 = j159;
                    j144 = j144;
                    j142 = j152;
                    j143 = j143;
                }
                j147 += 2;
                j142 = j142;
            }
            j143++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07b8  */
    /* JADX WARN: Type inference failed for: r14v1, types: [Ji.d, Ji.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i10, float[] fArr) {
        int i11;
        int i12;
        int i13;
        float[] fArr2;
        int i14;
        float[] fArr3;
        float[] fArr4;
        int i15;
        int i16;
        long j6;
        long j10;
        long j11;
        long j12;
        long j13;
        Ji.d dVar;
        long j14;
        long j15;
        long j16;
        long j17;
        Ji.d dVar2;
        long j18;
        Ji.d dVar3;
        Ji.d dVar4;
        d dVar5;
        Ji.d dVar6;
        int i17;
        long j19;
        long j20;
        int i18 = this.f1012u;
        boolean z10 = this.f1013v;
        if (z10) {
            ?? gVar = new g();
            gVar.f9300Y = q.f9306Z;
            gVar.f9302h0 = 4L;
            gVar.f9301Z = fArr.length;
            gVar.f9292k0 = fArr;
            long j21 = i10;
            if (!z10) {
                if (j21 < 2147483647L) {
                    k((int) j21, fArr);
                } else {
                    throw new IllegalArgumentException("The data array is too big.");
                }
            } else {
                long j22 = this.f993b;
                int i19 = (j22 > 1L ? 1 : (j22 == 1L ? 0 : -1));
                if (i19 != 0) {
                    int f6 = AbstractC6708l.f(i18);
                    if (f6 != 0) {
                        if (f6 != 1) {
                            if (f6 == 2) {
                                long j23 = this.f995d;
                                long j24 = j23 * 2;
                                Ji.d dVar7 = new Ji.d(j24, true);
                                int i20 = Ji.c.f9290c;
                                Ji.d dVar8 = this.f1009r;
                                if (i20 > 1 && j22 > 8192) {
                                    if (i20 >= 4 && j22 > 65536) {
                                        i17 = 4;
                                    } else {
                                        i17 = 2;
                                    }
                                    Future[] futureArr = new Future[i17];
                                    long j25 = i17;
                                    long j26 = j22 / j25;
                                    int i21 = 0;
                                    while (i21 < i17) {
                                        long j27 = i21 * j26;
                                        if (i21 == i17 - 1) {
                                            j20 = j22;
                                        } else {
                                            j20 = j27 + j26;
                                        }
                                        Future[] futureArr2 = futureArr;
                                        long j28 = j21;
                                        Ji.d dVar9 = dVar7;
                                        futureArr2[i21] = Ji.c.c(new b(this, j27, j20, j28, dVar9, gVar));
                                        i21++;
                                        futureArr = futureArr2;
                                        dVar7 = dVar9;
                                        j23 = j23;
                                        j25 = j25;
                                        j21 = j28;
                                    }
                                    Future[] futureArr3 = futureArr;
                                    j18 = j21;
                                    Ji.d dVar10 = dVar7;
                                    long j29 = j23;
                                    long j30 = j25;
                                    try {
                                        Ji.c.d(futureArr3);
                                    } catch (InterruptedException e10) {
                                        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
                                    } catch (ExecutionException e11) {
                                        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e11);
                                    }
                                    dVar5 = this;
                                    Bi.c.Z(j24, dVar10, dVar5.f997f, dVar5.f1001j, dVar5.f999h);
                                    long j31 = j29 / j30;
                                    for (int i22 = 0; i22 < i17; i22++) {
                                        long j32 = i22 * j31;
                                        if (i22 == i17 - 1) {
                                            j19 = j29;
                                        } else {
                                            j19 = j32 + j31;
                                        }
                                        futureArr3[i22] = Ji.c.c(new c(this, j32, j19, dVar10));
                                    }
                                    try {
                                        Ji.c.d(futureArr3);
                                    } catch (InterruptedException e12) {
                                        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e12);
                                    } catch (ExecutionException e13) {
                                        Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e13);
                                    }
                                    dVar6 = dVar8;
                                    dVar4 = dVar10;
                                    dVar3 = gVar;
                                } else {
                                    j18 = j21;
                                    dVar5 = this;
                                    for (long j33 = 0; j33 < j22; j33++) {
                                        long j34 = j33 * 2;
                                        long j35 = j34 + 1;
                                        long j36 = j18 + j33;
                                        dVar7.c(dVar8.b(j34) * gVar.b(j36), j34);
                                        dVar7.c(dVar8.b(j35) * (-gVar.b(j36)), j35);
                                    }
                                    dVar6 = dVar8;
                                    dVar4 = dVar7;
                                    dVar3 = gVar;
                                    Bi.c.Z(j24, dVar4, dVar5.f997f, dVar5.f1001j, dVar5.f999h);
                                    for (long j37 = 0; j37 < j23; j37++) {
                                        long j38 = j37 * 2;
                                        long j39 = j38 + 1;
                                        float b10 = dVar4.b(j38);
                                        Ji.d dVar11 = dVar5.f1011t;
                                        float b11 = (dVar11.b(j38) * dVar4.b(j39)) + (dVar11.b(j39) * b10);
                                        dVar4.c((dVar11.b(j38) * dVar4.b(j38)) - (dVar11.b(j39) * dVar4.b(j39)), j38);
                                        dVar4.c(b11, j39);
                                    }
                                }
                                Bi.c.j0(j24, dVar4, 0L, dVar5.f997f, dVar5.f1001j, dVar5.f999h);
                                if (j22 % 2 == 0) {
                                    long j40 = 1;
                                    long j41 = j18;
                                    dVar3.c((dVar4.b(1L) * dVar6.b(1L)) + (dVar4.b(0L) * dVar6.b(0L)), j41);
                                    long j42 = j22 + 1;
                                    dVar3.c((dVar4.b(j42) * dVar6.b(j42)) + (dVar4.b(j22) * dVar6.b(j22)), j41 + 1);
                                    for (long j43 = 1; j43 < j22 / 2; j43++) {
                                        long j44 = j43 * 2;
                                        long j45 = j44 + j40;
                                        dVar3.c((dVar4.b(j45) * dVar6.b(j45)) + (dVar4.b(j44) * dVar6.b(j44)), j41 + j44);
                                        dVar3.c((dVar4.b(j45) * dVar6.b(j44)) + (dVar4.b(j44) * (-dVar6.b(j45))), j41 + j45);
                                        j40 = 1;
                                    }
                                } else {
                                    long j46 = j18;
                                    dVar3.c((dVar4.b(1L) * dVar6.b(1L)) + (dVar4.b(0L) * dVar6.b(0L)), j46);
                                    long j47 = j22 - 1;
                                    dVar3.c((dVar4.b(j22) * dVar6.b(j47)) + (dVar4.b(j47) * (-dVar6.b(j22))), j46 + 1);
                                    long j48 = 1;
                                    while (j48 < j47 / 2) {
                                        long j49 = j48 * 2;
                                        long j50 = j47;
                                        long j51 = j49 + 1;
                                        dVar3.c((dVar4.b(j51) * dVar6.b(j51)) + (dVar4.b(j49) * dVar6.b(j49)), j46 + j49);
                                        dVar3.c((dVar4.b(j51) * dVar6.b(j49)) + (dVar4.b(j49) * (-dVar6.b(j51))), j46 + j51);
                                        j48++;
                                        j47 = j50;
                                    }
                                    long j52 = j47;
                                    dVar3.c((dVar4.b(j22) * dVar6.b(j22)) + (dVar4.b(j52) * dVar6.b(j52)), (j46 + j22) - 1);
                                }
                            }
                        } else {
                            Ji.d dVar12 = gVar;
                            if (i19 == 0) {
                                j11 = j21;
                                j12 = j22;
                                dVar = dVar12;
                                j13 = 1;
                            } else {
                                Ji.d dVar13 = new Ji.d(j22, true);
                                Long.signum(j22);
                                long j53 = j22 * 2;
                                Ji.d dVar14 = this.f1007p;
                                long b12 = dVar14.b(j53 + 1);
                                long j54 = j22;
                                long j55 = j53 - 1;
                                long j56 = 1;
                                long j57 = 1;
                                while (j57 <= b12) {
                                    int b13 = (int) dVar14.b((b12 - j57) + 2 + j53);
                                    Ji.d dVar15 = dVar12;
                                    long j58 = b13;
                                    long j59 = j54 / j58;
                                    long j60 = j22 / j54;
                                    long j61 = j60 * j59;
                                    long j62 = b12;
                                    j55 -= (b13 - 1) * j60;
                                    long j63 = 1 - j56;
                                    if (b13 != 2) {
                                        if (b13 != 3) {
                                            if (b13 != 4) {
                                                if (b13 != 5) {
                                                    if (j60 == 1) {
                                                        j63 = 1 - j63;
                                                    }
                                                    if (j63 == 0) {
                                                        dVar2 = dVar14;
                                                        j14 = j21;
                                                        j17 = 0;
                                                        j16 = 1;
                                                        j15 = j22;
                                                        j(j60, j58, j59, j61, dVar15, j14, dVar13, 0L, j55);
                                                        j56 = 1;
                                                    } else {
                                                        dVar2 = dVar14;
                                                        j14 = j21;
                                                        j16 = 1;
                                                        j15 = j22;
                                                        j17 = 0;
                                                        j(j60, j58, j59, j61, dVar13, 0L, dVar15, j14, j55);
                                                        j56 = 0;
                                                    }
                                                    j57 += j16;
                                                    j21 = j14;
                                                    dVar14 = dVar2;
                                                    j54 = j59;
                                                    b12 = j62;
                                                    dVar12 = dVar15;
                                                    j22 = j15;
                                                } else {
                                                    dVar2 = dVar14;
                                                    j14 = j21;
                                                    j16 = 1;
                                                    j15 = j22;
                                                    j17 = 0;
                                                    if (j63 == 0) {
                                                        h(j60, j59, j14, 0L, j55, dVar15, dVar13);
                                                    } else {
                                                        h(j60, j59, 0L, j14, j55, dVar13, dVar15);
                                                    }
                                                }
                                            } else {
                                                dVar2 = dVar14;
                                                j14 = j21;
                                                j16 = 1;
                                                j15 = j22;
                                                j17 = 0;
                                                if (j63 == 0) {
                                                    f(j60, j59, j14, 0L, j55, dVar15, dVar13);
                                                } else {
                                                    f(j60, j59, 0L, j14, j55, dVar13, dVar15);
                                                }
                                            }
                                        } else {
                                            dVar2 = dVar14;
                                            j14 = j21;
                                            j16 = 1;
                                            j15 = j22;
                                            j17 = 0;
                                            if (j63 == 0) {
                                                d(j60, j59, j14, 0L, j55, dVar15, dVar13);
                                            } else {
                                                d(j60, j59, 0L, j14, j55, dVar13, dVar15);
                                            }
                                        }
                                    } else {
                                        dVar2 = dVar14;
                                        j14 = j21;
                                        j16 = 1;
                                        j15 = j22;
                                        j17 = 0;
                                        if (j63 == 0) {
                                            b(j60, j59, j14, 0L, j55, dVar15, dVar13);
                                        } else {
                                            b(j60, j59, 0L, j14, j55, dVar13, dVar15);
                                        }
                                    }
                                    j56 = j63;
                                    j57 += j16;
                                    j21 = j14;
                                    dVar14 = dVar2;
                                    j54 = j59;
                                    b12 = j62;
                                    dVar12 = dVar15;
                                    j22 = j15;
                                }
                                j11 = j21;
                                j12 = j22;
                                dVar = dVar12;
                                j13 = 1;
                                if (j56 != 1) {
                                    r.a(0L, j11, this.f993b, dVar13, dVar);
                                }
                            }
                            for (long j64 = j12 - j13; j64 >= 2; j64 -= j13) {
                                long j65 = j11 + j64;
                                Ji.d dVar16 = dVar;
                                float b14 = dVar16.b(j65);
                                long j66 = j65 - j13;
                                dVar16.c(dVar16.b(j66), j65);
                                dVar16.c(b14, j66);
                            }
                        }
                    } else {
                        long j67 = j21;
                        long j68 = 0;
                        d dVar17 = this;
                        long j69 = dVar17.f993b;
                        int i23 = (j69 > 4L ? 1 : (j69 == 4L ? 0 : -1));
                        if (i23 > 0) {
                            Bi.c.j0(j69, gVar, j67, dVar17.f997f, dVar17.f1001j, dVar17.f999h);
                            long j70 = j22 >> 1;
                            long j71 = dVar17.f1003l;
                            long j72 = (j71 * 2) / j70;
                            long j73 = 2;
                            while (j73 < j70) {
                                j68 += j72;
                                long j74 = j72;
                                long j75 = dVar17.f1001j;
                                long j76 = j71;
                                Ji.d dVar18 = dVar17.f999h;
                                float b15 = 0.5f - dVar18.b((j75 + j71) - j68);
                                float b16 = dVar18.b(j75 + j68);
                                long j77 = j67 + j73;
                                long j78 = (j22 - j73) + j67;
                                float b17 = gVar.b(j77) - gVar.b(j78);
                                long j79 = j77 + 1;
                                long j80 = j67;
                                long j81 = j78 + 1;
                                float b18 = gVar.b(j81) + gVar.b(j79);
                                float f10 = (b15 * b17) - (b16 * b18);
                                float f11 = (b16 * b17) + (b15 * b18);
                                gVar.c(gVar.b(j77) - f10, j77);
                                gVar.c(f11 - gVar.b(j79), j79);
                                gVar.c(gVar.b(j78) + f10, j78);
                                gVar.c(f11 - gVar.b(j81), j81);
                                j73 += 2;
                                dVar17 = this;
                                j72 = j74;
                                j71 = j76;
                                j67 = j80;
                            }
                            j10 = j67;
                            long j82 = j10 + j70 + 1;
                            gVar.c(-gVar.b(j82), j82);
                        } else {
                            j10 = j67;
                            if (i23 == 0) {
                                j6 = j10;
                                long j83 = j6 + 2;
                                float b19 = gVar.b(j6) - gVar.b(j83);
                                long j84 = j6 + 1;
                                long j85 = 3 + j6;
                                float b20 = gVar.b(j85) + (-gVar.b(j84));
                                gVar.c(gVar.b(j83) + gVar.b(j6), j6);
                                gVar.c(gVar.b(j85) + gVar.b(j84), j84);
                                gVar.c(b19, j83);
                                gVar.c(b20, j85);
                                long j86 = j6 + 1;
                                float b21 = gVar.b(j6) - gVar.b(j86);
                                gVar.c(gVar.b(j86) + gVar.b(j6), j6);
                                gVar.c(b21, j86);
                            }
                        }
                        j6 = j10;
                        long j862 = j6 + 1;
                        float b212 = gVar.b(j6) - gVar.b(j862);
                        gVar.c(gVar.b(j862) + gVar.b(j6), j6);
                        gVar.c(b212, j862);
                    }
                }
            }
            return;
        }
        int i24 = this.f992a;
        if (i24 == 1) {
            return;
        }
        int f12 = AbstractC6708l.f(i18);
        if (f12 != 0) {
            if (f12 != 1) {
                if (f12 == 2) {
                    int i25 = this.f994c;
                    int i26 = i25 * 2;
                    float[] fArr5 = new float[i26];
                    int i27 = Ji.c.f9290c;
                    float[] fArr6 = this.f1008q;
                    if (i27 > 1) {
                        long j87 = i24;
                        if (j87 >= 8192) {
                            int i28 = 4;
                            if (i27 < 4 || j87 < 65536) {
                                i28 = 2;
                            }
                            Future[] futureArr4 = new Future[i28];
                            int i29 = i24 / i28;
                            int i30 = 0;
                            while (i30 < i28) {
                                int i31 = i30 * i29;
                                if (i30 == i28 - 1) {
                                    i16 = i24;
                                } else {
                                    i16 = i31 + i29;
                                }
                                int i32 = i30;
                                Future[] futureArr5 = futureArr4;
                                futureArr5[i32] = Ji.c.c(new a(this, i31, i16, i10, fArr5, fArr));
                                i30 = i32 + 1;
                                i28 = i28;
                                fArr5 = fArr5;
                                futureArr4 = futureArr5;
                                fArr6 = fArr6;
                            }
                            Future[] futureArr6 = futureArr4;
                            int i33 = i28;
                            fArr3 = fArr6;
                            fArr4 = fArr5;
                            try {
                                Ji.c.d(futureArr6);
                            } catch (InterruptedException e14) {
                                Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e14);
                            } catch (ExecutionException e15) {
                                Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e15);
                            }
                            Bi.c.Y(i26, fArr4, this.f996e, this.f1000i, this.f998g);
                            int i34 = i25 / i33;
                            for (int i35 = 0; i35 < i33; i35++) {
                                int i36 = i35 * i34;
                                if (i35 == i33 - 1) {
                                    i15 = i25;
                                } else {
                                    i15 = i36 + i34;
                                }
                                futureArr6[i35] = Ji.c.c(new T3.d(this, i36, i15, fArr4));
                            }
                            try {
                                Ji.c.d(futureArr6);
                            } catch (InterruptedException e16) {
                                Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e16);
                            } catch (ExecutionException e17) {
                                Logger.getLogger(d.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e17);
                            }
                            Bi.c.i0(i26, fArr4, 0, this.f996e, this.f1000i, this.f998g);
                            if (i24 % 2 != 0) {
                                fArr[i10] = (fArr3[1] * fArr4[1]) + (fArr3[0] * fArr4[0]);
                                int i37 = i24 + 1;
                                fArr[i10 + 1] = (fArr3[i37] * fArr4[i37]) + (fArr3[i24] * fArr4[i24]);
                                for (int i38 = 1; i38 < i24 / 2; i38++) {
                                    int i39 = i38 * 2;
                                    int i40 = i39 + 1;
                                    fArr[i10 + i39] = (fArr3[i40] * fArr4[i40]) + (fArr3[i39] * fArr4[i39]);
                                    fArr[i10 + i40] = (fArr3[i39] * fArr4[i40]) + ((-fArr3[i40]) * fArr4[i39]);
                                }
                                return;
                            }
                            fArr[i10] = (fArr3[1] * fArr4[1]) + (fArr3[0] * fArr4[0]);
                            int i41 = i24 - 1;
                            fArr[i10 + 1] = (fArr3[i41] * fArr4[i24]) + ((-fArr3[i24]) * fArr4[i41]);
                            for (int i42 = 1; i42 < i41 / 2; i42++) {
                                int i43 = i42 * 2;
                                int i44 = i43 + 1;
                                fArr[i10 + i43] = (fArr3[i44] * fArr4[i44]) + (fArr3[i43] * fArr4[i43]);
                                fArr[i10 + i44] = (fArr3[i43] * fArr4[i44]) + ((-fArr3[i44]) * fArr4[i43]);
                            }
                            fArr[(i10 + i24) - 1] = (fArr3[i24] * fArr4[i24]) + (fArr3[i41] * fArr4[i41]);
                            return;
                        }
                    }
                    fArr3 = fArr6;
                    fArr4 = fArr5;
                    for (int i45 = 0; i45 < i24; i45++) {
                        int i46 = i45 * 2;
                        int i47 = i46 + 1;
                        int i48 = i10 + i45;
                        fArr4[i46] = fArr[i48] * fArr3[i46];
                        fArr4[i47] = (-fArr[i48]) * fArr3[i47];
                    }
                    Bi.c.Y(i26, fArr4, this.f996e, this.f1000i, this.f998g);
                    for (int i49 = 0; i49 < i25; i49++) {
                        int i50 = i49 * 2;
                        int i51 = i50 + 1;
                        float f13 = fArr4[i50];
                        float[] fArr7 = this.f1010s;
                        float f14 = fArr7[i51];
                        float f15 = fArr4[i51];
                        float f16 = fArr7[i50];
                        fArr4[i50] = (f13 * f16) - (f15 * f14);
                        fArr4[i51] = (f15 * f16) + (f13 * f14);
                    }
                    Bi.c.i0(i26, fArr4, 0, this.f996e, this.f1000i, this.f998g);
                    if (i24 % 2 != 0) {
                    }
                }
            } else {
                int i52 = 4;
                if (i24 == 1) {
                    i11 = 1;
                } else {
                    float[] fArr8 = new float[i24];
                    int i53 = i24 * 2;
                    float[] fArr9 = this.f1006o;
                    int i54 = (int) fArr9[i53 + 1];
                    int i55 = i53 - 1;
                    int i56 = i24;
                    int i57 = 1;
                    int i58 = 1;
                    while (i58 <= i54) {
                        int i59 = (int) fArr9[(i54 - i58) + 2 + i53];
                        int i60 = i56 / i59;
                        int i61 = i24 / i56;
                        int i62 = i61 * i60;
                        int i63 = i55 - ((i59 - 1) * i61);
                        int i64 = 1 - i57;
                        if (i59 != 2) {
                            if (i59 != 3) {
                                if (i59 != i52) {
                                    if (i59 != 5) {
                                        i14 = i54;
                                        if (i61 == 1) {
                                            i64 = 1 - i64;
                                        }
                                        if (i64 == 0) {
                                            i12 = i58;
                                            i13 = i53;
                                            fArr2 = fArr9;
                                            i(i61, i59, i60, i62, fArr, i10, fArr8, 0, i63);
                                            i57 = 1;
                                        } else {
                                            i12 = i58;
                                            fArr2 = fArr9;
                                            i13 = i53;
                                            i(i61, i59, i60, i62, fArr8, 0, fArr, i10, i63);
                                            i57 = 0;
                                        }
                                        i58 = i12 + 1;
                                        i56 = i60;
                                        i55 = i63;
                                        i54 = i14;
                                        fArr9 = fArr2;
                                        i53 = i13;
                                        i52 = 4;
                                    } else {
                                        i12 = i58;
                                        i14 = i54;
                                        fArr2 = fArr9;
                                        i13 = i53;
                                        if (i64 == 0) {
                                            g(i61, i60, i10, 0, i63, fArr, fArr8);
                                        } else {
                                            g(i61, i60, 0, i10, i63, fArr8, fArr);
                                        }
                                    }
                                } else {
                                    i12 = i58;
                                    i14 = i54;
                                    fArr2 = fArr9;
                                    i13 = i53;
                                    if (i64 == 0) {
                                        e(i61, i60, i10, 0, i63, fArr, fArr8);
                                    } else {
                                        e(i61, i60, 0, i10, i63, fArr8, fArr);
                                    }
                                }
                            } else {
                                i12 = i58;
                                i14 = i54;
                                fArr2 = fArr9;
                                i13 = i53;
                                if (i64 == 0) {
                                    c(i61, i60, i10, 0, i63, fArr, fArr8);
                                } else {
                                    c(i61, i60, 0, i10, i63, fArr8, fArr);
                                }
                            }
                        } else {
                            i12 = i58;
                            i14 = i54;
                            fArr2 = fArr9;
                            i13 = i53;
                            if (i64 == 0) {
                                a(i61, i60, i10, 0, i63, fArr, fArr8);
                            } else {
                                a(i61, i60, 0, i10, i63, fArr8, fArr);
                            }
                        }
                        i57 = i64;
                        i58 = i12 + 1;
                        i56 = i60;
                        i55 = i63;
                        i54 = i14;
                        fArr9 = fArr2;
                        i53 = i13;
                        i52 = 4;
                    }
                    i11 = 1;
                    if (i57 != 1) {
                        System.arraycopy(fArr8, 0, fArr, i10, i24);
                    }
                }
                for (int i65 = i24 - i11; i65 >= 2; i65--) {
                    int i66 = i10 + i65;
                    float f17 = fArr[i66];
                    int i67 = i66 - 1;
                    fArr[i66] = fArr[i67];
                    fArr[i67] = f17;
                }
            }
        } else {
            int i68 = this.f992a;
            if (i68 > 4) {
                Bi.c.i0(i68, fArr, i10, this.f996e, this.f1000i, this.f998g);
                int i69 = i24 >> 1;
                int i70 = this.f1002k;
                int i71 = (i70 * 2) / i69;
                int i72 = 0;
                for (int i73 = 2; i73 < i69; i73 += 2) {
                    i72 += i71;
                    int i74 = this.f1000i;
                    float[] fArr10 = this.f998g;
                    float f18 = 0.5f - fArr10[(i74 + i70) - i72];
                    float f19 = fArr10[i74 + i72];
                    int i75 = i10 + i73;
                    int i76 = (i24 - i73) + i10;
                    float f20 = fArr[i75];
                    float f21 = f20 - fArr[i76];
                    int i77 = i75 + 1;
                    int i78 = i76 + 1;
                    float f22 = fArr[i77] + fArr[i78];
                    float f23 = (f18 * f21) - (f19 * f22);
                    float f24 = (f19 * f21) + (f18 * f22);
                    fArr[i75] = f20 - f23;
                    fArr[i77] = f24 - fArr[i77];
                    fArr[i76] = fArr[i76] + f23;
                    fArr[i78] = f24 - fArr[i78];
                }
                int i79 = i69 + i10 + 1;
                fArr[i79] = -fArr[i79];
            } else if (i68 == 4) {
                float f25 = fArr[i10];
                int i80 = i10 + 2;
                float f26 = fArr[i80];
                int i81 = i10 + 1;
                int i82 = i10 + 3;
                fArr[i10] = f25 + f26;
                fArr[i81] = fArr[i81] + fArr[i82];
                fArr[i80] = f25 - f26;
                fArr[i82] = (-fArr[i81]) + fArr[i82];
            }
            float f27 = fArr[i10];
            int i83 = i10 + 1;
            float f28 = fArr[i83];
            fArr[i10] = f27 + f28;
            fArr[i83] = f27 - f28;
        }
    }
}
