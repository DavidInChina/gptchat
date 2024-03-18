package a1;

import w.AbstractC6051C;
import w.C6050B;
import x.AbstractC6262a;

/* renamed from: a1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1914b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C6050B f23844a = new C6050B(0);

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f23845b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f23846c;

    static {
        Object[] objArr = new Object[0];
        f23845b = objArr;
        f23846c = 1.05f;
        synchronized (objArr) {
            f23844a.e((int) 115.0f, new C1916d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f23844a.e((int) 130.0f, new C1916d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f23844a.e((int) 150.0f, new C1916d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f23844a.e((int) 180.0f, new C1916d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f23844a.e((int) 200.0f, new C1916d(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        float d10 = (f23844a.d(0) / 100.0f) - 0.02f;
        f23846c = d10;
        if (d10 > 1.0f) {
            return;
        }
        throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1".toString());
    }

    public static AbstractC1913a a(float f6) {
        float f10;
        if (f6 >= f23846c) {
            int i10 = (int) (f6 * 100.0f);
            AbstractC1913a abstractC1913a = (AbstractC1913a) f23844a.c(i10);
            if (abstractC1913a != null) {
                return abstractC1913a;
            }
            C6050B c6050b = f23844a;
            if (c6050b.f47561Y) {
                AbstractC6051C.a(c6050b);
            }
            int a5 = AbstractC6262a.a(c6050b.f47564i0, i10, c6050b.f47562Z);
            if (a5 >= 0) {
                return (AbstractC1913a) f23844a.g(a5);
            }
            int i11 = -(a5 + 1);
            int i12 = i11 - 1;
            if (i12 >= 0 && i11 < f23844a.f()) {
                float d10 = f23844a.d(i12) / 100.0f;
                float d11 = f23844a.d(i11) / 100.0f;
                if (d10 == d11) {
                    f10 = 0.0f;
                } else {
                    f10 = (f6 - d10) / (d11 - d10);
                }
                float max = (Math.max(0.0f, Math.min(1.0f, f10)) * 1.0f) + 0.0f;
                AbstractC1913a abstractC1913a2 = (AbstractC1913a) f23844a.g(i12);
                AbstractC1913a abstractC1913a3 = (AbstractC1913a) f23844a.g(i11);
                float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
                float[] fArr2 = new float[9];
                for (int i13 = 0; i13 < 9; i13++) {
                    float f11 = fArr[i13];
                    float b10 = abstractC1913a2.b(f11);
                    fArr2[i13] = ((abstractC1913a3.b(f11) - b10) * max) + b10;
                }
                C1916d c1916d = new C1916d(fArr, fArr2);
                b(f6, c1916d);
                return c1916d;
            }
            C1916d c1916d2 = new C1916d(new float[]{1.0f}, new float[]{f6});
            b(f6, c1916d2);
            return c1916d2;
        }
        return null;
    }

    public static void b(float f6, C1916d c1916d) {
        synchronized (f23845b) {
            C6050B clone = f23844a.clone();
            clone.e((int) (f6 * 100.0f), c1916d);
            f23844a = clone;
        }
    }
}
