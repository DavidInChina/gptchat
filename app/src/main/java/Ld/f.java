package Ld;

import Ji.s;
import Pc.g;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kf.o;
import kf.q;
import kf.t;
import kf.y;
import li.AbstractC4499c;
import x8.W;
import yf.AbstractC6583a;
import zc.u;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f11052a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11053b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11054c;

    /* renamed from: d  reason: collision with root package name */
    public final g f11055d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f11056e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f11057f;

    /* renamed from: g  reason: collision with root package name */
    public float f11058g;

    public f(float f6, float f10, int i10) {
        f6 = (i10 & 2) != 0 ? 60.0f : f6;
        f10 = (i10 & 4) != 0 ? 1.0f : f10;
        this.f11052a = 4;
        this.f11053b = f6;
        this.f11054c = f10;
        this.f11055d = Bi.c.i1(Pc.b.f13932j0);
        float[] fArr = new float[4];
        for (int i11 = 0; i11 < 4; i11++) {
            fArr[i11] = 0.0f;
        }
        this.f11056e = fArr;
        int i12 = this.f11052a;
        float[] fArr2 = new float[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            fArr2[i13] = 0.0f;
        }
        this.f11057f = fArr2;
    }

    public final float[] a(float f6) {
        float sin;
        float f10 = this.f11058g;
        float f11 = 2;
        float abs = Math.abs((((f10 / f11) + ((float) Math.sin(f10))) / 1.0f) - ((float) Math.floor(0.5f + sin))) * f11;
        float[] fArr = this.f11056e;
        AbstractC3557B.c0("<this>", fArr);
        o oVar = new o(new u(18, fArr));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(oVar, 10));
        Iterator it = oVar.iterator();
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (it.hasNext()) {
            int i10 = ((y) it.next()).f37486a;
            float f15 = (3 * abs) + 1 + i10;
            int length = this.f11056e.length;
            double d10 = f15;
            ArrayList arrayList2 = arrayList;
            int floor = ((int) Math.floor(d10)) % length;
            int ceil = ((int) Math.ceil(d10)) % length;
            if (floor < 0) {
                floor += length;
            }
            if (ceil < 0) {
                ceil += length;
            }
            float f16 = f15 - ((int) f15);
            if (f15 < 0.0f) {
                int i11 = ceil;
                ceil = floor;
                floor = i11;
            }
            float[] fArr2 = this.f11056e;
            float N10 = r.f.N(fArr2[floor], fArr2[ceil], f16);
            float f17 = this.f11057f[i10];
            f14 += N10;
            f13 += f17;
            float f18 = (f6 - 60.0f) / 60.0f;
            float N11 = r.f.N((float) Math.sqrt(0.13f), 0.13f, N.o(f18, 0.0f, 1.0f));
            float f19 = this.f11054c;
            float f20 = N11 * f19;
            float N12 = r.f.N(0.13f, 0.09f, N.o(f18, 0.0f, 1.0f)) * f19;
            if (N10 <= f17) {
                f20 = N12;
            }
            arrayList = arrayList2;
            arrayList.add(Float.valueOf(r.f.N(f17, N10, f20)));
        }
        float[] I22 = t.I2(arrayList);
        float f21 = f13 - f14;
        if (f21 > 0.0f) {
            float f22 = this.f11058g;
            float f23 = 1;
            if (f13 >= 0.0f) {
                if (f13 > 1.0f) {
                    f12 = 1.0f;
                } else {
                    f12 = f13;
                }
            }
            double d11 = f23 - (f12 * 0.9f);
            this.f11058g = ((((f23 - ((float) (Math.cos(((f23 - 1.0f) * 115.0d) * d11) * Math.exp((-5.43656365691809d) * d11)))) * 10) * f21) / f6) + f22;
        }
        this.f11057f = I22;
        return I22;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0333 A[LOOP:10: B:82:0x0287->B:107:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0337 A[LOOP:4: B:49:0x019d->B:108:0x0337, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x077d A[LOOP:29: B:214:0x077b->B:215:0x077d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01d3 A[EDGE_INSN: B:250:0x01d3->B:63:0x01d3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02bd A[EDGE_INSN: B:259:0x02bd->B:96:0x02bd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Cf.g, Cf.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Ai.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float[] fArr) {
        f fVar;
        float[] fArr2;
        int i10;
        float[] fArr3;
        float f6;
        boolean z10;
        long j6;
        long j10;
        long j11;
        Ji.d dVar;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        Ji.d dVar2;
        long j17;
        long j18;
        long j19;
        float[] fArr4;
        int length;
        int i11;
        int i12;
        float[] fArr5;
        int i13;
        int i14;
        float[] fArr6;
        int i15;
        if (fArr.length == 0) {
            W.F(this.f11055d, "Received an empty buffer", null, 6);
            fArr2 = new float[240];
            for (int i16 = 0; i16 < 240; i16++) {
                fArr2[i16] = 0.08f;
            }
            fVar = this;
        } else {
            long length2 = fArr.length;
            ?? obj = new Object();
            int i17 = (length2 > 1L ? 1 : (length2 == 1L ? 0 : -1));
            if (i17 >= 0) {
                long j20 = length2 * 2;
                if (j20 > 1073741824) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                obj.f1013v = z10;
                int i18 = (int) length2;
                obj.f992a = i18;
                obj.f993b = length2;
                int[] iArr = Ai.d.f991w;
                if (!z10) {
                    if (length2 > 0 && ((length2 - 1) & length2) == 0) {
                        obj.f1012u = 1;
                        int[] iArr2 = new int[((int) AbstractC4499c.a((1 << (((int) (AbstractC4499c.d(((float) length2) + 0.5f) / AbstractC4499c.d(2.0d))) / 2)) + 2)) + 2];
                        obj.f996e = iArr2;
                        float[] fArr7 = new float[i18];
                        obj.f998g = fArr7;
                        int i19 = (i18 * 2) >> 2;
                        obj.f1000i = i19;
                        Bi.c.m1(i19, iArr2, fArr7);
                        int i20 = i18 >> 2;
                        obj.f1002k = i20;
                        Bi.c.k1(i20, i19, fArr7, iArr2);
                    } else if (Bi.c.U0(length2, iArr) >= 211) {
                        obj.f1012u = 3;
                        int i21 = i18 * 2;
                        int i22 = i21 - 1;
                        if (i22 >= 1) {
                            if (((i21 - 2) & i22) != 0) {
                                int i23 = i22 | (i22 >>> 1);
                                int i24 = i23 | (i23 >>> 2);
                                int i25 = i24 | (i24 >>> 4);
                                int i26 = i25 | (i25 >>> 8);
                                i22 = (i26 | (i26 >>> 16)) + 1;
                            }
                            obj.f994c = i22;
                            int i27 = i22 * 2;
                            float[] fArr8 = new float[i27];
                            obj.f1008q = fArr8;
                            obj.f1010s = new float[i27];
                            int[] iArr3 = new int[((int) AbstractC4499c.a((1 << (((int) (AbstractC4499c.d(i22 + 0.5f) / AbstractC4499c.d(2.0d))) / 2)) + 2)) + 2];
                            obj.f996e = iArr3;
                            float[] fArr9 = new float[i22];
                            obj.f998g = fArr9;
                            int i28 = i27 >> 2;
                            obj.f1000i = i28;
                            Bi.c.m1(i28, iArr3, fArr9);
                            int i29 = i22 >> 2;
                            obj.f1002k = i29;
                            Bi.c.k1(i29, i28, fArr9, iArr3);
                            float f10 = 3.1415927f / i18;
                            fArr8[0] = 1.0f;
                            fArr8[1] = 0.0f;
                            int i30 = 0;
                            for (int i31 = 1; i31 < i18; i31++) {
                                int i32 = i31 * 2;
                                int i33 = (i32 - 1) + i30;
                                if (i33 >= i21) {
                                    i33 -= i21;
                                }
                                i30 = i33;
                                double d10 = i30 * f10;
                                fArr8[i32] = (float) AbstractC4499c.b(d10);
                                fArr8[i32 + 1] = (float) AbstractC4499c.g(d10);
                            }
                            int i34 = obj.f994c;
                            float f11 = 1.0f / i34;
                            float[] fArr10 = obj.f1010s;
                            fArr10[0] = fArr8[0] * f11;
                            fArr10[1] = fArr8[1] * f11;
                            for (int i35 = 2; i35 < i21; i35 += 2) {
                                fArr10[i35] = fArr8[i35] * f11;
                                int i36 = i35 + 1;
                                fArr10[i36] = fArr8[i36] * f11;
                                int i37 = (i34 * 2) - i35;
                                fArr10[i37] = fArr10[i35];
                                fArr10[i37 + 1] = fArr10[i36];
                            }
                            Bi.c.Y(i34 * 2, obj.f1010s, obj.f996e, obj.f1000i, obj.f998g);
                        } else {
                            throw new IllegalArgumentException("x must be greater or equal 1");
                        }
                    } else {
                        obj.f1012u = 2;
                        int i38 = i18 * 4;
                        obj.f1004m = new float[i38 + 15];
                        int i39 = i18 * 2;
                        obj.f1006o = new float[i39 + 15];
                        if (i18 != 1) {
                            int i40 = i18;
                            int i41 = 0;
                            int i42 = 0;
                            int i43 = 0;
                            loop3: while (true) {
                                int i44 = i41 + 1;
                                if (i44 <= 4) {
                                    i42 = iArr[i41];
                                } else {
                                    i42 += 2;
                                }
                                while (true) {
                                    int i45 = i40 / i42;
                                    if (i40 - (i42 * i45) != 0) {
                                        break;
                                    }
                                    i14 = i43 + 1;
                                    fArr6 = obj.f1004m;
                                    fArr6[i43 + 2 + i38] = i42;
                                    int i46 = 2;
                                    if (i42 == 2) {
                                        if (i14 != 1) {
                                            int i47 = 2;
                                            while (i47 <= i14) {
                                                int i48 = (i14 - i47) + i46 + i38;
                                                fArr6[i48 + 1] = fArr6[i48];
                                                i47++;
                                                i46 = 2;
                                            }
                                            fArr6[i38 + 2] = 2.0f;
                                        } else {
                                            i15 = 1;
                                            if (i45 != i15) {
                                                break loop3;
                                            }
                                            i40 = i45;
                                            i43 = i14;
                                        }
                                    }
                                    i15 = 1;
                                    if (i45 != i15) {
                                    }
                                }
                                i41 = i44;
                            }
                            float f12 = i18;
                            fArr6[i38] = f12;
                            fArr6[i38 + 1] = i14;
                            float f13 = 6.2831855f / f12;
                            int i49 = 1;
                            int i50 = 1;
                            int i51 = 1;
                            while (i49 <= i14) {
                                int i52 = i49 + 1;
                                int i53 = (int) fArr6[i52 + i38];
                                int i54 = i50 * i53;
                                int i55 = i18 / i54;
                                int i56 = i55 + i55 + 2;
                                int i57 = i53 - 1;
                                int i58 = 1;
                                int i59 = 0;
                                while (i58 <= i57) {
                                    float f14 = 1.0f;
                                    fArr6[(i51 - 1) + i39] = 1.0f;
                                    int i60 = i51 + i39;
                                    fArr6[i60] = 0.0f;
                                    int i61 = i14;
                                    int i62 = i59 + i50;
                                    int i63 = i50;
                                    float f15 = i62 * f13;
                                    float f16 = f13;
                                    int i64 = 4;
                                    float f17 = 0.0f;
                                    while (i64 <= i56) {
                                        int i65 = i51 + 2;
                                        f17 += f14;
                                        int i66 = i65 + i39;
                                        float f18 = f15;
                                        double d11 = f17 * f15;
                                        fArr6[i66 - 1] = (float) AbstractC4499c.b(d11);
                                        fArr6[i66] = (float) AbstractC4499c.g(d11);
                                        i64 += 2;
                                        i62 = i62;
                                        f15 = f18;
                                        i57 = i57;
                                        i51 = i65;
                                        f14 = 1.0f;
                                    }
                                    int i67 = i62;
                                    int i68 = i57;
                                    if (i53 > 5) {
                                        int i69 = i51 + i39;
                                        fArr6[i60 - 1] = fArr6[i69 - 1];
                                        fArr6[i60] = fArr6[i69];
                                    }
                                    i58++;
                                    i50 = i63;
                                    i59 = i67;
                                    i14 = i61;
                                    f13 = f16;
                                    i57 = i68;
                                }
                                i50 = i54;
                                i49 = i52;
                            }
                        }
                        int i70 = obj.f992a;
                        if (i70 != 1) {
                            int i71 = i70 * 2;
                            int i72 = i70;
                            int i73 = 0;
                            int i74 = 0;
                            int i75 = 0;
                            loop9: while (true) {
                                int i76 = i73 + 1;
                                if (i76 <= 4) {
                                    i74 = iArr[i73];
                                } else {
                                    i74 += 2;
                                }
                                while (true) {
                                    int i77 = i72 / i74;
                                    if (i72 - (i74 * i77) != 0) {
                                        break;
                                    }
                                    i12 = i75 + 1;
                                    fArr5 = obj.f1006o;
                                    fArr5[i75 + 2 + i71] = i74;
                                    int i78 = 2;
                                    if (i74 == 2) {
                                        if (i12 != 1) {
                                            int i79 = 2;
                                            while (i79 <= i12) {
                                                int i80 = (i12 - i79) + i78 + i71;
                                                fArr5[i80 + 1] = fArr5[i80];
                                                i79++;
                                                i78 = 2;
                                            }
                                            fArr5[i71 + 2] = 2.0f;
                                        } else {
                                            i13 = 1;
                                            if (i77 != i13) {
                                                break loop9;
                                            }
                                            i75 = i12;
                                            i72 = i77;
                                        }
                                    }
                                    i13 = 1;
                                    if (i77 != i13) {
                                    }
                                }
                                i73 = i76;
                            }
                            float f19 = i70;
                            fArr5[i71] = f19;
                            fArr5[i71 + 1] = i12;
                            float f20 = 6.2831855f / f19;
                            if (i75 != 0) {
                                int i81 = 0;
                                int i82 = 1;
                                int i83 = 1;
                                while (i82 <= i75) {
                                    i82++;
                                    int i84 = (int) fArr5[i82 + i71];
                                    int i85 = i83 * i84;
                                    int i86 = i70 / i85;
                                    int i87 = i84 - 1;
                                    int i88 = 0;
                                    int i89 = 1;
                                    while (i89 <= i87) {
                                        i88 += i83;
                                        float f21 = i88 * f20;
                                        int i90 = i81;
                                        int i91 = i82;
                                        int i92 = 3;
                                        float f22 = 0.0f;
                                        while (i92 <= i86) {
                                            i90 += 2;
                                            f22 += 1.0f;
                                            int i93 = i90 + i70;
                                            int i94 = i70;
                                            double d12 = f22 * f21;
                                            fArr5[i93 - 2] = (float) AbstractC4499c.b(d12);
                                            fArr5[i93 - 1] = (float) AbstractC4499c.g(d12);
                                            i92 += 2;
                                            i71 = i71;
                                            i70 = i94;
                                            i75 = i75;
                                            i83 = i83;
                                        }
                                        i81 += i86;
                                        i89++;
                                        i82 = i91;
                                    }
                                    i83 = i85;
                                }
                            }
                        }
                    }
                } else if (length2 > 0 && (length2 & (length2 - 1)) == 0) {
                    obj.f1012u = 1;
                    s sVar = new s(((long) AbstractC4499c.a((1 << ((int) (((long) (AbstractC4499c.d(((float) length2) + 0.5f) / AbstractC4499c.d(2.0d))) / 2))) + 2)) + 2, true);
                    obj.f997f = sVar;
                    Ji.d dVar3 = new Ji.d(length2, true);
                    obj.f999h = dVar3;
                    long j21 = j20 >> 2;
                    obj.f1001j = j21;
                    Bi.c.n1(j21, sVar, dVar3);
                    long j22 = length2 >> 2;
                    obj.f1003l = j22;
                    Bi.c.l1(j22, j21, dVar3, sVar);
                } else {
                    if (Bi.c.U0(length2, iArr) >= 211) {
                        obj.f1012u = 3;
                        long j23 = j20 - 1;
                        if (j23 >= 1) {
                            if ((j23 & (j20 - 2)) != 0) {
                                long j24 = j23 | (j23 >>> 1);
                                long j25 = j24 | (j24 >>> 2);
                                long j26 = j25 | (j25 >>> 4);
                                long j27 = j26 | (j26 >>> 8);
                                long j28 = j27 | (j27 >>> 16);
                                j23 = (j28 | (j28 >>> 32)) + 1;
                            }
                            long j29 = j23;
                            obj.f995d = j29;
                            long j30 = j29 * 2;
                            Ji.d dVar4 = new Ji.d(j30, true);
                            obj.f1009r = dVar4;
                            obj.f1011t = new Ji.d(j30, true);
                            s sVar2 = new s(((long) AbstractC4499c.a((1 << ((int) (((long) (AbstractC4499c.d(((float) j29) + 0.5f) / AbstractC4499c.d(2.0d))) / 2))) + 2)) + 2, true);
                            obj.f997f = sVar2;
                            Ji.d dVar5 = new Ji.d(j29, true);
                            obj.f999h = dVar5;
                            long j31 = j30 >> 2;
                            obj.f1001j = j31;
                            Bi.c.n1(j31, sVar2, dVar5);
                            long j32 = j29 >> 2;
                            obj.f1003l = j32;
                            Bi.c.l1(j32, j31, dVar5, sVar2);
                            float f23 = 3.1415927f / ((float) length2);
                            dVar4.c(1.0f, 0L);
                            dVar4.c(0.0f, 1L);
                            int i95 = 1;
                            long j33 = 0;
                            while (i95 < length2) {
                                int i96 = i95 * 2;
                                long j34 = j33 + (i96 - 1);
                                if (j34 >= j20) {
                                    j34 -= j20;
                                }
                                double d13 = ((float) j34) * f23;
                                dVar4.c((float) AbstractC4499c.b(d13), i96);
                                dVar4.c((float) AbstractC4499c.g(d13), i96 + 1);
                                i95++;
                                j33 = j34;
                            }
                            long j35 = obj.f995d;
                            float f24 = 1.0f / ((float) j35);
                            Ji.d dVar6 = obj.f1011t;
                            dVar6.c(dVar4.b(0L) * f24, 0L);
                            dVar6.c(dVar4.b(1L) * f24, 1L);
                            int i97 = 2;
                            while (true) {
                                long j36 = i97;
                                if (j36 >= j20) {
                                    break;
                                }
                                dVar6.c(dVar4.b(j36) * f24, j36);
                                long j37 = i97 + 1;
                                dVar6.c(dVar4.b(j37) * f24, j37);
                                long j38 = (j35 * 2) - j36;
                                dVar6.c(dVar6.b(j36), j38);
                                dVar6.c(dVar6.b(j37), j38 + 1);
                                i97 += 2;
                                dVar4 = dVar4;
                            }
                            Bi.c.Z(j35 * 2, obj.f1011t, obj.f997f, obj.f1001j, obj.f999h);
                        } else {
                            throw new IllegalArgumentException("x must be greater or equal 1");
                        }
                    } else {
                        obj.f1012u = 2;
                        long j39 = length2 * 4;
                        obj.f1005n = new Ji.d(j39 + 15, true);
                        obj.f1007p = new Ji.d(15 + j20, true);
                        if (i17 == 0) {
                            j6 = 1;
                        } else {
                            long j40 = length2;
                            long j41 = 0;
                            long j42 = 0;
                            long j43 = 0;
                            loop17: while (true) {
                                long j44 = j41 + 1;
                                if (j44 <= 4) {
                                    j42 = iArr[(int) j41];
                                    j14 = 2;
                                } else {
                                    j14 = 2;
                                    j42 += 2;
                                }
                                while (true) {
                                    long j45 = j40 / j42;
                                    if (j40 - (j42 * j45) != 0) {
                                        break;
                                    }
                                    j15 = j20;
                                    j16 = 1;
                                    long j46 = j43 + 1;
                                    dVar2 = obj.f1005n;
                                    dVar2.c((float) j42, j43 + j14 + j39);
                                    if (j42 == j14 && j46 != 1) {
                                        long j47 = j14;
                                        while (j47 <= j46) {
                                            long j48 = j42;
                                            long j49 = (j46 - j47) + j14 + j39;
                                            dVar2.c(dVar2.b(j49), j49 + 1);
                                            j47++;
                                            j46 = j46;
                                            j42 = j48;
                                        }
                                        j17 = j42;
                                        j18 = j46;
                                        dVar2.c(2.0f, j39 + j14);
                                    } else {
                                        j17 = j42;
                                        j18 = j46;
                                    }
                                    if (j45 == 1) {
                                        break loop17;
                                    }
                                    j14 = 2;
                                    j20 = j15;
                                    length2 = length2;
                                    j43 = j18;
                                    j42 = j17;
                                    j40 = j45;
                                }
                                j41 = j44;
                            }
                            float f25 = (float) length2;
                            dVar2.c(f25, j39);
                            long j50 = j18;
                            dVar2.c((float) j50, j39 + 1);
                            float f26 = 6.2831855f / f25;
                            long j51 = 1;
                            long j52 = 1;
                            long j53 = 1;
                            while (j51 <= j50) {
                                j51 += j16;
                                long j54 = j50;
                                long b10 = dVar2.b(j51 + j39);
                                long j55 = j52 * b10;
                                long j56 = length2 / j55;
                                long j57 = j56 + j56 + 2;
                                long j58 = b10 - j16;
                                long j59 = j16;
                                long j60 = j53;
                                long j61 = 0;
                                while (j59 <= j58) {
                                    long j62 = j51;
                                    float f27 = 1.0f;
                                    dVar2.c(1.0f, (j60 - j16) + j15);
                                    long j63 = j60 + j15;
                                    dVar2.c(0.0f, j63);
                                    long j64 = length2;
                                    long j65 = j61 + j52;
                                    float f28 = ((float) j65) * f26;
                                    float f29 = 0.0f;
                                    long j66 = 4;
                                    while (j66 <= j57) {
                                        j60 += 2;
                                        float f30 = f29 + f27;
                                        long j67 = j65;
                                        long j68 = j60 + j15;
                                        float f31 = f26;
                                        double d14 = f30 * f28;
                                        dVar2.c((float) AbstractC4499c.b(d14), j68 - 1);
                                        dVar2.c((float) AbstractC4499c.g(d14), j68);
                                        j66 += 2;
                                        f28 = f28;
                                        f29 = f30;
                                        f26 = f31;
                                        j65 = j67;
                                        j39 = j39;
                                        j52 = j52;
                                        f27 = 1.0f;
                                    }
                                    float f32 = f26;
                                    long j69 = j65;
                                    long j70 = j39;
                                    long j71 = j52;
                                    if (b10 > 5) {
                                        long j72 = j60 + j15;
                                        j19 = 1;
                                        dVar2.c(dVar2.b(j72 - 1), j63 - 1);
                                        dVar2.c(dVar2.b(j72), j63);
                                    } else {
                                        j19 = 1;
                                    }
                                    j59 += j19;
                                    j16 = j19;
                                    length2 = j64;
                                    f26 = f32;
                                    j51 = j62;
                                    j61 = j69;
                                    j39 = j70;
                                    j52 = j71;
                                }
                                j50 = j54;
                                j52 = j55;
                                j53 = j60;
                            }
                            j6 = j16;
                        }
                        long j73 = obj.f993b;
                        if (j73 != j6) {
                            long j74 = 2;
                            long j75 = j73 * 2;
                            long j76 = j73;
                            long j77 = 0;
                            long j78 = 0;
                            long j79 = 0;
                            loop23: while (true) {
                                long j80 = j77 + j6;
                                if (j80 <= 4) {
                                    j78 = iArr[(int) j77];
                                } else {
                                    j78 += j74;
                                }
                                while (true) {
                                    long j81 = j76 / j78;
                                    if (j76 - (j78 * j81) != 0) {
                                        break;
                                    }
                                    j10 = 1;
                                    long j82 = j79 + 1;
                                    long j83 = j79 + j74 + j75;
                                    int[] iArr4 = iArr;
                                    j11 = j79;
                                    dVar = obj.f1007p;
                                    dVar.c((float) j78, j83);
                                    if (j78 == j74 && j82 != 1) {
                                        long j84 = j74;
                                        while (j84 <= j82) {
                                            long j85 = j78;
                                            long j86 = (j82 - j84) + j74 + j75;
                                            dVar.c(dVar.b(j86), j86 + 1);
                                            j84++;
                                            j82 = j82;
                                            j78 = j85;
                                        }
                                        j12 = j78;
                                        j13 = j82;
                                        dVar.c(2.0f, j75 + j74);
                                    } else {
                                        j12 = j78;
                                        j13 = j82;
                                    }
                                    if (j81 == 1) {
                                        break loop23;
                                    }
                                    j74 = 2;
                                    j79 = j13;
                                    iArr = iArr4;
                                    j78 = j12;
                                    j76 = j81;
                                }
                                j77 = j80;
                                j6 = 1;
                            }
                            float f33 = (float) j73;
                            dVar.c(f33, j75);
                            dVar.c((float) j13, j75 + 1);
                            float f34 = 6.2831855f / f33;
                            if (j11 != 0) {
                                long j87 = 0;
                                long j88 = 1;
                                long j89 = 1;
                                while (j89 <= j11) {
                                    j89 += j10;
                                    long b11 = dVar.b(j89 + j75);
                                    long j90 = j88 * b11;
                                    long j91 = j73 / j90;
                                    long j92 = b11 - j10;
                                    long j93 = j87;
                                    long j94 = 0;
                                    long j95 = 1;
                                    while (j95 <= j92) {
                                        j94 += j88;
                                        float f35 = ((float) j94) * f34;
                                        long j96 = 3;
                                        long j97 = j93;
                                        float f36 = 0.0f;
                                        while (j96 <= j91) {
                                            j97 += 2;
                                            f36 += 1.0f;
                                            long j98 = j94;
                                            long j99 = j97 + j73;
                                            double d15 = f36 * f35;
                                            dVar.c((float) AbstractC4499c.b(d15), j99 - 2);
                                            dVar.c((float) AbstractC4499c.g(d15), j99 - 1);
                                            j96 += 2;
                                            j94 = j98;
                                            j73 = j73;
                                            j92 = j92;
                                        }
                                        j93 += j91;
                                        j95++;
                                        j73 = j73;
                                    }
                                    j88 = j90;
                                    j87 = j93;
                                    j10 = 1;
                                }
                            }
                        }
                    }
                    fArr4 = fArr;
                    obj.k(0, fArr4);
                    length = fArr4.length / 2;
                    fArr2 = new float[length];
                    for (i11 = 0; i11 < length; i11++) {
                        int i98 = i11 * 2;
                        float f37 = fArr4[i98];
                        float f38 = fArr4[i98 + 1];
                        fArr2[i11] = (f38 * f38) + (f37 * f37);
                    }
                    fVar = this;
                }
                fArr4 = fArr;
                obj.k(0, fArr4);
                length = fArr4.length / 2;
                fArr2 = new float[length];
                while (i11 < length) {
                }
                fVar = this;
            } else {
                throw new IllegalArgumentException("n must be greater than 0");
            }
        }
        int i99 = fVar.f11052a;
        if (i99 > 0) {
            int length3 = fArr2.length / i99;
            Cf.e z02 = N.z0(new Cf.e(0, fArr2.length - 1, 1), length3);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(z02, 10));
            Cf.f it = z02.iterator();
            while (it.f3111h0) {
                int a5 = it.a();
                int i100 = a5 + length3;
                int length4 = fArr2.length;
                if (i100 > length4) {
                    i100 = length4;
                }
                Cf.g D02 = N.D0(a5, i100);
                AbstractC3557B.c0("indices", D02);
                if (D02.isEmpty()) {
                    i10 = 0;
                    fArr3 = new float[0];
                } else {
                    i10 = 0;
                    int i101 = D02.f3107Z + 1;
                    AbstractC3557B.n0(i101, fArr2.length);
                    fArr3 = Arrays.copyOfRange(fArr2, D02.f3106Y, i101);
                    AbstractC3557B.b0("copyOfRange(...)", fArr3);
                }
                Float[] fArr11 = new Float[fArr3.length];
                int length5 = fArr3.length;
                for (int i102 = i10; i102 < length5; i102++) {
                    fArr11[i102] = Float.valueOf(fArr3[i102]);
                }
                q.w3(fArr11);
                List Q22 = q.Q2(fArr11);
                int size = Q22.size() / 2;
                if (Q22.size() % 2 == 0) {
                    f6 = (((Number) Q22.get(size - 1)).floatValue() + ((Number) Q22.get(size)).floatValue()) / 2;
                } else {
                    f6 = ((Number) Q22.get(size)).floatValue();
                }
                float abs = Math.abs(f6) * fVar.f11053b;
                arrayList.add(Float.valueOf(abs / (1 + abs)));
            }
            fVar.f11056e = t.I2(arrayList);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
