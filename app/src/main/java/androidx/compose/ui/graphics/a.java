package androidx.compose.ui.graphics;

import K4.J;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.DisplayMetrics;
import l0.AbstractC4326r;
import r0.AbstractC5346j;
import r0.C5341e;
import r0.C5342f;
import r0.C5344h;
import r0.F;
import r0.G;
import r0.L;
import r0.P;
import r0.r;
import r0.w;
import r0.y;
import r0.z;
import s0.AbstractC5501c;
import s0.AbstractC5502d;
import s0.C5503e;
import s0.C5510l;
import s0.C5511m;
import s0.C5515q;
import wf.k;

/* loaded from: classes2.dex */
public abstract class a {
    public static final long a(float f6, float f10, float f11, float f12, AbstractC5502d abstractC5502d) {
        float b10 = abstractC5502d.b(0);
        if (f6 <= abstractC5502d.a(0) && b10 <= f6) {
            float b11 = abstractC5502d.b(1);
            if (f10 <= abstractC5502d.a(1) && b11 <= f10) {
                float b12 = abstractC5502d.b(2);
                if (f11 <= abstractC5502d.a(2) && b12 <= f11 && 0.0f <= f12 && f12 <= 1.0f) {
                    if (abstractC5502d.c()) {
                        long j6 = (((((((int) ((f6 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 24)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((f11 * 255.0f) + 0.5f))) & 4294967295L) << 32;
                        int i10 = r.f44264l;
                        return j6;
                    }
                    int i11 = AbstractC5501c.f45022e;
                    if (((int) (abstractC5502d.f45024b >> 32)) == 3) {
                        int i12 = abstractC5502d.f45025c;
                        if (i12 != -1) {
                            short a5 = w.a(f6);
                            short a10 = w.a(f10);
                            long j10 = (a10 & 65535) << 32;
                            long a11 = j10 | ((a5 & 65535) << 48) | ((w.a(f11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (i12 & 63);
                            int i13 = r.f44264l;
                            return a11;
                        }
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
                    }
                    throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f6 + ", green = " + f10 + ", blue = " + f11 + ", alpha = " + f12 + " outside the range for " + abstractC5502d).toString());
    }

    public static final long b(int i10) {
        long j6 = i10 << 32;
        int i11 = r.f44264l;
        return j6;
    }

    public static final long c(long j6) {
        long j10 = (j6 & 4294967295L) << 32;
        int i10 = r.f44264l;
        return j10;
    }

    public static long d(int i10, int i11, int i12) {
        return b(((i10 & 255) << 16) | (-16777216) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static C5341e e(int i10, int i11, int i12) {
        Bitmap bitmap;
        C5515q c5515q = C5503e.f45028c;
        Bitmap.Config t10 = t(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmap = AbstractC5346j.b(i10, i11, i12, true, c5515q);
        } else {
            bitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, t10);
            bitmap.setHasAlpha(true);
        }
        return new C5341e(bitmap);
    }

    public static final C5342f f() {
        return new C5342f(new Paint(7));
    }

    public static final C5344h g() {
        return new C5344h(new Path());
    }

    public static final long h(float f6, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i10 = P.f44226c;
        return floatToRawIntBits;
    }

    public static final float i(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        float f6 = (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + f6;
    }

    public static final Bitmap j(z zVar) {
        if (zVar instanceof C5341e) {
            return ((C5341e) zVar).f44234a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long k(long j6, long j10) {
        float f6;
        float f10;
        long a5 = r.a(j6, r.f(j10));
        float d10 = r.d(j10);
        float d11 = r.d(a5);
        float f11 = 1.0f - d11;
        float f12 = (d10 * f11) + d11;
        float h10 = r.h(a5);
        float h11 = r.h(j10);
        float f13 = 0.0f;
        int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            f6 = 0.0f;
        } else {
            f6 = (((h11 * d10) * f11) + (h10 * d11)) / f12;
        }
        float g10 = r.g(a5);
        float g11 = r.g(j10);
        if (i10 == 0) {
            f10 = 0.0f;
        } else {
            f10 = (((g11 * d10) * f11) + (g10 * d11)) / f12;
        }
        float e10 = r.e(a5);
        float e11 = r.e(j10);
        if (i10 != 0) {
            f13 = (((e11 * d10) * f11) + (e10 * d11)) / f12;
        }
        return a(f6, f10, f13, f12, r.f(j10));
    }

    public static final AbstractC4326r l(AbstractC4326r abstractC4326r, k kVar) {
        return abstractC4326r.g(new BlockGraphicsLayerElement(kVar));
    }

    public static AbstractC4326r m(AbstractC4326r abstractC4326r, float f6, float f10, float f11, float f12, float f13, long j6, L l10, boolean z10, int i10) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        long j10;
        F f19;
        boolean z11;
        if ((i10 & 1) != 0) {
            f14 = 1.0f;
        } else {
            f14 = f6;
        }
        if ((i10 & 2) != 0) {
            f15 = 1.0f;
        } else {
            f15 = f10;
        }
        if ((i10 & 4) != 0) {
            f16 = 1.0f;
        } else {
            f16 = f11;
        }
        if ((i10 & 32) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f12;
        }
        if ((i10 & 256) != 0) {
            f18 = 0.0f;
        } else {
            f18 = f13;
        }
        if ((i10 & 1024) != 0) {
            j10 = P.f44225b;
        } else {
            j10 = j6;
        }
        if ((i10 & 2048) != 0) {
            f19 = G.f44171a;
        } else {
            f19 = l10;
        }
        if ((i10 & 4096) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        long j11 = y.f44272a;
        return abstractC4326r.g(new GraphicsLayerElement(f14, f15, f16, 0.0f, 0.0f, f17, 0.0f, 0.0f, f18, 8.0f, j10, f19, z11, j11, j11, 0));
    }

    public static final long n(float f6, long j6, long j10) {
        C5510l c5510l = C5503e.f45045t;
        long a5 = r.a(j6, c5510l);
        long a10 = r.a(j10, c5510l);
        float d10 = r.d(a5);
        float h10 = r.h(a5);
        float g10 = r.g(a5);
        float e10 = r.e(a5);
        float d11 = r.d(a10);
        float h11 = r.h(a10);
        float g11 = r.g(a10);
        float e11 = r.e(a10);
        return r.a(a(J.L(h10, h11, f6), J.L(g10, g11, f6), J.L(e10, e11, f6), J.L(d10, d11, f6), c5510l), r.f(j10));
    }

    public static final float o(long j6) {
        AbstractC5502d f6 = r.f(j6);
        if (AbstractC5501c.a(f6.f45024b, AbstractC5501c.f45018a)) {
            C5511m c5511m = ((C5515q) f6).f45087p;
            double c10 = c5511m.c(r.h(j6));
            double c11 = c5511m.c(r.e(j6)) * 0.0722d;
            float c12 = (float) (c11 + (c5511m.c(r.g(j6)) * 0.7152d) + (c10 * 0.2126d));
            float f10 = 0.0f;
            if (c12 > 0.0f) {
                f10 = 1.0f;
                if (c12 < 1.0f) {
                    return c12;
                }
            }
            return f10;
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC5501c.b(f6.f45024b))).toString());
    }

    public static final void p(Matrix matrix, float[] fArr) {
        float f6 = fArr[2];
        if (f6 == 0.0f) {
            float f10 = fArr[6];
            if (f10 == 0.0f && fArr[10] == 1.0f && fArr[14] == 0.0f) {
                float f11 = fArr[8];
                if (f11 == 0.0f && fArr[9] == 0.0f && fArr[11] == 0.0f) {
                    float f12 = fArr[0];
                    float f13 = fArr[1];
                    float f14 = fArr[3];
                    float f15 = fArr[4];
                    float f16 = fArr[5];
                    float f17 = fArr[7];
                    float f18 = fArr[12];
                    float f19 = fArr[13];
                    float f20 = fArr[15];
                    fArr[0] = f12;
                    fArr[1] = f15;
                    fArr[2] = f18;
                    fArr[3] = f13;
                    fArr[4] = f16;
                    fArr[5] = f19;
                    fArr[6] = f14;
                    fArr[7] = f17;
                    fArr[8] = f20;
                    matrix.setValues(fArr);
                    fArr[0] = f12;
                    fArr[1] = f13;
                    fArr[2] = f6;
                    fArr[3] = f14;
                    fArr[4] = f15;
                    fArr[5] = f16;
                    fArr[6] = f10;
                    fArr[7] = f17;
                    fArr[8] = f11;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
    }

    public static final void q(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f6;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    public static final BlendMode r(int i10) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (G.b(i10, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        } else if (G.b(i10, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        } else if (G.b(i10, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        } else if (G.b(i10, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        } else if (G.b(i10, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        } else if (G.b(i10, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        } else if (G.b(i10, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        } else if (G.b(i10, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        } else if (G.b(i10, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        } else if (G.b(i10, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (G.b(i10, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        } else if (G.b(i10, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        } else if (G.b(i10, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        } else if (G.b(i10, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        } else if (G.b(i10, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        } else if (G.b(i10, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        } else if (G.b(i10, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        } else if (G.b(i10, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        } else if (G.b(i10, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (G.b(i10, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (G.b(i10, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (G.b(i10, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (G.b(i10, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (G.b(i10, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        } else if (G.b(i10, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        } else if (G.b(i10, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        } else if (G.b(i10, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        } else if (G.b(i10, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        } else if (G.b(i10, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = BlendMode.SRC_OVER;
            return blendMode;
        }
    }

    public static final int s(long j6) {
        float[] fArr = C5503e.f45026a;
        return (int) (r.a(j6, C5503e.f45028c) >>> 32);
    }

    public static final Bitmap.Config t(int i10) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (G.e(i10, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (G.e(i10, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (G.e(i10, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && G.e(i10, 3)) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        } else if (i11 >= 26 && G.e(i10, 4)) {
            config = Bitmap.Config.HARDWARE;
            return config;
        } else {
            return Bitmap.Config.ARGB_8888;
        }
    }

    public static final PorterDuff.Mode u(int i10) {
        if (G.b(i10, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (G.b(i10, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (G.b(i10, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (G.b(i10, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (G.b(i10, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (G.b(i10, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (G.b(i10, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if (G.b(i10, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (G.b(i10, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (G.b(i10, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (G.b(i10, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (G.b(i10, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if (G.b(i10, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if (G.b(i10, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if (G.b(i10, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (G.b(i10, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if (G.b(i10, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (G.b(i10, 13)) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
