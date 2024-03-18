package x4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import w4.C6119a;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public abstract class b implements AbstractC6541a, c, e {

    /* renamed from: e  reason: collision with root package name */
    public final v4.l f48770e;

    /* renamed from: f  reason: collision with root package name */
    public final E4.b f48771f;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f48773h;

    /* renamed from: i  reason: collision with root package name */
    public final C6119a f48774i;

    /* renamed from: j  reason: collision with root package name */
    public final y4.h f48775j;

    /* renamed from: k  reason: collision with root package name */
    public final y4.e f48776k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f48777l;

    /* renamed from: m  reason: collision with root package name */
    public final y4.h f48778m;

    /* renamed from: n  reason: collision with root package name */
    public final y4.h f48779n;

    /* renamed from: p  reason: collision with root package name */
    public final y4.g f48781p;

    /* renamed from: a  reason: collision with root package name */
    public final PathMeasure f48766a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    public final Path f48767b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f48768c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f48769d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f48772g = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public float f48780o = 0.0f;

    /* JADX WARN: Type inference failed for: r0v5, types: [w4.a, android.graphics.Paint] */
    public b(v4.l lVar, E4.b bVar, Paint.Cap cap, Paint.Join join, float f6, C4.a aVar, C4.b bVar2, List list, C4.b bVar3) {
        ?? paint = new Paint(1);
        this.f48774i = paint;
        this.f48770e = lVar;
        this.f48771f = bVar;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f6);
        this.f48776k = aVar.s();
        this.f48775j = (y4.h) bVar2.s();
        if (bVar3 == null) {
            this.f48778m = null;
        } else {
            this.f48778m = (y4.h) bVar3.s();
        }
        this.f48777l = new ArrayList(list.size());
        this.f48773h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f48777l.add(((C4.b) list.get(i10)).s());
        }
        bVar.d(this.f48776k);
        bVar.d(this.f48775j);
        for (int i11 = 0; i11 < this.f48777l.size(); i11++) {
            bVar.d((y4.e) this.f48777l.get(i11));
        }
        y4.h hVar = this.f48778m;
        if (hVar != null) {
            bVar.d(hVar);
        }
        this.f48776k.a(this);
        this.f48775j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((y4.e) this.f48777l.get(i12)).a(this);
        }
        y4.h hVar2 = this.f48778m;
        if (hVar2 != null) {
            hVar2.a(this);
        }
        if (bVar.j() != null) {
            y4.e s10 = ((C4.b) bVar.j().f8729Y).s();
            this.f48779n = (y4.h) s10;
            s10.a(this);
            bVar.d(s10);
        }
        if (bVar.k() != null) {
            this.f48781p = new y4.g(this, bVar, bVar.k());
        }
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48770e.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        C6274a c6274a = null;
        s sVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.f48890c == 2) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f48772g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.f48890c == 2) {
                    if (c6274a != null) {
                        arrayList.add(c6274a);
                    }
                    C6274a c6274a2 = new C6274a(sVar3);
                    sVar3.d(this);
                    c6274a = c6274a2;
                }
            }
            if (cVar2 instanceof l) {
                if (c6274a == null) {
                    c6274a = new C6274a(sVar);
                }
                c6274a.f48764a.add((l) cVar2);
            }
        }
        if (c6274a != null) {
            arrayList.add(c6274a);
        }
    }

    @Override // x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f48767b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48772g;
            if (i10 < arrayList.size()) {
                C6274a c6274a = (C6274a) arrayList.get(i10);
                for (int i11 = 0; i11 < c6274a.f48764a.size(); i11++) {
                    path.addPath(((l) c6274a.f48764a.get(i11)).f(), matrix);
                }
                i10++;
            } else {
                RectF rectF2 = this.f48769d;
                path.computeBounds(rectF2, false);
                float h10 = this.f48775j.h() / 2.0f;
                rectF2.set(rectF2.left - h10, rectF2.top - h10, rectF2.right + h10, rectF2.bottom + h10);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    @Override // x4.e
    public void e(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        float f6;
        float f10;
        float f11;
        BlurMaskFilter blurMaskFilter;
        float[] fArr;
        float f12;
        b bVar = this;
        float[] fArr2 = (float[]) I4.g.f8058d.get();
        boolean z10 = false;
        fArr2[0] = 0.0f;
        int i12 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] != fArr2[2] && fArr2[1] != fArr2[3]) {
            y4.j jVar = (y4.j) bVar.f48776k;
            float h10 = (i10 / 255.0f) * jVar.h(jVar.f50722c.c(), jVar.b());
            float f13 = 100.0f;
            PointF pointF = I4.f.f8054a;
            int max = Math.max(0, Math.min(255, (int) ((h10 / 100.0f) * 255.0f)));
            C6119a c6119a = bVar.f48774i;
            c6119a.setAlpha(max);
            c6119a.setStrokeWidth(I4.g.d(matrix) * bVar.f48775j.h());
            if (c6119a.getStrokeWidth() <= 0.0f) {
                return;
            }
            ArrayList arrayList = bVar.f48777l;
            if (!arrayList.isEmpty()) {
                float d10 = I4.g.d(matrix);
                int i13 = 0;
                while (true) {
                    int size = arrayList.size();
                    fArr = bVar.f48773h;
                    if (i13 >= size) {
                        break;
                    }
                    float floatValue = ((Float) ((y4.e) arrayList.get(i13)).d()).floatValue();
                    fArr[i13] = floatValue;
                    if (i13 % 2 == 0) {
                        if (floatValue < 1.0f) {
                            fArr[i13] = 1.0f;
                        }
                    } else if (floatValue < 0.1f) {
                        fArr[i13] = 0.1f;
                    }
                    fArr[i13] = fArr[i13] * d10;
                    i13++;
                }
                y4.h hVar = bVar.f48778m;
                if (hVar == null) {
                    f12 = 0.0f;
                } else {
                    f12 = ((Float) hVar.d()).floatValue() * d10;
                }
                c6119a.setPathEffect(new DashPathEffect(fArr, f12));
            }
            y4.h hVar2 = bVar.f48779n;
            if (hVar2 != null) {
                float floatValue2 = ((Float) hVar2.d()).floatValue();
                if (floatValue2 == 0.0f) {
                    c6119a.setMaskFilter(null);
                } else if (floatValue2 != bVar.f48780o) {
                    E4.b bVar2 = bVar.f48771f;
                    if (bVar2.f4431A == floatValue2) {
                        blurMaskFilter = bVar2.f4432B;
                    } else {
                        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        bVar2.f4432B = blurMaskFilter2;
                        bVar2.f4431A = floatValue2;
                        blurMaskFilter = blurMaskFilter2;
                    }
                    c6119a.setMaskFilter(blurMaskFilter);
                }
                bVar.f48780o = floatValue2;
            }
            y4.g gVar = bVar.f48781p;
            if (gVar != null) {
                gVar.b(c6119a);
            }
            int i14 = 0;
            while (true) {
                ArrayList arrayList2 = bVar.f48772g;
                if (i14 < arrayList2.size()) {
                    C6274a c6274a = (C6274a) arrayList2.get(i14);
                    s sVar = c6274a.f48765b;
                    Path path = bVar.f48767b;
                    ArrayList arrayList3 = c6274a.f48764a;
                    if (sVar != null) {
                        path.reset();
                        for (int size2 = arrayList3.size() - i12; size2 >= 0; size2--) {
                            path.addPath(((l) arrayList3.get(size2)).f(), matrix);
                        }
                        s sVar2 = c6274a.f48765b;
                        float floatValue3 = ((Float) sVar2.f48891d.d()).floatValue() / f13;
                        float floatValue4 = ((Float) sVar2.f48892e.d()).floatValue() / f13;
                        float floatValue5 = ((Float) sVar2.f48893f.d()).floatValue() / 360.0f;
                        if (floatValue3 < 0.01f && floatValue4 > 0.99f) {
                            canvas.drawPath(path, c6119a);
                        } else {
                            PathMeasure pathMeasure = bVar.f48766a;
                            pathMeasure.setPath(path, z10);
                            float length = pathMeasure.getLength();
                            while (pathMeasure.nextContour()) {
                                length = pathMeasure.getLength() + length;
                            }
                            float f14 = floatValue5 * length;
                            float f15 = (floatValue3 * length) + f14;
                            float min = Math.min((floatValue4 * length) + f14, (f15 + length) - 1.0f);
                            int size3 = arrayList3.size() - i12;
                            float f16 = 0.0f;
                            while (size3 >= 0) {
                                Path path2 = bVar.f48768c;
                                path2.set(((l) arrayList3.get(size3)).f());
                                path2.transform(matrix);
                                pathMeasure.setPath(path2, z10);
                                float length2 = pathMeasure.getLength();
                                if (min > length) {
                                    float f17 = min - length;
                                    if (f17 < f16 + length2 && f16 < f17) {
                                        if (f15 > length) {
                                            f11 = (f15 - length) / length2;
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        I4.g.a(path2, f11, Math.min(f17 / length2, 1.0f), 0.0f);
                                        canvas.drawPath(path2, c6119a);
                                        f16 += length2;
                                        size3--;
                                        bVar = this;
                                        z10 = false;
                                    }
                                }
                                float f18 = f16 + length2;
                                if (f18 >= f15 && f16 <= min) {
                                    if (f18 <= min && f15 < f16) {
                                        canvas.drawPath(path2, c6119a);
                                    } else {
                                        if (f15 < f16) {
                                            f6 = 0.0f;
                                        } else {
                                            f6 = (f15 - f16) / length2;
                                        }
                                        if (min > f18) {
                                            f10 = 1.0f;
                                        } else {
                                            f10 = (min - f16) / length2;
                                        }
                                        I4.g.a(path2, f6, f10, 0.0f);
                                        canvas.drawPath(path2, c6119a);
                                    }
                                }
                                f16 += length2;
                                size3--;
                                bVar = this;
                                z10 = false;
                            }
                        }
                        i11 = 1;
                    } else {
                        path.reset();
                        i11 = 1;
                        for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                            path.addPath(((l) arrayList3.get(size4)).f(), matrix);
                        }
                        canvas.drawPath(path, c6119a);
                    }
                    i14++;
                    bVar = this;
                    i12 = i11;
                    z10 = false;
                    f13 = 100.0f;
                } else {
                    return;
                }
            }
        }
    }
}
