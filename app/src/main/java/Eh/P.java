package Eh;

import k6.AbstractC4194d;
import sh.AbstractC5634f;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes.dex */
public final class P implements S {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f4759a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC6250o f4760b;

    public P(AbstractC6250o abstractC6250o, l1 l1Var) {
        this.f4759a = l1Var;
        this.f4760b = abstractC6250o;
    }

    @Override // Eh.S
    public final l1 a() {
        return this.f4759a;
    }

    @Override // Eh.S
    public final Hh.j b(AbstractC6250o abstractC6250o, Ih.a aVar, int i10) {
        Mh.n nVar;
        Mh.n nVar2;
        AbstractC6250o abstractC6250o2 = this.f4760b;
        if (((AbstractC5634f) abstractC6250o2).h1(8) && !((AbstractC5634f) abstractC6250o).h1(8) && !abstractC6250o.W0()) {
            throw new IllegalStateException("Cannot invoke " + abstractC6250o + " from " + abstractC6250o2);
        }
        if (abstractC6250o.W0()) {
            boolean W02 = abstractC6250o2.W0();
            l1 l1Var = this.f4759a;
            if (!W02 || (!l1Var.equals(abstractC6250o.mo118a().l0()) && (l1Var.L() == null || !l1Var.L().l0().equals(abstractC6250o.mo118a().l0())))) {
                throw new IllegalStateException("Cannot invoke " + abstractC6250o + " from " + abstractC6250o2 + " in " + l1Var);
            }
        }
        Hh.n[] nVarArr = new Hh.n[2];
        boolean h12 = ((AbstractC5634f) abstractC6250o).h1(8);
        Hh.n nVar3 = Hh.m.f7819Y;
        if (h12) {
            nVar = nVar3;
        } else {
            nVar = Mh.o.f12180n0;
            if (nVar != null) {
                nVar2 = null;
            } else {
                nVar2 = new Mh.n(Mh.o.REFERENCE, 0);
            }
            if (nVar2 != null) {
                Mh.o.f12180n0 = nVar2;
                nVar = nVar2;
            }
        }
        nVarArr[0] = nVar;
        if (abstractC6250o.W0()) {
            nVar3 = Hh.f.SINGLE;
        }
        nVarArr[1] = nVar3;
        return new Hh.j(nVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P.class != obj.getClass()) {
            return false;
        }
        P p10 = (P) obj;
        if (this.f4759a.equals(p10.f4759a) && this.f4760b.equals(p10.f4760b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4760b.hashCode() + AbstractC4194d.t(this.f4759a, P.class.hashCode() * 31, 31);
    }
}
