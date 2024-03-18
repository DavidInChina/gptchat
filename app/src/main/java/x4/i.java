package x4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import w.C6066m;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f48827q;

    /* renamed from: r  reason: collision with root package name */
    public final C6066m f48828r;

    /* renamed from: s  reason: collision with root package name */
    public final C6066m f48829s;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f48830t;

    /* renamed from: u  reason: collision with root package name */
    public final int f48831u;

    /* renamed from: v  reason: collision with root package name */
    public final int f48832v;

    /* renamed from: w  reason: collision with root package name */
    public final y4.e f48833w;

    /* renamed from: x  reason: collision with root package name */
    public final y4.e f48834x;

    /* renamed from: y  reason: collision with root package name */
    public final y4.e f48835y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(v4.l lVar, E4.b bVar, D4.e eVar) {
        super(lVar, bVar, r3, r4, eVar.f3362i, eVar.f3356c, eVar.f3359f, eVar.f3363j, eVar.f3364k);
        Paint.Cap cap;
        Paint.Join join;
        Paint.Join join2;
        int f6 = AbstractC6708l.f(eVar.f3360g);
        if (f6 != 0) {
            if (f6 != 1) {
                cap = Paint.Cap.SQUARE;
            } else {
                cap = Paint.Cap.ROUND;
            }
        } else {
            cap = Paint.Cap.BUTT;
        }
        Paint.Cap cap2 = cap;
        int f10 = AbstractC6708l.f(eVar.f3361h);
        if (f10 != 0) {
            if (f10 != 1) {
                if (f10 != 2) {
                    join = null;
                    this.f48828r = new C6066m((Object) null);
                    this.f48829s = new C6066m((Object) null);
                    this.f48830t = new RectF();
                    this.f48831u = eVar.f3354a;
                    this.f48827q = eVar.f3365l;
                    this.f48832v = (int) (lVar.f47208Y.b() / 32.0f);
                    y4.e s10 = eVar.f3355b.s();
                    this.f48833w = s10;
                    s10.a(this);
                    bVar.d(s10);
                    y4.e s11 = eVar.f3357d.s();
                    this.f48834x = s11;
                    s11.a(this);
                    bVar.d(s11);
                    y4.e s12 = eVar.f3358e.s();
                    this.f48835y = s12;
                    s12.a(this);
                    bVar.d(s12);
                }
                join2 = Paint.Join.BEVEL;
            } else {
                join2 = Paint.Join.ROUND;
            }
        } else {
            join2 = Paint.Join.MITER;
        }
        join = join2;
        this.f48828r = new C6066m((Object) null);
        this.f48829s = new C6066m((Object) null);
        this.f48830t = new RectF();
        this.f48831u = eVar.f3354a;
        this.f48827q = eVar.f3365l;
        this.f48832v = (int) (lVar.f47208Y.b() / 32.0f);
        y4.e s102 = eVar.f3355b.s();
        this.f48833w = s102;
        s102.a(this);
        bVar.d(s102);
        y4.e s112 = eVar.f3357d.s();
        this.f48834x = s112;
        s112.a(this);
        bVar.d(s112);
        y4.e s122 = eVar.f3358e.s();
        this.f48835y = s122;
        s122.a(this);
        bVar.d(s122);
    }

    public final int d() {
        int i10;
        float f6 = this.f48834x.f50723d;
        int i11 = this.f48832v;
        int round = Math.round(f6 * i11);
        int round2 = Math.round(this.f48835y.f50723d * i11);
        int round3 = Math.round(this.f48833w.f50723d * i11);
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

    @Override // x4.b, x4.e
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        LinearGradient linearGradient;
        if (this.f48827q) {
            return;
        }
        c(this.f48830t, matrix, false);
        int i11 = this.f48831u;
        y4.e eVar = this.f48833w;
        y4.e eVar2 = this.f48835y;
        y4.e eVar3 = this.f48834x;
        if (i11 == 1) {
            long d10 = d();
            C6066m c6066m = this.f48828r;
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
            C6066m c6066m2 = this.f48829s;
            RadialGradient radialGradient = (RadialGradient) c6066m2.d(d11);
            linearGradient = radialGradient;
            if (radialGradient == null) {
                PointF pointF3 = (PointF) eVar3.d();
                PointF pointF4 = (PointF) eVar2.d();
                D4.c cVar2 = (D4.c) eVar.d();
                int[] iArr = cVar2.f3346b;
                float f6 = pointF3.x;
                float f10 = pointF3.y;
                float f11 = pointF4.x;
                RadialGradient radialGradient2 = new RadialGradient(f6, f10, (float) Math.hypot(f11 - f6, pointF4.y - f10), iArr, cVar2.f3345a, Shader.TileMode.CLAMP);
                c6066m2.h(d11, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        this.f48774i.setShader(linearGradient);
        super.e(canvas, matrix, i10);
    }
}
