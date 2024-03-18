package Mh;

import Eh.AbstractC0511j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import yh.l1;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: Y  reason: collision with root package name */
    public final l1 f12156Y;

    /* renamed from: Z  reason: collision with root package name */
    public final h f12157Z;

    public g(l1 l1Var, h hVar) {
        this.f12156Y = l1Var;
        this.f12157Z = hVar;
    }

    @Override // Hh.n
    public final boolean b() {
        return this.f12157Z.b();
    }

    @Override // Mh.h
    public final Hh.n d(l1 l1Var) {
        return new Hh.j(this.f12157Z.d(l1Var), Ih.b.h(this.f12156Y));
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        List<Hh.n> asList = Arrays.asList(this.f12157Z, Ih.b.h(this.f12156Y));
        ArrayList arrayList = new ArrayList();
        for (Hh.n nVar : asList) {
            if (nVar instanceof Hh.j) {
                arrayList.addAll(((Hh.j) nVar).f7813Y);
            } else if (!(nVar instanceof Hh.m)) {
                arrayList.add(nVar);
            }
        }
        Hh.l lVar2 = Hh.l.f7816c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lVar2 = lVar2.a(((Hh.n) it.next()).e(lVar, abstractC0511j));
        }
        return lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f12156Y.equals(gVar.f12156Y) && this.f12157Z.equals(gVar.f12157Z)) {
            return true;
        }
        return false;
    }

    @Override // Mh.h
    public final Hh.n f(l1 l1Var) {
        return new Hh.j(this.f12157Z.f(l1Var), Ih.b.h(this.f12156Y));
    }

    public final int hashCode() {
        return this.f12157Z.hashCode() + AbstractC4194d.t(this.f12156Y, g.class.hashCode() * 31, 31);
    }
}
