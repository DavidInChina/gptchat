package r0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import id.AbstractC3557B;
import q0.C5251c;
import q0.C5252d;

/* renamed from: r0.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5339c implements AbstractC5352p {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f44230a = AbstractC5340d.f44233a;

    /* renamed from: b  reason: collision with root package name */
    public Rect f44231b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f44232c;

    @Override // r0.AbstractC5352p
    public final void a(float f6, float f10) {
        this.f44230a.scale(f6, f10);
    }

    @Override // r0.AbstractC5352p
    public final void b(float f6) {
        this.f44230a.rotate(f6);
    }

    @Override // r0.AbstractC5352p
    public final void c(long j6, long j10, C5342f c5342f) {
        this.f44230a.drawLine(C5251c.d(j6), C5251c.e(j6), C5251c.d(j10), C5251c.e(j10), c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void d(C5252d c5252d, C5342f c5342f) {
        Canvas canvas = this.f44230a;
        Paint paint = c5342f.f44235a;
        canvas.saveLayer(c5252d.f43625a, c5252d.f43626b, c5252d.f43627c, c5252d.f43628d, paint, 31);
    }

    @Override // r0.AbstractC5352p
    public final void e(E e10, C5342f c5342f) {
        Canvas canvas = this.f44230a;
        if (e10 instanceof C5344h) {
            canvas.drawPath(((C5344h) e10).f44241a, c5342f.f44235a);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // r0.AbstractC5352p
    public final void f(z zVar, long j6, C5342f c5342f) {
        this.f44230a.drawBitmap(androidx.compose.ui.graphics.a.j(zVar), C5251c.d(j6), C5251c.e(j6), c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void g(E e10, int i10) {
        Region.Op op;
        Canvas canvas = this.f44230a;
        if (e10 instanceof C5344h) {
            Path path = ((C5344h) e10).f44241a;
            if (i10 == 0) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(path, op);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // r0.AbstractC5352p
    public final void h() {
        this.f44230a.save();
    }

    @Override // r0.AbstractC5352p
    public final void i() {
        G.a(this.f44230a, false);
    }

    @Override // r0.AbstractC5352p
    public final void j(float f6, float f10, float f11, float f12, float f13, float f14, C5342f c5342f) {
        this.f44230a.drawRoundRect(f6, f10, f11, f12, f13, f14, c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void k(float f6, long j6, C5342f c5342f) {
        this.f44230a.drawCircle(C5251c.d(j6), C5251c.e(j6), f6, c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void l(float[] fArr) {
        float f6;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                if (fArr[(i10 * 4) + i11] != f6) {
                    Matrix matrix = new Matrix();
                    androidx.compose.ui.graphics.a.p(matrix, fArr);
                    this.f44230a.concat(matrix);
                    return;
                }
            }
        }
    }

    @Override // r0.AbstractC5352p
    public final void m(z zVar, long j6, long j10, long j11, long j12, C5342f c5342f) {
        if (this.f44231b == null) {
            this.f44231b = new Rect();
            this.f44232c = new Rect();
        }
        Canvas canvas = this.f44230a;
        Bitmap j13 = androidx.compose.ui.graphics.a.j(zVar);
        Rect rect = this.f44231b;
        AbstractC3557B.Z(rect);
        int i10 = Z0.i.f22798c;
        int i11 = (int) (j6 >> 32);
        rect.left = i11;
        int i12 = (int) (j6 & 4294967295L);
        rect.top = i12;
        rect.right = i11 + ((int) (j10 >> 32));
        rect.bottom = i12 + ((int) (j10 & 4294967295L));
        Rect rect2 = this.f44232c;
        AbstractC3557B.Z(rect2);
        int i13 = (int) (j11 >> 32);
        rect2.left = i13;
        int i14 = (int) (j11 & 4294967295L);
        rect2.top = i14;
        rect2.right = i13 + ((int) (j12 >> 32));
        rect2.bottom = i14 + ((int) (j12 & 4294967295L));
        canvas.drawBitmap(j13, rect, rect2, c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void n(float f6, float f10, float f11, float f12, C5342f c5342f) {
        this.f44230a.drawRect(f6, f10, f11, f12, c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void o(float f6, float f10, float f11, float f12, int i10) {
        Region.Op op;
        Canvas canvas = this.f44230a;
        if (i10 == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f6, f10, f11, f12, op);
    }

    @Override // r0.AbstractC5352p
    public final void p(float f6, float f10) {
        this.f44230a.translate(f6, f10);
    }

    @Override // r0.AbstractC5352p
    public final void q() {
        this.f44230a.restore();
    }

    @Override // r0.AbstractC5352p
    public final void r(float f6, float f10, float f11, float f12, float f13, float f14, C5342f c5342f) {
        this.f44230a.drawArc(f6, f10, f11, f12, f13, f14, false, c5342f.f44235a);
    }

    @Override // r0.AbstractC5352p
    public final void s(C5252d c5252d, C5342f c5342f) {
        n(c5252d.f43625a, c5252d.f43626b, c5252d.f43627c, c5252d.f43628d, c5342f);
    }

    @Override // r0.AbstractC5352p
    public final void t(C5252d c5252d, int i10) {
        o(c5252d.f43625a, c5252d.f43626b, c5252d.f43627c, c5252d.f43628d, i10);
    }

    @Override // r0.AbstractC5352p
    public final void u() {
        G.a(this.f44230a, true);
    }

    public final Canvas v() {
        return this.f44230a;
    }

    public final void w(Canvas canvas) {
        this.f44230a = canvas;
    }
}
