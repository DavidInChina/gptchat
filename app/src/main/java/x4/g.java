package x4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import s1.AbstractC5520b;
import s1.AbstractC5525g;
import s1.AbstractC5526h;
import s1.EnumC5519a;
import w4.C6119a;
import y4.AbstractC6541a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class g implements e, AbstractC6541a, c {

    /* renamed from: a  reason: collision with root package name */
    public final Path f48799a;

    /* renamed from: b  reason: collision with root package name */
    public final C6119a f48800b;

    /* renamed from: c  reason: collision with root package name */
    public final E4.b f48801c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f48802d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f48803e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final y4.e f48804f;

    /* renamed from: g  reason: collision with root package name */
    public final y4.e f48805g;

    /* renamed from: h  reason: collision with root package name */
    public final v4.l f48806h;

    /* renamed from: i  reason: collision with root package name */
    public final y4.h f48807i;

    /* renamed from: j  reason: collision with root package name */
    public float f48808j;

    /* renamed from: k  reason: collision with root package name */
    public final y4.g f48809k;

    /* JADX WARN: Type inference failed for: r1v0, types: [w4.a, android.graphics.Paint] */
    public g(v4.l lVar, E4.b bVar, D4.l lVar2) {
        C4.a aVar;
        EnumC5519a enumC5519a;
        PorterDuff.Mode mode;
        Path path = new Path();
        this.f48799a = path;
        ?? paint = new Paint(1);
        this.f48800b = paint;
        this.f48801c = bVar;
        lVar2.getClass();
        this.f48802d = lVar2.f3395e;
        this.f48806h = lVar;
        if (bVar.j() != null) {
            y4.e s10 = ((C4.b) bVar.j().f8729Y).s();
            this.f48807i = (y4.h) s10;
            s10.a(this);
            bVar.d(s10);
        }
        if (bVar.k() != null) {
            this.f48809k = new y4.g(this, bVar, bVar.k());
        }
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        C4.a aVar2 = lVar2.f3393c;
        if (aVar2 != null && (aVar = lVar2.f3394d) != null) {
            int f6 = AbstractC6708l.f(bVar.f4448p.f4494y);
            if (f6 != 2) {
                if (f6 != 3) {
                    if (f6 != 4) {
                        if (f6 != 5) {
                            if (f6 != 16) {
                                enumC5519a = null;
                            } else {
                                enumC5519a = EnumC5519a.f45098Y;
                            }
                        } else {
                            enumC5519a = EnumC5519a.f45102j0;
                        }
                    } else {
                        enumC5519a = EnumC5519a.f45101i0;
                    }
                } else {
                    enumC5519a = EnumC5519a.f45100h0;
                }
            } else {
                enumC5519a = EnumC5519a.f45099Z;
            }
            int i10 = AbstractC5526h.f45110a;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC5525g.a(paint, enumC5519a != null ? AbstractC5520b.a(enumC5519a) : obj);
            } else if (enumC5519a != null) {
                switch (enumC5519a.ordinal()) {
                    case 0:
                        mode = PorterDuff.Mode.CLEAR;
                        break;
                    case 1:
                        mode = PorterDuff.Mode.SRC;
                        break;
                    case 2:
                        mode = PorterDuff.Mode.DST;
                        break;
                    case 3:
                        mode = PorterDuff.Mode.SRC_OVER;
                        break;
                    case 4:
                        mode = PorterDuff.Mode.DST_OVER;
                        break;
                    case 5:
                        mode = PorterDuff.Mode.SRC_IN;
                        break;
                    case 6:
                        mode = PorterDuff.Mode.DST_IN;
                        break;
                    case 7:
                        mode = PorterDuff.Mode.SRC_OUT;
                        break;
                    case 8:
                        mode = PorterDuff.Mode.DST_OUT;
                        break;
                    case 9:
                        mode = PorterDuff.Mode.SRC_ATOP;
                        break;
                    case 10:
                        mode = PorterDuff.Mode.DST_ATOP;
                        break;
                    case 11:
                        mode = PorterDuff.Mode.XOR;
                        break;
                    case 12:
                        mode = PorterDuff.Mode.ADD;
                        break;
                    case 13:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 14:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.OVERLAY;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.DARKEN;
                        break;
                    case 17:
                        mode = PorterDuff.Mode.LIGHTEN;
                        break;
                    default:
                        mode = null;
                        break;
                }
                paint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : porterDuffXfermode);
            } else {
                paint.setXfermode(null);
            }
            path.setFillType(lVar2.f3392b);
            y4.e s11 = aVar2.s();
            this.f48804f = s11;
            s11.a(this);
            bVar.d(s11);
            y4.e s12 = aVar.s();
            this.f48805g = s12;
            s12.a(this);
            bVar.d(s12);
            return;
        }
        this.f48804f = null;
        this.f48805g = null;
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48806h.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = (c) list2.get(i10);
            if (cVar instanceof l) {
                this.f48803e.add((l) cVar);
            }
        }
    }

    @Override // x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f48799a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48803e;
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

    @Override // x4.e
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        BlurMaskFilter blurMaskFilter;
        if (this.f48802d) {
            return;
        }
        y4.f fVar = (y4.f) this.f48804f;
        int i11 = 0;
        int max = (Math.max(0, Math.min(255, (int) ((((i10 / 255.0f) * ((Integer) this.f48805g.d()).intValue()) / 100.0f) * 255.0f))) << 24) | (fVar.h(fVar.f50722c.c(), fVar.b()) & 16777215);
        C6119a c6119a = this.f48800b;
        c6119a.setColor(max);
        y4.h hVar = this.f48807i;
        if (hVar != null) {
            float floatValue = ((Float) hVar.d()).floatValue();
            if (floatValue == 0.0f) {
                c6119a.setMaskFilter(null);
            } else if (floatValue != this.f48808j) {
                E4.b bVar = this.f48801c;
                if (bVar.f4431A == floatValue) {
                    blurMaskFilter = bVar.f4432B;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.f4432B = blurMaskFilter2;
                    bVar.f4431A = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c6119a.setMaskFilter(blurMaskFilter);
            }
            this.f48808j = floatValue;
        }
        y4.g gVar = this.f48809k;
        if (gVar != null) {
            gVar.b(c6119a);
        }
        Path path = this.f48799a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f48803e;
            if (i11 < arrayList.size()) {
                path.addPath(((l) arrayList.get(i11)).f(), matrix);
                i11++;
            } else {
                canvas.drawPath(path, c6119a);
                return;
            }
        }
    }
}
