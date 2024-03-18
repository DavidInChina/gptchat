package J4;

import D4.c;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import v4.C5971a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final C5971a f8838a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8839b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8840c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f8841d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f8842e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f8843f;

    /* renamed from: g  reason: collision with root package name */
    public final float f8844g;

    /* renamed from: h  reason: collision with root package name */
    public Float f8845h;

    /* renamed from: i  reason: collision with root package name */
    public float f8846i;

    /* renamed from: j  reason: collision with root package name */
    public float f8847j;

    /* renamed from: k  reason: collision with root package name */
    public int f8848k;

    /* renamed from: l  reason: collision with root package name */
    public int f8849l;

    /* renamed from: m  reason: collision with root package name */
    public float f8850m;

    /* renamed from: n  reason: collision with root package name */
    public float f8851n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f8852o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f8853p;

    public a(C5971a c5971a, Object obj, Object obj2, Interpolator interpolator, float f6, Float f10) {
        this.f8846i = -3987645.8f;
        this.f8847j = -3987645.8f;
        this.f8848k = 784923401;
        this.f8849l = 784923401;
        this.f8850m = Float.MIN_VALUE;
        this.f8851n = Float.MIN_VALUE;
        this.f8852o = null;
        this.f8853p = null;
        this.f8838a = c5971a;
        this.f8839b = obj;
        this.f8840c = obj2;
        this.f8841d = interpolator;
        this.f8842e = null;
        this.f8843f = null;
        this.f8844g = f6;
        this.f8845h = f10;
    }

    public final float a() {
        C5971a c5971a = this.f8838a;
        if (c5971a == null) {
            return 1.0f;
        }
        if (this.f8851n == Float.MIN_VALUE) {
            if (this.f8845h == null) {
                this.f8851n = 1.0f;
            } else {
                this.f8851n = ((this.f8845h.floatValue() - this.f8844g) / (c5971a.f47160m - c5971a.f47159l)) + b();
            }
        }
        return this.f8851n;
    }

    public final float b() {
        C5971a c5971a = this.f8838a;
        if (c5971a == null) {
            return 0.0f;
        }
        if (this.f8850m == Float.MIN_VALUE) {
            float f6 = c5971a.f47159l;
            this.f8850m = (this.f8844g - f6) / (c5971a.f47160m - f6);
        }
        return this.f8850m;
    }

    public final boolean c() {
        if (this.f8841d == null && this.f8842e == null && this.f8843f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f8839b + ", endValue=" + this.f8840c + ", startFrame=" + this.f8844g + ", endFrame=" + this.f8845h + ", interpolator=" + this.f8841d + '}';
    }

    public a(C5971a c5971a, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f6) {
        this.f8846i = -3987645.8f;
        this.f8847j = -3987645.8f;
        this.f8848k = 784923401;
        this.f8849l = 784923401;
        this.f8850m = Float.MIN_VALUE;
        this.f8851n = Float.MIN_VALUE;
        this.f8852o = null;
        this.f8853p = null;
        this.f8838a = c5971a;
        this.f8839b = obj;
        this.f8840c = obj2;
        this.f8841d = null;
        this.f8842e = interpolator;
        this.f8843f = interpolator2;
        this.f8844g = f6;
        this.f8845h = null;
    }

    public a(C5971a c5971a, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f6, Float f10) {
        this.f8846i = -3987645.8f;
        this.f8847j = -3987645.8f;
        this.f8848k = 784923401;
        this.f8849l = 784923401;
        this.f8850m = Float.MIN_VALUE;
        this.f8851n = Float.MIN_VALUE;
        this.f8852o = null;
        this.f8853p = null;
        this.f8838a = c5971a;
        this.f8839b = pointF;
        this.f8840c = pointF2;
        this.f8841d = interpolator;
        this.f8842e = interpolator2;
        this.f8843f = interpolator3;
        this.f8844g = f6;
        this.f8845h = f10;
    }

    public a(Object obj) {
        this.f8846i = -3987645.8f;
        this.f8847j = -3987645.8f;
        this.f8848k = 784923401;
        this.f8849l = 784923401;
        this.f8850m = Float.MIN_VALUE;
        this.f8851n = Float.MIN_VALUE;
        this.f8852o = null;
        this.f8853p = null;
        this.f8838a = null;
        this.f8839b = obj;
        this.f8840c = obj;
        this.f8841d = null;
        this.f8842e = null;
        this.f8843f = null;
        this.f8844g = Float.MIN_VALUE;
        this.f8845h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(c cVar, c cVar2) {
        this.f8846i = -3987645.8f;
        this.f8847j = -3987645.8f;
        this.f8848k = 784923401;
        this.f8849l = 784923401;
        this.f8850m = Float.MIN_VALUE;
        this.f8851n = Float.MIN_VALUE;
        this.f8852o = null;
        this.f8853p = null;
        this.f8838a = null;
        this.f8839b = cVar;
        this.f8840c = cVar2;
        this.f8841d = null;
        this.f8842e = null;
        this.f8843f = null;
        this.f8844g = Float.MIN_VALUE;
        this.f8845h = Float.valueOf(Float.MAX_VALUE);
    }
}
