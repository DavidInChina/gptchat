package Jf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kg.C4290b;
import kg.C4291c;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashSet f9104a;

    static {
        Set<n> set = n.f9124j0;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(set, 10));
        for (n nVar : set) {
            AbstractC3557B.c0("primitiveType", nVar);
            arrayList.add(q.f9204k.c(nVar.f9134Y));
        }
        C4291c g10 = p.f9173f.g();
        AbstractC3557B.b0("toSafe(...)", g10);
        ArrayList x22 = kf.t.x2(g10, arrayList);
        C4291c g11 = p.f9175h.g();
        AbstractC3557B.b0("toSafe(...)", g11);
        ArrayList x23 = kf.t.x2(g11, x22);
        C4291c g12 = p.f9177j.g();
        AbstractC3557B.b0("toSafe(...)", g12);
        ArrayList x24 = kf.t.x2(g12, x23);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = x24.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C4290b.j((C4291c) it.next()));
        }
        f9104a = linkedHashSet;
    }
}
