package x4;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class n implements AbstractC6541a, c, l {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f48860c;

    /* renamed from: d  reason: collision with root package name */
    public final v4.l f48861d;

    /* renamed from: e  reason: collision with root package name */
    public final y4.e f48862e;

    /* renamed from: f  reason: collision with root package name */
    public final y4.e f48863f;

    /* renamed from: g  reason: collision with root package name */
    public final y4.h f48864g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f48867j;

    /* renamed from: a  reason: collision with root package name */
    public final Path f48858a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f48859b = new RectF();

    /* renamed from: h  reason: collision with root package name */
    public final Q3.j f48865h = new Q3.j(1);

    /* renamed from: i  reason: collision with root package name */
    public y4.e f48866i = null;

    public n(v4.l lVar, E4.b bVar, D4.i iVar) {
        iVar.getClass();
        this.f48860c = iVar.f3384c;
        this.f48861d = lVar;
        y4.e s10 = iVar.f3385d.s();
        this.f48862e = s10;
        y4.e s11 = ((C4.f) iVar.f3386e).s();
        this.f48863f = s11;
        y4.e s12 = iVar.f3383b.s();
        this.f48864g = (y4.h) s12;
        bVar.d(s10);
        bVar.d(s11);
        bVar.d(s12);
        s10.a(this);
        s11.a(this);
        s12.a(this);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48867j = false;
        this.f48861d.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f48890c == 1) {
                        this.f48865h.f14418b.add(sVar);
                        sVar.d(this);
                        i10++;
                    }
                }
                if (cVar instanceof p) {
                    this.f48866i = ((p) cVar).f48878b;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // x4.l
    public final Path f() {
        float f6;
        y4.e eVar;
        boolean z10 = this.f48867j;
        Path path = this.f48858a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f48860c) {
            this.f48867j = true;
            return path;
        }
        PointF pointF = (PointF) this.f48863f.d();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        y4.h hVar = this.f48864g;
        if (hVar == null) {
            f6 = 0.0f;
        } else {
            f6 = hVar.h();
        }
        if (f6 == 0.0f && (eVar = this.f48866i) != null) {
            f6 = Math.min(((Float) eVar.d()).floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (f6 > min) {
            f6 = min;
        }
        PointF pointF2 = (PointF) this.f48862e.d();
        path.moveTo(pointF2.x + f10, (pointF2.y - f11) + f6);
        path.lineTo(pointF2.x + f10, (pointF2.y + f11) - f6);
        int i10 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        RectF rectF = this.f48859b;
        if (i10 > 0) {
            float f12 = pointF2.x + f10;
            float f13 = f6 * 2.0f;
            float f14 = pointF2.y + f11;
            rectF.set(f12 - f13, f14 - f13, f12, f14);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f10) + f6, pointF2.y + f11);
        if (i10 > 0) {
            float f15 = pointF2.x - f10;
            float f16 = pointF2.y + f11;
            float f17 = f6 * 2.0f;
            rectF.set(f15, f16 - f17, f17 + f15, f16);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f10, (pointF2.y - f11) + f6);
        if (i10 > 0) {
            float f18 = pointF2.x - f10;
            float f19 = pointF2.y - f11;
            float f20 = f6 * 2.0f;
            rectF.set(f18, f19, f18 + f20, f20 + f19);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f10) - f6, pointF2.y - f11);
        if (i10 > 0) {
            float f21 = pointF2.x + f10;
            float f22 = f6 * 2.0f;
            float f23 = pointF2.y - f11;
            rectF.set(f21 - f22, f23, f21, f22 + f23);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f48865h.c(path);
        this.f48867j = true;
        return path;
    }
}
