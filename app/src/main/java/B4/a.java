package B4;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f1836a;

    /* renamed from: b  reason: collision with root package name */
    public final PointF f1837b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f1838c;

    public a() {
        this.f1836a = new PointF();
        this.f1837b = new PointF();
        this.f1838c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f1838c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f1836a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f1837b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f1836a = pointF;
        this.f1837b = pointF2;
        this.f1838c = pointF3;
    }
}
