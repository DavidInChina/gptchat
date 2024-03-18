package G4;

import H0.C0672c0;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import v4.C5971a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f6026a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final U3.c f6027b = U3.c.y("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: c  reason: collision with root package name */
    public static final U3.c f6028c = U3.c.y("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        pointF.x = I4.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = I4.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = I4.f.b(pointF2.x, -1.0f, 1.0f);
        float b10 = I4.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        C0672c0 c0672c0 = I4.g.f8055a;
        try {
            return F1.a.b(pointF.x, pointF.y, pointF2.x, b10);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                return F1.a.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.animation.Interpolator] */
    public static J4.a b(H4.a aVar, C5971a c5971a, float f6, J j6, boolean z10, boolean z11) {
        LinearInterpolator linearInterpolator;
        Object obj;
        Interpolator interpolator;
        Interpolator interpolator2;
        Object obj2;
        J4.a aVar2;
        U3.c cVar;
        PointF pointF;
        Object obj3;
        PointF pointF2;
        boolean z12;
        LinearInterpolator linearInterpolator2 = f6026a;
        U3.c cVar2 = f6027b;
        if (z10 && z11) {
            aVar.h();
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z13 = false;
            PointF pointF6 = null;
            PointF pointF7 = null;
            PointF pointF8 = null;
            Object obj4 = null;
            PointF pointF9 = null;
            PointF pointF10 = null;
            float f10 = 0.0f;
            Object obj5 = null;
            while (aVar.m()) {
                int V10 = aVar.V(cVar2);
                U3.c cVar3 = f6028c;
                LinearInterpolator linearInterpolator3 = linearInterpolator2;
                switch (V10) {
                    case 0:
                        cVar = cVar2;
                        pointF = pointF4;
                        f10 = (float) aVar.r();
                        cVar2 = cVar;
                        linearInterpolator2 = linearInterpolator3;
                        pointF4 = pointF;
                    case 1:
                        pointF = pointF4;
                        obj4 = j6.c(aVar, f6);
                        linearInterpolator2 = linearInterpolator3;
                        pointF4 = pointF;
                    case 2:
                        pointF = pointF4;
                        obj5 = j6.c(aVar, f6);
                        linearInterpolator2 = linearInterpolator3;
                        pointF4 = pointF;
                    case 3:
                        U3.c cVar4 = cVar2;
                        pointF = pointF4;
                        PointF pointF11 = pointF5;
                        boolean z14 = z13;
                        if (aVar.P() == 3) {
                            aVar.h();
                            float f11 = 0.0f;
                            float f12 = 0.0f;
                            float f13 = 0.0f;
                            float f14 = 0.0f;
                            while (aVar.m()) {
                                int V11 = aVar.V(cVar3);
                                if (V11 != 0) {
                                    if (V11 != 1) {
                                        aVar.d0();
                                    } else if (aVar.P() == 7) {
                                        f14 = (float) aVar.r();
                                        obj4 = obj4;
                                        f12 = f14;
                                    } else {
                                        obj3 = obj4;
                                        aVar.a();
                                        f12 = (float) aVar.r();
                                        if (aVar.P() == 7) {
                                            f14 = (float) aVar.r();
                                        } else {
                                            f14 = f12;
                                        }
                                        aVar.i();
                                        obj4 = obj3;
                                    }
                                } else {
                                    obj3 = obj4;
                                    if (aVar.P() == 7) {
                                        f13 = (float) aVar.r();
                                        obj4 = obj3;
                                        f11 = f13;
                                    } else {
                                        aVar.a();
                                        f11 = (float) aVar.r();
                                        if (aVar.P() == 7) {
                                            f13 = (float) aVar.r();
                                        } else {
                                            f13 = f11;
                                        }
                                        aVar.i();
                                        obj4 = obj3;
                                    }
                                }
                            }
                            pointF8 = new PointF(f11, f12);
                            pointF9 = new PointF(f13, f14);
                            aVar.j();
                        } else {
                            pointF6 = q.b(aVar, f6);
                        }
                        z13 = z14;
                        cVar2 = cVar4;
                        linearInterpolator2 = linearInterpolator3;
                        pointF5 = pointF11;
                        pointF4 = pointF;
                    case 4:
                        cVar = cVar2;
                        if (aVar.P() == 3) {
                            aVar.h();
                            float f15 = 0.0f;
                            float f16 = 0.0f;
                            float f17 = 0.0f;
                            float f18 = 0.0f;
                            while (aVar.m()) {
                                PointF pointF12 = pointF5;
                                int V12 = aVar.V(cVar3);
                                if (V12 != 0) {
                                    pointF2 = pointF4;
                                    if (V12 != 1) {
                                        aVar.d0();
                                    } else if (aVar.P() == 7) {
                                        f18 = (float) aVar.r();
                                        f16 = f18;
                                    } else {
                                        aVar.a();
                                        f16 = (float) aVar.r();
                                        if (aVar.P() == 7) {
                                            z12 = z13;
                                            f18 = (float) aVar.r();
                                        } else {
                                            z12 = z13;
                                            f18 = f16;
                                        }
                                        aVar.i();
                                    }
                                    pointF5 = pointF12;
                                    pointF4 = pointF2;
                                } else {
                                    pointF2 = pointF4;
                                    z12 = z13;
                                    if (aVar.P() == 7) {
                                        f15 = (float) aVar.r();
                                        f17 = f15;
                                    } else {
                                        aVar.a();
                                        f15 = (float) aVar.r();
                                        if (aVar.P() == 7) {
                                            f17 = (float) aVar.r();
                                        } else {
                                            f17 = f15;
                                        }
                                        aVar.i();
                                    }
                                }
                                z13 = z12;
                                pointF5 = pointF12;
                                pointF4 = pointF2;
                            }
                            pointF = pointF4;
                            PointF pointF13 = new PointF(f15, f16);
                            PointF pointF14 = new PointF(f17, f18);
                            aVar.j();
                            pointF3 = pointF14;
                            pointF10 = pointF13;
                        } else {
                            pointF = pointF4;
                            pointF7 = q.b(aVar, f6);
                        }
                        cVar2 = cVar;
                        linearInterpolator2 = linearInterpolator3;
                        pointF4 = pointF;
                    case 5:
                        if (aVar.F() == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        linearInterpolator2 = linearInterpolator3;
                    case 6:
                        pointF4 = q.b(aVar, f6);
                        linearInterpolator2 = linearInterpolator3;
                    case 7:
                        pointF5 = q.b(aVar, f6);
                        linearInterpolator2 = linearInterpolator3;
                    default:
                        aVar.d0();
                        linearInterpolator2 = linearInterpolator3;
                }
            }
            LinearInterpolator linearInterpolator4 = linearInterpolator2;
            PointF pointF15 = pointF4;
            PointF pointF16 = pointF5;
            boolean z15 = z13;
            Object obj6 = obj4;
            aVar.j();
            if (z15) {
                obj2 = obj6;
            } else {
                if (pointF6 != null && pointF7 != null) {
                    linearInterpolator4 = a(pointF6, pointF7);
                } else if (pointF8 != null && pointF9 != null && pointF10 != null && pointF3 != null) {
                    interpolator2 = a(pointF8, pointF10);
                    interpolator = a(pointF9, pointF3);
                    obj2 = obj5;
                    linearInterpolator4 = null;
                    if (interpolator2 == null && interpolator != null) {
                        aVar2 = new J4.a(c5971a, obj6, obj2, interpolator2, interpolator, f10);
                    } else {
                        aVar2 = new J4.a(c5971a, obj6, obj2, linearInterpolator4, f10, (Float) null);
                    }
                    aVar2.f8852o = pointF15;
                    aVar2.f8853p = pointF16;
                    return aVar2;
                }
                obj2 = obj5;
            }
            interpolator2 = null;
            interpolator = null;
            if (interpolator2 == null) {
            }
            aVar2 = new J4.a(c5971a, obj6, obj2, linearInterpolator4, f10, (Float) null);
            aVar2.f8852o = pointF15;
            aVar2.f8853p = pointF16;
            return aVar2;
        }
        U3.c cVar5 = cVar2;
        if (z10) {
            aVar.h();
            Object obj7 = null;
            PointF pointF17 = null;
            boolean z16 = false;
            float f19 = 0.0f;
            PointF pointF18 = null;
            PointF pointF19 = null;
            PointF pointF20 = null;
            Object obj8 = null;
            while (aVar.m()) {
                U3.c cVar6 = cVar5;
                switch (aVar.V(cVar6)) {
                    case 0:
                        f19 = (float) aVar.r();
                        break;
                    case 1:
                        obj7 = j6.c(aVar, f6);
                        break;
                    case 2:
                        obj8 = j6.c(aVar, f6);
                        break;
                    case 3:
                        pointF18 = q.b(aVar, 1.0f);
                        break;
                    case 4:
                        pointF17 = q.b(aVar, 1.0f);
                        break;
                    case 5:
                        if (aVar.F() == 1) {
                            z16 = true;
                            break;
                        } else {
                            z16 = false;
                            break;
                        }
                    case 6:
                        pointF19 = q.b(aVar, f6);
                        break;
                    case 7:
                        pointF20 = q.b(aVar, f6);
                        break;
                    default:
                        aVar.d0();
                        break;
                }
                cVar5 = cVar6;
            }
            aVar.j();
            if (z16) {
                obj = obj7;
            } else if (pointF18 != null && pointF17 != null) {
                linearInterpolator = a(pointF18, pointF17);
                obj = obj8;
                J4.a aVar3 = new J4.a(c5971a, obj7, obj, linearInterpolator, f19, (Float) null);
                aVar3.f8852o = pointF19;
                aVar3.f8853p = pointF20;
                return aVar3;
            } else {
                obj = obj8;
            }
            linearInterpolator = linearInterpolator2;
            J4.a aVar32 = new J4.a(c5971a, obj7, obj, linearInterpolator, f19, (Float) null);
            aVar32.f8852o = pointF19;
            aVar32.f8853p = pointF20;
            return aVar32;
        }
        return new J4.a(j6.c(aVar, f6));
    }
}
