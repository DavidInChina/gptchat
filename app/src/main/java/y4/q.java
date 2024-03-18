package y4;

import android.graphics.Matrix;
import android.graphics.PointF;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f50750a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f50751b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f50752c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f50753d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f50754e;

    /* renamed from: f  reason: collision with root package name */
    public final k f50755f;

    /* renamed from: g  reason: collision with root package name */
    public final e f50756g;

    /* renamed from: h  reason: collision with root package name */
    public final e f50757h;

    /* renamed from: i  reason: collision with root package name */
    public final h f50758i;

    /* renamed from: j  reason: collision with root package name */
    public final e f50759j;

    /* renamed from: k  reason: collision with root package name */
    public final h f50760k;

    /* renamed from: l  reason: collision with root package name */
    public final h f50761l;

    /* renamed from: m  reason: collision with root package name */
    public final h f50762m;

    /* renamed from: n  reason: collision with root package name */
    public final h f50763n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f50764o;

    public q(C4.e eVar) {
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        h hVar;
        h hVar2;
        C4.c cVar = eVar.f2670a;
        if (cVar == null) {
            eVar2 = null;
        } else {
            eVar2 = cVar.s();
        }
        this.f50755f = (k) eVar2;
        C4.f fVar = eVar.f2671b;
        if (fVar == null) {
            eVar3 = null;
        } else {
            eVar3 = fVar.s();
        }
        this.f50756g = eVar3;
        C4.a aVar = eVar.f2672c;
        if (aVar == null) {
            eVar4 = null;
        } else {
            eVar4 = aVar.s();
        }
        this.f50757h = eVar4;
        C4.b bVar = eVar.f2673d;
        if (bVar == null) {
            eVar5 = null;
        } else {
            eVar5 = bVar.s();
        }
        this.f50758i = (h) eVar5;
        C4.b bVar2 = eVar.f2675f;
        if (bVar2 == null) {
            hVar = null;
        } else {
            hVar = (h) bVar2.s();
        }
        this.f50760k = hVar;
        this.f50764o = eVar.f2679j;
        if (hVar != null) {
            this.f50751b = new Matrix();
            this.f50752c = new Matrix();
            this.f50753d = new Matrix();
            this.f50754e = new float[9];
        } else {
            this.f50751b = null;
            this.f50752c = null;
            this.f50753d = null;
            this.f50754e = null;
        }
        C4.b bVar3 = eVar.f2676g;
        if (bVar3 == null) {
            hVar2 = null;
        } else {
            hVar2 = (h) bVar3.s();
        }
        this.f50761l = hVar2;
        C4.a aVar2 = eVar.f2674e;
        if (aVar2 != null) {
            this.f50759j = aVar2.s();
        }
        C4.b bVar4 = eVar.f2677h;
        if (bVar4 != null) {
            this.f50762m = (h) bVar4.s();
        } else {
            this.f50762m = null;
        }
        C4.b bVar5 = eVar.f2678i;
        if (bVar5 != null) {
            this.f50763n = (h) bVar5.s();
        } else {
            this.f50763n = null;
        }
    }

    public final void a(E4.b bVar) {
        bVar.d(this.f50759j);
        bVar.d(this.f50762m);
        bVar.d(this.f50763n);
        bVar.d(this.f50755f);
        bVar.d(this.f50756g);
        bVar.d(this.f50757h);
        bVar.d(this.f50758i);
        bVar.d(this.f50760k);
        bVar.d(this.f50761l);
    }

    public final void b(AbstractC6541a abstractC6541a) {
        e eVar = this.f50759j;
        if (eVar != null) {
            eVar.a(abstractC6541a);
        }
        h hVar = this.f50762m;
        if (hVar != null) {
            hVar.a(abstractC6541a);
        }
        h hVar2 = this.f50763n;
        if (hVar2 != null) {
            hVar2.a(abstractC6541a);
        }
        k kVar = this.f50755f;
        if (kVar != null) {
            kVar.a(abstractC6541a);
        }
        e eVar2 = this.f50756g;
        if (eVar2 != null) {
            eVar2.a(abstractC6541a);
        }
        e eVar3 = this.f50757h;
        if (eVar3 != null) {
            eVar3.a(abstractC6541a);
        }
        h hVar3 = this.f50758i;
        if (hVar3 != null) {
            hVar3.a(abstractC6541a);
        }
        h hVar4 = this.f50760k;
        if (hVar4 != null) {
            hVar4.a(abstractC6541a);
        }
        h hVar5 = this.f50761l;
        if (hVar5 != null) {
            hVar5.a(abstractC6541a);
        }
    }

    public final void c() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f50754e[i10] = 0.0f;
        }
    }

    public final Matrix d() {
        h hVar;
        PointF pointF;
        J4.b bVar;
        float f6;
        float f10;
        PointF pointF2;
        Matrix matrix = this.f50750a;
        matrix.reset();
        e eVar = this.f50756g;
        if (eVar != null && (pointF2 = (PointF) eVar.d()) != null) {
            float f11 = pointF2.x;
            if (f11 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f11, pointF2.y);
            }
        }
        if (this.f50764o) {
            if (eVar != null) {
                float f12 = eVar.f50723d;
                PointF pointF3 = (PointF) eVar.d();
                float f13 = pointF3.x;
                float f14 = pointF3.y;
                eVar.g(1.0E-4f + f12);
                PointF pointF4 = (PointF) eVar.d();
                eVar.g(f12);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f14, pointF4.x - f13)));
            }
        } else {
            h hVar2 = this.f50758i;
            if (hVar2 != null) {
                float h10 = hVar2.h();
                if (h10 != 0.0f) {
                    matrix.preRotate(h10);
                }
            }
        }
        if (this.f50760k != null) {
            h hVar3 = this.f50761l;
            if (hVar3 == null) {
                f6 = 0.0f;
            } else {
                f6 = (float) Math.cos(Math.toRadians((-hVar3.h()) + 90.0f));
            }
            if (hVar3 == null) {
                f10 = 1.0f;
            } else {
                f10 = (float) Math.sin(Math.toRadians((-hVar3.h()) + 90.0f));
            }
            c();
            float[] fArr = this.f50754e;
            fArr[0] = f6;
            fArr[1] = f10;
            float f15 = -f10;
            fArr[3] = f15;
            fArr[4] = f6;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f50751b;
            matrix2.setValues(fArr);
            c();
            fArr[0] = 1.0f;
            fArr[3] = (float) Math.tan(Math.toRadians(hVar.h()));
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f50752c;
            matrix3.setValues(fArr);
            c();
            fArr[0] = f6;
            fArr[1] = f15;
            fArr[3] = f10;
            fArr[4] = f6;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f50753d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar2 = this.f50757h;
        if (eVar2 != null && (bVar = (J4.b) eVar2.d()) != null) {
            float f16 = bVar.f8854a;
            if (f16 != 1.0f || bVar.f8855b != 1.0f) {
                matrix.preScale(f16, bVar.f8855b);
            }
        }
        k kVar = this.f50755f;
        if (kVar != null && (pointF = (PointF) kVar.d()) != null) {
            float f17 = pointF.x;
            if (f17 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f17, -pointF.y);
            }
        }
        return matrix;
    }

    public final Matrix e(float f6) {
        PointF pointF;
        J4.b bVar;
        float f10;
        e eVar = this.f50756g;
        PointF pointF2 = null;
        if (eVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) eVar.d();
        }
        e eVar2 = this.f50757h;
        if (eVar2 == null) {
            bVar = null;
        } else {
            bVar = (J4.b) eVar2.d();
        }
        Matrix matrix = this.f50750a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f6, pointF.y * f6);
        }
        if (bVar != null) {
            double d10 = f6;
            matrix.preScale((float) Math.pow(bVar.f8854a, d10), (float) Math.pow(bVar.f8855b, d10));
        }
        h hVar = this.f50758i;
        if (hVar != null) {
            float floatValue = ((Float) hVar.d()).floatValue();
            k kVar = this.f50755f;
            if (kVar != null) {
                pointF2 = (PointF) kVar.d();
            }
            float f11 = floatValue * f6;
            float f12 = 0.0f;
            if (pointF2 == null) {
                f10 = 0.0f;
            } else {
                f10 = pointF2.x;
            }
            if (pointF2 != null) {
                f12 = pointF2.y;
            }
            matrix.preRotate(f11, f10, f12);
        }
        return matrix;
    }
}
