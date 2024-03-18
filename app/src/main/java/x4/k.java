package x4;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class k implements l, j {

    /* renamed from: a  reason: collision with root package name */
    public final Path f48836a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f48837b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final Path f48838c = new Path();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f48839d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final D4.g f48840e;

    public k(D4.g gVar) {
        gVar.getClass();
        this.f48840e = gVar;
    }

    public final void a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        Path path = this.f48837b;
        path.reset();
        Path path2 = this.f48836a;
        path2.reset();
        ArrayList arrayList = this.f48839d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            l lVar = (l) arrayList.get(size);
            if (lVar instanceof d) {
                d dVar = (d) lVar;
                ArrayList arrayList2 = (ArrayList) dVar.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path f6 = ((l) arrayList2.get(size2)).f();
                    y4.q qVar = dVar.f48791j;
                    if (qVar != null) {
                        matrix2 = qVar.d();
                    } else {
                        matrix2 = dVar.f48784c;
                        matrix2.reset();
                    }
                    f6.transform(matrix2);
                    path.addPath(f6);
                }
            } else {
                path.addPath(lVar.f());
            }
        }
        int i10 = 0;
        l lVar2 = (l) arrayList.get(0);
        if (lVar2 instanceof d) {
            d dVar2 = (d) lVar2;
            List d10 = dVar2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) d10;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path f10 = ((l) arrayList3.get(i10)).f();
                y4.q qVar2 = dVar2.f48791j;
                if (qVar2 != null) {
                    matrix = qVar2.d();
                } else {
                    matrix = dVar2.f48784c;
                    matrix.reset();
                }
                f10.transform(matrix);
                path2.addPath(f10);
                i10++;
            }
        } else {
            path2.set(lVar2.f());
        }
        this.f48838c.op(path2, path, op);
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48839d;
            if (i10 < arrayList.size()) {
                ((l) arrayList.get(i10)).b(list, list2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // x4.j
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVar = (c) listIterator.previous();
            if (cVar instanceof l) {
                this.f48839d.add((l) cVar);
                listIterator.remove();
            }
        }
    }

    @Override // x4.l
    public final Path f() {
        Path path = this.f48838c;
        path.reset();
        D4.g gVar = this.f48840e;
        if (gVar.f3371b) {
            return path;
        }
        int f6 = AbstractC6708l.f(gVar.f3370a);
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 != 2) {
                    if (f6 != 3) {
                        if (f6 == 4) {
                            a(Path.Op.XOR);
                        }
                    } else {
                        a(Path.Op.INTERSECT);
                    }
                } else {
                    a(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                a(Path.Op.UNION);
            }
        } else {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f48839d;
                if (i10 >= arrayList.size()) {
                    break;
                }
                path.addPath(((l) arrayList.get(i10)).f());
                i10++;
            }
        }
        return path;
    }
}
