package qi;

import Q3.j;
import androidx.datastore.preferences.protobuf.r0;
import java.util.List;
import ti.d;
import wi.s;
import wi.y;

/* loaded from: classes.dex */
public final class a implements zi.a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f44146a;

    public a(boolean z10) {
        this.f44146a = z10;
    }

    @Override // zi.a
    public final char a() {
        return '~';
    }

    @Override // zi.a
    public final int b() {
        if (this.f44146a) {
            return 2;
        }
        return 1;
    }

    @Override // zi.a
    public final int c(d dVar, d dVar2) {
        List list = dVar.f46246a;
        int size = list.size();
        List list2 = dVar2.f46246a;
        if (size != list2.size() || list.size() > 2) {
            return 0;
        }
        y yVar = (y) list.get(list.size() - 1);
        s sVar = new s();
        j jVar = new j(5);
        jVar.b(dVar.b(list.size()));
        r0 r0Var = new r0(yVar.f48612e, (y) list2.get(0), 0);
        while (r0Var.hasNext()) {
            s sVar2 = (s) r0Var.next();
            sVar.c(sVar2);
            jVar.a(sVar2.d());
        }
        jVar.b(dVar2.a(list2.size()));
        sVar.g(jVar.f());
        yVar.e(sVar);
        return list.size();
    }

    @Override // zi.a
    public final char d() {
        return '~';
    }
}
