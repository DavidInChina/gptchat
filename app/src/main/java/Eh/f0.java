package Eh;

import A.AbstractC0044t0;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import wh.AbstractC6256u;
import wh.C6246k;
import wh.C6249n;
import yh.l1;

/* loaded from: classes2.dex */
public final class f0 implements Hh.b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC0522v f4782Y;

    public f0(Dh.n nVar) {
        this.f4782Y = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [Eh.r] */
    /* JADX WARN: Type inference failed for: r3v22, types: [Eh.r] */
    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        EnumC0517p enumC0517p;
        List list;
        AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o;
        C6246k j12 = abstractC6236a.j1();
        AbstractC0522v abstractC0522v = this.f4782Y;
        abstractC0522v.getClass();
        Dh.n nVar = (Dh.n) abstractC0522v;
        boolean equals = j12.f48546a.equals("<init>");
        EnumC0517p enumC0517p2 = EnumC0517p.f4801Y;
        l1 l1Var = nVar.f4810a;
        if (equals) {
            l1.a L10 = l1Var.L();
            if (L10 == null) {
                list = new AbstractC1239q(1);
            } else {
                list = (AbstractC6256u) ((AbstractC1239q) L10.i()).f(new Qh.M(AbstractC1235m.a(j12)).b(new Qh.b0(l1Var)));
            }
            if (list.size() == 1) {
                enumC0517p = C0518q.j((AbstractC6250o) ((AbstractC1239q) list).r(), L10.l0());
            }
            enumC0517p = enumC0517p2;
        } else {
            Bh.M d10 = nVar.f4811b.e().d(j12);
            if (AbstractC0044t0.q(d10.c())) {
                enumC0517p = C0518q.j(d10.e(), l1Var.L().l0());
            }
            enumC0517p = enumC0517p2;
        }
        boolean b10 = enumC0517p.b();
        EnumC0517p enumC0517p3 = enumC0517p;
        if (!b10) {
            Iterator it = abstractC0522v.f4810a.o0().Q().iterator();
            EnumC0517p enumC0517p4 = enumC0517p2;
            while (true) {
                if (it.hasNext()) {
                    l1 l1Var2 = (l1) it.next();
                    r g10 = abstractC0522v.f4812c.a(abstractC0522v.f4811b.a(l1Var2).d(j12), l1Var2).g(new C6249n(j12.f48547b, j12.f48548c));
                    if (g10.b()) {
                        if (enumC0517p4.b()) {
                            break;
                        }
                        enumC0517p4 = g10;
                    }
                } else {
                    enumC0517p2 = enumC0517p4;
                    break;
                }
            }
            enumC0517p3 = enumC0517p2;
        }
        r g11 = enumC0517p3.g(abstractC6236a.k1());
        if (g11.b()) {
            List<Hh.n> asList = Arrays.asList(new Mh.m(abstractC6236a, Mh.k.f12168Y).h(), g11, Mh.i.h(abstractC6236a.getReturnType()));
            ArrayList arrayList = new ArrayList();
            for (Hh.n nVar2 : asList) {
                if (nVar2 instanceof Hh.j) {
                    arrayList.addAll(((Hh.j) nVar2).f7813Y);
                } else if (!(nVar2 instanceof Hh.m)) {
                    arrayList.add(nVar2);
                }
            }
            Hh.l lVar2 = Hh.l.f7816c;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                lVar2 = lVar2.a(((Hh.n) it2.next()).e(lVar, abstractC0511j));
            }
            return new Hh.a(lVar2.f7818b, abstractC6236a.p());
        }
        throw new IllegalStateException("Cannot call super (or default) method for " + abstractC6236a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        Object obj2 = e0.f4780Y;
        if (obj2.equals(obj2) && this.f4782Y.equals(f0Var.f4782Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4782Y.hashCode();
        return e0.f4780Y.hashCode() + ((hashCode + (f0.class.hashCode() * 31)) * 31);
    }
}
