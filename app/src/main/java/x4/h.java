package x4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import v4.C5971a;
import w.C6066m;
import w4.C6119a;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class h implements e, AbstractC6541a, c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f48810a;

    /* renamed from: d  reason: collision with root package name */
    public final Path f48813d;

    /* renamed from: h  reason: collision with root package name */
    public final int f48817h;

    /* renamed from: i  reason: collision with root package name */
    public final y4.e f48818i;

    /* renamed from: j  reason: collision with root package name */
    public final y4.e f48819j;

    /* renamed from: k  reason: collision with root package name */
    public final y4.e f48820k;

    /* renamed from: l  reason: collision with root package name */
    public final y4.e f48821l;

    /* renamed from: m  reason: collision with root package name */
    public final v4.l f48822m;

    /* renamed from: n  reason: collision with root package name */
    public final int f48823n;

    /* renamed from: o  reason: collision with root package name */
    public final y4.h f48824o;

    /* renamed from: q  reason: collision with root package name */
    public final y4.g f48826q;

    /* renamed from: b  reason: collision with root package name */
    public final C6066m f48811b = new C6066m((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final C6066m f48812c = new C6066m((Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final C6119a f48814e = new Paint(1);

    /* renamed from: f  reason: collision with root package name */
    public final RectF f48815f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f48816g = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public float f48825p = 0.0f;

    /* JADX WARN: Type inference failed for: r1v1, types: [w4.a, android.graphics.Paint] */
    public h(v4.l lVar, C5971a c5971a, E4.b bVar, D4.d dVar) {
        Path path = new Path();
        this.f48813d = path;
        dVar.getClass();
        this.f48810a = dVar.f3353g;
        this.f48822m = lVar;
        this.f48817h = dVar.f3347a;
        path.setFillType(dVar.f3348b);
        this.f48823n = (int) (c5971a.b() / 32.0f);
        y4.e s10 = dVar.f3349c.s();
        this.f48818i = s10;
        s10.a(this);
        bVar.d(s10);
        y4.e s11 = dVar.f3350d.s();
        this.f48819j = s11;
        s11.a(this);
        bVar.d(s11);
        y4.e s12 = dVar.f3351e.s();
        this.f48820k = s12;
        s12.a(this);
        bVar.d(s12);
        y4.e s13 = dVar.f3352f.s();
        this.f48821l = s13;
        s13.a(this);
        bVar.d(s13);
        if (bVar.j() != null) {
            y4.e s14 = ((C4.b) bVar.j().f8729Y).s();
            this.f48824o = (y4.h) s14;
            s14.a(this);
            bVar.d(s14);
        }
        if (bVar.k() != null) {
            this.f48826q = new y4.g(this, bVar, bVar.k());
        }
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48822m.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof l) {
                this.f48816g.add((l) cVar);
            }
        }
    }

    @Override // x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f48813d;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48816g;
            if (i10 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i10)).f(), matrix);
                i10++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final int d() {
        int i10;
        float f6 = this.f48820k.f50723d;
        int i11 = this.f48823n;
        int round = Math.round(f6 * i11);
        int round2 = Math.round(this.f48821l.f50723d * i11);
        int round3 = Math.round(this.f48818i.f50723d * i11);
        if (round != 0) {
            i10 = 527 * round;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }

    @Override // x4.e
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        LinearGradient linearGradient;
        if (this.f48810a) {
            return;
        }
        Path path = this.f48813d;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f48816g;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((l) arrayList.get(i11)).f(), matrix);
            i11++;
        }
        path.computeBounds(this.f48815f, false);
        int i12 = this.f48817h;
        y4.e eVar = this.f48818i;
        y4.e eVar2 = this.f48821l;
        y4.e eVar3 = this.f48820k;
        if (i12 == 1) {
            long d10 = d();
            C6066m c6066m = this.f48811b;
            LinearGradient linearGradient2 = (LinearGradient) c6066m.d(d10);
            linearGradient = linearGradient2;
            if (linearGradient2 == null) {
                PointF pointF = (PointF) eVar3.d();
                PointF pointF2 = (PointF) eVar2.d();
                D4.c cVar = (D4.c) eVar.d();
                LinearGradient linearGradient3 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, cVar.f3346b, cVar.f3345a, Shader.TileMode.CLAMP);
                c6066m.h(d10, linearGradient3);
                linearGradient = linearGradient3;
            }
        } else {
            long d11 = d();
            C6066m c6066m2 = this.f48812c;
            RadialGradient radialGradient = (RadialGradient) c6066m2.d(d11);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) eVar3.d();
                PointF pointF4 = (PointF) eVar2.d();
                D4.c cVar2 = (D4.c) eVar.d();
                int[] iArr = cVar2.f3346b;
                float f6 = pointF3.x;
                float f10 = pointF3.y;
                float hypot = (float) Math.hypot(pointF4.x - f6, pointF4.y - f10);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f6, f10, hypot, iArr, cVar2.f3345a, Shader.TileMode.CLAMP);
                c6066m2.h(d11, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        C6119a c6119a = this.f48814e;
        c6119a.setShader(linearGradient);
        y4.h hVar = this.f48824o;
        if (hVar != null) {
            float floatValue = ((Float) hVar.d()).floatValue();
            if (floatValue == 0.0f) {
                c6119a.setMaskFilter(null);
            } else if (floatValue != this.f48825p) {
                c6119a.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f48825p = floatValue;
        }
        y4.g gVar = this.f48826q;
        if (gVar != null) {
            gVar.b(c6119a);
        }
        PointF pointF5 = I4.f.f8054a;
        c6119a.setAlpha(Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f48819j.d()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, c6119a);
    }
}
