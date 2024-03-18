package r0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import id.AbstractC3557B;
import q0.AbstractC5249a;
import q0.C5253e;

/* renamed from: r0.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5344h implements E {

    /* renamed from: a  reason: collision with root package name */
    public final Path f44241a;

    /* renamed from: b  reason: collision with root package name */
    public RectF f44242b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f44243c;

    /* renamed from: d  reason: collision with root package name */
    public Matrix f44244d;

    public C5344h(Path path) {
        this.f44241a = path;
    }

    public final void a(C5253e c5253e) {
        if (this.f44242b == null) {
            this.f44242b = new RectF();
        }
        RectF rectF = this.f44242b;
        AbstractC3557B.Z(rectF);
        rectF.set(c5253e.f43629a, c5253e.f43630b, c5253e.f43631c, c5253e.f43632d);
        if (this.f44243c == null) {
            this.f44243c = new float[8];
        }
        float[] fArr = this.f44243c;
        AbstractC3557B.Z(fArr);
        long j6 = c5253e.f43633e;
        fArr[0] = AbstractC5249a.b(j6);
        fArr[1] = AbstractC5249a.c(j6);
        long j10 = c5253e.f43634f;
        fArr[2] = AbstractC5249a.b(j10);
        fArr[3] = AbstractC5249a.c(j10);
        long j11 = c5253e.f43635g;
        fArr[4] = AbstractC5249a.b(j11);
        fArr[5] = AbstractC5249a.c(j11);
        long j12 = c5253e.f43636h;
        fArr[6] = AbstractC5249a.b(j12);
        fArr[7] = AbstractC5249a.c(j12);
        RectF rectF2 = this.f44242b;
        AbstractC3557B.Z(rectF2);
        float[] fArr2 = this.f44243c;
        AbstractC3557B.Z(fArr2);
        this.f44241a.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void b(float f6, float f10) {
        this.f44241a.lineTo(f6, f10);
    }

    public final boolean c(E e10, E e11, int i10) {
        Path.Op op;
        if (i10 == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i10 == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (e10 instanceof C5344h) {
            C5344h c5344h = (C5344h) e10;
            if (e11 instanceof C5344h) {
                return this.f44241a.op(c5344h.f44241a, ((C5344h) e11).f44241a, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void d() {
        this.f44241a.reset();
    }

    public final void e(int i10) {
        Path.FillType fillType;
        if (i10 == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.f44241a.setFillType(fillType);
    }
}
