package Mf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.C4291c;

/* loaded from: classes2.dex */
public final class K implements L {

    /* renamed from: a  reason: collision with root package name */
    public final Collection f12068a;

    public K(ArrayList arrayList) {
        this.f12068a = arrayList;
    }

    @Override // Mf.L
    public final void a(C4291c c4291c, ArrayList arrayList) {
        AbstractC3557B.c0("fqName", c4291c);
        for (Object obj : this.f12068a) {
            if (AbstractC3557B.K(((Pf.I) ((G) obj)).f14010j0, c4291c)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // Mf.L
    public final boolean b(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        Collection<G> collection = this.f12068a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (G g10 : collection) {
            if (AbstractC3557B.K(((Pf.I) g10).f14010j0, c4291c)) {
                return false;
            }
        }
        return true;
    }

    @Override // Mf.H
    public final List c(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f12068a) {
            if (AbstractC3557B.K(((Pf.I) ((G) obj)).f14010j0, c4291c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Mf.H
    public final Collection l(C4291c c4291c, wf.k kVar) {
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameFilter", kVar);
        return Kg.m.p1(Kg.m.h1(Kg.m.n1(kf.t.V1(this.f12068a), I.f12065Y), new J(c4291c, 0)));
    }
}
