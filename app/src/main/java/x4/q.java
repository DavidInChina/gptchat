package x4;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import y4.AbstractC6541a;

/* loaded from: classes.dex */
public final class q implements l, AbstractC6541a, c {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f48881b;

    /* renamed from: c  reason: collision with root package name */
    public final v4.l f48882c;

    /* renamed from: d  reason: collision with root package name */
    public final y4.n f48883d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f48884e;

    /* renamed from: a  reason: collision with root package name */
    public final Path f48880a = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Q3.j f48885f = new Q3.j(1);

    public q(v4.l lVar, E4.b bVar, D4.n nVar) {
        nVar.getClass();
        this.f48881b = nVar.f3402d;
        this.f48882c = lVar;
        y4.n nVar2 = new y4.n(nVar.f3401c.f2681Z);
        this.f48883d = nVar2;
        bVar.d(nVar2);
        nVar2.a(this);
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48884e = false;
        this.f48882c.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 < arrayList2.size()) {
                c cVar = (c) arrayList2.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f48890c == 1) {
                        this.f48885f.f14418b.add(sVar);
                        sVar.d(this);
                        i10++;
                    }
                }
                if (cVar instanceof p) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((p) cVar);
                }
                i10++;
            } else {
                this.f48883d.f50745j = arrayList;
                return;
            }
        }
    }

    @Override // x4.l
    public final Path f() {
        boolean z10 = this.f48884e;
        y4.n nVar = this.f48883d;
        Path path = this.f48880a;
        if (z10) {
            nVar.getClass();
            return path;
        }
        path.reset();
        if (this.f48881b) {
            this.f48884e = true;
            return path;
        }
        Path path2 = (Path) nVar.d();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f48885f.c(path);
        this.f48884e = true;
        return path;
    }
}
