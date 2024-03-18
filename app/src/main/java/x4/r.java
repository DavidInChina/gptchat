package x4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class r extends b {

    /* renamed from: q  reason: collision with root package name */
    public final boolean f48886q;

    /* renamed from: r  reason: collision with root package name */
    public final y4.e f48887r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(v4.l lVar, E4.b bVar, D4.o oVar) {
        super(lVar, bVar, r5, r6, oVar.f3410h, oVar.f3406d, oVar.f3407e, oVar.f3404b, oVar.f3403a);
        Paint.Cap cap;
        Paint.Join join;
        int f6 = AbstractC6708l.f(oVar.f3408f);
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
        int f10 = AbstractC6708l.f(oVar.f3409g);
        if (f10 != 0) {
            if (f10 != 1) {
                if (f10 != 2) {
                    join = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
            } else {
                join = Paint.Join.ROUND;
            }
        } else {
            join = Paint.Join.MITER;
        }
        Paint.Join join2 = join;
        this.f48886q = oVar.f3411i;
        y4.e s10 = oVar.f3405c.s();
        this.f48887r = s10;
        s10.a(this);
        bVar.d(s10);
    }

    @Override // x4.b, x4.e
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        if (this.f48886q) {
            return;
        }
        y4.f fVar = (y4.f) this.f48887r;
        this.f48774i.setColor(fVar.h(fVar.f50722c.c(), fVar.b()));
        super.e(canvas, matrix, i10);
    }
}
