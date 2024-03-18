package f8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import e8.C2807a;

/* loaded from: classes2.dex */
public final class n extends s {

    /* renamed from: c  reason: collision with root package name */
    public final p f29737c;

    public n(p pVar) {
        this.f29737c = pVar;
    }

    @Override // f8.s
    public final void a(Matrix matrix, C2807a c2807a, int i10, Canvas canvas) {
        boolean z10;
        p pVar = this.f29737c;
        float f6 = pVar.f29746f;
        float f10 = pVar.f29747g;
        RectF rectF = new RectF(pVar.f29742b, pVar.f29743c, pVar.f29744d, pVar.f29745e);
        c2807a.getClass();
        if (f10 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = c2807a.f29041g;
        int[] iArr = C2807a.f29033k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = c2807a.f29040f;
            iArr[2] = c2807a.f29039e;
            iArr[3] = c2807a.f29038d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f10);
            path.close();
            float f11 = -i10;
            rectF.inset(f11, f11);
            iArr[0] = 0;
            iArr[1] = c2807a.f29038d;
            iArr[2] = c2807a.f29039e;
            iArr[3] = c2807a.f29040f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f12 = 1.0f - (i10 / width);
            float[] fArr = C2807a.f29034l;
            fArr[1] = f12;
            fArr[2] = ((1.0f - f12) / 2.0f) + f12;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c2807a.f29036b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c2807a.f29042h);
            }
            canvas.drawArc(rectF, f6, f10, true, paint);
            canvas.restore();
        }
    }
}
