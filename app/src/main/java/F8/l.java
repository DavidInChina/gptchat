package f8;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final t[] f29723a = new t[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f29724b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f29725c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f29726d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f29727e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f29728f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final t f29729g = new t();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f29730h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f29731i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f29732j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f29733k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f29734l = true;

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f29723a[i10] = new t();
            this.f29724b[i10] = new Matrix();
            this.f29725c[i10] = new Matrix();
        }
    }

    public final void a(j jVar, float f6, RectF rectF, S4.o oVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        e eVar;
        Path path2;
        S4.o oVar2;
        c cVar;
        AbstractC4828h abstractC4828h;
        int i11;
        l lVar = this;
        S4.o oVar3 = oVar;
        Path path3 = path;
        path.rewind();
        Path path4 = lVar.f29727e;
        path4.rewind();
        Path path5 = lVar.f29728f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i12 = 0;
        while (true) {
            i10 = 4;
            matrixArr = lVar.f29725c;
            fArr = lVar.f29730h;
            matrixArr2 = lVar.f29724b;
            tVarArr = lVar.f29723a;
            if (i12 >= 4) {
                break;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        cVar = jVar.f29715f;
                    } else {
                        cVar = jVar.f29714e;
                    }
                } else {
                    cVar = jVar.f29717h;
                }
            } else {
                cVar = jVar.f29716g;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        abstractC4828h = jVar.f29711b;
                    } else {
                        abstractC4828h = jVar.f29710a;
                    }
                } else {
                    abstractC4828h = jVar.f29713d;
                }
            } else {
                abstractC4828h = jVar.f29712c;
            }
            t tVar = tVarArr[i12];
            abstractC4828h.getClass();
            abstractC4828h.O(f6, cVar.a(rectF), tVar);
            int i13 = i12 + 1;
            float f10 = (i13 % 4) * 90;
            matrixArr2[i12].reset();
            PointF pointF = lVar.f29726d;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        i11 = i13;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i11 = i13;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i11 = i13;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i11 = i13;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i12].setTranslate(pointF.x, pointF.y);
            matrixArr2[i12].preRotate(f10);
            t tVar2 = tVarArr[i12];
            fArr[0] = tVar2.f29755c;
            fArr[1] = tVar2.f29756d;
            matrixArr2[i12].mapPoints(fArr);
            matrixArr[i12].reset();
            matrixArr[i12].setTranslate(fArr[0], fArr[1]);
            matrixArr[i12].preRotate(f10);
            i12 = i11;
        }
        int i14 = 0;
        while (i14 < i10) {
            t tVar3 = tVarArr[i14];
            fArr[0] = tVar3.f29753a;
            fArr[1] = tVar3.f29754b;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 == 0) {
                path3.moveTo(fArr[0], fArr[1]);
            } else {
                path3.lineTo(fArr[0], fArr[1]);
            }
            tVarArr[i14].b(matrixArr2[i14], path3);
            if (oVar3 != null) {
                t tVar4 = tVarArr[i14];
                Matrix matrix = matrixArr2[i14];
                BitSet bitSet = ((g) oVar3.f16184Z).f29691i0;
                tVar4.getClass();
                bitSet.set(i14, false);
                s[] sVarArr = ((g) oVar3.f16184Z).f29689Z;
                tVar4.a(tVar4.f29758f);
                sVarArr[i14] = new m(new ArrayList(tVar4.f29760h), new Matrix(matrix));
            }
            int i15 = i14 + 1;
            int i16 = i15 % 4;
            t tVar5 = tVarArr[i14];
            fArr[0] = tVar5.f29755c;
            fArr[1] = tVar5.f29756d;
            matrixArr2[i14].mapPoints(fArr);
            t tVar6 = tVarArr[i16];
            float f11 = tVar6.f29753a;
            float[] fArr2 = lVar.f29731i;
            fArr2[0] = f11;
            fArr2[1] = tVar6.f29754b;
            matrixArr2[i16].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i14];
            fArr[0] = tVar7.f29755c;
            fArr[1] = tVar7.f29756d;
            matrixArr2[i14].mapPoints(fArr);
            if (i14 != 1 && i14 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            t tVar8 = lVar.f29729g;
            tVar8.d(0.0f, 270.0f, 0.0f);
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        eVar = jVar.f29719j;
                    } else {
                        eVar = jVar.f29718i;
                    }
                } else {
                    eVar = jVar.f29721l;
                }
            } else {
                eVar = jVar.f29720k;
            }
            eVar.getClass();
            tVar8.c(max, 0.0f);
            Path path6 = lVar.f29732j;
            path6.reset();
            tVar8.b(matrixArr[i14], path6);
            if (lVar.f29734l && (lVar.b(path6, i14) || lVar.b(path6, i16))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = tVar8.f29753a;
                fArr[1] = tVar8.f29754b;
                matrixArr[i14].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i14], path4);
                oVar2 = oVar;
                path2 = path;
            } else {
                path2 = path;
                tVar8.b(matrixArr[i14], path2);
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                Matrix matrix2 = matrixArr[i14];
                ((g) oVar2.f16184Z).f29691i0.set(i14 + 4, false);
                s[] sVarArr2 = ((g) oVar2.f16184Z).f29690h0;
                tVar8.a(tVar8.f29758f);
                sVarArr2[i14] = new m(new ArrayList(tVar8.f29760h), new Matrix(matrix2));
            }
            lVar = this;
            path3 = path2;
            i14 = i15;
            i10 = 4;
            oVar3 = oVar2;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (!path4.isEmpty()) {
            path7.op(path4, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f29733k;
        path2.reset();
        this.f29723a[i10].b(this.f29724b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
