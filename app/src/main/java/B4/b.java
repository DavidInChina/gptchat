package B4;

import android.graphics.PointF;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f1839a;

    /* renamed from: b  reason: collision with root package name */
    public String f1840b;

    /* renamed from: c  reason: collision with root package name */
    public float f1841c;

    /* renamed from: d  reason: collision with root package name */
    public int f1842d;

    /* renamed from: e  reason: collision with root package name */
    public int f1843e;

    /* renamed from: f  reason: collision with root package name */
    public float f1844f;

    /* renamed from: g  reason: collision with root package name */
    public float f1845g;

    /* renamed from: h  reason: collision with root package name */
    public int f1846h;

    /* renamed from: i  reason: collision with root package name */
    public int f1847i;

    /* renamed from: j  reason: collision with root package name */
    public float f1848j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1849k;

    /* renamed from: l  reason: collision with root package name */
    public PointF f1850l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f1851m;

    public final int hashCode() {
        String str = this.f1840b;
        int d10 = AbstractC6708l.d(this.f1842d, ((int) (E9.f.v(str, this.f1839a.hashCode() * 31, 31) + this.f1841c)) * 31, 31) + this.f1843e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f1844f);
        return (((d10 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f1846h;
    }
}
