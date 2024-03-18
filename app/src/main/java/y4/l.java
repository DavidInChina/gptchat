package y4;

import H0.C0672c0;
import android.graphics.Path;
import android.graphics.PointF;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class l extends J4.a {

    /* renamed from: q  reason: collision with root package name */
    public Path f50736q;

    /* renamed from: r  reason: collision with root package name */
    public final J4.a f50737r;

    public l(C5971a c5971a, J4.a aVar) {
        super(c5971a, (PointF) aVar.f8839b, (PointF) aVar.f8840c, aVar.f8841d, aVar.f8842e, aVar.f8843f, aVar.f8844g, aVar.f8845h);
        this.f50737r = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        Object obj;
        Object obj2 = this.f8840c;
        Object obj3 = this.f8839b;
        if (obj2 != null && obj3 != null && ((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obj3 != null && (obj = this.f8840c) != null && !z10) {
            PointF pointF = (PointF) obj3;
            PointF pointF2 = (PointF) obj;
            J4.a aVar = this.f50737r;
            PointF pointF3 = aVar.f8852o;
            PointF pointF4 = aVar.f8853p;
            C0672c0 c0672c0 = I4.g.f8055a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f6 = pointF.x;
                float f10 = pointF2.x;
                float f11 = pointF2.y;
                path.cubicTo(pointF3.x + f6, pointF.y + pointF3.y, f10 + pointF4.x, f11 + pointF4.y, f10, f11);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f50736q = path;
        }
    }
}
