package r1;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import m.RunnableC4517N;
import s1.AbstractC5521c;

/* renamed from: r1.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5355b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f44279a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f44280b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f44281c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f44282d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int c(float f6) {
        float f10;
        boolean z10;
        float f11;
        if (f6 < 1.0f) {
            return -16777216;
        }
        if (f6 > 99.0f) {
            return -1;
        }
        float f12 = (f6 + 16.0f) / 116.0f;
        if (f6 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f6 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z10) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f44281c;
        return AbstractC5521c.a(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float d(int i10) {
        float pow;
        float f6 = i10 / 255.0f;
        if (f6 <= 0.04045f) {
            pow = f6 / 12.92f;
        } else {
            pow = (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static float g() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i10) {
        new Handler(Looper.getMainLooper()).post(new m(this, i10, 0));
    }

    public void b(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new RunnableC4517N(this, 2, typeface));
    }

    public abstract void e(int i10);

    public abstract void f(Typeface typeface);
}
