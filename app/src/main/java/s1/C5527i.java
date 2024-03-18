package s1;

import android.graphics.Path;
import io.sentry.android.core.AbstractC3612c;

/* renamed from: s1.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5527i {

    /* renamed from: a  reason: collision with root package name */
    public char f45111a;

    /* renamed from: b  reason: collision with root package name */
    public float[] f45112b;

    public static void a(Path path, float f6, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d10;
        double d11;
        boolean z12;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f6;
        double d13 = f10;
        double d14 = (d13 * sin) + (d12 * cos);
        double d15 = d12;
        double d16 = f13;
        double d17 = d14 / d16;
        double d18 = f14;
        double d19 = ((d13 * cos) + ((-f6) * sin)) / d18;
        double d20 = d13;
        double d21 = f12;
        double d22 = ((d21 * sin) + (f11 * cos)) / d16;
        double d23 = ((d21 * cos) + ((-f11) * sin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            AbstractC3612c.r("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            AbstractC3612c.r("PathParser", "Points are too far apart " + d28);
            float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f6, f10, f11, f12, f13 * sqrt, f14 * sqrt, f15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d29);
        double d30 = d24 * sqrt2;
        double d31 = sqrt2 * d25;
        if (z10 == z11) {
            d11 = d26 - d31;
            d10 = d27 + d30;
        } else {
            d11 = d26 + d31;
            d10 = d27 - d30;
        }
        double atan2 = Math.atan2(d19 - d10, d17 - d11);
        double atan22 = Math.atan2(d23 - d10, d22 - d11) - atan2;
        int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i10 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            if (i10 > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d32 = d11 * d16;
        double d33 = d10 * d18;
        double d34 = (d32 * cos) - (d33 * sin);
        double d35 = (d33 * cos) + (d32 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d36 = -d16;
        double d37 = d36 * cos2;
        double d38 = d18 * sin2;
        double d39 = (d37 * sin3) - (d38 * cos3);
        double d40 = d36 * sin2;
        double d41 = d18 * cos2;
        double d42 = (cos3 * d41) + (sin3 * d40);
        double d43 = d41;
        double d44 = atan22 / ceil;
        int i11 = 0;
        while (i11 < ceil) {
            double d45 = atan2 + d44;
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            double d46 = d44;
            double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
            double d48 = d43;
            double d49 = d34;
            double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
            double d51 = (d37 * sin4) - (d38 * cos4);
            double d52 = (cos4 * d48) + (sin4 * d40);
            double d53 = d45 - atan2;
            double tan = Math.tan(d53 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
            i11++;
            atan2 = d45;
            d40 = d40;
            cos2 = cos2;
            ceil = ceil;
            d42 = d52;
            d16 = d16;
            d39 = d51;
            d15 = d47;
            d20 = d50;
            d34 = d49;
            d44 = d46;
            d43 = d48;
        }
    }

    public static void b(C5527i[] c5527iArr, Path path) {
        int i10;
        int i11;
        int i12;
        float[] fArr;
        char c10;
        boolean z10;
        boolean z11;
        float f6;
        float f10;
        boolean z12;
        boolean z13;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        C5527i[] c5527iArr2 = c5527iArr;
        int i13 = 6;
        float[] fArr2 = new float[6];
        char c11 = 'm';
        int i14 = 0;
        char c12 = 'm';
        int i15 = 0;
        while (i15 < c5527iArr2.length) {
            C5527i c5527i = c5527iArr2[i15];
            char c13 = c5527i.f45111a;
            float[] fArr3 = c5527i.f45112b;
            float f23 = fArr2[i14];
            float f24 = fArr2[1];
            float f25 = fArr2[2];
            float f26 = fArr2[3];
            float f27 = fArr2[4];
            float f28 = fArr2[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = i13;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f27, f28);
                    f23 = f27;
                    f25 = f23;
                    f24 = f28;
                    f26 = f24;
                default:
                    i10 = 2;
                    break;
            }
            float f29 = f27;
            float f30 = f28;
            float f31 = f23;
            float f32 = f24;
            int i16 = i14;
            while (i16 < fArr3.length) {
                if (c13 != 'A') {
                    if (c13 != 'C') {
                        if (c13 != 'H') {
                            if (c13 != 'Q') {
                                if (c13 != 'V') {
                                    if (c13 != 'a') {
                                        if (c13 != 'c') {
                                            if (c13 != 'h') {
                                                if (c13 != 'q') {
                                                    if (c13 != 'v') {
                                                        if (c13 != 'L') {
                                                            if (c13 != 'M') {
                                                                if (c13 != 'S') {
                                                                    if (c13 != 'T') {
                                                                        if (c13 != 'l') {
                                                                            if (c13 != c11) {
                                                                                if (c13 != 's') {
                                                                                    if (c13 != 't') {
                                                                                        i11 = i16;
                                                                                    } else {
                                                                                        if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                                            f22 = 0.0f;
                                                                                            f21 = 0.0f;
                                                                                        } else {
                                                                                            f21 = f31 - f25;
                                                                                            f22 = f32 - f26;
                                                                                        }
                                                                                        int i17 = i16 + 1;
                                                                                        path.rQuadTo(f21, f22, fArr3[i16], fArr3[i17]);
                                                                                        float f33 = f21 + f31;
                                                                                        float f34 = f22 + f32;
                                                                                        f31 += fArr3[i16];
                                                                                        f32 += fArr3[i17];
                                                                                        f26 = f34;
                                                                                        i11 = i16;
                                                                                        fArr = fArr3;
                                                                                        c10 = c13;
                                                                                        i12 = i15;
                                                                                        f25 = f33;
                                                                                    }
                                                                                } else {
                                                                                    if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                                        f20 = 0.0f;
                                                                                        f19 = 0.0f;
                                                                                    } else {
                                                                                        f19 = f32 - f26;
                                                                                        f20 = f31 - f25;
                                                                                    }
                                                                                    int i18 = i16 + 1;
                                                                                    int i19 = i16 + 2;
                                                                                    int i20 = i16 + 3;
                                                                                    i11 = i16;
                                                                                    f11 = f32;
                                                                                    float f35 = f31;
                                                                                    path.rCubicTo(f20, f19, fArr3[i16], fArr3[i18], fArr3[i19], fArr3[i20]);
                                                                                    f12 = f35 + fArr3[i11];
                                                                                    f13 = f11 + fArr3[i18];
                                                                                    f14 = f35 + fArr3[i19];
                                                                                    f15 = fArr3[i20];
                                                                                }
                                                                            } else {
                                                                                i11 = i16;
                                                                                float f36 = fArr3[i11];
                                                                                f31 += f36;
                                                                                float f37 = fArr3[i11 + 1];
                                                                                f32 += f37;
                                                                                if (i11 > 0) {
                                                                                    path.rLineTo(f36, f37);
                                                                                } else {
                                                                                    path.rMoveTo(f36, f37);
                                                                                    f30 = f32;
                                                                                    f29 = f31;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i11 = i16;
                                                                            int i21 = i11 + 1;
                                                                            path.rLineTo(fArr3[i11], fArr3[i21]);
                                                                            f31 += fArr3[i11];
                                                                            f32 += fArr3[i21];
                                                                        }
                                                                    } else {
                                                                        i11 = i16;
                                                                        float f38 = f32;
                                                                        float f39 = f31;
                                                                        if (c12 != 'q' && c12 != 't' && c12 != 'Q' && c12 != 'T') {
                                                                            f12 = f39;
                                                                            f13 = f38;
                                                                        } else {
                                                                            f12 = (f39 * 2.0f) - f25;
                                                                            f13 = (f38 * 2.0f) - f26;
                                                                        }
                                                                        int i22 = i11 + 1;
                                                                        path.quadTo(f12, f13, fArr3[i11], fArr3[i22]);
                                                                        f14 = fArr3[i11];
                                                                        f16 = fArr3[i22];
                                                                        f26 = f13;
                                                                        f25 = f12;
                                                                        fArr = fArr3;
                                                                        c10 = c13;
                                                                        i12 = i15;
                                                                        f31 = f14;
                                                                        f32 = f16;
                                                                    }
                                                                } else {
                                                                    i11 = i16;
                                                                    float f40 = f32;
                                                                    float f41 = f31;
                                                                    if (c12 != 'c' && c12 != 's' && c12 != 'C' && c12 != 'S') {
                                                                        f18 = f41;
                                                                        f17 = f40;
                                                                    } else {
                                                                        f17 = (f40 * 2.0f) - f26;
                                                                        f18 = (f41 * 2.0f) - f25;
                                                                    }
                                                                    int i23 = i11 + 1;
                                                                    int i24 = i11 + 2;
                                                                    int i25 = i11 + 3;
                                                                    path.cubicTo(f18, f17, fArr3[i11], fArr3[i23], fArr3[i24], fArr3[i25]);
                                                                    float f42 = fArr3[i11];
                                                                    float f43 = fArr3[i23];
                                                                    f31 = fArr3[i24];
                                                                    f32 = fArr3[i25];
                                                                    f26 = f43;
                                                                    f25 = f42;
                                                                }
                                                            } else {
                                                                i11 = i16;
                                                                f31 = fArr3[i11];
                                                                f32 = fArr3[i11 + 1];
                                                                if (i11 > 0) {
                                                                    path.lineTo(f31, f32);
                                                                } else {
                                                                    path.moveTo(f31, f32);
                                                                    f30 = f32;
                                                                    f29 = f31;
                                                                }
                                                            }
                                                        } else {
                                                            i11 = i16;
                                                            int i26 = i11 + 1;
                                                            path.lineTo(fArr3[i11], fArr3[i26]);
                                                            f31 = fArr3[i11];
                                                            f32 = fArr3[i26];
                                                        }
                                                    } else {
                                                        i11 = i16;
                                                        path.rLineTo(0.0f, fArr3[i11]);
                                                        f32 += fArr3[i11];
                                                    }
                                                } else {
                                                    i11 = i16;
                                                    float f44 = f32;
                                                    float f45 = f31;
                                                    int i27 = i11 + 1;
                                                    int i28 = i11 + 2;
                                                    int i29 = i11 + 3;
                                                    path.rQuadTo(fArr3[i11], fArr3[i27], fArr3[i28], fArr3[i29]);
                                                    float f46 = f45 + fArr3[i11];
                                                    float f47 = f45 + fArr3[i28];
                                                    f32 = f44 + fArr3[i29];
                                                    f26 = fArr3[i27] + f44;
                                                    f25 = f46;
                                                    fArr = fArr3;
                                                    c10 = c13;
                                                    i12 = i15;
                                                    f31 = f47;
                                                }
                                            } else {
                                                i11 = i16;
                                                path.rLineTo(fArr3[i11], 0.0f);
                                                f31 += fArr3[i11];
                                            }
                                            fArr = fArr3;
                                            c10 = c13;
                                            i12 = i15;
                                        } else {
                                            i11 = i16;
                                            f11 = f32;
                                            float f48 = f31;
                                            int i30 = i11 + 2;
                                            int i31 = i11 + 3;
                                            int i32 = i11 + 4;
                                            int i33 = i11 + 5;
                                            path.rCubicTo(fArr3[i11], fArr3[i11 + 1], fArr3[i30], fArr3[i31], fArr3[i32], fArr3[i33]);
                                            f12 = f48 + fArr3[i30];
                                            f13 = f11 + fArr3[i31];
                                            f14 = f48 + fArr3[i32];
                                            f15 = fArr3[i33];
                                        }
                                        f16 = f15 + f11;
                                        f26 = f13;
                                        f25 = f12;
                                        fArr = fArr3;
                                        c10 = c13;
                                        i12 = i15;
                                        f31 = f14;
                                        f32 = f16;
                                    } else {
                                        i11 = i16;
                                        float f49 = f32;
                                        float f50 = f31;
                                        int i34 = i11 + 5;
                                        float f51 = fArr3[i34] + f50;
                                        int i35 = i11 + 6;
                                        float f52 = fArr3[i35] + f49;
                                        float f53 = fArr3[i11];
                                        float f54 = fArr3[i11 + 1];
                                        float f55 = fArr3[i11 + 2];
                                        if (fArr3[i11 + 3] != 0.0f) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (fArr3[i11 + 4] != 0.0f) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        fArr = fArr3;
                                        c10 = c13;
                                        i12 = i15;
                                        a(path, f50, f49, f51, f52, f53, f54, f55, z12, z13);
                                        f31 = f50 + fArr[i34];
                                        f32 = f49 + fArr[i35];
                                    }
                                } else {
                                    i11 = i16;
                                    fArr = fArr3;
                                    c10 = c13;
                                    i12 = i15;
                                    path.lineTo(f31, fArr[i11]);
                                    f32 = fArr[i11];
                                }
                            } else {
                                i11 = i16;
                                fArr = fArr3;
                                c10 = c13;
                                i12 = i15;
                                int i36 = i11 + 1;
                                int i37 = i11 + 2;
                                int i38 = i11 + 3;
                                path.quadTo(fArr[i11], fArr[i36], fArr[i37], fArr[i38]);
                                f6 = fArr[i11];
                                f10 = fArr[i36];
                                f31 = fArr[i37];
                                f32 = fArr[i38];
                            }
                        } else {
                            i11 = i16;
                            fArr = fArr3;
                            c10 = c13;
                            i12 = i15;
                            path.lineTo(fArr[i11], f32);
                            f31 = fArr[i11];
                        }
                        i16 = i11 + i10;
                        c12 = c10;
                        c13 = c12;
                        fArr3 = fArr;
                        i15 = i12;
                        c11 = 'm';
                        i14 = 0;
                    } else {
                        i11 = i16;
                        fArr = fArr3;
                        c10 = c13;
                        i12 = i15;
                        int i39 = i11 + 2;
                        int i40 = i11 + 3;
                        int i41 = i11 + 4;
                        int i42 = i11 + 5;
                        path.cubicTo(fArr[i11], fArr[i11 + 1], fArr[i39], fArr[i40], fArr[i41], fArr[i42]);
                        f31 = fArr[i41];
                        f32 = fArr[i42];
                        f6 = fArr[i39];
                        f10 = fArr[i40];
                    }
                    f25 = f6;
                    f26 = f10;
                    i16 = i11 + i10;
                    c12 = c10;
                    c13 = c12;
                    fArr3 = fArr;
                    i15 = i12;
                    c11 = 'm';
                    i14 = 0;
                } else {
                    i11 = i16;
                    float f56 = f32;
                    float f57 = f31;
                    fArr = fArr3;
                    c10 = c13;
                    i12 = i15;
                    int i43 = i11 + 5;
                    float f58 = fArr[i43];
                    int i44 = i11 + 6;
                    float f59 = fArr[i44];
                    float f60 = fArr[i11];
                    float f61 = fArr[i11 + 1];
                    float f62 = fArr[i11 + 2];
                    if (fArr[i11 + 3] != 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (fArr[i11 + 4] != 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    a(path, f57, f56, f58, f59, f60, f61, f62, z10, z11);
                    f31 = fArr[i43];
                    f32 = fArr[i44];
                }
                f26 = f32;
                f25 = f31;
                i16 = i11 + i10;
                c12 = c10;
                c13 = c12;
                fArr3 = fArr;
                i15 = i12;
                c11 = 'm';
                i14 = 0;
            }
            int i45 = i15;
            int i46 = i14;
            fArr2[i46] = f31;
            fArr2[1] = f32;
            fArr2[2] = f25;
            fArr2[3] = f26;
            fArr2[4] = f29;
            fArr2[5] = f30;
            i15 = i45 + 1;
            i13 = 6;
            c11 = 'm';
            i14 = i46;
            c12 = c5527iArr[i45].f45111a;
            c5527iArr2 = c5527iArr;
        }
    }
}
