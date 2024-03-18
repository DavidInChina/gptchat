package E4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import v4.l;
import w4.C6119a;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: D  reason: collision with root package name */
    public final C6119a f4498D;

    /* renamed from: G  reason: collision with root package name */
    public final e f4501G;

    /* renamed from: C  reason: collision with root package name */
    public final RectF f4497C = new RectF();

    /* renamed from: E  reason: collision with root package name */
    public final float[] f4499E = new float[8];

    /* renamed from: F  reason: collision with root package name */
    public final Path f4500F = new Path();

    /* JADX WARN: Type inference failed for: r2v2, types: [w4.a, android.graphics.Paint] */
    public h(l lVar, e eVar) {
        super(lVar, eVar);
        ?? paint = new Paint();
        this.f4498D = paint;
        this.f4501G = eVar;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(eVar.f4481l);
    }

    @Override // E4.b, x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        RectF rectF2 = this.f4497C;
        e eVar = this.f4501G;
        rectF2.set(0.0f, 0.0f, eVar.f4479j, eVar.f4480k);
        this.f4446n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // E4.b
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        e eVar = this.f4501G;
        int alpha = Color.alpha(eVar.f4481l);
        if (alpha == 0) {
            return;
        }
        C6119a c6119a = this.f4498D;
        c6119a.setColor(eVar.f4481l);
        y4.e eVar2 = this.f4455w.f50759j;
        if (eVar2 == null) {
            i11 = 100;
        } else {
            i11 = ((Integer) eVar2.d()).intValue();
        }
        int i12 = (int) ((((alpha / 255.0f) * i11) / 100.0f) * (i10 / 255.0f) * 255.0f);
        c6119a.setAlpha(i12);
        if (i12 > 0) {
            float[] fArr = this.f4499E;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f6 = eVar.f4479j;
            fArr[2] = f6;
            fArr[3] = 0.0f;
            fArr[4] = f6;
            float f10 = eVar.f4480k;
            fArr[5] = f10;
            fArr[6] = 0.0f;
            fArr[7] = f10;
            matrix.mapPoints(fArr);
            Path path = this.f4500F;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c6119a);
        }
    }
}
