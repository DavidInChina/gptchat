package t2;

import java.util.Arrays;
import p2.C5059l;
import s2.t;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f45670a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f45671b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f45672c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f45673d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? !(i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !zArr[2] || bArr[i11 - 2] != 0 || bArr[i13] != 1) : !(bArr[i11 - 3] != 0 || bArr[i11 - 2] != 0 || bArr[i13] != 1)) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr[0] = z11;
            if (i12 <= 1 ? !(!zArr[2] || bArr[i13] != 0) : !(bArr[i11 - 2] != 0 || bArr[i13] != 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
            zArr[1] = z12;
            if (bArr[i13] == 0) {
                z13 = true;
            }
            zArr[2] = z13;
            return i11;
        }
    }

    public static d c(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        t tVar = new t(bArr, i10 + 2, i11);
        int i25 = 4;
        tVar.s(4);
        int i26 = tVar.i(3);
        tVar.r();
        int i27 = tVar.i(2);
        boolean h10 = tVar.h();
        int i28 = tVar.i(5);
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i12 = 1;
            if (i30 >= 32) {
                break;
            }
            if (tVar.h()) {
                i29 |= 1 << i30;
            }
            i30++;
        }
        int i31 = 6;
        int[] iArr2 = new int[6];
        for (int i32 = 0; i32 < 6; i32++) {
            iArr2[i32] = tVar.i(8);
        }
        int i33 = tVar.i(8);
        int i34 = 0;
        for (int i35 = 0; i35 < i26; i35++) {
            if (tVar.h()) {
                i34 += 89;
            }
            if (tVar.h()) {
                i34 += 8;
            }
        }
        tVar.s(i34);
        if (i26 > 0) {
            tVar.s((8 - i26) * 2);
        }
        tVar.l();
        int l10 = tVar.l();
        if (l10 == 3) {
            tVar.r();
        }
        int l11 = tVar.l();
        int l12 = tVar.l();
        if (tVar.h()) {
            int l13 = tVar.l();
            int l14 = tVar.l();
            int l15 = tVar.l();
            int l16 = tVar.l();
            if (l10 != 1 && l10 != 2) {
                i23 = 1;
            } else {
                i23 = 2;
            }
            if (l10 == 1) {
                i24 = 2;
            } else {
                i24 = 1;
            }
            l11 -= (l13 + l14) * i23;
            l12 -= (l15 + l16) * i24;
        }
        int i36 = l12;
        int i37 = l11;
        int l17 = tVar.l();
        int l18 = tVar.l();
        int l19 = tVar.l();
        if (tVar.h()) {
            i13 = 0;
        } else {
            i13 = i26;
        }
        for (int i38 = i13; i38 <= i26; i38++) {
            tVar.l();
            tVar.l();
            tVar.l();
        }
        tVar.l();
        tVar.l();
        tVar.l();
        tVar.l();
        tVar.l();
        tVar.l();
        if (tVar.h() && tVar.h()) {
            int i39 = 0;
            while (i39 < i25) {
                int i40 = 0;
                while (i40 < i31) {
                    if (!tVar.h()) {
                        tVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i39 << 1) + 4));
                        if (i39 > 1) {
                            tVar.m();
                        }
                        for (int i41 = 0; i41 < min; i41++) {
                            tVar.m();
                        }
                    }
                    if (i39 == 3) {
                        i22 = 3;
                    } else {
                        i22 = 1;
                    }
                    i40 += i22;
                    i31 = 6;
                }
                i39++;
                i25 = 4;
                i31 = 6;
            }
        }
        tVar.s(2);
        if (tVar.h()) {
            tVar.s(8);
            tVar.l();
            tVar.l();
            tVar.r();
        }
        int l20 = tVar.l();
        int i42 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i43 = -1;
        int i44 = -1;
        int i45 = -1;
        while (i42 < l20) {
            if (i42 != 0 && tVar.h()) {
                int i46 = i45 + i44;
                int l21 = (1 - ((tVar.h() ? 1 : 0) * 2)) * (tVar.l() + 1);
                i19 = l20;
                int i47 = i46 + 1;
                i18 = i33;
                boolean[] zArr = new boolean[i47];
                iArr = iArr2;
                for (int i48 = 0; i48 <= i46; i48++) {
                    if (!tVar.h()) {
                        zArr[i48] = tVar.h();
                    } else {
                        zArr[i48] = true;
                    }
                }
                int[] iArr5 = new int[i47];
                int[] iArr6 = new int[i47];
                int i49 = 0;
                for (int i50 = i44 - 1; i50 >= 0; i50--) {
                    int i51 = iArr4[i50] + l21;
                    if (i51 < 0 && zArr[i45 + i50]) {
                        iArr5[i49] = i51;
                        i49++;
                    }
                }
                if (l21 < 0 && zArr[i46]) {
                    iArr5[i49] = l21;
                    i49++;
                }
                i17 = i29;
                int i52 = i49;
                i16 = i28;
                for (int i53 = 0; i53 < i45; i53++) {
                    int i54 = iArr3[i53] + l21;
                    if (i54 < 0 && zArr[i53]) {
                        iArr5[i52] = i54;
                        i52++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i52);
                int i55 = 0;
                for (int i56 = i45 - 1; i56 >= 0; i56--) {
                    int i57 = iArr3[i56] + l21;
                    if (i57 > 0 && zArr[i56]) {
                        iArr6[i55] = i57;
                        i55++;
                    }
                }
                if (l21 > 0 && zArr[i46]) {
                    iArr6[i55] = l21;
                    i55++;
                }
                int i58 = i55;
                for (int i59 = 0; i59 < i44; i59++) {
                    int i60 = iArr4[i59] + l21;
                    if (i60 > 0 && zArr[i45 + i59]) {
                        iArr6[i58] = i60;
                        i58++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i58);
                i45 = i52;
                i44 = i58;
                i12 = 1;
                iArr3 = copyOf;
            } else {
                i19 = l20;
                i16 = i28;
                i17 = i29;
                iArr = iArr2;
                i18 = i33;
                int l22 = tVar.l();
                int l23 = tVar.l();
                int[] iArr7 = new int[l22];
                for (int i61 = 0; i61 < l22; i61++) {
                    if (i61 > 0) {
                        i21 = iArr7[i61 - 1];
                    } else {
                        i21 = 0;
                    }
                    iArr7[i61] = i21 - (tVar.l() + 1);
                    tVar.r();
                }
                int[] iArr8 = new int[l23];
                for (int i62 = 0; i62 < l23; i62++) {
                    if (i62 > 0) {
                        i20 = iArr8[i62 - 1];
                    } else {
                        i20 = 0;
                    }
                    iArr8[i62] = tVar.l() + 1 + i20;
                    tVar.r();
                }
                i12 = 1;
                iArr3 = iArr7;
                iArr4 = iArr8;
                i45 = l22;
                i44 = l23;
            }
            i42++;
            l20 = i19;
            i33 = i18;
            iArr2 = iArr;
            i29 = i17;
            i28 = i16;
        }
        int i63 = i28;
        int i64 = i29;
        int[] iArr9 = iArr2;
        int i65 = i33;
        if (tVar.h()) {
            int l24 = tVar.l();
            for (int i66 = 0; i66 < l24; i66++) {
                tVar.s(l19 + 5);
            }
        }
        int i67 = 2;
        tVar.s(2);
        float f6 = 1.0f;
        if (tVar.h()) {
            if (tVar.h()) {
                int i68 = tVar.i(8);
                if (i68 == 255) {
                    int i69 = tVar.i(16);
                    int i70 = tVar.i(16);
                    if (i69 != 0 && i70 != 0) {
                        f6 = i69 / i70;
                    }
                } else if (i68 < 17) {
                    f6 = f45671b[i68];
                } else {
                    android.gov.nist.core.a.v("Unexpected aspect_ratio_idc value: ", i68, "NalUnitUtil");
                }
            }
            if (tVar.h()) {
                tVar.r();
            }
            if (tVar.h()) {
                tVar.s(3);
                if (tVar.h()) {
                    i67 = i12;
                }
                if (tVar.h()) {
                    int i71 = tVar.i(8);
                    int i72 = tVar.i(8);
                    tVar.s(8);
                    i43 = C5059l.c(i71);
                    i15 = C5059l.d(i72);
                } else {
                    i15 = -1;
                }
            } else {
                i67 = -1;
                i15 = -1;
            }
            if (tVar.h()) {
                tVar.l();
                tVar.l();
            }
            tVar.r();
            if (tVar.h()) {
                i36 *= 2;
            }
            i14 = i36;
        } else {
            i14 = i36;
            i67 = -1;
            i15 = -1;
        }
        return new d(i27, h10, i63, i64, l17, l18, iArr9, i65, i37, i14, f6, i43, i67, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f d(byte[] bArr, int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        int i16;
        boolean h10;
        int i17;
        float f6;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z12;
        int i24;
        int i25;
        t tVar = new t(bArr, i10 + 1, i11);
        int i26 = 8;
        int i27 = tVar.i(8);
        int i28 = tVar.i(8);
        int i29 = tVar.i(8);
        int l10 = tVar.l();
        if (i27 != 100 && i27 != 110 && i27 != 122 && i27 != 244 && i27 != 44 && i27 != 83 && i27 != 86 && i27 != 118 && i27 != 128 && i27 != 138) {
            i14 = 1;
            i13 = 0;
            i12 = 0;
            z10 = false;
        } else {
            i14 = tVar.l();
            if (i14 == 3) {
                z12 = tVar.h();
            } else {
                z12 = false;
            }
            int l11 = tVar.l();
            int l12 = tVar.l();
            tVar.r();
            if (tVar.h()) {
                if (i14 != 3) {
                    i24 = 8;
                } else {
                    i24 = 12;
                }
                int i30 = 0;
                while (i30 < i24) {
                    if (tVar.h()) {
                        if (i30 < 6) {
                            i25 = 16;
                        } else {
                            i25 = 64;
                        }
                        int i31 = i26;
                        int i32 = i31;
                        for (int i33 = 0; i33 < i25; i33++) {
                            if (i31 != 0) {
                                i31 = ((tVar.m() + i32) + 256) % 256;
                            }
                            if (i31 != 0) {
                                i32 = i31;
                            }
                        }
                    }
                    i30++;
                    i26 = 8;
                }
            }
            z10 = z12;
            i13 = l11;
            i12 = l12;
        }
        int l13 = tVar.l() + 4;
        int l14 = tVar.l();
        if (l14 == 0) {
            i15 = l14;
            i16 = tVar.l() + 4;
        } else if (l14 == 1) {
            boolean h11 = tVar.h();
            tVar.m();
            tVar.m();
            long l15 = tVar.l();
            i15 = l14;
            for (int i34 = 0; i34 < l15; i34++) {
                tVar.l();
            }
            z11 = h11;
            i16 = 0;
            tVar.l();
            tVar.r();
            int l16 = tVar.l() + 1;
            h10 = tVar.h();
            int i35 = 2 - (h10 ? 1 : 0);
            int l17 = (tVar.l() + 1) * i35;
            if (!h10) {
                tVar.r();
            }
            tVar.r();
            int i36 = l16 * 16;
            int i37 = l17 * 16;
            int i38 = 2;
            if (!tVar.h()) {
                int l18 = tVar.l();
                int l19 = tVar.l();
                int l20 = tVar.l();
                int l21 = tVar.l();
                if (i14 == 0) {
                    i20 = i35;
                    i19 = 1;
                } else {
                    if (i14 == 3) {
                        i22 = 1;
                        i21 = 1;
                    } else {
                        i21 = 2;
                        i22 = 1;
                    }
                    if (i14 == i22) {
                        i23 = 2;
                    } else {
                        i23 = i22;
                    }
                    i20 = i35 * i23;
                    i19 = i21;
                }
                i36 -= (l18 + l19) * i19;
                i37 -= (l20 + l21) * i20;
            }
            int i39 = i37;
            float f10 = 1.0f;
            if (tVar.h()) {
                if (tVar.h()) {
                    int i40 = tVar.i(8);
                    if (i40 == 255) {
                        int i41 = tVar.i(16);
                        int i42 = tVar.i(16);
                        if (i41 != 0 && i42 != 0) {
                            f10 = i41 / i42;
                        }
                    } else if (i40 < 17) {
                        f10 = f45671b[i40];
                    } else {
                        android.gov.nist.core.a.v("Unexpected aspect_ratio_idc value: ", i40, "NalUnitUtil");
                    }
                }
                if (tVar.h()) {
                    tVar.r();
                }
                if (tVar.h()) {
                    tVar.s(3);
                    if (tVar.h()) {
                        i38 = 1;
                    }
                    if (tVar.h()) {
                        int i43 = tVar.i(8);
                        int i44 = tVar.i(8);
                        tVar.s(8);
                        i18 = C5059l.c(i43);
                        i17 = C5059l.d(i44);
                        f6 = f10;
                        return new f(i27, i28, i29, l10, i36, i39, f6, i13, i12, z10, h10, l13, i15, i16, z11, i18, i38, i17);
                    }
                    f6 = f10;
                    i18 = -1;
                    i17 = -1;
                    return new f(i27, i28, i29, l10, i36, i39, f6, i13, i12, z10, h10, l13, i15, i16, z11, i18, i38, i17);
                }
            }
            f6 = f10;
            i18 = -1;
            i38 = -1;
            i17 = -1;
            return new f(i27, i28, i29, l10, i36, i39, f6, i13, i12, z10, h10, l13, i15, i16, z11, i18, i38, i17);
        } else {
            i15 = l14;
            i16 = 0;
        }
        z11 = false;
        tVar.l();
        tVar.r();
        int l162 = tVar.l() + 1;
        h10 = tVar.h();
        int i352 = 2 - (h10 ? 1 : 0);
        int l172 = (tVar.l() + 1) * i352;
        if (!h10) {
        }
        tVar.r();
        int i362 = l162 * 16;
        int i372 = l172 * 16;
        int i382 = 2;
        if (!tVar.h()) {
        }
        int i392 = i372;
        float f102 = 1.0f;
        if (tVar.h()) {
        }
        f6 = f102;
        i18 = -1;
        i382 = -1;
        i17 = -1;
        return new f(i27, i28, i29, l10, i362, i392, f6, i13, i12, z10, h10, l13, i15, i16, z11, i18, i382, i17);
    }

    public static int e(int i10, byte[] bArr) {
        int i11;
        synchronized (f45672c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 < i10 - 2) {
                        try {
                            if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                                break;
                            }
                            i12++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } else {
                        i12 = i10;
                        break;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f45673d;
                    if (iArr.length <= i13) {
                        f45673d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f45673d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f45673d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
