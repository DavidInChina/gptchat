package q2;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final int f43674a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43675b;

    /* renamed from: c  reason: collision with root package name */
    public final float f43676c;

    /* renamed from: d  reason: collision with root package name */
    public final float f43677d;

    /* renamed from: e  reason: collision with root package name */
    public final float f43678e;

    /* renamed from: f  reason: collision with root package name */
    public final int f43679f;

    /* renamed from: g  reason: collision with root package name */
    public final int f43680g;

    /* renamed from: h  reason: collision with root package name */
    public final int f43681h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f43682i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f43683j;

    /* renamed from: k  reason: collision with root package name */
    public int f43684k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f43685l;

    /* renamed from: m  reason: collision with root package name */
    public int f43686m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f43687n;

    /* renamed from: o  reason: collision with root package name */
    public int f43688o;

    /* renamed from: p  reason: collision with root package name */
    public int f43689p;

    /* renamed from: q  reason: collision with root package name */
    public int f43690q;

    /* renamed from: r  reason: collision with root package name */
    public int f43691r;

    /* renamed from: s  reason: collision with root package name */
    public int f43692s;

    /* renamed from: t  reason: collision with root package name */
    public int f43693t;

    /* renamed from: u  reason: collision with root package name */
    public int f43694u;

    /* renamed from: v  reason: collision with root package name */
    public int f43695v;

    public g(float f6, float f10, int i10, int i11, int i12) {
        this.f43674a = i10;
        this.f43675b = i11;
        this.f43676c = f6;
        this.f43677d = f10;
        this.f43678e = i10 / i12;
        this.f43679f = i10 / RCHTTPStatusCodes.BAD_REQUEST;
        int i13 = i10 / 65;
        this.f43680g = i13;
        int i14 = i13 * 2;
        this.f43681h = i14;
        this.f43682i = new short[i14];
        this.f43683j = new short[i14 * i11];
        this.f43685l = new short[i14 * i11];
        this.f43687n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.f43685l, this.f43686m, i11);
        this.f43685l = c10;
        int i12 = this.f43675b;
        System.arraycopy(sArr, i10 * i12, c10, this.f43686m * i12, i12 * i11);
        this.f43686m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f43681h / i11;
        int i13 = this.f43675b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f43682i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f43675b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f43675b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f43694u = i15 / i16;
        this.f43695v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22 = this.f43686m;
        float f10 = this.f43676c;
        float f11 = this.f43677d;
        float f12 = f10 / f11;
        float f13 = this.f43678e * f11;
        double d10 = f12;
        int i23 = (d10 > 1.00001d ? 1 : (d10 == 1.00001d ? 0 : -1));
        int i24 = this.f43674a;
        int i25 = this.f43675b;
        int i26 = 1;
        if (i23 <= 0 && d10 >= 0.99999d) {
            a(this.f43683j, 0, this.f43684k);
            this.f43684k = 0;
        } else {
            int i27 = this.f43684k;
            int i28 = this.f43681h;
            if (i27 >= i28) {
                int i29 = 0;
                while (true) {
                    int i30 = this.f43691r;
                    if (i30 > 0) {
                        int min = Math.min(i28, i30);
                        a(this.f43683j, i29, min);
                        this.f43691r -= min;
                        i29 += min;
                        i10 = i22;
                        f6 = f13;
                        i11 = i24;
                    } else {
                        short[] sArr = this.f43683j;
                        if (i24 > 4000) {
                            i12 = i24 / 4000;
                        } else {
                            i12 = i26;
                        }
                        int i31 = this.f43680g;
                        int i32 = this.f43679f;
                        if (i25 == i26 && i12 == i26) {
                            i13 = d(sArr, i29, i32, i31);
                            i10 = i22;
                            f6 = f13;
                            i11 = i24;
                        } else {
                            b(sArr, i29, i12);
                            i11 = i24;
                            i10 = i22;
                            short[] sArr2 = this.f43682i;
                            f6 = f13;
                            int d11 = d(sArr2, 0, i32 / i12, i31 / i12);
                            if (i12 != 1) {
                                int i33 = d11 * i12;
                                int i34 = i12 * 4;
                                int i35 = i33 - i34;
                                int i36 = i33 + i34;
                                if (i35 >= i32) {
                                    i32 = i35;
                                }
                                if (i36 <= i31) {
                                    i31 = i36;
                                }
                                if (i25 == 1) {
                                    i13 = d(sArr, i29, i32, i31);
                                } else {
                                    b(sArr, i29, 1);
                                    i13 = d(sArr2, 0, i32, i31);
                                }
                            } else {
                                i13 = d11;
                            }
                        }
                        int i37 = this.f43694u;
                        int i38 = this.f43695v;
                        if (i37 == 0 || (i14 = this.f43692s) == 0 || i38 > i37 * 3 || i37 * 2 <= this.f43693t * 3) {
                            i14 = i13;
                        }
                        this.f43693t = i37;
                        this.f43692s = i13;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f43683j;
                            if (f12 >= 2.0f) {
                                i16 = (int) (i14 / (f12 - 1.0f));
                            } else {
                                this.f43691r = (int) (((2.0f - f12) * i14) / (f12 - 1.0f));
                                i16 = i14;
                            }
                            short[] c10 = c(this.f43685l, this.f43686m, i16);
                            this.f43685l = c10;
                            int i39 = i29;
                            e(i16, this.f43675b, c10, this.f43686m, sArr3, i39, sArr3, i29 + i14);
                            this.f43686m += i16;
                            i29 = i14 + i16 + i39;
                        } else {
                            int i40 = i29;
                            short[] sArr4 = this.f43683j;
                            if (f12 < 0.5f) {
                                i15 = (int) ((i14 * f12) / (1.0f - f12));
                            } else {
                                this.f43691r = (int) ((((2.0f * f12) - 1.0f) * i14) / (1.0f - f12));
                                i15 = i14;
                            }
                            int i41 = i14 + i15;
                            short[] c11 = c(this.f43685l, this.f43686m, i41);
                            this.f43685l = c11;
                            System.arraycopy(sArr4, i40 * i25, c11, this.f43686m * i25, i14 * i25);
                            e(i15, this.f43675b, this.f43685l, this.f43686m + i14, sArr4, i40 + i14, sArr4, i40);
                            this.f43686m += i41;
                            i29 = i40 + i15;
                        }
                    }
                    if (i29 + i28 > i27) {
                        break;
                    }
                    i24 = i11;
                    i22 = i10;
                    f13 = f6;
                    i26 = 1;
                }
                int i42 = this.f43684k - i29;
                short[] sArr5 = this.f43683j;
                System.arraycopy(sArr5, i29 * i25, sArr5, 0, i42 * i25);
                this.f43684k = i42;
                if (f6 == 1.0f && this.f43686m != (i17 = i10)) {
                    int i43 = i11;
                    int i44 = (int) (i43 / f6);
                    int i45 = i43;
                    while (true) {
                        if (i44 <= 16384 && i45 <= 16384) {
                            break;
                        }
                        i44 /= 2;
                        i45 /= 2;
                    }
                    int i46 = this.f43686m - i17;
                    short[] c12 = c(this.f43687n, this.f43688o, i46);
                    this.f43687n = c12;
                    System.arraycopy(this.f43685l, i17 * i25, c12, this.f43688o * i25, i46 * i25);
                    this.f43686m = i17;
                    this.f43688o += i46;
                    int i47 = 0;
                    while (true) {
                        i18 = this.f43688o;
                        i19 = i18 - 1;
                        if (i47 >= i19) {
                            break;
                        }
                        while (true) {
                            i20 = this.f43689p + 1;
                            int i48 = i20 * i44;
                            i21 = this.f43690q;
                            if (i48 <= i21 * i45) {
                                break;
                            }
                            this.f43685l = c(this.f43685l, this.f43686m, 1);
                            for (int i49 = 0; i49 < i25; i49++) {
                                short[] sArr6 = this.f43687n;
                                int i50 = (i47 * i25) + i49;
                                short s10 = sArr6[i50];
                                short s11 = sArr6[i50 + i25];
                                int i51 = this.f43689p;
                                int i52 = i51 * i44;
                                int i53 = (i51 + 1) * i44;
                                int i54 = i53 - (this.f43690q * i45);
                                int i55 = i53 - i52;
                                this.f43685l[(this.f43686m * i25) + i49] = (short) ((((i55 - i54) * s11) + (s10 * i54)) / i55);
                            }
                            this.f43690q++;
                            this.f43686m++;
                        }
                        this.f43689p = i20;
                        if (i20 == i45) {
                            this.f43689p = 0;
                            if (i21 == i44) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            Gi.e.n(z10);
                            this.f43690q = 0;
                        }
                        i47++;
                    }
                    if (i19 != 0) {
                        short[] sArr7 = this.f43687n;
                        System.arraycopy(sArr7, i19 * i25, sArr7, 0, (i18 - i19) * i25);
                        this.f43688o -= i19;
                        return;
                    }
                    return;
                }
            }
        }
        i10 = i22;
        f6 = f13;
        i11 = i24;
        if (f6 == 1.0f) {
        }
    }
}
