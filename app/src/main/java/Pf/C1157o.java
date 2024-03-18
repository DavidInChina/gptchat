package Pf;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kg.C4291c;

/* renamed from: Pf.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1157o implements Mf.L {

    /* renamed from: a  reason: collision with root package name */
    public final List f14118a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14119b;

    public C1157o(String str, List list) {
        AbstractC3557B.c0("debugName", str);
        this.f14118a = list;
        this.f14119b = str;
        list.size();
        kf.t.P2(list).size();
    }

    @Override // Mf.L
    public final void a(C4291c c4291c, ArrayList arrayList) {
        AbstractC3557B.c0("fqName", c4291c);
        for (Mf.H h10 : this.f14118a) {
            r.f.m(h10, c4291c, arrayList);
        }
    }

    @Override // Mf.L
    public final boolean b(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        List<Mf.H> list = this.f14118a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (Mf.H h10 : list) {
            if (!r.f.L(h10, c4291c)) {
                return false;
            }
        }
        return true;
    }

    @Override // Mf.H
    public final List c(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        ArrayList arrayList = new ArrayList();
        for (Mf.H h10 : this.f14118a) {
            r.f.m(h10, c4291c, arrayList);
        }
        return kf.t.K2(arrayList);
    }

    @Override // Mf.H
    public final Collection l(C4291c c4291c, wf.k kVar) {
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("nameFilter", kVar);
        HashSet hashSet = new HashSet();
        for (Mf.H h10 : this.f14118a) {
            hashSet.addAll(h10.l(c4291c, kVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f14119b;
    }
}
