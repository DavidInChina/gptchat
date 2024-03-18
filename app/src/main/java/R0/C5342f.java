package r0;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* renamed from: r0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5342f {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f44235a;

    /* renamed from: b  reason: collision with root package name */
    public int f44236b = 3;

    /* renamed from: c  reason: collision with root package name */
    public Shader f44237c;

    /* renamed from: d  reason: collision with root package name */
    public C5347k f44238d;

    public C5342f(Paint paint) {
        this.f44235a = paint;
    }

    public final int a() {
        if (!this.f44235a.isFilterBitmap()) {
            return 0;
        }
        return 1;
    }

    public final int b() {
        int i10;
        Paint.Cap strokeCap = this.f44235a.getStrokeCap();
        if (strokeCap == null) {
            i10 = -1;
        } else {
            i10 = AbstractC5343g.f44239a[strokeCap.ordinal()];
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return 0;
        }
        return 2;
    }

    public final int c() {
        int i10;
        Paint.Join strokeJoin = this.f44235a.getStrokeJoin();
        if (strokeJoin == null) {
            i10 = -1;
        } else {
            i10 = AbstractC5343g.f44240b[strokeJoin.ordinal()];
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 != 3) {
            return 0;
        }
        return 1;
    }

    public final void d(float f6) {
        this.f44235a.setAlpha((int) Math.rint(f6 * 255.0f));
    }

    public final void e(int i10) {
        if (!G.b(this.f44236b, i10)) {
            this.f44236b = i10;
            int i11 = Build.VERSION.SDK_INT;
            Paint paint = this.f44235a;
            if (i11 >= 29) {
                Q.f44228a.a(paint, i10);
            } else {
                paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.u(i10)));
            }
        }
    }

    public final void f(long j6) {
        this.f44235a.setColor(androidx.compose.ui.graphics.a.s(j6));
    }

    public final void g(C5347k c5347k) {
        ColorFilter colorFilter;
        this.f44238d = c5347k;
        if (c5347k != null) {
            colorFilter = c5347k.f44247a;
        } else {
            colorFilter = null;
        }
        this.f44235a.setColorFilter(colorFilter);
    }

    public final void h(int i10) {
        this.f44235a.setFilterBitmap(!G.d(i10, 0));
    }

    public final void i(Shader shader) {
        this.f44237c = shader;
        this.f44235a.setShader(shader);
    }

    public final void j(int i10) {
        Paint.Cap cap;
        if (G.f(i10, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (G.f(i10, 1)) {
            cap = Paint.Cap.ROUND;
        } else if (G.f(i10, 0)) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        this.f44235a.setStrokeCap(cap);
    }

    public final void k(int i10) {
        Paint.Join join;
        if (G.g(i10, 0)) {
            join = Paint.Join.MITER;
        } else if (G.g(i10, 2)) {
            join = Paint.Join.BEVEL;
        } else if (G.g(i10, 1)) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        this.f44235a.setStrokeJoin(join);
    }

    public final void l(float f6) {
        this.f44235a.setStrokeWidth(f6);
    }

    public final void m(int i10) {
        Paint.Style style;
        if (i10 == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        this.f44235a.setStyle(style);
    }
}
