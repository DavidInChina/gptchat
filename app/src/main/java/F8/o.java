package f8;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import e8.C2807a;

/* loaded from: classes2.dex */
public final class o extends s {

    /* renamed from: c  reason: collision with root package name */
    public final q f29738c;

    /* renamed from: d  reason: collision with root package name */
    public final float f29739d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29740e;

    public o(q qVar, float f6, float f10) {
        this.f29738c = qVar;
        this.f29739d = f6;
        this.f29740e = f10;
    }

    @Override // f8.s
    public final void a(Matrix matrix, C2807a c2807a, int i10, Canvas canvas) {
        q qVar = this.f29738c;
        float f6 = qVar.f29749c;
        float f10 = this.f29740e;
        float f11 = qVar.f29748b;
        float f12 = this.f29739d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f10, f11 - f12), 0.0f);
        Matrix matrix2 = this.f29752a;
        matrix2.set(matrix);
        matrix2.preTranslate(f12, f10);
        matrix2.preRotate(b());
        c2807a.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = C2807a.f29031i;
        iArr[0] = c2807a.f29040f;
        iArr[1] = c2807a.f29039e;
        iArr[2] = c2807a.f29038d;
        Paint paint = c2807a.f29037c;
        float f13 = rectF.left;
        paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, C2807a.f29032j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f29738c;
        return (float) Math.toDegrees(Math.atan((qVar.f29749c - this.f29740e) / (qVar.f29748b - this.f29739d)));
    }
}
