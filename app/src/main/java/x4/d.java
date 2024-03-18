package x4;

import H0.C0672c0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import v4.C5971a;
import w4.C6119a;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class d implements e, l, AbstractC6541a {

    /* renamed from: a  reason: collision with root package name */
    public final C6119a f48782a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f48783b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f48784c;

    /* renamed from: d  reason: collision with root package name */
    public final Path f48785d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f48786e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f48787f;

    /* renamed from: g  reason: collision with root package name */
    public final List f48788g;

    /* renamed from: h  reason: collision with root package name */
    public final v4.l f48789h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f48790i;

    /* renamed from: j  reason: collision with root package name */
    public final y4.q f48791j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(v4.l lVar, E4.b bVar, D4.m mVar, C5971a c5971a) {
        this(lVar, bVar, mVar.f3398c, r5, r11);
        C4.e eVar;
        String str = mVar.f3396a;
        List list = mVar.f3397b;
        ArrayList arrayList = new ArrayList(list.size());
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c a5 = ((D4.b) list.get(i11)).a(lVar, c5971a, bVar);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        while (true) {
            if (i10 >= list.size()) {
                eVar = null;
                break;
            }
            D4.b bVar2 = (D4.b) list.get(i10);
            if (bVar2 instanceof C4.e) {
                eVar = (C4.e) bVar2;
                break;
            }
            i10++;
        }
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48789h.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        int size = list.size();
        List list3 = this.f48788g;
        ArrayList arrayList = new ArrayList(list3.size() + size);
        arrayList.addAll(list);
        for (int size2 = list3.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) list3.get(size2);
            cVar.b(arrayList, list3.subList(0, size2));
            arrayList.add(cVar);
        }
    }

    @Override // x4.e
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f48784c;
        matrix2.set(matrix);
        y4.q qVar = this.f48791j;
        if (qVar != null) {
            matrix2.preConcat(qVar.d());
        }
        RectF rectF2 = this.f48786e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.f48788g;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof e) {
                ((e) cVar).c(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.f48790i == null) {
            this.f48790i = new ArrayList();
            int i10 = 0;
            while (true) {
                List list = this.f48788g;
                if (i10 >= list.size()) {
                    break;
                }
                c cVar = (c) list.get(i10);
                if (cVar instanceof l) {
                    this.f48790i.add((l) cVar);
                }
                i10++;
            }
        }
        return this.f48790i;
    }

    @Override // x4.e
    public final void e(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        if (this.f48787f) {
            return;
        }
        Matrix matrix2 = this.f48784c;
        matrix2.set(matrix);
        y4.q qVar = this.f48791j;
        if (qVar != null) {
            matrix2.preConcat(qVar.d());
            y4.e eVar = qVar.f50759j;
            if (eVar == null) {
                i11 = 100;
            } else {
                i11 = ((Integer) eVar.d()).intValue();
            }
            i10 = (int) ((((i11 / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.f48789h.f47222t0;
        boolean z11 = false;
        List list = this.f48788g;
        if (z10) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= list.size()) {
                    break;
                } else if ((list.get(i12) instanceof e) && (i13 = i13 + 1) >= 2) {
                    if (i10 != 255) {
                        z11 = true;
                    }
                } else {
                    i12++;
                }
            }
        }
        if (z11) {
            RectF rectF = this.f48783b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix2, true);
            C6119a c6119a = this.f48782a;
            c6119a.setAlpha(i10);
            C0672c0 c0672c0 = I4.g.f8055a;
            canvas.saveLayer(rectF, c6119a);
        }
        if (z11) {
            i10 = 255;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            Object obj = list.get(size);
            if (obj instanceof e) {
                ((e) obj).e(canvas, matrix2, i10);
            }
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // x4.l
    public final Path f() {
        Matrix matrix = this.f48784c;
        matrix.reset();
        y4.q qVar = this.f48791j;
        if (qVar != null) {
            matrix.set(qVar.d());
        }
        Path path = this.f48785d;
        path.reset();
        if (this.f48787f) {
            return path;
        }
        List list = this.f48788g;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof l) {
                path.addPath(((l) cVar).f(), matrix);
            }
        }
        return path;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w4.a, android.graphics.Paint] */
    public d(v4.l lVar, E4.b bVar, boolean z10, ArrayList arrayList, C4.e eVar) {
        this.f48782a = new Paint();
        this.f48783b = new RectF();
        this.f48784c = new Matrix();
        this.f48785d = new Path();
        this.f48786e = new RectF();
        this.f48789h = lVar;
        this.f48787f = z10;
        this.f48788g = arrayList;
        if (eVar != null) {
            y4.q qVar = new y4.q(eVar);
            this.f48791j = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
