package E4;

import A.AbstractC0044t0;
import H0.C0672c0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v4.C5971a;
import v4.l;
import w.C6066m;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: C  reason: collision with root package name */
    public final y4.h f4459C;

    /* renamed from: H  reason: collision with root package name */
    public float f4464H;

    /* renamed from: D  reason: collision with root package name */
    public final ArrayList f4460D = new ArrayList();

    /* renamed from: E  reason: collision with root package name */
    public final RectF f4461E = new RectF();

    /* renamed from: F  reason: collision with root package name */
    public final RectF f4462F = new RectF();

    /* renamed from: G  reason: collision with root package name */
    public final Paint f4463G = new Paint();

    /* renamed from: I  reason: collision with root package name */
    public boolean f4465I = true;

    public c(l lVar, e eVar, List list, C5971a c5971a) {
        super(lVar, eVar);
        int i10;
        b bVar;
        b bVar2;
        C4.b bVar3 = eVar.f4488s;
        if (bVar3 != null) {
            y4.e s10 = bVar3.s();
            this.f4459C = (y4.h) s10;
            d(s10);
            s10.a(this);
        } else {
            this.f4459C = null;
        }
        C6066m c6066m = new C6066m(c5971a.f47157j.size());
        int size = list.size() - 1;
        b bVar4 = null;
        while (true) {
            if (size >= 0) {
                e eVar2 = (e) list.get(size);
                int f6 = AbstractC6708l.f(eVar2.f4474e);
                if (f6 != 0) {
                    if (f6 != 1) {
                        if (f6 != 2) {
                            if (f6 != 3) {
                                if (f6 != 4) {
                                    if (f6 != 5) {
                                        I4.b.a("Unknown layer type ".concat(AbstractC0044t0.O(eVar2.f4474e)));
                                        bVar2 = null;
                                    } else {
                                        bVar2 = new k(lVar, eVar2);
                                    }
                                } else {
                                    bVar2 = new g(c5971a, lVar, this, eVar2);
                                }
                            } else {
                                bVar2 = new b(lVar, eVar2);
                            }
                        } else {
                            bVar2 = new d(lVar, eVar2);
                        }
                    } else {
                        bVar2 = new h(lVar, eVar2);
                    }
                } else {
                    bVar2 = new c(lVar, eVar2, (List) c5971a.f47150c.get(eVar2.f4476g), c5971a);
                }
                if (bVar2 != null) {
                    c6066m.h(bVar2.f4448p.f4473d, bVar2);
                    if (bVar4 != null) {
                        bVar4.f4451s = bVar2;
                        bVar4 = null;
                    } else {
                        this.f4460D.add(0, bVar2);
                        int f10 = AbstractC6708l.f(eVar2.f4490u);
                        if (f10 == 1 || f10 == 2) {
                            bVar4 = bVar2;
                        }
                    }
                }
                size--;
            }
        }
        for (i10 = 0; i10 < c6066m.i(); i10++) {
            b bVar5 = (b) c6066m.d(c6066m.g(i10));
            if (bVar5 != null && (bVar = (b) c6066m.d(bVar5.f4448p.f4475f)) != null) {
                bVar5.f4452t = bVar;
            }
        }
    }

    @Override // E4.b, x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        ArrayList arrayList = this.f4460D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f4461E;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).c(rectF2, this.f4446n, true);
            rectF.union(rectF2);
        }
    }

    @Override // E4.b
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        RectF rectF = this.f4462F;
        e eVar = this.f4448p;
        rectF.set(0.0f, 0.0f, eVar.f4484o, eVar.f4485p);
        matrix.mapRect(rectF);
        boolean z11 = this.f4447o.f47222t0;
        ArrayList arrayList = this.f4460D;
        if (z11 && arrayList.size() > 1 && i10 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Paint paint = this.f4463G;
            paint.setAlpha(i10);
            C0672c0 c0672c0 = I4.g.f8055a;
            canvas.saveLayer(rectF, paint);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((!this.f4465I && "__container".equals(eVar.f4472c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((b) arrayList.get(size)).e(canvas, matrix, i10);
            }
        }
        canvas.restore();
    }

    @Override // E4.b
    public final void n(boolean z10) {
        super.n(z10);
        Iterator it = this.f4460D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).n(z10);
        }
    }

    @Override // E4.b
    public final void o(float f6) {
        this.f4464H = f6;
        super.o(f6);
        y4.h hVar = this.f4459C;
        e eVar = this.f4448p;
        if (hVar != null) {
            C5971a c5971a = this.f4447o.f47208Y;
            f6 = ((((Float) hVar.d()).floatValue() * eVar.f4471b.f47161n) - eVar.f4471b.f47159l) / ((c5971a.f47160m - c5971a.f47159l) + 0.01f);
        }
        if (hVar == null) {
            C5971a c5971a2 = eVar.f4471b;
            f6 -= eVar.f4483n / (c5971a2.f47160m - c5971a2.f47159l);
        }
        if (eVar.f4482m != 0.0f && !"__container".equals(eVar.f4472c)) {
            f6 /= eVar.f4482m;
        }
        ArrayList arrayList = this.f4460D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).o(f6);
        }
    }
}
