package x4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class o implements e, l, j, AbstractC6541a, c {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f48868a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public final Path f48869b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final v4.l f48870c;

    /* renamed from: d  reason: collision with root package name */
    public final E4.b f48871d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f48872e;

    /* renamed from: f  reason: collision with root package name */
    public final y4.h f48873f;

    /* renamed from: g  reason: collision with root package name */
    public final y4.h f48874g;

    /* renamed from: h  reason: collision with root package name */
    public final y4.q f48875h;

    /* renamed from: i  reason: collision with root package name */
    public d f48876i;

    public o(v4.l lVar, E4.b bVar, D4.i iVar) {
        this.f48870c = lVar;
        this.f48871d = bVar;
        iVar.getClass();
        this.f48872e = iVar.f3384c;
        y4.e s10 = iVar.f3383b.s();
        this.f48873f = (y4.h) s10;
        bVar.d(s10);
        s10.a(this);
        y4.e s11 = ((C4.b) iVar.f3385d).s();
        this.f48874g = (y4.h) s11;
        bVar.d(s11);
        s11.a(this);
        C4.e eVar = (C4.e) iVar.f3386e;
        eVar.getClass();
        y4.q qVar = new y4.q(eVar);
        this.f48875h = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48870c.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        this.f48876i.b(list, list2);
    }

    @Override // x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        this.f48876i.c(rectF, matrix, z10);
    }

    @Override // x4.j
    public final void d(ListIterator listIterator) {
        if (this.f48876i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f48876i = new d(this.f48870c, this.f48871d, this.f48872e, arrayList, null);
    }

    @Override // x4.e
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        float floatValue = ((Float) this.f48873f.d()).floatValue();
        float floatValue2 = ((Float) this.f48874g.d()).floatValue();
        y4.q qVar = this.f48875h;
        float floatValue3 = ((Float) qVar.f50762m.d()).floatValue() / 100.0f;
        float floatValue4 = ((Float) qVar.f50763n.d()).floatValue() / 100.0f;
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f48868a;
            matrix2.set(matrix);
            float f6 = i11;
            matrix2.preConcat(qVar.e(f6 + floatValue2));
            this.f48876i.e(canvas, matrix2, (int) (I4.f.d(floatValue3, floatValue4, f6 / floatValue) * i10));
        }
    }

    @Override // x4.l
    public final Path f() {
        Path f6 = this.f48876i.f();
        Path path = this.f48869b;
        path.reset();
        float floatValue = ((Float) this.f48873f.d()).floatValue();
        float floatValue2 = ((Float) this.f48874g.d()).floatValue();
        for (int i10 = ((int) floatValue) - 1; i10 >= 0; i10--) {
            Matrix matrix = this.f48868a;
            matrix.set(this.f48875h.e(i10 + floatValue2));
            path.addPath(f6, matrix);
        }
        return path;
    }
}
